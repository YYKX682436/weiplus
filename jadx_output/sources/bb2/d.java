package bb2;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn f18826d;

    public d(com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn finderBulletFastFollowBtn) {
        this.f18826d = finderBulletFastFollowBtn;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn finderBulletFastFollowBtn = this.f18826d;
        if (finderBulletFastFollowBtn.f102785g) {
            finderBulletFastFollowBtn.j();
            yz5.l onContinueClick = finderBulletFastFollowBtn.getOnContinueClick();
            if (onContinueClick != null) {
                onContinueClick.invoke(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - finderBulletFastFollowBtn.f102786h));
            }
            long j17 = com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn.f102781z;
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            com.tencent.mm.sdk.platformtools.u3.i(this, j17);
        }
    }
}
