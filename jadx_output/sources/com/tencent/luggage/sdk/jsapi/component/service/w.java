package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class w extends com.tencent.mm.plugin.appbrand.page.n2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.y f47559i;

    public w(com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        this.f47559i = yVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n2
    public void x(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, org.json.JSONObject jSONObject) {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f47559i;
        if (appBrandRuntime == yVar.t3()) {
            ((com.tencent.mm.plugin.appbrand.me) yVar.t3().f471743c2.b()).a(jSONObject);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n2
    public void y(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, boolean z17, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.report.model.j.a(this.f47559i.t3(), jSONObject, z17);
    }
}
