package bb2;

/* loaded from: classes10.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView f18879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView) {
        super(0);
        this.f18879d = megaVideoBulletNativeView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView = this.f18879d;
        if (megaVideoBulletNativeView.isAttachedToWindow()) {
            bb2.w1.o(megaVideoBulletNativeView.getBulletManager(), 0L, false, false, 7, null);
        }
        return jz5.f0.f302826a;
    }
}
