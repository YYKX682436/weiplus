package com.tencent.mm.accessibility.core;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001c\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccInterceptActionReporter;", "", "Ljz5/f0;", "realReport", "countService", "tryReportInterceptInfo", "", "TAG", "Ljava/lang/String;", com.tencent.mm.accessibility.core.AccInterceptActionReporter.MMKVKey_LastReportTimeMs, "Lcom/tencent/mm/sdk/platformtools/o4;", "kotlin.jvm.PlatformType", "mmkv", "Lcom/tencent/mm/sdk/platformtools/o4;", "", "lastTryTime", "J", "<init>", "()V", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class AccInterceptActionReporter {
    private static final java.lang.String MMKVKey_LastReportTimeMs = "MMKVKey_LastReportTimeMs";
    private static final java.lang.String TAG = "MicroMsg.AccInterceptActionReporter";
    private static long lastTryTime;
    public static final com.tencent.mm.accessibility.core.AccInterceptActionReporter INSTANCE = new com.tencent.mm.accessibility.core.AccInterceptActionReporter();
    private static final com.tencent.mm.sdk.platformtools.o4 mmkv = com.tencent.mm.sdk.platformtools.o4.M("AccInterceptActionReporter");

    private AccInterceptActionReporter() {
    }

    private final void countService() {
        com.tencent.mars.xlog.Log.i(TAG, "countService");
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility");
        android.view.accessibility.AccessibilityManager accessibilityManager = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
        if (accessibilityManager == null) {
            return;
        }
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        kotlin.jvm.internal.o.d(enabledAccessibilityServiceList);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList(kz5.d0.q(enabledAccessibilityServiceList, 10));
        for (android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            kotlin.jvm.internal.o.d(accessibilityServiceInfo);
            arrayList.add(com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getServiceName(accessibilityServiceInfo));
        }
        for (java.lang.String str : arrayList) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = mmkv;
            o4Var.putInt(str, o4Var.getInt(str, 0) + 1);
            com.tencent.mars.xlog.Log.i(TAG, "countService:" + str);
        }
    }

    private final void realReport() {
        com.tencent.mars.xlog.Log.i(TAG, "realReport");
        java.lang.String[] b17 = mmkv.b();
        kotlin.jvm.internal.o.f(b17, "allKeys(...)");
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        for (java.lang.String str : b17) {
            if (!kotlin.jvm.internal.o.b(str, MMKVKey_LastReportTimeMs)) {
                arrayList.add(str);
            }
        }
        for (java.lang.String str2 : arrayList) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l lVar = new jz5.l(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_SERVICE_NAME, str2);
            com.tencent.mm.sdk.platformtools.o4 o4Var = mmkv;
            ((cy1.a) rVar).Ej("service_action_intercept", kz5.c1.k(lVar, new jz5.l("count", java.lang.String.valueOf(o4Var.getInt(str2, 0)))), 33811);
            com.tencent.mars.xlog.Log.i(TAG, "realReport: " + str2 + " to " + o4Var.getInt(str2, 0));
        }
        mmkv.d();
    }

    public final void tryReportInterceptInfo() {
        long c17 = c01.id.c();
        if (c17 - lastTryTime < 5 * 1000) {
            return;
        }
        countService();
        com.tencent.mars.xlog.Log.i(TAG, "tryReportFakeInfo");
        lastTryTime = c17;
        com.tencent.mm.sdk.platformtools.o4 o4Var = mmkv;
        long j17 = 60;
        if (c17 - o4Var.getLong(MMKVKey_LastReportTimeMs, 0L) > 1 * 24 * j17 * 1000 * j17 || com.tencent.mm.sdk.platformtools.s9.f192975c) {
            realReport();
            o4Var.putLong(MMKVKey_LastReportTimeMs, c17);
        }
    }
}
