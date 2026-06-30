package k82;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final k82.c f386420a = new k82.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f386421b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static k82.a f386422c;

    public final void a(long j17, long j18, java.lang.String snsLocalId, java.lang.String snsServerId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsLocalId, "snsLocalId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsServerId, "snsServerId");
        k82.b bVar = (k82.b) f386421b.get(java.lang.Long.valueOf(j17));
        if (bVar != null) {
            bVar.f386412i = z17;
            if (j18 >= 0) {
                bVar.f386417n = j18;
            }
            bVar.f386418o = snsLocalId;
            bVar.f386419p = snsServerId;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FavEnterReporter", "appendNoteInfo: localId not found, localId=" + j17 + ", msgId=" + j18 + ", snsLocalId=" + snsLocalId + ", snsServerId=" + snsServerId);
    }

    public final void b(long j17) {
        k82.b bVar = (k82.b) f386421b.get(java.lang.Long.valueOf(j17));
        if (bVar != null) {
            bVar.f386411h = true;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FavEnterReporter", "enterFlutterNote: localId not found, localId=" + j17);
    }

    public final void c(long j17, long j18, int i17, int i18, int i19) {
        java.util.HashMap hashMap = f386421b;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        k82.b bVar = new k82.b(j17, j18, i17, i18);
        bVar.f386408e = i19;
        hashMap.put(valueOf, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        if ((r15.f386419p.length() > 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0150, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r15, ".md") != false) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(k82.b r15) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k82.c.d(k82.b):void");
    }

    public final void e(long j17, int i17) {
        k82.b bVar = (k82.b) f386421b.get(java.lang.Long.valueOf(j17));
        if (bVar != null) {
            bVar.f386415l = i17;
            bVar.f386416m = false;
            bVar.f386410g = java.lang.System.currentTimeMillis();
            d(bVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FavEnterReporter", "reportEnterFail: localId not found, localId=" + j17 + ", failReason=" + i17);
    }

    public final void f(long j17) {
        k82.b bVar = (k82.b) f386421b.get(java.lang.Long.valueOf(j17));
        if (bVar != null) {
            bVar.f386416m = true;
            bVar.f386410g = java.lang.System.currentTimeMillis();
            d(bVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FavEnterReporter", "reportEnterSuccess: localId not found, localId=" + j17);
        }
    }
}
