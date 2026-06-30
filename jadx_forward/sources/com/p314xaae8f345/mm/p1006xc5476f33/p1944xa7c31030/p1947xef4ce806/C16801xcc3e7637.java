package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog */
/* loaded from: classes12.dex */
public class C16801xcc3e7637 implements android.app.Application.ActivityLifecycleCallbacks, ob0.q3 {

    /* renamed from: COLD_THREAD */
    private static final int f37720x2b898fc5 = 101;
    private static final com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.C16801xcc3e7637 DOG = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.C16801xcc3e7637();

    /* renamed from: HOOK_ID_KEY */
    private static final int f37721x94fee7b7 = 1571;

    /* renamed from: HOOK_THRESHOLD */
    public static final int f37722x10dd0c2f = 20;

    /* renamed from: LIMIT_THREAD_COUNT_150 */
    private static final int f37723x5243076b = 150;

    /* renamed from: LIMIT_THREAD_COUNT_200 */
    private static final int f37724x52430a91 = 200;

    /* renamed from: LIMIT_THREAD_COUNT_300 */
    private static final int f37725x52430e52 = 300;

    /* renamed from: OVER_300 */
    private static final int f37726x4e429f88 = 2;

    /* renamed from: OVER_500 */
    private static final int f37727x4e42a70a = 1;

    /* renamed from: OVER_500_WHITE_THREAD */
    private static final int f37728x727a4215 = 3;

    /* renamed from: OVER_INC_50 */
    private static final int f37729x623e4087 = 4;

    /* renamed from: POLISHING_THREAD_NAME */
    public static final boolean f37730x869a8772 = false;

    /* renamed from: REPORT_ID */
    protected static final int f37731x91092806 = 960;

    /* renamed from: REPORT_KV_ID */
    private static final int f37732xf8ae5da4 = 16470;

    /* renamed from: SAMPLING_DAILY */
    private static final int f37733x67d43fa1 = 100;
    private static final java.lang.String TAG = "MicroMsg.ThreadWatchDog";

    /* renamed from: TOP_THREAD_COUNT */
    private static volatile int f37734x865b9144 = 500;

    /* renamed from: enableTriggerPthreadHook */
    private boolean f37735xb51f4cc8;

    /* renamed from: isSensitiveMode */
    private boolean f37736xca0c184f;

    /* renamed from: mContent */
    private volatile java.lang.StringBuilder f37737xd6cfe74c;

    /* renamed from: mExtraInfoFactory */
    private ob0.v2 f37738x697618d9;

    /* renamed from: mLastReportedThreadCount */
    private int f37742xbd0d58af;

    /* renamed from: mLastWangTime */
    private long f37743x4779b933;

    /* renamed from: mShouldPreventThrow */
    private volatile boolean f37746x5587988e;

    /* renamed from: mProcessThreadCount */
    private volatile int f37744x4006283 = 0;

    /* renamed from: mJavaThreadCount */
    private volatile int f37739x493c6d76 = 0;

    /* renamed from: mLastProcessThreadCount */
    private volatile int f37741xfe230939 = 0;

    /* renamed from: mLastJavaThreadCount */
    private volatile int f37740xda4c3280 = 0;

    /* renamed from: mScenes */
    private final java.util.Collection<java.lang.String> f37745x194c2034 = new java.util.concurrent.ConcurrentSkipListSet();

    private C16801xcc3e7637() {
        com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.c cVar = com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.c.f150239f;
        cVar.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.c1(this));
        cVar.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.d1(this));
    }

    /* renamed from: dumpThreadCountAndReportAsync */
    private void m67542x427dc042(java.lang.String str) {
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.e1(this));
    }

    /* renamed from: dumpThreadCountBg */
    public static void m67543x1da79eb6() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b1.b();
        java.util.Collection a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b1.a();
        java.util.Iterator it = a17.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.z0) it.next()).a();
        }
        m67544x523e1edf("bg", android.os.SystemClock.uptimeMillis() - uptimeMillis, i17, b17, a17.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dumpThreadCountInfo */
    public static void m67544x523e1edf(java.lang.String str, long j17, int i17, int i18, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "[dumpAsync][From:%s][Cost:%s][%s:%s]:%s", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
    }

    /* renamed from: enablePthreadHook */
    private void m67545x2bea993a(java.util.List<java.lang.String> list) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean z17 = o45.wf.f424566k || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c || z65.c.a() || this.f37735xb51f4cc8;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "enable auto trigger? %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (list.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "threadNames is empty, just return");
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                java.lang.String replace = it.next().replace("[", "\\[").replace("]", "\\]").replace("?", ".*");
                if (replace.length() > 1 && replace.endsWith("J")) {
                    replace = replace.substring(0, replace.length() - 1);
                }
                sb6.append(replace);
                sb6.append(";");
            }
            tp3.a.INSTANCE.d("<cmd><diagnostic><PthreadHook\n enable='1' process='" + m67553x1929a04b() + "' duration='1' hook='.*\\.so$' thread='" + sb6.toString() + "'/></diagnostic></cmd>");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(f37721x94fee7b7, 11, 1);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(f37721x94fee7b7, m67547xd1019c25(), 1);
            arrayList.add(c4582x424c344);
            arrayList.add(c4582x424c3442);
            jx3.f.INSTANCE.b(arrayList, false);
        }
    }

    /* renamed from: getDog */
    public static synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.C16801xcc3e7637 m67546xb5883606() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.C16801xcc3e7637 c16801xcc3e7637;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.C16801xcc3e7637.class) {
            c16801xcc3e7637 = DOG;
        }
        return c16801xcc3e7637;
    }

    /* renamed from: getWatchDogTriggerProcessKey */
    private int m67547xd1019c25() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return 60;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j()) {
            return 61;
        }
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.r()) ? 62 : -1;
    }

    /* renamed from: isCheck */
    private boolean m67548x7a8c91fe() {
        if (android.os.SystemClock.uptimeMillis() - this.f37743x4779b933 < com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            return false;
        }
        this.f37743x4779b933 = android.os.SystemClock.uptimeMillis();
        return true;
    }

    /* renamed from: lambda$samplingColdThreads$0 */
    private static /* synthetic */ boolean m67549x4d5b85ad(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.a1 a1Var) {
        return !list.contains(java.lang.Integer.valueOf((int) a1Var.f234538b));
    }

    /* renamed from: map2Json */
    private java.lang.String m67550x81f4c5e(java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            return new org.json.JSONObject(map).toString().replace(",", ";");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "", new java.lang.Object[0]);
            return "";
        }
    }

    /* renamed from: onOverInc */
    private void m67551xe99c38b() {
        if (this.f37737xd6cfe74c == null) {
            this.f37737xd6cfe74c = new java.lang.StringBuilder(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b1.c().toString());
        }
        java.lang.String format = java.lang.String.format("ThreadInc[%s:%s->%s:%s]: %s", java.lang.Integer.valueOf(this.f37740xda4c3280), java.lang.Integer.valueOf(this.f37741xfe230939), java.lang.Integer.valueOf(this.f37739x493c6d76), java.lang.Integer.valueOf(this.f37744x4006283), this.f37737xd6cfe74c.toString());
        java.lang.String a17 = sp3.d.a(this.f37745x194c2034.toArray());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "ThreadInc[%s:%s->%s:%s] passedScenes:%s", java.lang.Integer.valueOf(this.f37740xda4c3280), java.lang.Integer.valueOf(this.f37741xfe230939), java.lang.Integer.valueOf(this.f37739x493c6d76), java.lang.Integer.valueOf(this.f37744x4006283), a17);
        jx3.f.INSTANCE.d(f37732xf8ae5da4, format, 4, java.lang.Integer.valueOf(this.f37739x493c6d76), java.lang.Integer.valueOf(this.f37744x4006283), "", "", "", "", "", "", "", "", "", bm5.f1.a(), a17, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ca, code lost:
    
        if (r19.f37736xca0c184f == false) goto L88;
     */
    /* renamed from: onOverThread */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m67552x2a23a73d(int r20, int r21, int r22, java.lang.StringBuilder r23) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.C16801xcc3e7637.m67552x2a23a73d(int, int, int, java.lang.StringBuilder):boolean");
    }

    /* renamed from: processCmd */
    private final java.lang.String m67553x1929a04b() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? "mm" : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j() ? "appbrand" : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s() ? "tools" : com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: report */
    public java.lang.String m67554xc84c5534() {
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? 100 : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s() ? 120 : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j() ? 140 : -1;
        if (i17 == -1) {
            return null;
        }
        this.f37737xd6cfe74c = null;
        try {
            if (this.f37744x4006283 > f37734x865b9144) {
                this.f37737xd6cfe74c = new java.lang.StringBuilder();
                this.f37746x5587988e = m67552x2a23a73d(1, this.f37739x493c6d76, this.f37744x4006283, this.f37737xd6cfe74c);
                jx3.f.INSTANCE.mo68477x336bdfd8(960L, i17 + 1, 1L, true);
            } else if (this.f37744x4006283 > 300) {
                jx3.f.INSTANCE.mo68477x336bdfd8(960L, i17, 1L, true);
                if (this.f37744x4006283 - this.f37742xbd0d58af >= 50) {
                    this.f37742xbd0d58af = this.f37744x4006283;
                    m67552x2a23a73d(2, this.f37739x493c6d76, this.f37744x4006283, this.f37737xd6cfe74c);
                }
            } else if (this.f37744x4006283 > 200) {
                jx3.f.INSTANCE.mo68477x336bdfd8(960L, i17 + 2, 1L, true);
            } else if (this.f37744x4006283 > 150) {
                jx3.f.INSTANCE.mo68477x336bdfd8(960L, i17 + 3, 1L, true);
            } else {
                jx3.f.INSTANCE.mo68477x336bdfd8(960L, i17 + 8, 1L, true);
            }
            if (this.f37739x493c6d76 > f37734x865b9144) {
                jx3.f.INSTANCE.mo68477x336bdfd8(960L, i17 + 4, 1L, true);
            } else if (this.f37739x493c6d76 > 300) {
                jx3.f.INSTANCE.mo68477x336bdfd8(960L, i17 + 5, 1L, true);
            } else if (this.f37739x493c6d76 > 200) {
                jx3.f.INSTANCE.mo68477x336bdfd8(960L, i17 + 6, 1L, true);
            } else if (this.f37739x493c6d76 > 150) {
                jx3.f.INSTANCE.mo68477x336bdfd8(960L, i17 + 7, 1L, true);
            } else {
                jx3.f.INSTANCE.mo68477x336bdfd8(960L, i17 + 9, 1L, true);
            }
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            e42.d0 d0Var = e42.d0.clicfg_thread_watchdog_enable_inc_report_threshold;
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            int Ni = ((h62.d) e0Var).Ni(d0Var, z65.c.a() ? 30 : Integer.MAX_VALUE);
            if (this.f37741xfe230939 >= 200 && this.f37744x4006283 - this.f37741xfe230939 >= Ni) {
                m67551xe99c38b();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "", new java.lang.Object[0]);
        }
        if (this.f37737xd6cfe74c == null) {
            return null;
        }
        return this.f37737xd6cfe74c.toString();
    }

    /* renamed from: samplingThread */
    private static boolean m67555xa0af00d1(int i17, long j17, int i18, int i19, java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.z0> list, java.util.Collection<java.lang.String> collection) {
        if (i19 <= 0) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.z0[] z0VarArr = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.z0[3];
        int i27 = 0;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.z0 z0Var : list) {
            z0VarArr[i27] = z0Var;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.h1.a(z0Var.f234701a)) {
                return false;
            }
            i27++;
            if (i27 >= 3) {
                break;
            }
        }
        long j18 = j17 / 60000;
        list.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "trigger Over DailySampling: duration=" + j18 + ", javaThreadCount=" + i18 + ", processThreadCount=" + i19 + ", passed scenes: " + sp3.d.a(collection.toArray()));
        org.json.JSONObject m67556xcc31ba03 = m67556xcc31ba03(list, null);
        if (m67556xcc31ba03 != null) {
            m67556xcc31ba03.toString().replace(",", ";");
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("durationMin", java.lang.Long.valueOf(j18));
        linkedHashMap.put("appPrcFg", java.lang.Integer.valueOf(!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40965x320351f8() ? 1 : 0));
        linkedHashMap.put("appExpFg", java.lang.Integer.valueOf(!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8() ? 1 : 0));
        int i28 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.a.f149056m0;
        pj.e.a(linkedHashMap);
        int i29 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.a.f149056m0;
        return false;
    }

    /* renamed from: toJson */
    private static org.json.JSONObject m67556xcc31ba03(java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.z0> list, java.util.Map<java.lang.String, java.lang.Object> map) {
        try {
            org.json.JSONObject jSONObject = map == null ? new org.json.JSONObject() : new org.json.JSONObject(map);
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.z0 z0Var : list) {
                jSONObject.put(z0Var.f234701a, z0Var.a());
            }
            return jSONObject;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        java.lang.String simpleName = activity.getClass().getSimpleName();
        this.f37745x194c2034.add(simpleName);
        if (m67548x7a8c91fe()) {
            m67560x379203();
            m67542x427dc042(simpleName);
        }
    }

    /* renamed from: sampling */
    public boolean m67557x75c0cfe7(long j17) {
        int i17 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.a.f149056m0;
        return false;
    }

    /* renamed from: samplingColdThreads */
    public boolean m67558x204485be(long j17, java.util.List<java.lang.Integer> list) {
        int i17 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.a.f149056m0;
        return false;
    }

    @Override // ob0.q3
    /* renamed from: setExtraInfoFactory */
    public void mo67559x8f334ace(ob0.v2 v2Var) {
        this.f37738x697618d9 = v2Var;
    }

    /* renamed from: wang */
    public void m67560x379203() {
        if (this.f37744x4006283 > f37734x865b9144) {
            if (this.f37746x5587988e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "prevent throw Exception");
                f37734x865b9144 += 1024;
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(TAG);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(this.f37739x493c6d76);
            objArr[1] = java.lang.Integer.valueOf(this.f37744x4006283);
            objArr[2] = this.f37737xd6cfe74c == null ? "null" : this.f37737xd6cfe74c.toString();
            sb6.append(java.lang.String.format("\nThreadOver[%s:%s]: %s", objArr));
            throw new java.lang.RuntimeException(sb6.toString());
        }
    }
}
