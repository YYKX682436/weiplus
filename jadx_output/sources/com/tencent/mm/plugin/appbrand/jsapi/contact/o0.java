package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class o0 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.p0 f80597d;

    public o0(com.tencent.mm.plugin.appbrand.jsapi.contact.p0 p0Var) {
        this.f80597d = p0Var;
    }

    @Override // z2.f
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 != 48) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.contact.p0 p0Var = this.f80597d;
        if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
            p0Var.f80604g.C(p0Var.f80601d, p0Var.f80602e, p0Var.f80603f, true);
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = p0Var.f80601d;
        int i18 = p0Var.f80603f;
        com.tencent.mm.plugin.appbrand.jsapi.contact.q0 q0Var = p0Var.f80604g;
        q0Var.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:system permission denied" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i18, q0Var.u(str, jSONObject));
    }
}
