package fg1;

/* loaded from: classes7.dex */
public class z0 implements tf.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg1.g1 f343458a;

    public z0(fg1.g1 g1Var) {
        this.f343458a = g1Var;
    }

    @Override // tf.m0
    public void a() {
        fg1.f1 f1Var = this.f343458a.f343402b;
        pd1.m mVar = f1Var.f343392b;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).a(f1Var);
        }
    }

    @Override // tf.m0
    public void e(boolean z17) {
        fg1.f1 f1Var = this.f343458a.f343402b;
        pd1.m mVar = f1Var.f343392b;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).e(f1Var, z17);
        }
    }

    @Override // tf.m0
    public void f() {
        fg1.f1 f1Var = this.f343458a.f343402b;
        pd1.m mVar = f1Var.f343392b;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).f(f1Var);
        }
    }

    @Override // tf.m0
    public void j() {
        fg1.g1 g1Var = this.f343458a;
        if (g1Var.f343402b.f343392b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "onLoading from XWebOnPlayListener");
            fg1.f1 f1Var = g1Var.f343402b;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) f1Var.f343392b).c(f1Var);
        }
    }

    @Override // tf.m0
    public void l() {
        fg1.g1 g1Var = this.f343458a;
        if (g1Var.f343402b.f343392b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "onLoadEnd from XWebOnPlayListener");
            fg1.f1 f1Var = g1Var.f343402b;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) f1Var.f343392b).b(f1Var);
        }
    }

    @Override // tf.m0
    /* renamed from: onPause */
    public void mo129541xb01dfb57() {
        fg1.f1 f1Var = this.f343458a.f343402b;
        pd1.m mVar = f1Var.f343392b;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).d(f1Var);
        }
    }

    @Override // tf.m0
    /* renamed from: onStop */
    public void mo129542xc39f8281() {
        fg1.f1 f1Var = this.f343458a.f343402b;
        pd1.m mVar = f1Var.f343392b;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).g(f1Var);
        }
    }
}
