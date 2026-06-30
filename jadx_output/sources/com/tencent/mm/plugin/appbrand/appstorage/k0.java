package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appstorage.k0 f76245a = new com.tencent.mm.plugin.appbrand.appstorage.k0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f76246b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f76247c = new java.util.LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r22, long r23, long r25, long r27) {
        /*
            r21 = this;
            r1 = r22
            java.lang.String r0 = "appId"
            kotlin.jvm.internal.o.g(r1, r0)
            r0 = 1
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r2 = com.tencent.mm.plugin.appbrand.report.quality.e.b(r1, r0)
            r3 = 0
            if (r2 == 0) goto L11
            r9 = r0
            goto L12
        L11:
            r9 = r3
        L12:
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r4 = com.tencent.mm.plugin.appbrand.l.e(r22)
            r5 = 0
            if (r4 == 0) goto L21
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r4 = r4.f305852r
            if (r4 == 0) goto L21
            int r4 = r4.pkgVersion
            goto L25
        L21:
            if (r2 == 0) goto L28
            int r4 = r2.f88139i
        L25:
            long r7 = (long) r4
            r10 = r7
            goto L29
        L28:
            r10 = r5
        L29:
            if (r2 == 0) goto L2f
            int r4 = r2.f88136f
            r12 = r4
            goto L30
        L2f:
            r12 = r3
        L30:
            if (r2 == 0) goto L37
            int r2 = r2.f88137g
            long r4 = (long) r2
            r13 = r4
            goto L38
        L37:
            r13 = r5
        L38:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "start check: appId["
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r4 = "] minTemp["
            r2.append(r4)
            r4 = r23
            r2.append(r4)
            java.lang.String r6 = "] maxTemp["
            r2.append(r6)
            r6 = r25
            r2.append(r6)
            java.lang.String r8 = "] maxTotal["
            r2.append(r8)
            r6 = r27
            r2.append(r6)
            java.lang.String r8 = "] "
            r2.append(r8)
            r2.append(r9)
            r8 = 32
            r2.append(r8)
            r2.append(r13)
            r2.append(r8)
            r2.append(r12)
            r2.append(r8)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.String r8 = "MicroMsg.AppBrandStorageQuotaManager"
            com.tencent.mars.xlog.Log.i(r8, r2)
            com.tencent.mm.plugin.appbrand.o6 r2 = com.tencent.mm.plugin.appbrand.l.b(r22)
            r15 = 0
            if (r2 == 0) goto L98
            com.tencent.mm.plugin.appbrand.jsapi.file.l2 r2 = r2.getFileSystem()
            if (r2 == 0) goto L98
            com.tencent.mm.plugin.appbrand.appstorage.x1 r2 = r2.getStorageSpaceStatistics()
            goto L99
        L98:
            r2 = r15
        L99:
            if (r2 == 0) goto L9e
            r16 = r0
            goto La0
        L9e:
            r16 = r3
        La0:
            java.lang.String r8 = com.tencent.mm.sdk.platformtools.w9.f193053a
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams r2 = new com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams
            java.util.HashMap r17 = com.tencent.mm.plugin.appbrand.appstorage.k0.f76246b
            java.util.Map r18 = com.tencent.mm.plugin.appbrand.appstorage.k0.f76247c
            r0 = r2
            r1 = r22
            r19 = r2
            r2 = r23
            r4 = r25
            r6 = r27
            r20 = r8
            r8 = r17
            r15 = r16
            r16 = r18
            r0.<init>(r1, r2, r4, r6, r8, r9, r10, r12, r13, r15, r16)
            java.lang.Class<com.tencent.mm.plugin.appbrand.appstorage.j0> r0 = com.tencent.mm.plugin.appbrand.appstorage.j0.class
            r2 = r19
            r1 = r20
            r3 = 0
            com.tencent.mm.ipcinvoker.extension.l.a(r1, r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appstorage.k0.a(java.lang.String, long, long, long):void");
    }

    public final boolean b(java.lang.String appId, java.lang.String key) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.sdk.platformtools.o4 b17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.b("AppBrandStorageQuota");
        if (b17 == null) {
            return false;
        }
        return b17.f("storage_size_" + appId + '_' + key);
    }

    public final void c(java.lang.String str, java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        if (str == null) {
            return;
        }
        java.util.Map map = f76247c;
        if (((java.util.List) ((java.util.LinkedHashMap) map).get(str)) == null) {
            map.put(str, new java.util.ArrayList());
        }
        java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(str);
        if (list != null) {
            list.add(key);
        }
    }

    public final void d(java.lang.String key, java.lang.String path) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(path, "path");
        if (key.length() == 0) {
            return;
        }
        if (path.length() == 0) {
            return;
        }
        f76246b.put(key, path);
    }
}
