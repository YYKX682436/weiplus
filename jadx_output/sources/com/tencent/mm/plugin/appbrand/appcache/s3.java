package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public abstract class s3 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        r0.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r1.moveToNext() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r1.moveToFirst() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        r0.add(r1.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r1.moveToNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r1.moveToFirst() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        r3 = r1.getString(0);
        r5 = r3.indexOf(36);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r5 <= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        r3 = r3.substring(0, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a() {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            x51.k0 r1 = com.tencent.mm.plugin.appbrand.app.r9.Ri()
            java.lang.String r2 = "@LibraryAppId"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.String r3 = "select distinct appId from AppBrandWxaPkgManifestRecord where pkgPath is not null  and pkgPath != ''  and appId !=?"
            r4 = 2
            android.database.Cursor r1 = r1.f(r3, r2, r4)
            r2 = 0
            if (r1 == 0) goto L41
            boolean r3 = r1.isClosed()
            if (r3 != 0) goto L41
            boolean r3 = r1.moveToFirst()
            if (r3 == 0) goto L3e
        L25:
            java.lang.String r3 = r1.getString(r2)
            r5 = 36
            int r5 = r3.indexOf(r5)
            if (r5 <= 0) goto L35
            java.lang.String r3 = r3.substring(r2, r5)
        L35:
            r0.add(r3)
            boolean r3 = r1.moveToNext()
            if (r3 != 0) goto L25
        L3e:
            r1.close()
        L41:
            x51.k0 r1 = com.tencent.mm.plugin.appbrand.app.r9.Ri()
            java.lang.String r3 = "select distinct appId from PredownloadEncryptPkgInfo where pkgPath is not null  and pkgPath != '' "
            r5 = 0
            android.database.Cursor r1 = r1.f(r3, r5, r4)
            if (r1 == 0) goto L6a
            boolean r3 = r1.isClosed()
            if (r3 != 0) goto L6a
            boolean r3 = r1.moveToFirst()
            if (r3 == 0) goto L67
        L5a:
            java.lang.String r3 = r1.getString(r2)
            r0.add(r3)
            boolean r3 = r1.moveToNext()
            if (r3 != 0) goto L5a
        L67:
            r1.close()
        L6a:
            int r0 = r0.size()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.s3.a():int");
    }

    public static void b(long j17) {
        long availableBlocks;
        long j18;
        if (com.tencent.mm.plugin.appbrand.app.r9.Ri() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.IPkgCleanupLogic.Report", "reportStorageUsage, db not ready");
            return;
        }
        try {
            com.tencent.mm.autogen.mmdata.rpt.WeAppPackageCheckActionStruct weAppPackageCheckActionStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppPackageCheckActionStruct();
            com.tencent.mm.plugin.appbrand.appcache.r3 a17 = com.tencent.mm.plugin.appbrand.appcache.k3.a();
            weAppPackageCheckActionStruct.f62320d = a17.f75933a;
            weAppPackageCheckActionStruct.f62321e = java.lang.Math.round(a17.f75934b * 100.0d);
            android.os.StatFs statFs = new android.os.StatFs(lp0.b.e());
            long blockCountLong = statFs.getBlockCountLong();
            try {
                availableBlocks = statFs.getAvailableBlocksLong();
            } catch (java.lang.NoSuchMethodError unused) {
                availableBlocks = statFs.getAvailableBlocks();
            }
            weAppPackageCheckActionStruct.f62322f = java.lang.Math.round((availableBlocks / blockCountLong) * 100.0d);
            long j19 = 1;
            weAppPackageCheckActionStruct.f62323g = 1L;
            weAppPackageCheckActionStruct.f62324h = a();
            weAppPackageCheckActionStruct.f62325i = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j17);
            weAppPackageCheckActionStruct.f62329m = j17;
            if (!com.tencent.mm.plugin.appbrand.appcache.l3.f75641a.f75911d.get()) {
                j19 = 0;
            }
            weAppPackageCheckActionStruct.f62326j = j19;
            java.util.List l17 = com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.l();
            if (l17 == null) {
                j18 = 0;
            } else {
                java.util.Iterator it = ((java.util.ArrayList) l17).iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    if (com.tencent.mm.vfs.w6.j((java.lang.String) it.next())) {
                        i17++;
                    }
                }
                j18 = i17;
            }
            weAppPackageCheckActionStruct.f62327k = j18;
            weAppPackageCheckActionStruct.f62328l = com.tencent.mm.plugin.appbrand.appstorage.l1.c(new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.appbrand.jsruntime.u1.a())) + 0 + com.tencent.mm.plugin.appbrand.appstorage.l1.c(new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.appbrand.jsruntime.u1.c()));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.IPkgCleanupLogic.Report", "reportStorageUsage %s", weAppPackageCheckActionStruct.n());
            weAppPackageCheckActionStruct.k();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.IPkgCleanupLogic.Report", "reportStorageUsage get exception:%s", e17);
        }
    }
}
