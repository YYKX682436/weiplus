package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class f0 extends com.tencent.mm.plugin.appbrand.page.n2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f88664i;

    public f0(com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f88664i = c0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n2
    public void x(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f88664i;
        if (appBrandRuntime == c0Var.t3()) {
            ((com.tencent.mm.plugin.appbrand.me) c0Var.t3().f471743c2.b()).a(jSONObject);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n2
    public void y(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, boolean z17, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f88664i;
        c0Var.Y1(jSONObject);
        com.tencent.mm.plugin.appbrand.report.model.j.a(c0Var.t3(), jSONObject, z17);
        c0Var.O1(jSONObject);
    }
}
