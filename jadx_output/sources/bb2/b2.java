package bb2;

/* loaded from: classes10.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView f18811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f18812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f18813f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView, long j17, long j18) {
        super(0);
        this.f18811d = megaVideoBulletNativeView;
        this.f18812e = j17;
        this.f18813f = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView = this.f18811d;
        if (megaVideoBulletNativeView.isAttachedToWindow() && megaVideoBulletNativeView.getFeed().h2(megaVideoBulletNativeView.getBulletManager().f19046k)) {
            megaVideoBulletNativeView.getBulletManager().s(this.f18812e, this.f18813f);
        }
        return jz5.f0.f302826a;
    }
}
