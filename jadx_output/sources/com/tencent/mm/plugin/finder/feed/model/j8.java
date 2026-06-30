package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class j8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.m8 f108093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f108094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f108095f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108096g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f108097h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(com.tencent.mm.plugin.finder.feed.model.m8 m8Var, java.lang.Object obj, boolean z17, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader) {
        super(1);
        this.f108093d = m8Var;
        this.f108094e = obj;
        this.f108095f = z17;
        this.f108096g = n0Var;
        this.f108097h = finderTimelineFeedLoader;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mm.plugin.finder.feed.model.m8 m8Var = this.f108093d;
        java.lang.String tag = m8Var.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[call] pullType=");
        com.tencent.mm.plugin.finder.feed.model.n8 n8Var = (com.tencent.mm.plugin.finder.feed.model.n8) this.f108094e;
        sb6.append(n8Var.f108212a);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        com.tencent.mm.plugin.finder.feed.model.b8 b8Var = new com.tencent.mm.plugin.finder.feed.model.b8(m8Var.f108183f, task);
        eb2.m0 m0Var = m8Var.f108181d;
        java.lang.Object obj2 = this.f108094e;
        com.tencent.mm.plugin.finder.feed.model.i8 i8Var = new com.tencent.mm.plugin.finder.feed.model.i8(m8Var, obj2, this.f108096g, task, this.f108097h);
        com.tencent.mm.plugin.finder.feed.model.n8 n8Var2 = (com.tencent.mm.plugin.finder.feed.model.n8) obj2;
        int i17 = n8Var2.f108212a;
        n8Var2.getClass();
        eb2.m0.E0(m0Var, i8Var, i17, b8Var, null, false, this.f108095f, n8Var.f108213b, n8Var.f108216e, n8Var.f108217f, null, 520, null);
        return jz5.f0.f302826a;
    }
}
