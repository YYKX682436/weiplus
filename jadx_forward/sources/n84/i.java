package n84;

/* loaded from: classes4.dex */
public class i implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 f417212d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 c17785x8a47a261) {
        this.f417212d = c17785x8a47a261;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 c17785x8a47a261 = this.f417212d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTimerExpired", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$1");
        try {
            if (c17785x8a47a261.f245023s == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdAlphaPlayerView", "onTimerExpired, mProgressListener is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTimerExpired", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$1");
                return false;
            }
            kk4.c cVar = c17785x8a47a261.f245012e;
            if (cVar != null) {
                long mo100915xddd35a52 = ((kk4.f0) cVar).mo100915xddd35a52();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAlphaPlayerView", "onTimerExpired, onPlayProgress is " + mo100915xddd35a52);
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h0) c17785x8a47a261.f245023s).a(mo100915xddd35a52);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdAlphaPlayerView", "onTimerExpired, mPlayer is null, may be created timeout");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTimerExpired", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$1");
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdAlphaPlayerView", "onTimerExpired error is " + th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTimerExpired", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$1");
            return false;
        }
    }
}
