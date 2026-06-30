package com.tencent.mars.xlog;

/* loaded from: classes12.dex */
public class LogMonitor {
    private static final int KV = 24354;
    public static final int LONG_LONG_TIME_TRIGGER = 18;
    public static final int LONG_TIME_TRIGGER = 16;
    public static final int SHORT_TIME_TRIGGER = 17;
    private static final java.lang.String TAG = "LogMonitor";
    private static final java.util.Random random = new java.security.SecureRandom();
    java.lang.ThreadLocal<java.lang.Boolean> entered = new java.lang.ThreadLocal<>();
    private com.tencent.mars.xlog.WindowCounter longLongTimeCounter;
    private com.tencent.mars.xlog.WindowCounter longTimeCounter;
    private com.tencent.mars.xlog.WindowCounter shortTimeCounter;

    public LogMonitor() {
        boolean swtVal = getSwtVal("mmkv_log_monitor_short_time_count");
        boolean swtVal2 = getSwtVal("mmkv_log_monitor_long_time_count");
        boolean swtVal3 = getSwtVal("mmkv_log_monitor_long_long_time_count");
        if (swtVal) {
            com.tencent.mars.xlog.WindowCounter windowCounter = new com.tencent.mars.xlog.WindowCounter(250L, 20, 20000000L, true, u04.d.f423477c);
            this.shortTimeCounter = windowCounter;
            windowCounter.setEnableFilter();
            this.shortTimeCounter.setThresholdTriggeredCallBack(new com.tencent.mars.xlog.LogMonitor$$a());
        }
        if (swtVal2) {
            com.tencent.mars.xlog.WindowCounter windowCounter2 = new com.tencent.mars.xlog.WindowCounter(15000L, 20, 160000000L, false, u04.d.f423477c);
            this.longTimeCounter = windowCounter2;
            windowCounter2.setThresholdTriggeredCallBack(new com.tencent.mars.xlog.LogMonitor$$b());
        }
        if (swtVal3) {
            com.tencent.mars.xlog.WindowCounter windowCounter3 = new com.tencent.mars.xlog.WindowCounter(60000L, 120, 120000000L, true, 300000L);
            this.longLongTimeCounter = windowCounter3;
            windowCounter3.setThresholdTriggeredCallBack(new com.tencent.mars.xlog.LogMonitor$$c());
        }
    }

    private static java.lang.String getLimitedJavaStackTrace(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = true;
        for (java.lang.StackTraceElement stackTraceElement : java.lang.Thread.currentThread().getStackTrace()) {
            if (!z17) {
                sb6.append(stackTraceElement.toString());
                sb6.append("\n");
                if (sb6.length() > i17) {
                    return sb6.toString();
                }
            } else if ("monitor".equals(stackTraceElement.getMethodName()) && com.tencent.mars.xlog.LogMonitor.class.getCanonicalName().equals(stackTraceElement.getClassName())) {
                z17 = false;
            }
        }
        return sb6.toString();
    }

    private boolean getSwtVal(java.lang.String str) {
        int o17 = com.tencent.mm.sdk.platformtools.o4.L().o(str, 0);
        if (o17 <= 0) {
            return false;
        }
        return o17 >= 100 || java.lang.Math.abs(com.tencent.mm.sdk.platformtools.z.f193112h ^ random.nextInt()) % 100 < o17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$new$0(java.lang.String str, java.lang.String str2, long j17) {
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
        com.tencent.mars.xlog.Log.w(TAG, "log print frequently. tag=%s, log=%s, stack=%s, process=%s, logCount=%d", objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1(java.lang.String str, java.lang.String str2, long j17) {
        report(str, str2, j17, j17 > 600000000 ? 213 : 215, 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$2(java.lang.String str, java.lang.String str2, long j17) {
        if (j17 > 600000000) {
            return;
        }
        report(str, str2, j17, 214, 18);
    }

    public static void report(java.lang.String str, java.lang.String str2, long j17, int i17, int i18) {
        com.tencent.mm.sdk.platformtools.g gVar;
        java.lang.String str3 = str2;
        com.tencent.mars.xlog.Log.i(TAG, "report frequently log print, tag=%s, log=%s, type=%d, count=%d", str, str2, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17));
        java.lang.String a17 = bm5.f1.a();
        if (com.tencent.mm.sdk.platformtools.x2.j()) {
            try {
                gVar = (com.tencent.mm.sdk.platformtools.g) com.tencent.mm.sdk.platformtools.h.f192721a.call();
            } catch (java.lang.Exception unused) {
                gVar = null;
            }
            if (gVar != null) {
                a17 = (a17 + " [" + gVar.f192711a) + "@" + gVar.f192712b + "]";
            }
        }
        java.lang.String str4 = a17;
        java.lang.String h17 = com.tencent.mm.app.w.INSTANCE.h();
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
        jx3.f.INSTANCE.d(KV, h17, getLimitedJavaStackTrace(1024), java.lang.Integer.valueOf(i17), str4, com.tencent.mm.sdk.platformtools.z.f193109e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(j17), str, java.lang.Integer.valueOf(i18), str3);
    }

    public boolean monitor(java.lang.String str, java.lang.String str2) {
        if (this.shortTimeCounter == null && this.longTimeCounter == null && this.longLongTimeCounter == null) {
            return true;
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (bool.equals(this.entered.get())) {
            return true;
        }
        this.entered.set(bool);
        if (str == null) {
            str = "null";
        }
        if (str2 == null) {
            str2 = "null";
        }
        com.tencent.mars.xlog.WindowCounter windowCounter = this.shortTimeCounter;
        boolean z17 = windowCounter == null || windowCounter.addLog2Monitor(str, str2);
        com.tencent.mars.xlog.WindowCounter windowCounter2 = this.longTimeCounter;
        boolean z18 = windowCounter2 == null || windowCounter2.addLog2Monitor(str, str2);
        com.tencent.mars.xlog.WindowCounter windowCounter3 = this.longLongTimeCounter;
        boolean z19 = windowCounter3 == null || windowCounter3.addLog2Monitor(str, str2);
        this.entered.set(java.lang.Boolean.FALSE);
        return z17 && z18 && z19;
    }
}
