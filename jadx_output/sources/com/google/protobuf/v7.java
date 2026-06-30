package com.google.protobuf;

/* loaded from: classes16.dex */
public class v7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.protobuf.u7 f45612a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f45613b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f45614c;

    public v7(com.google.protobuf.ub ubVar, java.lang.Object obj, com.google.protobuf.ub ubVar2, java.lang.Object obj2) {
        this.f45612a = new com.google.protobuf.u7(ubVar, obj, ubVar2, obj2);
        this.f45613b = obj;
        this.f45614c = obj2;
    }

    public static int a(com.google.protobuf.u7 u7Var, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.protobuf.b5.f(u7Var.f45579a, 1, obj) + com.google.protobuf.b5.f(u7Var.f45581c, 2, obj2);
    }

    public static java.util.Map.Entry b(com.google.protobuf.d0 d0Var, com.google.protobuf.u7 u7Var, com.google.protobuf.t4 t4Var) {
        java.lang.Object obj = u7Var.f45580b;
        java.lang.Object obj2 = u7Var.f45582d;
        while (true) {
            int F = d0Var.F();
            if (F == 0) {
                break;
            }
            com.google.protobuf.ub ubVar = u7Var.f45579a;
            if (F == (ubVar.f45598e | 8)) {
                obj = c(d0Var, t4Var, ubVar, obj);
            } else {
                com.google.protobuf.ub ubVar2 = u7Var.f45581c;
                if (F == (ubVar2.f45598e | 16)) {
                    obj2 = c(d0Var, t4Var, ubVar2, obj2);
                } else if (!d0Var.I(F)) {
                    break;
                }
            }
        }
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public static java.lang.Object c(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.google.protobuf.ub ubVar, java.lang.Object obj) {
        int ordinal = ubVar.ordinal();
        if (ordinal == 9) {
            throw new java.lang.RuntimeException("Groups are not allowed in maps.");
        }
        if (ordinal == 10) {
            com.google.protobuf.n8 builder = ((com.google.protobuf.o8) obj).toBuilder();
            d0Var.w(builder, t4Var);
            return builder.buildPartial();
        }
        if (ordinal == 13) {
            return java.lang.Integer.valueOf(d0Var.o());
        }
        com.google.protobuf.b5 b5Var = com.google.protobuf.b5.f44920d;
        return com.google.protobuf.ac.a(d0Var, ubVar, com.google.protobuf.zb.f45810e);
    }

    public static void d(com.google.protobuf.k0 k0Var, com.google.protobuf.u7 u7Var, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.b5.w(k0Var, u7Var.f45579a, 1, obj);
        com.google.protobuf.b5.w(k0Var, u7Var.f45581c, 2, obj2);
    }
}
