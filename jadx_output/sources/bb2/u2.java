package bb2;

/* loaded from: classes10.dex */
public final class u2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView f19017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView megaVideoBulletView) {
        super(0);
        this.f19017d = megaVideoBulletView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView megaVideoBulletView = this.f19017d;
        if (megaVideoBulletView.getFeed().h2(megaVideoBulletView.getBulletManager().f19046k)) {
            megaVideoBulletView.getBulletManager().t();
            pm0.v.V(200L, new bb2.t2(megaVideoBulletView));
        }
        return jz5.f0.f302826a;
    }
}
