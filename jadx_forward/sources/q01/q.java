package q01;

/* loaded from: classes12.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q01.q f440855a = new q01.q();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f440856b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f440857c = new java.util.concurrent.ConcurrentHashMap();

    static {
        ((ku5.t0) ku5.t0.f394148d).l(q01.k.f440829d, java.util.concurrent.TimeUnit.MINUTES.toMillis(5L), "MicroMsg.cgi.NetScenePerformanceMonitor.cleanup");
    }

    public static final void a(q01.q qVar) {
        ku5.u0 u0Var;
        long millis;
        qVar.getClass();
        q01.m mVar = q01.m.f440844d;
        try {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
            long millis2 = elapsedRealtime - timeUnit.toMillis(5L);
            java.util.Set entrySet = f440856b.entrySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
            kz5.h0.A(entrySet, new q01.n(millis2));
            java.util.Set entrySet2 = f440857c.entrySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet2, "<get-entries>(...)");
            kz5.h0.A(entrySet2, new q01.o(millis2));
            u0Var = ku5.t0.f394148d;
            millis = timeUnit.toMillis(5L);
        } catch (java.lang.Throwable th6) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.cgi.NetScenePerformanceMonitor", th6, "cleanup error", new java.lang.Object[0]);
                u0Var = ku5.t0.f394148d;
                millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(5L);
            } catch (java.lang.Throwable th7) {
                ((ku5.t0) ku5.t0.f394148d).l(mVar, java.util.concurrent.TimeUnit.MINUTES.toMillis(5L), "MicroMsg.cgi.NetScenePerformanceMonitor.cleanup");
                throw th7;
            }
        }
        ((ku5.t0) u0Var).l(mVar, millis, "MicroMsg.cgi.NetScenePerformanceMonitor.cleanup");
    }

    public final java.lang.String b(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() != 0) {
            return "type: " + m1Var.mo808xfb85f7b0();
        }
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = m1Var.mo47948x7f0c4558();
        return "common: " + (mo47948x7f0c4558 != null ? java.lang.Integer.valueOf(mo47948x7f0c4558.mo13822xfb85f7b0()) : "unk");
    }

    public final void c(com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        q01.l lVar = (q01.l) f440856b.get(java.lang.Integer.valueOf(scene.hashCode()));
        if (lVar == null) {
            return;
        }
        lVar.f440835e = android.os.SystemClock.elapsedRealtime();
        long j17 = 0;
        if (lVar.f440835e > 0 && lVar.f440834d > 0) {
            j17 = lVar.f440835e - lVar.f440834d;
        }
        b(scene);
        if (j17 > 500) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("costMs", java.lang.Long.valueOf(j17));
            linkedHashMap.put("sceneType", lVar.f440832b);
            linkedHashMap.put("sceneDesc", lVar.f440833c);
            linkedHashMap.put("isCoreCgi", java.lang.Boolean.valueOf(lVar.f440840j));
            linkedHashMap.put("experimentGroup", lVar.f440839i);
            ((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).wi(linkedHashMap);
            java.lang.String[] strArr = new java.lang.String[4];
            strArr[0] = lVar.f440832b.toString();
            strArr[1] = java.lang.String.valueOf(j17);
            strArr[2] = lVar.f440840j ? "1" : "0";
            strArr[3] = lVar.f440839i;
            ap.a.a(10001, "cgiEnterRunningQueueDelay", null, linkedHashMap, strArr);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.cgi.NetScenePerformanceMonitor", "Report enter running queue delay: type=" + lVar.f440832b + ", cost=" + j17 + "ms");
        }
    }

    public final void d(com.p314xaae8f345.mm.p944x882e457a.m1 scene, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        q01.l lVar = (q01.l) f440856b.get(java.lang.Integer.valueOf(scene.hashCode()));
        if (lVar == null) {
            return;
        }
        lVar.f440836f = i17;
        b(scene);
        if (i17 > 20) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("waitingQueueLength", java.lang.Integer.valueOf(i17));
            linkedHashMap.put("sceneType", b(scene));
            linkedHashMap.put("sceneDesc", q01.a1.f440792a.a(scene));
            ((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).wi(linkedHashMap);
            ap.a.a(10001, "cgiWaitingQueueOverflow", null, linkedHashMap, b(scene), java.lang.String.valueOf(i17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.cgi.NetScenePerformanceMonitor", "Report waiting queue overflow: type=" + b(scene) + ", length=" + i17);
        }
    }

    public final void e(q01.l lVar, long j17, boolean z17) {
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stackTrace);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            java.lang.String className = stackTraceElement.getClassName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "getClassName(...)");
            if (r26.n0.B(className, "com.tencent.mm", false)) {
                arrayList.add(stackTraceElement);
            }
        }
        java.lang.String g07 = kz5.n0.g0(kz5.n0.K0(arrayList, 20), ";", null, null, 0, null, q01.p.f440854d, 30, null);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("costMs", java.lang.Long.valueOf(j17));
        linkedHashMap.put("sceneType", lVar.f440832b);
        linkedHashMap.put("sceneDesc", lVar.f440833c);
        linkedHashMap.put("isCoreCgi", java.lang.Boolean.valueOf(lVar.f440840j));
        linkedHashMap.put("experimentGroup", lVar.f440839i);
        linkedHashMap.put("isExecutionBlocked", java.lang.Boolean.valueOf(z17));
        linkedHashMap.put("stackTrace", g07);
        ((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).wi(linkedHashMap);
        java.lang.Throwable th6 = new java.lang.Throwable("Thread blocked detected, cost=" + j17 + "ms");
        java.lang.String[] strArr = new java.lang.String[6];
        strArr[0] = lVar.f440832b.toString();
        strArr[1] = java.lang.String.valueOf(j17);
        strArr[2] = lVar.f440840j ? "1" : "0";
        strArr[3] = lVar.f440839i;
        strArr[4] = z17 ? "execution" : "startup";
        strArr[5] = r26.p0.E0(g07, 500);
        ap.a.a(10001, "cgiThreadBlocked", th6, linkedHashMap, strArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.cgi.NetScenePerformanceMonitor", "Report thread blocked: type=" + lVar.f440832b + ", cost=" + j17 + "ms, isExecution=" + z17);
    }
}
