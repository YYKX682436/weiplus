package sc3;

/* loaded from: classes7.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f488045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f488046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f488047f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f488048g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f488049h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f488050i;

    public p0(sc3.k1 k1Var, int i17, int i18, int i19, long j17, java.util.List list) {
        this.f488045d = k1Var;
        this.f488046e = i17;
        this.f488047f = i18;
        this.f488048g = i19;
        this.f488049h = j17;
        this.f488050i = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2;
        jz5.f0 f0Var;
        sc3.k1 k1Var = this.f488045d;
        pc3.c cVar = (pc3.c) k1Var.f488022u.get(java.lang.Integer.valueOf(this.f488046e));
        if (cVar == null || (c4216x654bedf2 = cVar.f434905f) == null) {
            return;
        }
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = k1Var.f488021t;
        if (c4209xd2d3ddad != null) {
            c4209xd2d3ddad.g(this.f488046e, c4216x654bedf2.getCanvasId(), k1Var.A.c(this.f488047f, this.f488048g, this.f488049h, this.f488050i, c4209xd2d3ddad.f130111b.f16189xa3ade0d6), k1Var.A.f130167c);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(k1Var.Q, "post canvas touch event without magicbrush??");
        }
    }
}
