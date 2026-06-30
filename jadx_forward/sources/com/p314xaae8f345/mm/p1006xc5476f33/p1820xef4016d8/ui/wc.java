package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class wc implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 f229177a;

    public wc(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13) {
        this.f229177a = activityC16373x8a110f13;
    }

    @Override // qk.u9
    public void a(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb iEmojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iEmojiInfo, "iEmojiInfo");
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227774x2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb wi6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r1) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6.class))).wi(iEmojiInfo.mo42933xb5885648());
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = this.f229177a;
        activityC16373x8a110f13.K1 = wi6;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = activityC16373x8a110f13.K1;
        if (interfaceC4987x84e327cb == null || interfaceC4987x84e327cb.E0()) {
            activityC16373x8a110f13.w7(activityC16373x8a110f13.K1);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5.class))).wi(interfaceC4987x84e327cb, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.vc(activityC16373x8a110f13, interfaceC4987x84e327cb));
        }
        mo9754xc39a57c1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.W6(activityC16373x8a110f13, 22);
    }

    @Override // qk.u9
    /* renamed from: onHide */
    public void mo9754xc39a57c1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = this.f229177a;
        fc3.j.a(activityC16373x8a110f13, activityC16373x8a110f13.G1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.b bVar = activityC16373x8a110f13.H1;
        if (bVar != null) {
            bVar.dismiss();
        }
    }
}
