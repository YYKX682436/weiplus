package bb2;

/* loaded from: classes10.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView f19078d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView) {
        super(0);
        this.f19078d = megaVideoBulletNativeView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView = this.f19078d;
        if (megaVideoBulletNativeView.isAttachedToWindow() && megaVideoBulletNativeView.getFeed().h2(megaVideoBulletNativeView.getBulletManager().f19046k)) {
            megaVideoBulletNativeView.getBulletManager().j();
        }
        return jz5.f0.f302826a;
    }
}
