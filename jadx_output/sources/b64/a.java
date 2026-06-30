package b64;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b64.b f18163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.o f18164e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b64.b bVar, com.tencent.mm.plugin.lite.api.o oVar) {
        super(1);
        this.f18163d = bVar;
        this.f18164e = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiAdBase$invoke$env$1");
        org.json.JSONObject it = (org.json.JSONObject) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiAdBase$invoke$env$1");
        kotlin.jvm.internal.o.g(it, "it");
        int optInt = it.optInt("errCode", -1);
        java.lang.String optString = it.optString("errMsg");
        if (optString == null) {
            optString = "";
        }
        com.tencent.mm.plugin.lite.api.o invokeCallback = this.f18164e;
        b64.b bVar = this.f18163d;
        if (optInt == 0) {
            kotlin.jvm.internal.o.f(invokeCallback, "$invokeCallback");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$success", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiAdBase");
            bVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiAdBase");
            try {
                invokeCallback.c(it, false);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAdJs.ApiBase", "callback has something wrong " + th6.getMessage());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiAdBase");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$success", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiAdBase");
        } else {
            kotlin.jvm.internal.o.f(invokeCallback, "$invokeCallback");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$fail", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiAdBase");
            bVar.A(invokeCallback, optString);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$fail", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiAdBase");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiAdBase$invoke$env$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiAdBase$invoke$env$1");
        return f0Var;
    }
}
