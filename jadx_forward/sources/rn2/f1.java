package rn2;

/* loaded from: classes8.dex */
public final class f1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f479262d;

    /* renamed from: e, reason: collision with root package name */
    public rn2.f f479263e;

    /* renamed from: f, reason: collision with root package name */
    public rn2.g f479264f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f479265g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f479266h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f479262d = "FinderLiveLotteryCreateUIC";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.apq;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f479263e = new rn2.c1(m158354x19263085());
        android.view.View m80380x71e92c1d = m80380x71e92c1d();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        rn2.t2 t2Var = new rn2.t2(m80380x71e92c1d, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085, this.f479263e);
        this.f479264f = t2Var;
        rn2.f fVar = this.f479263e;
        if (fVar != null) {
            ((rn2.c1) fVar).mo56536x3b13c504(t2Var);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        rn2.f fVar = this.f479263e;
        if (fVar != null) {
            ((rn2.c1) fVar).mo979x3f5eee52();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f479265g;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        android.view.View decorView;
        android.view.Window window = m158354x19263085().getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new rn2.e1(this));
    }
}
