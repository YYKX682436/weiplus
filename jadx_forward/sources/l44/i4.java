package l44;

/* loaded from: classes4.dex */
public final class i4 implements w64.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u74.d f397713a;

    public i4(u74.d dVar) {
        this.f397713a = dVar;
    }

    @Override // w64.w
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18406x5acd4424 c18406x5acd4424;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("seek", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1$seekable$1");
        u74.d dVar = this.f397713a;
        u74.c cVar = dVar.T;
        if (cVar == null || !cVar.f506666c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var = dVar.f506687o;
            if (g9Var != null && (c18406x5acd4424 = g9Var.f249950g) != null && c18406x5acd4424.getVisibility() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18406x5acd4424 c18406x5acd44242 = dVar.f506687o.f249950g;
                c18406x5acd44242.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replayVideos", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
                m3.a aVar = c18406x5acd44242.f252363z;
                if (aVar != null) {
                    aVar.mo3938xab27b508(java.lang.Boolean.TRUE);
                }
                c18406x5acd44242.k(0, false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replayVideos", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ClickActionHelper", "seek newVideoView to 0");
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = dVar.f506695w;
            if (c18390xafce807 != null) {
                c18390xafce807.M(0, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ClickActionHelper", "seek onlineVideoView to 0");
            }
        }
        u74.c cVar2 = dVar.T;
        if (cVar2 != null) {
            fd4.l lVar = cVar2.f506668e;
            if (lVar != null) {
                lVar.e();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ClickActionHelper", "onCardClickAnimEnd");
            }
            if (cVar2.f506669f != null) {
                cVar2.f506669f.onAnimationEnd(new android.animation.AnimatorSet());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ClickActionHelper", "mClickToLandingPageAnimListener onCardClickAnimEnd");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("seek", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1$seekable$1");
    }
}
