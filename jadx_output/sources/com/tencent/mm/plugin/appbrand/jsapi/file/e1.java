package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class e1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 908;
    private static final java.lang.String NAME = "loadWAFile";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y env = (com.tencent.mm.plugin.appbrand.y) lVar;
        kotlin.jvm.internal.o.g(env, "env");
        com.tencent.mm.plugin.appbrand.jsapi.j0 a17 = com.tencent.mm.plugin.appbrand.jsapi.file.g1.f81063g.a(env, "Luggage.JsApiLoadWAFile", jSONObject);
        java.lang.String str = a17.f81320b;
        boolean b17 = kotlin.jvm.internal.o.b(str, "ok");
        java.util.Map map = a17.f81319a;
        env.a(i17, b17 ? w(env, str, map) : p(str, map));
    }
}
