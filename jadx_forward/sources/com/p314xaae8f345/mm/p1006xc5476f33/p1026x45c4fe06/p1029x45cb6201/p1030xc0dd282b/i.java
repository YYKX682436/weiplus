package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b;

/* loaded from: classes4.dex */
public class i extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public static final android.util.LongSparseArray f157383m = new android.util.LongSparseArray();

    static {
        new android.util.LongSparseArray();
    }

    public i(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.h hVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.wg wgVar = new r45.wg();
        wgVar.f470676d.addAll(list);
        lVar.f152197a = wgVar;
        lVar.f152198b = new r45.xg();
        lVar.f152200d = 2763;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxasync/wxabatchsyncversion";
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
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0);
        r15 = new r45.kj6();
        r15.f460300d = r0;
        r9 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553.a(r1.getString(2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021c, code lost:
    
        if (r9 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021e, code lost:
    
        r9 = r9.f158977d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0222, code lost:
    
        r15.f460301e = r9;
        r8.put(r0, r15);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BatchSyncVersionUtils", "collectPreDownloadWhiteListReqList, matched username:" + r0 + ", appId:" + r10 + ", usedTime:" + r12);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.i.s():java.util.List");
    }

    public static void t() {
        long nanoTime = java.lang.System.nanoTime();
        android.util.LongSparseArray longSparseArray = f157383m;
        synchronized (longSparseArray) {
            longSparseArray.put(nanoTime, longSparseArray);
        }
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.h(nanoTime), "MicroMsg.AppBrand.CgiBatchSyncPkgVersion");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public synchronized pq5.g l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1422, 3);
        return super.l();
    }
}
