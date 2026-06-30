package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class cj implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj f184593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.en2 f184594e;

    public cj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar, r45.en2 en2Var) {
        this.f184593d = ojVar;
        this.f184594e = en2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void G3(int i17, int i18, int i19, int i27) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void l(int i17, int i18, int i19, int i27) {
        cw2.da daVar;
        java.lang.String str;
        so2.n1 n1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar = this.f184593d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var = ojVar.f185717f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = k8Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) k8Var : null;
        java.lang.Integer valueOf = pzVar != null ? java.lang.Integer.valueOf(pzVar.f190295p) : null;
        java.lang.Object obj = ojVar.C;
        java.lang.Object tag = obj != null ? ((android.view.View) obj).getTag() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gi giVar = tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gi ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gi) tag : null;
        java.lang.Integer valueOf2 = giVar != null ? java.lang.Integer.valueOf(giVar.f185024d) : null;
        java.lang.String str2 = ojVar.f185719h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFragmentChange placeHold type=");
        r45.en2 en2Var = this.f184594e;
        sb6.append(en2Var.m75939xb282bd08(2));
        sb6.append(" from=");
        sb6.append(i17);
        sb6.append(" to=");
        sb6.append(i18);
        sb6.append(",fromType=");
        sb6.append(i19);
        sb6.append(" toType=");
        sb6.append(i27);
        sb6.append(",presentTabType=");
        sb6.append(valueOf);
        sb6.append(",targetTabType=");
        sb6.append(valueOf2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        int m75939xb282bd08 = en2Var.m75939xb282bd08(2);
        if (m75939xb282bd08 == 2 || m75939xb282bd08 == 6) {
            if (valueOf2 != null && i27 == valueOf2.intValue()) {
                java.lang.Object obj2 = ojVar.C;
                java.lang.Object tag2 = obj2 != null ? ((android.view.View) obj2).getTag() : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gi giVar2 = tag2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gi ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gi) tag2 : null;
                if (giVar2 == null || (n1Var = giVar2.f185021a) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(ojVar.f185719h, "removeItem " + en2Var.m75939xb282bd08(2) + " but holderFeed is null!");
                    cw2.da daVar2 = ojVar.C;
                    if (daVar2 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) daVar2).mo58788x65825f6();
                    }
                } else {
                    ojVar.B(en2Var.m75939xb282bd08(2) + "_onFragmentChange", n1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fi.f184916e);
                    ojVar.A();
                }
            } else if ((valueOf == null || i27 != valueOf.intValue()) && (daVar = ojVar.C) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) daVar).mo58788x65825f6();
            }
            java.util.Map map = ojVar.f185733y;
            if (map != null) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = ojVar.f185717f.getF204176d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                if (V6 == null || (str = V6.m75945x2fec8307(2)) == null) {
                    str = "";
                }
                map.put("finder_tab_context_id", str);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("lead_to_rec_card", "view_clk", map, 1, false);
            }
            ojVar.f185733y = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    /* renamed from: onPageScrolled */
    public void mo55649xf210c75a(int i17, float f17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void z(boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
