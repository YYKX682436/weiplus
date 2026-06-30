package com.tencent.mm.modelbase;

/* loaded from: classes8.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f70680a = new java.util.concurrent.ConcurrentHashMap();

    public static com.tencent.mm.modelbase.n0 a(long j17) {
        com.tencent.mm.modelbase.n0 n0Var = (com.tencent.mm.modelbase.n0) f70680a.get(java.lang.Long.valueOf(j17));
        if (n0Var != null) {
            return n0Var;
        }
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.modelbase.h1.class)).all()) {
            if (qVar.hasKey(java.lang.Long.valueOf(j17))) {
                return (com.tencent.mm.modelbase.n0) qVar.get();
            }
        }
        return null;
    }
}
