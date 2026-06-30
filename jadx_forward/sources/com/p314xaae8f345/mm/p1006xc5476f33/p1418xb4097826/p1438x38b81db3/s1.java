package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class s1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f186049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter f186051f;

    public s1(int i17, so2.y0 y0Var, in5.s0 s0Var, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter) {
        this.f186049d = y0Var;
        this.f186050e = s0Var;
        this.f186051f = nPresenter;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        so2.y0 y0Var = this.f186049d;
        if (itemId != 0) {
            if (itemId == 1) {
                this.f186051f.r0(y0Var);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5 v5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class);
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = y0Var.f492247r;
        java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb != null ? interfaceC4987x84e327cb.mo42933xb5885648() : null;
        if (mo42933xb5885648 == null) {
            mo42933xb5885648 = "";
        }
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) v5Var).Bi(mo42933xb5885648) == null) {
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6 n6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6.class);
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = y0Var.f492247r;
            java.lang.String mo42933xb58856482 = interfaceC4987x84e327cb2 != null ? interfaceC4987x84e327cb2.mo42933xb5885648() : null;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t2) n6Var).wi(mo42933xb58856482 != null ? mo42933xb58856482 : "", y0Var.f492247r);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Vi(y0Var.f492247r);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.s0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.y5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.y5.class))).wi(this.f186050e.f374654e, y0Var.f492247r, 1000039, null);
    }
}
