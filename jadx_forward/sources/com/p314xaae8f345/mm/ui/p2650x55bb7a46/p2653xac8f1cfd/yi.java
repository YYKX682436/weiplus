package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.n1.class)
/* loaded from: classes9.dex */
public final class yi extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.n1, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f281858e;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        this.f281858e = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).ij();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("gh_3dfda90e39d6", this.f280113d.x()) || this.f281858e) {
            return;
        }
        ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
        android.app.Activity g17 = this.f280113d.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) d3Var).wi(g17, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
        android.app.Activity g17 = this.f280113d.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) d3Var).Bi(g17, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
        android.app.Activity g17 = this.f280113d.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) d3Var).Bi(g17, this);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayTemplateComponent", "onScreenShot");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("gh_3dfda90e39d6", this.f280113d.x()) || this.f281858e) {
            return;
        }
        int j18 = this.f280113d.j();
        int o17 = this.f280113d.o();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (j18 <= o17) {
            while (true) {
                android.view.View C = this.f280113d.p().C(j18, 0);
                if (C != null && C.getTag() != null) {
                    java.lang.Object tag = C.getTag();
                    if ((tag == null ? true : tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) && (g0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) C.getTag()) != null && (a0Var = g0Var.f39491xbb6bd679) != null && (a0Var instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105)) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105) a0Var;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21908xb66fd105.Q)) {
                            linkedList.add(c21908xb66fd105.Q);
                        }
                    }
                }
                if (j18 == o17) {
                    break;
                } else {
                    j18++;
                }
            }
        }
        if (linkedList.size() > 0) {
            ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi("client_pay_template_page", linkedList, 0);
        }
    }
}
