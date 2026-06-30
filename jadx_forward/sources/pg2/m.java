package pg2;

/* loaded from: classes3.dex */
public final class m extends mn0.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f435688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f435689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nn0.c f435690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ co0.s f435691g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f435692h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ug5.v f435693i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435694m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435695n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f435696o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f435697p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10846x3bc26740 f435698q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f435699r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ qo0.c f435700s;

    public m(long j17, boolean z17, nn0.c cVar, co0.s sVar, yz5.a aVar, ug5.v vVar, android.view.View view, android.view.View view2, pg2.j0 j0Var, android.app.Activity activity, com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10846x3bc26740 c10846x3bc26740, android.widget.FrameLayout frameLayout, qo0.c cVar2) {
        this.f435688d = j17;
        this.f435689e = z17;
        this.f435690f = cVar;
        this.f435691g = sVar;
        this.f435692h = aVar;
        this.f435693i = vVar;
        this.f435694m = view;
        this.f435695n = view2;
        this.f435696o = j0Var;
        this.f435697p = activity;
        this.f435698q = c10846x3bc26740;
        this.f435699r = frameLayout;
        this.f435700s = cVar2;
    }

    @Override // mn0.a0
    public void a(int i17, int i18) {
        this.f435696o.Vi(this.f435691g, this.f435700s, i17, i18);
    }

    @Override // mn0.a0
    public void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFirstFrameRender Cost=");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = this.f435688d;
        sb6.append(elapsedRealtime - j17);
        sb6.append("ms  isImageType=");
        boolean z17 = this.f435689e;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", sb6.toString());
        this.f435690f.J(this.f435691g);
        ez2.e eVar = ez2.g.f339435a;
        if (eVar != null) {
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            eVar.f339430s = elapsedRealtime2;
            eVar.f339429r = elapsedRealtime2 - j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentReporter", "tickSecondFrameEnd cost: " + eVar.f339429r);
        }
        yz5.a aVar = this.f435692h;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        if (!z17) {
            android.view.View view = this.f435695n;
            view.postDelayed(new pg2.l(view, this.f435696o, this.f435697p, this.f435691g, this.f435698q, this.f435694m, this.f435693i), 200L);
            return;
        }
        ug5.f fVar = ug5.v.f509188g;
        this.f435693i.b(false);
        android.view.View view2 = this.f435694m;
        if (view2 != null) {
            view2.animate().alpha(0.0f).setStartDelay(120L).setDuration(120L).withEndAction(new pg2.k(this.f435695n, this.f435696o, this.f435697p, this.f435691g, this.f435698q, this.f435699r, view2)).start();
        }
    }

    @Override // mn0.a0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", "onWarningReconnect:");
        ug5.v vVar = this.f435693i;
        java.lang.Object d17 = vVar.d("liveSdkChannelParams");
        r45.ka4 ka4Var = d17 instanceof r45.ka4 ? (r45.ka4) d17 : null;
        java.lang.Object d18 = vVar.d("playerInfoData");
        mn0.l0 l0Var = d18 instanceof mn0.l0 ? (mn0.l0) d18 : null;
        qg2.e.f444332a.c("changeSurfaceViewToLiveRoom", this.f435690f, ka4Var, this.f435696o.Ui(this.f435697p, l0Var != null ? l0Var.f411306d : 0L, l0Var != null ? l0Var.f411305c : 0L));
    }
}
