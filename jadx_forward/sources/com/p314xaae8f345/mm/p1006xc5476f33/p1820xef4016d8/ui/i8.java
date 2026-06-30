package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class i8 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228553d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        super(false);
        this.f228553d = activityC16371xf216ae6d;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503 c6822xf8edc503 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f228553d;
        activityC16371xf216ae6d.f227719g2 = c6822xf8edc503;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6822xf8edc503 c6822xf8edc5032 = activityC16371xf216ae6d.f227719g2;
        if (c6822xf8edc5032 != null) {
            c6822xf8edc5032.f141465d = 7L;
        }
        if (c6822xf8edc5032 != null) {
            c6822xf8edc5032.k();
        }
        activityC16371xf216ae6d.f227746p2 = activityC16371xf216ae6d.g7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "click mEmojiUseType：%s", java.lang.Integer.valueOf(activityC16371xf216ae6d.f227746p2));
        int i17 = activityC16371xf216ae6d.f227746p2;
        if (i17 == 1) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_NORMAL_STRING, "");
            java.lang.String str = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
            activityC16371xf216ae6d.l7(str != null ? str : "");
        } else if (i17 != 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d.m7(activityC16371xf216ae6d, null, 1, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d.m7(activityC16371xf216ae6d, null, 1, null);
        }
    }
}
