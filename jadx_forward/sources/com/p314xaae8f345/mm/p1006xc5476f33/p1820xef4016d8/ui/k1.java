package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class k1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f228626b;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d, java.lang.String str) {
        this.f228626b = activityC16363x8a0a619d;
        this.f228625a = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f228626b;
        activityC16363x8a0a619d.mo48674x36654fab();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503 c6822xf8edc503 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503();
        activityC16363x8a0a619d.f227595g2 = c6822xf8edc503;
        if (z17) {
            c6822xf8edc503.f141465d = 5L;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6823xa424e9d9 c6823xa424e9d9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6823xa424e9d9();
            activityC16363x8a0a619d.f227598h2 = c6823xa424e9d9;
            int i18 = activityC16363x8a0a619d.f227601i2;
            c6823xa424e9d9.f141466d = (i18 == 0 || i18 == 2) ? 2 : i18 == 1 ? 1 : 0;
            java.lang.String str2 = this.f228625a;
            c6823xa424e9d9.f141467e = c6823xa424e9d9.b("emoticonMd5", str2, true);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                activityC16363x8a0a619d.f227598h2.f141468f = 1L;
            } else {
                activityC16363x8a0a619d.f227598h2.f141468f = 2L;
            }
            activityC16363x8a0a619d.f227598h2.k();
            java.lang.String str3 = activityC16363x8a0a619d.L1;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str3;
            objArr[1] = java.lang.Boolean.valueOf(str == null);
            objArr[2] = str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "doTransmitEmojiToFriend() toUser:%s customTex:%s emojiMd5:%s", objArr);
            if (android.text.TextUtils.isEmpty(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyDetailUI", "doTransmitEmojiToFriend() failed!");
            } else {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                am.mt mtVar = c5990xd50ae361.f136285g;
                mtVar.f88895a = str3;
                mtVar.f88896b = str2;
                mtVar.f88897c = c01.e2.C(str3);
                mtVar.f88898d = 0;
                c5990xd50ae361.e();
                if (!android.text.TextUtils.isEmpty(str)) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae3612 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                    am.mt mtVar2 = c5990xd50ae3612.f136285g;
                    mtVar2.f88895a = str3;
                    mtVar2.f88896b = str;
                    mtVar2.f88897c = c01.e2.C(str3);
                    mtVar2.f88898d = 0;
                    c5990xd50ae3612.e();
                }
            }
            activityC16363x8a0a619d.a7(3, str2);
            db5.h7.c(null, activityC16363x8a0a619d.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), activityC16363x8a0a619d.mo55332x76847179(), 0, null);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j1(this), 500L);
        } else {
            c6822xf8edc503.f141465d = 6L;
        }
        activityC16363x8a0a619d.f227595g2.k();
    }
}
