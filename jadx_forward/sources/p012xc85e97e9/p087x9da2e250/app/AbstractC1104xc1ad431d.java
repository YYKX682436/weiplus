package p012xc85e97e9.p087x9da2e250.app;

/* renamed from: androidx.fragment.app.FragmentManager */
/* loaded from: classes14.dex */
public abstract class AbstractC1104xc1ad431d {

    /* renamed from: DEBUG */
    private static boolean f3473x3de9e33 = false;

    /* renamed from: EXTRA_CREATED_FILLIN_INTENT */
    private static final java.lang.String f3474xed5ab88d = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";

    /* renamed from: POP_BACK_STACK_INCLUSIVE */
    public static final int f3475x7a3baeab = 1;
    static final java.lang.String TAG = "FragmentManager";

    /* renamed from: USE_STATE_MANAGER */
    static boolean f3476xa4a928e7 = true;

    /* renamed from: _hellAccFlag_ */
    private byte f3477x7f11beae;

    /* renamed from: mBackStack */
    java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.a> f3478xc9a30ff4;

    /* renamed from: mBackStackChangeListeners */
    private java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.p1> f3479x535145db;

    /* renamed from: mContainer */
    private p012xc85e97e9.p087x9da2e250.app.s0 f3481x62389694;

    /* renamed from: mCreatedMenus */
    private java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> f3482xdf651f9;

    /* renamed from: mDestroyed */
    private boolean f3485xf122e02c;

    /* renamed from: mExecutingActions */
    private boolean f3487x6994cc38;

    /* renamed from: mHavePendingDeferredStart */
    private boolean f3492xaff43281;

    /* renamed from: mHost */
    private p012xc85e97e9.p087x9da2e250.app.v0 f3493x6226bb5;

    /* renamed from: mNeedMenuInvalidate */
    private boolean f3498xcf29297d;

    /* renamed from: mNonConfig */
    private p012xc85e97e9.p087x9da2e250.app.w1 f3499x6e535682;

    /* renamed from: mOnBackPressedDispatcher */
    private p012xc85e97e9.p013x9d4bf30f.i f3502xcd1dc676;

    /* renamed from: mParent */
    private p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f3503x14172f77;

    /* renamed from: mPostponedTransactions */
    private java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.s1> f3505x96597096;

    /* renamed from: mPrimaryNav */
    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f3506x9034440e;

    /* renamed from: mRequestPermissions */
    private p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c f3507x62cd25c2;

    /* renamed from: mStartActivityForResult */
    private p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c f3511x242e6c82;

    /* renamed from: mStartIntentSenderForResult */
    private p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c f3512x17f9a860;

    /* renamed from: mStateSaved */
    private boolean f3513xcdefe4c3;

    /* renamed from: mStopped */
    private boolean f3514x2dc844a0;

    /* renamed from: mTmpAddedFragments */
    private java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> f3515xc3eda70d;

    /* renamed from: mTmpIsPop */
    private java.util.ArrayList<java.lang.Boolean> f3516x8066317d;

    /* renamed from: mTmpRecords */
    private java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.a> f3517xc4dfd578;

    /* renamed from: mPendingActions */
    private final java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.q1> f3504x3a30b933 = new java.util.ArrayList<>();

    /* renamed from: mFragmentStore */
    private final p012xc85e97e9.p087x9da2e250.app.f2 f3490x27342104 = new p012xc85e97e9.p087x9da2e250.app.f2();

    /* renamed from: mLayoutInflaterFactory */
    private final p012xc85e97e9.p087x9da2e250.app.x0 f3496x408ca848 = new p012xc85e97e9.p087x9da2e250.app.x0(this);

    /* renamed from: mOnBackPressedCallback */
    private final p012xc85e97e9.p013x9d4bf30f.g f3501xc6673d4 = new p012xc85e97e9.p087x9da2e250.app.c1(this, false);

    /* renamed from: mBackStackIndex */
    private final java.util.concurrent.atomic.AtomicInteger f3480x185013e = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: mResults */
    private final java.util.Map<java.lang.String, android.os.Bundle> f3509xdf83eec9 = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: mResultListeners */
    private final java.util.Map<java.lang.String, p012xc85e97e9.p087x9da2e250.app.o1> f3508x49812a75 = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: mExitAnimationCancellationSignals */
    private java.util.Map<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, java.util.HashSet<j3.h>> f3488x1c3e56ef = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: mFragmentTransitionCallback */
    private final p012xc85e97e9.p087x9da2e250.app.p2 f3491x8983577 = new p012xc85e97e9.p087x9da2e250.app.d1(this);

    /* renamed from: mLifecycleCallbacksDispatcher */
    private final p012xc85e97e9.p087x9da2e250.app.z0 f3497xba695958 = new p012xc85e97e9.p087x9da2e250.app.z0(this);

    /* renamed from: mOnAttachListeners */
    private final java.util.concurrent.CopyOnWriteArrayList<p012xc85e97e9.p087x9da2e250.app.x1> f3500xab2f18ae = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* renamed from: mCurState */
    int f3483x459b61be = -1;

    /* renamed from: mFragmentFactory */
    private p012xc85e97e9.p087x9da2e250.app.u0 f3489x59eadc6d = null;

    /* renamed from: mHostFragmentFactory */
    private p012xc85e97e9.p087x9da2e250.app.u0 f3494x744b7825 = new p012xc85e97e9.p087x9da2e250.app.e1(this);

    /* renamed from: mSpecialEffectsControllerFactory */
    private p012xc85e97e9.p087x9da2e250.app.o3 f3510xc5c13c98 = null;

    /* renamed from: mDefaultSpecialEffectsControllerFactory */
    private p012xc85e97e9.p087x9da2e250.app.o3 f3484xff7d5f11 = new p012xc85e97e9.p087x9da2e250.app.f1(this);

    /* renamed from: mLaunchedFragments */
    java.util.ArrayDeque<p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.LaunchedFragmentInfo> f3495x515163c4 = new java.util.ArrayDeque<>();

    /* renamed from: mExecCommit */
    private java.lang.Runnable f3486xa6c35575 = new p012xc85e97e9.p087x9da2e250.app.g1(this);

    @java.lang.Deprecated
    /* renamed from: enableDebugLogging */
    public static void m7614xcc18e6af(boolean z17) {
        f3473x3de9e33 = z17;
    }

    /* renamed from: enableNewStateManager */
    public static void m7615x55abd799(boolean z17) {
        f3476xa4a928e7 = z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.fragment.app.Fragment] */
    /* renamed from: findFragment */
    public static <F extends p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> F m7616xa65c7329(android.view.View view) {
        F f17;
        android.view.View view2 = view;
        while (true) {
            f17 = null;
            if (view2 == null) {
                break;
            }
            ?? m7618xece89e8b = m7618xece89e8b(view2);
            if (m7618xece89e8b != 0) {
                f17 = m7618xece89e8b;
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

    /* renamed from: findFragmentManager */
    public static p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d m7617x195e0444(android.view.View view) {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670;
        android.view.View view2 = view;
        while (true) {
            activityC1102x9ee2d9f = null;
            if (view2 == null) {
                componentCallbacksC1101xa17d4670 = null;
                break;
            }
            componentCallbacksC1101xa17d4670 = m7618xece89e8b(view2);
            if (componentCallbacksC1101xa17d4670 != null) {
                break;
            }
            java.lang.Object parent = view2.getParent();
            view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        }
        if (componentCallbacksC1101xa17d4670 != null) {
            if (componentCallbacksC1101xa17d4670.m7481x7a6e8df6()) {
                return componentCallbacksC1101xa17d4670.m7437x54c0aef7();
            }
            throw new java.lang.IllegalStateException("The Fragment " + componentCallbacksC1101xa17d4670 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        android.content.Context context = view.getContext();
        while (true) {
            if (!(context instanceof android.content.ContextWrapper)) {
                break;
            }
            if (context instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) {
                activityC1102x9ee2d9f = (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context;
                break;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        if (activityC1102x9ee2d9f != null) {
            return activityC1102x9ee2d9f.mo7595x9cdc264();
        }
        throw new java.lang.IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    /* renamed from: getViewFragment */
    public static p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7618xece89e8b(android.view.View view) {
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.gd_);
        if (tag instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) {
            return (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) tag;
        }
        return null;
    }

    /* renamed from: isLoggingEnabled */
    public static boolean m7619x11f226ac(int i17) {
        return f3473x3de9e33 || android.util.Log.isLoggable(TAG, i17);
    }

    /* renamed from: reverseTransit */
    public static int m7620x7b799891(int i17) {
        if (i17 == 4097) {
            return 8194;
        }
        if (i17 != 4099) {
            return i17 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    public final void a(x.d dVar) {
        int i17 = this.f3483x459b61be;
        if (i17 < 1) {
            return;
        }
        int min = java.lang.Math.min(i17, 5);
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : this.f3490x27342104.f()) {
            if (componentCallbacksC1101xa17d4670.f3456xbec81024 < min) {
                m7697xc25739c5(componentCallbacksC1101xa17d4670, min);
                if (componentCallbacksC1101xa17d4670.f3462x628b0b2 != null && !componentCallbacksC1101xa17d4670.f3430x6dac477 && componentCallbacksC1101xa17d4670.f3435xfc98abaa) {
                    dVar.add(componentCallbacksC1101xa17d4670);
                }
            }
        }
    }

    /* renamed from: addBackStackState */
    public void m7621x86b5aa31(p012xc85e97e9.p087x9da2e250.app.a aVar) {
        if (this.f3478xc9a30ff4 == null) {
            this.f3478xc9a30ff4 = new java.util.ArrayList<>();
        }
        this.f3478xc9a30ff4.add(aVar);
    }

    /* renamed from: addCancellationSignal */
    public void m7622x86b1840c(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, j3.h hVar) {
        if (this.f3488x1c3e56ef.get(componentCallbacksC1101xa17d4670) == null) {
            this.f3488x1c3e56ef.put(componentCallbacksC1101xa17d4670, new java.util.HashSet<>());
        }
        this.f3488x1c3e56ef.get(componentCallbacksC1101xa17d4670).add(hVar);
    }

    /* renamed from: addFragment */
    public p012xc85e97e9.p087x9da2e250.app.d2 m7623x63908e11(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (m7619x11f226ac(2)) {
            java.util.Objects.toString(componentCallbacksC1101xa17d4670);
        }
        p012xc85e97e9.p087x9da2e250.app.d2 m7635xc28835c3 = m7635xc28835c3(componentCallbacksC1101xa17d4670);
        componentCallbacksC1101xa17d4670.f3427xccc8bb10 = this;
        this.f3490x27342104.g(m7635xc28835c3);
        if (!componentCallbacksC1101xa17d4670.f3425x634032ff) {
            this.f3490x27342104.a(componentCallbacksC1101xa17d4670);
            componentCallbacksC1101xa17d4670.f3447x66cabce = false;
            if (componentCallbacksC1101xa17d4670.f3462x628b0b2 == null) {
                componentCallbacksC1101xa17d4670.f3431xaf30923d = false;
            }
            if (m(componentCallbacksC1101xa17d4670)) {
                this.f3498xcf29297d = true;
            }
        }
        return m7635xc28835c3;
    }

    /* renamed from: addFragmentOnAttachListener */
    public void m7624x6c683a09(p012xc85e97e9.p087x9da2e250.app.x1 x1Var) {
        this.f3500xab2f18ae.add(x1Var);
    }

    /* renamed from: addOnBackStackChangedListener */
    public void m7625x962dcde7(p012xc85e97e9.p087x9da2e250.app.p1 p1Var) {
        if (this.f3479x535145db == null) {
            this.f3479x535145db = new java.util.ArrayList<>();
        }
        this.f3479x535145db.add(p1Var);
    }

    /* renamed from: addRetainedFragment */
    public void m7626xb4a8cd95(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        this.f3499x6e535682.N6(componentCallbacksC1101xa17d4670);
    }

    /* renamed from: allocBackStackIndex */
    public int m7627x2ff62606() {
        return this.f3480x185013e.getAndIncrement();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: attachController */
    public void m7628xfb41dbc1(p012xc85e97e9.p087x9da2e250.app.v0 v0Var, p012xc85e97e9.p087x9da2e250.app.s0 s0Var, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        java.lang.String str;
        if (this.f3493x6226bb5 != null) {
            throw new java.lang.IllegalStateException("Already attached");
        }
        this.f3493x6226bb5 = v0Var;
        this.f3481x62389694 = s0Var;
        this.f3503x14172f77 = componentCallbacksC1101xa17d4670;
        if (componentCallbacksC1101xa17d4670 != null) {
            m7624x6c683a09(new p012xc85e97e9.p087x9da2e250.app.i1(this, componentCallbacksC1101xa17d4670));
        } else if (v0Var instanceof p012xc85e97e9.p087x9da2e250.app.x1) {
            m7624x6c683a09((p012xc85e97e9.p087x9da2e250.app.x1) v0Var);
        }
        if (this.f3503x14172f77 != null) {
            s();
        }
        if (v0Var instanceof p012xc85e97e9.p013x9d4bf30f.k) {
            p012xc85e97e9.p013x9d4bf30f.k kVar = (p012xc85e97e9.p013x9d4bf30f.k) v0Var;
            p012xc85e97e9.p013x9d4bf30f.i mo2510x96a7816d = kVar.mo2510x96a7816d();
            this.f3502xcd1dc676 = mo2510x96a7816d;
            p012xc85e97e9.p093xedfae76a.y yVar = kVar;
            if (componentCallbacksC1101xa17d4670 != null) {
                yVar = componentCallbacksC1101xa17d4670;
            }
            mo2510x96a7816d.a(yVar, this.f3501xc6673d4);
        }
        if (componentCallbacksC1101xa17d4670 != null) {
            p012xc85e97e9.p087x9da2e250.app.w1 w1Var = componentCallbacksC1101xa17d4670.f3427xccc8bb10.f3499x6e535682;
            java.util.HashMap hashMap = w1Var.f93036e;
            p012xc85e97e9.p087x9da2e250.app.w1 w1Var2 = (p012xc85e97e9.p087x9da2e250.app.w1) hashMap.get(componentCallbacksC1101xa17d4670.f3465x32e011);
            if (w1Var2 == null) {
                w1Var2 = new p012xc85e97e9.p087x9da2e250.app.w1(w1Var.f93038g);
                hashMap.put(componentCallbacksC1101xa17d4670.f3465x32e011, w1Var2);
            }
            this.f3499x6e535682 = w1Var2;
        } else if (v0Var instanceof p012xc85e97e9.p093xedfae76a.m1) {
            this.f3499x6e535682 = (p012xc85e97e9.p087x9da2e250.app.w1) new p012xc85e97e9.p093xedfae76a.j1(((p012xc85e97e9.p093xedfae76a.m1) v0Var).getViewModel(), p012xc85e97e9.p087x9da2e250.app.w1.f93034n).a(p012xc85e97e9.p087x9da2e250.app.w1.class);
        } else {
            this.f3499x6e535682 = new p012xc85e97e9.p087x9da2e250.app.w1(false);
        }
        this.f3499x6e535682.f93041m = m7690x7328e940();
        this.f3490x27342104.f92847c = this.f3499x6e535682;
        java.lang.Object obj = this.f3493x6226bb5;
        if (obj instanceof p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.i) {
            p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h mo2507xfe541f5f = ((p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.i) obj).mo2507xfe541f5f();
            if (componentCallbacksC1101xa17d4670 != null) {
                str = componentCallbacksC1101xa17d4670.f3465x32e011 + ":";
            } else {
                str = "";
            }
            java.lang.String str2 = "FragmentManager:" + str;
            this.f3511x242e6c82 = mo2507xfe541f5f.e(str2 + "StartActivityForResult", new h.f(), new p012xc85e97e9.p087x9da2e250.app.j1(this));
            this.f3512x17f9a860 = mo2507xfe541f5f.e(str2 + "StartIntentSenderForResult", new p012xc85e97e9.p087x9da2e250.app.l1(), new p012xc85e97e9.p087x9da2e250.app.a1(this));
            this.f3507x62cd25c2 = mo2507xfe541f5f.e(str2 + "RequestPermissions", new h.d(), new p012xc85e97e9.p087x9da2e250.app.b1(this));
        }
    }

    /* renamed from: attachFragment */
    public void m7629xe5401fb5(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (m7619x11f226ac(2)) {
            java.util.Objects.toString(componentCallbacksC1101xa17d4670);
        }
        if (componentCallbacksC1101xa17d4670.f3425x634032ff) {
            componentCallbacksC1101xa17d4670.f3425x634032ff = false;
            if (componentCallbacksC1101xa17d4670.f3414xbdc32c93) {
                return;
            }
            this.f3490x27342104.a(componentCallbacksC1101xa17d4670);
            if (m7619x11f226ac(2)) {
                componentCallbacksC1101xa17d4670.mo7591x9616526c();
            }
            if (m(componentCallbacksC1101xa17d4670)) {
                this.f3498xcf29297d = true;
            }
        }
    }

    public final void b(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        java.util.HashSet<j3.h> hashSet = this.f3488x1c3e56ef.get(componentCallbacksC1101xa17d4670);
        if (hashSet != null) {
            java.util.Iterator<j3.h> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            componentCallbacksC1101xa17d4670.m7526x6ca0cb9e();
            this.f3497xba695958.n(componentCallbacksC1101xa17d4670, false);
            componentCallbacksC1101xa17d4670.f3420x62389694 = null;
            componentCallbacksC1101xa17d4670.f3462x628b0b2 = null;
            componentCallbacksC1101xa17d4670.f3463xdf3b8abb = null;
            componentCallbacksC1101xa17d4670.f3464xfe61c291.mo523x53d8522f(null);
            componentCallbacksC1101xa17d4670.f3433x2866c3c = false;
            this.f3488x1c3e56ef.remove(componentCallbacksC1101xa17d4670);
        }
    }

    /* renamed from: beginTransaction */
    public p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75() {
        return new p012xc85e97e9.p087x9da2e250.app.a(this);
    }

    public final void c() {
        this.f3487x6994cc38 = false;
        this.f3516x8066317d.clear();
        this.f3517xc4dfd578.clear();
    }

    /* renamed from: checkForMenus */
    public boolean m7631xaa6d70d3() {
        java.util.Iterator it = ((java.util.ArrayList) this.f3490x27342104.e()).iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) it.next();
            if (componentCallbacksC1101xa17d4670 != null) {
                z17 = m(componentCallbacksC1101xa17d4670);
            }
            if (z17) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: clearFragmentResult */
    public final void m7632x3fcb923a(java.lang.String str) {
        this.f3509xdf83eec9.remove(str);
    }

    /* renamed from: clearFragmentResultListener */
    public final void m7633x37b1e10e(java.lang.String str) {
        p012xc85e97e9.p087x9da2e250.app.o1 remove = this.f3508x49812a75.remove(str);
        if (remove != null) {
            remove.f92966a.c(remove.f92968c);
        }
    }

    /* renamed from: completeExecute */
    public void m7634xb663bfc(p012xc85e97e9.p087x9da2e250.app.a aVar, boolean z17, boolean z18, boolean z19) {
        if (z17) {
            aVar.s(z19);
        } else {
            aVar.r();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(java.lang.Boolean.valueOf(z17));
        if (z18 && this.f3483x459b61be >= 1) {
            p012xc85e97e9.p087x9da2e250.app.r2.l(this.f3493x6226bb5.f93027e, this.f3481x62389694, arrayList, arrayList2, 0, 1, true, this.f3491x8983577);
        }
        if (z19) {
            m7695xc25739c5(this.f3483x459b61be, true);
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f3490x27342104.e()).iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) it.next();
            if (componentCallbacksC1101xa17d4670 != null && componentCallbacksC1101xa17d4670.f3462x628b0b2 != null && componentCallbacksC1101xa17d4670.f3435xfc98abaa && aVar.t(componentCallbacksC1101xa17d4670.f3421xb66d4acf)) {
                float f17 = componentCallbacksC1101xa17d4670.f3445x88c9013d;
                if (f17 > 0.0f) {
                    android.view.View view = componentCallbacksC1101xa17d4670.f3462x628b0b2;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList3.add(java.lang.Float.valueOf(f17));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view, arrayList3.toArray(), "androidx/fragment/app/FragmentManager", "completeExecute", "(Landroidx/fragment/app/BackStackRecord;ZZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(view, "androidx/fragment/app/FragmentManager", "completeExecute", "(Landroidx/fragment/app/BackStackRecord;ZZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                if (z19) {
                    componentCallbacksC1101xa17d4670.f3445x88c9013d = 0.0f;
                } else {
                    componentCallbacksC1101xa17d4670.f3445x88c9013d = -1.0f;
                    componentCallbacksC1101xa17d4670.f3435xfc98abaa = false;
                }
            }
        }
    }

    /* renamed from: createOrGetFragmentStateManager */
    public p012xc85e97e9.p087x9da2e250.app.d2 m7635xc28835c3(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        p012xc85e97e9.p087x9da2e250.app.f2 f2Var = this.f3490x27342104;
        p012xc85e97e9.p087x9da2e250.app.d2 d2Var = (p012xc85e97e9.p087x9da2e250.app.d2) f2Var.f92846b.get(componentCallbacksC1101xa17d4670.f3465x32e011);
        if (d2Var != null) {
            return d2Var;
        }
        p012xc85e97e9.p087x9da2e250.app.d2 d2Var2 = new p012xc85e97e9.p087x9da2e250.app.d2(this.f3497xba695958, this.f3490x27342104, componentCallbacksC1101xa17d4670);
        d2Var2.k(this.f3493x6226bb5.f93027e.getClassLoader());
        d2Var2.f92839e = this.f3483x459b61be;
        return d2Var2;
    }

    public final java.util.Set d() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = ((java.util.ArrayList) this.f3490x27342104.d()).iterator();
        while (it.hasNext()) {
            android.view.ViewGroup viewGroup = ((p012xc85e97e9.p087x9da2e250.app.d2) it.next()).f92837c.f3420x62389694;
            if (viewGroup != null) {
                hashSet.add(p012xc85e97e9.p087x9da2e250.app.n3.g(viewGroup, m7681xbcf8108f()));
            }
        }
        return hashSet;
    }

    /* renamed from: detachFragment */
    public void m7636x912c1b03(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (m7619x11f226ac(2)) {
            java.util.Objects.toString(componentCallbacksC1101xa17d4670);
        }
        if (componentCallbacksC1101xa17d4670.f3425x634032ff) {
            return;
        }
        componentCallbacksC1101xa17d4670.f3425x634032ff = true;
        if (componentCallbacksC1101xa17d4670.f3414xbdc32c93) {
            if (m7619x11f226ac(2)) {
                componentCallbacksC1101xa17d4670.mo7591x9616526c();
            }
            p012xc85e97e9.p087x9da2e250.app.f2 f2Var = this.f3490x27342104;
            synchronized (f2Var.f92845a) {
                f2Var.f92845a.remove(componentCallbacksC1101xa17d4670);
            }
            componentCallbacksC1101xa17d4670.f3414xbdc32c93 = false;
            if (m(componentCallbacksC1101xa17d4670)) {
                this.f3498xcf29297d = true;
            }
            p(componentCallbacksC1101xa17d4670);
        }
    }

    /* renamed from: dispatchActivityCreated */
    public void m7637x1d9214ff() {
        this.f3513xcdefe4c3 = false;
        this.f3514x2dc844a0 = false;
        this.f3499x6e535682.f93041m = false;
        f(4);
    }

    /* renamed from: dispatchAttach */
    public void m7638x85325b5f() {
        this.f3513xcdefe4c3 = false;
        this.f3514x2dc844a0 = false;
        this.f3499x6e535682.f93041m = false;
        f(0);
    }

    /* renamed from: dispatchConfigurationChanged */
    public void m7639xfc09c78(android.content.res.Configuration configuration) {
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : this.f3490x27342104.f()) {
            if (componentCallbacksC1101xa17d4670 != null) {
                componentCallbacksC1101xa17d4670.m7521x17b1c5df(configuration);
            }
        }
    }

    /* renamed from: dispatchContextItemSelected */
    public boolean m7640x9d93b743(android.view.MenuItem menuItem) {
        if (this.f3483x459b61be < 1) {
            return false;
        }
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : this.f3490x27342104.f()) {
            if (componentCallbacksC1101xa17d4670 != null && componentCallbacksC1101xa17d4670.m7522x19b444fc(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: dispatchCreate */
    public void m7641x88790e16() {
        this.f3513xcdefe4c3 = false;
        this.f3514x2dc844a0 = false;
        this.f3499x6e535682.f93041m = false;
        f(1);
    }

    /* renamed from: dispatchCreateOptionsMenu */
    public boolean m7642x514aa127(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        if (this.f3483x459b61be < 1) {
            return false;
        }
        java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> arrayList = null;
        boolean z17 = false;
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : this.f3490x27342104.f()) {
            if (componentCallbacksC1101xa17d4670 != null && m7687x46e5d6ff(componentCallbacksC1101xa17d4670) && componentCallbacksC1101xa17d4670.m7524x2d754920(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList<>();
                }
                arrayList.add(componentCallbacksC1101xa17d4670);
                z17 = true;
            }
        }
        if (this.f3482xdf651f9 != null) {
            for (int i17 = 0; i17 < this.f3482xdf651f9.size(); i17++) {
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = this.f3482xdf651f9.get(i17);
                if (arrayList == null || !arrayList.contains(componentCallbacksC1101xa17d46702)) {
                    componentCallbacksC1101xa17d46702.m7505xd5b86902();
                }
            }
        }
        this.f3482xdf651f9 = arrayList;
        return z17;
    }

    /* renamed from: dispatchDestroy */
    public void m7643xa62dd620() {
        this.f3485xf122e02c = true;
        m7660x13596257(true);
        g();
        f(-1);
        this.f3493x6226bb5 = null;
        this.f3481x62389694 = null;
        this.f3503x14172f77 = null;
        if (this.f3502xcd1dc676 != null) {
            this.f3501xc6673d4.m2525xc84af884();
            this.f3502xcd1dc676 = null;
        }
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c cVar = this.f3511x242e6c82;
        if (cVar != null) {
            cVar.b();
            this.f3512x17f9a860.b();
            this.f3507x62cd25c2.b();
        }
    }

    /* renamed from: dispatchDestroyView */
    public void m7644x913e74e5() {
        f(1);
    }

    /* renamed from: dispatchLowMemory */
    public void m7645x1353c21b() {
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : this.f3490x27342104.f()) {
            if (componentCallbacksC1101xa17d4670 != null) {
                componentCallbacksC1101xa17d4670.m7529x969e7314();
            }
        }
    }

    /* renamed from: dispatchMultiWindowModeChanged */
    public void m7646x58578662(boolean z17) {
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : this.f3490x27342104.f()) {
            if (componentCallbacksC1101xa17d4670 != null) {
                componentCallbacksC1101xa17d4670.m7530x28a3f209(z17);
            }
        }
    }

    /* renamed from: dispatchOnAttachFragment */
    public void m7647x70b71c0e(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        java.util.Iterator<p012xc85e97e9.p087x9da2e250.app.x1> it = this.f3500xab2f18ae.iterator();
        while (it.hasNext()) {
            it.next().a(this, componentCallbacksC1101xa17d4670);
        }
    }

    /* renamed from: dispatchOptionsItemSelected */
    public boolean m7648xfa3e19b2(android.view.MenuItem menuItem) {
        if (this.f3483x459b61be < 1) {
            return false;
        }
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : this.f3490x27342104.f()) {
            if (componentCallbacksC1101xa17d4670 != null && componentCallbacksC1101xa17d4670.m7531x765ea76b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: dispatchOptionsMenuClosed */
    public void m7649x1aca938f(android.view.Menu menu) {
        if (this.f3483x459b61be < 1) {
            return;
        }
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : this.f3490x27342104.f()) {
            if (componentCallbacksC1101xa17d4670 != null) {
                componentCallbacksC1101xa17d4670.m7532xf6f53b88(menu);
            }
        }
    }

    /* renamed from: dispatchPause */
    public void m7650x80f5ad9c() {
        f(5);
    }

    /* renamed from: dispatchPictureInPictureModeChanged */
    public void m7651xaf1d8afc(boolean z17) {
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : this.f3490x27342104.f()) {
            if (componentCallbacksC1101xa17d4670 != null) {
                componentCallbacksC1101xa17d4670.m7534xe1d54fb5(z17);
            }
        }
    }

    /* renamed from: dispatchPrepareOptionsMenu */
    public boolean m7652x353627b0(android.view.Menu menu) {
        boolean z17 = false;
        if (this.f3483x459b61be < 1) {
            return false;
        }
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : this.f3490x27342104.f()) {
            if (componentCallbacksC1101xa17d4670 != null && m7687x46e5d6ff(componentCallbacksC1101xa17d4670) && componentCallbacksC1101xa17d4670.m7535xde607ed7(menu)) {
                z17 = true;
            }
        }
        return z17;
    }

    /* renamed from: dispatchPrimaryNavigationFragmentChanged */
    public void m7653x1823a48() {
        s();
        e(this.f3506x9034440e);
    }

    /* renamed from: dispatchResume */
    public void m7654xa1613547() {
        this.f3513xcdefe4c3 = false;
        this.f3514x2dc844a0 = false;
        this.f3499x6e535682.f93041m = false;
        f(7);
    }

    /* renamed from: dispatchStart */
    public void m7655x81284c08() {
        this.f3513xcdefe4c3 = false;
        this.f3514x2dc844a0 = false;
        this.f3499x6e535682.f93041m = false;
        f(5);
    }

    /* renamed from: dispatchStop */
    public void m7656xb195f39c() {
        this.f3514x2dc844a0 = true;
        this.f3499x6e535682.f93041m = true;
        f(4);
    }

    /* renamed from: dispatchViewCreated */
    public void m7657x44233ba9() {
        f(2);
    }

    /* renamed from: dump */
    public void m7658x2f39f4(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        int size;
        int size2;
        java.lang.String str2 = str + "    ";
        p012xc85e97e9.p087x9da2e250.app.f2 f2Var = this.f3490x27342104;
        f2Var.getClass();
        java.lang.String str3 = str + "    ";
        java.util.HashMap hashMap = f2Var.f92846b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (p012xc85e97e9.p087x9da2e250.app.d2 d2Var : hashMap.values()) {
                printWriter.print(str);
                if (d2Var != null) {
                    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = d2Var.f92837c;
                    printWriter.println(componentCallbacksC1101xa17d4670);
                    componentCallbacksC1101xa17d4670.mo7426x2f39f4(str3, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        java.util.ArrayList arrayList = f2Var.f92845a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i17 = 0; i17 < size3; i17++) {
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) arrayList.get(i17);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i17);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC1101xa17d46702.mo7591x9616526c());
            }
        }
        java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> arrayList2 = this.f3482xdf651f9;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i18 = 0; i18 < size2; i18++) {
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46703 = this.f3482xdf651f9.get(i18);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i18);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC1101xa17d46703.mo7591x9616526c());
            }
        }
        java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.a> arrayList3 = this.f3478xc9a30ff4;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i19 = 0; i19 < size; i19++) {
                p012xc85e97e9.p087x9da2e250.app.a aVar = this.f3478xc9a30ff4.get(i19);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i19);
                printWriter.print(": ");
                printWriter.println(aVar.m7738x9616526c());
                aVar.q(str2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3480x185013e.get());
        synchronized (this.f3504x3a30b933) {
            int size4 = this.f3504x3a30b933.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i27 = 0; i27 < size4; i27++) {
                    java.lang.Object obj = (p012xc85e97e9.p087x9da2e250.app.q1) this.f3504x3a30b933.get(i27);
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
        printWriter.println(this.f3493x6226bb5);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3481x62389694);
        if (this.f3503x14172f77 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3503x14172f77);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3483x459b61be);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3513xcdefe4c3);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3514x2dc844a0);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3485xf122e02c);
        if (this.f3498xcf29297d) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3498xcf29297d);
        }
    }

    public final void e(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (componentCallbacksC1101xa17d4670 == null || !componentCallbacksC1101xa17d4670.m7427xb2c87fbf(m7663x4cce298f(componentCallbacksC1101xa17d4670.f3465x32e011))) {
            return;
        }
        componentCallbacksC1101xa17d4670.m7536x9ab5812f();
    }

    /* renamed from: enqueueAction */
    public void m7659x12dd525e(p012xc85e97e9.p087x9da2e250.app.q1 q1Var, boolean z17) {
        if (!z17) {
            if (this.f3493x6226bb5 == null) {
                if (!this.f3485xf122e02c) {
                    throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
            }
            if (m7690x7328e940()) {
                throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f3504x3a30b933) {
            if (this.f3493x6226bb5 == null) {
                if (!z17) {
                    throw new java.lang.IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f3504x3a30b933.add(q1Var);
                m7721xec221aae();
            }
        }
    }

    /* renamed from: execPendingActions */
    public boolean m7660x13596257(boolean z17) {
        boolean z18;
        h(z17);
        boolean z19 = false;
        while (true) {
            java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.a> arrayList = this.f3517xc4dfd578;
            java.util.ArrayList<java.lang.Boolean> arrayList2 = this.f3516x8066317d;
            synchronized (this.f3504x3a30b933) {
                if (this.f3504x3a30b933.isEmpty()) {
                    z18 = false;
                } else {
                    int size = this.f3504x3a30b933.size();
                    z18 = false;
                    for (int i17 = 0; i17 < size; i17++) {
                        z18 |= this.f3504x3a30b933.get(i17).a(arrayList, arrayList2);
                    }
                    this.f3504x3a30b933.clear();
                    this.f3493x6226bb5.f93028f.removeCallbacks(this.f3486xa6c35575);
                }
            }
            if (!z18) {
                break;
            }
            z19 = true;
            this.f3487x6994cc38 = true;
            try {
                o(this.f3517xc4dfd578, this.f3516x8066317d);
            } finally {
                c();
            }
        }
        s();
        if (this.f3492xaff43281) {
            this.f3492xaff43281 = false;
            q();
        }
        this.f3490x27342104.f92846b.values().removeAll(java.util.Collections.singleton(null));
        return z19;
    }

    /* renamed from: execSingleAction */
    public void m7661xcc7853cf(p012xc85e97e9.p087x9da2e250.app.q1 q1Var, boolean z17) {
        if (z17 && (this.f3493x6226bb5 == null || this.f3485xf122e02c)) {
            return;
        }
        h(z17);
        if (q1Var.a(this.f3517xc4dfd578, this.f3516x8066317d)) {
            this.f3487x6994cc38 = true;
            try {
                o(this.f3517xc4dfd578, this.f3516x8066317d);
            } finally {
                c();
            }
        }
        s();
        if (this.f3492xaff43281) {
            this.f3492xaff43281 = false;
            q();
        }
        this.f3490x27342104.f92846b.values().removeAll(java.util.Collections.singleton(null));
    }

    /* renamed from: executePendingTransactions */
    public boolean m7662x588126d7() {
        boolean m7660x13596257 = m7660x13596257(true);
        k();
        return m7660x13596257;
    }

    public final void f(int i17) {
        try {
            this.f3487x6994cc38 = true;
            for (p012xc85e97e9.p087x9da2e250.app.d2 d2Var : this.f3490x27342104.f92846b.values()) {
                if (d2Var != null) {
                    d2Var.f92839e = i17;
                }
            }
            m7695xc25739c5(i17, false);
            if (f3476xa4a928e7) {
                java.util.Iterator it = ((java.util.HashSet) d()).iterator();
                while (it.hasNext()) {
                    ((p012xc85e97e9.p087x9da2e250.app.n3) it.next()).e();
                }
            }
            this.f3487x6994cc38 = false;
            m7660x13596257(true);
        } catch (java.lang.Throwable th6) {
            this.f3487x6994cc38 = false;
            throw th6;
        }
    }

    /* renamed from: findActiveFragment */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7663x4cce298f(java.lang.String str) {
        return this.f3490x27342104.b(str);
    }

    /* renamed from: findFragmentById */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7664x6f4c869b(int i17) {
        p012xc85e97e9.p087x9da2e250.app.f2 f2Var = this.f3490x27342104;
        java.util.ArrayList arrayList = f2Var.f92845a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (p012xc85e97e9.p087x9da2e250.app.d2 d2Var : f2Var.f92846b.values()) {
                    if (d2Var != null) {
                        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = d2Var.f92837c;
                        if (componentCallbacksC1101xa17d4670.f3426x9ca58fd8 == i17) {
                            return componentCallbacksC1101xa17d4670;
                        }
                    }
                }
                return null;
            }
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) arrayList.get(size);
            if (componentCallbacksC1101xa17d46702 != null && componentCallbacksC1101xa17d46702.f3426x9ca58fd8 == i17) {
                return componentCallbacksC1101xa17d46702;
            }
        }
    }

    /* renamed from: findFragmentByTag */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7665x7a44761a(java.lang.String str) {
        p012xc85e97e9.p087x9da2e250.app.f2 f2Var = this.f3490x27342104;
        if (str != null) {
            java.util.ArrayList arrayList = f2Var.f92845a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) arrayList.get(size);
                if (componentCallbacksC1101xa17d4670 != null && str.equals(componentCallbacksC1101xa17d4670.f3457x32d3ed)) {
                    return componentCallbacksC1101xa17d4670;
                }
            }
        }
        if (str != null) {
            for (p012xc85e97e9.p087x9da2e250.app.d2 d2Var : f2Var.f92846b.values()) {
                if (d2Var != null) {
                    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = d2Var.f92837c;
                    if (str.equals(componentCallbacksC1101xa17d46702.f3457x32d3ed)) {
                        return componentCallbacksC1101xa17d46702;
                    }
                }
            }
        } else {
            f2Var.getClass();
        }
        return null;
    }

    /* renamed from: findFragmentByWho */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7666x7a44823e(java.lang.String str) {
        return this.f3490x27342104.c(str);
    }

    public final void g() {
        if (f3476xa4a928e7) {
            java.util.Iterator it = ((java.util.HashSet) d()).iterator();
            while (it.hasNext()) {
                ((p012xc85e97e9.p087x9da2e250.app.n3) it.next()).e();
            }
        } else {
            if (this.f3488x1c3e56ef.isEmpty()) {
                return;
            }
            for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : this.f3488x1c3e56ef.keySet()) {
                b(componentCallbacksC1101xa17d4670);
                m7696xc25739c5(componentCallbacksC1101xa17d4670);
            }
        }
    }

    /* renamed from: getActiveFragmentCount */
    public int m7667xde7b1803() {
        return this.f3490x27342104.f92846b.size();
    }

    /* renamed from: getActiveFragments */
    public java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7668x15156187() {
        return this.f3490x27342104.e();
    }

    /* renamed from: getBackStackEntryAt */
    public p012xc85e97e9.p087x9da2e250.app.k1 m7669x6358c69a(int i17) {
        return this.f3478xc9a30ff4.get(i17);
    }

    /* renamed from: getBackStackEntryCount */
    public int m7670x180b2948() {
        java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.a> arrayList = this.f3478xc9a30ff4;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: getContainer */
    public p012xc85e97e9.p087x9da2e250.app.s0 m7671xe6eebdcb() {
        return this.f3481x62389694;
    }

    /* renamed from: getFragment */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7672x197d1fc6(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7663x4cce298f = m7663x4cce298f(string);
        if (m7663x4cce298f != null) {
            return m7663x4cce298f;
        }
        r(new java.lang.IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    /* renamed from: getFragmentFactory */
    public p012xc85e97e9.p087x9da2e250.app.u0 m7673x6e9e7e64() {
        p012xc85e97e9.p087x9da2e250.app.u0 u0Var = this.f3489x59eadc6d;
        if (u0Var != null) {
            return u0Var;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f3503x14172f77;
        return componentCallbacksC1101xa17d4670 != null ? componentCallbacksC1101xa17d4670.f3427xccc8bb10.m7673x6e9e7e64() : this.f3494x744b7825;
    }

    /* renamed from: getFragmentStore */
    public p012xc85e97e9.p087x9da2e250.app.f2 m7674x8985d4bb() {
        return this.f3490x27342104;
    }

    /* renamed from: getFragments */
    public java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d() {
        return this.f3490x27342104.f();
    }

    /* renamed from: getHost */
    public p012xc85e97e9.p087x9da2e250.app.v0 m7676xfb805e1e() {
        return this.f3493x6226bb5;
    }

    /* renamed from: getLayoutInflaterFactory */
    public android.view.LayoutInflater.Factory2 m7677x9866b4ff() {
        return this.f3496x408ca848;
    }

    /* renamed from: getLifecycleCallbacksDispatcher */
    public p012xc85e97e9.p087x9da2e250.app.z0 m7678x8960e0c1() {
        return this.f3497xba695958;
    }

    /* renamed from: getParent */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7679x29c22ba0() {
        return this.f3503x14172f77;
    }

    /* renamed from: getPrimaryNavigationFragment */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7680x1025a770() {
        return this.f3506x9034440e;
    }

    /* renamed from: getSpecialEffectsControllerFactory */
    public p012xc85e97e9.p087x9da2e250.app.o3 m7681xbcf8108f() {
        p012xc85e97e9.p087x9da2e250.app.o3 o3Var = this.f3510xc5c13c98;
        if (o3Var != null) {
            return o3Var;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f3503x14172f77;
        return componentCallbacksC1101xa17d4670 != null ? componentCallbacksC1101xa17d4670.f3427xccc8bb10.m7681xbcf8108f() : this.f3484xff7d5f11;
    }

    /* renamed from: getViewModelStore */
    public p012xc85e97e9.p093xedfae76a.l1 m7682x119738b3(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        java.util.HashMap hashMap = this.f3499x6e535682.f93037f;
        p012xc85e97e9.p093xedfae76a.l1 l1Var = (p012xc85e97e9.p093xedfae76a.l1) hashMap.get(componentCallbacksC1101xa17d4670.f3465x32e011);
        if (l1Var != null) {
            return l1Var;
        }
        p012xc85e97e9.p093xedfae76a.l1 l1Var2 = new p012xc85e97e9.p093xedfae76a.l1();
        hashMap.put(componentCallbacksC1101xa17d4670.f3465x32e011, l1Var2);
        return l1Var2;
    }

    public final void h(boolean z17) {
        if (this.f3487x6994cc38) {
            throw new java.lang.IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f3493x6226bb5 == null) {
            if (!this.f3485xf122e02c) {
                throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
        }
        if (android.os.Looper.myLooper() != this.f3493x6226bb5.f93028f.getLooper()) {
            throw new java.lang.IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z17 && m7690x7328e940()) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f3517xc4dfd578 == null) {
            this.f3517xc4dfd578 = new java.util.ArrayList<>();
            this.f3516x8066317d = new java.util.ArrayList<>();
        }
        this.f3487x6994cc38 = true;
        try {
            j(null, null);
        } finally {
            this.f3487x6994cc38 = false;
        }
    }

    /* renamed from: handleOnBackPressed */
    public void m7683xc0eac894() {
        m7660x13596257(true);
        if (this.f3501xc6673d4.m2524x7d80d2b7()) {
            m7705x96eafb01();
        } else {
            this.f3502xcd1dc676.c();
        }
    }

    /* renamed from: hideFragment */
    public void m7684xbf25c1b2(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (m7619x11f226ac(2)) {
            java.util.Objects.toString(componentCallbacksC1101xa17d4670);
        }
        if (componentCallbacksC1101xa17d4670.f3430x6dac477) {
            return;
        }
        componentCallbacksC1101xa17d4670.f3430x6dac477 = true;
        componentCallbacksC1101xa17d4670.f3431xaf30923d = true ^ componentCallbacksC1101xa17d4670.f3431xaf30923d;
        p(componentCallbacksC1101xa17d4670);
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
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.i(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: invalidateMenuForFragment */
    public void m7685xc99a549f(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (componentCallbacksC1101xa17d4670.f3414xbdc32c93 && m(componentCallbacksC1101xa17d4670)) {
            this.f3498xcf29297d = true;
        }
    }

    /* renamed from: isDestroyed */
    public boolean m7686xbca8d80f() {
        return this.f3485xf122e02c;
    }

    /* renamed from: isParentMenuVisible */
    public boolean m7687x46e5d6ff(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (componentCallbacksC1101xa17d4670 == null) {
            return true;
        }
        return componentCallbacksC1101xa17d4670.m7487x20aa1689();
    }

    /* renamed from: isPrimaryNavigation */
    public boolean m7688x6993c5ac(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (componentCallbacksC1101xa17d4670 == null) {
            return true;
        }
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = componentCallbacksC1101xa17d4670.f3427xccc8bb10;
        return componentCallbacksC1101xa17d4670.m7427xb2c87fbf(abstractC1104xc1ad431d.m7680x1025a770()) && m7688x6993c5ac(abstractC1104xc1ad431d.f3503x14172f77);
    }

    /* renamed from: isStateAtLeast */
    public boolean m7689xb27faa6f(int i17) {
        return this.f3483x459b61be >= i17;
    }

    /* renamed from: isStateSaved */
    public boolean m7690x7328e940() {
        return this.f3513xcdefe4c3 || this.f3514x2dc844a0;
    }

    public final void j(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        boolean z17;
        int indexOf;
        p012xc85e97e9.p087x9da2e250.app.a aVar;
        int indexOf2;
        java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.s1> arrayList3 = this.f3505x96597096;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i17 = 0;
        while (i17 < size) {
            p012xc85e97e9.p087x9da2e250.app.s1 s1Var = this.f3505x96597096.get(i17);
            if (arrayList == null || s1Var.f93004a || (indexOf2 = arrayList.indexOf((aVar = s1Var.f93005b))) == -1 || arrayList2 == null || !((java.lang.Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                boolean z18 = s1Var.f93006c == 0;
                p012xc85e97e9.p087x9da2e250.app.a aVar2 = s1Var.f93005b;
                if (z18 || (arrayList != null && aVar2.u(arrayList, 0, arrayList.size()))) {
                    this.f3505x96597096.remove(i17);
                    i17--;
                    size--;
                    if (arrayList == null || (z17 = s1Var.f93004a) || (indexOf = arrayList.indexOf(aVar2)) == -1 || arrayList2 == null || !((java.lang.Boolean) arrayList2.get(indexOf)).booleanValue()) {
                        s1Var.a();
                    } else {
                        aVar2.f92782r.m7634xb663bfc(aVar2, z17, false, false);
                    }
                }
            } else {
                this.f3505x96597096.remove(i17);
                i17--;
                size--;
                aVar.f92782r.m7634xb663bfc(aVar, s1Var.f93004a, false, false);
            }
            i17++;
        }
    }

    public final void k() {
        if (!f3476xa4a928e7) {
            if (this.f3505x96597096 != null) {
                while (!this.f3505x96597096.isEmpty()) {
                    this.f3505x96597096.remove(0).a();
                }
                return;
            }
            return;
        }
        java.util.Iterator it = ((java.util.HashSet) d()).iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p087x9da2e250.app.n3 n3Var = (p012xc85e97e9.p087x9da2e250.app.n3) it.next();
            if (n3Var.f92957e) {
                n3Var.f92957e = false;
                n3Var.c();
            }
        }
    }

    public final android.view.ViewGroup l(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        android.view.ViewGroup viewGroup = componentCallbacksC1101xa17d4670.f3420x62389694;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC1101xa17d4670.f3421xb66d4acf > 0 && this.f3481x62389694.c()) {
            android.view.View b17 = this.f3481x62389694.b(componentCallbacksC1101xa17d4670.f3421xb66d4acf);
            if (b17 instanceof android.view.ViewGroup) {
                return (android.view.ViewGroup) b17;
            }
        }
        return null;
    }

    /* renamed from: launchRequestPermissions */
    public void m7691x445a4388(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, java.lang.String[] strArr, int i17) {
        if (this.f3507x62cd25c2 == null) {
            this.f3493x6226bb5.g(componentCallbacksC1101xa17d4670, strArr, i17);
            return;
        }
        this.f3495x515163c4.addLast(new p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.LaunchedFragmentInfo(componentCallbacksC1101xa17d4670.f3465x32e011, i17));
        this.f3507x62cd25c2.a(strArr, null);
    }

    /* renamed from: launchStartActivityForResult */
    public void m7692x1acb3748(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        if (this.f3511x242e6c82 == null) {
            this.f3493x6226bb5.j(componentCallbacksC1101xa17d4670, intent, i17, bundle);
            return;
        }
        this.f3495x515163c4.addLast(new p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.LaunchedFragmentInfo(componentCallbacksC1101xa17d4670.f3465x32e011, i17));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f3511x242e6c82.a(intent, null);
    }

    /* renamed from: launchStartIntentSenderForResult */
    public void m7693x8a07a026(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle) {
        android.content.Intent intent2;
        if (this.f3512x17f9a860 == null) {
            this.f3493x6226bb5.k(componentCallbacksC1101xa17d4670, intentSender, i17, intent, i18, i19, i27, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new android.content.Intent();
                intent2.putExtra(f3474xed5ab88d, true);
            } else {
                intent2 = intent;
            }
            if (m7619x11f226ac(2)) {
                bundle.toString();
                intent2.toString();
                java.util.Objects.toString(componentCallbacksC1101xa17d4670);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0061xc6e4d93e c0061xc6e4d93e = new p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0061xc6e4d93e(intentSender, intent2, i18, i19);
        this.f3495x515163c4.addLast(new p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.LaunchedFragmentInfo(componentCallbacksC1101xa17d4670.f3465x32e011, i17));
        if (m7619x11f226ac(2)) {
            componentCallbacksC1101xa17d4670.mo7591x9616526c();
        }
        this.f3512x17f9a860.a(c0061xc6e4d93e, null);
    }

    public final boolean m(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        return (componentCallbacksC1101xa17d4670.f3429xc79ff1ec && componentCallbacksC1101xa17d4670.f3440x1ec28b66) || componentCallbacksC1101xa17d4670.f3419xfdaae8e.m7631xaa6d70d3();
    }

    /* renamed from: moveFragmentToExpectedState */
    public void m7694x82878e7d(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        android.animation.Animator animator;
        if (!(this.f3490x27342104.f92846b.get(componentCallbacksC1101xa17d4670.f3465x32e011) != null)) {
            if (m7619x11f226ac(3)) {
                componentCallbacksC1101xa17d4670.mo7591x9616526c();
                m7730x9616526c();
                return;
            }
            return;
        }
        m7696xc25739c5(componentCallbacksC1101xa17d4670);
        android.view.View view = componentCallbacksC1101xa17d4670.f3462x628b0b2;
        if (view != null && componentCallbacksC1101xa17d4670.f3435xfc98abaa && componentCallbacksC1101xa17d4670.f3420x62389694 != null) {
            float f17 = componentCallbacksC1101xa17d4670.f3445x88c9013d;
            if (f17 > 0.0f) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(f17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "androidx/fragment/app/FragmentManager", "moveFragmentToExpectedState", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "androidx/fragment/app/FragmentManager", "moveFragmentToExpectedState", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            componentCallbacksC1101xa17d4670.f3445x88c9013d = 0.0f;
            componentCallbacksC1101xa17d4670.f3435xfc98abaa = false;
            p012xc85e97e9.p087x9da2e250.app.p0 a17 = p012xc85e97e9.p087x9da2e250.app.r0.a(this.f3493x6226bb5.f93027e, componentCallbacksC1101xa17d4670, true, componentCallbacksC1101xa17d4670.m7455x6c0812a4());
            if (a17 != null) {
                android.view.animation.Animation animation = a17.f92981a;
                if (animation != null) {
                    componentCallbacksC1101xa17d4670.f3462x628b0b2.startAnimation(animation);
                } else {
                    android.view.View view2 = componentCallbacksC1101xa17d4670.f3462x628b0b2;
                    android.animation.Animator animator2 = a17.f92982b;
                    animator2.setTarget(view2);
                    animator2.start();
                }
            }
        }
        if (componentCallbacksC1101xa17d4670.f3431xaf30923d) {
            if (componentCallbacksC1101xa17d4670.f3462x628b0b2 != null) {
                p012xc85e97e9.p087x9da2e250.app.p0 a18 = p012xc85e97e9.p087x9da2e250.app.r0.a(this.f3493x6226bb5.f93027e, componentCallbacksC1101xa17d4670, true ^ componentCallbacksC1101xa17d4670.f3430x6dac477, componentCallbacksC1101xa17d4670.m7455x6c0812a4());
                if (a18 == null || (animator = a18.f92982b) == null) {
                    if (a18 != null) {
                        android.view.View view3 = componentCallbacksC1101xa17d4670.f3462x628b0b2;
                        android.view.animation.Animation animation2 = a18.f92981a;
                        view3.startAnimation(animation2);
                        animation2.start();
                    }
                    int i17 = (!componentCallbacksC1101xa17d4670.f3430x6dac477 || componentCallbacksC1101xa17d4670.m7484xda7b75dc()) ? 0 : 8;
                    android.view.View view4 = componentCallbacksC1101xa17d4670.f3462x628b0b2;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view4, arrayList2.toArray(), "androidx/fragment/app/FragmentManager", "completeShowHideFragment", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view4, "androidx/fragment/app/FragmentManager", "completeShowHideFragment", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (componentCallbacksC1101xa17d4670.m7484xda7b75dc()) {
                        componentCallbacksC1101xa17d4670.m7569x9f181114(false);
                    }
                } else {
                    animator.setTarget(componentCallbacksC1101xa17d4670.f3462x628b0b2);
                    if (!componentCallbacksC1101xa17d4670.f3430x6dac477) {
                        android.view.View view5 = componentCallbacksC1101xa17d4670.f3462x628b0b2;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view5, arrayList3.toArray(), "androidx/fragment/app/FragmentManager", "completeShowHideFragment", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view5, "androidx/fragment/app/FragmentManager", "completeShowHideFragment", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else if (componentCallbacksC1101xa17d4670.m7484xda7b75dc()) {
                        componentCallbacksC1101xa17d4670.m7569x9f181114(false);
                    } else {
                        android.view.ViewGroup viewGroup = componentCallbacksC1101xa17d4670.f3420x62389694;
                        android.view.View view6 = componentCallbacksC1101xa17d4670.f3462x628b0b2;
                        viewGroup.startViewTransition(view6);
                        animator.addListener(new p012xc85e97e9.p087x9da2e250.app.h1(this, viewGroup, view6, componentCallbacksC1101xa17d4670));
                    }
                    animator.start();
                }
            }
            m7685xc99a549f(componentCallbacksC1101xa17d4670);
            componentCallbacksC1101xa17d4670.f3431xaf30923d = false;
            componentCallbacksC1101xa17d4670.mo7506x87316e0b(componentCallbacksC1101xa17d4670.f3430x6dac477);
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
    /* renamed from: moveToState */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m7697xc25739c5(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 r17, int r18) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7697xc25739c5(androidx.fragment.app.Fragment, int):void");
    }

    public final boolean n(java.lang.String str, int i17, int i18) {
        m7660x13596257(false);
        h(true);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f3506x9034440e;
        if (componentCallbacksC1101xa17d4670 != null && i17 < 0 && str == null && componentCallbacksC1101xa17d4670.m7437x54c0aef7().m7705x96eafb01()) {
            return true;
        }
        boolean m7708x28372fe1 = m7708x28372fe1(this.f3517xc4dfd578, this.f3516x8066317d, str, i17, i18);
        if (m7708x28372fe1) {
            this.f3487x6994cc38 = true;
            try {
                o(this.f3517xc4dfd578, this.f3516x8066317d);
            } finally {
                c();
            }
        }
        s();
        if (this.f3492xaff43281) {
            this.f3492xaff43281 = false;
            q();
        }
        this.f3490x27342104.f92846b.values().removeAll(java.util.Collections.singleton(null));
        return m7708x28372fe1;
    }

    /* renamed from: noteStateNotSaved */
    public void m7698x18332053() {
        if (this.f3493x6226bb5 == null) {
            return;
        }
        this.f3513xcdefe4c3 = false;
        this.f3514x2dc844a0 = false;
        this.f3499x6e535682.f93041m = false;
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : this.f3490x27342104.f()) {
            if (componentCallbacksC1101xa17d4670 != null) {
                componentCallbacksC1101xa17d4670.m7494x18332053();
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
            if (!((p012xc85e97e9.p087x9da2e250.app.a) arrayList.get(i17)).f92892p) {
                if (i18 != i17) {
                    i(arrayList, arrayList2, i18, i17);
                }
                i18 = i17 + 1;
                if (((java.lang.Boolean) arrayList2.get(i17)).booleanValue()) {
                    while (i18 < size && ((java.lang.Boolean) arrayList2.get(i18)).booleanValue() && !((p012xc85e97e9.p087x9da2e250.app.a) arrayList.get(i18)).f92892p) {
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

    /* renamed from: onContainerAvailable */
    public void m7699x680f8f87(p012xc85e97e9.p087x9da2e250.app.C1103x8ca9b236 c1103x8ca9b236) {
        android.view.View view;
        java.util.Iterator it = ((java.util.ArrayList) this.f3490x27342104.d()).iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p087x9da2e250.app.d2 d2Var = (p012xc85e97e9.p087x9da2e250.app.d2) it.next();
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = d2Var.f92837c;
            if (componentCallbacksC1101xa17d4670.f3421xb66d4acf == c1103x8ca9b236.getId() && (view = componentCallbacksC1101xa17d4670.f3462x628b0b2) != null && view.getParent() == null) {
                componentCallbacksC1101xa17d4670.f3420x62389694 = c1103x8ca9b236;
                d2Var.a();
            }
        }
    }

    @java.lang.Deprecated
    /* renamed from: openTransaction */
    public p012xc85e97e9.p087x9da2e250.app.i2 m7700x123c6234() {
        return m7630xb2c12e75();
    }

    public final void p(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        android.view.ViewGroup l17 = l(componentCallbacksC1101xa17d4670);
        if (l17 == null || componentCallbacksC1101xa17d4670.m7439xcc408253() + componentCallbacksC1101xa17d4670.m7442xfd4b6dc5() + componentCallbacksC1101xa17d4670.m7456x723b1c2e() + componentCallbacksC1101xa17d4670.m7457x4cf8ac8a() <= 0) {
            return;
        }
        if (l17.getTag(com.p314xaae8f345.mm.R.id.p3q) == null) {
            l17.setTag(com.p314xaae8f345.mm.R.id.p3q, componentCallbacksC1101xa17d4670);
        }
        ((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) l17.getTag(com.p314xaae8f345.mm.R.id.p3q)).m7574xa2510db0(componentCallbacksC1101xa17d4670.m7455x6c0812a4());
    }

    /* renamed from: performPendingDeferredStart */
    public void m7701xf4b0b46d(p012xc85e97e9.p087x9da2e250.app.d2 d2Var) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = d2Var.f92837c;
        if (componentCallbacksC1101xa17d4670.f3424xd1bf805d) {
            if (this.f3487x6994cc38) {
                this.f3492xaff43281 = true;
                return;
            }
            componentCallbacksC1101xa17d4670.f3424xd1bf805d = false;
            if (f3476xa4a928e7) {
                d2Var.j();
            } else {
                m7696xc25739c5(componentCallbacksC1101xa17d4670);
            }
        }
    }

    /* renamed from: popBackStack */
    public void m7702x93613e90() {
        m7659x12dd525e(new p012xc85e97e9.p087x9da2e250.app.r1(this, null, -1, 0), false);
    }

    /* renamed from: popBackStackImmediate */
    public boolean m7705x96eafb01() {
        return n(null, -1, 0);
    }

    /* renamed from: popBackStackState */
    public boolean m7708x28372fe1(java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.a> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2, java.lang.String str, int i17, int i18) {
        int i19;
        java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.a> arrayList3 = this.f3478xc9a30ff4;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i17 < 0 && (i18 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3478xc9a30ff4.remove(size));
            arrayList2.add(java.lang.Boolean.TRUE);
        } else {
            if (str != null || i17 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    p012xc85e97e9.p087x9da2e250.app.a aVar = this.f3478xc9a30ff4.get(size2);
                    if ((str != null && str.equals(aVar.f92885i)) || (i17 >= 0 && i17 == aVar.f92784t)) {
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
                        p012xc85e97e9.p087x9da2e250.app.a aVar2 = this.f3478xc9a30ff4.get(size2);
                        if (str == null || !str.equals(aVar2.f92885i)) {
                            if (i17 < 0 || i17 != aVar2.f92784t) {
                                break;
                            }
                        }
                    }
                }
                i19 = size2;
            } else {
                i19 = -1;
            }
            if (i19 == this.f3478xc9a30ff4.size() - 1) {
                return false;
            }
            for (int size3 = this.f3478xc9a30ff4.size() - 1; size3 > i19; size3--) {
                arrayList.add(this.f3478xc9a30ff4.remove(size3));
                arrayList2.add(java.lang.Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: putFragment */
    public void m7709x9a1e7a7f(android.os.Bundle bundle, java.lang.String str, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (componentCallbacksC1101xa17d4670.f3427xccc8bb10 == this) {
            bundle.putString(str, componentCallbacksC1101xa17d4670.f3465x32e011);
            return;
        }
        r(new java.lang.IllegalStateException("Fragment " + componentCallbacksC1101xa17d4670 + " is not currently in the FragmentManager"));
        throw null;
    }

    public final void q() {
        java.util.Iterator it = ((java.util.ArrayList) this.f3490x27342104.d()).iterator();
        while (it.hasNext()) {
            m7701xf4b0b46d((p012xc85e97e9.p087x9da2e250.app.d2) it.next());
        }
    }

    public final void r(java.lang.RuntimeException runtimeException) {
        runtimeException.getMessage();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(new p012xc85e97e9.p087x9da2e250.app.f3(TAG));
        p012xc85e97e9.p087x9da2e250.app.v0 v0Var = this.f3493x6226bb5;
        try {
            if (v0Var != null) {
                v0Var.d("  ", null, printWriter, new java.lang.String[0]);
            } else {
                m7658x2f39f4("  ", null, printWriter, new java.lang.String[0]);
            }
            throw runtimeException;
        } catch (java.lang.Exception unused) {
            throw runtimeException;
        }
    }

    /* renamed from: registerFragmentLifecycleCallbacks */
    public void m7710xb6be77f7(p012xc85e97e9.p087x9da2e250.app.m1 m1Var, boolean z17) {
        this.f3497xba695958.f93059a.add(new p012xc85e97e9.p087x9da2e250.app.y0(m1Var, z17));
    }

    /* renamed from: removeCancellationSignal */
    public void m7711x134df12f(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, j3.h hVar) {
        java.util.HashSet<j3.h> hashSet = this.f3488x1c3e56ef.get(componentCallbacksC1101xa17d4670);
        if (hashSet != null && hashSet.remove(hVar) && hashSet.isEmpty()) {
            this.f3488x1c3e56ef.remove(componentCallbacksC1101xa17d4670);
            if (componentCallbacksC1101xa17d4670.f3456xbec81024 < 5) {
                componentCallbacksC1101xa17d4670.m7526x6ca0cb9e();
                this.f3497xba695958.n(componentCallbacksC1101xa17d4670, false);
                componentCallbacksC1101xa17d4670.f3420x62389694 = null;
                componentCallbacksC1101xa17d4670.f3462x628b0b2 = null;
                componentCallbacksC1101xa17d4670.f3463xdf3b8abb = null;
                componentCallbacksC1101xa17d4670.f3464xfe61c291.mo523x53d8522f(null);
                componentCallbacksC1101xa17d4670.f3433x2866c3c = false;
                m7696xc25739c5(componentCallbacksC1101xa17d4670);
            }
        }
    }

    /* renamed from: removeFragment */
    public void m7712x3e997af4(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (m7619x11f226ac(2)) {
            java.util.Objects.toString(componentCallbacksC1101xa17d4670);
            int i17 = componentCallbacksC1101xa17d4670.f3417xae473bf6;
        }
        boolean z17 = !componentCallbacksC1101xa17d4670.m7485x7bae6eb2();
        if (!componentCallbacksC1101xa17d4670.f3425x634032ff || z17) {
            p012xc85e97e9.p087x9da2e250.app.f2 f2Var = this.f3490x27342104;
            synchronized (f2Var.f92845a) {
                f2Var.f92845a.remove(componentCallbacksC1101xa17d4670);
            }
            componentCallbacksC1101xa17d4670.f3414xbdc32c93 = false;
            if (m(componentCallbacksC1101xa17d4670)) {
                this.f3498xcf29297d = true;
            }
            componentCallbacksC1101xa17d4670.f3447x66cabce = true;
            p(componentCallbacksC1101xa17d4670);
        }
    }

    /* renamed from: removeFragmentOnAttachListener */
    public void m7713x56b900ec(p012xc85e97e9.p087x9da2e250.app.x1 x1Var) {
        this.f3500xab2f18ae.remove(x1Var);
    }

    /* renamed from: removeOnBackStackChangedListener */
    public void m7714x2f68680a(p012xc85e97e9.p087x9da2e250.app.p1 p1Var) {
        java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.p1> arrayList = this.f3479x535145db;
        if (arrayList != null) {
            arrayList.remove(p1Var);
        }
    }

    /* renamed from: removeRetainedFragment */
    public void m7715x96b42778(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        this.f3499x6e535682.P6(componentCallbacksC1101xa17d4670);
    }

    /* renamed from: restoreAllState */
    public void m7716x6cf001e(android.os.Parcelable parcelable, p012xc85e97e9.p087x9da2e250.app.t1 t1Var) {
        if (this.f3493x6226bb5 instanceof p012xc85e97e9.p093xedfae76a.m1) {
            r(new java.lang.IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
            throw null;
        }
        this.f3499x6e535682.Q6(t1Var);
        m7717xf720c626(parcelable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: restoreSaveState */
    public void m7717xf720c626(android.os.Parcelable parcelable) {
        int i17;
        p012xc85e97e9.p087x9da2e250.app.d2 d2Var;
        if (parcelable == null) {
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.C1106xcd68fb74 c1106xcd68fb74 = (p012xc85e97e9.p087x9da2e250.app.C1106xcd68fb74) parcelable;
        if (c1106xcd68fb74.f92748d == null) {
            return;
        }
        this.f3490x27342104.f92846b.clear();
        java.util.Iterator it = c1106xcd68fb74.f92748d.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p087x9da2e250.app.C1107xfbc51401 c1107xfbc51401 = (p012xc85e97e9.p087x9da2e250.app.C1107xfbc51401) it.next();
            if (c1107xfbc51401 != null) {
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) this.f3499x6e535682.f93035d.get(c1107xfbc51401.f92757e);
                if (componentCallbacksC1101xa17d4670 != null) {
                    if (m7619x11f226ac(2)) {
                        componentCallbacksC1101xa17d4670.mo7591x9616526c();
                    }
                    d2Var = new p012xc85e97e9.p087x9da2e250.app.d2(this.f3497xba695958, this.f3490x27342104, componentCallbacksC1101xa17d4670, c1107xfbc51401);
                } else {
                    d2Var = new p012xc85e97e9.p087x9da2e250.app.d2(this.f3497xba695958, this.f3490x27342104, this.f3493x6226bb5.f93027e.getClassLoader(), m7673x6e9e7e64(), c1107xfbc51401);
                }
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = d2Var.f92837c;
                componentCallbacksC1101xa17d46702.f3427xccc8bb10 = this;
                if (m7619x11f226ac(2)) {
                    componentCallbacksC1101xa17d46702.mo7591x9616526c();
                }
                d2Var.k(this.f3493x6226bb5.f93027e.getClassLoader());
                this.f3490x27342104.g(d2Var);
                d2Var.f92839e = this.f3483x459b61be;
            }
        }
        p012xc85e97e9.p087x9da2e250.app.w1 w1Var = this.f3499x6e535682;
        w1Var.getClass();
        java.util.Iterator it6 = new java.util.ArrayList(w1Var.f93035d.values()).iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46703 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) it6.next();
            if ((this.f3490x27342104.f92846b.get(componentCallbacksC1101xa17d46703.f3465x32e011) != null ? 1 : 0) == 0) {
                if (m7619x11f226ac(2)) {
                    componentCallbacksC1101xa17d46703.mo7591x9616526c();
                    java.util.Objects.toString(c1106xcd68fb74.f92748d);
                }
                this.f3499x6e535682.P6(componentCallbacksC1101xa17d46703);
                componentCallbacksC1101xa17d46703.f3427xccc8bb10 = this;
                p012xc85e97e9.p087x9da2e250.app.d2 d2Var2 = new p012xc85e97e9.p087x9da2e250.app.d2(this.f3497xba695958, this.f3490x27342104, componentCallbacksC1101xa17d46703);
                d2Var2.f92839e = 1;
                d2Var2.j();
                componentCallbacksC1101xa17d46703.f3447x66cabce = true;
                d2Var2.j();
            }
        }
        p012xc85e97e9.p087x9da2e250.app.f2 f2Var = this.f3490x27342104;
        java.util.ArrayList<java.lang.String> arrayList = c1106xcd68fb74.f92749e;
        f2Var.f92845a.clear();
        if (arrayList != null) {
            for (java.lang.String str : arrayList) {
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 b17 = f2Var.b(str);
                if (b17 == null) {
                    throw new java.lang.IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (m7619x11f226ac(2)) {
                    b17.mo7591x9616526c();
                }
                f2Var.a(b17);
            }
        }
        if (c1106xcd68fb74.f92750f != null) {
            this.f3478xc9a30ff4 = new java.util.ArrayList<>(c1106xcd68fb74.f92750f.length);
            int i18 = 0;
            while (true) {
                p012xc85e97e9.p087x9da2e250.app.C1099xbfa85f50[] c1099xbfa85f50Arr = c1106xcd68fb74.f92750f;
                if (i18 >= c1099xbfa85f50Arr.length) {
                    break;
                }
                p012xc85e97e9.p087x9da2e250.app.C1099xbfa85f50 c1099xbfa85f50 = c1099xbfa85f50Arr[i18];
                c1099xbfa85f50.getClass();
                p012xc85e97e9.p087x9da2e250.app.a aVar = new p012xc85e97e9.p087x9da2e250.app.a(this);
                int i19 = 0;
                int i27 = 0;
                while (true) {
                    int[] iArr = c1099xbfa85f50.f92723d;
                    if (i19 >= iArr.length) {
                        break;
                    }
                    p012xc85e97e9.p087x9da2e250.app.h2 h2Var = new p012xc85e97e9.p087x9da2e250.app.h2();
                    int i28 = i19 + 1;
                    h2Var.f92861a = iArr[i19];
                    if (m7619x11f226ac(2)) {
                        aVar.m7738x9616526c();
                        int i29 = iArr[i28];
                    }
                    java.lang.String str2 = (java.lang.String) c1099xbfa85f50.f92724e.get(i27);
                    if (str2 != null) {
                        h2Var.f92862b = m7663x4cce298f(str2);
                    } else {
                        h2Var.f92862b = null;
                    }
                    h2Var.f92867g = p012xc85e97e9.p093xedfae76a.n.m7819xcee59d22()[c1099xbfa85f50.f92725f[i27]];
                    h2Var.f92868h = p012xc85e97e9.p093xedfae76a.n.m7819xcee59d22()[c1099xbfa85f50.f92726g[i27]];
                    int i37 = i28 + 1;
                    int i38 = iArr[i28];
                    h2Var.f92863c = i38;
                    int i39 = i37 + 1;
                    int i47 = iArr[i37];
                    h2Var.f92864d = i47;
                    int i48 = i39 + 1;
                    int i49 = iArr[i39];
                    h2Var.f92865e = i49;
                    int i57 = iArr[i48];
                    h2Var.f92866f = i57;
                    aVar.f92878b = i38;
                    aVar.f92879c = i47;
                    aVar.f92880d = i49;
                    aVar.f92881e = i57;
                    aVar.b(h2Var);
                    i27++;
                    i19 = i48 + 1;
                }
                aVar.f92882f = c1099xbfa85f50.f92727h;
                aVar.f92885i = c1099xbfa85f50.f92728i;
                aVar.f92784t = c1099xbfa85f50.f92729m;
                aVar.f92883g = true;
                aVar.f92886j = c1099xbfa85f50.f92730n;
                aVar.f92887k = c1099xbfa85f50.f92731o;
                aVar.f92888l = c1099xbfa85f50.f92732p;
                aVar.f92889m = c1099xbfa85f50.f92733q;
                aVar.f92890n = c1099xbfa85f50.f92734r;
                aVar.f92891o = c1099xbfa85f50.f92735s;
                aVar.f92892p = c1099xbfa85f50.f92736t;
                aVar.o(1);
                if (m7619x11f226ac(2)) {
                    aVar.m7738x9616526c();
                    java.io.PrintWriter printWriter = new java.io.PrintWriter(new p012xc85e97e9.p087x9da2e250.app.f3(TAG));
                    aVar.q("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3478xc9a30ff4.add(aVar);
                i18++;
            }
        } else {
            this.f3478xc9a30ff4 = null;
        }
        this.f3480x185013e.set(c1106xcd68fb74.f92751g);
        java.lang.String str3 = c1106xcd68fb74.f92752h;
        if (str3 != null) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7663x4cce298f = m7663x4cce298f(str3);
            this.f3506x9034440e = m7663x4cce298f;
            e(m7663x4cce298f);
        }
        java.util.ArrayList arrayList2 = c1106xcd68fb74.f92753i;
        if (arrayList2 != null) {
            while (i17 < arrayList2.size()) {
                this.f3509xdf83eec9.put(arrayList2.get(i17), c1106xcd68fb74.f92754m.get(i17));
                i17++;
            }
        }
        this.f3495x515163c4 = new java.util.ArrayDeque<>(c1106xcd68fb74.f92755n);
    }

    @java.lang.Deprecated
    /* renamed from: retainNonConfig */
    public p012xc85e97e9.p087x9da2e250.app.t1 m7718x924e90ea() {
        if (!(this.f3493x6226bb5 instanceof p012xc85e97e9.p093xedfae76a.m1)) {
            return this.f3499x6e535682.O6();
        }
        r(new java.lang.IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        throw null;
    }

    public final void s() {
        synchronized (this.f3504x3a30b933) {
            if (this.f3504x3a30b933.isEmpty()) {
                this.f3501xc6673d4.m2527x514e147f(m7670x180b2948() > 0 && m7688x6993c5ac(this.f3503x14172f77));
            } else {
                this.f3501xc6673d4.m2527x514e147f(true);
            }
        }
    }

    /* renamed from: saveAllState */
    public android.os.Parcelable m7719x66af900d() {
        java.util.ArrayList arrayList;
        int size;
        k();
        g();
        m7660x13596257(true);
        this.f3513xcdefe4c3 = true;
        this.f3499x6e535682.f93041m = true;
        p012xc85e97e9.p087x9da2e250.app.f2 f2Var = this.f3490x27342104;
        f2Var.getClass();
        java.util.HashMap hashMap = f2Var.f92846b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(hashMap.size());
        for (p012xc85e97e9.p087x9da2e250.app.d2 d2Var : hashMap.values()) {
            if (d2Var != null) {
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = d2Var.f92837c;
                p012xc85e97e9.p087x9da2e250.app.C1107xfbc51401 c1107xfbc51401 = new p012xc85e97e9.p087x9da2e250.app.C1107xfbc51401(componentCallbacksC1101xa17d4670);
                if (componentCallbacksC1101xa17d4670.f3456xbec81024 <= -1 || c1107xfbc51401.f92768s != null) {
                    c1107xfbc51401.f92768s = componentCallbacksC1101xa17d4670.f3451x806a1427;
                } else {
                    android.os.Bundle m17 = d2Var.m();
                    c1107xfbc51401.f92768s = m17;
                    if (componentCallbacksC1101xa17d4670.f3460x4a1a7680 != null) {
                        if (m17 == null) {
                            c1107xfbc51401.f92768s = new android.os.Bundle();
                        }
                        c1107xfbc51401.f92768s.putString("android:target_state", componentCallbacksC1101xa17d4670.f3460x4a1a7680);
                        int i17 = componentCallbacksC1101xa17d4670.f3459xc42ffdde;
                        if (i17 != 0) {
                            c1107xfbc51401.f92768s.putInt("android:target_req_state", i17);
                        }
                    }
                }
                arrayList2.add(c1107xfbc51401);
                if (m7619x11f226ac(2)) {
                    java.util.Objects.toString(componentCallbacksC1101xa17d4670);
                    java.util.Objects.toString(c1107xfbc51401.f92768s);
                }
            }
        }
        p012xc85e97e9.p087x9da2e250.app.C1099xbfa85f50[] c1099xbfa85f50Arr = null;
        if (arrayList2.isEmpty()) {
            m7619x11f226ac(2);
            return null;
        }
        p012xc85e97e9.p087x9da2e250.app.f2 f2Var2 = this.f3490x27342104;
        synchronized (f2Var2.f92845a) {
            if (f2Var2.f92845a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList(f2Var2.f92845a.size());
                java.util.Iterator it = f2Var2.f92845a.iterator();
                while (it.hasNext()) {
                    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) it.next();
                    arrayList.add(componentCallbacksC1101xa17d46702.f3465x32e011);
                    if (m7619x11f226ac(2)) {
                        componentCallbacksC1101xa17d46702.mo7591x9616526c();
                    }
                }
            }
        }
        java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.a> arrayList3 = this.f3478xc9a30ff4;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            c1099xbfa85f50Arr = new p012xc85e97e9.p087x9da2e250.app.C1099xbfa85f50[size];
            for (int i18 = 0; i18 < size; i18++) {
                c1099xbfa85f50Arr[i18] = new p012xc85e97e9.p087x9da2e250.app.C1099xbfa85f50(this.f3478xc9a30ff4.get(i18));
                if (m7619x11f226ac(2)) {
                    java.util.Objects.toString(this.f3478xc9a30ff4.get(i18));
                }
            }
        }
        p012xc85e97e9.p087x9da2e250.app.C1106xcd68fb74 c1106xcd68fb74 = new p012xc85e97e9.p087x9da2e250.app.C1106xcd68fb74();
        c1106xcd68fb74.f92748d = arrayList2;
        c1106xcd68fb74.f92749e = arrayList;
        c1106xcd68fb74.f92750f = c1099xbfa85f50Arr;
        c1106xcd68fb74.f92751g = this.f3480x185013e.get();
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46703 = this.f3506x9034440e;
        if (componentCallbacksC1101xa17d46703 != null) {
            c1106xcd68fb74.f92752h = componentCallbacksC1101xa17d46703.f3465x32e011;
        }
        c1106xcd68fb74.f92753i.addAll(this.f3509xdf83eec9.keySet());
        c1106xcd68fb74.f92754m.addAll(this.f3509xdf83eec9.values());
        c1106xcd68fb74.f92755n = new java.util.ArrayList(this.f3495x515163c4);
        return c1106xcd68fb74;
    }

    /* renamed from: saveFragmentInstanceState */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState m7720xe844b30f(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        android.os.Bundle m17;
        p012xc85e97e9.p087x9da2e250.app.d2 d2Var = (p012xc85e97e9.p087x9da2e250.app.d2) this.f3490x27342104.f92846b.get(componentCallbacksC1101xa17d4670.f3465x32e011);
        if (d2Var != null) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = d2Var.f92837c;
            if (componentCallbacksC1101xa17d46702.m7427xb2c87fbf(componentCallbacksC1101xa17d4670)) {
                if (componentCallbacksC1101xa17d46702.f3456xbec81024 <= -1 || (m17 = d2Var.m()) == null) {
                    return null;
                }
                return new p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState(m17);
            }
        }
        r(new java.lang.IllegalStateException("Fragment " + componentCallbacksC1101xa17d4670 + " is not currently in the FragmentManager"));
        throw null;
    }

    /* renamed from: scheduleCommit */
    public void m7721xec221aae() {
        synchronized (this.f3504x3a30b933) {
            java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.s1> arrayList = this.f3505x96597096;
            boolean z17 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z18 = this.f3504x3a30b933.size() == 1;
            if (z17 || z18) {
                this.f3493x6226bb5.f93028f.removeCallbacks(this.f3486xa6c35575);
                this.f3493x6226bb5.f93028f.post(this.f3486xa6c35575);
                s();
            }
        }
    }

    /* renamed from: setExitAnimationOrder */
    public void m7722xb1192aea(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, boolean z17) {
        android.view.ViewGroup l17 = l(componentCallbacksC1101xa17d4670);
        if (l17 == null || !(l17 instanceof p012xc85e97e9.p087x9da2e250.app.C1103x8ca9b236)) {
            return;
        }
        ((p012xc85e97e9.p087x9da2e250.app.C1103x8ca9b236) l17).m7610x94241e5f(!z17);
    }

    /* renamed from: setFragmentFactory */
    public void m7723xa57517d8(p012xc85e97e9.p087x9da2e250.app.u0 u0Var) {
        this.f3489x59eadc6d = u0Var;
    }

    /* renamed from: setFragmentResult */
    public final void m7724x6ca4cf8f(java.lang.String str, android.os.Bundle bundle) {
        p012xc85e97e9.p087x9da2e250.app.o1 o1Var = this.f3508x49812a75.get(str);
        if (o1Var != null) {
            if (o1Var.f92966a.b().a(p012xc85e97e9.p093xedfae76a.n.STARTED)) {
                o1Var.a(str, bundle);
                return;
            }
        }
        this.f3509xdf83eec9.put(str, bundle);
    }

    /* renamed from: setFragmentResultListener */
    public final void m7725x4b6f963(final java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, final p012xc85e97e9.p087x9da2e250.app.z1 z1Var) {
        final p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = yVar.mo273xed6858b4();
        if (mo273xed6858b4.b() == p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            return;
        }
        p012xc85e97e9.p093xedfae76a.v vVar = new p012xc85e97e9.p093xedfae76a.v() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // p012xc85e97e9.p093xedfae76a.v
            /* renamed from: onStateChanged */
            public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar2, p012xc85e97e9.p093xedfae76a.m mVar) {
                android.os.Bundle bundle;
                p012xc85e97e9.p093xedfae76a.m mVar2 = p012xc85e97e9.p093xedfae76a.m.ON_START;
                p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.this;
                java.lang.String str2 = str;
                if (mVar == mVar2 && (bundle = (android.os.Bundle) abstractC1104xc1ad431d.f3509xdf83eec9.get(str2)) != null) {
                    ((p012xc85e97e9.p087x9da2e250.app.o1) z1Var).a(str2, bundle);
                    abstractC1104xc1ad431d.m7632x3fcb923a(str2);
                }
                if (mVar == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
                    mo273xed6858b4.c(this);
                    abstractC1104xc1ad431d.f3508x49812a75.remove(str2);
                }
            }
        };
        mo273xed6858b4.a(vVar);
        p012xc85e97e9.p087x9da2e250.app.o1 put = this.f3508x49812a75.put(str, new p012xc85e97e9.p087x9da2e250.app.o1(mo273xed6858b4, z1Var, vVar));
        if (put != null) {
            put.f92966a.c(put.f92968c);
        }
    }

    /* renamed from: setMaxLifecycle */
    public void m7726x3060bfe8(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, p012xc85e97e9.p093xedfae76a.n nVar) {
        if (componentCallbacksC1101xa17d4670.m7427xb2c87fbf(m7663x4cce298f(componentCallbacksC1101xa17d4670.f3465x32e011)) && (componentCallbacksC1101xa17d4670.f3432x6226bb5 == null || componentCallbacksC1101xa17d4670.f3427xccc8bb10 == this)) {
            componentCallbacksC1101xa17d4670.f3439x3ca7951a = nVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("Fragment " + componentCallbacksC1101xa17d4670 + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: setPrimaryNavigationFragment */
    public void m7727x59f1ffe4(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (componentCallbacksC1101xa17d4670 == null || (componentCallbacksC1101xa17d4670.m7427xb2c87fbf(m7663x4cce298f(componentCallbacksC1101xa17d4670.f3465x32e011)) && (componentCallbacksC1101xa17d4670.f3432x6226bb5 == null || componentCallbacksC1101xa17d4670.f3427xccc8bb10 == this))) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = this.f3506x9034440e;
            this.f3506x9034440e = componentCallbacksC1101xa17d4670;
            e(componentCallbacksC1101xa17d46702);
            e(this.f3506x9034440e);
            return;
        }
        throw new java.lang.IllegalArgumentException("Fragment " + componentCallbacksC1101xa17d4670 + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: setSpecialEffectsControllerFactory */
    public void m7728x9a754203(p012xc85e97e9.p087x9da2e250.app.o3 o3Var) {
        this.f3510xc5c13c98 = o3Var;
    }

    /* renamed from: showFragment */
    public void m7729x6adad46d(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (m7619x11f226ac(2)) {
            java.util.Objects.toString(componentCallbacksC1101xa17d4670);
        }
        if (componentCallbacksC1101xa17d4670.f3430x6dac477) {
            componentCallbacksC1101xa17d4670.f3430x6dac477 = false;
            componentCallbacksC1101xa17d4670.f3431xaf30923d = !componentCallbacksC1101xa17d4670.f3431xaf30923d;
        }
    }

    /* renamed from: toString */
    public java.lang.String m7730x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        sb6.append("FragmentManager{");
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb6.append(" in ");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f3503x14172f77;
        if (componentCallbacksC1101xa17d4670 != null) {
            sb6.append(componentCallbacksC1101xa17d4670.getClass().getSimpleName());
            sb6.append("{");
            sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.f3503x14172f77)));
            sb6.append("}");
        } else {
            p012xc85e97e9.p087x9da2e250.app.v0 v0Var = this.f3493x6226bb5;
            if (v0Var != null) {
                sb6.append(v0Var.getClass().getSimpleName());
                sb6.append("{");
                sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.f3493x6226bb5)));
                sb6.append("}");
            } else {
                sb6.append("null");
            }
        }
        sb6.append("}}");
        return sb6.toString();
    }

    /* renamed from: unregisterFragmentLifecycleCallbacks */
    public void m7731x8c5a050(p012xc85e97e9.p087x9da2e250.app.m1 m1Var) {
        p012xc85e97e9.p087x9da2e250.app.z0 z0Var = this.f3497xba695958;
        synchronized (z0Var.f93059a) {
            if (z0Var.f93059a.size() > 0) {
                ((p012xc85e97e9.p087x9da2e250.app.y0) z0Var.f93059a.get(0)).getClass();
                z0Var.f93059a.remove(0);
            }
        }
    }

    /* renamed from: popBackStack */
    public void m7704x93613e90(java.lang.String str, int i17) {
        m7659x12dd525e(new p012xc85e97e9.p087x9da2e250.app.r1(this, str, -1, i17), false);
    }

    /* renamed from: popBackStackImmediate */
    public boolean m7707x96eafb01(java.lang.String str, int i17) {
        return n(str, -1, i17);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo */
    /* loaded from: classes14.dex */
    public class LaunchedFragmentInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.LaunchedFragmentInfo> f3518x681a0c0c = new p012xc85e97e9.p087x9da2e250.app.n1();

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f92746d;

        /* renamed from: e, reason: collision with root package name */
        public final int f92747e;

        public LaunchedFragmentInfo(java.lang.String str, int i17) {
            this.f92746d = str;
            this.f92747e = i17;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f92746d);
            parcel.writeInt(this.f92747e);
        }

        public LaunchedFragmentInfo(android.os.Parcel parcel) {
            this.f92746d = parcel.readString();
            this.f92747e = parcel.readInt();
        }
    }

    /* renamed from: popBackStack */
    public void m7703x93613e90(int i17, int i18) {
        if (i17 >= 0) {
            m7659x12dd525e(new p012xc85e97e9.p087x9da2e250.app.r1(this, null, i17, i18), false);
        } else {
            throw new java.lang.IllegalArgumentException("Bad id: " + i17);
        }
    }

    /* renamed from: popBackStackImmediate */
    public boolean m7706x96eafb01(int i17, int i18) {
        if (i17 >= 0) {
            return n(null, i17, i18);
        }
        throw new java.lang.IllegalArgumentException("Bad id: " + i17);
    }

    /* renamed from: moveToState */
    public void m7696xc25739c5(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        m7697xc25739c5(componentCallbacksC1101xa17d4670, this.f3483x459b61be);
    }

    /* renamed from: moveToState */
    public void m7695xc25739c5(int i17, boolean z17) {
        p012xc85e97e9.p087x9da2e250.app.v0 v0Var;
        java.util.HashMap hashMap;
        if (this.f3493x6226bb5 == null && i17 != -1) {
            throw new java.lang.IllegalStateException("No activity");
        }
        if (z17 || i17 != this.f3483x459b61be) {
            this.f3483x459b61be = i17;
            if (f3476xa4a928e7) {
                p012xc85e97e9.p087x9da2e250.app.f2 f2Var = this.f3490x27342104;
                java.util.Iterator it = f2Var.f92845a.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashMap = f2Var.f92846b;
                    if (!hasNext) {
                        break;
                    }
                    p012xc85e97e9.p087x9da2e250.app.d2 d2Var = (p012xc85e97e9.p087x9da2e250.app.d2) hashMap.get(((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) it.next()).f3465x32e011);
                    if (d2Var != null) {
                        d2Var.j();
                    }
                }
                for (p012xc85e97e9.p087x9da2e250.app.d2 d2Var2 : hashMap.values()) {
                    if (d2Var2 != null) {
                        d2Var2.j();
                        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = d2Var2.f92837c;
                        if (componentCallbacksC1101xa17d4670.f3447x66cabce && !componentCallbacksC1101xa17d4670.m7485x7bae6eb2()) {
                            f2Var.h(d2Var2);
                        }
                    }
                }
            } else {
                java.util.Iterator it6 = this.f3490x27342104.f().iterator();
                while (it6.hasNext()) {
                    m7694x82878e7d((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) it6.next());
                }
                java.util.Iterator it7 = ((java.util.ArrayList) this.f3490x27342104.d()).iterator();
                while (it7.hasNext()) {
                    p012xc85e97e9.p087x9da2e250.app.d2 d2Var3 = (p012xc85e97e9.p087x9da2e250.app.d2) it7.next();
                    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = d2Var3.f92837c;
                    if (!componentCallbacksC1101xa17d46702.f3435xfc98abaa) {
                        m7694x82878e7d(componentCallbacksC1101xa17d46702);
                    }
                    if (componentCallbacksC1101xa17d46702.f3447x66cabce && !componentCallbacksC1101xa17d46702.m7485x7bae6eb2()) {
                        this.f3490x27342104.h(d2Var3);
                    }
                }
            }
            q();
            if (this.f3498xcf29297d && (v0Var = this.f3493x6226bb5) != null && this.f3483x459b61be == 7) {
                v0Var.l();
                this.f3498xcf29297d = false;
            }
        }
    }
}
