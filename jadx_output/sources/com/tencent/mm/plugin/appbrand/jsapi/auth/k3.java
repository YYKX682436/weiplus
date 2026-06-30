package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class k3 extends com.tencent.mm.plugin.appbrand.jsapi.auth.n3 {

    /* renamed from: e, reason: collision with root package name */
    public final r45.n24 f79621e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f79622f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(com.tencent.mm.plugin.appbrand.jsapi.auth.h4 sharedContext, r45.n24 n24Var, boolean z17) {
        super(sharedContext, null);
        kotlin.jvm.internal.o.g(sharedContext, "sharedContext");
        this.f79621e = n24Var;
        this.f79622f = z17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.n3
    public void d() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.auth.h4 h4Var = this.f79539d;
        com.tencent.mm.plugin.appbrand.jsapi.auth.j4 j4Var = h4Var.f79570d;
        com.tencent.mm.plugin.appbrand.jsapi.ff invokeContext = h4Var.f79571e;
        j4Var.getClass();
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        r45.n24 n24Var = this.f79621e;
        r45.j14 j14Var = n24Var != null ? n24Var.f381015d : null;
        int i17 = invokeContext.f81016e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = invokeContext.f81013b;
        if (j14Var == null) {
            if (this.f79622f) {
                str = android.text.TextUtils.isEmpty("fail:confirm cgi fail") ? "fail:cgi failed for response null" : "fail:confirm cgi fail";
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 109);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                lVar.a(i17, j4Var.u(str, jSONObject));
                return;
            }
            str = android.text.TextUtils.isEmpty("fail:cgi fail") ? "fail:cgi failed for response null" : "fail:cgi fail";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 109);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, j4Var.u(str, jSONObject2));
            return;
        }
        int i18 = j14Var.f377491d;
        java.lang.String str5 = j14Var.f377492e;
        if (str5 == null || str5.length() == 0) {
            str2 = "fail:login error " + i18;
        } else {
            str2 = "fail:" + str5;
        }
        int i19 = j14Var.f377493f;
        if (i19 == 0) {
            i19 = 1000;
        }
        java.lang.String str6 = android.text.TextUtils.isEmpty(str2) ? null : str2;
        if (str6 == null) {
            str6 = "";
        }
        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", i19);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        lVar.a(i17, j4Var.u(str6, jSONObject3));
    }
}
