package e53;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final e53.b f331145a = new e53.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f331146b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.s2 f331147c = new e53.a();

    public static final void a(int i17) {
        java.lang.String v17;
        long elapsedRealtime;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f331146b;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
        if (concurrentHashMap2 != null) {
            java.util.Iterator it = concurrentHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                e53.c cVar = (e53.c) ((java.util.Map.Entry) it.next()).getValue();
                java.lang.String str = cVar.f331152e;
                if (str == null || str.length() == 0) {
                    v17 = cVar.f331151d;
                } else if (cVar.f331157j != 0) {
                    if (cVar.f331156i) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        elapsedRealtime = android.os.SystemClock.elapsedRealtime() - cVar.f331157j;
                    } else {
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        elapsedRealtime = (android.os.SystemClock.elapsedRealtime() - cVar.f331157j) / 1000;
                    }
                    v17 = r26.i0.v(cVar.f331151d, cVar.f331152e, java.lang.String.valueOf(cVar.f331155h + elapsedRealtime), false, 4, null);
                } else {
                    v17 = r26.i0.v(cVar.f331151d, cVar.f331152e, java.lang.String.valueOf(cVar.f331155h), false, 4, null);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gamelog.report, logId = ");
                int i18 = cVar.f331149b;
                sb6.append(i18);
                sb6.append(", reportOnDestroy, reportDuration:");
                sb6.append(cVar.f331155h);
                sb6.append(", reportContent = ");
                sb6.append(v17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePageTimeReport", sb6.toString());
                jx3.f.INSTANCE.f(i18, v17, cVar.f331154g, false);
            }
        }
        f331147c.m43072x2efc64();
    }

    public static final void b(int i17) {
        long elapsedRealtime;
        java.lang.String v17;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f331146b;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        java.util.Iterator it = concurrentHashMap2 != null ? concurrentHashMap2.entrySet().iterator() : null;
        if (it != null) {
            while (it.hasNext()) {
                e53.c cVar = (e53.c) ((java.util.Map.Entry) it.next()).getValue();
                if (cVar.f331158k) {
                    java.lang.String str = cVar.f331152e;
                    if (str == null || str.length() == 0) {
                        v17 = cVar.f331151d;
                    } else {
                        if (cVar.f331156i) {
                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            elapsedRealtime = android.os.SystemClock.elapsedRealtime() - cVar.f331157j;
                        } else {
                            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            elapsedRealtime = (android.os.SystemClock.elapsedRealtime() - cVar.f331157j) / 1000;
                        }
                        v17 = r26.i0.v(cVar.f331151d, cVar.f331152e, java.lang.String.valueOf(cVar.f331155h + elapsedRealtime), false, 4, null);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePageTimeReport", "gamelog.report, logId = " + cVar.f331149b + ", reportContent = " + v17);
                    jx3.f.INSTANCE.f(cVar.f331149b, v17, cVar.f331154g, false);
                    synchronized (f331145a) {
                        it.remove();
                    }
                }
            }
        }
    }

    public static final void c(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = f331146b;
        if ((concurrentHashMap2 == null || concurrentHashMap2.isEmpty()) || (concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap2.get(java.lang.Integer.valueOf(i17))) == null) {
            return;
        }
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            e53.c cVar = (e53.c) ((java.util.Map.Entry) it.next()).getValue();
            if (cVar.f331158k) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                cVar.f331157j = android.os.SystemClock.elapsedRealtime();
            }
        }
    }
}
