package bb2;

/* loaded from: classes10.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView f18960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f18961e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView megaVideoBulletView, float f17) {
        super(0);
        this.f18960d = megaVideoBulletView;
        this.f18961e = f17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView megaVideoBulletView = this.f18960d;
        if (megaVideoBulletView.getFeed().h2(megaVideoBulletView.getBulletManager().f19046k)) {
            megaVideoBulletView.getBulletManager().c(this.f18961e, megaVideoBulletView.getContext().getResources().getConfiguration().orientation == 2);
        }
        return jz5.f0.f302826a;
    }
}
