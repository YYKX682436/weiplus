package hq5;

/* loaded from: classes.dex */
public final class f extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f364759d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f364760e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f364761f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f364759d = jz5.h.b(new hq5.b(this));
        this.f364760e = jz5.h.b(new hq5.e(this));
        this.f364761f = jz5.h.b(new hq5.a(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eqp;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        abstractActivityC21394xb3d2c0cf.mo64405x4dab7448(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        abstractActivityC21394xb3d2c0cf.mo54450xbf7c1df6("");
        abstractActivityC21394xb3d2c0cf.mo78530x8b45058f();
        abstractActivityC21394xb3d2c0cf.mo54448x9c8c0d33(new hq5.c(abstractActivityC21394xb3d2c0cf));
        jz5.g gVar = this.f364760e;
        ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setText((java.lang.String) ((jz5.n) this.f364759d).mo141623x754a37bb());
        com.p314xaae8f345.mm.ui.bk.s0(((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).getPaint());
        ((android.view.View) ((jz5.n) this.f364761f).mo141623x754a37bb()).setOnClickListener(new hq5.d(abstractActivityC21394xb3d2c0cf));
    }
}
