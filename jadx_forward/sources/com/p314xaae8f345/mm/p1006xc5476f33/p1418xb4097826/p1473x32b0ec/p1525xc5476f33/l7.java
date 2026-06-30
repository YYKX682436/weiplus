package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class l7 implements zh2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 f194888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f194889b;

    public l7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var, android.view.ViewGroup viewGroup) {
        this.f194888a = x7Var;
        this.f194889b = viewGroup;
    }

    @Override // zh2.c
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l a() {
        return this.f194888a;
    }

    @Override // zh2.c
    public void b(dk2.m battleData, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleData, "battleData");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7.t1(this.f194888a, battleData, lVar);
    }

    @Override // zh2.c
    public boolean c() {
        return this.f194888a.A;
    }

    @Override // zh2.c
    public void d() {
        android.view.ViewGroup viewGroup = this.f194889b;
        viewGroup.setBackground(viewGroup.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560852w5));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f194888a.f196573t;
        c22613xe7040d9c.animate().translationY(0.0f);
        c22613xe7040d9c.f();
    }

    @Override // zh2.c
    public void e(int i17) {
        nj2.w wVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = this.f194888a;
        if (!((mm2.e1) x7Var.P0(mm2.e1.class)).g7()) {
            long j17 = i17;
            java.util.Iterator it = x7Var.M.f103340d.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k2) it.next()).h(j17);
            }
            return;
        }
        nj2.z B1 = x7Var.B1();
        if (B1 == null || (wVar = B1.f419411u) == null) {
            return;
        }
        long j18 = i17;
        nj2.z zVar = wVar.f419397a;
        if (zVar.q()) {
            zVar.y().p(j18);
        }
    }

    @Override // zh2.c
    public qo0.c f() {
        return this.f194888a.f196569p;
    }

    @Override // zh2.c
    public gk2.e g() {
        return this.f194888a.S0();
    }

    @Override // zh2.c
    /* renamed from: getController */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 mo57008x143f1b92(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        return this.f194888a.U0(modelClass);
    }

    @Override // zh2.c
    public tn0.w0 h() {
        return this.f194888a.Z0();
    }

    @Override // zh2.c
    public void i() {
        this.f194889b.setBackground(null);
        this.f194888a.D1();
    }

    @Override // zh2.c
    public com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 j() {
        android.view.View findViewById = this.f194889b.getRootView().findViewById(com.p314xaae8f345.mm.R.id.icy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1) findViewById;
    }

    @Override // zh2.c
    public dk2.xf k() {
        return this.f194888a.W0();
    }
}
