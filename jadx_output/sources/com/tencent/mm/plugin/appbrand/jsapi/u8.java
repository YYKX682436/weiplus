package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class u8 extends com.tencent.mm.plugin.appbrand.jsapi.r8 {
    public static final int CTRL_INDEX = 905;
    public static final java.lang.String NAME = "openAddressWithLightMode";

    public u8() {
        si1.e.a(NAME);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.r8
    public void C(android.content.Intent intent, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(intent, "intent");
        intent.putExtra("force_light_mode", jSONObject != null ? jSONObject.optBoolean("forceLightMode", false) : false);
    }
}
