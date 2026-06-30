package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public final class t0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f80612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.u0 f80614f;

    public t0(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.contact.u0 u0Var) {
        this.f80612d = e9Var;
        this.f80613e = i17;
        this.f80614f = u0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes wxaProfileAttributes = (com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes) obj;
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f80612d;
        hashMap.put(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE, wxaProfileAttributes != null ? new k91.d6(wxaProfileAttributes, e9Var) : null);
        com.tencent.mm.plugin.appbrand.jsapi.contact.u0 u0Var = this.f80614f;
        u0Var.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", 0);
        e9Var.a(this.f80613e, u0Var.t("ok", hashMap));
    }
}
