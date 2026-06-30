package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

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
            x51.k0 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ri()
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
            x51.k0 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ri()
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.s3.a():int");
    }

    public static void b(long j17) {
        long availableBlocks;
        long j18;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ri() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.IPkgCleanupLogic.Report", "reportStorageUsage, db not ready");
            return;
        }
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7077x174546a0 c7077x174546a0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7077x174546a0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r3 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k3.a();
            c7077x174546a0.f143853d = a17.f157466a;
            c7077x174546a0.f143854e = java.lang.Math.round(a17.f157467b * 100.0d);
            android.os.StatFs statFs = new android.os.StatFs(lp0.b.e());
            long blockCountLong = statFs.getBlockCountLong();
            try {
                availableBlocks = statFs.getAvailableBlocksLong();
            } catch (java.lang.NoSuchMethodError unused) {
                availableBlocks = statFs.getAvailableBlocks();
            }
            c7077x174546a0.f143855f = java.lang.Math.round((availableBlocks / blockCountLong) * 100.0d);
            long j19 = 1;
            c7077x174546a0.f143856g = 1L;
            c7077x174546a0.f143857h = a();
            c7077x174546a0.f143858i = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j17);
            c7077x174546a0.f143862m = j17;
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l3.f157174a.f157444d.get()) {
                j19 = 0;
            }
            c7077x174546a0.f143859j = j19;
            java.util.List l17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.l();
            if (l17 == null) {
                j18 = 0;
            } else {
                java.util.Iterator it = ((java.util.ArrayList) l17).iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    if (com.p314xaae8f345.mm.vfs.w6.j((java.lang.String) it.next())) {
                        i17++;
                    }
                }
                j18 = i17;
            }
            c7077x174546a0.f143860k = j18;
            c7077x174546a0.f143861l = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.c(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.a())) + 0 + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.c(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.c()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.IPkgCleanupLogic.Report", "reportStorageUsage %s", c7077x174546a0.n());
            c7077x174546a0.k();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.IPkgCleanupLogic.Report", "reportStorageUsage get exception:%s", e17);
        }
    }
}
