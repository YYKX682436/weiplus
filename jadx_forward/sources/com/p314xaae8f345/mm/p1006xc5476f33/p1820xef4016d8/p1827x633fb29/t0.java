package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f227165a;

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f227165a = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd>(a0Var) { // from class: com.tencent.mm.plugin.luckymoney.model.LuckMoneyEffectResourceMgr$1
            {
                this.f39173x3fe91575 = 905296653;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
                int i17;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd2 = c5255x5f3208fd;
                am.r2 r2Var = c5255x5f3208fd2.f135586g;
                if (r2Var == null || (i17 = r2Var.f89292a) != 53) {
                    return false;
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                am.r2 r2Var2 = c5255x5f3208fd2.f135586g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckMoneyEffectResourceMgr", "luckyMoney resource file update, type: %s, subType: %s, filePath: %s", valueOf, java.lang.Integer.valueOf(r2Var2.f89293b), r2Var2.f89294c);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2Var2.f89294c) || !com.p314xaae8f345.mm.vfs.w6.j(r2Var2.f89294c)) {
                    return false;
                }
                java.lang.String str = r2Var2.f89294c;
                int i18 = r2Var2.f89292a;
                int i19 = r2Var2.f89293b;
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.t0.f227165a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckMoneyEffectResourceMgr", "start saveEffectResource %s %s %s", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s0(str, i18, i19), "LuckMoneyEffectResourceMgr_saveEffectResource");
                return false;
            }
        };
    }
}
