package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class n1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f228747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d) {
        super(false);
        this.f228747d = activityC16363x8a0a619d;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503 c6822xf8edc503 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f228747d;
        activityC16363x8a0a619d.f227595g2 = c6822xf8edc503;
        c6822xf8edc503.f141465d = 7L;
        c6822xf8edc503.k();
        int e76 = activityC16363x8a0a619d.e7();
        activityC16363x8a0a619d.f227622p2 = e76;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "click mEmojiUseType：%s", java.lang.Integer.valueOf(e76));
        if (activityC16363x8a0a619d.f227622p2 != 1) {
            activityC16363x8a0a619d.i7("");
        } else {
            activityC16363x8a0a619d.i7((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_NORMAL_STRING, ""));
        }
    }
}
