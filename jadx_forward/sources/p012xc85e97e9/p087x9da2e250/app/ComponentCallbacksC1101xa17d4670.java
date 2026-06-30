package p012xc85e97e9.p087x9da2e250.app;

/* renamed from: androidx.fragment.app.Fragment */
/* loaded from: classes14.dex */
public class ComponentCallbacksC1101xa17d4670 implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, p012xc85e97e9.p093xedfae76a.y, p012xc85e97e9.p093xedfae76a.m1, p012xc85e97e9.p093xedfae76a.k, o4.g {

    /* renamed from: ACTIVITY_CREATED */
    static final int f3403x9e0b1598 = 4;

    /* renamed from: ATTACHED */
    static final int f3404x4ec26da4 = 0;

    /* renamed from: AWAITING_ENTER_EFFECTS */
    static final int f3405xf9c40628 = 6;

    /* renamed from: AWAITING_EXIT_EFFECTS */
    static final int f3406x5df4ad54 = 3;

    /* renamed from: CREATED */
    static final int f3407x681a0ac8 = 1;

    /* renamed from: INITIALIZING */
    static final int f3408x72462c4d = -1;

    /* renamed from: RESUMED */
    static final int f3409x6c36c9b7 = 7;

    /* renamed from: STARTED */
    static final int f3410xb9b6cc61 = 5;

    /* renamed from: USE_DEFAULT_TRANSITION */
    static final java.lang.Object f3411x3ed0fc0b = new java.lang.Object();

    /* renamed from: VIEW_CREATED */
    static final int f3412x3a9b6f2e = 2;

    /* renamed from: _hellAccFlag_ */
    private byte f3413x7f11beae;

    /* renamed from: mAdded */
    boolean f3414xbdc32c93;

    /* renamed from: mAnimationInfo */
    p012xc85e97e9.p087x9da2e250.app.d0 f3415xd41a9ae5;

    /* renamed from: mArguments */
    android.os.Bundle f3416x163c369;

    /* renamed from: mBackStackNesting */
    int f3417xae473bf6;

    /* renamed from: mCalled */
    private boolean f3418xfde58e4a;

    /* renamed from: mChildFragmentManager */
    p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f3419xfdaae8e;

    /* renamed from: mContainer */
    android.view.ViewGroup f3420x62389694;

    /* renamed from: mContainerId */
    int f3421xb66d4acf;

    /* renamed from: mContentLayoutId */
    private int f3422x132d2151;

    /* renamed from: mDefaultFactory */
    private p012xc85e97e9.p093xedfae76a.f1 f3423x3d12a156;

    /* renamed from: mDeferStart */
    boolean f3424xd1bf805d;

    /* renamed from: mDetached */
    boolean f3425x634032ff;

    /* renamed from: mFragmentId */
    int f3426x9ca58fd8;

    /* renamed from: mFragmentManager */
    p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f3427xccc8bb10;

    /* renamed from: mFromLayout */
    boolean f3428x4fd80fc1;

    /* renamed from: mHasMenu */
    boolean f3429xc79ff1ec;

    /* renamed from: mHidden */
    boolean f3430x6dac477;

    /* renamed from: mHiddenChanged */
    boolean f3431xaf30923d;

    /* renamed from: mHost */
    p012xc85e97e9.p087x9da2e250.app.v0 f3432x6226bb5;

    /* renamed from: mInLayout */
    boolean f3433x2866c3c;

    /* renamed from: mIsCreated */
    boolean f3434x95771071;

    /* renamed from: mIsNewlyAdded */
    boolean f3435xfc98abaa;

    /* renamed from: mIsPrimaryNavigationFragment */
    private java.lang.Boolean f3436x6e54ab6f;

    /* renamed from: mLayoutInflater */
    android.view.LayoutInflater f3437xc4ee8e62;

    /* renamed from: mLifecycleRegistry */
    p012xc85e97e9.p093xedfae76a.b0 f3438xf011f8da;

    /* renamed from: mMaxState */
    p012xc85e97e9.p093xedfae76a.n f3439x3ca7951a;

    /* renamed from: mMenuVisible */
    boolean f3440x1ec28b66;

    /* renamed from: mNextLocalRequestCode */
    private final java.util.concurrent.atomic.AtomicInteger f3441x52bf01d1;

    /* renamed from: mOnPreAttachedListeners */
    private final java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.f0> f3442xbe5bdde4;

    /* renamed from: mParentFragment */
    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f3443x2ac50ee7;

    /* renamed from: mPerformedCreateView */
    boolean f3444x52044bf4;

    /* renamed from: mPostponedAlpha */
    float f3445x88c9013d;

    /* renamed from: mPostponedDurationRunnable */
    java.lang.Runnable f3446x5caa0f92;

    /* renamed from: mRemoving */
    boolean f3447x66cabce;

    /* renamed from: mRestored */
    boolean f3448x10ed2723;

    /* renamed from: mRetainInstance */
    boolean f3449xa8c71e87;

    /* renamed from: mRetainInstanceChangedWhileDetached */
    boolean f3450xe2089496;

    /* renamed from: mSavedFragmentState */
    android.os.Bundle f3451x806a1427;

    /* renamed from: mSavedStateRegistryController */
    o4.f f3452x10fa46b0;

    /* renamed from: mSavedUserVisibleHint */
    java.lang.Boolean f3453x2ddaffd4;

    /* renamed from: mSavedViewRegistryState */
    android.os.Bundle f3454x538b28b5;

    /* renamed from: mSavedViewState */
    android.util.SparseArray<android.os.Parcelable> f3455xaccd9bf2;

    /* renamed from: mState */
    int f3456xbec81024;

    /* renamed from: mTag */
    java.lang.String f3457x32d3ed;

    /* renamed from: mTarget */
    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f3458x1aea985e;

    /* renamed from: mTargetRequestCode */
    int f3459xc42ffdde;

    /* renamed from: mTargetWho */
    java.lang.String f3460x4a1a7680;

    /* renamed from: mUserVisibleHint */
    boolean f3461x4990e921;

    /* renamed from: mView */
    android.view.View f3462x628b0b2;

    /* renamed from: mViewLifecycleOwner */
    p012xc85e97e9.p087x9da2e250.app.c3 f3463xdf3b8abb;

    /* renamed from: mViewLifecycleOwnerLiveData */
    p012xc85e97e9.p093xedfae76a.j0 f3464xfe61c291;

    /* renamed from: mWho */
    java.lang.String f3465x32e011;

    public ComponentCallbacksC1101xa17d4670() {
        this.f3456xbec81024 = -1;
        this.f3465x32e011 = java.util.UUID.randomUUID().toString();
        this.f3460x4a1a7680 = null;
        this.f3436x6e54ab6f = null;
        this.f3419xfdaae8e = new p012xc85e97e9.p087x9da2e250.app.C1105xd50f42dd();
        this.f3440x1ec28b66 = true;
        this.f3461x4990e921 = true;
        this.f3446x5caa0f92 = new p012xc85e97e9.p087x9da2e250.app.v(this);
        this.f3439x3ca7951a = p012xc85e97e9.p093xedfae76a.n.RESUMED;
        this.f3464xfe61c291 = new p012xc85e97e9.p093xedfae76a.j0();
        this.f3441x52bf01d1 = new java.util.concurrent.atomic.AtomicInteger();
        this.f3442xbe5bdde4 = new java.util.ArrayList<>();
        m7419x4a94543a();
    }

    /* renamed from: ensureAnimationInfo */
    private p012xc85e97e9.p087x9da2e250.app.d0 m7417xb7c27ab4() {
        if (this.f3415xd41a9ae5 == null) {
            this.f3415xd41a9ae5 = new p012xc85e97e9.p087x9da2e250.app.d0();
        }
        return this.f3415xd41a9ae5;
    }

    /* renamed from: getMinimumMaxLifecycleState */
    private int m7418x7a09d0d3() {
        p012xc85e97e9.p093xedfae76a.n nVar = this.f3439x3ca7951a;
        return (nVar == p012xc85e97e9.p093xedfae76a.n.INITIALIZED || this.f3443x2ac50ee7 == null) ? nVar.ordinal() : java.lang.Math.min(nVar.ordinal(), this.f3443x2ac50ee7.m7418x7a09d0d3());
    }

    /* renamed from: initLifecycle */
    private void m7419x4a94543a() {
        this.f3438xf011f8da = new p012xc85e97e9.p093xedfae76a.b0(this, true);
        this.f3452x10fa46b0 = new o4.f(this, null);
        this.f3423x3d12a156 = null;
    }

    @java.lang.Deprecated
    /* renamed from: instantiate */
    public static p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7420x83a782ea(android.content.Context context, java.lang.String str) {
        return m7421x83a782ea(context, str, null);
    }

    /* renamed from: prepareCallInternal */
    private <I, O> p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c m7422xf0ca75e2(h.b bVar, r.a aVar, p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b bVar2) {
        if (this.f3456xbec81024 <= 1) {
            java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            m7423x9a33cbda(new p012xc85e97e9.p087x9da2e250.app.b0(this, aVar, atomicReference, bVar, bVar2));
            return new p012xc85e97e9.p087x9da2e250.app.c0(this, atomicReference, bVar);
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    /* renamed from: registerOnPreAttachListener */
    private void m7423x9a33cbda(p012xc85e97e9.p087x9da2e250.app.f0 f0Var) {
        if (this.f3456xbec81024 >= 0) {
            f0Var.a();
        } else {
            this.f3442xbe5bdde4.add(f0Var);
        }
    }

    /* renamed from: callStartTransitionListener */
    public void m7425x60b4f0ed(boolean z17) {
        android.view.ViewGroup viewGroup;
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d;
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        java.lang.Object obj = null;
        if (d0Var != null) {
            d0Var.f92831u = false;
            java.lang.Object obj2 = d0Var.f92832v;
            d0Var.f92832v = null;
            obj = obj2;
        }
        if (obj != null) {
            p012xc85e97e9.p087x9da2e250.app.s1 s1Var = (p012xc85e97e9.p087x9da2e250.app.s1) obj;
            int i17 = s1Var.f93006c - 1;
            s1Var.f93006c = i17;
            if (i17 != 0) {
                return;
            }
            s1Var.f93005b.f92782r.m7721xec221aae();
            return;
        }
        if (!p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.f3476xa4a928e7 || this.f3462x628b0b2 == null || (viewGroup = this.f3420x62389694) == null || (abstractC1104xc1ad431d = this.f3427xccc8bb10) == null) {
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.n3 f17 = p012xc85e97e9.p087x9da2e250.app.n3.f(viewGroup, abstractC1104xc1ad431d);
        f17.h();
        if (z17) {
            this.f3432x6226bb5.f93028f.post(new p012xc85e97e9.p087x9da2e250.app.x(this, f17));
        } else {
            f17.c();
        }
    }

    /* renamed from: createFragmentContainer */
    public p012xc85e97e9.p087x9da2e250.app.s0 mo7390x234f5a75() {
        return new p012xc85e97e9.p087x9da2e250.app.y(this);
    }

    /* renamed from: dump */
    public void mo7426x2f39f4(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(java.lang.Integer.toHexString(this.f3426x9ca58fd8));
        printWriter.print(" mContainerId=#");
        printWriter.print(java.lang.Integer.toHexString(this.f3421xb66d4acf));
        printWriter.print(" mTag=");
        printWriter.println(this.f3457x32d3ed);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f3456xbec81024);
        printWriter.print(" mWho=");
        printWriter.print(this.f3465x32e011);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f3417xae473bf6);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f3414xbdc32c93);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f3447x66cabce);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f3428x4fd80fc1);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f3433x2866c3c);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f3430x6dac477);
        printWriter.print(" mDetached=");
        printWriter.print(this.f3425x634032ff);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f3440x1ec28b66);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f3429xc79ff1ec);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f3449xa8c71e87);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f3461x4990e921);
        if (this.f3427xccc8bb10 != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f3427xccc8bb10);
        }
        if (this.f3432x6226bb5 != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f3432x6226bb5);
        }
        if (this.f3443x2ac50ee7 != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f3443x2ac50ee7);
        }
        if (this.f3416x163c369 != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f3416x163c369);
        }
        if (this.f3451x806a1427 != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f3451x806a1427);
        }
        if (this.f3455xaccd9bf2 != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f3455xaccd9bf2);
        }
        if (this.f3454x538b28b5 != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f3454x538b28b5);
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7470x2d5563f7 = m7470x2d5563f7();
        if (m7470x2d5563f7 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(m7470x2d5563f7);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f3459xc42ffdde);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(m7455x6c0812a4());
        if (m7439xcc408253() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(m7439xcc408253());
        }
        if (m7442xfd4b6dc5() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(m7442xfd4b6dc5());
        }
        if (m7456x723b1c2e() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(m7456x723b1c2e());
        }
        if (m7457x4cf8ac8a() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(m7457x4cf8ac8a());
        }
        if (this.f3420x62389694 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f3420x62389694);
        }
        if (this.f3462x628b0b2 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f3462x628b0b2);
        }
        if (m7434x34514fb6() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m7434x34514fb6());
        }
        if (mo7438x76847179() != null) {
            a4.b.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f3419xfdaae8e + ":");
        this.f3419xfdaae8e.m7658x2f39f4(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* renamed from: equals */
    public final boolean m7427xb2c87fbf(java.lang.Object obj) {
        return super.equals(obj);
    }

    /* renamed from: findFragmentByWho */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7428x7a44823e(java.lang.String str) {
        return str.equals(this.f3465x32e011) ? this : this.f3419xfdaae8e.m7666x7a44823e(str);
    }

    /* renamed from: generateActivityResultKey */
    public java.lang.String m7429xd2d5ddbe() {
        return "fragment_" + this.f3465x32e011 + "_rq#" + this.f3441x52bf01d1.getAndIncrement();
    }

    /* renamed from: getAllowEnterTransitionOverlap */
    public boolean m7432xe393aead() {
        java.lang.Boolean bool;
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null || (bool = d0Var.f92828r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: getAllowReturnTransitionOverlap */
    public boolean m7433x754b36cf() {
        java.lang.Boolean bool;
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null || (bool = d0Var.f92827q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: getAnimatingAway */
    public android.view.View m7434x34514fb6() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f92811a;
    }

    /* renamed from: getAnimator */
    public android.animation.Animator m7435x4c74685d() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f92812b;
    }

    /* renamed from: getArguments */
    public final android.os.Bundle m7436x8619eaa0() {
        return this.f3416x163c369;
    }

    /* renamed from: getChildFragmentManager */
    public final p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d m7437x54c0aef7() {
        if (this.f3432x6226bb5 != null) {
            return this.f3419xfdaae8e;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: getContext */
    public android.content.Context mo7438x76847179() {
        p012xc85e97e9.p087x9da2e250.app.v0 v0Var = this.f3432x6226bb5;
        if (v0Var == null) {
            return null;
        }
        return v0Var.f93027e;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k
    /* renamed from: getDefaultViewModelProviderFactory */
    public p012xc85e97e9.p093xedfae76a.f1 mo2508xff1f76e0() {
        android.app.Application application;
        if (this.f3427xccc8bb10 == null) {
            throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f3423x3d12a156 == null) {
            android.content.Context applicationContext = m7550xf0c4608a().getApplicationContext();
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
            if (application == null && p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3)) {
                java.util.Objects.toString(m7550xf0c4608a().getApplicationContext());
            }
            this.f3423x3d12a156 = new p012xc85e97e9.p093xedfae76a.x0(application, this, m7436x8619eaa0());
        }
        return this.f3423x3d12a156;
    }

    /* renamed from: getEnterAnim */
    public int m7439xcc408253() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return 0;
        }
        return d0Var.f92814d;
    }

    /* renamed from: getEnterTransition */
    public java.lang.Object m7440xdf997417() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f92821k;
    }

    /* renamed from: getEnterTransitionCallback */
    public z2.z1 m7441x84a1f17c() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return null;
        }
        d0Var.getClass();
        return null;
    }

    /* renamed from: getExitAnim */
    public int m7442xfd4b6dc5() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return 0;
        }
        return d0Var.f92815e;
    }

    /* renamed from: getExitTransition */
    public java.lang.Object m7443x880e8209() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f92823m;
    }

    /* renamed from: getExitTransitionCallback */
    public z2.z1 m7444x8a6aed6e() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return null;
        }
        d0Var.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: getFocusedView */
    public android.view.View m7445x5e9ded86() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f92830t;
    }

    @java.lang.Deprecated
    /* renamed from: getFragmentManager */
    public final p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d m7446xe17c5d07() {
        return this.f3427xccc8bb10;
    }

    /* renamed from: getHost */
    public final java.lang.Object m7447xfb805e1e() {
        p012xc85e97e9.p087x9da2e250.app.v0 v0Var = this.f3432x6226bb5;
        if (v0Var == null) {
            return null;
        }
        return v0Var.e();
    }

    /* renamed from: getId */
    public final int m7448x5db1b11() {
        return this.f3426x9ca58fd8;
    }

    /* renamed from: getLayoutInflater */
    public final android.view.LayoutInflater m7449xacd3518b() {
        android.view.LayoutInflater layoutInflater = this.f3437xc4ee8e62;
        return layoutInflater == null ? m7528xc17f382a(null) : layoutInflater;
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f3438xf011f8da;
    }

    @java.lang.Deprecated
    /* renamed from: getLoaderManager */
    public a4.b m7451xe04c8864() {
        return a4.b.b(this);
    }

    /* renamed from: getNextTransition */
    public int m7452x3889cd9e() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return 0;
        }
        return d0Var.f92818h;
    }

    /* renamed from: getParentFragment */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7453x12a9d210() {
        return this.f3443x2ac50ee7;
    }

    /* renamed from: getParentFragmentManager */
    public final p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d m7454x171a637d() {
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f3427xccc8bb10;
        if (abstractC1104xc1ad431d != null) {
            return abstractC1104xc1ad431d;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: getPopDirection */
    public boolean m7455x6c0812a4() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return false;
        }
        return d0Var.f92813c;
    }

    /* renamed from: getPopEnterAnim */
    public int m7456x723b1c2e() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return 0;
        }
        return d0Var.f92816f;
    }

    /* renamed from: getPopExitAnim */
    public int m7457x4cf8ac8a() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return 0;
        }
        return d0Var.f92817g;
    }

    /* renamed from: getPostOnViewCreatedAlpha */
    public float m7458x687aaa50() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return 1.0f;
        }
        return d0Var.f92829s;
    }

    /* renamed from: getReenterTransition */
    public java.lang.Object m7459x389d8f04() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return null;
        }
        java.lang.Object obj = d0Var.f92824n;
        return obj == f3411x3ed0fc0b ? m7443x880e8209() : obj;
    }

    /* renamed from: getResources */
    public final android.content.res.Resources m7460x893a2f6f() {
        return m7550xf0c4608a().getResources();
    }

    @java.lang.Deprecated
    /* renamed from: getRetainInstance */
    public final boolean m7461x90abe1b0() {
        return this.f3449xa8c71e87;
    }

    /* renamed from: getReturnTransition */
    public java.lang.Object m7462x602d321b() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return null;
        }
        java.lang.Object obj = d0Var.f92822l;
        return obj == f3411x3ed0fc0b ? m7440xdf997417() : obj;
    }

    @Override // o4.g
    /* renamed from: getSavedStateRegistry */
    public final o4.b mo2511xdf516e9d() {
        return this.f3452x10fa46b0.f424342b;
    }

    /* renamed from: getSharedElementEnterTransition */
    public java.lang.Object m7463x6eee98ec() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f92825o;
    }

    /* renamed from: getSharedElementReturnTransition */
    public java.lang.Object m7464xbb7ca7e6() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return null;
        }
        java.lang.Object obj = d0Var.f92826p;
        return obj == f3411x3ed0fc0b ? m7463x6eee98ec() : obj;
    }

    /* renamed from: getSharedElementSourceNames */
    public java.util.ArrayList<java.lang.String> m7465x8dbd760c() {
        java.util.ArrayList<java.lang.String> arrayList;
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        return (d0Var == null || (arrayList = d0Var.f92819i) == null) ? new java.util.ArrayList<>() : arrayList;
    }

    /* renamed from: getSharedElementTargetNames */
    public java.util.ArrayList<java.lang.String> m7466x1688e656() {
        java.util.ArrayList<java.lang.String> arrayList;
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        return (d0Var == null || (arrayList = d0Var.f92820j) == null) ? new java.util.ArrayList<>() : arrayList;
    }

    /* renamed from: getString */
    public final java.lang.String m7467x2fec8307(int i17) {
        return m7460x893a2f6f().getString(i17);
    }

    /* renamed from: getTag */
    public final java.lang.String m7469xb5887064() {
        return this.f3457x32d3ed;
    }

    @java.lang.Deprecated
    /* renamed from: getTargetFragment */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7470x2d5563f7() {
        java.lang.String str;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f3458x1aea985e;
        if (componentCallbacksC1101xa17d4670 != null) {
            return componentCallbacksC1101xa17d4670;
        }
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f3427xccc8bb10;
        if (abstractC1104xc1ad431d == null || (str = this.f3460x4a1a7680) == null) {
            return null;
        }
        return abstractC1104xc1ad431d.m7663x4cce298f(str);
    }

    @java.lang.Deprecated
    /* renamed from: getTargetRequestCode */
    public final int m7471x7a82fe15() {
        return this.f3459xc42ffdde;
    }

    /* renamed from: getText */
    public final java.lang.CharSequence m7472xfb85ada3(int i17) {
        return m7460x893a2f6f().getText(i17);
    }

    @java.lang.Deprecated
    /* renamed from: getUserVisibleHint */
    public boolean mo7473x5e448b18() {
        return this.f3461x4990e921;
    }

    /* renamed from: getView */
    public android.view.View m7474xfb86a31b() {
        return this.f3462x628b0b2;
    }

    /* renamed from: getViewLifecycleOwner */
    public p012xc85e97e9.p093xedfae76a.y m7475xf3489164() {
        p012xc85e97e9.p087x9da2e250.app.c3 c3Var = this.f3463xdf3b8abb;
        if (c3Var != null) {
            return c3Var;
        }
        throw new java.lang.IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    /* renamed from: getViewLifecycleOwnerLiveData */
    public p012xc85e97e9.p093xedfae76a.g0 m7476x3136103a() {
        return this.f3464xfe61c291;
    }

    @Override // p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore */
    public p012xc85e97e9.p093xedfae76a.l1 getViewModel() {
        if (this.f3427xccc8bb10 == null) {
            throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m7418x7a09d0d3() != p012xc85e97e9.p093xedfae76a.n.INITIALIZED.ordinal()) {
            return this.f3427xccc8bb10.m7682x119738b3(this);
        }
        throw new java.lang.IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    /* renamed from: getWxaLiteAppActivity */
    public android.app.Activity m7477x55ebd6f8() {
        return mo7430x19263085();
    }

    /* renamed from: hasOptionsMenu */
    public final boolean m7478xe5a0e223() {
        return this.f3429xc79ff1ec;
    }

    /* renamed from: hashCode */
    public final int m7479x8cdac1b() {
        return super.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: initState */
    public void m7480xeffb1961() {
        m7419x4a94543a();
        this.f3465x32e011 = java.util.UUID.randomUUID().toString();
        this.f3414xbdc32c93 = false;
        this.f3447x66cabce = false;
        this.f3428x4fd80fc1 = false;
        this.f3433x2866c3c = false;
        this.f3448x10ed2723 = false;
        this.f3417xae473bf6 = 0;
        this.f3427xccc8bb10 = null;
        this.f3419xfdaae8e = new p012xc85e97e9.p087x9da2e250.app.C1105xd50f42dd();
        this.f3432x6226bb5 = null;
        this.f3426x9ca58fd8 = 0;
        this.f3421xb66d4acf = 0;
        this.f3457x32d3ed = null;
        this.f3430x6dac477 = false;
        this.f3425x634032ff = false;
    }

    /* renamed from: isAdded */
    public final boolean m7481x7a6e8df6() {
        return this.f3432x6226bb5 != null && this.f3414xbdc32c93;
    }

    /* renamed from: isDetached */
    public final boolean m7482xefa32bc() {
        return this.f3425x634032ff;
    }

    /* renamed from: isHidden */
    public final boolean m7483xdf9b8f74() {
        return this.f3430x6dac477;
    }

    /* renamed from: isHideReplaced */
    public boolean m7484xda7b75dc() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return false;
        }
        return d0Var.f92833w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: isInBackStack */
    public final boolean m7485x7bae6eb2() {
        return this.f3417xae473bf6 > 0;
    }

    /* renamed from: isInLayout */
    public final boolean m7486xae406bf9() {
        return this.f3433x2866c3c;
    }

    /* renamed from: isMenuVisible */
    public final boolean m7487x20aa1689() {
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d;
        return this.f3440x1ec28b66 && ((abstractC1104xc1ad431d = this.f3427xccc8bb10) == null || abstractC1104xc1ad431d.m7687x46e5d6ff(this.f3443x2ac50ee7));
    }

    /* renamed from: isPostponed */
    public boolean m7488xbe8d7484() {
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        if (d0Var == null) {
            return false;
        }
        return d0Var.f92831u;
    }

    /* renamed from: isRemoving */
    public final boolean m7489xb226ab8b() {
        return this.f3447x66cabce;
    }

    /* renamed from: isRemovingParent */
    public final boolean m7490xe4c8c15() {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7453x12a9d210 = m7453x12a9d210();
        return m7453x12a9d210 != null && (m7453x12a9d210.m7489xb226ab8b() || m7453x12a9d210.m7490xe4c8c15());
    }

    /* renamed from: isResumed */
    public final boolean m7491x1edc854d() {
        return this.f3456xbec81024 >= 7;
    }

    /* renamed from: isStateSaved */
    public final boolean m7492x7328e940() {
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f3427xccc8bb10;
        if (abstractC1104xc1ad431d == null) {
            return false;
        }
        return abstractC1104xc1ad431d.m7690x7328e940();
    }

    /* renamed from: isVisible */
    public final boolean m7493xf94337e8() {
        android.view.View view;
        return (!m7481x7a6e8df6() || m7483xdf9b8f74() || (view = this.f3462x628b0b2) == null || view.getWindowToken() == null || this.f3462x628b0b2.getVisibility() != 0) ? false : true;
    }

    /* renamed from: noteStateNotSaved */
    public void m7494x18332053() {
        this.f3419xfdaae8e.m7698x18332053();
    }

    @java.lang.Deprecated
    /* renamed from: onActivityCreated */
    public void mo7495x78cb4fa(android.os.Bundle bundle) {
        this.f3418xfde58e4a = true;
    }

    @java.lang.Deprecated
    /* renamed from: onActivityResult */
    public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
            mo7591x9616526c();
            java.util.Objects.toString(intent);
        }
    }

    /* renamed from: onAttach */
    public void mo7397x3b13c504(android.content.Context context) {
        this.f3418xfde58e4a = true;
        p012xc85e97e9.p087x9da2e250.app.v0 v0Var = this.f3432x6226bb5;
        android.app.Activity activity = v0Var == null ? null : v0Var.f93026d;
        if (activity != null) {
            this.f3418xfde58e4a = false;
            mo7497x3b13c504(activity);
        }
    }

    @java.lang.Deprecated
    /* renamed from: onAttachFragment */
    public void m7498x140dc774(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.f3418xfde58e4a = true;
    }

    /* renamed from: onContextItemSelected */
    public boolean mo7499xc8f7e1be(android.view.MenuItem menuItem) {
        return false;
    }

    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        this.f3418xfde58e4a = true;
        m7555x2e999393(bundle);
        if (this.f3419xfdaae8e.m7689xb27faa6f(1)) {
            return;
        }
        this.f3419xfdaae8e.m7641x88790e16();
    }

    /* renamed from: onCreateAnimation */
    public android.view.animation.Animation mo7500x963e4609(int i17, boolean z17, int i18) {
        return null;
    }

    /* renamed from: onCreateAnimator */
    public android.animation.Animator mo7501x36651bc2(int i17, boolean z17, int i18) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        m7548xe6e42394().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    /* renamed from: onCreateOptionsMenu */
    public void mo7502xa71d2e62(android.view.Menu menu, android.view.MenuInflater menuInflater) {
    }

    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        int i17 = this.f3422x132d2151;
        if (i17 != 0) {
            return layoutInflater.inflate(i17, viewGroup, false);
        }
        return null;
    }

    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        this.f3418xfde58e4a = true;
    }

    /* renamed from: onDestroyOptionsMenu */
    public void m7505xd5b86902() {
    }

    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        this.f3418xfde58e4a = true;
    }

    /* renamed from: onDetach */
    public void mo7400x3f5eee52() {
        this.f3418xfde58e4a = true;
    }

    /* renamed from: onGetLayoutInflater */
    public android.view.LayoutInflater mo7402x3b271d6c(android.os.Bundle bundle) {
        return m7450xacd3518b(bundle);
    }

    /* renamed from: onHiddenChanged */
    public void mo7506x87316e0b(boolean z17) {
    }

    /* renamed from: onInflate */
    public void m7508xc3995328(android.content.Context context, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        this.f3418xfde58e4a = true;
        p012xc85e97e9.p087x9da2e250.app.v0 v0Var = this.f3432x6226bb5;
        android.app.Activity activity = v0Var == null ? null : v0Var.f93026d;
        if (activity != null) {
            this.f3418xfde58e4a = false;
            mo7507xc3995328(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f3418xfde58e4a = true;
    }

    /* renamed from: onMultiWindowModeChanged */
    public void mo7509xd5c30607(boolean z17) {
    }

    /* renamed from: onOptionsItemSelected */
    public boolean mo7510x25a2442d(android.view.MenuItem menuItem) {
        return false;
    }

    /* renamed from: onOptionsMenuClosed */
    public void m7511x709d20ca(android.view.Menu menu) {
    }

    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        this.f3418xfde58e4a = true;
    }

    /* renamed from: onPictureInPictureModeChanged */
    public void m7513xad990a77(boolean z17) {
    }

    /* renamed from: onPrepareOptionsMenu */
    public void mo7514x99b541d5(android.view.Menu menu) {
    }

    /* renamed from: onPrimaryNavigationFragmentChanged */
    public void m7515x61422fad(boolean z17) {
    }

    @java.lang.Deprecated
    /* renamed from: onRequestPermissionsResult */
    public void mo7516x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
    }

    /* renamed from: onResume */
    public void mo7517x57429eec() {
        this.f3418xfde58e4a = true;
    }

    /* renamed from: onSaveInstanceState */
    public void mo7404xa71a2260(android.os.Bundle bundle) {
    }

    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        this.f3418xfde58e4a = true;
    }

    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        this.f3418xfde58e4a = true;
    }

    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
    }

    /* renamed from: onViewStateRestored */
    public void mo7407xed07c83(android.os.Bundle bundle) {
        this.f3418xfde58e4a = true;
    }

    /* renamed from: performActivityCreated */
    public void m7519x3e086738(android.os.Bundle bundle) {
        this.f3419xfdaae8e.m7698x18332053();
        this.f3456xbec81024 = 3;
        this.f3418xfde58e4a = false;
        mo7495x78cb4fa(bundle);
        if (this.f3418xfde58e4a) {
            m7424x8e64c5fe();
            this.f3419xfdaae8e.m7637x1d9214ff();
        } else {
            throw new p012xc85e97e9.p087x9da2e250.app.p3("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    /* renamed from: performAttach */
    public void m7520x8d00f506() {
        java.util.Iterator<p012xc85e97e9.p087x9da2e250.app.f0> it = this.f3442xbe5bdde4.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f3442xbe5bdde4.clear();
        this.f3419xfdaae8e.m7628xfb41dbc1(this.f3432x6226bb5, mo7390x234f5a75(), this);
        this.f3456xbec81024 = 0;
        this.f3418xfde58e4a = false;
        mo7397x3b13c504(this.f3432x6226bb5.f93027e);
        if (this.f3418xfde58e4a) {
            this.f3427xccc8bb10.m7647x70b71c0e(this);
            this.f3419xfdaae8e.m7638x85325b5f();
        } else {
            throw new p012xc85e97e9.p087x9da2e250.app.p3("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* renamed from: performConfigurationChanged */
    public void m7521x17b1c5df(android.content.res.Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f3419xfdaae8e.m7639xfc09c78(configuration);
    }

    /* renamed from: performContextItemSelected */
    public boolean m7522x19b444fc(android.view.MenuItem menuItem) {
        if (this.f3430x6dac477) {
            return false;
        }
        if (mo7499xc8f7e1be(menuItem)) {
            return true;
        }
        return this.f3419xfdaae8e.m7640x9d93b743(menuItem);
    }

    /* renamed from: performCreate */
    public void m7523x9047a7bd(android.os.Bundle bundle) {
        this.f3419xfdaae8e.m7698x18332053();
        this.f3456xbec81024 = 1;
        this.f3418xfde58e4a = false;
        this.f3438xf011f8da.a(new p012xc85e97e9.p093xedfae76a.v() { // from class: androidx.fragment.app.Fragment.5
            @Override // p012xc85e97e9.p093xedfae76a.v
            /* renamed from: onStateChanged */
            public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
                android.view.View view;
                if (mVar != p012xc85e97e9.p093xedfae76a.m.ON_STOP || (view = p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.this.f3462x628b0b2) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.f3452x10fa46b0.a(bundle);
        mo7398x3e5a77bb(bundle);
        this.f3434x95771071 = true;
        if (this.f3418xfde58e4a) {
            this.f3438xf011f8da.f(p012xc85e97e9.p093xedfae76a.m.ON_CREATE);
            return;
        }
        throw new p012xc85e97e9.p087x9da2e250.app.p3("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* renamed from: performCreateOptionsMenu */
    public boolean m7524x2d754920(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        boolean z17 = false;
        if (this.f3430x6dac477) {
            return false;
        }
        if (this.f3429xc79ff1ec && this.f3440x1ec28b66) {
            mo7502xa71d2e62(menu, menuInflater);
            z17 = true;
        }
        return z17 | this.f3419xfdaae8e.m7642x514aa127(menu, menuInflater);
    }

    /* renamed from: performCreateView */
    public void mo7408x50ac3002(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.f3419xfdaae8e.m7698x18332053();
        this.f3444x52044bf4 = true;
        this.f3463xdf3b8abb = new p012xc85e97e9.p087x9da2e250.app.c3();
        android.view.View mo7503x18bad100 = mo7503x18bad100(layoutInflater, viewGroup, bundle);
        this.f3462x628b0b2 = mo7503x18bad100;
        if (mo7503x18bad100 == null) {
            if (this.f3463xdf3b8abb.f92804d != null) {
                throw new java.lang.IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f3463xdf3b8abb = null;
        } else {
            this.f3463xdf3b8abb.b();
            this.f3462x628b0b2.setTag(com.p314xaae8f345.mm.R.id.p28, this.f3463xdf3b8abb);
            this.f3462x628b0b2.setTag(com.p314xaae8f345.mm.R.id.p2_, this);
            o4.j.b(this.f3462x628b0b2, this.f3463xdf3b8abb);
            this.f3464xfe61c291.mo523x53d8522f(this.f3463xdf3b8abb);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: performDestroy */
    public void m7525x98327159() {
        this.f3419xfdaae8e.m7643xa62dd620();
        this.f3438xf011f8da.f(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
        this.f3456xbec81024 = 0;
        this.f3418xfde58e4a = false;
        this.f3434x95771071 = false;
        mo7504xac79a11b();
        if (this.f3418xfde58e4a) {
            return;
        }
        throw new p012xc85e97e9.p087x9da2e250.app.p3("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* renamed from: performDestroyView */
    public void m7526x6ca0cb9e() {
        this.f3419xfdaae8e.m7644x913e74e5();
        if (this.f3462x628b0b2 != null) {
            p012xc85e97e9.p087x9da2e250.app.c3 c3Var = this.f3463xdf3b8abb;
            c3Var.b();
            if (c3Var.f92804d.f93138c.a(p012xc85e97e9.p093xedfae76a.n.CREATED)) {
                this.f3463xdf3b8abb.a(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
            }
        }
        this.f3456xbec81024 = 1;
        this.f3418xfde58e4a = false;
        mo7399xa6664a60();
        if (!this.f3418xfde58e4a) {
            throw new p012xc85e97e9.p087x9da2e250.app.p3("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        x.o oVar = ((a4.g) a4.b.b(this)).f82701b.f82698d;
        int h17 = oVar.h();
        for (int i17 = 0; i17 < h17; i17++) {
            ((a4.c) oVar.i(i17)).b();
        }
        this.f3444x52044bf4 = false;
    }

    /* renamed from: performDetach */
    public void m7527x914c1e54() {
        this.f3456xbec81024 = -1;
        this.f3418xfde58e4a = false;
        mo7400x3f5eee52();
        this.f3437xc4ee8e62 = null;
        if (!this.f3418xfde58e4a) {
            throw new p012xc85e97e9.p087x9da2e250.app.p3("Fragment " + this + " did not call through to super.onDetach()");
        }
        if (this.f3419xfdaae8e.m7686xbca8d80f()) {
            return;
        }
        this.f3419xfdaae8e.m7643xa62dd620();
        this.f3419xfdaae8e = new p012xc85e97e9.p087x9da2e250.app.C1105xd50f42dd();
    }

    /* renamed from: performGetLayoutInflater */
    public android.view.LayoutInflater m7528xc17f382a(android.os.Bundle bundle) {
        android.view.LayoutInflater mo7402x3b271d6c = mo7402x3b271d6c(bundle);
        this.f3437xc4ee8e62 = mo7402x3b271d6c;
        return mo7402x3b271d6c;
    }

    /* renamed from: performLowMemory */
    public void m7529x969e7314() {
        onLowMemory();
        this.f3419xfdaae8e.m7645x1353c21b();
    }

    /* renamed from: performMultiWindowModeChanged */
    public void m7530x28a3f209(boolean z17) {
        mo7509xd5c30607(z17);
        this.f3419xfdaae8e.m7646x58578662(z17);
    }

    /* renamed from: performOptionsItemSelected */
    public boolean m7531x765ea76b(android.view.MenuItem menuItem) {
        if (this.f3430x6dac477) {
            return false;
        }
        if (this.f3429xc79ff1ec && this.f3440x1ec28b66 && mo7510x25a2442d(menuItem)) {
            return true;
        }
        return this.f3419xfdaae8e.m7648xfa3e19b2(menuItem);
    }

    /* renamed from: performOptionsMenuClosed */
    public void m7532xf6f53b88(android.view.Menu menu) {
        if (this.f3430x6dac477) {
            return;
        }
        if (this.f3429xc79ff1ec && this.f3440x1ec28b66) {
            m7511x709d20ca(menu);
        }
        this.f3419xfdaae8e.m7649x1aca938f(menu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: performPause */
    public void m7533x4fa9c315() {
        this.f3419xfdaae8e.m7650x80f5ad9c();
        if (this.f3462x628b0b2 != null) {
            this.f3463xdf3b8abb.a(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
        }
        this.f3438xf011f8da.f(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
        this.f3456xbec81024 = 6;
        this.f3418xfde58e4a = false;
        mo7512xb01dfb57();
        if (this.f3418xfde58e4a) {
            return;
        }
        throw new p012xc85e97e9.p087x9da2e250.app.p3("Fragment " + this + " did not call through to super.onPause()");
    }

    /* renamed from: performPictureInPictureModeChanged */
    public void m7534xe1d54fb5(boolean z17) {
        m7513xad990a77(z17);
        this.f3419xfdaae8e.m7651xaf1d8afc(z17);
    }

    /* renamed from: performPrepareOptionsMenu */
    public boolean m7535xde607ed7(android.view.Menu menu) {
        boolean z17 = false;
        if (this.f3430x6dac477) {
            return false;
        }
        if (this.f3429xc79ff1ec && this.f3440x1ec28b66) {
            mo7514x99b541d5(menu);
            z17 = true;
        }
        return z17 | this.f3419xfdaae8e.m7652x353627b0(menu);
    }

    /* renamed from: performPrimaryNavigationFragmentChanged */
    public void m7536x9ab5812f() {
        boolean m7688x6993c5ac = this.f3427xccc8bb10.m7688x6993c5ac(this);
        java.lang.Boolean bool = this.f3436x6e54ab6f;
        if (bool == null || bool.booleanValue() != m7688x6993c5ac) {
            this.f3436x6e54ab6f = java.lang.Boolean.valueOf(m7688x6993c5ac);
            m7515x61422fad(m7688x6993c5ac);
            this.f3419xfdaae8e.m7653x1823a48();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: performResume */
    public void m7537xa92fceee() {
        this.f3419xfdaae8e.m7698x18332053();
        this.f3419xfdaae8e.m7660x13596257(true);
        this.f3456xbec81024 = 7;
        this.f3418xfde58e4a = false;
        mo7517x57429eec();
        if (!this.f3418xfde58e4a) {
            throw new p012xc85e97e9.p087x9da2e250.app.p3("Fragment " + this + " did not call through to super.onResume()");
        }
        p012xc85e97e9.p093xedfae76a.b0 b0Var = this.f3438xf011f8da;
        p012xc85e97e9.p093xedfae76a.m mVar = p012xc85e97e9.p093xedfae76a.m.ON_RESUME;
        b0Var.f(mVar);
        if (this.f3462x628b0b2 != null) {
            this.f3463xdf3b8abb.a(mVar);
        }
        this.f3419xfdaae8e.m7654xa1613547();
    }

    /* renamed from: performSaveInstanceState */
    public void m7538x2d723d1e(android.os.Bundle bundle) {
        mo7404xa71a2260(bundle);
        this.f3452x10fa46b0.b(bundle);
        android.os.Parcelable m7719x66af900d = this.f3419xfdaae8e.m7719x66af900d();
        if (m7719x66af900d != null) {
            bundle.putParcelable("android:support:fragments", m7719x66af900d);
        }
    }

    /* renamed from: performStart */
    public void m7539x4fdc6181() {
        this.f3419xfdaae8e.m7698x18332053();
        this.f3419xfdaae8e.m7660x13596257(true);
        this.f3456xbec81024 = 5;
        this.f3418xfde58e4a = false;
        mo7405xb05099c3();
        if (!this.f3418xfde58e4a) {
            throw new p012xc85e97e9.p087x9da2e250.app.p3("Fragment " + this + " did not call through to super.onStart()");
        }
        p012xc85e97e9.p093xedfae76a.b0 b0Var = this.f3438xf011f8da;
        p012xc85e97e9.p093xedfae76a.m mVar = p012xc85e97e9.p093xedfae76a.m.ON_START;
        b0Var.f(mVar);
        if (this.f3462x628b0b2 != null) {
            this.f3463xdf3b8abb.a(mVar);
        }
        this.f3419xfdaae8e.m7655x81284c08();
    }

    /* renamed from: performStop */
    public void m7540xa7bccb03() {
        this.f3419xfdaae8e.m7656xb195f39c();
        if (this.f3462x628b0b2 != null) {
            this.f3463xdf3b8abb.a(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
        }
        this.f3438xf011f8da.f(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
        this.f3456xbec81024 = 4;
        this.f3418xfde58e4a = false;
        mo7406xc39f8281();
        if (this.f3418xfde58e4a) {
            return;
        }
        throw new p012xc85e97e9.p087x9da2e250.app.p3("Fragment " + this + " did not call through to super.onStop()");
    }

    /* renamed from: performViewCreated */
    public void m7541x1f859262() {
        mo7518x594b1124(this.f3462x628b0b2, this.f3451x806a1427);
        this.f3419xfdaae8e.m7657x44233ba9();
    }

    /* renamed from: postponeEnterTransition */
    public void m7542x4da7ad7() {
        m7417xb7c27ab4().f92831u = true;
    }

    /* renamed from: registerForActivityResult */
    public final <I, O> p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c m7544xaf5070d2(h.b bVar, p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b bVar2) {
        return m7422xf0ca75e2(bVar, new p012xc85e97e9.p087x9da2e250.app.z(this), bVar2);
    }

    /* renamed from: registerForContextMenu */
    public void m7546x417de4a8(android.view.View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @java.lang.Deprecated
    /* renamed from: requestPermissions */
    public final void m7547x637dca75(java.lang.String[] strArr, int i17) {
        if (this.f3432x6226bb5 != null) {
            m7454x171a637d().m7691x445a4388(this, strArr, i17);
            return;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: requireActivity */
    public final p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f m7548xe6e42394() {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 != null) {
            return mo7430x19263085;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* renamed from: requireArguments */
    public final android.os.Bundle m7549x701a5971() {
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        if (m7436x8619eaa0 != null) {
            return m7436x8619eaa0;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    /* renamed from: requireContext */
    public final android.content.Context m7550xf0c4608a() {
        android.content.Context mo7438x76847179 = mo7438x76847179();
        if (mo7438x76847179 != null) {
            return mo7438x76847179;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @java.lang.Deprecated
    /* renamed from: requireFragmentManager */
    public final p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d m7551x68e8ab18() {
        return m7454x171a637d();
    }

    /* renamed from: requireHost */
    public final java.lang.Object m7552x159830ad() {
        java.lang.Object m7447xfb805e1e = m7447xfb805e1e();
        if (m7447xfb805e1e != null) {
            return m7447xfb805e1e;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    /* renamed from: requireParentFragment */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7553x8262fddf() {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7453x12a9d210 = m7453x12a9d210();
        if (m7453x12a9d210 != null) {
            return m7453x12a9d210;
        }
        if (mo7438x76847179() == null) {
            throw new java.lang.IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + mo7438x76847179());
    }

    /* renamed from: requireView */
    public final android.view.View m7554x159e75aa() {
        android.view.View m7474xfb86a31b = m7474xfb86a31b();
        if (m7474xfb86a31b != null) {
            return m7474xfb86a31b;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: restoreChildFragmentState */
    public void m7555x2e999393(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f3419xfdaae8e.m7717xf720c626(parcelable);
        this.f3419xfdaae8e.m7641x88790e16();
    }

    /* renamed from: restoreViewState */
    public final void m7556x8e64c5fe(android.os.Bundle bundle) {
        android.util.SparseArray<android.os.Parcelable> sparseArray = this.f3455xaccd9bf2;
        if (sparseArray != null) {
            this.f3462x628b0b2.restoreHierarchyState(sparseArray);
            this.f3455xaccd9bf2 = null;
        }
        if (this.f3462x628b0b2 != null) {
            this.f3463xdf3b8abb.f92805e.a(this.f3454x538b28b5);
            this.f3454x538b28b5 = null;
        }
        this.f3418xfde58e4a = false;
        mo7407xed07c83(bundle);
        if (this.f3418xfde58e4a) {
            if (this.f3462x628b0b2 != null) {
                this.f3463xdf3b8abb.a(p012xc85e97e9.p093xedfae76a.m.ON_CREATE);
            }
        } else {
            throw new p012xc85e97e9.p087x9da2e250.app.p3("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    /* renamed from: setAllowEnterTransitionOverlap */
    public void m7557xebabba21(boolean z17) {
        m7417xb7c27ab4().f92828r = java.lang.Boolean.valueOf(z17);
    }

    /* renamed from: setAllowReturnTransitionOverlap */
    public void m7558x703499db(boolean z17) {
        m7417xb7c27ab4().f92827q = java.lang.Boolean.valueOf(z17);
    }

    /* renamed from: setAnimatingAway */
    public void m7559xc727b62a(android.view.View view) {
        m7417xb7c27ab4().f92811a = view;
    }

    /* renamed from: setAnimations */
    public void m7560x2f1d5b71(int i17, int i18, int i19, int i27) {
        if (this.f3415xd41a9ae5 == null && i17 == 0 && i18 == 0 && i19 == 0 && i27 == 0) {
            return;
        }
        m7417xb7c27ab4().f92814d = i17;
        m7417xb7c27ab4().f92815e = i18;
        m7417xb7c27ab4().f92816f = i19;
        m7417xb7c27ab4().f92817g = i27;
    }

    /* renamed from: setAnimator */
    public void m7561x472cc969(android.animation.Animator animator) {
        m7417xb7c27ab4().f92812b = animator;
    }

    /* renamed from: setArguments */
    public void mo7562xe26dab14(android.os.Bundle bundle) {
        if (this.f3427xccc8bb10 != null && m7492x7328e940()) {
            throw new java.lang.IllegalStateException("Fragment already added and state has been saved");
        }
        this.f3416x163c369 = bundle;
    }

    /* renamed from: setEnterSharedElementCallback */
    public void m7563x8a863e46(z2.z1 z1Var) {
        m7417xb7c27ab4().getClass();
    }

    /* renamed from: setEnterTransition */
    public void m7564x16700d8b(java.lang.Object obj) {
        m7417xb7c27ab4().f92821k = obj;
    }

    /* renamed from: setExitSharedElementCallback */
    public void m7565x1c53077c(z2.z1 z1Var) {
        m7417xb7c27ab4().getClass();
    }

    /* renamed from: setExitTransition */
    public void m7566x5004ea15(java.lang.Object obj) {
        m7417xb7c27ab4().f92823m = obj;
    }

    /* renamed from: setFocusedView */
    public void m7567xf50360fa(android.view.View view) {
        m7417xb7c27ab4().f92830t = view;
    }

    /* renamed from: setHasOptionsMenu */
    public void m7568x9c2f1725(boolean z17) {
        if (this.f3429xc79ff1ec != z17) {
            this.f3429xc79ff1ec = z17;
            if (!m7481x7a6e8df6() || m7483xdf9b8f74()) {
                return;
            }
            this.f3432x6226bb5.l();
        }
    }

    /* renamed from: setHideReplaced */
    public void m7569x9f181114(boolean z17) {
        m7417xb7c27ab4().f92833w = z17;
    }

    /* renamed from: setInitialSavedState */
    public void m7570xc4f4e46c(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState savedState) {
        android.os.Bundle bundle;
        if (this.f3427xccc8bb10 != null) {
            throw new java.lang.IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f92738d) == null) {
            bundle = null;
        }
        this.f3451x806a1427 = bundle;
    }

    /* renamed from: setMenuVisibility */
    public void m7571x41119ed3(boolean z17) {
        if (this.f3440x1ec28b66 != z17) {
            this.f3440x1ec28b66 = z17;
            if (this.f3429xc79ff1ec && m7481x7a6e8df6() && !m7483xdf9b8f74()) {
                this.f3432x6226bb5.l();
            }
        }
    }

    /* renamed from: setNextTransition */
    public void m7572x8035aa(int i17) {
        if (this.f3415xd41a9ae5 == null && i17 == 0) {
            return;
        }
        m7417xb7c27ab4();
        this.f3415xd41a9ae5.f92818h = i17;
    }

    /* renamed from: setOnStartEnterTransitionListener */
    public void m7573x490a11e0(p012xc85e97e9.p087x9da2e250.app.g0 g0Var) {
        m7417xb7c27ab4();
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        p012xc85e97e9.p087x9da2e250.app.g0 g0Var2 = d0Var.f92832v;
        if (g0Var == g0Var2) {
            return;
        }
        if (g0Var != null && g0Var2 != null) {
            throw new java.lang.IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (d0Var.f92831u) {
            d0Var.f92832v = g0Var;
        }
        if (g0Var != null) {
            ((p012xc85e97e9.p087x9da2e250.app.s1) g0Var).f93006c++;
        }
    }

    /* renamed from: setPopDirection */
    public void m7574xa2510db0(boolean z17) {
        if (this.f3415xd41a9ae5 == null) {
            return;
        }
        m7417xb7c27ab4().f92813c = z17;
    }

    /* renamed from: setPostOnViewCreatedAlpha */
    public void m7575x9abe465c(float f17) {
        m7417xb7c27ab4().f92829s = f17;
    }

    /* renamed from: setReenterTransition */
    public void m7576x14339b78(java.lang.Object obj) {
        m7417xb7c27ab4().f92824n = obj;
    }

    @java.lang.Deprecated
    /* renamed from: setRetainInstance */
    public void m7577x58a249bc(boolean z17) {
        this.f3449xa8c71e87 = z17;
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f3427xccc8bb10;
        if (abstractC1104xc1ad431d == null) {
            this.f3450xe2089496 = true;
        } else if (z17) {
            abstractC1104xc1ad431d.m7626xb4a8cd95(this);
        } else {
            abstractC1104xc1ad431d.m7715x96b42778(this);
        }
    }

    /* renamed from: setReturnTransition */
    public void m7578x429c727(java.lang.Object obj) {
        m7417xb7c27ab4().f92822l = obj;
    }

    /* renamed from: setSharedElementEnterTransition */
    public void m7579x69d7fbf8(java.lang.Object obj) {
        m7417xb7c27ab4().f92825o = obj;
    }

    /* renamed from: setSharedElementNames */
    public void m7580x67653ab3(java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.String> arrayList2) {
        m7417xb7c27ab4();
        p012xc85e97e9.p087x9da2e250.app.d0 d0Var = this.f3415xd41a9ae5;
        d0Var.f92819i = arrayList;
        d0Var.f92820j = arrayList2;
    }

    /* renamed from: setSharedElementReturnTransition */
    public void m7581x1dbfa65a(java.lang.Object obj) {
        m7417xb7c27ab4().f92826p = obj;
    }

    @java.lang.Deprecated
    /* renamed from: setTargetFragment */
    public void m7582xf54bcc03(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, int i17) {
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f3427xccc8bb10;
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d2 = componentCallbacksC1101xa17d4670 != null ? componentCallbacksC1101xa17d4670.f3427xccc8bb10 : null;
        if (abstractC1104xc1ad431d != null && abstractC1104xc1ad431d2 != null && abstractC1104xc1ad431d != abstractC1104xc1ad431d2) {
            throw new java.lang.IllegalArgumentException("Fragment " + componentCallbacksC1101xa17d4670 + " must share the same FragmentManager to be set as a target fragment");
        }
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = componentCallbacksC1101xa17d4670; componentCallbacksC1101xa17d46702 != null; componentCallbacksC1101xa17d46702 = componentCallbacksC1101xa17d46702.m7470x2d5563f7()) {
            if (componentCallbacksC1101xa17d46702.m7427xb2c87fbf(this)) {
                throw new java.lang.IllegalArgumentException("Setting " + componentCallbacksC1101xa17d4670 + " as the target of " + this + " would create a target cycle");
            }
        }
        if (componentCallbacksC1101xa17d4670 == null) {
            this.f3460x4a1a7680 = null;
            this.f3458x1aea985e = null;
        } else if (this.f3427xccc8bb10 == null || componentCallbacksC1101xa17d4670.f3427xccc8bb10 == null) {
            this.f3460x4a1a7680 = null;
            this.f3458x1aea985e = componentCallbacksC1101xa17d4670;
        } else {
            this.f3460x4a1a7680 = componentCallbacksC1101xa17d4670.f3465x32e011;
            this.f3458x1aea985e = null;
        }
        this.f3459xc42ffdde = i17;
    }

    @java.lang.Deprecated
    /* renamed from: setUserVisibleHint */
    public void mo7583x951b248c(boolean z17) {
        if (!this.f3461x4990e921 && z17 && this.f3456xbec81024 < 5 && this.f3427xccc8bb10 != null && m7481x7a6e8df6() && this.f3434x95771071) {
            p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f3427xccc8bb10;
            abstractC1104xc1ad431d.m7701xf4b0b46d(abstractC1104xc1ad431d.m7635xc28835c3(this));
        }
        this.f3461x4990e921 = z17;
        this.f3424xd1bf805d = this.f3456xbec81024 < 5 && !z17;
        if (this.f3451x806a1427 != null) {
            this.f3453x2ddaffd4 = java.lang.Boolean.valueOf(z17);
        }
    }

    /* renamed from: shouldShowRequestPermissionRationale */
    public boolean m7584xc35d0049(java.lang.String str) {
        p012xc85e97e9.p087x9da2e250.app.v0 v0Var = this.f3432x6226bb5;
        if (v0Var != null) {
            return v0Var.i(str);
        }
        return false;
    }

    /* renamed from: startActivity */
    public void mo7585xa4df9991(android.content.Intent intent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(null);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "androidx/fragment/app/Fragment", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        m7586xa4df9991((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
        yj0.a.f(this, "androidx/fragment/app/Fragment", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
    }

    @java.lang.Deprecated
    /* renamed from: startActivityForResult */
    public void m7587x5dc77fb5(android.content.Intent intent, int i17) {
        mo7588x5dc77fb5(intent, i17, null);
    }

    @java.lang.Deprecated
    /* renamed from: startIntentSenderForResult */
    public void m7589xeb9fea13(android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle) {
        if (this.f3432x6226bb5 == null) {
            throw new java.lang.IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
            mo7591x9616526c();
            java.util.Objects.toString(intentSender);
            java.util.Objects.toString(intent);
            java.util.Objects.toString(bundle);
        }
        m7454x171a637d().m7693x8a07a026(this, intentSender, i17, intent, i18, i19, i27, bundle);
    }

    /* renamed from: startPostponedEnterTransition */
    public void m7590xd7835c61() {
        if (this.f3415xd41a9ae5 == null || !m7417xb7c27ab4().f92831u) {
            return;
        }
        if (this.f3432x6226bb5 == null) {
            m7417xb7c27ab4().f92831u = false;
        } else if (android.os.Looper.myLooper() != this.f3432x6226bb5.f93028f.getLooper()) {
            this.f3432x6226bb5.f93028f.postAtFrontOfQueue(new p012xc85e97e9.p087x9da2e250.app.w(this));
        } else {
            m7425x60b4f0ed(true);
        }
    }

    /* renamed from: toString */
    public java.lang.String mo7591x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        sb6.append(getClass().getSimpleName());
        sb6.append("{");
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb6.append("} (");
        sb6.append(this.f3465x32e011);
        if (this.f3426x9ca58fd8 != 0) {
            sb6.append(" id=0x");
            sb6.append(java.lang.Integer.toHexString(this.f3426x9ca58fd8));
        }
        if (this.f3457x32d3ed != null) {
            sb6.append(" tag=");
            sb6.append(this.f3457x32d3ed);
        }
        sb6.append(")");
        return sb6.toString();
    }

    /* renamed from: unregisterForContextMenu */
    public void m7592x4f840a81(android.view.View view) {
        view.setOnCreateContextMenuListener(null);
    }

    /* renamed from: androidx.fragment.app.Fragment$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState> f3466x681a0c0c = new p012xc85e97e9.p087x9da2e250.app.h0();

        /* renamed from: d, reason: collision with root package name */
        public final android.os.Bundle f92738d;

        public SavedState(android.os.Bundle bundle) {
            this.f92738d = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeBundle(this.f92738d);
        }

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            android.os.Bundle readBundle = parcel.readBundle();
            this.f92738d = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    @java.lang.Deprecated
    /* renamed from: instantiate */
    public static p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7421x83a782ea(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        try {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) p012xc85e97e9.p087x9da2e250.app.u0.c(context.getClassLoader(), str).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(componentCallbacksC1101xa17d4670.getClass().getClassLoader());
                componentCallbacksC1101xa17d4670.mo7562xe26dab14(bundle);
            }
            return componentCallbacksC1101xa17d4670;
        } catch (java.lang.IllegalAccessException e17) {
            throw new p012xc85e97e9.p087x9da2e250.app.e0("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e17);
        } catch (java.lang.InstantiationException e18) {
            throw new p012xc85e97e9.p087x9da2e250.app.e0("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e18);
        } catch (java.lang.NoSuchMethodException e19) {
            throw new p012xc85e97e9.p087x9da2e250.app.e0("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e19);
        } catch (java.lang.reflect.InvocationTargetException e27) {
            throw new p012xc85e97e9.p087x9da2e250.app.e0("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e27);
        }
    }

    @Override // ox5.l
    /* renamed from: getActivity, reason: merged with bridge method [inline-methods] */
    public final p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f m29017x19263085() {
        p012xc85e97e9.p087x9da2e250.app.v0 v0Var = this.f3432x6226bb5;
        if (v0Var == null) {
            return null;
        }
        return (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) v0Var.f93026d;
    }

    /* renamed from: getString */
    public final java.lang.String m7468x2fec8307(int i17, java.lang.Object... objArr) {
        return m7460x893a2f6f().getString(i17, objArr);
    }

    /* renamed from: postponeEnterTransition */
    public final void m7543x4da7ad7(long j17, java.util.concurrent.TimeUnit timeUnit) {
        android.os.Handler handler;
        m7417xb7c27ab4().f92831u = true;
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f3427xccc8bb10;
        if (abstractC1104xc1ad431d != null) {
            handler = abstractC1104xc1ad431d.m7676xfb805e1e().f93028f;
        } else {
            handler = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        handler.removeCallbacks(this.f3446x5caa0f92);
        handler.postDelayed(this.f3446x5caa0f92, timeUnit.toMillis(j17));
    }

    /* renamed from: registerForActivityResult */
    public final <I, O> p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c m7545xaf5070d2(h.b bVar, p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h hVar, p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b bVar2) {
        return m7422xf0ca75e2(bVar, new p012xc85e97e9.p087x9da2e250.app.a0(this, hVar), bVar2);
    }

    @java.lang.Deprecated
    /* renamed from: startActivityForResult */
    public void mo7588x5dc77fb5(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        if (this.f3432x6226bb5 != null) {
            m7454x171a637d().m7692x1acb3748(this, intent, i17, bundle);
            return;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @java.lang.Deprecated
    /* renamed from: getLayoutInflater */
    public android.view.LayoutInflater m7450xacd3518b(android.os.Bundle bundle) {
        p012xc85e97e9.p087x9da2e250.app.v0 v0Var = this.f3432x6226bb5;
        if (v0Var != null) {
            android.view.LayoutInflater f17 = v0Var.f();
            f17.setFactory2(this.f3419xfdaae8e.m7677x9866b4ff());
            return f17;
        }
        throw new java.lang.IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @java.lang.Deprecated
    /* renamed from: onAttach */
    public void mo7497x3b13c504(android.app.Activity activity) {
        this.f3418xfde58e4a = true;
    }

    @java.lang.Deprecated
    /* renamed from: onInflate */
    public void mo7507xc3995328(android.app.Activity activity, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        this.f3418xfde58e4a = true;
    }

    /* renamed from: startActivity */
    public void m7586xa4df9991(android.content.Intent intent, android.os.Bundle bundle) {
        p012xc85e97e9.p087x9da2e250.app.v0 v0Var = this.f3432x6226bb5;
        if (v0Var != null) {
            v0Var.j(this, intent, -1, bundle);
            return;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public ComponentCallbacksC1101xa17d4670(int i17) {
        this();
        this.f3422x132d2151 = i17;
    }

    /* renamed from: restoreViewState */
    private void m7424x8e64c5fe() {
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3)) {
            mo7591x9616526c();
        }
        if (this.f3462x628b0b2 != null) {
            m7556x8e64c5fe(this.f3451x806a1427);
        }
        this.f3451x806a1427 = null;
    }
}
