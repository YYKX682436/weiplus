package be1;

/* loaded from: classes7.dex */
public final class p0 implements d85.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f19490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f19492c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ be1.q0 f19494e;

    public p0(android.app.Activity activity, java.lang.String str, com.tencent.mm.plugin.appbrand.y yVar, int i17, be1.q0 q0Var) {
        this.f19490a = activity;
        this.f19491b = str;
        this.f19492c = yVar;
        this.f19493d = i17;
        this.f19494e = q0Var;
    }

    @Override // d85.l0
    public final void a(d85.h0 h0Var) {
        int i17 = h0Var == null ? -1 : be1.o0.f19488a[h0Var.ordinal()];
        be1.q0 q0Var = this.f19494e;
        int i18 = this.f19493d;
        com.tencent.mm.plugin.appbrand.y yVar = this.f19492c;
        int i19 = 2;
        if (i17 != 1) {
            if (i17 != 2) {
                i19 = 3;
                if (i17 != 3) {
                    com.tencent.mars.xlog.Log.e("JsApiRequestSystemCapabilityAuthorization", "requestPermission error: " + h0Var);
                    kotlin.jvm.internal.o.d(yVar);
                    q0Var.getClass();
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
                    yVar.a(i18, q0Var.u(str, jSONObject));
                    return;
                }
            } else {
                i19 = 1;
            }
        } else if (!z2.h.b(this.f19490a, this.f19491b)) {
            i19 = 6;
        }
        java.util.Map k17 = kz5.c1.k(new jz5.l("retCode", 0), new jz5.l("status", java.lang.Integer.valueOf(i19)), new jz5.l(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, java.lang.Boolean.valueOf(h0Var == d85.h0.GRANTED)));
        com.tencent.mars.xlog.Log.i("JsApiRequestSystemCapabilityAuthorization", "invoke: result " + k17);
        q0Var.getClass();
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!(k17 instanceof java.util.HashMap)) {
            k17 = new java.util.HashMap(k17);
        }
        k17.put("errno", 0);
        yVar.a(i18, q0Var.t("ok", k17));
    }
}
