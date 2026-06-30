package be1;

/* loaded from: classes7.dex */
public final class g0 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    private static final int CTRL_INDEX = 918;
    private static final java.lang.String NAME = "getSystemInfoSync";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.k0 f17 = lVar != null ? lVar.f("getSystemInfo") : null;
        be1.c0 c0Var = f17 instanceof be1.c0 ? (be1.c0) f17 : null;
        if (c0Var == null) {
            java.lang.String o17 = o("fail:not supported");
            kotlin.jvm.internal.o.f(o17, "makeReturnJson(...)");
            return o17;
        }
        java.lang.String p17 = p("ok", c0Var.B(lVar));
        kotlin.jvm.internal.o.f(p17, "makeReturnJson(...)");
        return p17;
    }
}
