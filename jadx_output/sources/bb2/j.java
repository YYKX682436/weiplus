package bb2;

/* loaded from: classes10.dex */
public final class j implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn f18888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f18889e;

    public j(com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn finderBulletFastFollowBtn, yz5.a aVar) {
        this.f18888d = finderBulletFastFollowBtn;
        this.f18889e = aVar;
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("FinderBulletFastFollowBtn", "click animation ended, restore breath animation");
        this.f18888d.f102783e.i(this);
        this.f18889e.invoke();
    }
}
