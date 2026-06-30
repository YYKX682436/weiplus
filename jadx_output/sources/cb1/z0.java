package cb1;

/* loaded from: classes7.dex */
public class z0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cb1.a1 f40340c;

    public z0(cb1.a1 a1Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        this.f40340c = a1Var;
        this.f40338a = v5Var;
        this.f40339b = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.pu5 pu5Var = (r45.pu5) obj;
        cb1.a1 a1Var = this.f40340c;
        int i17 = this.f40339b;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40338a;
        if (pu5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData SaveUserAutoFillInfo cgi failed, null response");
            v5Var.a(i17, a1Var.o("fail:cgi fail"));
            return null;
        }
        int i18 = pu5Var.BaseResponse.f376959d;
        if (i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData SaveUserAutoFillInfo cgi failed, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), pu5Var.BaseResponse.f376960e);
            v5Var.a(i17, a1Var.o("fail:cgi fail"));
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData success");
        v5Var.a(i17, a1Var.o("ok"));
        return null;
    }
}
