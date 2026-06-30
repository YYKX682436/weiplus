package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class qa {
    public final boolean a(java.lang.Object obj, com.google.protobuf.l9 l9Var) {
        int tag = l9Var.getTag();
        int i17 = tag >>> 3;
        int i18 = tag & 7;
        if (i18 == 0) {
            ((com.google.protobuf.xa) obj).d((i17 << 3) | 0, java.lang.Long.valueOf(l9Var.u()));
            return true;
        }
        if (i18 == 1) {
            ((com.google.protobuf.xa) obj).d((i17 << 3) | 1, java.lang.Long.valueOf(l9Var.v()));
            return true;
        }
        if (i18 == 2) {
            ((com.google.protobuf.xa) obj).d((i17 << 3) | 2, l9Var.h());
            return true;
        }
        if (i18 != 3) {
            if (i18 == 4) {
                return false;
            }
            if (i18 != 5) {
                throw com.google.protobuf.y6.d();
            }
            ((com.google.protobuf.xa) obj).d((i17 << 3) | 5, java.lang.Integer.valueOf(l9Var.J()));
            return true;
        }
        com.google.protobuf.xa xaVar = new com.google.protobuf.xa();
        int i19 = i17 << 3;
        int i27 = i19 | 4;
        while (l9Var.o() != Integer.MAX_VALUE && a(xaVar, l9Var)) {
        }
        if (i27 != l9Var.getTag()) {
            throw com.google.protobuf.y6.a();
        }
        xaVar.f45711e = false;
        ((com.google.protobuf.xa) obj).d(i19 | 3, xaVar);
        return true;
    }

    public abstract java.lang.Object b();

    public abstract void c(java.lang.Object obj, java.lang.Object obj2);
}
