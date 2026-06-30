package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public final class t3 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 876;
    public static final java.lang.String NAME = "joinGroup";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String appId = env.getAppId();
        if (appId == null || appId.length() == 0) {
            env.a(i17, o("fail:appId is null"));
            return;
        }
        java.lang.String optString = data.optString("signature");
        java.lang.String optString2 = data.optString("groupId");
        java.lang.String optString3 = data.optString("nonceStr");
        vg3.i3 i3Var = new vg3.i3();
        i3Var.f436712d = appId;
        i3Var.f436715g = optString;
        i3Var.f436713e = optString2;
        i3Var.f436714f = optString3;
        ((hn.s) ((vg3.k3) i95.n0.c(vg3.k3.class))).Bi(env.getContext(), i3Var);
        env.a(i17, o("ok"));
    }
}
