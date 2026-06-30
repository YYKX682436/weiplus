package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class z8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f108518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.a9 f108519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108520f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.a9 a9Var, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var) {
        super(1);
        this.f108518d = obj;
        this.f108519e = a9Var;
        this.f108520f = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.Object obj2 = this.f108518d;
        if (obj2 instanceof com.tencent.mm.plugin.finder.feed.model.e9) {
            com.tencent.mm.plugin.finder.feed.model.y8 y8Var = new com.tencent.mm.plugin.finder.feed.model.y8(this.f108520f, task);
            com.tencent.mm.plugin.finder.feed.model.a9 a9Var = this.f108519e;
            a9Var.f107702d = y8Var;
            if (obj2 instanceof com.tencent.mm.plugin.finder.feed.model.d9) {
                com.tencent.mars.xlog.Log.i(a9Var.getTAG(), "fetch requestType is Refresh");
            } else if (obj2 instanceof com.tencent.mm.plugin.finder.feed.model.c9) {
                com.tencent.mars.xlog.Log.i(a9Var.getTAG(), "fetch requestType is LoadMore");
            }
            com.tencent.mm.plugin.finder.feed.model.e9 e9Var = (com.tencent.mm.plugin.finder.feed.model.e9) obj2;
            e9Var.a();
            a9Var.f107703e.add(e9Var.f107832b);
        }
        return jz5.f0.f302826a;
    }
}
