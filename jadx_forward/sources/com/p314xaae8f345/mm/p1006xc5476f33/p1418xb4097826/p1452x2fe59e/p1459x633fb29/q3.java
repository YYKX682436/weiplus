package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class q3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3 f189800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f189801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f189802f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fc2.a f189803g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3 s3Var, int i17, int i18, fc2.a aVar) {
        super(0);
        this.f189800d = s3Var;
        this.f189801e = i17;
        this.f189802f = i18;
        this.f189803g = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fc2.a ev6;
        fc2.d dVar;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3 s3Var = this.f189800d;
        yz5.p pVar = s3Var.f189849m;
        java.util.LinkedList linkedList = pVar != null ? (java.util.LinkedList) pVar.mo149xb9724478(java.lang.Integer.valueOf(this.f189801e), java.lang.Integer.valueOf(this.f189802f)) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s3Var.f189846g, "getData duration:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        s3Var.J0().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p3(linkedList, s3Var));
        java.util.Iterator it = s3Var.f189855s.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ev6 = this.f189803g;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m mVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o9) ((java.util.Map.Entry) it.next()).getValue());
            mVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
            if (ev6 instanceof fc2.t) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l(mVar, ev6, linkedList));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9 q9Var = s3Var.f189854r;
        if (q9Var != null && (dVar = q9Var.f190345j) != null) {
            dVar.G0(ev6);
        }
        return jz5.f0.f384359a;
    }
}
