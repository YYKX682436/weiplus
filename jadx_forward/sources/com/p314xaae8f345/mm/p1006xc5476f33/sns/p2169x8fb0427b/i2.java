package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.i2 f247555a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.i2();

    public final java.util.List a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsInfoLargeThanCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageKt", "getSnsInfoLargeThanCreateTime >> createTime: " + i17);
        p75.i0 i18 = dm.va.f68837x4be43ae.i();
        p75.d dVar = dm.va.f68821x6e9501c9;
        java.lang.String value = java.lang.String.valueOf(i17);
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        i18.f434190d = new p75.u0(dVar.z(), value);
        i18.e(dVar.u());
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226> k17 = i18.a().k(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.aj(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageKt", "getSnsInfoLargeThanCreateTime >> createTime: " + i17 + ", size: " + ((java.util.ArrayList) k17).size());
        for (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 : k17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageKt", "getSnsInfoLargeThanCreateTime >> " + c17933xe8d1b226.m70357x3fdd41df() + ", " + c17933xe8d1b226.m70367x7525eefd() + ". " + c17933xe8d1b226.f38324x142bbdc6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfoLargeThanCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
        return k17;
    }

    public final java.util.List b(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsInfoSmallThanCreateTimeAndLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
        p75.i0 i19 = dm.va.f68837x4be43ae.i();
        p75.d dVar = dm.va.f68821x6e9501c9;
        java.lang.String value = java.lang.String.valueOf(i17);
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        i19.f434190d = new p75.d1(dVar.z(), value);
        i19.e(dVar.u());
        i19.c(i18, 0);
        java.util.List k17 = i19.a().k(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.aj(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSnsInfoSmallThanCreateTimeAndLimit >> createTime: ");
        sb6.append(i17);
        sb6.append(", size: ");
        java.util.ArrayList arrayList = (java.util.ArrayList) k17;
        sb6.append(arrayList.size());
        sb6.append(", limit: ");
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageKt", sb6.toString());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageKt", "getSnsInfoSmallThanCreateTimeAndLimit >> " + c17933xe8d1b226.m70357x3fdd41df() + ", " + c17933xe8d1b226.m70367x7525eefd() + ". " + c17933xe8d1b226.f38324x142bbdc6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfoSmallThanCreateTimeAndLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
        return k17;
    }
}
