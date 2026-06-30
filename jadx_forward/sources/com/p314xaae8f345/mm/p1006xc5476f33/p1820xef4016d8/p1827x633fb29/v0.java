package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class v0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f227193d;

    public v0() {
        super(0);
        this.f227193d = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5222x5561c4c3 c5222x5561c4c3 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5222x5561c4c3) abstractC20979x809547d1;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:callback() acc not ready!");
        } else if (c5222x5561c4c3 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5222x5561c4c3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:callback() receive C2CNYPredownloadImgEvent event!");
            gm0.j1.i();
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEWYEAR_HONGBAO_IMAGE_PRESTRAIN_FLAG_INT_SYNC, 1)).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "prestrainFlag:" + intValue);
            if (intValue == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:prestrainFlag is 0, do nothing!");
            } else {
                am.m1 m1Var = c5222x5561c4c3.f135555g;
                java.lang.String str2 = m1Var.f88822a;
                java.lang.String str3 = m1Var.f88823b;
                int i17 = m1Var.f88824c;
                if (android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3) || i17 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:c2c new year msg image param is invalid!");
                } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    java.util.ArrayList arrayList = this.f227193d;
                    if (arrayList.contains(str2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:imageid is exist!, do nothing!  imageid:" + str2);
                    } else {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f226985a;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || !gm0.j1.a()) {
                            str = "";
                        } else {
                            gm0.j1.i();
                            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(java.lang.String.format("%s/%s/", gm0.j1.u().d(), "LuckyMoney"));
                            if (!r6Var.m() || !r6Var.y()) {
                                r6Var.J();
                            }
                            str = new com.p314xaae8f345.mm.vfs.r6(r6Var, str2).o();
                        }
                        sb6.append(str);
                        sb6.append(".temp");
                        java.lang.String sb7 = sb6.toString();
                        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(sb7);
                        java.lang.String str4 = a17.f294812f;
                        if (str4 != null) {
                            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                            if (!str4.equals(l17)) {
                                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                            }
                        }
                        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:imagePath file is exist! not download it!");
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:callback() imagePath:" + sb7 + " is not exist!");
                            arrayList.add(str2);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.u4 u4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.u4();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.u0(this);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: downloadImage. imageId:%s", str2);
                            u4Var.f227191g = false;
                            java.lang.String b17 = com.p314xaae8f345.mm.p947xba6de98f.i2.b("NewYearImg", java.lang.System.currentTimeMillis(), c01.z1.g().d1(), "");
                            java.lang.String str5 = b17 != null ? b17 : "";
                            u4Var.f227188d = str5;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: downloadImage. client id:%s", str5);
                            u4Var.f227190f = sb7;
                            u4Var.f227189e = u0Var;
                            dn.m mVar = new dn.m();
                            mVar.f323318d = "task_LuckyMoneyNewYearImageUploader_2";
                            mVar.f323319e = false;
                            mVar.f323320f = u4Var;
                            mVar.f69595x6d25b0d9 = sb7;
                            mVar.f69601xaca5bdda = u4Var.f227188d;
                            mVar.f69591xf9dbbe9c = str2;
                            mVar.f69575xf11df5f5 = str3;
                            mVar.f69620xeb1a61d6 = i17;
                            mVar.f69592xf1ebe47b = 5;
                            mVar.f69609xd84b8349 = 2;
                            mVar.f69606xccdbf540 = false;
                            mVar.f69597x853bb235 = false;
                            mVar.f69580x454032b6 = 0;
                            mVar.f69584x89a4c0cf = 0;
                            if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: cdntra addSendTask failed. imageId:%s", str2);
                            }
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:is not wifi network, do nothing!");
                }
            }
        }
        return false;
    }
}
