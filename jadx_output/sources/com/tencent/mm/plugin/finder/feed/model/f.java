package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.n9 f107839a = new com.tencent.mm.plugin.finder.feed.model.q9(30);

    public final void a(com.tencent.mm.plugin.finder.feed.model.internal.a adCache) {
        kotlin.jvm.internal.o.g(adCache, "adCache");
        com.tencent.mm.plugin.finder.feed.model.q9 q9Var = (com.tencent.mm.plugin.finder.feed.model.q9) this.f107839a;
        synchronized (q9Var) {
            q9Var.f108276a.put(java.lang.Long.valueOf(adCache.f107956a), adCache);
        }
    }

    public final boolean b(long j17) {
        boolean k17;
        com.tencent.mm.plugin.finder.feed.model.q9 q9Var = (com.tencent.mm.plugin.finder.feed.model.q9) this.f107839a;
        synchronized (q9Var) {
            k17 = q9Var.f108276a.k(java.lang.Long.valueOf(j17));
        }
        return k17;
    }

    public final com.tencent.mm.plugin.finder.feed.model.internal.a c(long j17) {
        com.tencent.mm.plugin.finder.feed.model.p9 p9Var;
        com.tencent.mm.plugin.finder.feed.model.q9 q9Var = (com.tencent.mm.plugin.finder.feed.model.q9) this.f107839a;
        synchronized (q9Var) {
            p9Var = (com.tencent.mm.plugin.finder.feed.model.p9) q9Var.f108276a.get(java.lang.Long.valueOf(j17));
            if (p9Var != null) {
                com.tencent.mm.plugin.finder.feed.model.internal.a aVar = (com.tencent.mm.plugin.finder.feed.model.internal.a) p9Var;
                if (!(c01.id.c() - aVar.f107957b < aVar.f107958c)) {
                }
            }
            p9Var = null;
        }
        if (p9Var instanceof com.tencent.mm.plugin.finder.feed.model.internal.a) {
            return (com.tencent.mm.plugin.finder.feed.model.internal.a) p9Var;
        }
        return null;
    }

    public final void d(long j17) {
        com.tencent.mm.plugin.finder.feed.model.q9 q9Var = (com.tencent.mm.plugin.finder.feed.model.q9) this.f107839a;
        synchronized (q9Var) {
            q9Var.f108276a.remove(java.lang.Long.valueOf(j17));
        }
    }
}
