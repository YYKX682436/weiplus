package bb2;

/* loaded from: classes10.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView f18977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView megaVideoBulletView, int i17) {
        super(0);
        this.f18977d = megaVideoBulletView;
        this.f18978e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView megaVideoBulletView = this.f18977d;
        if (megaVideoBulletView.getFeed().h2(megaVideoBulletView.getBulletManager().f19046k)) {
            megaVideoBulletView.getBulletManager().q(this.f18978e);
        }
        return jz5.f0.f302826a;
    }
}
