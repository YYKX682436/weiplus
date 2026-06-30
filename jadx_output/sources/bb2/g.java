package bb2;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn f18863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn finderBulletFastFollowBtn) {
        super(0);
        this.f18863d = finderBulletFastFollowBtn;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn finderBulletFastFollowBtn = this.f18863d;
        finderBulletFastFollowBtn.setVisibility(8);
        com.tencent.mm.view.MMPAGView mMPAGView = finderBulletFastFollowBtn.f102783e;
        if (mMPAGView.f()) {
            mMPAGView.n();
        }
        finderBulletFastFollowBtn.f102786h = 0L;
        finderBulletFastFollowBtn.f102785g = false;
        finderBulletFastFollowBtn.f102788m = false;
        finderBulletFastFollowBtn.f102791p = false;
        java.lang.Runnable runnable = finderBulletFastFollowBtn.f102790o;
        if (runnable != null) {
            finderBulletFastFollowBtn.removeCallbacks(runnable);
        }
        finderBulletFastFollowBtn.f102790o = null;
        pm0.v.C(finderBulletFastFollowBtn.f102800y);
        java.lang.Runnable runnable2 = finderBulletFastFollowBtn.f102787i;
        if (runnable2 != null) {
            finderBulletFastFollowBtn.removeCallbacks(runnable2);
        }
        finderBulletFastFollowBtn.f102787i = null;
        com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn.a(finderBulletFastFollowBtn);
        android.view.View view = finderBulletFastFollowBtn.f102792q;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(finderBulletFastFollowBtn.f102793r);
        }
        finderBulletFastFollowBtn.f102792q = null;
        com.tencent.mars.xlog.Log.i("FinderBulletFastFollowBtn", "removeFooterLayoutChangeListener");
        return jz5.f0.f302826a;
    }
}
