package bb1;

/* loaded from: classes7.dex */
public final class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1093;
    public static final java.lang.String NAME = "releaseInferenceSession";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            return;
        }
        int optInt = jSONObject != null ? jSONObject.optInt(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, -1) : -1;
        java.lang.String appId = lVar.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        ((ku5.t0) ku5.t0.f312615d).b(new bb1.f(optInt, lVar, i17, this), "SessionRunnerGuard+" + appId + '+' + optInt);
    }
}
