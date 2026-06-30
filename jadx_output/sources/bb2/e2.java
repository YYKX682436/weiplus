package bb2;

/* loaded from: classes10.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView f18850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f18852f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView, int i17, boolean z17) {
        super(0);
        this.f18850d = megaVideoBulletNativeView;
        this.f18851e = i17;
        this.f18852f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView = this.f18850d;
        if (megaVideoBulletNativeView.isAttachedToWindow()) {
            if (megaVideoBulletNativeView.getFeed().h2(megaVideoBulletNativeView.getBulletManager().f19046k)) {
                megaVideoBulletNativeView.getBulletManager().q(this.f18851e);
            }
            if (megaVideoBulletNativeView.h() && !this.f18852f) {
                megaVideoBulletNativeView.j();
                megaVideoBulletNativeView.getBulletManager().getClass();
                xp.d.f().f455862s = false;
            }
        }
        return jz5.f0.f302826a;
    }
}
