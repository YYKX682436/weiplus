package q01;

/* loaded from: classes12.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final q01.v0 f440873d = new q01.v0();

    public static final void a(java.lang.String str, java.util.Map map) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        synchronized (q01.a1.f440794c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTracker", "clearExpired " + str + ": " + map.size());
            kz5.h0.A(map.entrySet(), new q01.t0(uptimeMillis, linkedList));
        }
        if (!linkedList.isEmpty()) {
            java.util.List<q01.s0> F0 = kz5.n0.F0(linkedList, new q01.u0());
            for (q01.s0 s0Var : F0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneTracker", "NetSceneInspect " + str + " expired: " + s0Var + '@' + s0Var.f440862a.hashCode() + ", bgnAgo=" + ((uptimeMillis - s0Var.f440864c) / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8) + "min");
            }
            hr0.k0 k0Var = (hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class));
            k0Var.getClass();
            ((ku5.t0) ku5.t0.f394148d).h(new hr0.g0(k0Var, F0, android.os.SystemClock.uptimeMillis()), "MicroMsg.NetSceneTrackFeatureService");
            int i17 = 0;
            for (java.lang.Object obj : F0) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                q01.s0 s0Var2 = (q01.s0) obj;
                long j17 = uptimeMillis - s0Var2.f440864c;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.put("durationMs", java.lang.Long.valueOf(j17));
                linkedHashMap.put(ya.b.f77479x42930b2, java.lang.Integer.valueOf(i17));
                ((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).wi(linkedHashMap);
                ap.a.a(10001, "longNetScene", null, linkedHashMap, str, q01.a1.f440792a.a(s0Var2.f440862a), java.lang.String.valueOf(linkedList.size()), java.lang.String.valueOf(j17 / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8));
                i17 = i18;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        q01.a1 a1Var = q01.a1.f440792a;
        a("Enqueue", (java.util.Map) q01.a1.f440795d.mo141623x754a37bb());
        a("Dispatch", (java.util.Map) q01.a1.f440796e.mo141623x754a37bb());
    }
}
