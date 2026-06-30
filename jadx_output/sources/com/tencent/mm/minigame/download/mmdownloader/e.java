package com.tencent.mm.minigame.download.mmdownloader;

/* loaded from: classes7.dex */
public final class e {
    public e(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(com.tencent.mm.minigame.download.mmdownloader.e eVar, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        java.lang.String str4;
        eVar.getClass();
        com.tencent.mm.plugin.appbrand.appcache.qa Di = com.tencent.mm.plugin.appbrand.app.r9.Di();
        if (Di == null) {
            return;
        }
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.appcache.a6.a(str2);
        java.lang.String str5 = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                str4 = "";
            } else {
                str4 = "$" + a17;
            }
            sb6.append(str4);
            str5 = sb6.toString();
        }
        kotlin.jvm.internal.o.f(str5, "toString(...)");
        com.tencent.mm.plugin.appbrand.appcache.n9 L = Di.L(str5, i17, i18, new java.lang.String[0]);
        if (L == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WVA.addDownloadTaskForWVA", "updatePkgPathToStorage: manifest not found for queryKey=".concat(str5));
            return;
        }
        L.field_pkgPath = str3;
        com.tencent.mm.plugin.appbrand.appcache.ra.c(Di, L);
        com.tencent.mars.xlog.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "updatePkgPathToStorage success: queryKey=" + str5 + ", pkgPath=" + str3);
    }
}
