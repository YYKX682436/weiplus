package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class x9 {
    public x9(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.sdk.platformtools.c0 a() {
        return (com.tencent.mm.sdk.platformtools.c0) ((jz5.n) com.tencent.mm.plugin.finder.feed.model.y9.f108488i).getValue();
    }

    public final boolean b() {
        return ((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.finder.feed.model.y9.f108489j).getValue()).booleanValue();
    }

    public final com.tencent.mm.plugin.finder.feed.model.r9 c(long j17) {
        if (!b()) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.feed.model.y9.f108487h;
            if (!concurrentHashMap.containsKey(java.lang.Long.valueOf(j17))) {
                return null;
            }
            com.tencent.mars.xlog.Log.i("LoaderStateStore", "removeCache " + j17);
            return (com.tencent.mm.plugin.finder.feed.model.r9) concurrentHashMap.remove(java.lang.Long.valueOf(j17));
        }
        if (!a().f192491b.containsKey(java.lang.Long.valueOf(j17))) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("LoaderStateStore", "removeLruCache " + j17);
        com.tencent.mm.plugin.finder.feed.model.r9 r9Var = (com.tencent.mm.plugin.finder.feed.model.r9) a().b(java.lang.Long.valueOf(j17));
        a().e(java.lang.Long.valueOf(j17));
        return r9Var;
    }
}
