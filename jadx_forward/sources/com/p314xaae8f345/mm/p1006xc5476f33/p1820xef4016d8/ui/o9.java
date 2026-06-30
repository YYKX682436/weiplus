package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class o9 implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228799a;

    public o9(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        this.f228799a = activityC16371xf216ae6d;
    }

    @Override // qk.u9
    public void a(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb iEmojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iEmojiInfo, "iEmojiInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f228799a;
        activityC16371xf216ae6d.f227746p2 = 2;
        activityC16371xf216ae6d.a7(2, iEmojiInfo.mo42933xb5885648());
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d.m7(activityC16371xf216ae6d, null, 1, null);
        mo9754xc39a57c1();
    }

    @Override // qk.u9
    /* renamed from: onHide */
    public void mo9754xc39a57c1() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d.f227704r3;
        this.f228799a.d7();
    }
}
