package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class g1 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    private static final int CTRL_INDEX = 909;
    private static final java.lang.String NAME = "loadWAFileSync";

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.file.f1 f81063g = new com.tencent.mm.plugin.appbrand.jsapi.file.f1(null);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.y env = (com.tencent.mm.plugin.appbrand.y) lVar;
        kotlin.jvm.internal.o.g(env, "env");
        com.tencent.mm.plugin.appbrand.jsapi.j0 a17 = f81063g.a(env, "Luggage.JsApiLoadWAFileSync", jSONObject);
        java.lang.String str = a17.f81320b;
        boolean b17 = kotlin.jvm.internal.o.b(str, "ok");
        java.util.Map map = a17.f81319a;
        if (b17) {
            java.lang.String w17 = w(env, str, map);
            kotlin.jvm.internal.o.d(w17);
            return w17;
        }
        java.lang.String p17 = p(str, map);
        kotlin.jvm.internal.o.d(p17);
        return p17;
    }
}
