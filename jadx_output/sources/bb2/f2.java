package bb2;

/* loaded from: classes10.dex */
public final class f2 implements bb2.y2 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView f18862e;

    public f2(com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView) {
        this.f18862e = megaVideoBulletNativeView;
        cq.k1.a();
        this.f18861d = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.P().r()).booleanValue();
    }

    @Override // bb2.y2
    public void A(int i17, boolean z17) {
        pm0.v.X(new bb2.e2(this.f18862e, i17, z17));
    }

    @Override // cw2.fb
    public void D(r45.mb4 mb4Var, long j17) {
    }

    @Override // cw2.fb
    public void F(r45.mb4 mb4Var) {
        pm0.v.X(new bb2.d2(this.f18862e));
    }

    @Override // cw2.fb
    public void G(r45.mb4 mb4Var) {
    }

    @Override // cw2.fb
    public void J(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
    }

    @Override // cw2.fb
    public void b(float f17) {
        pm0.v.X(new bb2.c2(this.f18862e, f17));
    }

    @Override // cw2.fb
    public void d(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
    }

    @Override // cw2.fb
    public void e(r45.mb4 mb4Var, int i17, int i18, nk4.r rVar) {
        pm0.v.X(new bb2.a2(this.f18862e, i17, this, i18));
    }

    @Override // cw2.fb
    public void g(r45.mb4 mb4Var, nk4.t tVar) {
    }

    @Override // cw2.fb
    public void h(r45.mb4 mb4Var) {
        pm0.v.X(new bb2.z1(this.f18862e));
    }

    @Override // cw2.fb
    public void n(r45.mb4 mb4Var, nk4.a aVar) {
        pm0.v.X(new bb2.y1(this.f18862e));
    }

    @Override // cw2.fb
    public void s(cw2.wa waVar, nk4.a aVar) {
    }

    @Override // cw2.fb
    public void u(r45.mb4 mb4Var, long j17, kz2.a aVar) {
        com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView = this.f18862e;
        bb2.w1 bulletManager = megaVideoBulletNativeView.getBulletManager();
        if (bulletManager.m()) {
            bulletManager.f19050o = true;
            bulletManager.u();
        }
        yz5.a onAfterPlaySeekListener = megaVideoBulletNativeView.getOnAfterPlaySeekListener();
        if (onAfterPlaySeekListener != null) {
            onAfterPlaySeekListener.invoke();
        }
        com.tencent.mars.xlog.Log.i("MegaVideoBulletNativeView", "onAfterPlaySeekListener invoke");
    }

    @Override // cw2.fb
    public void v(r45.mb4 mb4Var, long j17, long j18) {
        if (this.f18861d) {
            pm0.v.X(new bb2.b2(this.f18862e, j17, j18));
        }
    }

    @Override // cw2.fb
    public void x(r45.mb4 mb4Var, cw2.wa waVar, int i17, nk4.e eVar) {
    }
}
