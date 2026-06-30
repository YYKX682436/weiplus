package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class g5 {
    public g5(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 a(r45.f96 f96Var, long j17, zy2.o9 o9Var, java.lang.Integer num, java.lang.Integer num2, r45.qt2 qt2Var, boolean z17, java.lang.String bypassBuffer) {
        boolean z18;
        r45.f96 f96Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bypassBuffer, "bypassBuffer");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa95 = null;
        if (f96Var == null) {
            return null;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95.A;
        reentrantLock.lock();
        try {
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m5.a(f96Var);
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95.f189066z;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa952 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95) hashMap.get(a17);
            if (c13879x1453fa952 != null && c13879x1453fa952.f189082v != 0) {
                long currentTimeMillis = (java.lang.System.currentTimeMillis() / 1000) - c13879x1453fa952.f189082v;
                com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2540x714f9fb5.C20354xa981164c c20354xa981164c = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2540x714f9fb5.C20354xa981164c();
                if (currentTimeMillis > com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F1(j62.e.g().f(c20354xa981164c), c20354xa981164c.f273753a)) {
                    c13879x1453fa952 = null;
                }
            }
            if (num2 != null) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c13879x1453fa952 != null ? java.lang.Integer.valueOf(c13879x1453fa952.f189073m) : null, num2)) {
                    c13879x1453fa952 = null;
                }
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((c13879x1453fa952 == null || (f96Var2 = c13879x1453fa952.f189068e) == null) ? null : (r45.wo2) f96Var2.m75936x14adae67(21), (r45.wo2) f96Var.m75936x14adae67(21))) {
                c13879x1453fa95 = c13879x1453fa952;
                z18 = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiFeedLoader", "fromMpItem mismatch, skipping cache update");
                z18 = false;
            }
            if (c13879x1453fa95 == null && z17) {
                c13879x1453fa95 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95(qt2Var);
                c13879x1453fa95.f189083w = true;
                c13879x1453fa95.mo56107xaf4f6e2e();
                c13879x1453fa95.f189068e = f96Var;
                c13879x1453fa95.f189071h = 0;
                c13879x1453fa95.f189074n = j17;
                c13879x1453fa95.f189069f = o9Var;
                c13879x1453fa95.f189070g = num;
                c13879x1453fa95.f189073m = num2 != null ? num2.intValue() : 0;
                c13879x1453fa95.f189084x = bypassBuffer;
                if (z18) {
                    hashMap.put(a17, c13879x1453fa95);
                }
            }
            reentrantLock.unlock();
            return c13879x1453fa95;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95.A.unlock();
            throw th6;
        }
    }
}
