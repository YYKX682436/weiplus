package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class c9 extends com.tencent.mm.plugin.finder.feed.model.e9 {

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.m9 f107762c;

    public c9(com.tencent.mm.plugin.finder.feed.model.m9 params) {
        kotlin.jvm.internal.o.g(params, "params");
        this.f107762c = params;
        this.f107831a = "Finder.FinderTopicFeedLoader.TopicLoadMoreRequest";
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.e9
    public void a() {
        az2.u a17 = this.f107762c.a();
        this.f107832b = a17;
        if (a17 != null) {
            gm0.j1.d().g(this.f107832b);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hashCode: ");
        sb6.append(hashCode());
        sb6.append(", type:");
        com.tencent.mm.plugin.finder.feed.model.m9 m9Var = this.f107762c;
        sb6.append(m9Var.f108186a);
        sb6.append(", topic:");
        sb6.append(m9Var.f108187b);
        sb6.append(", lastBuffer:");
        com.tencent.mm.protobuf.g gVar = m9Var.f108193h;
        java.lang.String b17 = gVar != null ? com.tencent.mm.sdk.platformtools.w2.b(gVar.f192156a) : null;
        if (b17 == null) {
            b17 = "null";
        }
        sb6.append(b17);
        return sb6.toString();
    }
}
