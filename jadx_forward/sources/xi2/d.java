package xi2;

/* loaded from: classes10.dex */
public final class d implements xi2.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f536254a;

    /* renamed from: b, reason: collision with root package name */
    public final xi2.f f536255b;

    public d(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b battleStartView, xi2.f animateCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleStartView, "battleStartView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateCallback, "animateCallback");
        this.f536254a = battleStartView;
        this.f536255b = animateCallback;
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        battleStartView.o(ae2.in.f85221a.a(ym5.f6.M));
        p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(b17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new xi2.a(this, null), 2, null);
        battleStartView.a(new xi2.b(this));
    }

    @Override // xi2.g
    public android.view.View a() {
        return this.f536254a;
    }

    @Override // xi2.g
    public void b(p3325xe03a0797.p3326xc267989b.y0 scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.f536254a.setVisibility(0);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(scope, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new xi2.c(this, null), 2, null);
    }

    @Override // xi2.g
    /* renamed from: getVisibility */
    public int mo140755x61f71b08() {
        return this.f536254a.getVisibility();
    }

    @Override // xi2.g
    /* renamed from: reset */
    public void mo140756x6761d4f() {
        this.f536254a.n();
        mo140757x901b6914(8);
    }

    @Override // xi2.g
    /* renamed from: setVisibility */
    public void mo140757x901b6914(int i17) {
        this.f536254a.setVisibility(i17);
    }
}
