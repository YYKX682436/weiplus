package z21;

/* loaded from: classes14.dex */
public class q implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String f551192t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String f551193u;

    /* renamed from: v, reason: collision with root package name */
    public static int f551194v;

    /* renamed from: d, reason: collision with root package name */
    public final int f551195d;

    /* renamed from: h, reason: collision with root package name */
    public final int f551199h;

    /* renamed from: m, reason: collision with root package name */
    public z21.p f551201m;

    /* renamed from: n, reason: collision with root package name */
    public tl.w f551202n;

    /* renamed from: o, reason: collision with root package name */
    public yl.b f551203o;

    /* renamed from: e, reason: collision with root package name */
    public int f551196e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f551197f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f551198g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f551200i = false;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.c f551204p = null;

    /* renamed from: q, reason: collision with root package name */
    public z21.a f551205q = null;

    /* renamed from: r, reason: collision with root package name */
    public final tl.v f551206r = new z21.m(this);

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f551207s = new z21.n(this);

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a;
        sb6.append(str);
        sb6.append("tmp_voiceaddr.spx");
        f551192t = sb6.toString();
        f551193u = str + "tmp_voiceaddr.amr";
        f551194v = 100;
    }

    public q(z21.p pVar, int i17) {
        this.f551195d = 1;
        this.f551199h = 500000;
        this.f551201m = null;
        this.f551201m = pVar;
        this.f551195d = i17;
        this.f551199h = i17 != 1 ? 1500000 : 500000;
        cv.j1.a();
    }

    public static java.lang.String a(z21.q qVar) {
        return !qVar.f551200i ? f551192t : f551193u;
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceAddr", "finish");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SceneVoiceAddr", "finish", new java.lang.Object[0]);
        z21.a aVar = this.f551205q;
        if (aVar != null) {
            aVar.M();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f551207s;
        n3Var.mo50305x3d8a09a2(2);
        if (!this.f551198g) {
            n3Var.mo50305x3d8a09a2(3);
        }
        c();
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceAddr", "reset");
        synchronized (this) {
            tl.w wVar = this.f551202n;
            if (wVar != null) {
                wVar.l();
                this.f551202n = null;
            }
            yl.b bVar = this.f551203o;
            if (bVar != null) {
                bVar.d();
                this.f551203o = null;
            }
            com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.c cVar = this.f551204p;
            if (cVar != null) {
                com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.C25467xe1898bb2 c25467xe1898bb2 = cVar.f296796a;
                if (c25467xe1898bb2.m94445x39cc4c0e() == 0 && c25467xe1898bb2.m94431xfed81b6c() == 0) {
                    c25467xe1898bb2.m94434x39c5fd2a();
                }
            }
            this.f551204p = null;
            z21.a aVar = this.f551205q;
            if (aVar != null) {
                aVar.M();
                this.f551205q = null;
            }
            this.f551197f = 0;
            this.f551198g = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (this.f551195d == 0) {
            gm0.j1.d().q(349, this);
        } else {
            gm0.j1.d().q(206, this);
        }
        z21.a aVar = (z21.a) m1Var;
        java.lang.String[] J2 = aVar.J();
        long K = aVar.K();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Integer.valueOf(J2 == null ? -1 : J2.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceAddr", "onSceneEnd errType:%d errCode:%d list:%d", objArr);
        z21.p pVar = this.f551201m;
        if (pVar != null) {
            if (i18 == 0 && i17 == 0) {
                ((a31.r) pVar).a(J2, K);
                return;
            }
            aVar.I();
            com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 c11154x38c1a924 = ((a31.r) pVar).f82527a;
            c11154x38c1a924.f();
            a31.v vVar = ((a31.u) c11154x38c1a924.f153288e).f82528a;
            y90.j jVar = vVar.f82532u;
            if (jVar != null) {
                jVar.o2(false, null, -1L, vVar.f82531t);
            }
            this.f551201m = null;
            b();
        }
    }
}
