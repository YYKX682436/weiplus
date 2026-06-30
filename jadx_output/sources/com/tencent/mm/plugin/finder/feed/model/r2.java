package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.s2 f108286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f108287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader f108288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108289g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.tencent.mm.plugin.finder.feed.model.s2 s2Var, java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader finderLbsLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var) {
        super(1);
        this.f108286d = s2Var;
        this.f108287e = obj;
        this.f108288f = finderLbsLoader;
        this.f108289g = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mm.plugin.finder.feed.model.s2 s2Var = this.f108286d;
        java.lang.String tag = s2Var.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[call] pullType=");
        com.tencent.mm.plugin.finder.feed.model.o2 request = (com.tencent.mm.plugin.finder.feed.model.o2) this.f108287e;
        sb6.append(request.f108220a);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        eb2.b0 b0Var = s2Var.f108310e;
        kotlin.jvm.internal.o.d(b0Var);
        com.tencent.mm.plugin.finder.feed.model.p2 p2Var = new com.tencent.mm.plugin.finder.feed.model.p2(s2Var, this.f108288f, this.f108289g, task);
        int i17 = request.f108220a;
        com.tencent.mm.plugin.finder.feed.model.q2 q2Var = new com.tencent.mm.plugin.finder.feed.model.q2(s2Var, task);
        kotlin.jvm.internal.o.g(request, "request");
        eb2.w wVar = b0Var.f250717i;
        int i18 = wVar.f250857a;
        im5.c cVar = b0Var.f250718m;
        if (i18 == 1) {
            new db2.e1(i17 != 2 ? null : wVar.f250858b, new eb2.x(b0Var, p2Var, q2Var), i17, q2Var, b0Var.f250716h).l().f(cVar);
        } else {
            eb2.a0 a0Var = new eb2.a0(b0Var, i17, p2Var);
            if (i18 == 2) {
                new db2.w3(new eb2.z(b0Var, a0Var), i17, b0Var.f250715g, q2Var, wVar.f250859c, false, b0Var.f250716h).l().f(cVar);
            } else {
                eb2.b0.E0(b0Var, a0Var, b0Var.f250720o, i17, null, false, b0Var.f250721p, null, 64, null);
                b0Var.f250720o = false;
            }
        }
        return jz5.f0.f302826a;
    }
}
