package of1;

/* loaded from: classes7.dex */
public final class y0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f426591a;

    public y0(of1.w1 w1Var) {
        this.f426591a = w1Var;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onSetRequestedOrientation */
    public boolean mo74541x45294025(int i17) {
        of1.w1 w1Var = this.f426591a;
        xi1.m C1 = w1Var.f426567e.C1();
        if (C1 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onSetRequestedOrientation hash[%d] NULL fullscreenImpl", java.lang.Integer.valueOf(w1Var.hashCode()));
            return false;
        }
        C1.h(xi1.j.a(i17));
        return true;
    }
}
