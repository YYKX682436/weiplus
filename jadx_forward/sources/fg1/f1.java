package fg1;

/* loaded from: classes7.dex */
public class f1 implements pd1.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f343391a = "MicroMsg.AppBrand.XWebVideoVideoController#" + hashCode();

    /* renamed from: b, reason: collision with root package name */
    public pd1.m f343392b = null;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f343393c = false;

    /* renamed from: d, reason: collision with root package name */
    public final ye1.m f343394d = new fg1.b1(this);

    /* renamed from: e, reason: collision with root package name */
    public final ye1.n f343395e = new fg1.c1(this);

    /* renamed from: f, reason: collision with root package name */
    public final ye1.g f343396f = new fg1.d1(this);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fg1.g1 f343397g;

    public f1(fg1.g1 g1Var, fg1.y0 y0Var) {
        this.f343397g = g1Var;
        bg.f fVar = g1Var.f343401a;
        fg1.e1 e1Var = new fg1.e1(this);
        fVar.L1 = e1Var;
        if (fVar.f101297h != null) {
            e1Var.a(fVar.f101319z);
        }
    }

    @Override // pd1.o
    public boolean b() {
        return this.f343397g.f343401a.R1;
    }

    @Override // pd1.o
    public java.lang.Integer c() {
        bg.f fVar = this.f343397g.f343401a;
        sf.f fVar2 = fVar.f101308s;
        if (fVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(fVar.A(), "getOriginPageViewId, invokeContext is null");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f17 = tf.d.f(fVar2);
        if (f17 != null) {
            return java.lang.Integer.valueOf(f17.hashCode());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(fVar.A(), "getOriginPageViewId, pageView is null");
        return null;
    }

    @Override // pd1.o
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w1 g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n.f163477e;
        bg.f fVar = this.f343397g.f343401a;
        return nVar.U2(fVar.P, fVar.Q);
    }

    @Override // pd1.o
    /* renamed from: getKey */
    public java.lang.String mo129528xb5884f29() {
        return this.f343397g.f343401a.z();
    }

    @Override // pd1.o
    /* renamed from: getType */
    public pd1.n mo129529xfb85f7b0() {
        return pd1.n.Video;
    }

    @Override // pd1.o
    /* renamed from: getVideoHeight */
    public int mo129530x463504c() {
        ye1.e eVar = this.f343397g.f343401a.f101297h;
        ye1.r rVar = !(eVar instanceof ye1.r) ? null : (ye1.r) eVar;
        if (rVar == null) {
            return 0;
        }
        return rVar.mo1854x463504c();
    }

    @Override // pd1.o
    /* renamed from: getVideoWidth */
    public int mo129531x8d5c7601() {
        ye1.e eVar = this.f343397g.f343401a.f101297h;
        ye1.r rVar = !(eVar instanceof ye1.r) ? null : (ye1.r) eVar;
        if (rVar == null) {
            return 0;
        }
        return rVar.mo1855x8d5c7601();
    }

    @Override // pd1.o
    public void h(pd1.m mVar) {
        if (mVar != null) {
            if (this.f343393c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f343391a, "onLoadEnd from mPrepared");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).b(this);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f343391a, "onLoading from mPrepared");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).c(this);
            }
        }
        this.f343392b = mVar;
    }

    @Override // pd1.o
    /* renamed from: pause */
    public void mo129532x65825f6() {
        bg.f fVar = this.f343397g.f343401a;
        fVar.getClass();
        fVar.Q(new bg.RunnableC1340x2ee9bd(fVar, false));
    }

    @Override // pd1.o
    /* renamed from: release */
    public void mo129533x41012807() {
        bg.f fVar = this.f343397g.f343401a;
        fVar.getClass();
        fVar.Q(new bg.u(fVar));
    }

    @Override // pd1.o
    /* renamed from: start */
    public void mo129534x68ac462() {
        bg.f fVar = this.f343397g.f343401a;
        fVar.getClass();
        fVar.Q(new bg.t(fVar));
    }
}
