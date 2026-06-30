package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public abstract class l {
    public static void a(int i17) {
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(762L, i17, 1L, false);
    }

    public static void b(int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(762);
        iDKey.SetKey(i17);
        iDKey.SetValue(1L);
        arrayList.add(iDKey);
        com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
        iDKey2.SetID(762);
        iDKey2.SetKey(i18);
        iDKey2.SetValue(1L);
        arrayList.add(iDKey2);
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
    }
}
