package q74;

/* loaded from: classes4.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q74.z f442091d;

    public x(q74.z zVar) {
        this.f442091d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic$mTouchActionListener$1$onActionUp$1");
        q74.z zVar = this.f442091d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q74.z.a(zVar), "onActionUp, doSlideJump");
        q74.b0 b0Var = zVar.c().f441970g;
        if (b0Var != null) {
            b0Var.e();
        }
        zVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        q74.c0 c0Var = zVar.f442119b;
        w64.n nVar = c0Var.f441969f;
        if (nVar != null) {
            int i17 = ca4.m0.Y(zVar.f442121d) ? 1 : 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zVar.f442120c, "doSlideJump, nativeSightType=" + i17);
            s34.a1 a1Var = zVar.f442122e;
            nVar.p(new w64.c(a1Var != null ? a1Var.f76694x80bfd259 : null, zVar.f442121d, 0, null, false, i17, false, null, 220, null));
            nVar.k(c0Var.f441964a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic$mTouchActionListener$1$onActionUp$1");
    }
}
