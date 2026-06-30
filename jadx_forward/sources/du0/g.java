package du0;

/* loaded from: classes5.dex */
public abstract class g extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f324880d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f324881e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f324882f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f324883g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f324884h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f324881e = jz5.h.b(new du0.c(this));
        this.f324882f = jz5.h.b(new du0.f(this));
        jz5.h.b(new du0.e(this));
        this.f324883g = jz5.h.b(new du0.d(this));
        this.f324884h = jz5.h.b(new du0.b(this));
    }

    public final java.lang.Object O6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new du0.a(null), interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : jz5.f0.f384359a;
    }

    public final du0.i0 P6() {
        return (du0.i0) ((jz5.n) this.f324884h).mo141623x754a37bb();
    }

    public final du0.t0 Q6() {
        return (du0.t0) ((jz5.n) this.f324881e).mo141623x754a37bb();
    }

    public final du0.v0 R6() {
        return (du0.v0) ((jz5.n) this.f324883g).mo141623x754a37bb();
    }

    public final du0.t1 S6() {
        return (du0.t1) ((jz5.n) this.f324882f).mo141623x754a37bb();
    }

    public final p012xc85e97e9.p093xedfae76a.c1 T6(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(modelClass);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return a17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        android.view.View findViewById = contentView.findViewById(com.p314xaae8f345.mm.R.id.q8n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f324880d = (android.widget.FrameLayout) findViewById;
        super.mo47092x594b1124(contentView);
    }
}
