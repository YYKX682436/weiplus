package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.q f85664a;

    public p(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.q qVar) {
        this.f85664a = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer;
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t tVar = this.f85664a.f85665b;
        int i17 = com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t.f85668r3;
        tVar.getClass();
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(tVar.f74803n), com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.v.class);
        int i18 = 1;
        if (appBrandSysConfigWC != null) {
            appBrandSysConfigWC.f305852r = new com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo();
            appBrandSysConfigWC.f305852r.f75399d = tVar.u0().f77281g;
            appBrandSysConfigWC.f305852r.pkgVersion = tVar.u0().L;
            appBrandSysConfigWC.f305852r.f75401f = true;
            appBrandSysConfigWC.A = new com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized(com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle.f87392g, null, null, false, false, null, false, 0, null, 224, null);
        } else {
            appBrandSysConfigWC = null;
        }
        int i19 = 0;
        if (appBrandSysConfigWC == null) {
            tVar.l0();
        } else {
            ((com.tencent.mm.plugin.appbrand.m2) tVar.E).add(appBrandSysConfigWC);
            java.lang.String str = tVar.f74803n;
            java.lang.String str2 = tVar.f74803n;
            nf.y yVar = nf.x.f336616b;
            k91.r h17 = k91.r.h(str, "{}", "{}", false, yVar != null ? yVar.i(str2) : false);
            h17.f305736J = tVar.u0().f77283i;
            tVar.L1(h17);
            tVar.X1 = new si1.g(new si1.b1(tVar), -1, true);
            tVar.K0(true);
            tVar.s3();
        }
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t tVar2 = this.f85664a.f85665b;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = tVar2.u0();
        if (u07 == null || (appBrandLaunchReferrer = u07.D) == null || appBrandLaunchReferrer.f77322d != 7) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenSdkJsApiProcessor", "initConfig is null or lanunchScene is err, return");
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(!android.text.TextUtils.isEmpty(u07.S) ? u07.S : u07.D.f77332q);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.getString("args"));
                ik1.b0 b0Var = new ik1.b0();
                if (tVar2.getFileSystem().getTempDirectory(b0Var) == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
                    java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        java.lang.Object obj2 = jSONObject2.get(next);
                        if (obj2 instanceof java.lang.String) {
                            java.lang.String str3 = (java.lang.String) obj2;
                            if (((str3 == null || !str3.startsWith("content://")) ? i19 : i18) != 0) {
                                jSONObject2.put(next, com.tencent.mm.plugin.appbrand.utils.c4.a(tVar2, (java.lang.String) b0Var.f291824a, (java.lang.String) obj2));
                            }
                        }
                        if (obj2 instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray = (org.json.JSONArray) obj2;
                            for (int i27 = i19; i27 < jSONArray.length(); i27++) {
                                java.lang.Object obj3 = jSONArray.get(i27);
                                if (obj3 instanceof java.lang.String) {
                                    java.lang.String str4 = (java.lang.String) obj3;
                                    if (str4 != null && str4.startsWith("content://")) {
                                        jSONArray.put(com.tencent.mm.plugin.appbrand.utils.c4.a(tVar2, (java.lang.String) b0Var.f291824a, (java.lang.String) obj3));
                                    }
                                }
                            }
                            jSONObject2.put(next, jSONArray);
                            i18 = 1;
                            i19 = 0;
                        }
                    }
                    jSONObject.put("args", jSONObject2.toString());
                    java.lang.String jSONObject3 = jSONObject.toString();
                    if (android.text.TextUtils.isEmpty(u07.S)) {
                        u07.D.f77332q = jSONObject3;
                    } else {
                        u07.S = jSONObject3;
                    }
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.OpenSdkJsApiProcessor", "", e17);
            }
        }
        return null;
    }
}
