package fd4;

/* loaded from: classes4.dex */
public class e extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd4.f f342831a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fd4.f fVar, android.os.Looper looper) {
        super(looper);
        this.f342831a = fVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMessage", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$2");
        long j17 = message.arg1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        fd4.f fVar = this.f342831a;
        fVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        if (fVar.B == 0) {
            fVar.B = java.lang.System.currentTimeMillis();
        }
        if (fVar.f342836u == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        } else {
            fVar.w();
            s34.k kVar = fVar.f342836u;
            if (j17 < kVar.f484213a || j17 > kVar.f484214b) {
                fVar.f342832q.m69582x5f152dab(false);
                fVar.f342832q.b(true);
            } else {
                fVar.f342832q.m69582x5f152dab(true);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2145xb118bc57.C17795xc0e4d885 c17795xc0e4d885 = fVar.f342832q;
                c17795xc0e4d885.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showDragView", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
                if (c17795xc0e4d885.f245098m.getVisibility() != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDragViewContainer", "showDragView");
                    c17795xc0e4d885.d();
                    c17795xc0e4d885.f245098m.setVisibility(0);
                    android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c17795xc0e4d885.f245098m, "alpha", 0.0f, 1.0f);
                    ofFloat.setDuration(300L);
                    ofFloat.start();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showDragView", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMessage", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$2");
    }
}
