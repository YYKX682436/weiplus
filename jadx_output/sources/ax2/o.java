package ax2;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView f15078d;

    public o(com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView livePkCritAnounceView) {
        this.f15078d = livePkCritAnounceView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.LinearLayout announceContentTxtViewRoot;
        android.widget.HorizontalScrollView announceContentScrollView;
        android.widget.HorizontalScrollView announceContentScrollView2;
        com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView livePkCritAnounceView = this.f15078d;
        announceContentTxtViewRoot = livePkCritAnounceView.getAnnounceContentTxtViewRoot();
        int width = announceContentTxtViewRoot.getWidth();
        android.animation.ObjectAnimator objectAnimator = livePkCritAnounceView.f131817q;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        announceContentScrollView = livePkCritAnounceView.getAnnounceContentScrollView();
        int[] iArr = new int[2];
        iArr[0] = 0;
        announceContentScrollView2 = livePkCritAnounceView.getAnnounceContentScrollView();
        int width2 = width - announceContentScrollView2.getWidth();
        iArr[1] = width2 >= 0 ? width2 : 0;
        livePkCritAnounceView.f131817q = android.animation.ObjectAnimator.ofInt(announceContentScrollView, "scrollX", iArr);
        android.animation.ObjectAnimator objectAnimator2 = livePkCritAnounceView.f131817q;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(5000L);
        }
        android.animation.ObjectAnimator objectAnimator3 = livePkCritAnounceView.f131817q;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
    }
}
