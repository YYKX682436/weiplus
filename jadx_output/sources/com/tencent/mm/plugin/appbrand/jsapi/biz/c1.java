package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes7.dex */
public final class c1 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.biz.e1 f79954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f79955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f79956c;

    public c1(com.tencent.mm.plugin.appbrand.jsapi.biz.e1 e1Var, org.json.JSONObject jSONObject, boolean z17) {
        this.f79954a = e1Var;
        this.f79955b = jSONObject;
        this.f79956c = z17;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        l81.b1 e17;
        com.tencent.mm.ui.MMActivity activityContext;
        com.tencent.mm.ui.MMActivity activityContext2;
        java.lang.String str;
        kotlin.jvm.internal.o.g(err_msg, "err_msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBizPublishImageForAppBrand", "checkHasFinishRegisterAndLogin, success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        com.tencent.mm.plugin.appbrand.jsapi.biz.e1 e1Var = this.f79954a;
        if (!z17) {
            if (jSONObject == null || (str = jSONObject.toString()) == null) {
                str = "";
            }
            e1Var.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiOpenBizPublishImageForAppBrand$OpenBizPublishImageProcessResponse(false, err_msg, str));
            return;
        }
        tk.v vVar = tk.w.f419878e;
        org.json.JSONObject jSONObject2 = this.f79955b;
        java.lang.String optString = jSONObject2.optString("mpPublishAction", "openWeApp");
        e17 = e1Var.e(jSONObject2);
        e17.f317037o = new com.tencent.mm.plugin.appbrand.jsapi.biz.b1(e1Var);
        com.tencent.mm.plugin.appbrand.jsapi.biz.a1 a1Var = new com.tencent.mm.plugin.appbrand.jsapi.biz.a1(e1Var);
        tk.v vVar2 = tk.w.f419878e;
        if (u46.l.d(optString, "openImage")) {
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            activityContext2 = e1Var.getActivityContext();
            kotlin.jvm.internal.o.f(activityContext2, "access$getActivityContext(...)");
            ((ox.g) oVar).rj(this.f79956c, activityContext2, e17, a1Var);
            return;
        }
        tk.o oVar2 = (tk.o) i95.n0.c(tk.o.class);
        activityContext = e1Var.getActivityContext();
        kotlin.jvm.internal.o.f(activityContext, "access$getActivityContext(...)");
        ((ox.g) oVar2).sj(activityContext, e17, a1Var);
    }
}
