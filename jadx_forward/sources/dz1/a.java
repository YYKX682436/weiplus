package dz1;

/* loaded from: classes13.dex */
public abstract class a implements mz1.c, nz1.b, e42.j0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f326625d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f326626e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f326627f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f326628g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f326629h;

    @Override // e42.j0
    public void A(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityResume] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void C(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewTouch] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void D(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewClick] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // nz1.b
    public void F(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFragmentSetUserVisibleHint] fragment : ");
        sb6.append(componentCallbacksC1101xa17d4670 != null ? componentCallbacksC1101xa17d4670.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void G(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onHellFragmentPause] hashcode : " + i17);
    }

    @Override // e42.j0
    public void H(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityMoveActivityTaskToBack] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void I(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellFragmentEnter] fragmentObj : ");
        sb6.append(obj != null ? obj.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void J(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityFinishActivity] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void K(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewDoubleClick] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    public void L(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFragmentDestroy] fragment : ");
        sb6.append(componentCallbacksC1101xa17d4670 != null ? componentCallbacksC1101xa17d4670.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void M(java.lang.String str, int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onHellBackToFront] activityName : " + str);
    }

    @Override // nz1.b
    public void N(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFragmentResume] fragment : ");
        sb6.append(componentCallbacksC1101xa17d4670 != null ? componentCallbacksC1101xa17d4670.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    public void O(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onStartedActivityExec] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void a(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityPaused] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void b(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewItemLongClick] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // nz1.b
    public void c(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFragmentPause] fragment : ");
        sb6.append(componentCallbacksC1101xa17d4670 != null ? componentCallbacksC1101xa17d4670.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void d(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityDestroy] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void e(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewLongSelected] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onHellActivityPopStackUnRegular] hashCode : " + i17);
    }

    @Override // e42.j0
    public void g(android.content.Intent intent, android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityNewIntent] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void h(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewItemClick] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // nz1.b
    public void i(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFragmentHiddenChanged] fragment : ");
        sb6.append(componentCallbacksC1101xa17d4670 != null ? componentCallbacksC1101xa17d4670.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // nz1.b
    public void j(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFragmentCreate] fragment : ");
        sb6.append(componentCallbacksC1101xa17d4670 != null ? componentCallbacksC1101xa17d4670.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void k(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewLongClick] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void l(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewKey] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // nz1.b
    public void m(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFragmentDestroyView] fragment : ");
        sb6.append(componentCallbacksC1101xa17d4670 != null ? componentCallbacksC1101xa17d4670.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void n(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityPushStack] activity : ");
        sb6.append(str != null ? str.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void o(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityPause] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // mz1.c
    /* renamed from: onActivityCreated */
    public void mo54634x78cb4fa(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityCreated] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivityDestroyed */
    public void mo54635xa9f48fab(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityDestroyed] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivityPaused */
    public void mo54636x99a658dc(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPaused] activity : ".concat(activity.getClass().getSimpleName()));
        if (this.f326625d || !this.f326626e) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onEnterRecntApps]");
        this.f326628g = true;
    }

    @Override // mz1.c
    /* renamed from: onActivityPostCreated */
    public void mo54637xd264673a(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPostCreated] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivityPostDestroyed */
    public void mo54638x1da8b1eb(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPostDestroyed] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivityPostPaused */
    public void mo54639x97ef5e9c(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPostPaused] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivityPostResumed */
    public void mo54640xd6812629(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPostResumed] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivityPostSaveInstanceState */
    public void mo54641xadb8051(android.app.Activity activity, android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPostSaveInstanceState] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivityPostStarted */
    public void mo54642x240128d3(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPostStarted] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivityPostStopped */
    public void mo54643x24c57a1f(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPostStopped] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivityPreCreated */
    public void mo54644xc08eef73(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPreCreated] activity : ".concat(activity.getClass().getSimpleName()));
        if (u46.l.c(this.f326629h, activity.getClass().getCanonicalName())) {
            O(activity);
            this.f326629h = null;
        }
    }

    @Override // mz1.c
    /* renamed from: onActivityPreDestroyed */
    public void mo54645x2b520fe4(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPreDestroyed] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivityPrePaused */
    public void mo54646xc0a66b43(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPrePaused] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivityPreResumed */
    public void mo54647xc4abae62(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPreResumed] activity : ".concat(activity.getClass().getSimpleName()));
        this.f326625d = false;
        this.f326626e = false;
    }

    @Override // mz1.c
    /* renamed from: onActivityPreSaveInstanceState */
    public void mo54648x7267d54a(android.app.Activity activity, android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPreSaveInstanceState] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivityPreStarted */
    public void mo54649x122bb10c(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPreStarted] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivityPreStopped */
    public void mo54650x12f00258(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityPreStopped] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivityResumed */
    public void mo54651xba973e9(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityResumed] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivitySaveInstanceState */
    public void mo54652x634d9e11(android.app.Activity activity, android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivitySaveInstanceState] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivityStarted */
    public void mo54653x59297693(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityStarted] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // mz1.c
    /* renamed from: onActivityStopped */
    public void mo54654x59edc7df(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onActivityStopped] activity : ".concat(activity.getClass().getSimpleName()));
    }

    @Override // e42.j0
    public void p(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityResumed] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void q(android.app.Activity activity, java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellFragmentResume] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void r(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityStop] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void s(android.content.Intent intent, android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityCreate] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void t(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityUserLeaveHint] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
        this.f326625d = true;
    }

    @Override // e42.j0
    public void u(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellChatFragmentFinish] fragmentObj : ");
        sb6.append(obj != null ? obj.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void v(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onHellActivityStartActivity] activityName : " + str);
        this.f326629h = str;
    }

    @Override // e42.j0
    public void w(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onHellFragmentExit] hashcode : " + i17);
    }

    @Override // e42.j0
    public void x(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellViewSingleClick] view : ");
        sb6.append(view != null ? view.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
    }

    @Override // e42.j0
    public void y(java.lang.String str, int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", "[onHellFrontToBack] activityName : " + str);
    }

    @Override // e42.j0
    public void z(android.app.Activity activity, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onHellActivityWindowFocusChanged] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        sb6.append(", hasFocus : ");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
        ty1.a a17 = ty1.a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        java.lang.String simpleName = activity.getClass().getSimpleName();
        boolean z18 = false;
        if (u46.l.e(simpleName)) {
            a17.getClass();
        } else {
            if (a17.f504578b == null) {
                a17.b();
            }
            java.lang.String concat = "s".concat(simpleName);
            java.lang.String concat2 = "c".concat(simpleName);
            java.util.Iterator it = ((java.util.ArrayList) a17.f504578b).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (u46.l.c(str, concat) || u46.l.c(str, concat2)) {
                    z18 = true;
                    break;
                }
            }
        }
        if (z18) {
            return;
        }
        this.f326626e = !z17;
    }
}
