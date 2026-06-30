package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ms extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f195094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ch1 f195096f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f195097g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, java.lang.String str, r45.ch1 ch1Var, r45.y23 y23Var) {
        super(4);
        this.f195094d = etVar;
        this.f195095e = str;
        this.f195096f = ch1Var;
        this.f195097g = y23Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String m75945x2fec8307;
        df2.xw xwVar;
        java.lang.String str;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        r45.tp2 resp = (r45.tp2) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f195094d;
        java.lang.String str2 = this.f195095e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.G1(etVar, intValue, intValue2, str2.toString(), resp.m75945x2fec8307(1), null, 16, null);
        r45.ch1 msg = this.f195096f;
        if (intValue == 0 && intValue2 == 0) {
            df2.nw nwVar = df2.xw.f313341w;
            jz5.l[] lVarArr = new jz5.l[5];
            lVarArr[0] = new jz5.l("msg_id", java.lang.String.valueOf(msg.m75945x2fec8307(2)));
            lVarArr[1] = new jz5.l("msg_text", str2);
            r45.y23 y23Var = this.f195097g;
            if (y23Var == null || (str = java.lang.Long.valueOf(y23Var.m75942xfb822ef2(0)).toString()) == null) {
                str = "";
            }
            lVarArr[2] = new jz5.l("product_id", str);
            lVarArr[3] = new jz5.l("has_emoji", zl2.r4.f555483a.p1(str2) ? "1" : "0");
            lVarArr[4] = new jz5.l("has_at", (r26.n0.D(str2, "\u2005", false, 2, null) && r26.n0.C(str2, '@', false, 2, null)) ? "1" : "0");
            nwVar.a(2, kz5.c1.k(lVarArr));
        } else {
            r45.zm6 zm6Var = (r45.zm6) resp.m75936x14adae67(7);
            if (zm6Var != null && zm6Var.m75933x41a8a7f2(1)) {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eby);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                zl2.q4 q4Var = zl2.q4.f555466a;
                r45.zm6 zm6Var2 = (r45.zm6) resp.m75936x14adae67(7);
                if (zm6Var2 != null && (m75945x2fec8307 = zm6Var2.m75945x2fec8307(0)) != null) {
                    string = m75945x2fec8307;
                }
                q4Var.P(string);
            }
        }
        if (((java.lang.Boolean) ae2.in.S6.r()).booleanValue() && (xwVar = (df2.xw) this.f195094d.U0(df2.xw.class)) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5491xce09ac21 c5491xce09ac21 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5491xce09ac21();
            am.vb vbVar = new am.vb();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            so0.c cVar = new so0.c();
            cVar.f491741e = java.lang.Long.valueOf(xwVar.c7());
            cVar.f491742f = msg.mo14344x5f01b1f6();
            linkedList.add(cVar);
            vbVar.f89719a = linkedList;
            vbVar.f89720b = false;
            c5491xce09ac21.f135824g = vbVar;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = xwVar.f313350u;
            if (abstractC20980x9b9ad01d != null) {
                abstractC20980x9b9ad01d.mo1xf5bc2045(c5491xce09ac21);
            }
        }
        return jz5.f0.f384359a;
    }
}
