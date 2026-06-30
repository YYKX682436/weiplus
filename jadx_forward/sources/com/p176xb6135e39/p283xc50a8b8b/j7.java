package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class j7 extends com.p176xb6135e39.p283xc50a8b8b.k7 {
    public j7(com.p176xb6135e39.p283xc50a8b8b.h7 h7Var) {
        super(null);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k7
    public void a(java.lang.Object obj, long j17) {
        ((com.p176xb6135e39.p283xc50a8b8b.h) ((com.p176xb6135e39.p283xc50a8b8b.v6) com.p176xb6135e39.p283xc50a8b8b.ib.o(obj, j17))).f126678d = false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k7
    public void b(java.lang.Object obj, java.lang.Object obj2, long j17) {
        com.p176xb6135e39.p283xc50a8b8b.v6 v6Var = (com.p176xb6135e39.p283xc50a8b8b.v6) com.p176xb6135e39.p283xc50a8b8b.ib.o(obj, j17);
        com.p176xb6135e39.p283xc50a8b8b.v6 v6Var2 = (com.p176xb6135e39.p283xc50a8b8b.v6) com.p176xb6135e39.p283xc50a8b8b.ib.o(obj2, j17);
        int size = v6Var.size();
        int size2 = v6Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.h) v6Var).f126678d) {
                v6Var = v6Var.F(size2 + size);
            }
            v6Var.addAll(v6Var2);
        }
        if (size > 0) {
            v6Var2 = v6Var;
        }
        com.p176xb6135e39.p283xc50a8b8b.ib.w(obj, j17, v6Var2);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k7
    public java.util.List c(java.lang.Object obj, long j17) {
        com.p176xb6135e39.p283xc50a8b8b.v6 v6Var = (com.p176xb6135e39.p283xc50a8b8b.v6) com.p176xb6135e39.p283xc50a8b8b.ib.o(obj, j17);
        if (((com.p176xb6135e39.p283xc50a8b8b.h) v6Var).f126678d) {
            return v6Var;
        }
        int size = v6Var.size();
        com.p176xb6135e39.p283xc50a8b8b.v6 F = v6Var.F(size == 0 ? 10 : size * 2);
        com.p176xb6135e39.p283xc50a8b8b.ib.w(obj, j17, F);
        return F;
    }
}
