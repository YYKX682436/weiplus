package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class q3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.s3 f108267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f108268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f108269f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fc2.a f108270g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(com.tencent.mm.plugin.finder.feed.model.s3 s3Var, int i17, int i18, fc2.a aVar) {
        super(0);
        this.f108267d = s3Var;
        this.f108268e = i17;
        this.f108269f = i18;
        this.f108270g = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fc2.a ev6;
        fc2.d dVar;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.finder.feed.model.s3 s3Var = this.f108267d;
        yz5.p pVar = s3Var.f108316m;
        java.util.LinkedList linkedList = pVar != null ? (java.util.LinkedList) pVar.invoke(java.lang.Integer.valueOf(this.f108268e), java.lang.Integer.valueOf(this.f108269f)) : null;
        com.tencent.mars.xlog.Log.i(s3Var.f108313g, "getData duration:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        s3Var.J0().post(new com.tencent.mm.plugin.finder.feed.model.p3(linkedList, s3Var));
        java.util.Iterator it = s3Var.f108322s.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ev6 = this.f108270g;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.plugin.finder.feed.model.m mVar = (com.tencent.mm.plugin.finder.feed.model.m) ((com.tencent.mm.plugin.finder.feed.model.o9) ((java.util.Map.Entry) it.next()).getValue());
            mVar.getClass();
            kotlin.jvm.internal.o.g(ev6, "ev");
            if (ev6 instanceof fc2.t) {
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.l(mVar, ev6, linkedList));
            }
        }
        com.tencent.mm.plugin.finder.feed.q9 q9Var = s3Var.f108321r;
        if (q9Var != null && (dVar = q9Var.f108812j) != null) {
            dVar.G0(ev6);
        }
        return jz5.f0.f302826a;
    }
}
