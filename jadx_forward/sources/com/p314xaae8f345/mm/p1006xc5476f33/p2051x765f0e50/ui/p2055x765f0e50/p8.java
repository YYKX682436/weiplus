package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class p8 extends wm3.a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f242960d;

    /* renamed from: e, reason: collision with root package name */
    public long f242961e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f242962f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void T6() {
        boolean z17 = this.f242962f;
        if (z17) {
            this.f242961e |= 18014398509481984L;
        } else {
            this.f242961e &= -18014398509481985L;
        }
        int i17 = z17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 72;
        p53Var.f464295e = i17;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).e(new xg3.p0(23, p53Var));
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(this.f242961e));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsCareModeCloseUIC", "switch ext change : open = " + this.f242962f + " item value = " + p53Var.f464295e + " functionId = " + p53Var.f464294d + " extStatus = " + this.f242961e);
        android.app.Activity m80379x76847179 = m80379x76847179();
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
        e4Var.f293309c = m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572090bs0);
        e4Var.f293313g = 2;
        this.f242960d = e4Var.c();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        p3325xe03a0797.p3326xc267989b.y0 b17 = v65.m.b(m158354x19263085());
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(b17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.m8(this, null), 2, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        super.mo2277xb2f1ab1a(bundle);
        this.f242962f = j65.e.b();
        this.f242961e = c01.z1.j();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Integer num;
        if (this.f242960d == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd: errType = ");
        sb6.append(i17);
        sb6.append(" errCode = ");
        sb6.append(i18);
        sb6.append(" errMsg = ");
        sb6.append(str);
        sb6.append(' ');
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsCareModeCloseUIC", sb6.toString());
        if (m1Var == null || m1Var.mo808xfb85f7b0() != 681) {
            return;
        }
        e21.j jVar = (e21.j) m1Var;
        java.util.List list = jVar.f328071f;
        e21.i iVar = jVar.f328070e.f328054b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(iVar, "null cannot be cast to non-null type com.tencent.mm.modeloplog.NetSceneOplog.Resp");
        r45.i25 i25Var = iVar.f328061a;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        int size = arrayList.size();
        for (int i19 = 0; i19 < size; i19++) {
            int b17 = ((xg3.q0) arrayList.get(i19)).b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsCareModeCloseUIC", "onSceneEnd oplogsList cmdId:%s", java.lang.Integer.valueOf(b17));
            if (b17 == 23) {
                r45.j25 j25Var = i25Var.f458221e;
                if (j25Var == null || (num = (java.lang.Integer) j25Var.f459051e.get(i19)) == null || num.intValue() != 0) {
                    ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.n8(this, -1));
                    return;
                } else {
                    ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.n8(this, 0));
                    return;
                }
            }
        }
    }
}
