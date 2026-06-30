package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class j9 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228585b;

    public j9(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d, java.lang.String str) {
        this.f228584a = activityC16371xf216ae6d;
        this.f228585b = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f228584a;
        activityC16371xf216ae6d.mo48674x36654fab();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503 c6822xf8edc503 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503();
        activityC16371xf216ae6d.f227719g2 = c6822xf8edc503;
        if (z17) {
            c6822xf8edc503.f141465d = 5L;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6823xa424e9d9 c6823xa424e9d9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6823xa424e9d9();
            activityC16371xf216ae6d.f227722h2 = c6823xa424e9d9;
            int i18 = activityC16371xf216ae6d.f227725i2;
            c6823xa424e9d9.f141466d = (i18 == 0 || i18 == 2) ? 2 : i18 == 1 ? 1 : 0;
            java.lang.String str2 = this.f228585b;
            c6823xa424e9d9.f141467e = c6823xa424e9d9.b("emoticonMd5", str2, true);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6823xa424e9d9 c6823xa424e9d92 = activityC16371xf216ae6d.f227722h2;
                if (c6823xa424e9d92 != null) {
                    c6823xa424e9d92.f141468f = 1L;
                }
            } else {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6823xa424e9d9 c6823xa424e9d93 = activityC16371xf216ae6d.f227722h2;
                if (c6823xa424e9d93 != null) {
                    c6823xa424e9d93.f141468f = 2L;
                }
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6823xa424e9d9 c6823xa424e9d94 = activityC16371xf216ae6d.f227722h2;
            if (c6823xa424e9d94 != null) {
                c6823xa424e9d94.k();
            }
            java.lang.String str3 = activityC16371xf216ae6d.L1;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str3;
            objArr[1] = java.lang.Boolean.valueOf(str == null);
            objArr[2] = str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "doTransmitEmojiToFriend() toUser:%s customTex:%s emojiMd5:%s", objArr);
            if (android.text.TextUtils.isEmpty(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewDetailUI", "doTransmitEmojiToFriend() failed!");
            } else {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                am.mt mtVar = c5990xd50ae361.f136285g;
                if (mtVar != null) {
                    mtVar.f88895a = str3;
                }
                if (mtVar != null) {
                    mtVar.f88896b = str2;
                }
                if (mtVar != null) {
                    mtVar.f88897c = c01.e2.C(str3);
                }
                if (mtVar != null) {
                    mtVar.f88898d = 0;
                }
                c5990xd50ae361.e();
                if (!android.text.TextUtils.isEmpty(str)) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae3612 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                    am.mt mtVar2 = c5990xd50ae3612.f136285g;
                    if (mtVar2 != null) {
                        mtVar2.f88895a = str3;
                    }
                    if (mtVar2 != null) {
                        mtVar2.f88896b = str;
                    }
                    if (mtVar2 != null) {
                        mtVar2.f88897c = c01.e2.C(str3);
                    }
                    if (mtVar2 != null) {
                        mtVar2.f88898d = 0;
                    }
                    c5990xd50ae3612.e();
                }
            }
            activityC16371xf216ae6d.a7(3, str2);
            db5.h7.c(null, activityC16371xf216ae6d.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), activityC16371xf216ae6d.mo55332x76847179(), 0, null);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i9(activityC16371xf216ae6d), 500L);
        } else {
            c6822xf8edc503.f141465d = 6L;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503 c6822xf8edc5032 = activityC16371xf216ae6d.f227719g2;
        if (c6822xf8edc5032 != null) {
            c6822xf8edc5032.k();
        }
    }
}
