package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\u001a,\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a\u0012\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t*\u00020\u0000\u001a\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0002\u001a \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002\"\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\" \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\",\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroid/accessibilityservice/AccessibilityServiceInfo;", "", "hasPerformActionCount", "", "hasMarkClearInfo", "hasMarkFakeInfo", "hasMarkInitInfo", "Lcom/tencent/mm/accessibility/core/ServiceReportInfo;", "convertToRptInfo", "", "kotlin.jvm.PlatformType", "getServiceName", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "Lcom/tencent/mm/sdk/platformtools/o4;", "getMMKV", "mmkvName", "serviceName", com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03, "Ljz5/f0;", "cachePutMMKVBoolean", "OneDay", "I", "TAG", "Ljava/lang/String;", "", "typeMMKVMap", "Ljava/util/Map;", "cacheMap", "feature-autoaccessibility_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.AccServiceInfoReporterKt */
/* loaded from: classes8.dex */
public final class C4869x8ff431ac {

    /* renamed from: OneDay */
    private static final int f21053x8d0be776 = 86400000;
    private static final java.lang.String TAG = "MicroMsg.AccServiceInfoReporter";

    /* renamed from: typeMMKVMap */
    private static final java.util.Map<java.lang.String, com.p314xaae8f345.mm.sdk.p2603x2137b148.o4> f21055x390cddd7 = new java.util.LinkedHashMap();

    /* renamed from: cacheMap */
    private static final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> f21054xe629367a = new java.util.LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cachePutMMKVBoolean */
    public static final void m42466x6004b450(java.lang.String str, java.lang.String str2, boolean z17) {
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> map = f21054xe629367a;
        java.util.Map<java.lang.String, java.lang.Boolean> map2 = map.get(str);
        java.lang.Boolean bool = map2 != null ? map2.get(str2) : null;
        if (bool == null) {
            m42468xfb821f61(str).putBoolean(str2, z17);
            java.util.Map<java.lang.String, java.lang.Boolean> map3 = map.get(str);
            if (map3 == null) {
                map3 = new java.util.LinkedHashMap<>();
                map.put(str, map3);
            }
            map3.put(str2, java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "cachePutMMKVBoolean: cacheValue != boolean: " + str + ' ' + str2 + ' ' + z17);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.valueOf(z17))) {
            return;
        }
        m42468xfb821f61(str).putBoolean(str2, z17);
        java.util.Map<java.lang.String, java.lang.Boolean> map4 = map.get(str);
        if (map4 == null) {
            map4 = new java.util.LinkedHashMap<>();
            map.put(str, map4);
        }
        map4.put(str2, java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "cachePutMMKVBoolean: cacheValue != boolean: " + str + ' ' + str2 + ' ' + z17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToRptInfo */
    public static final com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4875xbb263877 m42467x9fecbc56(android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo, int i17, boolean z17, boolean z18, boolean z19) {
        java.lang.String id6 = accessibilityServiceInfo.getId();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(id6, "getId(...)");
        java.lang.String packageName = accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageName, "packageName");
        java.lang.String name = accessibilityServiceInfo.getResolveInfo().serviceInfo.name;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
        java.lang.String processName = accessibilityServiceInfo.getResolveInfo().serviceInfo.processName;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(processName, "processName");
        return new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4875xbb263877(id6, packageName, name, processName, accessibilityServiceInfo.flags, accessibilityServiceInfo.getCapabilities(), accessibilityServiceInfo.eventTypes, accessibilityServiceInfo.feedbackType, android.os.Build.VERSION.SDK_INT >= 31 ? accessibilityServiceInfo.isAccessibilityTool() : false, i17, z17, z18, z19);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getMMKV */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 m42468xfb821f61(java.lang.String str) {
        java.util.Map<java.lang.String, com.p314xaae8f345.mm.sdk.p2603x2137b148.o4> map = f21055x390cddd7;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = map.get(str);
        if (o4Var != null) {
            return o4Var;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M);
        map.put(str, M);
        return M;
    }

    /* renamed from: getServiceName */
    public static final java.lang.String m42469x66e299aa(android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accessibilityServiceInfo, "<this>");
        return accessibilityServiceInfo.getResolveInfo().serviceInfo.name;
    }
}
