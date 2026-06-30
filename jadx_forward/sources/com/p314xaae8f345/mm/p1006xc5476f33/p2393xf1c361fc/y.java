package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class y implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public su4.a f263257d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ThreadPoolExecutor f263258e = new java.util.concurrent.ThreadPoolExecutor(0, 10, 120, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.ArrayBlockingQueue(32));

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.x f263259f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0 f263260g;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0 a0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.r rVar) {
        this.f263260g = a0Var;
    }

    public void a(su4.r1 r1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.x xVar = this.f263259f;
        if (xVar != null) {
            xVar.f263246e = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.x xVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.x(this, null);
        this.f263259f = xVar2;
        xVar2.f263245d = r1Var;
        this.f263260g.f262961h = r1Var;
        this.f263258e.execute(this.f263259f);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return 0;
    }
}
