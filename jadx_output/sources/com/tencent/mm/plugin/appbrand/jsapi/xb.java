package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class xb extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1289;
    private static final java.lang.String NAME = "publishWeChatStateDirectly";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams setTextStatusParams;
        android.content.Intent intent;
        k91.r m07;
        com.tencent.mm.vfs.r6 absoluteFile;
        java.lang.String o17;
        k91.r m08;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u08;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u09;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiPublishWeChatStateDirectly", "invoke, env is null");
            return;
        }
        java.lang.String appId = c0Var.getAppId();
        java.lang.String str3 = appId == null ? "" : appId;
        com.tencent.mm.plugin.appbrand.o6 t37 = c0Var.t3();
        java.lang.String str4 = (t37 == null || (u09 = t37.u0()) == null) ? null : u09.f47278x;
        java.lang.String str5 = str4 == null ? "" : str4;
        com.tencent.mm.plugin.appbrand.o6 t38 = c0Var.t3();
        int i18 = t38 != null ? t38.f74805p.f77281g : 0;
        com.tencent.mm.plugin.appbrand.o6 t39 = c0Var.t3();
        int i19 = (t39 == null || (u08 = t39.u0()) == null) ? 0 : u08.L;
        com.tencent.mm.plugin.appbrand.o6 t310 = c0Var.t3();
        java.lang.String n07 = t310 != null ? t310.n0() : null;
        if (n07 == null) {
            n07 = "";
        }
        if (i18 == 0) {
            str = n07;
        } else {
            str = n07 + (char) 183 + com.tencent.mm.plugin.appbrand.appcache.p.a(i18);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepareParams, rawAppName: ");
        sb6.append(n07);
        sb6.append(", appName: ");
        sb6.append(str);
        sb6.append(", content = ");
        sb6.append(jSONObject != null ? jSONObject.toString() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiPublishWeChatStateDirectly", sb6.toString());
        com.tencent.mm.plugin.appbrand.o6 t311 = c0Var.t3();
        java.lang.String str6 = (t311 == null || (u07 = t311.u0()) == null) ? null : u07.f77280f;
        java.lang.String str7 = str6 == null ? "" : str6;
        if (jSONObject == null) {
            com.tencent.mm.plugin.appbrand.o6 t312 = c0Var.t3();
            java.lang.String b17 = (t312 == null || (m08 = t312.m0()) == null) ? null : m08.b();
            if (b17 == null) {
                b17 = "";
            }
            java.lang.String str8 = str;
            java.lang.String str9 = b17;
            intent = null;
            setTextStatusParams = new com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams(null, null, null, str9, null, null, false, str3, str5, i18, i19, str8, str7, false, null, 24695, null);
        } else {
            java.lang.String str10 = str;
            java.lang.String a17 = nf.e.a(jSONObject, "state");
            java.lang.String a18 = nf.e.a(jSONObject, "imgUrl");
            if (r26.i0.A(a18, "wxfile://", false, 2, null)) {
                com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = c0Var.getFileSystem();
                str2 = (fileSystem == null || (absoluteFile = fileSystem.getAbsoluteFile(a18)) == null || (o17 = absoluteFile.o()) == null) ? "" : o17;
            } else {
                str2 = a18;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiPublishWeChatStateDirectly", "prepareParams, rawThumbUrl: " + a18 + ", thumbUrl: " + str2);
            java.lang.String a19 = nf.e.a(jSONObject, "desc");
            com.tencent.mm.plugin.appbrand.o6 t313 = c0Var.t3();
            java.lang.String b18 = (t313 == null || (m07 = t313.m0()) == null) ? null : m07.b();
            intent = null;
            setTextStatusParams = new com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams(a17, str2, a19, nf.e.b(jSONObject, "url", b18 != null ? b18 : ""), nf.e.a(jSONObject, "verifyInfo"), nf.e.a(jSONObject, "activityId"), true, str3, str5, i18, i19, str10, str7, false, null, 24576, null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiPublishWeChatStateDirectly", "prepareParams, setTextStatusParams: " + setTextStatusParams);
        android.content.Context f147807d = c0Var.getF147807d();
        if (f147807d == null) {
            f147807d = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(f147807d);
        com.tencent.mm.plugin.appbrand.jsapi.wb wbVar = new com.tencent.mm.plugin.appbrand.jsapi.wb(c0Var, i17, this);
        com.tencent.mm.plugin.appbrand.jsapi.DoSetTextStatusRequest doSetTextStatusRequest = new com.tencent.mm.plugin.appbrand.jsapi.DoSetTextStatusRequest(setTextStatusParams);
        com.tencent.mm.plugin.appbrand.jsapi.vb vbVar = new com.tencent.mm.plugin.appbrand.jsapi.vb(wbVar);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(f147807d, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, doSetTextStatusRequest, vbVar, intent);
    }
}
