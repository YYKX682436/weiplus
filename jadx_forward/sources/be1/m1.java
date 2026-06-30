package be1;

/* loaded from: classes7.dex */
public final class m1 implements be1.v1 {
    @Override // be1.o
    public java.util.Map a(java.lang.String type, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y component = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String CPU_ABI = android.os.Build.CPU_ABI;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CPU_ABI, "CPU_ABI");
        hashMap.put("abi", CPU_ABI);
        java.lang.String[] strArr = android.os.Build.SUPPORTED_ABIS;
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                java.lang.String str = strArr[0];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "get(...)");
                hashMap.put("deviceAbi", str);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = component.t3();
        k91.z0 E0 = t37 != null ? t37.E0() : null;
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 c3899xf952a052 = E0 instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 ? (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052) E0 : null;
        if (c3899xf952a052 != null) {
            hashMap.put("benchmarkLevel", java.lang.Integer.valueOf(c3899xf952a052.W));
        }
        java.lang.String BRAND = android.os.Build.BRAND;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(BRAND, "BRAND");
        hashMap.put("brand", BRAND);
        hashMap.put("model", wo.w0.m());
        hashMap.put("system", "Android " + android.os.Build.VERSION.RELEASE);
        int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.l1.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.String b17 = wo.t.b();
        if (b17 == null) {
            b17 = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        hashMap.put("memorySize", java.lang.Integer.valueOf(a17));
        hashMap.put("cpuType", b17);
        return hashMap;
    }
}
