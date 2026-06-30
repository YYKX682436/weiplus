package sr2;

/* loaded from: classes2.dex */
public final class l5 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.lk2 f493157d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f493158e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f493159f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f493160g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f493161h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f493162i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Vector f493163m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f493162i = kz5.c0.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15063x2c6bbac6.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857.class);
        this.f493163m = new java.util.Vector();
    }

    public final void O6(int i17, int i18, java.lang.String str, r45.lk2 lk2Var) {
        boolean z17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "errType:" + i17 + " , errCode:" + i18);
        boolean z18 = false;
        this.f493158e = false;
        if (i17 == 0 && i18 == 0) {
            this.f493157d = lk2Var;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f493160g;
            if (u3Var2 != null && u3Var2.isShowing()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "loadingDialog is showing");
                yz5.a aVar = this.f493161h;
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
            }
            z17 = false;
        } else {
            db5.t7.m123882x26a183b(m158354x19263085(), com.p314xaae8f345.mm.R.C30867xcad56011.cnc, 0).show();
            z17 = true;
        }
        this.f493159f = z17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = this.f493160g;
        if (u3Var3 != null && u3Var3.isShowing()) {
            z18 = true;
        }
        if (z18 && (u3Var = this.f493160g) != null) {
            u3Var.dismiss();
        }
        java.util.Iterator it = this.f493163m.iterator();
        while (it.hasNext()) {
            ((yz5.q) it.next()).mo147xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), this.f493159f ? null : this.f493157d);
        }
    }

    public final void P6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "prepareResp null,isNetSceneFailed:" + this.f493159f + " , isNetScenePending:" + this.f493158e);
        if (this.f493159f) {
            db5.t7.m123882x26a183b(m158354x19263085(), com.p314xaae8f345.mm.R.C30867xcad56011.cnc, 0).show();
        } else if (this.f493158e) {
            this.f493160g = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(m158354x19263085(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 3, null);
        }
    }

    public final boolean Q6(yz5.a whenPreCheckReConnect, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(whenPreCheckReConnect, "whenPreCheckReConnect");
        this.f493161h = whenPreCheckReConnect;
        r45.lk2 lk2Var = this.f493157d;
        if (lk2Var == null) {
            P6();
            return false;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w5.f184185d.d(m158354x19263085(), lk2Var, new sr2.k5(this, aVar))) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "preCheck interrupt");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        gm0.j1.d().a(7289, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f493163m.clear();
        gm0.j1.d().q(7289, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.f493157d == null) {
            this.f493158e = true;
            if (this.f493162i.contains(m158354x19263085().getClass())) {
                return;
            }
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.yb.t2((c61.yb) c17, 8, null, 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = m1Var != null ? m1Var.mo47948x7f0c4558() : null;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = mo47948x7f0c4558 instanceof com.p314xaae8f345.mm.p944x882e457a.o ? (com.p314xaae8f345.mm.p944x882e457a.o) mo47948x7f0c4558 : null;
        java.lang.Object obj = oVar != null ? oVar.f152244b.f152233a : null;
        O6(i17, i18, str, obj instanceof r45.lk2 ? (r45.lk2) obj : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f493162i = kz5.c0.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15063x2c6bbac6.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857.class);
        this.f493163m = new java.util.Vector();
    }
}
