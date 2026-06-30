package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class qa extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f195513p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f195514q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s5 f195515r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x031c, code lost:
    
        if (r1 == null) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qa(android.view.ViewGroup r26, qo0.c r27) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qa.<init>(android.view.ViewGroup, qo0.c):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        t1().getClass();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 5) {
            if (ordinal != 197) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 t17 = t1();
            t17.getClass();
            t17.f198479q = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d6.f198567d;
            t17.S6();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 t18 = t1();
        t18.a7();
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.u1 u1Var = ml2.u1.U;
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        ml2.s1 s1Var = ml2.s1.f409448e;
        zy2.zb.I8(zbVar, u1Var, j0Var.bj(s1Var), null, null, null, null, false, 124, null);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        zy2.zb.I8((zy2.zb) c18, ml2.u1.f409573e, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(s1Var), null, null, null, null, false, 124, null);
        qm2.k kVar = (qm2.k) ((jz5.n) t18.f198484v).mo141623x754a37bb();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = kVar.f446267f;
        if (atomicBoolean.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderStartLiveNetSpeedTestUIC", "Network speed test is already running");
            return;
        }
        atomicBoolean.set(true);
        kVar.f446265d = new qm2.f(0, 0, 0.0f, 0.0f, false, false, 0, 127, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLiveNetSpeedTestUIC", "Preparing speed test");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = kVar.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m158354x19263085 : null;
        if (abstractActivityC15087xee12defa != null) {
            pq5.g l17 = new ek2.f3(1, 1, 524288, 1024, 6).l();
            l17.K(new qm2.g(kVar));
            l17.f(abstractActivityC15087xee12defa);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 t1() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8) this.f195514q.mo141623x754a37bb();
    }

    @Override // qo0.a
    public void y0(boolean z17, int i17) {
        pk2.j9 j9Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5 e5Var;
        pk2.o9 o9Var = this.f195515r.f198927d;
        if (o9Var == null || (j9Var = o9Var.f437617g) == null || (e5Var = j9Var.f437419b) == null) {
            return;
        }
        e5Var.a(i17, z17);
    }
}
