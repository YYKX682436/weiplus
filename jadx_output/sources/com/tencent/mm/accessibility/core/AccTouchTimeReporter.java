package com.tencent.mm.accessibility.core;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccTouchTimeReporter;", "", "", "isEnable", "Ljz5/f0;", "recordTimeDuration", "", "durMs", "addToDurTimeMs", "tryReport", "realReportDurTime", "onNotifyChange", "onAppForeground", "", "TAG", "Ljava/lang/String;", com.tencent.mm.accessibility.core.AccTouchTimeReporter.MMKVKey_TouchDurTimeMs, com.tencent.mm.accessibility.core.AccTouchTimeReporter.MMKVKey_LastReportTimeMs, "Lcom/tencent/mm/sdk/platformtools/o4;", "kotlin.jvm.PlatformType", "mmkv", "Lcom/tencent/mm/sdk/platformtools/o4;", "lastRecordTouchEnableTimeMs", "J", "lastTouchEnable", "Z", "<init>", "()V", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AccTouchTimeReporter {
    private static final java.lang.String MMKVKey_LastReportTimeMs = "MMKVKey_LastReportTimeMs";
    private static final java.lang.String MMKVKey_TouchDurTimeMs = "MMKVKey_TouchDurTimeMs";
    private static final java.lang.String TAG = "MicroMsg.AccTouchTimeReporter";
    private static long lastRecordTouchEnableTimeMs;
    private static boolean lastTouchEnable;
    public static final com.tencent.mm.accessibility.core.AccTouchTimeReporter INSTANCE = new com.tencent.mm.accessibility.core.AccTouchTimeReporter();
    private static final com.tencent.mm.sdk.platformtools.o4 mmkv = com.tencent.mm.sdk.platformtools.o4.M("AccTouchTimeReporter");

    private AccTouchTimeReporter() {
    }

    private final void addToDurTimeMs(long j17) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = mmkv;
        long j18 = o4Var.getLong(MMKVKey_TouchDurTimeMs, 0L);
        o4Var.putLong(MMKVKey_TouchDurTimeMs, j18 + j17);
        com.tencent.mars.xlog.Log.i(TAG, "addToDurTimeMs:" + j18 + " + " + j17);
    }

    private final void realReportDurTime(long j17) {
        com.tencent.mars.xlog.Log.i(TAG, "realReport: " + j17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("touch_enable_dur_oneday", kz5.b1.e(new jz5.l("durTime", java.lang.Long.valueOf(j17))), 33811);
    }

    private final void recordTimeDuration(boolean z17) {
        long c17 = c01.id.c();
        if (lastTouchEnable) {
            addToDurTimeMs(c17 - lastRecordTouchEnableTimeMs);
        }
        lastRecordTouchEnableTimeMs = c17;
        lastTouchEnable = z17;
        if (z17) {
            tryReport();
        }
    }

    private final void tryReport() {
        long c17 = c01.id.c();
        com.tencent.mm.sdk.platformtools.o4 o4Var = mmkv;
        if (c17 - o4Var.getLong(MMKVKey_LastReportTimeMs, 0L) > 86400000 || com.tencent.mm.sdk.platformtools.s9.f192975c) {
            realReportDurTime(o4Var.getLong(MMKVKey_TouchDurTimeMs, 0L));
            o4Var.putLong(MMKVKey_LastReportTimeMs, c17);
            o4Var.putLong(MMKVKey_TouchDurTimeMs, 0L);
        }
    }

    public final void onAppForeground(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            recordTimeDuration(z17);
        }
    }

    public final void onNotifyChange(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            recordTimeDuration(z17);
        }
    }
}
