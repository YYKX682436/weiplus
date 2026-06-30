package be1;

/* loaded from: classes7.dex */
public final class d0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 919;
    private static final java.lang.String NAME = "getSystemInfoAsync";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.k0 f17 = lVar != null ? lVar.f("getSystemInfo") : null;
        be1.c0 c0Var = f17 instanceof be1.c0 ? (be1.c0) f17 : null;
        if (c0Var == null) {
            if (lVar != null) {
                lVar.a(i17, o("fail:not supported"));
            }
        } else if (lVar != null) {
            lVar.a(i17, p("ok", c0Var.B(lVar)));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return false;
    }
}
