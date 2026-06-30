package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class v9 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f214765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd f214766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214767c;

    public v9(r45.h32 h32Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd c15287xabbcfcd, java.lang.String str) {
        this.f214765a = h32Var;
        this.f214766b = c15287xabbcfcd;
        this.f214767c = str;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            cl0.g gVar = new cl0.g();
            gVar.s("source_type", 4);
            r45.h32 h32Var = this.f214765a;
            r45.q65 q65Var = (r45.q65) h32Var.m75936x14adae67(10);
            boolean z18 = false;
            gVar.s("pay_type", java.lang.Integer.valueOf((q65Var == null || !q65Var.m75933x41a8a7f2(0)) ? 0 : 1));
            java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(8);
            if (m75945x2fec8307 != null) {
                if (m75945x2fec8307.length() > 0) {
                    z18 = true;
                }
            }
            gVar.s("page_type", z18 ? "get_ticket" : "");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd c15287xabbcfcd = this.f214766b;
            android.content.Context context = c15287xabbcfcd.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            cl0.g gVar2 = new cl0.g();
            gVar2.o("notice_type", 1);
            r45.ov2 a17 = zl2.t.a(h32Var);
            gVar2.h("coupon_id", a17 != null ? a17.m75945x2fec8307(1) : null);
            i95.m c17 = i95.n0.c(c50.c1.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c50.c1 c1Var = (c50.c1) c17;
            ml2.i5 i5Var = ml2.i5.f409103e;
            java.lang.String str = this.f214767c;
            java.lang.String valueOf = java.lang.String.valueOf(V6.m75939xb282bd08(5));
            java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(3);
            c50.c1.l9(c1Var, i5Var, str, 0L, 0, valueOf, null, null, null, null, m75945x2fec83072 == null ? "" : m75945x2fec83072, gVar.toString(), h32Var.m75945x2fec8307(4), gVar2.toString(), c15287xabbcfcd.f212626p, V6.m75939xb282bd08(5), null, 33248, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(c15287xabbcfcd.f212626p);
            java.lang.String m75945x2fec83073 = h32Var.m75945x2fec8307(4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.e(l0Var, V6, h17, 82, m75945x2fec83073 == null ? "" : m75945x2fec83073, 0, 16, null);
        }
    }
}
