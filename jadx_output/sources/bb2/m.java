package bb2;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn f18917d;

    public m(com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn finderBulletFastFollowBtn) {
        this.f18917d = finderBulletFastFollowBtn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn finderBulletFastFollowBtn = this.f18917d;
        finderBulletFastFollowBtn.f102788m = true;
        finderBulletFastFollowBtn.getClass();
        com.tencent.mars.xlog.Log.i("FinderBulletFastFollowBtn", "handleLongPressStart");
        finderBulletFastFollowBtn.f102785g = true;
        finderBulletFastFollowBtn.j();
        yz5.l lVar = finderBulletFastFollowBtn.onContinueClick;
        if (lVar != null) {
            lVar.invoke(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - finderBulletFastFollowBtn.f102786h));
        }
        pm0.v.U(com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn.f102781z, finderBulletFastFollowBtn.f102800y);
    }
}
