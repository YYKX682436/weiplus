package sm2;

/* loaded from: classes3.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491294d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(sm2.o4 o4Var) {
        super(7);
        this.f491294d = o4Var;
    }

    @Override // yz5.u
    public java.lang.Object K(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        yg2.b m57650x7eeca8cf;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        java.lang.String verifyUrl = (java.lang.String) obj3;
        int intValue = ((java.lang.Number) obj4).intValue();
        int intValue2 = ((java.lang.Number) obj5).intValue();
        java.lang.String errMsg = (java.lang.String) obj6;
        r45.l01 resp = (r45.l01) obj7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verifyUrl, "verifyUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        sm2.o4 o4Var = this.f491294d;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = ((mm2.c1) o4Var.f101142a.a(mm2.c1.class)).F5;
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = null;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        mm2.c1 c1Var = (mm2.c1) o4Var.f101142a.a(mm2.c1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null && (m57650x7eeca8cf = k0Var.m57650x7eeca8cf()) != null) {
            r2Var2 = p3325xe03a0797.p3326xc267989b.l.d(m57650x7eeca8cf, null, null, new sm2.v(this.f491294d, booleanValue, intValue2, resp, booleanValue2, verifyUrl, intValue, errMsg, null), 3, null);
        }
        c1Var.F5 = r2Var2;
        return jz5.f0.f384359a;
    }
}
