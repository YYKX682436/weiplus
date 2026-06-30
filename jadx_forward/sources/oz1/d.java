package oz1;

/* loaded from: classes13.dex */
public class d extends mz1.a implements ez1.a, gy1.c {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f431754h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f431755i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public static volatile oz1.d f431756m;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f431757d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f431758e = java.lang.Boolean.TRUE;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f431759f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f431760g = false;

    public static oz1.d c() {
        if (f431756m == null) {
            synchronized (oz1.d.class) {
                if (f431756m == null) {
                    f431756m = new oz1.d();
                }
            }
        }
        return f431756m;
    }

    public static java.lang.String e(java.lang.Object obj) {
        return obj == null ? "" : u46.l.c(obj.getClass().getSimpleName(), "MainUI") ? "tab_red_dot_0" : u46.l.c(obj.getClass().getSimpleName(), "MvvmAddressUIFragment") ? "tab_red_dot_1" : u46.l.c(obj.getClass().getSimpleName(), "FindMoreFriendsUI") ? "tab_red_dot_2" : u46.l.c(obj.getClass().getSimpleName(), "MoreTabUI") ? "tab_red_dot_3" : "";
    }

    @Override // gy1.c
    public void D2(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (u46.l.e(e(componentCallbacksC1101xa17d4670))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.NewUserBehaviourRD", "[onFragmentAppear] fragment : " + componentCallbacksC1101xa17d4670);
        a(componentCallbacksC1101xa17d4670);
        this.f431759f = new java.lang.ref.WeakReference(componentCallbacksC1101xa17d4670);
    }

    @Override // ez1.a
    public void Na(long j17, boolean z17, android.app.Activity activity) {
        if (this.f431759f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.NewUserBehaviourRD", "[onAppIn] mLastFragment : " + this.f431759f.get());
            a((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) this.f431759f.get());
        }
    }

    public final void a(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (componentCallbacksC1101xa17d4670 == null) {
            return;
        }
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(componentCallbacksC1101xa17d4670);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: oz1.d$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702;
                oz1.d dVar = oz1.d.this;
                if (dVar.f431759f == null || (componentCallbacksC1101xa17d46702 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) weakReference.get()) == null || componentCallbacksC1101xa17d46702 != dVar.f431759f.get()) {
                    return;
                }
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(componentCallbacksC1101xa17d46702, "tab_in_red_dot_start_time", 0);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(componentCallbacksC1101xa17d46702, "tab_out_red_dot_start_time", 0);
                long d17 = dVar.d(oz1.d.e(componentCallbacksC1101xa17d46702));
                if (d17 > 0) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(componentCallbacksC1101xa17d46702, "tab_in_red_dot_start_time", java.lang.Long.valueOf(d17));
                }
                java.util.Map bj6 = ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).bj(componentCallbacksC1101xa17d46702);
                if (bj6 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.NewUserBehaviourRD", "[bindRedDotInfoWhenTabIn] fragment : " + componentCallbacksC1101xa17d46702.getClass().getSimpleName() + ", tab_in_red_dot_start_time : " + bj6.get("tab_in_red_dot_start_time"));
                    java.util.Objects.toString(bj6.get("tab_in_red_dot_start_time"));
                }
            }
        };
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f431757d;
        n3Var.mo50297x7c4d7ca2(runnable, 500L);
        if (this.f431758e.booleanValue()) {
            n3Var.mo50297x7c4d7ca2(runnable, 5000L);
            this.f431758e = java.lang.Boolean.FALSE;
        }
        if (this.f431760g) {
            n3Var.mo50297x7c4d7ca2(runnable, 3000L);
            this.f431760g = false;
        }
    }

    public final void b(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (componentCallbacksC1101xa17d4670 == null) {
            return;
        }
        long d17 = d(e(componentCallbacksC1101xa17d4670));
        if (d17 > 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(componentCallbacksC1101xa17d4670, "tab_out_red_dot_start_time", java.lang.Long.valueOf(d17));
        }
        java.util.Map bj6 = ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).bj(componentCallbacksC1101xa17d4670);
        if (bj6 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.NewUserBehaviourRD", "[bindRedDotInfoWhenTabOut] fragment : " + componentCallbacksC1101xa17d4670.getClass().getSimpleName() + ", tab_in_red_dot_start_time : " + bj6.get("tab_in_red_dot_start_time") + ", tab_out_red_dot_start_time : " + bj6.get("tab_out_red_dot_start_time"));
            java.util.Objects.toString(bj6.get("tab_in_red_dot_start_time"));
            java.util.Objects.toString(bj6.get("tab_out_red_dot_start_time"));
        }
    }

    @Override // ez1.a
    public void b7(long j17, boolean z17, android.app.Activity activity) {
        if (this.f431759f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.NewUserBehaviourRD", "[onAppOut] mLastFragment : " + this.f431759f.get());
            b((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) this.f431759f.get());
        }
    }

    public long d(java.lang.String str) {
        if (u46.l.e(str)) {
            return 0L;
        }
        java.lang.Long l17 = (java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) f431754h).get(str);
        if (l17 == null) {
            l17 = (java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) f431755i).get(str);
        }
        if (l17 != null) {
            return l17.longValue();
        }
        return 0L;
    }

    @Override // mz1.c
    /* renamed from: onActivityResumed */
    public void mo54651xba973e9(android.app.Activity activity) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.NewUserBehaviourRD", "[onActivityResumed] activity : " + activity);
        if (this.f431759f != null) {
            if (u46.l.c(activity.getClass().getSimpleName(), "LauncherUI")) {
                a((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) this.f431759f.get());
            } else {
                b((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) this.f431759f.get());
            }
        }
        if (u46.l.c(activity.getClass().getSimpleName(), "SnsMsgUIWithRelevance")) {
            this.f431760g = true;
        }
    }

    @Override // gy1.c
    public void w8(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (u46.l.e(e(componentCallbacksC1101xa17d4670))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.NewUserBehaviourRD", "[onFragmentDisappear] fragment : " + componentCallbacksC1101xa17d4670);
        b(componentCallbacksC1101xa17d4670);
        this.f431759f = null;
    }
}
