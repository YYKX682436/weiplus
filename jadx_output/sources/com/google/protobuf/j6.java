package com.google.protobuf;

/* loaded from: classes16.dex */
public final class j6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.protobuf.r3 f45240a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.protobuf.v5[] f45241b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String[] f45242c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.x5[] f45243d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f45244e = false;

    public j6(com.google.protobuf.r3 r3Var, java.lang.String[] strArr) {
        this.f45240a = r3Var;
        this.f45242c = strArr;
        this.f45241b = new com.google.protobuf.v5[r3Var.n().size()];
        this.f45243d = new com.google.protobuf.x5[r3Var.p().size()];
    }

    public static com.google.protobuf.x5 a(com.google.protobuf.j6 j6Var, com.google.protobuf.g4 g4Var) {
        j6Var.getClass();
        if (g4Var.f45131h == j6Var.f45240a) {
            return j6Var.f45243d[g4Var.f45127d];
        }
        throw new java.lang.IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    public static com.google.protobuf.v5 b(com.google.protobuf.j6 j6Var, com.google.protobuf.b4 b4Var) {
        j6Var.getClass();
        if (b4Var.f44915n != j6Var.f45240a) {
            throw new java.lang.IllegalArgumentException("FieldDescriptor does not match message type.");
        }
        if (b4Var.o()) {
            throw new java.lang.IllegalArgumentException("This type does not have extensions.");
        }
        return j6Var.f45241b[b4Var.f44908d];
    }

    public com.google.protobuf.j6 c(java.lang.Class cls, java.lang.Class cls2) {
        if (this.f45244e) {
            return this;
        }
        synchronized (this) {
            if (this.f45244e) {
                return this;
            }
            int length = this.f45241b.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                com.google.protobuf.b4 b4Var = (com.google.protobuf.b4) this.f45240a.n().get(i17);
                com.google.protobuf.g4 g4Var = b4Var.f44917p;
                java.lang.String str = g4Var != null ? this.f45242c[g4Var.f45127d + length] : null;
                if (b4Var.d1()) {
                    com.google.protobuf.z3 z3Var = b4Var.f44914m.f44859d;
                    if (z3Var == com.google.protobuf.z3.MESSAGE) {
                        if (b4Var.p()) {
                            this.f45241b[i17] = new com.google.protobuf.w5(b4Var, this.f45242c[i17], cls, cls2);
                        } else {
                            this.f45241b[i17] = new com.google.protobuf.c6(b4Var, this.f45242c[i17], cls, cls2);
                        }
                    } else if (z3Var == com.google.protobuf.z3.ENUM) {
                        this.f45241b[i17] = new com.google.protobuf.y5(b4Var, this.f45242c[i17], cls, cls2);
                    } else {
                        this.f45241b[i17] = new com.google.protobuf.b6(b4Var, this.f45242c[i17], cls, cls2);
                    }
                } else {
                    com.google.protobuf.z3 z3Var2 = b4Var.f44914m.f44859d;
                    if (z3Var2 == com.google.protobuf.z3.MESSAGE) {
                        this.f45241b[i17] = new com.google.protobuf.h6(b4Var, this.f45242c[i17], cls, cls2, str);
                    } else if (z3Var2 == com.google.protobuf.z3.ENUM) {
                        this.f45241b[i17] = new com.google.protobuf.d6(b4Var, this.f45242c[i17], cls, cls2, str);
                    } else if (z3Var2 == com.google.protobuf.z3.STRING) {
                        this.f45241b[i17] = new com.google.protobuf.i6(b4Var, this.f45242c[i17], cls, cls2, str);
                    } else {
                        this.f45241b[i17] = new com.google.protobuf.g6(b4Var, this.f45242c[i17], cls, cls2, str);
                    }
                }
                i17++;
            }
            int length2 = this.f45243d.length;
            for (int i18 = 0; i18 < length2; i18++) {
                this.f45243d[i18] = new com.google.protobuf.x5(this.f45240a, i18, this.f45242c[i18 + length], cls, cls2);
            }
            this.f45244e = true;
            this.f45242c = null;
            return this;
        }
    }
}
