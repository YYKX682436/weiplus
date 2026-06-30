package dv2;

/* loaded from: classes2.dex */
public final class v extends zx2.h {

    /* renamed from: w, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f325492w;

    /* renamed from: x, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f325493x;

    /* renamed from: y, reason: collision with root package name */
    public final dv2.k f325494y;

    /* renamed from: z, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f325495z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f325492w = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(dv2.i.f325398e);
        this.f325493x = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(java.lang.Boolean.FALSE);
        this.f325494y = new dv2.k(this);
        this.f325495z = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(x7());
    }

    public static final void w7(dv2.v vVar) {
        dv2.n x76 = vVar.x7();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.h3 h3Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) vVar.f325495z;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h3Var.mo144003x754a37bb(), x76)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FollowAggregationTabUIC", "uiState: " + h3Var.mo144003x754a37bb() + " -> " + x76);
        h3Var.k(x76);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57 W6() {
        return new dv2.j(this);
    }

    @Override // zx2.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = m158354x19263085().mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f215192h;
        this.f215189e = false;
        if (c1190x18d3c3fe != null) {
            c1190x18d3c3fe.m8289xa5a25773(new dv2.o(this));
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00 h00Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00.class);
        if (h00Var != null) {
            h00Var.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.oz.f217024e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh bhVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215410a;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215417h;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.l.p(new p3325xe03a0797.p3326xc267989b.p3328x30012e.y1(f3Var, new dv2.p(this, null)), v65.m.b(m158354x19263085()));
        p3325xe03a0797.p3326xc267989b.p3328x30012e.l.p(new p3325xe03a0797.p3326xc267989b.p3328x30012e.y1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215411b, new dv2.q(this, null)), v65.m.b(m158354x19263085()));
        p3325xe03a0797.p3326xc267989b.p3328x30012e.l.p(new p3325xe03a0797.p3326xc267989b.p3328x30012e.y1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215413d, new dv2.r(this, null)), v65.m.b(m158354x19263085()));
        p3325xe03a0797.p3326xc267989b.p3328x30012e.l.p(new p3325xe03a0797.p3326xc267989b.p3328x30012e.y1(f3Var, new dv2.s(this, null)), v65.m.b(m158354x19263085()));
        p3325xe03a0797.p3326xc267989b.p3328x30012e.l.p(new p3325xe03a0797.p3326xc267989b.p3328x30012e.y1(p3325xe03a0797.p3326xc267989b.p3328x30012e.l.i(new p3325xe03a0797.p3326xc267989b.p3328x30012e.c2(new p3325xe03a0797.p3326xc267989b.p3328x30012e.j[]{f3Var, this.f325493x, this.f325492w}, new dv2.t(null))), new dv2.u(this, new p3321xbce91901.jvm.p3324x21ffc6bd.h0(), null)), v65.m.b(m158354x19263085()));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f325493x).k(java.lang.Boolean.FALSE);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f325493x).k(java.lang.Boolean.TRUE);
    }

    public final dv2.n x7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh bhVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215410a;
        boolean booleanValue = ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215417h).mo144003x754a37bb()).booleanValue();
        int intValue = ((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215411b).mo144003x754a37bb()).intValue();
        int size = ((java.util.List) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215413d).mo144003x754a37bb()).size();
        boolean m60126x74219ae7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7();
        java.lang.String string = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8z, java.lang.Integer.valueOf(intValue));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return new dv2.n(booleanValue, string, m60126x74219ae7 ? m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f6s) : intValue > 0 ? m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p3p, java.lang.Integer.valueOf(intValue)) : null, size > 0 ? m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575336p50, java.lang.Integer.valueOf(size)) : null);
    }
}
