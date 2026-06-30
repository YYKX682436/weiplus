package g22;

/* loaded from: classes15.dex */
public final class i implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f349355d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q f349356e;

    /* renamed from: f, reason: collision with root package name */
    public z12.v f349357f;

    /* renamed from: g, reason: collision with root package name */
    public z12.l f349358g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f349359h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f349360i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f349361m;

    /* renamed from: n, reason: collision with root package name */
    public long f349362n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 f349363o = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.b();

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f349364p = new p012xc85e97e9.p093xedfae76a.j0();

    /* renamed from: q, reason: collision with root package name */
    public final int f349365q = 1;

    /* renamed from: r, reason: collision with root package name */
    public final int f349366r = 2;

    /* renamed from: s, reason: collision with root package name */
    public final int f349367s = 3;

    /* renamed from: t, reason: collision with root package name */
    public final int f349368t = 4;

    /* renamed from: u, reason: collision with root package name */
    public final int f349369u = 5;

    /* renamed from: v, reason: collision with root package name */
    public final int f349370v = 6;

    /* renamed from: w, reason: collision with root package name */
    public final ec0.e f349371w = new g22.g(this);

    public i(int i17) {
        this.f349355d = i17;
    }

    public final void a() {
        if (this.f349357f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "requestNetGetStoreRecList failed, mGetStoreRecListNetScene null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "ready to doScene NetSceneGetEmotionStoreRecList");
        this.f349360i = true;
        gm0.j1.n().f354821b.g(this.f349357f);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "onSceneEnd errType:" + i17 + ",errCode:" + i18 + ",errMsg:" + str);
        this.f349364p.mo523x53d8522f(java.lang.Integer.valueOf(this.f349366r));
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "onSceneEnd scene null");
            return;
        }
        if (m1Var.mo808xfb85f7b0() != 6910) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "unknow scene type.");
            return;
        }
        if (!(m1Var instanceof z12.v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "sceneType:6910,scene cast NetSceneGetEmotionStoreRecList Failed");
            return;
        }
        this.f349360i = false;
        if (!(i17 == 0 || i17 == 4)) {
            if (this.f349361m) {
                return;
            }
            this.f349364p.mo523x53d8522f(java.lang.Integer.valueOf(this.f349368t));
            return;
        }
        this.f349364p.mo523x53d8522f(java.lang.Integer.valueOf(this.f349370v));
        com.p314xaae8f345.mm.p944x882e457a.o oVar = ((z12.v) m1Var).f550904d;
        r45.oo3 oo3Var = null;
        if (oVar != null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            if (fVar instanceof r45.oo3) {
                oo3Var = (r45.oo3) fVar;
            }
        }
        if (oo3Var == null && !this.f349361m) {
            this.f349364p.mo523x53d8522f(java.lang.Integer.valueOf(this.f349368t));
        }
        this.f349356e = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q(oo3Var);
        if (i18 != 0) {
            this.f349364p.mo523x53d8522f(java.lang.Integer.valueOf(this.f349367s));
        } else {
            this.f349364p.mo523x53d8522f(java.lang.Integer.valueOf(this.f349365q));
            ((ku5.t0) ku5.t0.f394148d).q(new g22.h(oo3Var, this));
        }
    }
}
