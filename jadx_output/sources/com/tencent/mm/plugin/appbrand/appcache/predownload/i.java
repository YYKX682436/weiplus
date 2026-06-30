package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes4.dex */
public class i extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public static final android.util.LongSparseArray f75850m = new android.util.LongSparseArray();

    static {
        new android.util.LongSparseArray();
    }

    public i(java.util.List list, com.tencent.mm.plugin.appbrand.appcache.predownload.h hVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.wg wgVar = new r45.wg();
        wgVar.f389143d.addAll(list);
        lVar.f70664a = wgVar;
        lVar.f70665b = new r45.xg();
        lVar.f70667d = 2763;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxasync/wxabatchsyncversion";
        p(lVar.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0203, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0206, code lost:
    
        if (r15 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x024f, code lost:
    
        if (r1.moveToNext() != false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0209, code lost:
    
        kotlin.jvm.internal.o.d(r0);
        r15 = new r45.kj6();
        r15.f378767d = r0;
        r9 = com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo.a(r1.getString(2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021c, code lost:
    
        if (r9 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021e, code lost:
    
        r9 = r9.f77444d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0222, code lost:
    
        r15.f378768e = r9;
        r8.put(r0, r15);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BatchSyncVersionUtils", "collectPreDownloadWhiteListReqList, matched username:" + r0 + ", appId:" + r10 + ", usedTime:" + r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0221, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0205, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0252, code lost:
    
        vz5.b.a(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ee, code lost:
    
        if (r1.moveToFirst() != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f0, code lost:
    
        r0 = r1.getString(0);
        r10 = r1.getString(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01fa, code lost:
    
        if (r0 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0200, code lost:
    
        if (r0.length() != 0) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List s() {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.predownload.i.s():java.util.List");
    }

    public static void t() {
        long nanoTime = java.lang.System.nanoTime();
        android.util.LongSparseArray longSparseArray = f75850m;
        synchronized (longSparseArray) {
            longSparseArray.put(nanoTime, longSparseArray);
        }
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.appcache.predownload.h(nanoTime), "MicroMsg.AppBrand.CgiBatchSyncPkgVersion");
    }

    @Override // com.tencent.mm.modelbase.i
    public synchronized pq5.g l() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1422, 3);
        return super.l();
    }
}
