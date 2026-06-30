package cb1;

/* loaded from: classes7.dex */
public class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f121767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cb1.g f121768c;

    public f(cb1.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17) {
        this.f121768c = gVar;
        this.f121766a = v5Var;
        this.f121767b = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.od0 od0Var = (r45.od0) obj;
        cb1.g gVar = this.f121768c;
        int i17 = this.f121767b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f121766a;
        if (od0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData cgi failed, null response");
            v5Var.a(i17, gVar.o("fail:cgi fail"));
            return null;
        }
        int i18 = od0Var.f76492x92037252.f458492d;
        if (i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData cgi failed, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), od0Var.f76492x92037252.f458493e);
            v5Var.a(i17, gVar.o("fail:cgi fail"));
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData success");
        v5Var.a(i17, gVar.o("ok"));
        return null;
    }
}
