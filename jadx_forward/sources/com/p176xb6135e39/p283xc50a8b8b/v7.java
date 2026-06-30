package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class v7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.u7 f127145a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f127146b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f127147c;

    public v7(com.p176xb6135e39.p283xc50a8b8b.ub ubVar, java.lang.Object obj, com.p176xb6135e39.p283xc50a8b8b.ub ubVar2, java.lang.Object obj2) {
        this.f127145a = new com.p176xb6135e39.p283xc50a8b8b.u7(ubVar, obj, ubVar2, obj2);
        this.f127146b = obj;
        this.f127147c = obj2;
    }

    public static int a(com.p176xb6135e39.p283xc50a8b8b.u7 u7Var, java.lang.Object obj, java.lang.Object obj2) {
        return com.p176xb6135e39.p283xc50a8b8b.b5.f(u7Var.f127112a, 1, obj) + com.p176xb6135e39.p283xc50a8b8b.b5.f(u7Var.f127114c, 2, obj2);
    }

    public static java.util.Map.Entry b(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.u7 u7Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        java.lang.Object obj = u7Var.f127113b;
        java.lang.Object obj2 = u7Var.f127115d;
        while (true) {
            int F = d0Var.F();
            if (F == 0) {
                break;
            }
            com.p176xb6135e39.p283xc50a8b8b.ub ubVar = u7Var.f127112a;
            if (F == (ubVar.f127131e | 8)) {
                obj = c(d0Var, t4Var, ubVar, obj);
            } else {
                com.p176xb6135e39.p283xc50a8b8b.ub ubVar2 = u7Var.f127114c;
                if (F == (ubVar2.f127131e | 16)) {
                    obj2 = c(d0Var, t4Var, ubVar2, obj2);
                } else if (!d0Var.I(F)) {
                    break;
                }
            }
        }
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public static java.lang.Object c(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, com.p176xb6135e39.p283xc50a8b8b.ub ubVar, java.lang.Object obj) {
        int ordinal = ubVar.ordinal();
        if (ordinal == 9) {
            throw new java.lang.RuntimeException("Groups are not allowed in maps.");
        }
        if (ordinal == 10) {
            com.p176xb6135e39.p283xc50a8b8b.n8 mo20599xaaa148a0 = ((com.p176xb6135e39.p283xc50a8b8b.o8) obj).mo20599xaaa148a0();
            d0Var.w(mo20599xaaa148a0, t4Var);
            return mo20599xaaa148a0.mo20557x85702333();
        }
        if (ordinal == 13) {
            return java.lang.Integer.valueOf(d0Var.o());
        }
        com.p176xb6135e39.p283xc50a8b8b.b5 b5Var = com.p176xb6135e39.p283xc50a8b8b.b5.f126453d;
        return com.p176xb6135e39.p283xc50a8b8b.ac.a(d0Var, ubVar, com.p176xb6135e39.p283xc50a8b8b.zb.f127343e);
    }

    public static void d(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var, com.p176xb6135e39.p283xc50a8b8b.u7 u7Var, java.lang.Object obj, java.lang.Object obj2) {
        com.p176xb6135e39.p283xc50a8b8b.b5.w(k0Var, u7Var.f127112a, 1, obj);
        com.p176xb6135e39.p283xc50a8b8b.b5.w(k0Var, u7Var.f127114c, 2, obj2);
    }
}
