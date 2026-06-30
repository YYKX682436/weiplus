package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public abstract class ta {
    public static final java.lang.String a(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        int[] iArr = qq5.a.f365998e;
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        for (int i18 = 0; i18 < 3; i18++) {
            arrayList.add("appId='" + new com.tencent.mm.plugin.appbrand.appcache.a6(appId, "", iArr[i18]) + '\'');
        }
        return "(" + kz5.n0.g0(arrayList, " or ", null, null, 0, null, null, 62, null) + ") and debugType=" + i17;
    }

    public static final java.lang.String b(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        int[] iArr = qq5.a.f365998e;
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        for (int i18 = 0; i18 < 3; i18++) {
            arrayList.add("appId!='" + new com.tencent.mm.plugin.appbrand.appcache.a6(appId, "", iArr[i18]) + '\'');
        }
        return r26.b0.b("\n            appId like '" + appId + "$%' and " + kz5.n0.g0(arrayList, " and ", null, null, 0, null, null, 62, null) + " and debugType=" + i17 + "\n        ");
    }
}
