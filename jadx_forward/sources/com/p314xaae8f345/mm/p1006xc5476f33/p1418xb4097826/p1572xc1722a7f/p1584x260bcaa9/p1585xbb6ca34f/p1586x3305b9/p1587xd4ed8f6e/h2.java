package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class h2 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.i2 f203239a;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.i2 i2Var) {
        this.f203239a = i2Var;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        rq2.w wVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                android.content.Context context = parent.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                java.lang.Object obj = s0Var.f374657h;
                vp2.r rVar = obj instanceof vp2.r ? (vp2.r) obj : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.i2 i2Var = this.f203239a;
                i2Var.getClass();
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
                if (abstractActivityC21394xb3d2c0cf != null && (wVar = (rq2.w) pf5.z.f435481a.a(abstractActivityC21394xb3d2c0cf).a(rq2.w.class)) != null && rVar != null) {
                    cl0.g gVar = new cl0.g();
                    r45.dd2 dd2Var = (r45.dd2) rVar.f520485d.m75936x14adae67(0);
                    gVar.s("tab_id", java.lang.Integer.valueOf(dd2Var != null ? dd2Var.m75939xb282bd08(0) : 0));
                    android.view.View view = s0Var.f3639x46306858;
                    java.lang.Object tag = view != null ? view.getTag() : null;
                    java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
                    gVar.s("card_index", java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveTabJumpersListConvert", "handleExposeReport: " + gVar + ' ');
                    r45.qt2 qt2Var = i2Var.f203257e;
                    java.lang.String m75945x2fec8307 = qt2Var != null ? qt2Var.m75945x2fec8307(1) : null;
                    java.lang.String gVar2 = gVar.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                    wVar.P6("", m75945x2fec8307, "main_page_tab_card", r26.i0.t(gVar2, ",", ";", false));
                }
            }
        }
    }
}
