package be1;

/* loaded from: classes7.dex */
public final class m1 implements be1.v1 {
    @Override // be1.o
    public java.util.Map a(java.lang.String type, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        com.tencent.mm.plugin.appbrand.y component = (com.tencent.mm.plugin.appbrand.y) lVar;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(component, "component");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String CPU_ABI = android.os.Build.CPU_ABI;
        kotlin.jvm.internal.o.f(CPU_ABI, "CPU_ABI");
        hashMap.put("abi", CPU_ABI);
        java.lang.String[] strArr = android.os.Build.SUPPORTED_ABIS;
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                java.lang.String str = strArr[0];
                kotlin.jvm.internal.o.f(str, "get(...)");
                hashMap.put("deviceAbi", str);
            }
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = component.t3();
        k91.z0 E0 = t37 != null ? t37.E0() : null;
        com.tencent.luggage.sdk.config.AppBrandSysConfigLU appBrandSysConfigLU = E0 instanceof com.tencent.luggage.sdk.config.AppBrandSysConfigLU ? (com.tencent.luggage.sdk.config.AppBrandSysConfigLU) E0 : null;
        if (appBrandSysConfigLU != null) {
            hashMap.put("benchmarkLevel", java.lang.Integer.valueOf(appBrandSysConfigLU.W));
        }
        java.lang.String BRAND = android.os.Build.BRAND;
        kotlin.jvm.internal.o.f(BRAND, "BRAND");
        hashMap.put("brand", BRAND);
        hashMap.put("model", wo.w0.m());
        hashMap.put("system", "Android " + android.os.Build.VERSION.RELEASE);
        int a17 = com.tencent.mm.plugin.appbrand.utils.l1.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.String b17 = wo.t.b();
        if (b17 == null) {
            b17 = com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        hashMap.put("memorySize", java.lang.Integer.valueOf(a17));
        hashMap.put("cpuType", b17);
        return hashMap;
    }
}
