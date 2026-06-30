package com.google.protobuf;

/* loaded from: classes16.dex */
public final class j7 extends com.google.protobuf.k7 {
    public j7(com.google.protobuf.h7 h7Var) {
        super(null);
    }

    @Override // com.google.protobuf.k7
    public void a(java.lang.Object obj, long j17) {
        ((com.google.protobuf.h) ((com.google.protobuf.v6) com.google.protobuf.ib.o(obj, j17))).f45145d = false;
    }

    @Override // com.google.protobuf.k7
    public void b(java.lang.Object obj, java.lang.Object obj2, long j17) {
        com.google.protobuf.v6 v6Var = (com.google.protobuf.v6) com.google.protobuf.ib.o(obj, j17);
        com.google.protobuf.v6 v6Var2 = (com.google.protobuf.v6) com.google.protobuf.ib.o(obj2, j17);
        int size = v6Var.size();
        int size2 = v6Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((com.google.protobuf.h) v6Var).f45145d) {
                v6Var = v6Var.F(size2 + size);
            }
            v6Var.addAll(v6Var2);
        }
        if (size > 0) {
            v6Var2 = v6Var;
        }
        com.google.protobuf.ib.w(obj, j17, v6Var2);
    }

    @Override // com.google.protobuf.k7
    public java.util.List c(java.lang.Object obj, long j17) {
        com.google.protobuf.v6 v6Var = (com.google.protobuf.v6) com.google.protobuf.ib.o(obj, j17);
        if (((com.google.protobuf.h) v6Var).f45145d) {
            return v6Var;
        }
        int size = v6Var.size();
        com.google.protobuf.v6 F = v6Var.F(size == 0 ? 10 : size * 2);
        com.google.protobuf.ib.w(obj, j17, F);
        return F;
    }
}
