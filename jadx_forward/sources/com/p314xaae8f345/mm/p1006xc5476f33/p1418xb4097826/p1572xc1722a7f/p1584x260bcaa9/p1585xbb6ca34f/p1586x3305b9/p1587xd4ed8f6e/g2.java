package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class g2 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.v f203220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.i2 f203221e;

    public g2(vp2.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.i2 i2Var) {
        this.f203220d = vVar;
        this.f203221e = i2Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        vp2.v vVar = this.f203220d;
        if (i17 > vVar.f520491e.size()) {
            return;
        }
        java.lang.Object obj = vVar.f520491e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        android.content.Context context = holder.f374654e;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            boolean z17 = j5Var instanceof vp2.r;
            vp2.r rVar = z17 ? (vp2.r) j5Var : null;
            if (rVar != null) {
                ((sp2.b0) pf5.z.f435481a.a(abstractActivityC21394xb3d2c0cf).a(sp2.b0.class)).R6((r45.dd2) rVar.f520485d.m75936x14adae67(0));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.i2 i2Var = this.f203221e;
            i2Var.getClass();
            rq2.w wVar = (rq2.w) pf5.z.f435481a.a(abstractActivityC21394xb3d2c0cf).a(rq2.w.class);
            if (wVar != null) {
                vp2.r rVar2 = z17 ? (vp2.r) j5Var : null;
                if (rVar2 != null) {
                    cl0.g gVar = new cl0.g();
                    r45.dd2 dd2Var = (r45.dd2) rVar2.f520485d.m75936x14adae67(0);
                    gVar.s("tab_id", java.lang.Integer.valueOf(dd2Var != null ? dd2Var.m75939xb282bd08(0) : 0));
                    gVar.s("card_index", java.lang.Integer.valueOf(i17));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveTabJumpersListConvert", "handleClickReport: " + gVar + ' ');
                    r45.qt2 qt2Var = i2Var.f203257e;
                    java.lang.String m75945x2fec8307 = qt2Var != null ? qt2Var.m75945x2fec8307(1) : null;
                    java.lang.String gVar2 = gVar.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                    wVar.Q6(m75945x2fec8307, "main_page_tab_card", r26.i0.t(gVar2, ",", ";", false));
                }
            }
        }
    }
}
