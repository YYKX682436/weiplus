package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class x9 {
    public x9(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 a() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.c0) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y9.f190021i).mo141623x754a37bb();
    }

    public final boolean b() {
        return ((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y9.f190022j).mo141623x754a37bb()).booleanValue();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 c(long j17) {
        if (!b()) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y9.f190020h;
            if (!concurrentHashMap.containsKey(java.lang.Long.valueOf(j17))) {
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LoaderStateStore", "removeCache " + j17);
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9) concurrentHashMap.remove(java.lang.Long.valueOf(j17));
        }
        if (!a().f274024b.containsKey(java.lang.Long.valueOf(j17))) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LoaderStateStore", "removeLruCache " + j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 r9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9) a().b(java.lang.Long.valueOf(j17));
        a().e(java.lang.Long.valueOf(j17));
        return r9Var;
    }
}
