package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class z2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.a3 f108502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f108503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108504f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.tencent.mm.plugin.finder.feed.model.a3 a3Var, java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var) {
        super(1);
        this.f108502d = a3Var;
        this.f108503e = obj;
        this.f108504f = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        eb2.m0 m0Var = this.f108502d.f107698d;
        com.tencent.mm.plugin.finder.feed.model.y2 y2Var = new com.tencent.mm.plugin.finder.feed.model.y2(this.f108504f, task);
        com.tencent.mm.plugin.finder.feed.model.w2 w2Var = (com.tencent.mm.plugin.finder.feed.model.w2) this.f108503e;
        eb2.m0.E0(m0Var, y2Var, w2Var.f108430b, null, w2Var.f108429a, false, false, null, null, null, null, 944, null);
        return jz5.f0.f302826a;
    }
}
