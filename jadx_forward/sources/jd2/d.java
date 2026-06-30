package jd2;

/* loaded from: classes10.dex */
public final class d implements xi2.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f380677a;

    /* renamed from: b, reason: collision with root package name */
    public final xi2.f f380678b;

    public d(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b battleStartView, xi2.f animateCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleStartView, "battleStartView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateCallback, "animateCallback");
        this.f380677a = battleStartView;
        this.f380678b = animateCallback;
        battleStartView.a(new jd2.a(this));
    }

    @Override // xi2.g
    public android.view.View a() {
        return this.f380677a;
    }

    @Override // xi2.g
    public void b(p3325xe03a0797.p3326xc267989b.y0 scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(scope, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new jd2.c(this, null), 2, null);
    }

    @Override // xi2.g
    /* renamed from: getVisibility */
    public int mo140755x61f71b08() {
        return this.f380677a.getVisibility();
    }

    @Override // xi2.g
    /* renamed from: reset */
    public void mo140756x6761d4f() {
        this.f380677a.n();
        mo140757x901b6914(8);
    }

    @Override // xi2.g
    /* renamed from: setVisibility */
    public void mo140757x901b6914(int i17) {
        this.f380677a.setVisibility(i17);
    }
}
