package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.f0.class)
/* loaded from: classes10.dex */
public final class l7 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.f0 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f280933e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k7 f280934f;

    @Override // sb5.f0
    public com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a A() {
        return this.f280933e;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = this.f280933e;
        if (c20976x6ba6452a != null) {
            c20976x6ba6452a.m77667xac79a11b();
        }
        this.f280934f = null;
    }

    @Override // yn.d
    public void S(xm3.o0 pendingData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pendingData, "pendingData");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k7 k7Var = this.f280934f;
        if (k7Var != null) {
            java.util.List list = pendingData.f536899c;
            boolean z17 = !list.isEmpty();
            xm3.i iVar = xm3.i.f536860m;
            java.util.List list2 = pendingData.f536900d;
            boolean z18 = list2.contains(iVar) && list2.size() == 1;
            list.size();
            java.util.Objects.toString(list2);
            if (z18 || k7Var.f280883a) {
                return;
            }
            k7Var.f280883a = true;
            if (z17) {
            } else {
                ((jz5.n) k7Var.f280884b).mo141623x754a37bb();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        this.f280933e = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("MicroMsg.ChattingScopeComponent", null, 1);
        this.f280934f = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k7(this);
    }
}
