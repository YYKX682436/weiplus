package c23;

/* loaded from: classes.dex */
public final class m extends wm3.a implements c23.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f119576d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f119577e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f119578f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f119579g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f119580h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f119581i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f119576d = jz5.h.b(new c23.k(activity, this));
        this.f119577e = jz5.h.b(new c23.d(activity));
        this.f119578f = jz5.h.b(new c23.i(activity));
        this.f119579g = jz5.h.b(new c23.c(activity, this));
        this.f119580h = jz5.h.b(new c23.j(this));
        this.f119581i = jz5.h.b(new c23.l(activity));
    }

    public d23.g T6() {
        return (d23.g) ((jz5.n) this.f119579g).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 U6() {
        return (com.p314xaae8f345.mm.ui.p2740x696c9db.f5) ((jz5.n) this.f119577e).mo141623x754a37bb();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d V6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d) ((jz5.n) this.f119576d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.h()) {
            ((android.widget.FrameLayout) ((jz5.n) this.f119581i).mo141623x754a37bb()).setVisibility(8);
            return;
        }
        T6().u("onCreate", "");
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.m3(m158354x19263085(), new c23.f(this));
        }
        su4.k2.a(103, java.lang.String.valueOf(o13.p.f423784d), java.lang.String.valueOf(o13.p.f423783c), false, "", 0, "", false, "");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        U6().f291933e = new c23.g(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.h()) {
            ((d23.j) ((jz5.n) this.f119580h).mo141623x754a37bb()).e();
            V6().mo120173x7af55728("ftsJSApi");
            V6().mo52095x5cd39ffa();
        }
        U6().d();
        U6().f291933e = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        if (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.h()) {
            T6().u("onPause", "");
        }
        U6().d();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.h()) {
            T6().u("onResume", "");
        }
        m80380x71e92c1d().post(new c23.h(this));
    }
}
