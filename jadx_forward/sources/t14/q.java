package t14;

/* loaded from: classes11.dex */
public final class q extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f496122d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.g0 f496123e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f496124f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f496122d = jz5.h.b(new t14.n(this, activity));
        jz5.h.b(t14.o.f496119d);
        this.f496123e = new t14.m(this);
        this.f496124f = jz5.h.b(new t14.p(this, activity));
    }

    public final java.lang.String T6() {
        return (java.lang.String) ((jz5.n) this.f496122d).mo141623x754a37bb();
    }

    public final java.util.Map U6(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        int m17 = c21560x1fce98fb.m();
        java.lang.String l17 = c21560x1fce98fb.l();
        jz5.l[] lVarArr = new jz5.l[9];
        lVarArr[0] = new jz5.l("page_name_kv", T6());
        lVarArr[1] = new jz5.l("view_name_kv", str);
        lVarArr[2] = new jz5.l("switch_button_type", java.lang.Integer.valueOf(m17));
        lVarArr[3] = new jz5.l("switch_status_current", l17);
        lVarArr[4] = new jz5.l("setting_sessionid", u24.n.b());
        android.content.Intent intent = m158354x19263085().getIntent();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef abstractActivityC17500x57a60aef = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef ? (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef) m158354x19263085 : null;
        lVarArr[5] = new jz5.l("setting_level", java.lang.Integer.valueOf(intent.getIntExtra("setting_level", abstractActivityC17500x57a60aef != null ? abstractActivityC17500x57a60aef.V6() : 0)));
        lVarArr[6] = new jz5.l("ui_version", java.lang.Integer.valueOf(m158354x19263085().getIntent().getIntExtra("ui_version", 1)));
        lVarArr[7] = new jz5.l("cell_source_type", 2);
        lVarArr[8] = new jz5.l("setting_from_source", java.lang.Integer.valueOf(m158354x19263085().getIntent().getIntExtra("setting_from_source", 2)));
        return kz5.c1.l(lVarArr);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        T6();
        cy1.a aVar = (cy1.a) rVar;
        if (aVar.Zi(m158354x19263085()) <= 0) {
            aVar.ak(m158354x19263085(), iy1.c.SettingsUIX);
        }
        if (aVar.aj(m158354x19263085()) == null) {
            aVar.dk(m158354x19263085(), T6());
        }
        aVar.ik(m158354x19263085(), (m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 ? 32 : 0) | 12, 33328);
        aVar.Ai(m158354x19263085(), new t14.k(this));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b abstractActivityC21555x39071a9b = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b) m158354x19263085 : null;
        if (abstractActivityC21555x39071a9b != null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = abstractActivityC21555x39071a9b.m79336x8b97809d();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = m79336x8b97809d instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d : null;
            if (h0Var != null) {
                h0Var.a(this.f496123e);
            }
        }
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new t14.l(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
    }
}
