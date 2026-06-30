package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class qa {
    public final boolean a(java.lang.Object obj, com.p176xb6135e39.p283xc50a8b8b.l9 l9Var) {
        int mo20625xb5887064 = l9Var.mo20625xb5887064();
        int i17 = mo20625xb5887064 >>> 3;
        int i18 = mo20625xb5887064 & 7;
        if (i18 == 0) {
            ((com.p176xb6135e39.p283xc50a8b8b.xa) obj).d((i17 << 3) | 0, java.lang.Long.valueOf(l9Var.u()));
            return true;
        }
        if (i18 == 1) {
            ((com.p176xb6135e39.p283xc50a8b8b.xa) obj).d((i17 << 3) | 1, java.lang.Long.valueOf(l9Var.v()));
            return true;
        }
        if (i18 == 2) {
            ((com.p176xb6135e39.p283xc50a8b8b.xa) obj).d((i17 << 3) | 2, l9Var.h());
            return true;
        }
        if (i18 != 3) {
            if (i18 == 4) {
                return false;
            }
            if (i18 != 5) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            ((com.p176xb6135e39.p283xc50a8b8b.xa) obj).d((i17 << 3) | 5, java.lang.Integer.valueOf(l9Var.J()));
            return true;
        }
        com.p176xb6135e39.p283xc50a8b8b.xa xaVar = new com.p176xb6135e39.p283xc50a8b8b.xa();
        int i19 = i17 << 3;
        int i27 = i19 | 4;
        while (l9Var.o() != Integer.MAX_VALUE && a(xaVar, l9Var)) {
        }
        if (i27 != l9Var.mo20625xb5887064()) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.a();
        }
        xaVar.f127244e = false;
        ((com.p176xb6135e39.p283xc50a8b8b.xa) obj).d(i19 | 3, xaVar);
        return true;
    }

    public abstract java.lang.Object b();

    public abstract void c(java.lang.Object obj, java.lang.Object obj2);
}
