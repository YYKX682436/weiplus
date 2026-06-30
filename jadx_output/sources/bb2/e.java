package bb2;

/* loaded from: classes10.dex */
public final class e implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn f18845d;

    public e(com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn finderBulletFastFollowBtn) {
        this.f18845d = finderBulletFastFollowBtn;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        com.tencent.mars.xlog.Log.i("FinderBulletFastFollowBtn", "footerEnableAlphaLayout layout changed, re-calculate position");
        java.lang.String str = com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn.C;
        com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn finderBulletFastFollowBtn = this.f18845d;
        if (finderBulletFastFollowBtn.getVisibility() == 0) {
            finderBulletFastFollowBtn.k();
        }
    }
}
