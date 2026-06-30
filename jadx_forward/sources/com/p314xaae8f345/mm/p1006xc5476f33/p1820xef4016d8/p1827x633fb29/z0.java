package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class z0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public long f227260d;

    public z0() {
        super(0);
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z0 z0Var, java.lang.String str) {
        z0Var.getClass();
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
        if (k17 >= z0Var.f227260d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "cdn download finish, file is exists");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "cdn download finish, and realLength:%s < voiceFileLength:%s, need to delete", java.lang.Long.valueOf(k17), java.lang.Long.valueOf(z0Var.f227260d));
            com.p314xaae8f345.mm.vfs.w6.h(str);
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5223xf842adb4 c5223xf842adb4 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5223xf842adb4) abstractC20979x809547d1;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:callback() acc not ready!");
            return false;
        }
        if (!(c5223xf842adb4 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5223xf842adb4)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:callback() receive C2CNYPredownloadVoiceEvent event!");
        am.n1 n1Var = c5223xf842adb4.f135556g;
        this.f227260d = n1Var.f88924c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.c(n1Var.f88922a, n1Var.f88923b, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.y0(this));
        return false;
    }
}
