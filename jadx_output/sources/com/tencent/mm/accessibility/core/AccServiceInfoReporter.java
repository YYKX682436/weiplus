package com.tencent.mm.accessibility.core;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010*J&\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\bR\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&¨\u0006+"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccServiceInfoReporter;", "", "", "", "toMarkInfoList", "mmkvName", "", com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN, "Ljz5/f0;", "markBoolean", "Lcom/tencent/mm/accessibility/core/ServiceReportInfo;", "info", "realReport", "tryReportAccessibilityServiceInfo", "serviceName", "clearAllServiceStatus", "markAccServicePerformAction", "markAccServiceHasClearInfo", "markAccServiceHasFakeInfo", "makeAccServiceHasInitInfo", "initListener", "MMKVName", "Ljava/lang/String;", com.tencent.mm.accessibility.core.AccServiceInfoReporter.MMKVName_MarkPerformAction, com.tencent.mm.accessibility.core.AccServiceInfoReporter.MMKVName_MarkHasInitNodeInfo, com.tencent.mm.accessibility.core.AccServiceInfoReporter.MMKVName_MarkHasClearNodeInfo, com.tencent.mm.accessibility.core.AccServiceInfoReporter.MMKVName_MarkHasFakeNodeInfo, "allStatusMMKVName", "Ljava/util/List;", "Lcom/tencent/mm/sdk/platformtools/o4;", "kotlin.jvm.PlatformType", "mmkv", "Lcom/tencent/mm/sdk/platformtools/o4;", "", "lastRptTime", "J", "api33ServiceNameList", "hasMarkClearInfo", "Z", "hasMarkFakeInfo", "hasMarkInitInfo", "<init>", "()V", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class AccServiceInfoReporter {
    private static java.util.List<java.lang.String> api33ServiceNameList;
    private static boolean hasMarkClearInfo;
    private static boolean hasMarkFakeInfo;
    private static boolean hasMarkInitInfo;
    private static long lastRptTime;
    public static final com.tencent.mm.accessibility.core.AccServiceInfoReporter INSTANCE = new com.tencent.mm.accessibility.core.AccServiceInfoReporter();
    private static final java.lang.String MMKVName_MarkPerformAction = "MMKVName_MarkPerformAction";
    private static final java.lang.String MMKVName_MarkHasInitNodeInfo = "MMKVName_MarkHasInitNodeInfo";
    private static final java.lang.String MMKVName_MarkHasClearNodeInfo = "MMKVName_MarkHasClearNodeInfo";
    private static final java.lang.String MMKVName_MarkHasFakeNodeInfo = "MMKVName_MarkHasFakeNodeInfo";
    private static final java.util.List<java.lang.String> allStatusMMKVName = kz5.c0.i(MMKVName_MarkPerformAction, MMKVName_MarkHasInitNodeInfo, MMKVName_MarkHasClearNodeInfo, MMKVName_MarkHasFakeNodeInfo);
    private static final java.lang.String MMKVName = "AccServiceInfoReporter";
    private static final com.tencent.mm.sdk.platformtools.o4 mmkv = com.tencent.mm.sdk.platformtools.o4.M(MMKVName);

    static {
        api33ServiceNameList = kz5.p0.f313996d;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility");
            android.view.accessibility.AccessibilityManager accessibilityManager = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
            if (accessibilityManager != null) {
                java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                kotlin.jvm.internal.o.f(enabledAccessibilityServiceList, "getEnabledAccessibilityServiceList(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(enabledAccessibilityServiceList, 10));
                for (android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    kotlin.jvm.internal.o.d(accessibilityServiceInfo);
                    arrayList.add(com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getServiceName(accessibilityServiceInfo));
                }
                api33ServiceNameList = arrayList;
                accessibilityManager.addAccessibilityServicesStateChangeListener(new android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener() { // from class: com.tencent.mm.accessibility.core.AccServiceInfoReporter.2
                    @Override // android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener
                    public final void onAccessibilityServicesStateChanged(android.view.accessibility.AccessibilityManager it) {
                        kotlin.jvm.internal.o.g(it, "it");
                        com.tencent.mm.accessibility.core.AccServiceInfoReporter accServiceInfoReporter = com.tencent.mm.accessibility.core.AccServiceInfoReporter.INSTANCE;
                        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList2 = it.getEnabledAccessibilityServiceList(-1);
                        kotlin.jvm.internal.o.f(enabledAccessibilityServiceList2, "getEnabledAccessibilityServiceList(...)");
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(enabledAccessibilityServiceList2, 10));
                        for (android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo2 : enabledAccessibilityServiceList2) {
                            kotlin.jvm.internal.o.d(accessibilityServiceInfo2);
                            arrayList2.add(com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getServiceName(accessibilityServiceInfo2));
                        }
                        com.tencent.mm.accessibility.core.AccServiceInfoReporter.api33ServiceNameList = arrayList2;
                        com.tencent.mars.xlog.Log.i("MicroMsg.AccServiceInfoReporter", "onChange api33ServiceNameList: ".concat(kz5.n0.g0(com.tencent.mm.accessibility.core.AccServiceInfoReporter.api33ServiceNameList, ";", null, null, 0, null, null, 62, null)));
                    }
                });
                com.tencent.mars.xlog.Log.i("MicroMsg.AccServiceInfoReporter", "init api33ServiceNameList: ".concat(kz5.n0.g0(api33ServiceNameList, ";", null, null, 0, null, null, 62, null)));
            }
        }
    }

    private AccServiceInfoReporter() {
    }

    private final void markBoolean(java.util.List<java.lang.String> list, java.lang.String str, boolean z17) {
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.cachePutMMKVBoolean(str, (java.lang.String) it.next(), z17);
        }
    }

    private final void realReport(com.tencent.mm.accessibility.core.ServiceReportInfo serviceReportInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AccServiceInfoReporter", "realReport: " + serviceReportInfo);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("acc_service_info", serviceReportInfo.toReportMap(), 33811);
    }

    public final void clearAllServiceStatus(java.lang.String serviceName) {
        com.tencent.mm.sdk.platformtools.o4 mmkv2;
        kotlin.jvm.internal.o.g(serviceName, "serviceName");
        com.tencent.mars.xlog.Log.i("MicroMsg.AccServiceInfoReporter", "clearAllServiceStatus :" + serviceName + ' ');
        java.util.Iterator<T> it = allStatusMMKVName.iterator();
        while (it.hasNext()) {
            mmkv2 = com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getMMKV((java.lang.String) it.next());
            mmkv2.remove(serviceName);
        }
    }

    public final void initListener() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AccServiceInfoReporter", "initListener() called");
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility");
            android.view.accessibility.AccessibilityManager accessibilityManager = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
            if (accessibilityManager == null) {
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                accessibilityManager.addAccessibilityServicesStateChangeListener(new android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener() { // from class: com.tencent.mm.accessibility.core.AccServiceInfoReporter$initListener$1
                    @Override // android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener
                    public final void onAccessibilityServicesStateChanged(android.view.accessibility.AccessibilityManager it) {
                        kotlin.jvm.internal.o.g(it, "it");
                        com.tencent.mm.accessibility.core.AccServiceInfoReporter.INSTANCE.tryReportAccessibilityServiceInfo();
                    }
                });
            }
            accessibilityManager.addAccessibilityStateChangeListener(new android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener() { // from class: com.tencent.mm.accessibility.core.AccServiceInfoReporter$initListener$2
                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                public final void onAccessibilityStateChanged(boolean z17) {
                    if (z17) {
                        com.tencent.mm.accessibility.core.AccServiceInfoReporter.INSTANCE.tryReportAccessibilityServiceInfo();
                    }
                }
            });
        }
    }

    public final void makeAccServiceHasInitInfo() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            markBoolean(api33ServiceNameList, MMKVName_MarkHasInitNodeInfo, true);
        } else if (!hasMarkInitInfo) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility");
            android.view.accessibility.AccessibilityManager accessibilityManager = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
            if (accessibilityManager == null) {
                return;
            }
            java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            kotlin.jvm.internal.o.d(enabledAccessibilityServiceList);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(enabledAccessibilityServiceList, 10));
            for (android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                kotlin.jvm.internal.o.d(accessibilityServiceInfo);
                arrayList.add(com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getServiceName(accessibilityServiceInfo));
            }
            markBoolean(arrayList, MMKVName_MarkHasInitNodeInfo, true);
        }
        hasMarkInitInfo = true;
    }

    public final void markAccServiceHasClearInfo() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            markBoolean(api33ServiceNameList, MMKVName_MarkHasClearNodeInfo, true);
        } else if (!hasMarkClearInfo) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility");
            android.view.accessibility.AccessibilityManager accessibilityManager = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
            if (accessibilityManager == null) {
                return;
            }
            java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            kotlin.jvm.internal.o.d(enabledAccessibilityServiceList);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(enabledAccessibilityServiceList, 10));
            for (android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                kotlin.jvm.internal.o.d(accessibilityServiceInfo);
                arrayList.add(com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getServiceName(accessibilityServiceInfo));
            }
            markBoolean(arrayList, MMKVName_MarkHasClearNodeInfo, true);
        }
        hasMarkClearInfo = true;
    }

    public final void markAccServiceHasFakeInfo() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            markBoolean(api33ServiceNameList, MMKVName_MarkHasFakeNodeInfo, true);
            return;
        }
        if (hasMarkFakeInfo) {
            return;
        }
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility");
        android.view.accessibility.AccessibilityManager accessibilityManager = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
        if (accessibilityManager == null) {
            return;
        }
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        kotlin.jvm.internal.o.d(enabledAccessibilityServiceList);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(enabledAccessibilityServiceList, 10));
        for (android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            kotlin.jvm.internal.o.d(accessibilityServiceInfo);
            arrayList.add(com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getServiceName(accessibilityServiceInfo));
        }
        markBoolean(arrayList, MMKVName_MarkHasFakeNodeInfo, true);
        hasMarkFakeInfo = true;
    }

    public final void markAccServicePerformAction() {
        com.tencent.mm.sdk.platformtools.o4 mmkv2;
        com.tencent.mm.sdk.platformtools.o4 mmkv3;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AccServiceInfoReporter", "markAccServicePerformAction() called");
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility");
            android.view.accessibility.AccessibilityManager accessibilityManager = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
            if (accessibilityManager == null) {
                return;
            }
            java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            kotlin.jvm.internal.o.d(enabledAccessibilityServiceList);
            for (android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                kotlin.jvm.internal.o.d(accessibilityServiceInfo);
                java.lang.String serviceName = com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getServiceName(accessibilityServiceInfo);
                mmkv2 = com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getMMKV(MMKVName_MarkPerformAction);
                int i17 = mmkv2.getInt(serviceName, 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.AccServiceInfoReporter", "markAccServicePerformAction() mark:" + serviceName + ' ' + i17);
                mmkv3 = com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getMMKV(MMKVName_MarkPerformAction);
                mmkv3.putInt(serviceName, i17 + 1);
            }
        }
    }

    public final void tryReportAccessibilityServiceInfo() {
        com.tencent.mm.sdk.platformtools.o4 mmkv2;
        com.tencent.mm.sdk.platformtools.o4 mmkv3;
        com.tencent.mm.sdk.platformtools.o4 mmkv4;
        com.tencent.mm.sdk.platformtools.o4 mmkv5;
        com.tencent.mm.accessibility.core.ServiceReportInfo convertToRptInfo;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            long c17 = c01.id.c();
            if (c17 - lastRptTime < 1000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AccServiceInfoReporter", "tryReportAccessibilityServiceInfo() called but skip");
                return;
            }
            lastRptTime = c17;
            com.tencent.mars.xlog.Log.i("MicroMsg.AccServiceInfoReporter", "tryReportAccessibilityServiceInfo() called");
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility");
            android.view.accessibility.AccessibilityManager accessibilityManager = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
            if (accessibilityManager == null) {
                return;
            }
            java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            kotlin.jvm.internal.o.f(enabledAccessibilityServiceList, "getEnabledAccessibilityServiceList(...)");
            java.util.ArrayList<com.tencent.mm.accessibility.core.ServiceReportInfo> arrayList = new java.util.ArrayList(kz5.d0.q(enabledAccessibilityServiceList, 10));
            for (android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                mmkv2 = com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getMMKV(MMKVName_MarkPerformAction);
                kotlin.jvm.internal.o.d(accessibilityServiceInfo);
                int i17 = mmkv2.getInt(com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getServiceName(accessibilityServiceInfo), 0);
                mmkv3 = com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getMMKV(MMKVName_MarkHasInitNodeInfo);
                boolean z17 = mmkv3.getBoolean(com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getServiceName(accessibilityServiceInfo), false);
                mmkv4 = com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getMMKV(MMKVName_MarkHasClearNodeInfo);
                boolean z18 = mmkv4.getBoolean(com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getServiceName(accessibilityServiceInfo), false);
                mmkv5 = com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getMMKV(MMKVName_MarkHasFakeNodeInfo);
                convertToRptInfo = com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.convertToRptInfo(accessibilityServiceInfo, i17, z18, mmkv5.getBoolean(com.tencent.mm.accessibility.core.AccServiceInfoReporterKt.getServiceName(accessibilityServiceInfo), false), z17);
                arrayList.add(convertToRptInfo);
            }
            long a17 = c01.id.a();
            for (com.tencent.mm.accessibility.core.ServiceReportInfo serviceReportInfo : arrayList) {
                com.tencent.mm.sdk.platformtools.o4 o4Var = mmkv;
                if (a17 - o4Var.getLong(serviceReportInfo.getName(), 0L) <= 86400000) {
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AccServiceInfoReporter", "no need to report :" + serviceReportInfo.getName() + ' ');
                } else {
                    com.tencent.mm.accessibility.core.AccServiceInfoReporter accServiceInfoReporter = INSTANCE;
                    accServiceInfoReporter.realReport(serviceReportInfo);
                    accServiceInfoReporter.clearAllServiceStatus(serviceReportInfo.getName());
                    o4Var.putLong(serviceReportInfo.getName(), a17);
                }
            }
        }
    }
}
