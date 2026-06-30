package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class da0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f193776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 f193777e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da0(java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var) {
        super(0);
        this.f193776d = obj;
        this.f193777e = ea0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0 ga0Var;
        java.lang.Object obj = this.f193776d;
        boolean z17 = obj instanceof cm2.k0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var = this.f193777e;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ea0Var.f193923t, "update coupon " + obj);
            ea0Var.y1().i((cm2.k0) obj, true);
        } else if (obj instanceof cm2.m0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ea0Var.f193923t, "update goods  " + obj);
            cm2.m0 m0Var = (cm2.m0) obj;
            xt2.e3.j(ea0Var.y1(), m0Var.f124901v, true, false, 4, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0 ga0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0) ea0Var.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0.class);
            boolean z18 = false;
            if (ga0Var2 != null) {
                st2.h1 h1Var = ga0Var2.f194201r;
                if (h1Var != null && h1Var.h().isShowing) {
                    z18 = true;
                }
            }
            if (z18 && (ga0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0) ea0Var.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0.class)) != null) {
                r45.y23 productInfo = m0Var.f124901v;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productInfo, "productInfo");
                st2.h1 h1Var2 = ga0Var.f194201r;
                if (h1Var2 != null) {
                    java.lang.Object d17 = ((mm2.f6) h1Var2.f493868f.a(mm2.f6.class)).f410572o.d(new st2.m0(productInfo));
                    cm2.m0 m0Var2 = d17 instanceof cm2.m0 ? (cm2.m0) d17 : null;
                    if (m0Var2 != null) {
                        m0Var2.f124901v.set(52, (r45.t42) productInfo.m75936x14adae67(52));
                        h1Var2.P.U(-1, m0Var2.f124901v, 6);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveShoppingListPlugin", "onUpdateCountdownAnim for product " + productInfo.m75945x2fec8307(1) + " real product not found");
                    }
                }
            }
            xt2.e3 y17 = ea0Var.y1();
            y17.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on bubble update, animInfo = ");
            r45.t42 t42Var = (r45.t42) m0Var.f124901v.m75936x14adae67(52);
            sb6.append(t42Var != null ? t42Var.mo12245xcc313de3() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(y17.f538239h, sb6.toString());
            r45.t42 t42Var2 = (r45.t42) m0Var.f124901v.m75936x14adae67(52);
            if (t42Var2 != null) {
                ((mm2.f6) y17.f538238g.P0(mm2.f6.class)).E1.put(java.lang.Long.valueOf(m0Var.f124902w), t42Var2);
                y17.A.b(m0Var.f124902w, t42Var2, "bubble");
            }
        }
        return jz5.f0.f384359a;
    }
}
