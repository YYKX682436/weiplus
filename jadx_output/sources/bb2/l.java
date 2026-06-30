package bb2;

/* loaded from: classes10.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn f18907d;

    public l(com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn finderBulletFastFollowBtn) {
        this.f18907d = finderBulletFastFollowBtn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("FinderBulletFastFollowBtn", "autoHide triggered");
        yz5.a onAutoHide = this.f18907d.getOnAutoHide();
        if (onAutoHide != null) {
            onAutoHide.invoke();
        }
    }
}
