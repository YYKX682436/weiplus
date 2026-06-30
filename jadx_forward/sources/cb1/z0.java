package cb1;

/* loaded from: classes7.dex */
public class z0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f121872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cb1.a1 f121873c;

    public z0(cb1.a1 a1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17) {
        this.f121873c = a1Var;
        this.f121871a = v5Var;
        this.f121872b = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.pu5 pu5Var = (r45.pu5) obj;
        cb1.a1 a1Var = this.f121873c;
        int i17 = this.f121872b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f121871a;
        if (pu5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData SaveUserAutoFillInfo cgi failed, null response");
            v5Var.a(i17, a1Var.o("fail:cgi fail"));
            return null;
        }
        int i18 = pu5Var.f76492x92037252.f458492d;
        if (i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData SaveUserAutoFillInfo cgi failed, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), pu5Var.f76492x92037252.f458493e);
            v5Var.a(i17, a1Var.o("fail:cgi fail"));
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData success");
        v5Var.a(i17, a1Var.o("ok"));
        return null;
    }
}
