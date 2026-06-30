package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class e7 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d f249758d;

    public e7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d c17982x5116533d) {
        this.f249758d = c17982x5116533d;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d c17982x5116533d = this.f249758d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d.a(c17982x5116533d) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$6");
            return false;
        }
        if (((android.view.View) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d.a(c17982x5116533d)).getAlpha() < 1.0f) {
            c17982x5116533d.o(true, 1.0f);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d.a(c17982x5116533d).mo69311xc00617a4()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            c17982x5116533d.f();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            int mo69307x9746038c = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d.a(c17982x5116533d).mo69307x9746038c();
            c17982x5116533d.t(mo69307x9746038c);
            if (mo69307x9746038c / 1000 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVideoView", "onTimerExpired, curPos=" + mo69307x9746038c + ", video.alpha=" + com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d.b(c17982x5116533d).getAlpha() + ", video.visble=" + com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d.b(c17982x5116533d).getVisibility() + ", thumb.alpha=" + c17982x5116533d.f247945g.getAlpha() + ", thumb.visble=" + c17982x5116533d.f247945g.getVisibility());
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVideoView", "onTimerExpired, isPlaying=false");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$6");
        return true;
    }
}
