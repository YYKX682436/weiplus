package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class hn implements fs2.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f188465d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.qt2 f188466e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn f188467f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f188468g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f188469h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f188470i;

    /* renamed from: m, reason: collision with root package name */
    public long f188471m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f188472n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f188473o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f188474p;

    public hn(java.lang.String username, r45.qt2 currentReportObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentReportObj, "currentReportObj");
        this.f188465d = username;
        this.f188466e = currentReportObj;
        this.f188469h = new java.util.ArrayList();
        this.f188470i = new java.util.ArrayList();
        this.f188471m = android.os.SystemClock.uptimeMillis();
        this.f188472n = true;
        this.f188473o = true;
    }

    public static final so2.k4 c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn hnVar, int i17, int i18) {
        hnVar.getClass();
        so2.k4 k4Var = new so2.k4(new r45.bw0(), 1, i17);
        k4Var.f491989f = i18;
        return k4Var;
    }

    public static final java.util.ArrayList f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn hnVar, java.util.LinkedList linkedList, int i17) {
        hnVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(new so2.k4((r45.bw0) it.next(), 2, i17));
            }
        }
        return arrayList;
    }

    public final void g(boolean z17, int i17) {
        this.f188471m = android.os.SystemClock.uptimeMillis();
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f188468g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bn bnVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bn(this, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.cn cnVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.cn(this);
        java.lang.String friendUsername = this.f188465d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(friendUsername, "friendUsername");
        bq.g1 g1Var = new bq.g1(friendUsername, gVar, i17, this.f188466e);
        pm0.v.T(g1Var.l(), new cq.d1(bnVar, g1Var, cnVar));
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        this.f188474p = false;
        this.f188470i.clear();
        this.f188469h.clear();
    }
}
