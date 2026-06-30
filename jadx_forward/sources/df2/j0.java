package df2;

/* loaded from: classes3.dex */
public final class j0 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f311973m;

    /* renamed from: n, reason: collision with root package name */
    public ne2.k f311974n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311973m = "Finder.ChargeLiveController";
    }

    public static final void b7(df2.j0 j0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10 f10Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = j0Var.f372632e;
        if (ubVar != null && (f10Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10) ubVar.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10.class)) != null) {
            f10Var.Q0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar2 = j0Var.f372632e;
        if (ubVar2 != null && (ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) ubVar2.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class)) != null) {
            ag0Var.Q0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar3 = j0Var.f372632e;
        if (ubVar3 == null || (e30Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30) ubVar3.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30.class)) == null) {
            return;
        }
        e30Var.Q0();
    }

    public final synchronized void Z6(java.lang.String str) {
        um2.x5 m129745xca56ce03;
        java.lang.String str2 = this.f311973m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" checkReJoinLive:");
        r45.nh1 nh1Var = (r45.nh1) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.x4) m56788xbba4bfc0(mm2.x4.class)).A).mo144003x754a37bb();
        boolean z17 = false;
        jz5.f0 f0Var = null;
        sb6.append(nh1Var != null ? java.lang.Integer.valueOf(nh1Var.m75939xb282bd08(0)) : null);
        sb6.append(",pluginLayout:");
        sb6.append(this.f372632e);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        r45.nh1 nh1Var2 = (r45.nh1) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.x4) m56788xbba4bfc0(mm2.x4.class)).A).mo144003x754a37bb();
        if (nh1Var2 != null && nh1Var2.m75939xb282bd08(0) == 1) {
            z17 = true;
        }
        if (z17) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.x4) m56788xbba4bfc0(mm2.x4.class)).A).k(null);
            if (!((mm2.g0) m56788xbba4bfc0(mm2.g0.class)).T6()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f311973m, "checkReJoinLive ReJoinLive but live is purchase!");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
            fm2.c cVar = ubVar instanceof fm2.c ? (fm2.c) ubVar : null;
            if (cVar != null && (m129745xca56ce03 = cVar.m129745xca56ce03()) != null) {
                um2.m.f510406a.d(m129745xca56ce03);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f311973m, "checkReJoinLive but StartUIC is null!");
            }
        }
    }

    public final tn0.w0 a7() {
        return co0.b.f125242e2.c(((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311973m, "onLiveActivate!");
        ((mm2.g0) m56788xbba4bfc0(mm2.g0.class)).f410597h = new df2.c0(this);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        m124210x41012807();
        ((mm2.g0) m56788xbba4bfc0(mm2.g0.class)).f410597h = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311973m, "onLiveDeactivate!");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStartFromWindow */
    public void mo14864x95cdef51() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311973m, "onLiveStartFromWindow!");
        Z6("onLiveStartFromWindow");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.e0(this, null), 3, null);
    }

    /* renamed from: release */
    public final void m124210x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311973m, "release!");
        ne2.k kVar = this.f311974n;
        if (kVar != null) {
            ne2.e.a(kVar, kVar.f418067a, true, false, 4, null);
            kVar.f418070d = null;
        }
        this.f311974n = null;
    }

    @Override // if2.e
    /* renamed from: resume */
    public void mo57157xc84dc82d() {
        Z6("pluginLayoutResume");
    }
}
