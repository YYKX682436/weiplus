package com.p314xaae8f345.p542x3306d5.p550x382fcc;

/* renamed from: com.tencent.mars.xlog.LogMonitor */
/* loaded from: classes12.dex */
public class C4607x47fc1996 {
    private static final int KV = 24354;

    /* renamed from: LONG_LONG_TIME_TRIGGER */
    public static final int f19744x5d414c06 = 18;

    /* renamed from: LONG_TIME_TRIGGER */
    public static final int f19745xfaa6cb09 = 16;

    /* renamed from: SHORT_TIME_TRIGGER */
    public static final int f19746x52fc8929 = 17;
    private static final java.lang.String TAG = "LogMonitor";

    /* renamed from: random */
    private static final java.util.Random f19747xc812e4c3 = new java.security.SecureRandom();

    /* renamed from: entered */
    java.lang.ThreadLocal<java.lang.Boolean> f19748xa11cbd77 = new java.lang.ThreadLocal<>();

    /* renamed from: longLongTimeCounter */
    private com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc f19749x61583037;

    /* renamed from: longTimeCounter */
    private com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc f19750x32f58653;

    /* renamed from: shortTimeCounter */
    private com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc f19751x3e200853;

    public C4607x47fc1996() {
        boolean m40597x30176967 = m40597x30176967("mmkv_log_monitor_short_time_count");
        boolean m40597x301769672 = m40597x30176967("mmkv_log_monitor_long_time_count");
        boolean m40597x301769673 = m40597x30176967("mmkv_log_monitor_long_long_time_count");
        if (m40597x30176967) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc runnableC4612xcd00f3cc = new com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc(250L, 20, 20000000L, true, u04.d.f505010c);
            this.f19751x3e200853 = runnableC4612xcd00f3cc;
            runnableC4612xcd00f3cc.m40609x1bdefc5d();
            this.f19751x3e200853.m40610x1857a6b3(new com.p314xaae8f345.p542x3306d5.p550x382fcc.C4608xf226028b());
        }
        if (m40597x301769672) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc runnableC4612xcd00f3cc2 = new com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc(15000L, 20, 160000000L, false, u04.d.f505010c);
            this.f19750x32f58653 = runnableC4612xcd00f3cc2;
            runnableC4612xcd00f3cc2.m40610x1857a6b3(new com.p314xaae8f345.p542x3306d5.p550x382fcc.C4609xf226028c());
        }
        if (m40597x301769673) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc runnableC4612xcd00f3cc3 = new com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc(60000L, 120, 120000000L, true, 300000L);
            this.f19749x61583037 = runnableC4612xcd00f3cc3;
            runnableC4612xcd00f3cc3.m40610x1857a6b3(new com.p314xaae8f345.p542x3306d5.p550x382fcc.C4610xf226028d());
        }
    }

    /* renamed from: getLimitedJavaStackTrace */
    private static java.lang.String m40596xc41475e3(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = true;
        for (java.lang.StackTraceElement stackTraceElement : java.lang.Thread.currentThread().getStackTrace()) {
            if (!z17) {
                sb6.append(stackTraceElement.toString());
                sb6.append("\n");
                if (sb6.length() > i17) {
                    return sb6.toString();
                }
            } else if ("monitor".equals(stackTraceElement.getMethodName()) && com.p314xaae8f345.p542x3306d5.p550x382fcc.C4607x47fc1996.class.getCanonicalName().equals(stackTraceElement.getClassName())) {
                z17 = false;
            }
        }
        return sb6.toString();
    }

    /* renamed from: getSwtVal */
    private boolean m40597x30176967(java.lang.String str) {
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().o(str, 0);
        if (o17 <= 0) {
            return false;
        }
        return o17 >= 100 || java.lang.Math.abs(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h ^ f19747xc812e4c3.nextInt()) % 100 < o17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public static void m40598x51ef5f0f(java.lang.String str, java.lang.String str2, long j17) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = str;
        objArr[1] = str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.StackTraceElement stackTraceElement : java.lang.Thread.currentThread().getStackTrace()) {
            sb6.append(stackTraceElement.toString());
            sb6.append("\n");
        }
        objArr[2] = sb6.toString();
        objArr[3] = bm5.f1.a();
        objArr[4] = java.lang.Long.valueOf(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "log print frequently. tag=%s, log=%s, stack=%s, process=%s, logCount=%d", objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$1 */
    public static /* synthetic */ void m40599x51ef5f10(java.lang.String str, java.lang.String str2, long j17) {
        m40601xc84c5534(str, str2, j17, j17 > 600000000 ? 213 : 215, 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$2 */
    public static /* synthetic */ void m40600x51ef5f11(java.lang.String str, java.lang.String str2, long j17) {
        if (j17 > 600000000) {
            return;
        }
        m40601xc84c5534(str, str2, j17, 214, 18);
    }

    /* renamed from: report */
    public static void m40601xc84c5534(java.lang.String str, java.lang.String str2, long j17, int i17, int i18) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.g gVar;
        java.lang.String str3 = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "report frequently log print, tag=%s, log=%s, type=%d, count=%d", str, str2, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17));
        java.lang.String a17 = bm5.f1.a();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j()) {
            try {
                gVar = (com.p314xaae8f345.mm.sdk.p2603x2137b148.g) com.p314xaae8f345.mm.sdk.p2603x2137b148.h.f274254a.call();
            } catch (java.lang.Exception unused) {
                gVar = null;
            }
            if (gVar != null) {
                a17 = (a17 + " [" + gVar.f274244a) + "@" + gVar.f274245b + "]";
            }
        }
        java.lang.String str4 = a17;
        java.lang.String h17 = com.p314xaae8f345.mm.app.w.INSTANCE.h();
        if (h17 == null) {
            h17 = "null";
        }
        int lastIndexOf = h17.lastIndexOf(64);
        if (lastIndexOf > 0) {
            h17 = h17.substring(0, lastIndexOf);
        }
        if (str2.length() > 256) {
            str3 = str2.substring(0, 256);
        }
        jx3.f.INSTANCE.d(KV, h17, m40596xc41475e3(1024), java.lang.Integer.valueOf(i17), str4, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(j17), str, java.lang.Integer.valueOf(i18), str3);
    }

    /* renamed from: monitor */
    public boolean m40602x49b0bd5a(java.lang.String str, java.lang.String str2) {
        if (this.f19751x3e200853 == null && this.f19750x32f58653 == null && this.f19749x61583037 == null) {
            return true;
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (bool.equals(this.f19748xa11cbd77.get())) {
            return true;
        }
        this.f19748xa11cbd77.set(bool);
        if (str == null) {
            str = "null";
        }
        if (str2 == null) {
            str2 = "null";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc runnableC4612xcd00f3cc = this.f19751x3e200853;
        boolean z17 = runnableC4612xcd00f3cc == null || runnableC4612xcd00f3cc.m40608x7fc668ab(str, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc runnableC4612xcd00f3cc2 = this.f19750x32f58653;
        boolean z18 = runnableC4612xcd00f3cc2 == null || runnableC4612xcd00f3cc2.m40608x7fc668ab(str, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc runnableC4612xcd00f3cc3 = this.f19749x61583037;
        boolean z19 = runnableC4612xcd00f3cc3 == null || runnableC4612xcd00f3cc3.m40608x7fc668ab(str, str2);
        this.f19748xa11cbd77.set(java.lang.Boolean.FALSE);
        return z17 && z18 && z19;
    }
}
