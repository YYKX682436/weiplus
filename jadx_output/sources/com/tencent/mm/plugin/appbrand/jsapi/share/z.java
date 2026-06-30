package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class z implements com.tencent.mm.plugin.appbrand.jsapi.share.s {
    public z(com.tencent.mm.plugin.appbrand.jsapi.share.m mVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void a(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void b(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask sendAppMessageTask, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void c(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void d(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, android.content.Intent intent) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public boolean e(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar) {
        java.lang.String str = uVar.C;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str.startsWith("delayLoadFile://");
    }

    public java.lang.String toString() {
        return "ShareTypeNormal{}";
    }
}
