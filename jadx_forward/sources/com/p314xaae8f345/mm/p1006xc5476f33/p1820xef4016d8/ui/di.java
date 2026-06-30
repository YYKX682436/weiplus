package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class di implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd f228377a;

    public di(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd) {
        this.f228377a = activityC16384xb66222dd;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onSceneEnd() scene:NetScenePrepareNewYearLuckyMoney JumpRemind:onNext()");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        boolean z18 = i17 == 2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = this.f228377a;
        if (z18 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "requestwxhb")) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd.M2;
            activityC16384xb66222dd.a7(1);
            return;
        }
        if (i17 == 1) {
            js.s0 s0Var = (js.s0) i95.n0.c(js.s0.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16384xb66222dd.mo55332x76847179();
            ((is.h) s0Var).getClass();
            c71.b.c(mo55332x76847179, str, 0, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q
    /* renamed from: onCancel */
    public void mo66210x3d6f0539() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onSceneEnd() scene:NetScenePrepareNewYearLuckyMoney JumpRemind:onCancel()");
    }
}
