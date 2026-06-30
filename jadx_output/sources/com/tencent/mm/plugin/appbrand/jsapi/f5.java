package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class f5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f80876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.g5 f80877e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f80878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f80879g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.jsapi.g5 g5Var, boolean z17, int i17) {
        super(0);
        this.f80876d = yVar;
        this.f80877e = g5Var;
        this.f80878f = z17;
        this.f80879g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f80876d;
        com.tencent.mm.plugin.appbrand.page.v5 a17 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(yVar);
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = a17 instanceof com.tencent.mm.plugin.appbrand.page.n7 ? (com.tencent.mm.plugin.appbrand.page.n7) a17 : null;
        if (n7Var != null) {
            n7Var.a2().setDisableContextMenuItems(this.f80878f ? Integer.MAX_VALUE : 0);
        } else if (yVar != null) {
            com.tencent.mm.plugin.appbrand.jsapi.g5 g5Var = this.f80877e;
            g5Var.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(this.f80879g, g5Var.u(str, jSONObject));
        }
        return jz5.f0.f302826a;
    }
}
