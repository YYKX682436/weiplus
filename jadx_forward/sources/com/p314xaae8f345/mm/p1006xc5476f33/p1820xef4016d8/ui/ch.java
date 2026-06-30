package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class ch implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481 f228329a;

    public ch(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481 activityC16382x78dd3481) {
        this.f228329a = activityC16382x78dd3481;
    }

    @Override // qk.u9
    public void a(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "[onSelectedEmoji] emojiInfo:%s", interfaceC4987x84e327cb);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481.F1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481 activityC16382x78dd3481 = this.f228329a;
        if (interfaceC4987x84e327cb == null) {
            activityC16382x78dd3481.Y6(0);
        } else {
            activityC16382x78dd3481.getClass();
            activityC16382x78dd3481.a7(interfaceC4987x84e327cb.mo42933xb5885648());
        }
        mo9754xc39a57c1();
    }

    @Override // qk.u9
    /* renamed from: onHide */
    public void mo9754xc39a57c1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481 activityC16382x78dd3481 = this.f228329a;
        fc3.j.a(activityC16382x78dd3481, activityC16382x78dd3481.P);
        activityC16382x78dd3481.Q.dismiss();
    }
}
