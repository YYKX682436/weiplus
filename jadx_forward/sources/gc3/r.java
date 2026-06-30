package gc3;

/* loaded from: classes9.dex */
public final class r implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16412xaf564658 f351972d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16412xaf564658 c16412xaf564658) {
        this.f351972d = c16412xaf564658;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16412xaf564658 c16412xaf564658 = this.f351972d;
        long j17 = c16412xaf564658.f229150q;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c16412xaf564658.f229151r = java.lang.System.currentTimeMillis() - j17;
        gc3.n voiceListener = c16412xaf564658.getVoiceListener();
        if (voiceListener == null) {
            return true;
        }
        int i17 = (int) c16412xaf564658.f229151r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nh nhVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nh) voiceListener;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onDetectProcess useTime:%s", java.lang.Integer.valueOf(i17));
        if (i17 < 50000) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = nhVar.f228775a;
        if (!activityC16384xb66222dd.F2.e() || (view = activityC16384xb66222dd.f227938h) == null) {
            return true;
        }
        view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jh(nhVar));
        return true;
    }
}
