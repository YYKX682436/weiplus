package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public abstract class r4 {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r2.f378074h == r7.f378074h) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00b6, code lost:
    
        if (kotlin.jvm.internal.o.b(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, r10.f85462e) != false) goto L147;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final r45.me3[] a(r45.kf r9, com.tencent.mm.plugin.appbrand.launching.z6 r10) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.r4.a(r45.kf, com.tencent.mm.plugin.appbrand.launching.z6):r45.me3[]");
    }

    public static final /* synthetic */ java.util.List b(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo wxaAttributes$WxaPluginCodeInfo = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo) it.next();
            kotlin.jvm.internal.o.g(wxaAttributes$WxaPluginCodeInfo, "<this>");
            com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo = new com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo();
            wxaPluginPkgInfo.provider = wxaAttributes$WxaPluginCodeInfo.f77433d;
            wxaPluginPkgInfo.version = wxaAttributes$WxaPluginCodeInfo.f77434e;
            wxaPluginPkgInfo.f75405md5 = wxaAttributes$WxaPluginCodeInfo.f77435f;
            wxaPluginPkgInfo.prefixPath = wxaAttributes$WxaPluginCodeInfo.f77436g;
            wxaPluginPkgInfo.contexts = wxaAttributes$WxaPluginCodeInfo.f77438i;
            arrayList.add(wxaPluginPkgInfo);
        }
        return arrayList;
    }

    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.o6 c(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo wxaAttributes$WxaPluginCodeInfo, int i17) {
        com.tencent.mm.plugin.appbrand.launching.w6 v6Var;
        java.lang.String obj;
        kotlin.jvm.internal.o.g(wxaAttributes$WxaPluginCodeInfo, "<this>");
        java.lang.String provider = wxaAttributes$WxaPluginCodeInfo.f77433d;
        kotlin.jvm.internal.o.f(provider, "provider");
        boolean z17 = true;
        int i18 = !com.tencent.mm.sdk.platformtools.t8.K0(wxaAttributes$WxaPluginCodeInfo.f77440n) ? 1 : 0;
        if (i17 > 0) {
            v6Var = new com.tencent.mm.plugin.appbrand.launching.v6(i17, 0L, 2, null);
        } else if (wxaAttributes$WxaPluginCodeInfo.f77437h) {
            v6Var = new com.tencent.mm.plugin.appbrand.launching.u6(wxaAttributes$WxaPluginCodeInfo.f77434e, false, null, 6, null);
        } else {
            java.lang.String str = wxaAttributes$WxaPluginCodeInfo.f77441o;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                int i19 = wxaAttributes$WxaPluginCodeInfo.f77434e;
                java.lang.String str2 = wxaAttributes$WxaPluginCodeInfo.f77441o;
                v6Var = new com.tencent.mm.plugin.appbrand.launching.u6(i19, false, (str2 == null || (obj = r26.n0.u0(str2).toString()) == null) ? null : r26.i0.t(obj, " ", "", false), 2, null);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(wxaAttributes$WxaPluginCodeInfo.f77440n)) {
                v6Var = new com.tencent.mm.plugin.appbrand.launching.v6(wxaAttributes$WxaPluginCodeInfo.f77434e, 0L, 2, null);
            } else {
                java.lang.String versionDesc = wxaAttributes$WxaPluginCodeInfo.f77440n;
                kotlin.jvm.internal.o.f(versionDesc, "versionDesc");
                v6Var = new com.tencent.mm.plugin.appbrand.launching.t6(versionDesc);
            }
        }
        return new com.tencent.mm.plugin.appbrand.launching.o6(provider, "", 6, i18, v6Var, false);
    }
}
