package yf1;

/* loaded from: classes7.dex */
public class m implements tf.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf1.n f543180a;

    public m(yf1.n nVar) {
        this.f543180a = nVar;
    }

    @Override // tf.m0
    public void a() {
    }

    @Override // tf.m0
    public void e(boolean z17) {
        yf1.n nVar = this.f543180a;
        pd1.m mVar = nVar.f543181a;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).e(nVar, z17);
        } else {
            nVar.f543182b = z17 ? 2 : 3;
        }
    }

    @Override // tf.m0
    public void f() {
        yf1.n nVar = this.f543180a;
        pd1.m mVar = nVar.f543181a;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).f(nVar);
        } else {
            nVar.f543182b = 7;
        }
    }

    @Override // tf.m0
    public void j() {
        yf1.n nVar = this.f543180a;
        pd1.m mVar = nVar.f543181a;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).c(nVar);
        } else {
            nVar.f543182b = 0;
        }
    }

    @Override // tf.m0
    public void l() {
        yf1.n nVar = this.f543180a;
        pd1.m mVar = nVar.f543181a;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).b(nVar);
        } else {
            nVar.f543182b = 1;
        }
    }

    @Override // tf.m0
    /* renamed from: onPause */
    public void mo129541xb01dfb57() {
        yf1.n nVar = this.f543180a;
        pd1.m mVar = nVar.f543181a;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).d(nVar);
        } else {
            nVar.f543182b = 4;
        }
    }

    @Override // tf.m0
    /* renamed from: onStop */
    public void mo129542xc39f8281() {
        yf1.n nVar = this.f543180a;
        pd1.m mVar = nVar.f543181a;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).d(nVar);
        } else {
            nVar.f543182b = 4;
        }
    }
}
