package bb2;

/* loaded from: classes10.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView f18824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f18825e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView, float f17) {
        super(0);
        this.f18824d = megaVideoBulletNativeView;
        this.f18825e = f17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView = this.f18824d;
        if (megaVideoBulletNativeView.isAttachedToWindow() && megaVideoBulletNativeView.getFeed().h2(megaVideoBulletNativeView.getBulletManager().f19046k)) {
            megaVideoBulletNativeView.getBulletManager().c(this.f18825e, megaVideoBulletNativeView.getContext().getResources().getConfiguration().orientation == 2);
        }
        return jz5.f0.f302826a;
    }
}
