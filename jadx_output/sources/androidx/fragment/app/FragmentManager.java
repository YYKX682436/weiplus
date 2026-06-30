package androidx.fragment.app;

/* loaded from: classes14.dex */
public abstract class FragmentManager {
    private static boolean DEBUG = false;
    private static final java.lang.String EXTRA_CREATED_FILLIN_INTENT = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    static final java.lang.String TAG = "FragmentManager";
    static boolean USE_STATE_MANAGER = true;
    private byte _hellAccFlag_;
    java.util.ArrayList<androidx.fragment.app.a> mBackStack;
    private java.util.ArrayList<androidx.fragment.app.p1> mBackStackChangeListeners;
    private androidx.fragment.app.s0 mContainer;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mCreatedMenus;
    private boolean mDestroyed;
    private boolean mExecutingActions;
    private boolean mHavePendingDeferredStart;
    private androidx.fragment.app.v0 mHost;
    private boolean mNeedMenuInvalidate;
    private androidx.fragment.app.w1 mNonConfig;
    private androidx.activity.i mOnBackPressedDispatcher;
    private androidx.fragment.app.Fragment mParent;
    private java.util.ArrayList<androidx.fragment.app.s1> mPostponedTransactions;
    androidx.fragment.app.Fragment mPrimaryNav;
    private androidx.activity.result.c mRequestPermissions;
    private androidx.activity.result.c mStartActivityForResult;
    private androidx.activity.result.c mStartIntentSenderForResult;
    private boolean mStateSaved;
    private boolean mStopped;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mTmpAddedFragments;
    private java.util.ArrayList<java.lang.Boolean> mTmpIsPop;
    private java.util.ArrayList<androidx.fragment.app.a> mTmpRecords;
    private final java.util.ArrayList<androidx.fragment.app.q1> mPendingActions = new java.util.ArrayList<>();
    private final androidx.fragment.app.f2 mFragmentStore = new androidx.fragment.app.f2();
    private final androidx.fragment.app.x0 mLayoutInflaterFactory = new androidx.fragment.app.x0(this);
    private final androidx.activity.g mOnBackPressedCallback = new androidx.fragment.app.c1(this, false);
    private final java.util.concurrent.atomic.AtomicInteger mBackStackIndex = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.Map<java.lang.String, android.os.Bundle> mResults = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private final java.util.Map<java.lang.String, androidx.fragment.app.o1> mResultListeners = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<j3.h>> mExitAnimationCancellationSignals = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private final androidx.fragment.app.p2 mFragmentTransitionCallback = new androidx.fragment.app.d1(this);
    private final androidx.fragment.app.z0 mLifecycleCallbacksDispatcher = new androidx.fragment.app.z0(this);
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.x1> mOnAttachListeners = new java.util.concurrent.CopyOnWriteArrayList<>();
    int mCurState = -1;
    private androidx.fragment.app.u0 mFragmentFactory = null;
    private androidx.fragment.app.u0 mHostFragmentFactory = new androidx.fragment.app.e1(this);
    private androidx.fragment.app.o3 mSpecialEffectsControllerFactory = null;
    private androidx.fragment.app.o3 mDefaultSpecialEffectsControllerFactory = new androidx.fragment.app.f1(this);
    java.util.ArrayDeque<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> mLaunchedFragments = new java.util.ArrayDeque<>();
    private java.lang.Runnable mExecCommit = new androidx.fragment.app.g1(this);

    @java.lang.Deprecated
    public static void enableDebugLogging(boolean z17) {
        DEBUG = z17;
    }

    public static void enableNewStateManager(boolean z17) {
        USE_STATE_MANAGER = z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.fragment.app.Fragment] */
    public static <F extends androidx.fragment.app.Fragment> F findFragment(android.view.View view) {
        F f17;
        android.view.View view2 = view;
        while (true) {
            f17 = null;
            if (view2 == null) {
                break;
            }
            ?? viewFragment = getViewFragment(view2);
            if (viewFragment != 0) {
                f17 = viewFragment;
                break;
            }
            java.lang.Object parent = view2.getParent();
            view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        }
        if (f17 != null) {
            return f17;
        }
        throw new java.lang.IllegalStateException("View " + view + " does not have a Fragment set");
    }

    public static androidx.fragment.app.FragmentManager findFragmentManager(android.view.View view) {
        androidx.fragment.app.FragmentActivity fragmentActivity;
        androidx.fragment.app.Fragment fragment;
        android.view.View view2 = view;
        while (true) {
            fragmentActivity = null;
            if (view2 == null) {
                fragment = null;
                break;
            }
            fragment = getViewFragment(view2);
            if (fragment != null) {
                break;
            }
            java.lang.Object parent = view2.getParent();
            view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        }
        if (fragment != null) {
            if (fragment.isAdded()) {
                return fragment.getChildFragmentManager();
            }
            throw new java.lang.IllegalStateException("The Fragment " + fragment + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        android.content.Context context = view.getContext();
        while (true) {
            if (!(context instanceof android.content.ContextWrapper)) {
                break;
            }
            if (context instanceof androidx.fragment.app.FragmentActivity) {
                fragmentActivity = (androidx.fragment.app.FragmentActivity) context;
                break;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        throw new java.lang.IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public static androidx.fragment.app.Fragment getViewFragment(android.view.View view) {
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.gd_);
        if (tag instanceof androidx.fragment.app.Fragment) {
            return (androidx.fragment.app.Fragment) tag;
        }
        return null;
    }

    public static boolean isLoggingEnabled(int i17) {
        return DEBUG || android.util.Log.isLoggable(TAG, i17);
    }

    public static int reverseTransit(int i17) {
        if (i17 == 4097) {
            return 8194;
        }
        if (i17 != 4099) {
            return i17 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    public final void a(x.d dVar) {
        int i17 = this.mCurState;
        if (i17 < 1) {
            return;
        }
        int min = java.lang.Math.min(i17, 5);
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.f()) {
            if (fragment.mState < min) {
                moveToState(fragment, min);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    dVar.add(fragment);
                }
            }
        }
    }

    public void addBackStackState(androidx.fragment.app.a aVar) {
        if (this.mBackStack == null) {
            this.mBackStack = new java.util.ArrayList<>();
        }
        this.mBackStack.add(aVar);
    }

    public void addCancellationSignal(androidx.fragment.app.Fragment fragment, j3.h hVar) {
        if (this.mExitAnimationCancellationSignals.get(fragment) == null) {
            this.mExitAnimationCancellationSignals.put(fragment, new java.util.HashSet<>());
        }
        this.mExitAnimationCancellationSignals.get(fragment).add(hVar);
    }

    public androidx.fragment.app.d2 addFragment(androidx.fragment.app.Fragment fragment) {
        if (isLoggingEnabled(2)) {
            java.util.Objects.toString(fragment);
        }
        androidx.fragment.app.d2 createOrGetFragmentStateManager = createOrGetFragmentStateManager(fragment);
        fragment.mFragmentManager = this;
        this.mFragmentStore.g(createOrGetFragmentStateManager);
        if (!fragment.mDetached) {
            this.mFragmentStore.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
        }
        return createOrGetFragmentStateManager;
    }

    public void addFragmentOnAttachListener(androidx.fragment.app.x1 x1Var) {
        this.mOnAttachListeners.add(x1Var);
    }

    public void addOnBackStackChangedListener(androidx.fragment.app.p1 p1Var) {
        if (this.mBackStackChangeListeners == null) {
            this.mBackStackChangeListeners = new java.util.ArrayList<>();
        }
        this.mBackStackChangeListeners.add(p1Var);
    }

    public void addRetainedFragment(androidx.fragment.app.Fragment fragment) {
        this.mNonConfig.N6(fragment);
    }

    public int allocBackStackIndex() {
        return this.mBackStackIndex.getAndIncrement();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void attachController(androidx.fragment.app.v0 v0Var, androidx.fragment.app.s0 s0Var, androidx.fragment.app.Fragment fragment) {
        java.lang.String str;
        if (this.mHost != null) {
            throw new java.lang.IllegalStateException("Already attached");
        }
        this.mHost = v0Var;
        this.mContainer = s0Var;
        this.mParent = fragment;
        if (fragment != null) {
            addFragmentOnAttachListener(new androidx.fragment.app.i1(this, fragment));
        } else if (v0Var instanceof androidx.fragment.app.x1) {
            addFragmentOnAttachListener((androidx.fragment.app.x1) v0Var);
        }
        if (this.mParent != null) {
            s();
        }
        if (v0Var instanceof androidx.activity.k) {
            androidx.activity.k kVar = (androidx.activity.k) v0Var;
            androidx.activity.i onBackPressedDispatcher = kVar.getOnBackPressedDispatcher();
            this.mOnBackPressedDispatcher = onBackPressedDispatcher;
            androidx.lifecycle.y yVar = kVar;
            if (fragment != null) {
                yVar = fragment;
            }
            onBackPressedDispatcher.a(yVar, this.mOnBackPressedCallback);
        }
        if (fragment != null) {
            androidx.fragment.app.w1 w1Var = fragment.mFragmentManager.mNonConfig;
            java.util.HashMap hashMap = w1Var.f11503e;
            androidx.fragment.app.w1 w1Var2 = (androidx.fragment.app.w1) hashMap.get(fragment.mWho);
            if (w1Var2 == null) {
                w1Var2 = new androidx.fragment.app.w1(w1Var.f11505g);
                hashMap.put(fragment.mWho, w1Var2);
            }
            this.mNonConfig = w1Var2;
        } else if (v0Var instanceof androidx.lifecycle.m1) {
            this.mNonConfig = (androidx.fragment.app.w1) new androidx.lifecycle.j1(((androidx.lifecycle.m1) v0Var).getViewModel(), androidx.fragment.app.w1.f11501n).a(androidx.fragment.app.w1.class);
        } else {
            this.mNonConfig = new androidx.fragment.app.w1(false);
        }
        this.mNonConfig.f11508m = isStateSaved();
        this.mFragmentStore.f11314c = this.mNonConfig;
        java.lang.Object obj = this.mHost;
        if (obj instanceof androidx.activity.result.i) {
            androidx.activity.result.h activityResultRegistry = ((androidx.activity.result.i) obj).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            java.lang.String str2 = "FragmentManager:" + str;
            this.mStartActivityForResult = activityResultRegistry.e(str2 + "StartActivityForResult", new h.f(), new androidx.fragment.app.j1(this));
            this.mStartIntentSenderForResult = activityResultRegistry.e(str2 + "StartIntentSenderForResult", new androidx.fragment.app.l1(), new androidx.fragment.app.a1(this));
            this.mRequestPermissions = activityResultRegistry.e(str2 + "RequestPermissions", new h.d(), new androidx.fragment.app.b1(this));
        }
    }

    public void attachFragment(androidx.fragment.app.Fragment fragment) {
        if (isLoggingEnabled(2)) {
            java.util.Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.mFragmentStore.a(fragment);
            if (isLoggingEnabled(2)) {
                fragment.toString();
            }
            if (m(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
        }
    }

    public final void b(androidx.fragment.app.Fragment fragment) {
        java.util.HashSet<j3.h> hashSet = this.mExitAnimationCancellationSignals.get(fragment);
        if (hashSet != null) {
            java.util.Iterator<j3.h> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            fragment.performDestroyView();
            this.mLifecycleCallbacksDispatcher.n(fragment, false);
            fragment.mContainer = null;
            fragment.mView = null;
            fragment.mViewLifecycleOwner = null;
            fragment.mViewLifecycleOwnerLiveData.setValue(null);
            fragment.mInLayout = false;
            this.mExitAnimationCancellationSignals.remove(fragment);
        }
    }

    public androidx.fragment.app.i2 beginTransaction() {
        return new androidx.fragment.app.a(this);
    }

    public final void c() {
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    public boolean checkForMenus() {
        java.util.Iterator it = ((java.util.ArrayList) this.mFragmentStore.e()).iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) it.next();
            if (fragment != null) {
                z17 = m(fragment);
            }
            if (z17) {
                return true;
            }
        }
        return false;
    }

    public final void clearFragmentResult(java.lang.String str) {
        this.mResults.remove(str);
    }

    public final void clearFragmentResultListener(java.lang.String str) {
        androidx.fragment.app.o1 remove = this.mResultListeners.remove(str);
        if (remove != null) {
            remove.f11433a.c(remove.f11435c);
        }
    }

    public void completeExecute(androidx.fragment.app.a aVar, boolean z17, boolean z18, boolean z19) {
        if (z17) {
            aVar.s(z19);
        } else {
            aVar.r();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(java.lang.Boolean.valueOf(z17));
        if (z18 && this.mCurState >= 1) {
            androidx.fragment.app.r2.l(this.mHost.f11494e, this.mContainer, arrayList, arrayList2, 0, 1, true, this.mFragmentTransitionCallback);
        }
        if (z19) {
            moveToState(this.mCurState, true);
        }
        java.util.Iterator it = ((java.util.ArrayList) this.mFragmentStore.e()).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) it.next();
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar.t(fragment.mContainerId)) {
                float f17 = fragment.mPostponedAlpha;
                if (f17 > 0.0f) {
                    android.view.View view = fragment.mView;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList3.add(java.lang.Float.valueOf(f17));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view, arrayList3.toArray(), "androidx/fragment/app/FragmentManager", "completeExecute", "(Landroidx/fragment/app/BackStackRecord;ZZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(view, "androidx/fragment/app/FragmentManager", "completeExecute", "(Landroidx/fragment/app/BackStackRecord;ZZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                if (z19) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    public androidx.fragment.app.d2 createOrGetFragmentStateManager(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.f2 f2Var = this.mFragmentStore;
        androidx.fragment.app.d2 d2Var = (androidx.fragment.app.d2) f2Var.f11313b.get(fragment.mWho);
        if (d2Var != null) {
            return d2Var;
        }
        androidx.fragment.app.d2 d2Var2 = new androidx.fragment.app.d2(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment);
        d2Var2.k(this.mHost.f11494e.getClassLoader());
        d2Var2.f11306e = this.mCurState;
        return d2Var2;
    }

    public final java.util.Set d() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = ((java.util.ArrayList) this.mFragmentStore.d()).iterator();
        while (it.hasNext()) {
            android.view.ViewGroup viewGroup = ((androidx.fragment.app.d2) it.next()).f11304c.mContainer;
            if (viewGroup != null) {
                hashSet.add(androidx.fragment.app.n3.g(viewGroup, getSpecialEffectsControllerFactory()));
            }
        }
        return hashSet;
    }

    public void detachFragment(androidx.fragment.app.Fragment fragment) {
        if (isLoggingEnabled(2)) {
            java.util.Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (isLoggingEnabled(2)) {
                fragment.toString();
            }
            androidx.fragment.app.f2 f2Var = this.mFragmentStore;
            synchronized (f2Var.f11312a) {
                f2Var.f11312a.remove(fragment);
            }
            fragment.mAdded = false;
            if (m(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            p(fragment);
        }
    }

    public void dispatchActivityCreated() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f11508m = false;
        f(4);
    }

    public void dispatchAttach() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f11508m = false;
        f(0);
    }

    public void dispatchConfigurationChanged(android.content.res.Configuration configuration) {
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public boolean dispatchContextItemSelected(android.view.MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void dispatchCreate() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f11508m = false;
        f(1);
    }

    public boolean dispatchCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        if (this.mCurState < 1) {
            return false;
        }
        java.util.ArrayList<androidx.fragment.app.Fragment> arrayList = null;
        boolean z17 = false;
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null && isParentMenuVisible(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList<>();
                }
                arrayList.add(fragment);
                z17 = true;
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i17 = 0; i17 < this.mCreatedMenus.size(); i17++) {
                androidx.fragment.app.Fragment fragment2 = this.mCreatedMenus.get(i17);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return z17;
    }

    public void dispatchDestroy() {
        this.mDestroyed = true;
        execPendingActions(true);
        g();
        f(-1);
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
        if (this.mOnBackPressedDispatcher != null) {
            this.mOnBackPressedCallback.remove();
            this.mOnBackPressedDispatcher = null;
        }
        androidx.activity.result.c cVar = this.mStartActivityForResult;
        if (cVar != null) {
            cVar.b();
            this.mStartIntentSenderForResult.b();
            this.mRequestPermissions.b();
        }
    }

    public void dispatchDestroyView() {
        f(1);
    }

    public void dispatchLowMemory() {
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public void dispatchMultiWindowModeChanged(boolean z17) {
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z17);
            }
        }
    }

    public void dispatchOnAttachFragment(androidx.fragment.app.Fragment fragment) {
        java.util.Iterator<androidx.fragment.app.x1> it = this.mOnAttachListeners.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    public boolean dispatchOptionsItemSelected(android.view.MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void dispatchOptionsMenuClosed(android.view.Menu menu) {
        if (this.mCurState < 1) {
            return;
        }
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public void dispatchPause() {
        f(5);
    }

    public void dispatchPictureInPictureModeChanged(boolean z17) {
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z17);
            }
        }
    }

    public boolean dispatchPrepareOptionsMenu(android.view.Menu menu) {
        boolean z17 = false;
        if (this.mCurState < 1) {
            return false;
        }
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null && isParentMenuVisible(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z17 = true;
            }
        }
        return z17;
    }

    public void dispatchPrimaryNavigationFragmentChanged() {
        s();
        e(this.mPrimaryNav);
    }

    public void dispatchResume() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f11508m = false;
        f(7);
    }

    public void dispatchStart() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f11508m = false;
        f(5);
    }

    public void dispatchStop() {
        this.mStopped = true;
        this.mNonConfig.f11508m = true;
        f(4);
    }

    public void dispatchViewCreated() {
        f(2);
    }

    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        int size;
        int size2;
        java.lang.String str2 = str + "    ";
        androidx.fragment.app.f2 f2Var = this.mFragmentStore;
        f2Var.getClass();
        java.lang.String str3 = str + "    ";
        java.util.HashMap hashMap = f2Var.f11313b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (androidx.fragment.app.d2 d2Var : hashMap.values()) {
                printWriter.print(str);
                if (d2Var != null) {
                    androidx.fragment.app.Fragment fragment = d2Var.f11304c;
                    printWriter.println(fragment);
                    fragment.dump(str3, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        java.util.ArrayList arrayList = f2Var.f11312a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i17 = 0; i17 < size3; i17++) {
                androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) arrayList.get(i17);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i17);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        java.util.ArrayList<androidx.fragment.app.Fragment> arrayList2 = this.mCreatedMenus;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i18 = 0; i18 < size2; i18++) {
                androidx.fragment.app.Fragment fragment3 = this.mCreatedMenus.get(i18);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i18);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        java.util.ArrayList<androidx.fragment.app.a> arrayList3 = this.mBackStack;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i19 = 0; i19 < size; i19++) {
                androidx.fragment.app.a aVar = this.mBackStack.get(i19);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i19);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.q(str2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.mBackStackIndex.get());
        synchronized (this.mPendingActions) {
            int size4 = this.mPendingActions.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i27 = 0; i27 < size4; i27++) {
                    java.lang.Object obj = (androidx.fragment.app.q1) this.mPendingActions.get(i27);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i27);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.mHost);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.mContainer);
        if (this.mParent != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.mParent);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.mCurState);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.mStateSaved);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.mDestroyed);
        if (this.mNeedMenuInvalidate) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.mNeedMenuInvalidate);
        }
    }

    public final void e(androidx.fragment.app.Fragment fragment) {
        if (fragment == null || !fragment.equals(findActiveFragment(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public void enqueueAction(androidx.fragment.app.q1 q1Var, boolean z17) {
        if (!z17) {
            if (this.mHost == null) {
                if (!this.mDestroyed) {
                    throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
            }
            if (isStateSaved()) {
                throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.mPendingActions) {
            if (this.mHost == null) {
                if (!z17) {
                    throw new java.lang.IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.mPendingActions.add(q1Var);
                scheduleCommit();
            }
        }
    }

    public boolean execPendingActions(boolean z17) {
        boolean z18;
        h(z17);
        boolean z19 = false;
        while (true) {
            java.util.ArrayList<androidx.fragment.app.a> arrayList = this.mTmpRecords;
            java.util.ArrayList<java.lang.Boolean> arrayList2 = this.mTmpIsPop;
            synchronized (this.mPendingActions) {
                if (this.mPendingActions.isEmpty()) {
                    z18 = false;
                } else {
                    int size = this.mPendingActions.size();
                    z18 = false;
                    for (int i17 = 0; i17 < size; i17++) {
                        z18 |= this.mPendingActions.get(i17).a(arrayList, arrayList2);
                    }
                    this.mPendingActions.clear();
                    this.mHost.f11495f.removeCallbacks(this.mExecCommit);
                }
            }
            if (!z18) {
                break;
            }
            z19 = true;
            this.mExecutingActions = true;
            try {
                o(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                c();
            }
        }
        s();
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            q();
        }
        this.mFragmentStore.f11313b.values().removeAll(java.util.Collections.singleton(null));
        return z19;
    }

    public void execSingleAction(androidx.fragment.app.q1 q1Var, boolean z17) {
        if (z17 && (this.mHost == null || this.mDestroyed)) {
            return;
        }
        h(z17);
        if (q1Var.a(this.mTmpRecords, this.mTmpIsPop)) {
            this.mExecutingActions = true;
            try {
                o(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                c();
            }
        }
        s();
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            q();
        }
        this.mFragmentStore.f11313b.values().removeAll(java.util.Collections.singleton(null));
    }

    public boolean executePendingTransactions() {
        boolean execPendingActions = execPendingActions(true);
        k();
        return execPendingActions;
    }

    public final void f(int i17) {
        try {
            this.mExecutingActions = true;
            for (androidx.fragment.app.d2 d2Var : this.mFragmentStore.f11313b.values()) {
                if (d2Var != null) {
                    d2Var.f11306e = i17;
                }
            }
            moveToState(i17, false);
            if (USE_STATE_MANAGER) {
                java.util.Iterator it = ((java.util.HashSet) d()).iterator();
                while (it.hasNext()) {
                    ((androidx.fragment.app.n3) it.next()).e();
                }
            }
            this.mExecutingActions = false;
            execPendingActions(true);
        } catch (java.lang.Throwable th6) {
            this.mExecutingActions = false;
            throw th6;
        }
    }

    public androidx.fragment.app.Fragment findActiveFragment(java.lang.String str) {
        return this.mFragmentStore.b(str);
    }

    public androidx.fragment.app.Fragment findFragmentById(int i17) {
        androidx.fragment.app.f2 f2Var = this.mFragmentStore;
        java.util.ArrayList arrayList = f2Var.f11312a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (androidx.fragment.app.d2 d2Var : f2Var.f11313b.values()) {
                    if (d2Var != null) {
                        androidx.fragment.app.Fragment fragment = d2Var.f11304c;
                        if (fragment.mFragmentId == i17) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) arrayList.get(size);
            if (fragment2 != null && fragment2.mFragmentId == i17) {
                return fragment2;
            }
        }
    }

    public androidx.fragment.app.Fragment findFragmentByTag(java.lang.String str) {
        androidx.fragment.app.f2 f2Var = this.mFragmentStore;
        if (str != null) {
            java.util.ArrayList arrayList = f2Var.f11312a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (androidx.fragment.app.d2 d2Var : f2Var.f11313b.values()) {
                if (d2Var != null) {
                    androidx.fragment.app.Fragment fragment2 = d2Var.f11304c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        } else {
            f2Var.getClass();
        }
        return null;
    }

    public androidx.fragment.app.Fragment findFragmentByWho(java.lang.String str) {
        return this.mFragmentStore.c(str);
    }

    public final void g() {
        if (USE_STATE_MANAGER) {
            java.util.Iterator it = ((java.util.HashSet) d()).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.n3) it.next()).e();
            }
        } else {
            if (this.mExitAnimationCancellationSignals.isEmpty()) {
                return;
            }
            for (androidx.fragment.app.Fragment fragment : this.mExitAnimationCancellationSignals.keySet()) {
                b(fragment);
                moveToState(fragment);
            }
        }
    }

    public int getActiveFragmentCount() {
        return this.mFragmentStore.f11313b.size();
    }

    public java.util.List<androidx.fragment.app.Fragment> getActiveFragments() {
        return this.mFragmentStore.e();
    }

    public androidx.fragment.app.k1 getBackStackEntryAt(int i17) {
        return this.mBackStack.get(i17);
    }

    public int getBackStackEntryCount() {
        java.util.ArrayList<androidx.fragment.app.a> arrayList = this.mBackStack;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public androidx.fragment.app.s0 getContainer() {
        return this.mContainer;
    }

    public androidx.fragment.app.Fragment getFragment(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        androidx.fragment.app.Fragment findActiveFragment = findActiveFragment(string);
        if (findActiveFragment != null) {
            return findActiveFragment;
        }
        r(new java.lang.IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    public androidx.fragment.app.u0 getFragmentFactory() {
        androidx.fragment.app.u0 u0Var = this.mFragmentFactory;
        if (u0Var != null) {
            return u0Var;
        }
        androidx.fragment.app.Fragment fragment = this.mParent;
        return fragment != null ? fragment.mFragmentManager.getFragmentFactory() : this.mHostFragmentFactory;
    }

    public androidx.fragment.app.f2 getFragmentStore() {
        return this.mFragmentStore;
    }

    public java.util.List<androidx.fragment.app.Fragment> getFragments() {
        return this.mFragmentStore.f();
    }

    public androidx.fragment.app.v0 getHost() {
        return this.mHost;
    }

    public android.view.LayoutInflater.Factory2 getLayoutInflaterFactory() {
        return this.mLayoutInflaterFactory;
    }

    public androidx.fragment.app.z0 getLifecycleCallbacksDispatcher() {
        return this.mLifecycleCallbacksDispatcher;
    }

    public androidx.fragment.app.Fragment getParent() {
        return this.mParent;
    }

    public androidx.fragment.app.Fragment getPrimaryNavigationFragment() {
        return this.mPrimaryNav;
    }

    public androidx.fragment.app.o3 getSpecialEffectsControllerFactory() {
        androidx.fragment.app.o3 o3Var = this.mSpecialEffectsControllerFactory;
        if (o3Var != null) {
            return o3Var;
        }
        androidx.fragment.app.Fragment fragment = this.mParent;
        return fragment != null ? fragment.mFragmentManager.getSpecialEffectsControllerFactory() : this.mDefaultSpecialEffectsControllerFactory;
    }

    public androidx.lifecycle.l1 getViewModelStore(androidx.fragment.app.Fragment fragment) {
        java.util.HashMap hashMap = this.mNonConfig.f11504f;
        androidx.lifecycle.l1 l1Var = (androidx.lifecycle.l1) hashMap.get(fragment.mWho);
        if (l1Var != null) {
            return l1Var;
        }
        androidx.lifecycle.l1 l1Var2 = new androidx.lifecycle.l1();
        hashMap.put(fragment.mWho, l1Var2);
        return l1Var2;
    }

    public final void h(boolean z17) {
        if (this.mExecutingActions) {
            throw new java.lang.IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.mHost == null) {
            if (!this.mDestroyed) {
                throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
        }
        if (android.os.Looper.myLooper() != this.mHost.f11495f.getLooper()) {
            throw new java.lang.IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z17 && isStateSaved()) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.mTmpRecords == null) {
            this.mTmpRecords = new java.util.ArrayList<>();
            this.mTmpIsPop = new java.util.ArrayList<>();
        }
        this.mExecutingActions = true;
        try {
            j(null, null);
        } finally {
            this.mExecutingActions = false;
        }
    }

    public void handleOnBackPressed() {
        execPendingActions(true);
        if (this.mOnBackPressedCallback.isEnabled()) {
            popBackStackImmediate();
        } else {
            this.mOnBackPressedDispatcher.c();
        }
    }

    public void hideFragment(androidx.fragment.app.Fragment fragment) {
        if (isLoggingEnabled(2)) {
            java.util.Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        p(fragment);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.util.ArrayList r26, java.util.ArrayList r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.i(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public void invalidateMenuForFragment(androidx.fragment.app.Fragment fragment) {
        if (fragment.mAdded && m(fragment)) {
            this.mNeedMenuInvalidate = true;
        }
    }

    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    public boolean isParentMenuVisible(androidx.fragment.app.Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public boolean isPrimaryNavigation(androidx.fragment.app.Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        androidx.fragment.app.FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.getPrimaryNavigationFragment()) && isPrimaryNavigation(fragmentManager.mParent);
    }

    public boolean isStateAtLeast(int i17) {
        return this.mCurState >= i17;
    }

    public boolean isStateSaved() {
        return this.mStateSaved || this.mStopped;
    }

    public final void j(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        boolean z17;
        int indexOf;
        androidx.fragment.app.a aVar;
        int indexOf2;
        java.util.ArrayList<androidx.fragment.app.s1> arrayList3 = this.mPostponedTransactions;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i17 = 0;
        while (i17 < size) {
            androidx.fragment.app.s1 s1Var = this.mPostponedTransactions.get(i17);
            if (arrayList == null || s1Var.f11471a || (indexOf2 = arrayList.indexOf((aVar = s1Var.f11472b))) == -1 || arrayList2 == null || !((java.lang.Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                boolean z18 = s1Var.f11473c == 0;
                androidx.fragment.app.a aVar2 = s1Var.f11472b;
                if (z18 || (arrayList != null && aVar2.u(arrayList, 0, arrayList.size()))) {
                    this.mPostponedTransactions.remove(i17);
                    i17--;
                    size--;
                    if (arrayList == null || (z17 = s1Var.f11471a) || (indexOf = arrayList.indexOf(aVar2)) == -1 || arrayList2 == null || !((java.lang.Boolean) arrayList2.get(indexOf)).booleanValue()) {
                        s1Var.a();
                    } else {
                        aVar2.f11249r.completeExecute(aVar2, z17, false, false);
                    }
                }
            } else {
                this.mPostponedTransactions.remove(i17);
                i17--;
                size--;
                aVar.f11249r.completeExecute(aVar, s1Var.f11471a, false, false);
            }
            i17++;
        }
    }

    public final void k() {
        if (!USE_STATE_MANAGER) {
            if (this.mPostponedTransactions != null) {
                while (!this.mPostponedTransactions.isEmpty()) {
                    this.mPostponedTransactions.remove(0).a();
                }
                return;
            }
            return;
        }
        java.util.Iterator it = ((java.util.HashSet) d()).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.n3 n3Var = (androidx.fragment.app.n3) it.next();
            if (n3Var.f11424e) {
                n3Var.f11424e = false;
                n3Var.c();
            }
        }
    }

    public final android.view.ViewGroup l(androidx.fragment.app.Fragment fragment) {
        android.view.ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.mContainer.c()) {
            android.view.View b17 = this.mContainer.b(fragment.mContainerId);
            if (b17 instanceof android.view.ViewGroup) {
                return (android.view.ViewGroup) b17;
            }
        }
        return null;
    }

    public void launchRequestPermissions(androidx.fragment.app.Fragment fragment, java.lang.String[] strArr, int i17) {
        if (this.mRequestPermissions == null) {
            this.mHost.g(fragment, strArr, i17);
            return;
        }
        this.mLaunchedFragments.addLast(new androidx.fragment.app.FragmentManager.LaunchedFragmentInfo(fragment.mWho, i17));
        this.mRequestPermissions.a(strArr, null);
    }

    public void launchStartActivityForResult(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        if (this.mStartActivityForResult == null) {
            this.mHost.j(fragment, intent, i17, bundle);
            return;
        }
        this.mLaunchedFragments.addLast(new androidx.fragment.app.FragmentManager.LaunchedFragmentInfo(fragment.mWho, i17));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.mStartActivityForResult.a(intent, null);
    }

    public void launchStartIntentSenderForResult(androidx.fragment.app.Fragment fragment, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle) {
        android.content.Intent intent2;
        if (this.mStartIntentSenderForResult == null) {
            this.mHost.k(fragment, intentSender, i17, intent, i18, i19, i27, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new android.content.Intent();
                intent2.putExtra(EXTRA_CREATED_FILLIN_INTENT, true);
            } else {
                intent2 = intent;
            }
            if (isLoggingEnabled(2)) {
                bundle.toString();
                intent2.toString();
                java.util.Objects.toString(fragment);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        androidx.activity.result.IntentSenderRequest intentSenderRequest = new androidx.activity.result.IntentSenderRequest(intentSender, intent2, i18, i19);
        this.mLaunchedFragments.addLast(new androidx.fragment.app.FragmentManager.LaunchedFragmentInfo(fragment.mWho, i17));
        if (isLoggingEnabled(2)) {
            fragment.toString();
        }
        this.mStartIntentSenderForResult.a(intentSenderRequest, null);
    }

    public final boolean m(androidx.fragment.app.Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.checkForMenus();
    }

    public void moveFragmentToExpectedState(androidx.fragment.app.Fragment fragment) {
        android.animation.Animator animator;
        if (!(this.mFragmentStore.f11313b.get(fragment.mWho) != null)) {
            if (isLoggingEnabled(3)) {
                fragment.toString();
                toString();
                return;
            }
            return;
        }
        moveToState(fragment);
        android.view.View view = fragment.mView;
        if (view != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            float f17 = fragment.mPostponedAlpha;
            if (f17 > 0.0f) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(f17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "androidx/fragment/app/FragmentManager", "moveFragmentToExpectedState", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "androidx/fragment/app/FragmentManager", "moveFragmentToExpectedState", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            androidx.fragment.app.p0 a17 = androidx.fragment.app.r0.a(this.mHost.f11494e, fragment, true, fragment.getPopDirection());
            if (a17 != null) {
                android.view.animation.Animation animation = a17.f11448a;
                if (animation != null) {
                    fragment.mView.startAnimation(animation);
                } else {
                    android.view.View view2 = fragment.mView;
                    android.animation.Animator animator2 = a17.f11449b;
                    animator2.setTarget(view2);
                    animator2.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            if (fragment.mView != null) {
                androidx.fragment.app.p0 a18 = androidx.fragment.app.r0.a(this.mHost.f11494e, fragment, true ^ fragment.mHidden, fragment.getPopDirection());
                if (a18 == null || (animator = a18.f11449b) == null) {
                    if (a18 != null) {
                        android.view.View view3 = fragment.mView;
                        android.view.animation.Animation animation2 = a18.f11448a;
                        view3.startAnimation(animation2);
                        animation2.start();
                    }
                    int i17 = (!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8;
                    android.view.View view4 = fragment.mView;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view4, arrayList2.toArray(), "androidx/fragment/app/FragmentManager", "completeShowHideFragment", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view4, "androidx/fragment/app/FragmentManager", "completeShowHideFragment", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (fragment.isHideReplaced()) {
                        fragment.setHideReplaced(false);
                    }
                } else {
                    animator.setTarget(fragment.mView);
                    if (!fragment.mHidden) {
                        android.view.View view5 = fragment.mView;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view5, arrayList3.toArray(), "androidx/fragment/app/FragmentManager", "completeShowHideFragment", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view5, "androidx/fragment/app/FragmentManager", "completeShowHideFragment", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else if (fragment.isHideReplaced()) {
                        fragment.setHideReplaced(false);
                    } else {
                        android.view.ViewGroup viewGroup = fragment.mContainer;
                        android.view.View view6 = fragment.mView;
                        viewGroup.startViewTransition(view6);
                        animator.addListener(new androidx.fragment.app.h1(this, viewGroup, view6, fragment));
                    }
                    animator.start();
                }
            }
            invalidateMenuForFragment(fragment);
            fragment.mHiddenChanged = false;
            fragment.onHiddenChanged(fragment.mHidden);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r1 != 5) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void moveToState(androidx.fragment.app.Fragment r17, int r18) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.moveToState(androidx.fragment.app.Fragment, int):void");
    }

    public final boolean n(java.lang.String str, int i17, int i18) {
        execPendingActions(false);
        h(true);
        androidx.fragment.app.Fragment fragment = this.mPrimaryNav;
        if (fragment != null && i17 < 0 && str == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean popBackStackState = popBackStackState(this.mTmpRecords, this.mTmpIsPop, str, i17, i18);
        if (popBackStackState) {
            this.mExecutingActions = true;
            try {
                o(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                c();
            }
        }
        s();
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            q();
        }
        this.mFragmentStore.f11313b.values().removeAll(java.util.Collections.singleton(null));
        return popBackStackState;
    }

    public void noteStateNotSaved() {
        if (this.mHost == null) {
            return;
        }
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f11508m = false;
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void o(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new java.lang.IllegalStateException("Internal error with the back stack records");
        }
        j(arrayList, arrayList2);
        int size = arrayList.size();
        int i17 = 0;
        int i18 = 0;
        while (i17 < size) {
            if (!((androidx.fragment.app.a) arrayList.get(i17)).f11359p) {
                if (i18 != i17) {
                    i(arrayList, arrayList2, i18, i17);
                }
                i18 = i17 + 1;
                if (((java.lang.Boolean) arrayList2.get(i17)).booleanValue()) {
                    while (i18 < size && ((java.lang.Boolean) arrayList2.get(i18)).booleanValue() && !((androidx.fragment.app.a) arrayList.get(i18)).f11359p) {
                        i18++;
                    }
                }
                i(arrayList, arrayList2, i17, i18);
                i17 = i18 - 1;
            }
            i17++;
        }
        if (i18 != size) {
            i(arrayList, arrayList2, i18, size);
        }
    }

    public void onContainerAvailable(androidx.fragment.app.FragmentContainerView fragmentContainerView) {
        android.view.View view;
        java.util.Iterator it = ((java.util.ArrayList) this.mFragmentStore.d()).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.d2 d2Var = (androidx.fragment.app.d2) it.next();
            androidx.fragment.app.Fragment fragment = d2Var.f11304c;
            if (fragment.mContainerId == fragmentContainerView.getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = fragmentContainerView;
                d2Var.a();
            }
        }
    }

    @java.lang.Deprecated
    public androidx.fragment.app.i2 openTransaction() {
        return beginTransaction();
    }

    public final void p(androidx.fragment.app.Fragment fragment) {
        android.view.ViewGroup l17 = l(fragment);
        if (l17 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (l17.getTag(com.tencent.mm.R.id.p3q) == null) {
            l17.setTag(com.tencent.mm.R.id.p3q, fragment);
        }
        ((androidx.fragment.app.Fragment) l17.getTag(com.tencent.mm.R.id.p3q)).setPopDirection(fragment.getPopDirection());
    }

    public void performPendingDeferredStart(androidx.fragment.app.d2 d2Var) {
        androidx.fragment.app.Fragment fragment = d2Var.f11304c;
        if (fragment.mDeferStart) {
            if (this.mExecutingActions) {
                this.mHavePendingDeferredStart = true;
                return;
            }
            fragment.mDeferStart = false;
            if (USE_STATE_MANAGER) {
                d2Var.j();
            } else {
                moveToState(fragment);
            }
        }
    }

    public void popBackStack() {
        enqueueAction(new androidx.fragment.app.r1(this, null, -1, 0), false);
    }

    public boolean popBackStackImmediate() {
        return n(null, -1, 0);
    }

    public boolean popBackStackState(java.util.ArrayList<androidx.fragment.app.a> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2, java.lang.String str, int i17, int i18) {
        int i19;
        java.util.ArrayList<androidx.fragment.app.a> arrayList3 = this.mBackStack;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i17 < 0 && (i18 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.mBackStack.remove(size));
            arrayList2.add(java.lang.Boolean.TRUE);
        } else {
            if (str != null || i17 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.mBackStack.get(size2);
                    if ((str != null && str.equals(aVar.f11352i)) || (i17 >= 0 && i17 == aVar.f11251t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i18 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.mBackStack.get(size2);
                        if (str == null || !str.equals(aVar2.f11352i)) {
                            if (i17 < 0 || i17 != aVar2.f11251t) {
                                break;
                            }
                        }
                    }
                }
                i19 = size2;
            } else {
                i19 = -1;
            }
            if (i19 == this.mBackStack.size() - 1) {
                return false;
            }
            for (int size3 = this.mBackStack.size() - 1; size3 > i19; size3--) {
                arrayList.add(this.mBackStack.remove(size3));
                arrayList2.add(java.lang.Boolean.TRUE);
            }
        }
        return true;
    }

    public void putFragment(android.os.Bundle bundle, java.lang.String str, androidx.fragment.app.Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
            return;
        }
        r(new java.lang.IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    public final void q() {
        java.util.Iterator it = ((java.util.ArrayList) this.mFragmentStore.d()).iterator();
        while (it.hasNext()) {
            performPendingDeferredStart((androidx.fragment.app.d2) it.next());
        }
    }

    public final void r(java.lang.RuntimeException runtimeException) {
        runtimeException.getMessage();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(new androidx.fragment.app.f3(TAG));
        androidx.fragment.app.v0 v0Var = this.mHost;
        try {
            if (v0Var != null) {
                v0Var.d("  ", null, printWriter, new java.lang.String[0]);
            } else {
                dump("  ", null, printWriter, new java.lang.String[0]);
            }
            throw runtimeException;
        } catch (java.lang.Exception unused) {
            throw runtimeException;
        }
    }

    public void registerFragmentLifecycleCallbacks(androidx.fragment.app.m1 m1Var, boolean z17) {
        this.mLifecycleCallbacksDispatcher.f11526a.add(new androidx.fragment.app.y0(m1Var, z17));
    }

    public void removeCancellationSignal(androidx.fragment.app.Fragment fragment, j3.h hVar) {
        java.util.HashSet<j3.h> hashSet = this.mExitAnimationCancellationSignals.get(fragment);
        if (hashSet != null && hashSet.remove(hVar) && hashSet.isEmpty()) {
            this.mExitAnimationCancellationSignals.remove(fragment);
            if (fragment.mState < 5) {
                fragment.performDestroyView();
                this.mLifecycleCallbacksDispatcher.n(fragment, false);
                fragment.mContainer = null;
                fragment.mView = null;
                fragment.mViewLifecycleOwner = null;
                fragment.mViewLifecycleOwnerLiveData.setValue(null);
                fragment.mInLayout = false;
                moveToState(fragment);
            }
        }
    }

    public void removeFragment(androidx.fragment.app.Fragment fragment) {
        if (isLoggingEnabled(2)) {
            java.util.Objects.toString(fragment);
            int i17 = fragment.mBackStackNesting;
        }
        boolean z17 = !fragment.isInBackStack();
        if (!fragment.mDetached || z17) {
            androidx.fragment.app.f2 f2Var = this.mFragmentStore;
            synchronized (f2Var.f11312a) {
                f2Var.f11312a.remove(fragment);
            }
            fragment.mAdded = false;
            if (m(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.mRemoving = true;
            p(fragment);
        }
    }

    public void removeFragmentOnAttachListener(androidx.fragment.app.x1 x1Var) {
        this.mOnAttachListeners.remove(x1Var);
    }

    public void removeOnBackStackChangedListener(androidx.fragment.app.p1 p1Var) {
        java.util.ArrayList<androidx.fragment.app.p1> arrayList = this.mBackStackChangeListeners;
        if (arrayList != null) {
            arrayList.remove(p1Var);
        }
    }

    public void removeRetainedFragment(androidx.fragment.app.Fragment fragment) {
        this.mNonConfig.P6(fragment);
    }

    public void restoreAllState(android.os.Parcelable parcelable, androidx.fragment.app.t1 t1Var) {
        if (this.mHost instanceof androidx.lifecycle.m1) {
            r(new java.lang.IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
            throw null;
        }
        this.mNonConfig.Q6(t1Var);
        restoreSaveState(parcelable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void restoreSaveState(android.os.Parcelable parcelable) {
        int i17;
        androidx.fragment.app.d2 d2Var;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.FragmentManagerState fragmentManagerState = (androidx.fragment.app.FragmentManagerState) parcelable;
        if (fragmentManagerState.f11215d == null) {
            return;
        }
        this.mFragmentStore.f11313b.clear();
        java.util.Iterator it = fragmentManagerState.f11215d.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentState fragmentState = (androidx.fragment.app.FragmentState) it.next();
            if (fragmentState != null) {
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) this.mNonConfig.f11502d.get(fragmentState.f11224e);
                if (fragment != null) {
                    if (isLoggingEnabled(2)) {
                        fragment.toString();
                    }
                    d2Var = new androidx.fragment.app.d2(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment, fragmentState);
                } else {
                    d2Var = new androidx.fragment.app.d2(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, this.mHost.f11494e.getClassLoader(), getFragmentFactory(), fragmentState);
                }
                androidx.fragment.app.Fragment fragment2 = d2Var.f11304c;
                fragment2.mFragmentManager = this;
                if (isLoggingEnabled(2)) {
                    fragment2.toString();
                }
                d2Var.k(this.mHost.f11494e.getClassLoader());
                this.mFragmentStore.g(d2Var);
                d2Var.f11306e = this.mCurState;
            }
        }
        androidx.fragment.app.w1 w1Var = this.mNonConfig;
        w1Var.getClass();
        java.util.Iterator it6 = new java.util.ArrayList(w1Var.f11502d.values()).iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            androidx.fragment.app.Fragment fragment3 = (androidx.fragment.app.Fragment) it6.next();
            if ((this.mFragmentStore.f11313b.get(fragment3.mWho) != null ? 1 : 0) == 0) {
                if (isLoggingEnabled(2)) {
                    fragment3.toString();
                    java.util.Objects.toString(fragmentManagerState.f11215d);
                }
                this.mNonConfig.P6(fragment3);
                fragment3.mFragmentManager = this;
                androidx.fragment.app.d2 d2Var2 = new androidx.fragment.app.d2(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment3);
                d2Var2.f11306e = 1;
                d2Var2.j();
                fragment3.mRemoving = true;
                d2Var2.j();
            }
        }
        androidx.fragment.app.f2 f2Var = this.mFragmentStore;
        java.util.ArrayList<java.lang.String> arrayList = fragmentManagerState.f11216e;
        f2Var.f11312a.clear();
        if (arrayList != null) {
            for (java.lang.String str : arrayList) {
                androidx.fragment.app.Fragment b17 = f2Var.b(str);
                if (b17 == null) {
                    throw new java.lang.IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (isLoggingEnabled(2)) {
                    b17.toString();
                }
                f2Var.a(b17);
            }
        }
        if (fragmentManagerState.f11217f != null) {
            this.mBackStack = new java.util.ArrayList<>(fragmentManagerState.f11217f.length);
            int i18 = 0;
            while (true) {
                androidx.fragment.app.BackStackState[] backStackStateArr = fragmentManagerState.f11217f;
                if (i18 >= backStackStateArr.length) {
                    break;
                }
                androidx.fragment.app.BackStackState backStackState = backStackStateArr[i18];
                backStackState.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                int i19 = 0;
                int i27 = 0;
                while (true) {
                    int[] iArr = backStackState.f11190d;
                    if (i19 >= iArr.length) {
                        break;
                    }
                    androidx.fragment.app.h2 h2Var = new androidx.fragment.app.h2();
                    int i28 = i19 + 1;
                    h2Var.f11328a = iArr[i19];
                    if (isLoggingEnabled(2)) {
                        aVar.toString();
                        int i29 = iArr[i28];
                    }
                    java.lang.String str2 = (java.lang.String) backStackState.f11191e.get(i27);
                    if (str2 != null) {
                        h2Var.f11329b = findActiveFragment(str2);
                    } else {
                        h2Var.f11329b = null;
                    }
                    h2Var.f11334g = androidx.lifecycle.n.values()[backStackState.f11192f[i27]];
                    h2Var.f11335h = androidx.lifecycle.n.values()[backStackState.f11193g[i27]];
                    int i37 = i28 + 1;
                    int i38 = iArr[i28];
                    h2Var.f11330c = i38;
                    int i39 = i37 + 1;
                    int i47 = iArr[i37];
                    h2Var.f11331d = i47;
                    int i48 = i39 + 1;
                    int i49 = iArr[i39];
                    h2Var.f11332e = i49;
                    int i57 = iArr[i48];
                    h2Var.f11333f = i57;
                    aVar.f11345b = i38;
                    aVar.f11346c = i47;
                    aVar.f11347d = i49;
                    aVar.f11348e = i57;
                    aVar.b(h2Var);
                    i27++;
                    i19 = i48 + 1;
                }
                aVar.f11349f = backStackState.f11194h;
                aVar.f11352i = backStackState.f11195i;
                aVar.f11251t = backStackState.f11196m;
                aVar.f11350g = true;
                aVar.f11353j = backStackState.f11197n;
                aVar.f11354k = backStackState.f11198o;
                aVar.f11355l = backStackState.f11199p;
                aVar.f11356m = backStackState.f11200q;
                aVar.f11357n = backStackState.f11201r;
                aVar.f11358o = backStackState.f11202s;
                aVar.f11359p = backStackState.f11203t;
                aVar.o(1);
                if (isLoggingEnabled(2)) {
                    aVar.toString();
                    java.io.PrintWriter printWriter = new java.io.PrintWriter(new androidx.fragment.app.f3(TAG));
                    aVar.q("  ", printWriter, false);
                    printWriter.close();
                }
                this.mBackStack.add(aVar);
                i18++;
            }
        } else {
            this.mBackStack = null;
        }
        this.mBackStackIndex.set(fragmentManagerState.f11218g);
        java.lang.String str3 = fragmentManagerState.f11219h;
        if (str3 != null) {
            androidx.fragment.app.Fragment findActiveFragment = findActiveFragment(str3);
            this.mPrimaryNav = findActiveFragment;
            e(findActiveFragment);
        }
        java.util.ArrayList arrayList2 = fragmentManagerState.f11220i;
        if (arrayList2 != null) {
            while (i17 < arrayList2.size()) {
                this.mResults.put(arrayList2.get(i17), fragmentManagerState.f11221m.get(i17));
                i17++;
            }
        }
        this.mLaunchedFragments = new java.util.ArrayDeque<>(fragmentManagerState.f11222n);
    }

    @java.lang.Deprecated
    public androidx.fragment.app.t1 retainNonConfig() {
        if (!(this.mHost instanceof androidx.lifecycle.m1)) {
            return this.mNonConfig.O6();
        }
        r(new java.lang.IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        throw null;
    }

    public final void s() {
        synchronized (this.mPendingActions) {
            if (this.mPendingActions.isEmpty()) {
                this.mOnBackPressedCallback.setEnabled(getBackStackEntryCount() > 0 && isPrimaryNavigation(this.mParent));
            } else {
                this.mOnBackPressedCallback.setEnabled(true);
            }
        }
    }

    public android.os.Parcelable saveAllState() {
        java.util.ArrayList arrayList;
        int size;
        k();
        g();
        execPendingActions(true);
        this.mStateSaved = true;
        this.mNonConfig.f11508m = true;
        androidx.fragment.app.f2 f2Var = this.mFragmentStore;
        f2Var.getClass();
        java.util.HashMap hashMap = f2Var.f11313b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(hashMap.size());
        for (androidx.fragment.app.d2 d2Var : hashMap.values()) {
            if (d2Var != null) {
                androidx.fragment.app.Fragment fragment = d2Var.f11304c;
                androidx.fragment.app.FragmentState fragmentState = new androidx.fragment.app.FragmentState(fragment);
                if (fragment.mState <= -1 || fragmentState.f11235s != null) {
                    fragmentState.f11235s = fragment.mSavedFragmentState;
                } else {
                    android.os.Bundle m17 = d2Var.m();
                    fragmentState.f11235s = m17;
                    if (fragment.mTargetWho != null) {
                        if (m17 == null) {
                            fragmentState.f11235s = new android.os.Bundle();
                        }
                        fragmentState.f11235s.putString("android:target_state", fragment.mTargetWho);
                        int i17 = fragment.mTargetRequestCode;
                        if (i17 != 0) {
                            fragmentState.f11235s.putInt("android:target_req_state", i17);
                        }
                    }
                }
                arrayList2.add(fragmentState);
                if (isLoggingEnabled(2)) {
                    java.util.Objects.toString(fragment);
                    java.util.Objects.toString(fragmentState.f11235s);
                }
            }
        }
        androidx.fragment.app.BackStackState[] backStackStateArr = null;
        if (arrayList2.isEmpty()) {
            isLoggingEnabled(2);
            return null;
        }
        androidx.fragment.app.f2 f2Var2 = this.mFragmentStore;
        synchronized (f2Var2.f11312a) {
            if (f2Var2.f11312a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList(f2Var2.f11312a.size());
                java.util.Iterator it = f2Var2.f11312a.iterator();
                while (it.hasNext()) {
                    androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) it.next();
                    arrayList.add(fragment2.mWho);
                    if (isLoggingEnabled(2)) {
                        fragment2.toString();
                    }
                }
            }
        }
        java.util.ArrayList<androidx.fragment.app.a> arrayList3 = this.mBackStack;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            backStackStateArr = new androidx.fragment.app.BackStackState[size];
            for (int i18 = 0; i18 < size; i18++) {
                backStackStateArr[i18] = new androidx.fragment.app.BackStackState(this.mBackStack.get(i18));
                if (isLoggingEnabled(2)) {
                    java.util.Objects.toString(this.mBackStack.get(i18));
                }
            }
        }
        androidx.fragment.app.FragmentManagerState fragmentManagerState = new androidx.fragment.app.FragmentManagerState();
        fragmentManagerState.f11215d = arrayList2;
        fragmentManagerState.f11216e = arrayList;
        fragmentManagerState.f11217f = backStackStateArr;
        fragmentManagerState.f11218g = this.mBackStackIndex.get();
        androidx.fragment.app.Fragment fragment3 = this.mPrimaryNav;
        if (fragment3 != null) {
            fragmentManagerState.f11219h = fragment3.mWho;
        }
        fragmentManagerState.f11220i.addAll(this.mResults.keySet());
        fragmentManagerState.f11221m.addAll(this.mResults.values());
        fragmentManagerState.f11222n = new java.util.ArrayList(this.mLaunchedFragments);
        return fragmentManagerState;
    }

    public androidx.fragment.app.Fragment.SavedState saveFragmentInstanceState(androidx.fragment.app.Fragment fragment) {
        android.os.Bundle m17;
        androidx.fragment.app.d2 d2Var = (androidx.fragment.app.d2) this.mFragmentStore.f11313b.get(fragment.mWho);
        if (d2Var != null) {
            androidx.fragment.app.Fragment fragment2 = d2Var.f11304c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState <= -1 || (m17 = d2Var.m()) == null) {
                    return null;
                }
                return new androidx.fragment.app.Fragment.SavedState(m17);
            }
        }
        r(new java.lang.IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    public void scheduleCommit() {
        synchronized (this.mPendingActions) {
            java.util.ArrayList<androidx.fragment.app.s1> arrayList = this.mPostponedTransactions;
            boolean z17 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z18 = this.mPendingActions.size() == 1;
            if (z17 || z18) {
                this.mHost.f11495f.removeCallbacks(this.mExecCommit);
                this.mHost.f11495f.post(this.mExecCommit);
                s();
            }
        }
    }

    public void setExitAnimationOrder(androidx.fragment.app.Fragment fragment, boolean z17) {
        android.view.ViewGroup l17 = l(fragment);
        if (l17 == null || !(l17 instanceof androidx.fragment.app.FragmentContainerView)) {
            return;
        }
        ((androidx.fragment.app.FragmentContainerView) l17).setDrawDisappearingViewsLast(!z17);
    }

    public void setFragmentFactory(androidx.fragment.app.u0 u0Var) {
        this.mFragmentFactory = u0Var;
    }

    public final void setFragmentResult(java.lang.String str, android.os.Bundle bundle) {
        androidx.fragment.app.o1 o1Var = this.mResultListeners.get(str);
        if (o1Var != null) {
            if (o1Var.f11433a.b().a(androidx.lifecycle.n.STARTED)) {
                o1Var.a(str, bundle);
                return;
            }
        }
        this.mResults.put(str, bundle);
    }

    public final void setFragmentResultListener(final java.lang.String str, androidx.lifecycle.y yVar, final androidx.fragment.app.z1 z1Var) {
        final androidx.lifecycle.o mo133getLifecycle = yVar.mo133getLifecycle();
        if (mo133getLifecycle.b() == androidx.lifecycle.n.DESTROYED) {
            return;
        }
        androidx.lifecycle.v vVar = new androidx.lifecycle.v() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.v
            public void onStateChanged(androidx.lifecycle.y yVar2, androidx.lifecycle.m mVar) {
                android.os.Bundle bundle;
                androidx.lifecycle.m mVar2 = androidx.lifecycle.m.ON_START;
                androidx.fragment.app.FragmentManager fragmentManager = androidx.fragment.app.FragmentManager.this;
                java.lang.String str2 = str;
                if (mVar == mVar2 && (bundle = (android.os.Bundle) fragmentManager.mResults.get(str2)) != null) {
                    ((androidx.fragment.app.o1) z1Var).a(str2, bundle);
                    fragmentManager.clearFragmentResult(str2);
                }
                if (mVar == androidx.lifecycle.m.ON_DESTROY) {
                    mo133getLifecycle.c(this);
                    fragmentManager.mResultListeners.remove(str2);
                }
            }
        };
        mo133getLifecycle.a(vVar);
        androidx.fragment.app.o1 put = this.mResultListeners.put(str, new androidx.fragment.app.o1(mo133getLifecycle, z1Var, vVar));
        if (put != null) {
            put.f11433a.c(put.f11435c);
        }
    }

    public void setMaxLifecycle(androidx.fragment.app.Fragment fragment, androidx.lifecycle.n nVar) {
        if (fragment.equals(findActiveFragment(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = nVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void setPrimaryNavigationFragment(androidx.fragment.app.Fragment fragment) {
        if (fragment == null || (fragment.equals(findActiveFragment(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            androidx.fragment.app.Fragment fragment2 = this.mPrimaryNav;
            this.mPrimaryNav = fragment;
            e(fragment2);
            e(this.mPrimaryNav);
            return;
        }
        throw new java.lang.IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void setSpecialEffectsControllerFactory(androidx.fragment.app.o3 o3Var) {
        this.mSpecialEffectsControllerFactory = o3Var;
    }

    public void showFragment(androidx.fragment.app.Fragment fragment) {
        if (isLoggingEnabled(2)) {
            java.util.Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        sb6.append("FragmentManager{");
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb6.append(" in ");
        androidx.fragment.app.Fragment fragment = this.mParent;
        if (fragment != null) {
            sb6.append(fragment.getClass().getSimpleName());
            sb6.append("{");
            sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.mParent)));
            sb6.append("}");
        } else {
            androidx.fragment.app.v0 v0Var = this.mHost;
            if (v0Var != null) {
                sb6.append(v0Var.getClass().getSimpleName());
                sb6.append("{");
                sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.mHost)));
                sb6.append("}");
            } else {
                sb6.append("null");
            }
        }
        sb6.append("}}");
        return sb6.toString();
    }

    public void unregisterFragmentLifecycleCallbacks(androidx.fragment.app.m1 m1Var) {
        androidx.fragment.app.z0 z0Var = this.mLifecycleCallbacksDispatcher;
        synchronized (z0Var.f11526a) {
            if (z0Var.f11526a.size() > 0) {
                ((androidx.fragment.app.y0) z0Var.f11526a.get(0)).getClass();
                z0Var.f11526a.remove(0);
            }
        }
    }

    public void popBackStack(java.lang.String str, int i17) {
        enqueueAction(new androidx.fragment.app.r1(this, str, -1, i17), false);
    }

    public boolean popBackStackImmediate(java.lang.String str, int i17) {
        return n(str, -1, i17);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes14.dex */
    public class LaunchedFragmentInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> CREATOR = new androidx.fragment.app.n1();

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f11213d;

        /* renamed from: e, reason: collision with root package name */
        public final int f11214e;

        public LaunchedFragmentInfo(java.lang.String str, int i17) {
            this.f11213d = str;
            this.f11214e = i17;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f11213d);
            parcel.writeInt(this.f11214e);
        }

        public LaunchedFragmentInfo(android.os.Parcel parcel) {
            this.f11213d = parcel.readString();
            this.f11214e = parcel.readInt();
        }
    }

    public void popBackStack(int i17, int i18) {
        if (i17 >= 0) {
            enqueueAction(new androidx.fragment.app.r1(this, null, i17, i18), false);
        } else {
            throw new java.lang.IllegalArgumentException("Bad id: " + i17);
        }
    }

    public boolean popBackStackImmediate(int i17, int i18) {
        if (i17 >= 0) {
            return n(null, i17, i18);
        }
        throw new java.lang.IllegalArgumentException("Bad id: " + i17);
    }

    public void moveToState(androidx.fragment.app.Fragment fragment) {
        moveToState(fragment, this.mCurState);
    }

    public void moveToState(int i17, boolean z17) {
        androidx.fragment.app.v0 v0Var;
        java.util.HashMap hashMap;
        if (this.mHost == null && i17 != -1) {
            throw new java.lang.IllegalStateException("No activity");
        }
        if (z17 || i17 != this.mCurState) {
            this.mCurState = i17;
            if (USE_STATE_MANAGER) {
                androidx.fragment.app.f2 f2Var = this.mFragmentStore;
                java.util.Iterator it = f2Var.f11312a.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashMap = f2Var.f11313b;
                    if (!hasNext) {
                        break;
                    }
                    androidx.fragment.app.d2 d2Var = (androidx.fragment.app.d2) hashMap.get(((androidx.fragment.app.Fragment) it.next()).mWho);
                    if (d2Var != null) {
                        d2Var.j();
                    }
                }
                for (androidx.fragment.app.d2 d2Var2 : hashMap.values()) {
                    if (d2Var2 != null) {
                        d2Var2.j();
                        androidx.fragment.app.Fragment fragment = d2Var2.f11304c;
                        if (fragment.mRemoving && !fragment.isInBackStack()) {
                            f2Var.h(d2Var2);
                        }
                    }
                }
            } else {
                java.util.Iterator it6 = this.mFragmentStore.f().iterator();
                while (it6.hasNext()) {
                    moveFragmentToExpectedState((androidx.fragment.app.Fragment) it6.next());
                }
                java.util.Iterator it7 = ((java.util.ArrayList) this.mFragmentStore.d()).iterator();
                while (it7.hasNext()) {
                    androidx.fragment.app.d2 d2Var3 = (androidx.fragment.app.d2) it7.next();
                    androidx.fragment.app.Fragment fragment2 = d2Var3.f11304c;
                    if (!fragment2.mIsNewlyAdded) {
                        moveFragmentToExpectedState(fragment2);
                    }
                    if (fragment2.mRemoving && !fragment2.isInBackStack()) {
                        this.mFragmentStore.h(d2Var3);
                    }
                }
            }
            q();
            if (this.mNeedMenuInvalidate && (v0Var = this.mHost) != null && this.mCurState == 7) {
                v0Var.l();
                this.mNeedMenuInvalidate = false;
            }
        }
    }
}
