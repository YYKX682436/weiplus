package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes.dex */
public final class y5 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1071;
    private static final java.lang.String NAME = "editImage";

    /* renamed from: g, reason: collision with root package name */
    public final int f82157g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null) {
            return;
        }
        java.lang.String optString = jSONObject != null ? jSONObject.optString("src") : null;
        if (optString == null) {
            optString = "";
        }
        java.lang.String str = optString;
        com.tencent.mm.plugin.appbrand.utils.o5.a(yVar, str, null, 6, new com.tencent.mm.plugin.appbrand.jsapi.media.x5(str, yVar, i17, this, jSONObject));
    }
}
