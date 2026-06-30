package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class j6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.r3 f126773a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.v5[] f126774b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String[] f126775c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.x5[] f126776d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f126777e = false;

    public j6(com.p176xb6135e39.p283xc50a8b8b.r3 r3Var, java.lang.String[] strArr) {
        this.f126773a = r3Var;
        this.f126775c = strArr;
        this.f126774b = new com.p176xb6135e39.p283xc50a8b8b.v5[r3Var.n().size()];
        this.f126776d = new com.p176xb6135e39.p283xc50a8b8b.x5[r3Var.p().size()];
    }

    public static com.p176xb6135e39.p283xc50a8b8b.x5 a(com.p176xb6135e39.p283xc50a8b8b.j6 j6Var, com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        j6Var.getClass();
        if (g4Var.f126664h == j6Var.f126773a) {
            return j6Var.f126776d[g4Var.f126660d];
        }
        throw new java.lang.IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    public static com.p176xb6135e39.p283xc50a8b8b.v5 b(com.p176xb6135e39.p283xc50a8b8b.j6 j6Var, com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        j6Var.getClass();
        if (b4Var.f126448n != j6Var.f126773a) {
            throw new java.lang.IllegalArgumentException("FieldDescriptor does not match message type.");
        }
        if (b4Var.o()) {
            throw new java.lang.IllegalArgumentException("This type does not have extensions.");
        }
        return j6Var.f126774b[b4Var.f126441d];
    }

    public com.p176xb6135e39.p283xc50a8b8b.j6 c(java.lang.Class cls, java.lang.Class cls2) {
        if (this.f126777e) {
            return this;
        }
        synchronized (this) {
            if (this.f126777e) {
                return this;
            }
            int length = this.f126774b.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                com.p176xb6135e39.p283xc50a8b8b.b4 b4Var = (com.p176xb6135e39.p283xc50a8b8b.b4) this.f126773a.n().get(i17);
                com.p176xb6135e39.p283xc50a8b8b.g4 g4Var = b4Var.f126450p;
                java.lang.String str = g4Var != null ? this.f126775c[g4Var.f126660d + length] : null;
                if (b4Var.d1()) {
                    com.p176xb6135e39.p283xc50a8b8b.z3 z3Var = b4Var.f126447m.f126392d;
                    if (z3Var == com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE) {
                        if (b4Var.p()) {
                            this.f126774b[i17] = new com.p176xb6135e39.p283xc50a8b8b.w5(b4Var, this.f126775c[i17], cls, cls2);
                        } else {
                            this.f126774b[i17] = new com.p176xb6135e39.p283xc50a8b8b.c6(b4Var, this.f126775c[i17], cls, cls2);
                        }
                    } else if (z3Var == com.p176xb6135e39.p283xc50a8b8b.z3.ENUM) {
                        this.f126774b[i17] = new com.p176xb6135e39.p283xc50a8b8b.y5(b4Var, this.f126775c[i17], cls, cls2);
                    } else {
                        this.f126774b[i17] = new com.p176xb6135e39.p283xc50a8b8b.b6(b4Var, this.f126775c[i17], cls, cls2);
                    }
                } else {
                    com.p176xb6135e39.p283xc50a8b8b.z3 z3Var2 = b4Var.f126447m.f126392d;
                    if (z3Var2 == com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE) {
                        this.f126774b[i17] = new com.p176xb6135e39.p283xc50a8b8b.h6(b4Var, this.f126775c[i17], cls, cls2, str);
                    } else if (z3Var2 == com.p176xb6135e39.p283xc50a8b8b.z3.ENUM) {
                        this.f126774b[i17] = new com.p176xb6135e39.p283xc50a8b8b.d6(b4Var, this.f126775c[i17], cls, cls2, str);
                    } else if (z3Var2 == com.p176xb6135e39.p283xc50a8b8b.z3.STRING) {
                        this.f126774b[i17] = new com.p176xb6135e39.p283xc50a8b8b.i6(b4Var, this.f126775c[i17], cls, cls2, str);
                    } else {
                        this.f126774b[i17] = new com.p176xb6135e39.p283xc50a8b8b.g6(b4Var, this.f126775c[i17], cls, cls2, str);
                    }
                }
                i17++;
            }
            int length2 = this.f126776d.length;
            for (int i18 = 0; i18 < length2; i18++) {
                this.f126776d[i18] = new com.p176xb6135e39.p283xc50a8b8b.x5(this.f126773a, i18, this.f126775c[i18 + length], cls, cls2);
            }
            this.f126777e = true;
            this.f126775c = null;
            return this;
        }
    }
}
