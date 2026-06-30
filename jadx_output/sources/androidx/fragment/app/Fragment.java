package androidx.fragment.app;

/* loaded from: classes14.dex */
public class Fragment implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, androidx.lifecycle.y, androidx.lifecycle.m1, androidx.lifecycle.k, o4.g {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final java.lang.Object USE_DEFAULT_TRANSITION = new java.lang.Object();
    static final int VIEW_CREATED = 2;
    private byte _hellAccFlag_;
    boolean mAdded;
    androidx.fragment.app.d0 mAnimationInfo;
    android.os.Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;
    androidx.fragment.app.FragmentManager mChildFragmentManager;
    android.view.ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    private androidx.lifecycle.f1 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    androidx.fragment.app.FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    androidx.fragment.app.v0 mHost;
    boolean mInLayout;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private java.lang.Boolean mIsPrimaryNavigationFragment;
    android.view.LayoutInflater mLayoutInflater;
    androidx.lifecycle.b0 mLifecycleRegistry;
    androidx.lifecycle.n mMaxState;
    boolean mMenuVisible;
    private final java.util.concurrent.atomic.AtomicInteger mNextLocalRequestCode;
    private final java.util.ArrayList<androidx.fragment.app.f0> mOnPreAttachedListeners;
    androidx.fragment.app.Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    java.lang.Runnable mPostponedDurationRunnable;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    android.os.Bundle mSavedFragmentState;
    o4.f mSavedStateRegistryController;
    java.lang.Boolean mSavedUserVisibleHint;
    android.os.Bundle mSavedViewRegistryState;
    android.util.SparseArray<android.os.Parcelable> mSavedViewState;
    int mState;
    java.lang.String mTag;
    androidx.fragment.app.Fragment mTarget;
    int mTargetRequestCode;
    java.lang.String mTargetWho;
    boolean mUserVisibleHint;
    android.view.View mView;
    androidx.fragment.app.c3 mViewLifecycleOwner;
    androidx.lifecycle.j0 mViewLifecycleOwnerLiveData;
    java.lang.String mWho;

    public Fragment() {
        this.mState = -1;
        this.mWho = java.util.UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new androidx.fragment.app.FragmentManagerImpl();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new androidx.fragment.app.v(this);
        this.mMaxState = androidx.lifecycle.n.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.j0();
        this.mNextLocalRequestCode = new java.util.concurrent.atomic.AtomicInteger();
        this.mOnPreAttachedListeners = new java.util.ArrayList<>();
        initLifecycle();
    }

    private androidx.fragment.app.d0 ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new androidx.fragment.app.d0();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        androidx.lifecycle.n nVar = this.mMaxState;
        return (nVar == androidx.lifecycle.n.INITIALIZED || this.mParentFragment == null) ? nVar.ordinal() : java.lang.Math.min(nVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.b0(this, true);
        this.mSavedStateRegistryController = new o4.f(this, null);
        this.mDefaultFactory = null;
    }

    @java.lang.Deprecated
    public static androidx.fragment.app.Fragment instantiate(android.content.Context context, java.lang.String str) {
        return instantiate(context, str, null);
    }

    private <I, O> androidx.activity.result.c prepareCallInternal(h.b bVar, r.a aVar, androidx.activity.result.b bVar2) {
        if (this.mState <= 1) {
            java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            registerOnPreAttachListener(new androidx.fragment.app.b0(this, aVar, atomicReference, bVar, bVar2));
            return new androidx.fragment.app.c0(this, atomicReference, bVar);
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(androidx.fragment.app.f0 f0Var) {
        if (this.mState >= 0) {
            f0Var.a();
        } else {
            this.mOnPreAttachedListeners.add(f0Var);
        }
    }

    public void callStartTransitionListener(boolean z17) {
        android.view.ViewGroup viewGroup;
        androidx.fragment.app.FragmentManager fragmentManager;
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        java.lang.Object obj = null;
        if (d0Var != null) {
            d0Var.f11298u = false;
            java.lang.Object obj2 = d0Var.f11299v;
            d0Var.f11299v = null;
            obj = obj2;
        }
        if (obj != null) {
            androidx.fragment.app.s1 s1Var = (androidx.fragment.app.s1) obj;
            int i17 = s1Var.f11473c - 1;
            s1Var.f11473c = i17;
            if (i17 != 0) {
                return;
            }
            s1Var.f11472b.f11249r.scheduleCommit();
            return;
        }
        if (!androidx.fragment.app.FragmentManager.USE_STATE_MANAGER || this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        androidx.fragment.app.n3 f17 = androidx.fragment.app.n3.f(viewGroup, fragmentManager);
        f17.h();
        if (z17) {
            this.mHost.f11495f.post(new androidx.fragment.app.x(this, f17));
        } else {
            f17.c();
        }
    }

    public androidx.fragment.app.s0 createFragmentContainer() {
        return new androidx.fragment.app.y(this);
    }

    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(java.lang.Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(java.lang.Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        androidx.fragment.app.Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            a4.b.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.dump(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    public androidx.fragment.app.Fragment findFragmentByWho(java.lang.String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.findFragmentByWho(str);
    }

    public java.lang.String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public boolean getAllowEnterTransitionOverlap() {
        java.lang.Boolean bool;
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null || (bool = d0Var.f11295r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        java.lang.Boolean bool;
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null || (bool = d0Var.f11294q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public android.view.View getAnimatingAway() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f11278a;
    }

    public android.animation.Animator getAnimator() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f11279b;
    }

    public final android.os.Bundle getArguments() {
        return this.mArguments;
    }

    public final androidx.fragment.app.FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public android.content.Context getContext() {
        androidx.fragment.app.v0 v0Var = this.mHost;
        if (v0Var == null) {
            return null;
        }
        return v0Var.f11494e;
    }

    @Override // androidx.lifecycle.k
    public androidx.lifecycle.f1 getDefaultViewModelProviderFactory() {
        android.app.Application application;
        if (this.mFragmentManager == null) {
            throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            android.content.Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof android.content.ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof android.app.Application) {
                    application = (android.app.Application) applicationContext;
                    break;
                }
                applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                java.util.Objects.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new androidx.lifecycle.x0(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return 0;
        }
        return d0Var.f11281d;
    }

    public java.lang.Object getEnterTransition() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f11288k;
    }

    public z2.z1 getEnterTransitionCallback() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return null;
        }
        d0Var.getClass();
        return null;
    }

    public int getExitAnim() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return 0;
        }
        return d0Var.f11282e;
    }

    public java.lang.Object getExitTransition() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f11290m;
    }

    public z2.z1 getExitTransitionCallback() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return null;
        }
        d0Var.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public android.view.View getFocusedView() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f11297t;
    }

    @java.lang.Deprecated
    public final androidx.fragment.app.FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final java.lang.Object getHost() {
        androidx.fragment.app.v0 v0Var = this.mHost;
        if (v0Var == null) {
            return null;
        }
        return v0Var.e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final android.view.LayoutInflater getLayoutInflater() {
        android.view.LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @java.lang.Deprecated
    public a4.b getLoaderManager() {
        return a4.b.b(this);
    }

    public int getNextTransition() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return 0;
        }
        return d0Var.f11285h;
    }

    public final androidx.fragment.app.Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final androidx.fragment.app.FragmentManager getParentFragmentManager() {
        androidx.fragment.app.FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return false;
        }
        return d0Var.f11280c;
    }

    public int getPopEnterAnim() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return 0;
        }
        return d0Var.f11283f;
    }

    public int getPopExitAnim() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return 0;
        }
        return d0Var.f11284g;
    }

    public float getPostOnViewCreatedAlpha() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return 1.0f;
        }
        return d0Var.f11296s;
    }

    public java.lang.Object getReenterTransition() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return null;
        }
        java.lang.Object obj = d0Var.f11291n;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final android.content.res.Resources getResources() {
        return requireContext().getResources();
    }

    @java.lang.Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public java.lang.Object getReturnTransition() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return null;
        }
        java.lang.Object obj = d0Var.f11289l;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // o4.g
    public final o4.b getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f342809b;
    }

    public java.lang.Object getSharedElementEnterTransition() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f11292o;
    }

    public java.lang.Object getSharedElementReturnTransition() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return null;
        }
        java.lang.Object obj = d0Var.f11293p;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public java.util.ArrayList<java.lang.String> getSharedElementSourceNames() {
        java.util.ArrayList<java.lang.String> arrayList;
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        return (d0Var == null || (arrayList = d0Var.f11286i) == null) ? new java.util.ArrayList<>() : arrayList;
    }

    public java.util.ArrayList<java.lang.String> getSharedElementTargetNames() {
        java.util.ArrayList<java.lang.String> arrayList;
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        return (d0Var == null || (arrayList = d0Var.f11287j) == null) ? new java.util.ArrayList<>() : arrayList;
    }

    public final java.lang.String getString(int i17) {
        return getResources().getString(i17);
    }

    public final java.lang.String getTag() {
        return this.mTag;
    }

    @java.lang.Deprecated
    public final androidx.fragment.app.Fragment getTargetFragment() {
        java.lang.String str;
        androidx.fragment.app.Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        androidx.fragment.app.FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.findActiveFragment(str);
    }

    @java.lang.Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final java.lang.CharSequence getText(int i17) {
        return getResources().getText(i17);
    }

    @java.lang.Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public android.view.View getView() {
        return this.mView;
    }

    public androidx.lifecycle.y getViewLifecycleOwner() {
        androidx.fragment.app.c3 c3Var = this.mViewLifecycleOwner;
        if (c3Var != null) {
            return c3Var;
        }
        throw new java.lang.IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public androidx.lifecycle.g0 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.m1
    /* renamed from: getViewModelStore */
    public androidx.lifecycle.l1 getViewModel() {
        if (this.mFragmentManager == null) {
            throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() != androidx.lifecycle.n.INITIALIZED.ordinal()) {
            return this.mFragmentManager.getViewModelStore(this);
        }
        throw new java.lang.IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public android.app.Activity getWxaLiteAppActivity() {
        return getActivity();
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initState() {
        initLifecycle();
        this.mWho = java.util.UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new androidx.fragment.app.FragmentManagerImpl();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public boolean isHideReplaced() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return false;
        }
        return d0Var.f11300w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        androidx.fragment.app.FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.isParentMenuVisible(this.mParentFragment));
    }

    public boolean isPostponed() {
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        if (d0Var == null) {
            return false;
        }
        return d0Var.f11298u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isRemovingParent() {
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        androidx.fragment.app.FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.isStateSaved();
    }

    public final boolean isVisible() {
        android.view.View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.noteStateNotSaved();
    }

    @java.lang.Deprecated
    public void onActivityCreated(android.os.Bundle bundle) {
        this.mCalled = true;
    }

    @java.lang.Deprecated
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            toString();
            java.util.Objects.toString(intent);
        }
    }

    public void onAttach(android.content.Context context) {
        this.mCalled = true;
        androidx.fragment.app.v0 v0Var = this.mHost;
        android.app.Activity activity = v0Var == null ? null : v0Var.f11493d;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @java.lang.Deprecated
    public void onAttachFragment(androidx.fragment.app.Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(android.view.MenuItem menuItem) {
        return false;
    }

    public void onCreate(android.os.Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.isStateAtLeast(1)) {
            return;
        }
        this.mChildFragmentManager.dispatchCreate();
    }

    public android.view.animation.Animation onCreateAnimation(int i17, boolean z17, int i18) {
        return null;
    }

    public android.animation.Animator onCreateAnimator(int i17, boolean z17, int i18) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
    }

    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        int i17 = this.mContentLayoutId;
        if (i17 != 0) {
            return layoutInflater.inflate(i17, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z17) {
    }

    public void onInflate(android.content.Context context, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        this.mCalled = true;
        androidx.fragment.app.v0 v0Var = this.mHost;
        android.app.Activity activity = v0Var == null ? null : v0Var.f11493d;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z17) {
    }

    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(android.view.Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z17) {
    }

    public void onPrepareOptionsMenu(android.view.Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z17) {
    }

    @java.lang.Deprecated
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
    }

    public void onViewStateRestored(android.os.Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(android.os.Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.dispatchActivityCreated();
        } else {
            throw new androidx.fragment.app.p3("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public void performAttach() {
        java.util.Iterator<androidx.fragment.app.f0> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.attachController(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f11494e);
        if (this.mCalled) {
            this.mFragmentManager.dispatchOnAttachFragment(this);
            this.mChildFragmentManager.dispatchAttach();
        } else {
            throw new androidx.fragment.app.p3("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public void performConfigurationChanged(android.content.res.Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.dispatchConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(android.view.MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.dispatchContextItemSelected(menuItem);
    }

    public void performCreate(android.os.Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new androidx.lifecycle.v() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.v
            public void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
                android.view.View view;
                if (mVar != androidx.lifecycle.m.ON_STOP || (view = androidx.fragment.app.Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.a(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.f(androidx.lifecycle.m.ON_CREATE);
            return;
        }
        throw new androidx.fragment.app.p3("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        boolean z17 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z17 = true;
        }
        return z17 | this.mChildFragmentManager.dispatchCreateOptionsMenu(menu, menuInflater);
    }

    public void performCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new androidx.fragment.app.c3();
        android.view.View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.f11271d != null) {
                throw new java.lang.IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.b();
            this.mView.setTag(com.tencent.mm.R.id.p28, this.mViewLifecycleOwner);
            this.mView.setTag(com.tencent.mm.R.id.p2_, this);
            o4.j.b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void performDestroy() {
        this.mChildFragmentManager.dispatchDestroy();
        this.mLifecycleRegistry.f(androidx.lifecycle.m.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new androidx.fragment.app.p3("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void performDestroyView() {
        this.mChildFragmentManager.dispatchDestroyView();
        if (this.mView != null) {
            androidx.fragment.app.c3 c3Var = this.mViewLifecycleOwner;
            c3Var.b();
            if (c3Var.f11271d.f11605c.a(androidx.lifecycle.n.CREATED)) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.m.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new androidx.fragment.app.p3("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        x.o oVar = ((a4.g) a4.b.b(this)).f1168b.f1165d;
        int h17 = oVar.h();
        for (int i17 = 0; i17 < h17; i17++) {
            ((a4.c) oVar.i(i17)).b();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new androidx.fragment.app.p3("Fragment " + this + " did not call through to super.onDetach()");
        }
        if (this.mChildFragmentManager.isDestroyed()) {
            return;
        }
        this.mChildFragmentManager.dispatchDestroy();
        this.mChildFragmentManager = new androidx.fragment.app.FragmentManagerImpl();
    }

    public android.view.LayoutInflater performGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.dispatchLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z17) {
        onMultiWindowModeChanged(z17);
        this.mChildFragmentManager.dispatchMultiWindowModeChanged(z17);
    }

    public boolean performOptionsItemSelected(android.view.MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.dispatchOptionsItemSelected(menuItem);
    }

    public void performOptionsMenuClosed(android.view.Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.dispatchOptionsMenuClosed(menu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void performPause() {
        this.mChildFragmentManager.dispatchPause();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.m.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(androidx.lifecycle.m.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new androidx.fragment.app.p3("Fragment " + this + " did not call through to super.onPause()");
    }

    public void performPictureInPictureModeChanged(boolean z17) {
        onPictureInPictureModeChanged(z17);
        this.mChildFragmentManager.dispatchPictureInPictureModeChanged(z17);
    }

    public boolean performPrepareOptionsMenu(android.view.Menu menu) {
        boolean z17 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z17 = true;
        }
        return z17 | this.mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean isPrimaryNavigation = this.mFragmentManager.isPrimaryNavigation(this);
        java.lang.Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != isPrimaryNavigation) {
            this.mIsPrimaryNavigationFragment = java.lang.Boolean.valueOf(isPrimaryNavigation);
            onPrimaryNavigationFragmentChanged(isPrimaryNavigation);
            this.mChildFragmentManager.dispatchPrimaryNavigationFragmentChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void performResume() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new androidx.fragment.app.p3("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.b0 b0Var = this.mLifecycleRegistry;
        androidx.lifecycle.m mVar = androidx.lifecycle.m.ON_RESUME;
        b0Var.f(mVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(mVar);
        }
        this.mChildFragmentManager.dispatchResume();
    }

    public void performSaveInstanceState(android.os.Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.b(bundle);
        android.os.Parcelable saveAllState = this.mChildFragmentManager.saveAllState();
        if (saveAllState != null) {
            bundle.putParcelable("android:support:fragments", saveAllState);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new androidx.fragment.app.p3("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.b0 b0Var = this.mLifecycleRegistry;
        androidx.lifecycle.m mVar = androidx.lifecycle.m.ON_START;
        b0Var.f(mVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(mVar);
        }
        this.mChildFragmentManager.dispatchStart();
    }

    public void performStop() {
        this.mChildFragmentManager.dispatchStop();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.m.ON_STOP);
        }
        this.mLifecycleRegistry.f(androidx.lifecycle.m.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new androidx.fragment.app.p3("Fragment " + this + " did not call through to super.onStop()");
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.dispatchViewCreated();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f11298u = true;
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(h.b bVar, androidx.activity.result.b bVar2) {
        return prepareCallInternal(bVar, new androidx.fragment.app.z(this), bVar2);
    }

    public void registerForContextMenu(android.view.View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @java.lang.Deprecated
    public final void requestPermissions(java.lang.String[] strArr, int i17) {
        if (this.mHost != null) {
            getParentFragmentManager().launchRequestPermissions(this, strArr, i17);
            return;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final androidx.fragment.app.FragmentActivity requireActivity() {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final android.os.Bundle requireArguments() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final android.content.Context requireContext() {
        android.content.Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @java.lang.Deprecated
    public final androidx.fragment.app.FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final java.lang.Object requireHost() {
        java.lang.Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final androidx.fragment.app.Fragment requireParentFragment() {
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new java.lang.IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final android.view.View requireView() {
        android.view.View view = getView();
        if (view != null) {
            return view;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.restoreSaveState(parcelable);
        this.mChildFragmentManager.dispatchCreate();
    }

    public final void restoreViewState(android.os.Bundle bundle) {
        android.util.SparseArray<android.os.Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.f11272e.a(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.m.ON_CREATE);
            }
        } else {
            throw new androidx.fragment.app.p3("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z17) {
        ensureAnimationInfo().f11295r = java.lang.Boolean.valueOf(z17);
    }

    public void setAllowReturnTransitionOverlap(boolean z17) {
        ensureAnimationInfo().f11294q = java.lang.Boolean.valueOf(z17);
    }

    public void setAnimatingAway(android.view.View view) {
        ensureAnimationInfo().f11278a = view;
    }

    public void setAnimations(int i17, int i18, int i19, int i27) {
        if (this.mAnimationInfo == null && i17 == 0 && i18 == 0 && i19 == 0 && i27 == 0) {
            return;
        }
        ensureAnimationInfo().f11281d = i17;
        ensureAnimationInfo().f11282e = i18;
        ensureAnimationInfo().f11283f = i19;
        ensureAnimationInfo().f11284g = i27;
    }

    public void setAnimator(android.animation.Animator animator) {
        ensureAnimationInfo().f11279b = animator;
    }

    public void setArguments(android.os.Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new java.lang.IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(z2.z1 z1Var) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(java.lang.Object obj) {
        ensureAnimationInfo().f11288k = obj;
    }

    public void setExitSharedElementCallback(z2.z1 z1Var) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(java.lang.Object obj) {
        ensureAnimationInfo().f11290m = obj;
    }

    public void setFocusedView(android.view.View view) {
        ensureAnimationInfo().f11297t = view;
    }

    public void setHasOptionsMenu(boolean z17) {
        if (this.mHasMenu != z17) {
            this.mHasMenu = z17;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.l();
        }
    }

    public void setHideReplaced(boolean z17) {
        ensureAnimationInfo().f11300w = z17;
    }

    public void setInitialSavedState(androidx.fragment.app.Fragment.SavedState savedState) {
        android.os.Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new java.lang.IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f11205d) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z17) {
        if (this.mMenuVisible != z17) {
            this.mMenuVisible = z17;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.l();
            }
        }
    }

    public void setNextTransition(int i17) {
        if (this.mAnimationInfo == null && i17 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f11285h = i17;
    }

    public void setOnStartEnterTransitionListener(androidx.fragment.app.g0 g0Var) {
        ensureAnimationInfo();
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        androidx.fragment.app.g0 g0Var2 = d0Var.f11299v;
        if (g0Var == g0Var2) {
            return;
        }
        if (g0Var != null && g0Var2 != null) {
            throw new java.lang.IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (d0Var.f11298u) {
            d0Var.f11299v = g0Var;
        }
        if (g0Var != null) {
            ((androidx.fragment.app.s1) g0Var).f11473c++;
        }
    }

    public void setPopDirection(boolean z17) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f11280c = z17;
    }

    public void setPostOnViewCreatedAlpha(float f17) {
        ensureAnimationInfo().f11296s = f17;
    }

    public void setReenterTransition(java.lang.Object obj) {
        ensureAnimationInfo().f11291n = obj;
    }

    @java.lang.Deprecated
    public void setRetainInstance(boolean z17) {
        this.mRetainInstance = z17;
        androidx.fragment.app.FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z17) {
            fragmentManager.addRetainedFragment(this);
        } else {
            fragmentManager.removeRetainedFragment(this);
        }
    }

    public void setReturnTransition(java.lang.Object obj) {
        ensureAnimationInfo().f11289l = obj;
    }

    public void setSharedElementEnterTransition(java.lang.Object obj) {
        ensureAnimationInfo().f11292o = obj;
    }

    public void setSharedElementNames(java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.String> arrayList2) {
        ensureAnimationInfo();
        androidx.fragment.app.d0 d0Var = this.mAnimationInfo;
        d0Var.f11286i = arrayList;
        d0Var.f11287j = arrayList2;
    }

    public void setSharedElementReturnTransition(java.lang.Object obj) {
        ensureAnimationInfo().f11293p = obj;
    }

    @java.lang.Deprecated
    public void setTargetFragment(androidx.fragment.app.Fragment fragment, int i17) {
        androidx.fragment.app.FragmentManager fragmentManager = this.mFragmentManager;
        androidx.fragment.app.FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new java.lang.IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (androidx.fragment.app.Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment()) {
            if (fragment2.equals(this)) {
                throw new java.lang.IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i17;
    }

    @java.lang.Deprecated
    public void setUserVisibleHint(boolean z17) {
        if (!this.mUserVisibleHint && z17 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            androidx.fragment.app.FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.performPendingDeferredStart(fragmentManager.createOrGetFragmentStateManager(this));
        }
        this.mUserVisibleHint = z17;
        this.mDeferStart = this.mState < 5 && !z17;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = java.lang.Boolean.valueOf(z17);
        }
    }

    public boolean shouldShowRequestPermissionRationale(java.lang.String str) {
        androidx.fragment.app.v0 v0Var = this.mHost;
        if (v0Var != null) {
            return v0Var.i(str);
        }
        return false;
    }

    public void startActivity(android.content.Intent intent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(null);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "androidx/fragment/app/Fragment", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
        yj0.a.f(this, "androidx/fragment/app/Fragment", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
    }

    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent intent, int i17) {
        startActivityForResult(intent, i17, null);
    }

    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle) {
        if (this.mHost == null) {
            throw new java.lang.IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            toString();
            java.util.Objects.toString(intentSender);
            java.util.Objects.toString(intent);
            java.util.Objects.toString(bundle);
        }
        getParentFragmentManager().launchStartIntentSenderForResult(this, intentSender, i17, intent, i18, i19, i27, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f11298u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f11298u = false;
        } else if (android.os.Looper.myLooper() != this.mHost.f11495f.getLooper()) {
            this.mHost.f11495f.postAtFrontOfQueue(new androidx.fragment.app.w(this));
        } else {
            callStartTransitionListener(true);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        sb6.append(getClass().getSimpleName());
        sb6.append("{");
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb6.append("} (");
        sb6.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb6.append(" id=0x");
            sb6.append(java.lang.Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb6.append(" tag=");
            sb6.append(this.mTag);
        }
        sb6.append(")");
        return sb6.toString();
    }

    public void unregisterForContextMenu(android.view.View view) {
        view.setOnCreateContextMenuListener(null);
    }

    /* loaded from: classes13.dex */
    public static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.Fragment.SavedState> CREATOR = new androidx.fragment.app.h0();

        /* renamed from: d, reason: collision with root package name */
        public final android.os.Bundle f11205d;

        public SavedState(android.os.Bundle bundle) {
            this.f11205d = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeBundle(this.f11205d);
        }

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            android.os.Bundle readBundle = parcel.readBundle();
            this.f11205d = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    @java.lang.Deprecated
    public static androidx.fragment.app.Fragment instantiate(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        try {
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) androidx.fragment.app.u0.c(context.getClassLoader(), str).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (java.lang.IllegalAccessException e17) {
            throw new androidx.fragment.app.e0("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e17);
        } catch (java.lang.InstantiationException e18) {
            throw new androidx.fragment.app.e0("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e18);
        } catch (java.lang.NoSuchMethodException e19) {
            throw new androidx.fragment.app.e0("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e19);
        } catch (java.lang.reflect.InvocationTargetException e27) {
            throw new androidx.fragment.app.e0("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e27);
        }
    }

    @Override // ox5.l
    public final androidx.fragment.app.FragmentActivity m42getActivity() {
        androidx.fragment.app.v0 v0Var = this.mHost;
        if (v0Var == null) {
            return null;
        }
        return (androidx.fragment.app.FragmentActivity) v0Var.f11493d;
    }

    public final java.lang.String getString(int i17, java.lang.Object... objArr) {
        return getResources().getString(i17, objArr);
    }

    public final void postponeEnterTransition(long j17, java.util.concurrent.TimeUnit timeUnit) {
        android.os.Handler handler;
        ensureAnimationInfo().f11298u = true;
        androidx.fragment.app.FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.getHost().f11495f;
        } else {
            handler = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j17));
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(h.b bVar, androidx.activity.result.h hVar, androidx.activity.result.b bVar2) {
        return prepareCallInternal(bVar, new androidx.fragment.app.a0(this, hVar), bVar2);
    }

    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().launchStartActivityForResult(this, intent, i17, bundle);
            return;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @java.lang.Deprecated
    public android.view.LayoutInflater getLayoutInflater(android.os.Bundle bundle) {
        androidx.fragment.app.v0 v0Var = this.mHost;
        if (v0Var != null) {
            android.view.LayoutInflater f17 = v0Var.f();
            f17.setFactory2(this.mChildFragmentManager.getLayoutInflaterFactory());
            return f17;
        }
        throw new java.lang.IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @java.lang.Deprecated
    public void onAttach(android.app.Activity activity) {
        this.mCalled = true;
    }

    @java.lang.Deprecated
    public void onInflate(android.app.Activity activity, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        this.mCalled = true;
    }

    public void startActivity(android.content.Intent intent, android.os.Bundle bundle) {
        androidx.fragment.app.v0 v0Var = this.mHost;
        if (v0Var != null) {
            v0Var.j(this, intent, -1, bundle);
            return;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public Fragment(int i17) {
        this();
        this.mContentLayoutId = i17;
    }

    private void restoreViewState() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            toString();
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }
}
