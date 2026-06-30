package yv1;

@j95.b
/* loaded from: classes15.dex */
public final class h extends i95.w implements zv1.f1 {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f547593d = jz5.h.b(yv1.g.f547568d);

    public void Ai(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 cacheType, zv1.d cleaner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheType, "cacheType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cleaner, "cleaner");
        zv1.k kVar = zv1.k.f557845a;
        synchronized (kVar.b()) {
            kVar.b().put(cacheType, cleaner);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(6:46|47|48|49|50|51)|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04aa, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x04ab, code lost:
    
        r2 = "MicroMsg.CleanCache.Mgr";
        r4 = r14;
        r1 = r15;
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04a5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04a6, code lost:
    
        r2 = "MicroMsg.CleanCache.Mgr";
        r4 = r14;
        r1 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04de A[Catch: all -> 0x051e, TryCatch #27 {all -> 0x051e, blocks: (B:56:0x04d0, B:58:0x04de, B:59:0x04e3, B:61:0x04e1, B:242:0x04b9, B:243:0x04c0), top: B:38:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04e1 A[Catch: all -> 0x051e, TryCatch #27 {all -> 0x051e, blocks: (B:56:0x04d0, B:58:0x04de, B:59:0x04e3, B:61:0x04e1, B:242:0x04b9, B:243:0x04c0), top: B:38:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Bi(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab r36) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yv1.h.Bi(com.tencent.wcdb.support.CancellationSignal):void");
    }

    public long wi(zv1.r continuation, java.util.List paths, long j17) {
        jz5.l c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(continuation, "continuation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paths, "paths");
        zv1.g0 g0Var = zv1.g0.f557833a;
        zv1.d dVar = continuation.f557892a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 a17 = dVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", "deleteAllForPaths: " + a17 + ", pathSize=" + paths.size() + ", beforeTime=" + zv1.i0.a().format(java.lang.Long.valueOf(j17)));
        boolean z17 = continuation.f557898g;
        java.util.ArrayList arrayList = z17 ? new java.util.ArrayList() : null;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", "=== Bgn Deleted_Files_Analysis (" + a17 + ") ===");
        }
        java.util.Iterator it = paths.iterator();
        long j18 = 0;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = continuation.f557897f;
            if (c26987xeef691ab != null) {
                c26987xeef691ab.m108011xf4ed245c();
            }
            j18 += g0Var.b(continuation, str, j17, continuation.f557894c, continuation.f557897f, arrayList);
            dVar = dVar;
            a17 = a17;
        }
        zv1.d dVar2 = dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 enumC13101x40600c60 = a17;
        long j19 = j18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Expect deleted size: ");
        long j27 = continuation.f557893b;
        sb6.append(j27 > 0 ? java.lang.Long.valueOf(j27 / 1000000) : "_");
        sb6.append("MB");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", "Actual deleted size: " + (j19 / 1000000) + "MB, rateToExpect=" + g0Var.c(j19, j27) + '%');
        if (arrayList != null) {
            zv1.a1.f557792f.b(continuation, arrayList, j17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (((zv1.a1) next).f557795c <= j17) {
                    arrayList2.add(next);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (((zv1.a1) obj).f557795c > j17) {
                    arrayList3.add(obj);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                zv1.a1 a1Var = (zv1.a1) obj2;
                zv1.w0 d17 = dVar2.d();
                if ((d17 == null || (c17 = d17.c(a1Var.f557793a)) == null || !((java.lang.Boolean) c17.f384366d).booleanValue()) ? false : true) {
                    arrayList4.add(obj2);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", "Actual deleted file: olderCount=" + arrayList2.size() + ", newerCount=" + arrayList3.size() + ", exemptedCount=" + arrayList4.size());
            if (!arrayList3.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CleanCache.Utils", arrayList3.size() + " files after timeThreshold being deleted!");
            }
            if (!arrayList4.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CleanCache.Utils", arrayList4.size() + " files exempted being deleted!");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", "=== End Deleted_Files_Analysis (" + enumC13101x40600c60 + ") ===\n");
        }
        return j19;
    }
}
