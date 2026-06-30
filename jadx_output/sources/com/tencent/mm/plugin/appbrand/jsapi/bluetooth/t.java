package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class t extends ib1.c {
    @Override // ib1.c, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        super.A(yVar, jSONObject, i17);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = yVar.t3();
        if (t37 == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h hVar = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80074b;
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s c17 = hVar.c(t37);
        if (c17 != null) {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s.n8(c17, false, 1, null);
        }
        hVar.b(t37);
    }
}
