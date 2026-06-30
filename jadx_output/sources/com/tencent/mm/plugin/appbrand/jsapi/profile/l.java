package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public final class l extends com.tencent.mm.plugin.appbrand.jsapi.profile.j {
    private static final int CTRL_INDEX = 1229;
    private static final java.lang.String NAME = "openWeComUserProfileForFakeNative";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.profile.j
    public com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest C(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String jSONObject = data.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        return new com.tencent.mm.plugin.appbrand.jsapi.profile.ReqJumpToProfileRequest(jSONObject);
    }
}
