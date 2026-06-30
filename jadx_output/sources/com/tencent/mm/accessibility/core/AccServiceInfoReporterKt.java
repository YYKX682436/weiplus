package com.tencent.mm.accessibility.core;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\u001a,\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a\u0012\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t*\u00020\u0000\u001a\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0002\u001a \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002\"\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\" \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\",\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroid/accessibilityservice/AccessibilityServiceInfo;", "", "hasPerformActionCount", "", "hasMarkClearInfo", "hasMarkFakeInfo", "hasMarkInitInfo", "Lcom/tencent/mm/accessibility/core/ServiceReportInfo;", "convertToRptInfo", "", "kotlin.jvm.PlatformType", "getServiceName", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "Lcom/tencent/mm/sdk/platformtools/o4;", "getMMKV", "mmkvName", "serviceName", com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN, "Ljz5/f0;", "cachePutMMKVBoolean", "OneDay", "I", "TAG", "Ljava/lang/String;", "", "typeMMKVMap", "Ljava/util/Map;", "cacheMap", "feature-autoaccessibility_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class AccServiceInfoReporterKt {
    private static final int OneDay = 86400000;
    private static final java.lang.String TAG = "MicroMsg.AccServiceInfoReporter";
    private static final java.util.Map<java.lang.String, com.tencent.mm.sdk.platformtools.o4> typeMMKVMap = new java.util.LinkedHashMap();
    private static final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> cacheMap = new java.util.LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cachePutMMKVBoolean(java.lang.String str, java.lang.String str2, boolean z17) {
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> map = cacheMap;
        java.util.Map<java.lang.String, java.lang.Boolean> map2 = map.get(str);
        java.lang.Boolean bool = map2 != null ? map2.get(str2) : null;
        if (bool == null) {
            getMMKV(str).putBoolean(str2, z17);
            java.util.Map<java.lang.String, java.lang.Boolean> map3 = map.get(str);
            if (map3 == null) {
                map3 = new java.util.LinkedHashMap<>();
                map.put(str, map3);
            }
            map3.put(str2, java.lang.Boolean.valueOf(z17));
            com.tencent.mars.xlog.Log.i(TAG, "cachePutMMKVBoolean: cacheValue != boolean: " + str + ' ' + str2 + ' ' + z17);
            return;
        }
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.valueOf(z17))) {
            return;
        }
        getMMKV(str).putBoolean(str2, z17);
        java.util.Map<java.lang.String, java.lang.Boolean> map4 = map.get(str);
        if (map4 == null) {
            map4 = new java.util.LinkedHashMap<>();
            map.put(str, map4);
        }
        map4.put(str2, java.lang.Boolean.valueOf(z17));
        com.tencent.mars.xlog.Log.i(TAG, "cachePutMMKVBoolean: cacheValue != boolean: " + str + ' ' + str2 + ' ' + z17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.tencent.mm.accessibility.core.ServiceReportInfo convertToRptInfo(android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo, int i17, boolean z17, boolean z18, boolean z19) {
        java.lang.String id6 = accessibilityServiceInfo.getId();
        kotlin.jvm.internal.o.f(id6, "getId(...)");
        java.lang.String packageName = accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName;
        kotlin.jvm.internal.o.f(packageName, "packageName");
        java.lang.String name = accessibilityServiceInfo.getResolveInfo().serviceInfo.name;
        kotlin.jvm.internal.o.f(name, "name");
        java.lang.String processName = accessibilityServiceInfo.getResolveInfo().serviceInfo.processName;
        kotlin.jvm.internal.o.f(processName, "processName");
        return new com.tencent.mm.accessibility.core.ServiceReportInfo(id6, packageName, name, processName, accessibilityServiceInfo.flags, accessibilityServiceInfo.getCapabilities(), accessibilityServiceInfo.eventTypes, accessibilityServiceInfo.feedbackType, android.os.Build.VERSION.SDK_INT >= 31 ? accessibilityServiceInfo.isAccessibilityTool() : false, i17, z17, z18, z19);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.tencent.mm.sdk.platformtools.o4 getMMKV(java.lang.String str) {
        java.util.Map<java.lang.String, com.tencent.mm.sdk.platformtools.o4> map = typeMMKVMap;
        com.tencent.mm.sdk.platformtools.o4 o4Var = map.get(str);
        if (o4Var != null) {
            return o4Var;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(str);
        kotlin.jvm.internal.o.d(M);
        map.put(str, M);
        return M;
    }

    public static final java.lang.String getServiceName(android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo) {
        kotlin.jvm.internal.o.g(accessibilityServiceInfo, "<this>");
        return accessibilityServiceInfo.getResolveInfo().serviceInfo.name;
    }
}
