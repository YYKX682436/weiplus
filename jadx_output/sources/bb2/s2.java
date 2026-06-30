package bb2;

/* loaded from: classes10.dex */
public final class s2 implements bb2.y2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView f18995d;

    public s2(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView megaVideoBulletView) {
        this.f18995d = megaVideoBulletView;
    }

    @Override // bb2.y2
    public void A(int i17, boolean z17) {
        pm0.v.X(new bb2.r2(this.f18995d, i17));
    }

    @Override // cw2.fb
    public void D(r45.mb4 mb4Var, long j17) {
    }

    @Override // cw2.fb
    public void F(r45.mb4 mb4Var) {
        this.f18995d.c();
    }

    @Override // cw2.fb
    public void G(r45.mb4 mb4Var) {
    }

    @Override // cw2.fb
    public void J(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
    }

    @Override // cw2.fb
    public void b(float f17) {
        pm0.v.X(new bb2.q2(this.f18995d, f17));
    }

    @Override // cw2.fb
    public void d(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
    }

    @Override // cw2.fb
    public void e(r45.mb4 mb4Var, int i17, int i18, nk4.r rVar) {
        pm0.v.X(new bb2.p2(this.f18995d, i17, i18));
    }

    @Override // cw2.fb
    public void g(r45.mb4 mb4Var, nk4.t tVar) {
    }

    @Override // cw2.fb
    public void h(r45.mb4 mb4Var) {
        pm0.v.X(new bb2.o2(this.f18995d));
    }

    @Override // cw2.fb
    public void n(r45.mb4 mb4Var, nk4.a aVar) {
        pm0.v.X(new bb2.n2(this.f18995d));
    }

    @Override // cw2.fb
    public void s(cw2.wa waVar, nk4.a aVar) {
    }

    @Override // cw2.fb
    public void u(r45.mb4 mb4Var, long j17, kz2.a aVar) {
        com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView megaVideoBulletView = this.f18995d;
        bb2.w1 bulletManager = megaVideoBulletView.getBulletManager();
        if (bulletManager.m()) {
            bulletManager.f19050o = true;
            bulletManager.u();
        }
        yz5.a onAfterPlaySeekListener = megaVideoBulletView.getOnAfterPlaySeekListener();
        if (onAfterPlaySeekListener != null) {
            onAfterPlaySeekListener.invoke();
        }
        com.tencent.mars.xlog.Log.i("MegaVideoBulletView", "onAfterPlaySeekListener invoke");
    }

    @Override // cw2.fb
    public void v(r45.mb4 mb4Var, long j17, long j18) {
    }

    @Override // cw2.fb
    public void x(r45.mb4 mb4Var, cw2.wa waVar, int i17, nk4.e eVar) {
    }
}
