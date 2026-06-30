package bb2;

/* loaded from: classes10.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView f18947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18949f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView megaVideoBulletView, int i17, int i18) {
        super(0);
        this.f18947d = megaVideoBulletView;
        this.f18948e = i17;
        this.f18949f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView megaVideoBulletView = this.f18947d;
        if (megaVideoBulletView.getFeed().h2(megaVideoBulletView.getBulletManager().f19046k)) {
            megaVideoBulletView.getBulletManager().s(this.f18948e * 1000, this.f18949f * 1000);
        }
        return jz5.f0.f302826a;
    }
}
