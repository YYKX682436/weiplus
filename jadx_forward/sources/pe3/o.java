package pe3;

/* loaded from: classes7.dex */
public final class o extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377 f435201d;

    /* renamed from: e, reason: collision with root package name */
    public final se3.e f435202e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f435203f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = p012xc85e97e9.p093xedfae76a.k1.a(activity, null).a(se3.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f435202e = (se3.e) a17;
    }

    public final void O6() {
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f435203f;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        this.f435203f = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377 c16462x4c72b377 = this.f435201d;
        if (c16462x4c72b377 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameSetView");
            throw null;
        }
        c16462x4c72b377.setVisibility(4);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pe3.f fVar = (pe3.f) pf5.z.f435481a.a(activity).a(pe3.f.class);
        hq0.e0 e0Var = fVar.f435185d;
        if (e0Var != null) {
            java.lang.String str = e0Var.f364517e;
            oe3.c cVar = fVar.f435187f;
            cVar.F1(str);
            cVar.mo123041x5cd39ffa();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.gdx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f435201d = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377) findViewById;
        android.view.View findViewById2 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f565580cu0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((android.widget.FrameLayout) findViewById2).addView(((pe3.f) pf5.z.f435481a.a(activity).a(pe3.f.class)).f435188g, new android.view.ViewGroup.LayoutParams(-1, -1));
        m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f566874hd0).setOnClickListener(new pe3.j(this));
        m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.b5x).setOnClickListener(new pe3.k(this));
        m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.nja).setOnClickListener(new pe3.l(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        O6();
    }
}
