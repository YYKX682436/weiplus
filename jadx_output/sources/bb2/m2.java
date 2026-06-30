package bb2;

/* loaded from: classes10.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView f18920d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView) {
        super(0);
        this.f18920d = megaVideoBulletNativeView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn fastFollowBtn;
        com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView = this.f18920d;
        fastFollowBtn = megaVideoBulletNativeView.getFastFollowBtn();
        fastFollowBtn.e();
        megaVideoBulletNativeView.g();
        cq.k1.a();
        long intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127928s6).getValue()).r()).intValue();
        com.tencent.mars.xlog.Log.i("MegaVideoBulletNativeView", "scheduleRowExtendAutoHide: will hide row extend after " + intValue + "ms");
        bb2.h2 h2Var = new bb2.h2(megaVideoBulletNativeView);
        megaVideoBulletNativeView.f102809q = h2Var;
        megaVideoBulletNativeView.postDelayed(h2Var, intValue);
        return jz5.f0.f302826a;
    }
}
