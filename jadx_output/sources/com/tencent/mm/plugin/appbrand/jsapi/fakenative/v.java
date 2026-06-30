package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public final class v extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "saveSplashScreenshot";

    static {
        new com.tencent.mm.plugin.appbrand.jsapi.fakenative.q(null);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 env = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mm.plugin.appbrand.o6 t37 = env != null ? env.t3() : null;
        if (t37 == null) {
            if (env != null) {
                env.a(i17, o("fail:internal error"));
                return;
            }
            return;
        }
        kotlin.jvm.internal.o.g(env, "env");
        if (!(gk1.g.f272463f.a() && env.t3().u0().f77292e2)) {
            env.a(i17, o("fail:not supported"));
            return;
        }
        if (t37.f74811t != null) {
            env.a(i17, o("fail: not ready for screenshot"));
            return;
        }
        com.tencent.mm.plugin.appbrand.m6.a(env.getAppId()).getClass();
        pq5.g a17 = pq5.h.a();
        a17.f(t37);
        a17.h(new com.tencent.mm.plugin.appbrand.jsapi.fakenative.r(t37, env, i17, this)).i(new com.tencent.mm.plugin.appbrand.jsapi.fakenative.u(t37, env, i17, this)).B();
    }
}
