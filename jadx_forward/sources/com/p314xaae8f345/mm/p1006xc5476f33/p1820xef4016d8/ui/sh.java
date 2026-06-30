package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class sh implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd f228956a;

    public sh(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd) {
        this.f228956a = activityC16384xb66222dd;
    }

    @Override // qk.u9
    public void a(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "[onSelectedEmoji] emojiInfo:%s", interfaceC4987x84e327cb);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd.M2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = this.f228956a;
        if (interfaceC4987x84e327cb == null) {
            activityC16384xb66222dd.d7(5);
        } else {
            activityC16384xb66222dd.getClass();
            activityC16384xb66222dd.l7(interfaceC4987x84e327cb.mo42933xb5885648());
        }
        mo9754xc39a57c1();
    }

    @Override // qk.u9
    /* renamed from: onHide */
    public void mo9754xc39a57c1() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd.M2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = this.f228956a;
        fc3.j.a(activityC16384xb66222dd.mo55332x76847179(), activityC16384xb66222dd.S1);
        activityC16384xb66222dd.T1.dismiss();
    }
}
