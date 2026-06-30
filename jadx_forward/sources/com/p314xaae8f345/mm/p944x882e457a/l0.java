package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes8.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f152213a = new java.util.concurrent.ConcurrentHashMap();

    public static com.p314xaae8f345.mm.p944x882e457a.n0 a(long j17) {
        com.p314xaae8f345.mm.p944x882e457a.n0 n0Var = (com.p314xaae8f345.mm.p944x882e457a.n0) f152213a.get(java.lang.Long.valueOf(j17));
        if (n0Var != null) {
            return n0Var;
        }
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.p944x882e457a.h1.class)).all()) {
            if (qVar.mo210xb7045565(java.lang.Long.valueOf(j17))) {
                return (com.p314xaae8f345.mm.p944x882e457a.n0) qVar.get();
            }
        }
        return null;
    }
}
