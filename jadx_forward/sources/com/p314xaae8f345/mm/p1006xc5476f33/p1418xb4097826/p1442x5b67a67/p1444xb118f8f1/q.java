package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1;

/* loaded from: classes2.dex */
public final class q implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 f186801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qj2 f186802e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var, r45.qj2 qj2Var) {
        this.f186801d = e0Var;
        this.f186802e = qj2Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var = this.f186801d;
        r45.ft4 ft4Var = (r45.ft4) ((zb2.c) e0Var.f186758o.get(i17)).f552792d.m75936x14adae67(0);
        e0Var.P6(ft4Var != null ? ft4Var.m75939xb282bd08(0) : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.util.Map c17 = d2Var.c(context);
        c17.put("native_drama_id", pm0.v.u(this.f186802e.m75942xfb822ef2(0)));
        c17.put("feed_id", java.lang.Long.valueOf(e0Var.f186765v));
        hc2.v0.b(view, "native_drama_collection_tab", "view_clk", 0, c17, null, 20, null);
    }
}
