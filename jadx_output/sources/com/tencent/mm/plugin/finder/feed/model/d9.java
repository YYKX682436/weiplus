package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class d9 extends com.tencent.mm.plugin.finder.feed.model.e9 {

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.m9 f107811c;

    public d9(com.tencent.mm.plugin.finder.feed.model.m9 params) {
        kotlin.jvm.internal.o.g(params, "params");
        this.f107811c = params;
        this.f107831a = "Finder.FinderTopicFeedLoader.TopicRefreshRequest";
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.e9
    public void a() {
        az2.u a17 = this.f107811c.a();
        this.f107832b = a17;
        if (a17 != null) {
            gm0.j1.d().g(this.f107832b);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hashCode: ");
        sb6.append(hashCode());
        sb6.append(", type:");
        com.tencent.mm.plugin.finder.feed.model.m9 m9Var = this.f107811c;
        sb6.append(m9Var.f108186a);
        sb6.append(", topic:");
        sb6.append(m9Var.f108187b);
        return sb6.toString();
    }
}
