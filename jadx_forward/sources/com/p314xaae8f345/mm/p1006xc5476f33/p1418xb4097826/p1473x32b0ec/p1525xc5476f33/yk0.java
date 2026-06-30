package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public abstract class yk0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public te2.kc f196741p;

    /* renamed from: q, reason: collision with root package name */
    public te2.lc f196742q;

    /* renamed from: r, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.k0 f196743r;

    /* renamed from: s, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.k0 f196744s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk0(android.view.ViewGroup rootContainer, qo0.c statusMonitor) {
        super(rootContainer, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootContainer, "rootContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
    }

    @Override // qo0.a
    public boolean B0() {
        if (this.f446856d.getVisibility() != 0) {
            return false;
        }
        te2.lc lcVar = this.f196742q;
        if (lcVar == null) {
            return true;
        }
        lcVar.k();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 96) {
            x1();
        } else {
            if (ordinal != 97) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v1(), "hideMusicView - Hiding music view");
            K0(8);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v1(), "unMount - detaching presenter");
        p012xc85e97e9.p093xedfae76a.k0 k0Var = this.f196743r;
        if (k0Var != null) {
            ((mm2.m6) S0().a(mm2.m6.class)).f410777i.mo522xb5bdeb7a(k0Var);
        }
        this.f196743r = null;
        p012xc85e97e9.p093xedfae76a.k0 k0Var2 = this.f196744s;
        if (k0Var2 != null) {
            ((mm2.s2) S0().a(mm2.s2.class)).f410940i.mo522xb5bdeb7a(k0Var2);
        }
        this.f196744s = null;
        te2.kc kcVar = this.f196741p;
        if (kcVar != null) {
            kcVar.mo979x3f5eee52();
        }
        this.f196741p = null;
        this.f196742q = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public abstract te2.kc t1();

    public abstract te2.lc u1(android.view.View view);

    public abstract java.lang.String v1();

    public abstract boolean w1();

    public void x1() {
        if (!w1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v1(), "showMusicView - Plugin not available, skip");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v1(), "showMusicView - Showing music view");
        K0(0);
        te2.kc kcVar = this.f196741p;
        if (kcVar != null) {
            ((te2.jc) kcVar).m();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v1(), "mount - start");
        this.f196741p = t1();
        te2.lc u17 = u1(this.f446856d);
        this.f196742q = u17;
        te2.kc kcVar = this.f196741p;
        if (kcVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
            kcVar.mo56536x3b13c504(u17);
        }
        p012xc85e97e9.p093xedfae76a.k0 k0Var = this.f196743r;
        if (k0Var != null) {
            ((mm2.m6) S0().a(mm2.m6.class)).f410777i.mo522xb5bdeb7a(k0Var);
        }
        p012xc85e97e9.p093xedfae76a.k0 k0Var2 = this.f196744s;
        if (k0Var2 != null) {
            ((mm2.s2) S0().a(mm2.s2.class)).f410940i.mo522xb5bdeb7a(k0Var2);
        }
        this.f196743r = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wk0(this);
        this.f196744s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xk0(this);
        p012xc85e97e9.p093xedfae76a.j0 j0Var = ((mm2.m6) S0().a(mm2.m6.class)).f410777i;
        p012xc85e97e9.p093xedfae76a.k0 k0Var3 = this.f196743r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var3);
        j0Var.mo7806x9d92d11c(this, k0Var3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = ((mm2.s2) S0().a(mm2.s2.class)).f410940i;
        p012xc85e97e9.p093xedfae76a.k0 k0Var4 = this.f196744s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var4);
        c14227x4262fb44.mo7806x9d92d11c(this, k0Var4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v1(), "mount - complete");
    }
}
