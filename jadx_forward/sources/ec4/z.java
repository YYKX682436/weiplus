package ec4;

/* loaded from: classes10.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.d0 f332726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f332727e;

    public z(ec4.d0 d0Var, boolean z17) {
        this.f332726d = d0Var;
        this.f332727e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runExitAni$1$1$onAnimationEnd$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        ec4.d0 d0Var = this.f332726d;
        boolean z17 = d0Var.f332663p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_update_preview_video_del", this.f332727e);
            d0Var.m158354x19263085().setResult(-1, intent);
        }
        d0Var.m158354x19263085().finish();
        d0Var.m158354x19263085().overridePendingTransition(0, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runExitAni$1$1$onAnimationEnd$1");
    }
}
