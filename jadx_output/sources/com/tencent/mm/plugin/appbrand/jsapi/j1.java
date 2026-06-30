package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/j1;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/jsapi/SetTextStatusParams;", "setTextStatusParams", "Lbi4/d1;", "b", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class j1 extends com.tencent.mm.plugin.appbrand.ipc.v {
    private final bi4.d1 b(com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams setTextStatusParams) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        pj4.j0 j0Var = new pj4.j0();
        j0Var.f355139d = "7";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", setTextStatusParams.f78677n);
        java.lang.String str = setTextStatusParams.f78678o;
        jSONObject.put(dm.i4.COL_USERNAME, str);
        java.lang.String str2 = setTextStatusParams.f78673g;
        jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str2);
        int i17 = setTextStatusParams.f78680q;
        jSONObject.put("version", i17);
        int i18 = setTextStatusParams.f78679p;
        jSONObject.put("versionType", i18);
        java.lang.String str3 = setTextStatusParams.f78682s;
        jSONObject.put("headImageURL", str3);
        java.lang.String str4 = setTextStatusParams.f78684u;
        jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, str4);
        j0Var.f355141f = jSONObject.toString();
        pj4.x1 x1Var = new pj4.x1();
        java.lang.String str5 = setTextStatusParams.f78677n;
        x1Var.f355330d = str5;
        x1Var.f355331e = str2;
        x1Var.f355332f = str;
        x1Var.f355333g = i18;
        x1Var.f355334h = i17;
        x1Var.f355335i = str3;
        x1Var.f355336m = str4;
        j0Var.f355142g = android.util.Base64.encodeToString(x1Var.toByteArray(), 2);
        linkedList.add(j0Var);
        pj4.j0 j0Var2 = new pj4.j0();
        j0Var2.f355139d = "3";
        j0Var2.f355141f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
        linkedList.add(j0Var2);
        bi4.c1 c1Var = new bi4.c1();
        c1Var.g(setTextStatusParams.f78681r);
        c1Var.e("http://wxapp.tc.qq.com/258/20304/stodownload?m=78b18448b71e7f791aad33ecee51e533&filekey=30340201010420301e0202010204025348041078b18448b71e7f791aad33ecee51e53302020ad5040d00000004627466730000000131&hy=SH&storeid=32303231303432373134313731383030306535393731303030303030303037636638353130393030303030313032&bizid=1023");
        c1Var.d(setTextStatusParams.f78675i);
        c1Var.b(setTextStatusParams.f78670d);
        c1Var.f21034a.f354938e = setTextStatusParams.f78671e;
        c1Var.h(setTextStatusParams.f78674h);
        c1Var.a(setTextStatusParams.f78672f);
        c1Var.f21034a.f354951u = setTextStatusParams.f78676m;
        c1Var.c(linkedList);
        if (setTextStatusParams.f78683t) {
            c1Var.f(str5 + "@minigame");
        } else {
            c1Var.f(str5 + "@weapp");
        }
        bi4.d1 d1Var = c1Var.f21034a;
        kotlin.jvm.internal.o.f(d1Var, "build(...)");
        return d1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.DoSetTextStatusRequest)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiSetTextStatus", "handleRequest, request is not DoSetTextStatusRequest");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSetTextStatus", "handleRequest, setTextStatus");
        bi4.d1 b17 = b(((com.tencent.mm.plugin.appbrand.jsapi.DoSetTextStatusRequest) appBrandProxyUIProcessTask$ProcessRequest).getSetTextStatusParams());
        if (!b17.f354952v) {
            b17.f354952v = true;
        }
        xe0.g0 g0Var = (xe0.g0) i95.n0.c(xe0.g0.class);
        if (g0Var != null) {
            ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) g0Var).Ri(getActivityContext(), b17, new com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService$setTextStatusWithCallback$setStatusCallbackForJSAPI$1(new com.tencent.mm.plugin.appbrand.jsapi.i1(this)));
        }
        finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.EmptyResult());
    }
}
