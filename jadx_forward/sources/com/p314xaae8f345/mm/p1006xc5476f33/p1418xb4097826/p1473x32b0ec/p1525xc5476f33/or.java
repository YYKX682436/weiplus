package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class or extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f195313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar) {
        super(4);
        this.f195313d = etVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String m75945x2fec8307;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        r45.tp2 resp = (r45.tp2) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f195313d;
        if (intValue == 0 && intValue2 == 0) {
            df2.oh ohVar = (df2.oh) etVar.U0(df2.oh.class);
            if (ohVar != null) {
                ohVar.Z6("doSendLocationMsg");
            }
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
        java.lang.String m75945x2fec83072 = resp.m75945x2fec8307(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nr nrVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nr(etVar);
        etVar.getClass();
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mr(intValue, intValue2, etVar, "", m75945x2fec83072, nrVar));
        return jz5.f0.f384359a;
    }
}
