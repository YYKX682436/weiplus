package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class c9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e9 {

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m9 f189295c;

    public c9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m9 params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f189295c = params;
        this.f189364a = "Finder.FinderTopicFeedLoader.TopicLoadMoreRequest";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e9
    public void a() {
        az2.u a17 = this.f189295c.a();
        this.f189365b = a17;
        if (a17 != null) {
            gm0.j1.d().g(this.f189365b);
        }
    }

    /* renamed from: toString */
    public java.lang.String m56323x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hashCode: ");
        sb6.append(hashCode());
        sb6.append(", type:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m9 m9Var = this.f189295c;
        sb6.append(m9Var.f189719a);
        sb6.append(", topic:");
        sb6.append(m9Var.f189720b);
        sb6.append(", lastBuffer:");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = m9Var.f189726h;
        java.lang.String b17 = gVar != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(gVar.f273689a) : null;
        if (b17 == null) {
            b17 = "null";
        }
        sb6.append(b17);
        return sb6.toString();
    }
}
