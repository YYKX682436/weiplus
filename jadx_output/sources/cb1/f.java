package cb1;

/* loaded from: classes7.dex */
public class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cb1.g f40235c;

    public f(cb1.g gVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        this.f40235c = gVar;
        this.f40233a = v5Var;
        this.f40234b = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.od0 od0Var = (r45.od0) obj;
        cb1.g gVar = this.f40235c;
        int i17 = this.f40234b;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40233a;
        if (od0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData cgi failed, null response");
            v5Var.a(i17, gVar.o("fail:cgi fail"));
            return null;
        }
        int i18 = od0Var.BaseResponse.f376959d;
        if (i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData cgi failed, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), od0Var.BaseResponse.f376960e);
            v5Var.a(i17, gVar.o("fail:cgi fail"));
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData success");
        v5Var.a(i17, gVar.o("ok"));
        return null;
    }
}
