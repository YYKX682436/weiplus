package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class d4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n implements com.p314xaae8f345.mm.p944x882e457a.j1 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f226760d = lp0.b.e() + "luckymoney/";

    public d4() {
        super(0);
    }

    public static java.lang.String b(int i17) {
        return f226760d + "" + i17 + "/";
    }

    public static java.lang.String c(int i17) {
        return b(i17) + "story/";
    }

    public static java.lang.String f(int i17, int i18) {
        return c(i17) + "detail_video_" + i18 + ".mp4";
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) abstractC20979x809547d1;
        if (gm0.j1.a()) {
            am.r2 r2Var = c5255x5f3208fd.f135586g;
            int i17 = r2Var.f89292a;
            if (i17 == 58) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "luckyMoney resource file update, type: %s, subType: %s, filePath: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(r2Var.f89293b), r2Var.f89294c);
                if (gm0.j1.j()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 0);
                    s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.a4(this, c5255x5f3208fd), "lucky_money_envelope_resource_checker");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "[-] kernel extension was not invoked, skip this time. type: %s, subType: %s, filePath: %s", java.lang.Integer.valueOf(r2Var.f89292a), java.lang.Integer.valueOf(r2Var.f89293b), r2Var.f89294c);
                }
            }
            int i18 = r2Var.f89292a;
            if (i18 == 104) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "luckyMoney new year resource file update, type: %s, subType: %s, filePath: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(r2Var.f89293b), r2Var.f89294c);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 21);
                s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.b4(this, c5255x5f3208fd), "lucky_money_new_year_resource_checker");
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "resourceType.errType:%s，errCode：%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if ((m1Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.j0) && i17 == 0 && i18 == 0) {
            r45.d20 d20Var = (r45.d20) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(d20Var.f453538d)) {
                return;
            }
            for (r45.es5 es5Var : d20Var.f453538d) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf(es5Var.f455246d);
                java.util.LinkedList linkedList = es5Var.f455247e;
                objArr[1] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList) ? "null" : java.lang.String.valueOf(linkedList.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "resType：%d，responses.size()：%s", objArr);
                if (es5Var.f455246d == 58 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "real donwload envelope resource");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 16);
                }
                if (es5Var.f455246d == 104 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "real donwload pag resource");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 20);
                }
            }
        }
    }
}
