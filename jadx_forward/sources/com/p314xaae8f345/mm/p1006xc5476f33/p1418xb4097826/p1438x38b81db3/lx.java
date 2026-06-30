package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class lx {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa f185486a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f185487b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f185488c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f185489d;

    public lx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa dataList, yz5.a dispatcher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        this.f185486a = dataList;
        this.f185487b = dispatcher;
        this.f185488c = "ProgressUpdateOperator";
        this.f185489d = new java.util.LinkedHashSet();
    }

    public final void a(p3325xe03a0797.p3326xc267989b.y0 lifeCycleScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifeCycleScope, "lifeCycleScope");
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.s0().r()).booleanValue()) {
            p3325xe03a0797.p3326xc267989b.l.d(lifeCycleScope, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kx(this, null), 3, null);
        }
    }

    public final void b(java.lang.String from) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.s0().r()).booleanValue()) {
            java.util.Set set = this.f185489d;
            java.util.Set X0 = kz5.n0.X0(set);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f185488c, "updatePlayProgressChange from:" + from + " idList:" + X0);
            if (X0.isEmpty()) {
                return;
            }
            int i17 = 0;
            for (java.lang.Object obj : this.f185486a) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.j5 j5Var = (so2.j5) obj;
                if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    long m76784x5db1b11 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().getFeedObject().m76784x5db1b11();
                    if (X0.contains(java.lang.Long.valueOf(m76784x5db1b11))) {
                        jz5.x.a(m76784x5db1b11);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.j0) this.f185487b.mo152xb9724478()).c(i17, 1, 2002);
                    }
                }
                i17 = i18;
            }
            set.removeAll(X0);
        }
    }
}
