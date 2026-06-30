package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes13.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.media.record.n0 f85832a = new com.tencent.mm.plugin.appbrand.media.record.m0();

    public static void a(int i17) {
        f85832a.idkeyStat(689L, com.tencent.mm.plugin.appbrand.media.record.l0.a(i17), 1L, true);
    }

    public static void b(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(689);
        iDKey.SetKey(1);
        iDKey.SetValue(1L);
        com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
        iDKey2.SetID(689);
        iDKey2.SetKey(com.tencent.mm.plugin.appbrand.media.record.l0.a(i17));
        iDKey2.SetValue(1L);
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        f85832a.b(arrayList, true);
    }

    public static void c() {
        f85832a.idkeyStat(689L, 0L, 1L, true);
    }
}
