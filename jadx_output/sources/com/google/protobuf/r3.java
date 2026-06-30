package com.google.protobuf;

/* loaded from: classes16.dex */
public final class r3 extends com.google.protobuf.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.x0 f45466d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f45467e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.protobuf.d4 f45468f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.protobuf.r3[] f45469g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.protobuf.x3[] f45470h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.protobuf.b4[] f45471i;

    /* renamed from: m, reason: collision with root package name */
    public final com.google.protobuf.b4[] f45472m;

    /* renamed from: n, reason: collision with root package name */
    public final com.google.protobuf.g4[] f45473n;

    public r3(java.lang.String str) {
        super(null);
        java.lang.String str2;
        java.lang.String str3;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str3 = str.substring(lastIndexOf + 1);
            str2 = str.substring(0, lastIndexOf);
        } else {
            str2 = "";
            str3 = str;
        }
        com.google.protobuf.q0 builder = com.google.protobuf.x0.f45653s.toBuilder();
        str3.getClass();
        builder.f45420d |= 1;
        builder.f45421e = str3;
        builder.onChanged();
        com.google.protobuf.s0 builder2 = com.google.protobuf.t0.f45507i.toBuilder();
        builder2.f45476d |= 1;
        builder2.f45477e = 1;
        builder2.onChanged();
        builder2.f45476d |= 2;
        builder2.f45478f = com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
        builder2.onChanged();
        com.google.protobuf.t0 buildPartial = builder2.buildPartial();
        if (buildPartial.isInitialized()) {
            com.google.protobuf.p9 p9Var = builder.f45431r;
            if (p9Var == null) {
                if ((builder.f45420d & 32) == 0) {
                    builder.f45430q = new java.util.ArrayList(builder.f45430q);
                    builder.f45420d |= 32;
                }
                builder.f45430q.add(buildPartial);
                builder.onChanged();
            } else {
                p9Var.f(buildPartial);
            }
            com.google.protobuf.x0 buildPartial2 = builder.buildPartial();
            if (buildPartial2.isInitialized()) {
                this.f45466d = buildPartial2;
                this.f45467e = str;
                this.f45469g = new com.google.protobuf.r3[0];
                this.f45470h = new com.google.protobuf.x3[0];
                this.f45471i = new com.google.protobuf.b4[0];
                this.f45472m = new com.google.protobuf.b4[0];
                this.f45473n = new com.google.protobuf.g4[0];
                this.f45468f = new com.google.protobuf.d4(str2, this);
                return;
            }
            throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial2);
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.e4
    public java.lang.String getName() {
        return this.f45466d.getName();
    }

    @Override // com.google.protobuf.e4
    public com.google.protobuf.d4 h() {
        return this.f45468f;
    }

    @Override // com.google.protobuf.e4
    public java.lang.String i() {
        return this.f45467e;
    }

    @Override // com.google.protobuf.e4
    public com.google.protobuf.k8 j() {
        return this.f45466d;
    }

    public final void k() {
        for (com.google.protobuf.r3 r3Var : this.f45469g) {
            r3Var.k();
        }
        for (com.google.protobuf.b4 b4Var : this.f45471i) {
            com.google.protobuf.b4.k(b4Var);
        }
        for (com.google.protobuf.b4 b4Var2 : this.f45472m) {
            com.google.protobuf.b4.k(b4Var2);
        }
    }

    public com.google.protobuf.b4 l(java.lang.String str) {
        com.google.protobuf.v3 v3Var = this.f45468f.f45010m;
        java.lang.String str2 = this.f45467e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 1 + java.lang.String.valueOf(str).length());
        sb6.append(str2);
        sb6.append('.');
        sb6.append(str);
        com.google.protobuf.e4 c17 = v3Var.c(sb6.toString(), com.google.protobuf.u3.ALL_SYMBOLS);
        if (c17 == null || !(c17 instanceof com.google.protobuf.b4)) {
            return null;
        }
        return (com.google.protobuf.b4) c17;
    }

    public com.google.protobuf.b4 m(int i17) {
        return (com.google.protobuf.b4) ((java.util.HashMap) this.f45468f.f45010m.f45608d).get(new com.google.protobuf.s3(this, i17));
    }

    public java.util.List n() {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(this.f45471i));
    }

    public java.util.List o() {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(this.f45469g));
    }

    public java.util.List p() {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(this.f45473n));
    }

    public com.google.protobuf.j2 r() {
        return this.f45466d.g();
    }

    public boolean s(int i17) {
        for (com.google.protobuf.t0 t0Var : this.f45466d.f45661m) {
            if (t0Var.f45510e <= i17 && i17 < t0Var.f45511f) {
                return true;
            }
        }
        return false;
    }

    public r3(com.google.protobuf.x0 x0Var, com.google.protobuf.d4 d4Var, com.google.protobuf.r3 r3Var, int i17) {
        super(null);
        this.f45466d = x0Var;
        this.f45467e = com.google.protobuf.i4.a(d4Var, r3Var, x0Var.getName());
        this.f45468f = d4Var;
        this.f45473n = new com.google.protobuf.g4[x0Var.f()];
        for (int i18 = 0; i18 < x0Var.f(); i18++) {
            this.f45473n[i18] = new com.google.protobuf.g4((com.google.protobuf.t2) x0Var.f45662n.get(i18), d4Var, this, i18, null);
        }
        this.f45469g = new com.google.protobuf.r3[x0Var.f45659h.size()];
        for (int i19 = 0; i19 < x0Var.f45659h.size(); i19++) {
            this.f45469g[i19] = new com.google.protobuf.r3((com.google.protobuf.x0) x0Var.f45659h.get(i19), d4Var, this, i19);
        }
        this.f45470h = new com.google.protobuf.x3[x0Var.f45660i.size()];
        for (int i27 = 0; i27 < x0Var.f45660i.size(); i27++) {
            this.f45470h[i27] = new com.google.protobuf.x3((com.google.protobuf.d1) x0Var.f45660i.get(i27), d4Var, this, i27, null);
        }
        this.f45471i = new com.google.protobuf.b4[x0Var.f45657f.size()];
        for (int i28 = 0; i28 < x0Var.f45657f.size(); i28++) {
            this.f45471i[i28] = new com.google.protobuf.b4((com.google.protobuf.u1) x0Var.f45657f.get(i28), d4Var, this, i28, false, null);
        }
        this.f45472m = new com.google.protobuf.b4[x0Var.f45658g.size()];
        for (int i29 = 0; i29 < x0Var.f45658g.size(); i29++) {
            this.f45472m[i29] = new com.google.protobuf.b4((com.google.protobuf.u1) x0Var.f45658g.get(i29), d4Var, this, i29, true, null);
        }
        for (int i37 = 0; i37 < x0Var.f(); i37++) {
            com.google.protobuf.g4 g4Var = this.f45473n[i37];
            g4Var.f45133m = new com.google.protobuf.b4[g4Var.f45132i];
            g4Var.f45132i = 0;
        }
        for (int i38 = 0; i38 < x0Var.f45657f.size(); i38++) {
            com.google.protobuf.b4 b4Var = this.f45471i[i38];
            com.google.protobuf.g4 g4Var2 = b4Var.f44917p;
            if (g4Var2 != null) {
                com.google.protobuf.b4[] b4VarArr = g4Var2.f45133m;
                int i39 = g4Var2.f45132i;
                g4Var2.f45132i = i39 + 1;
                b4VarArr[i39] = b4Var;
            }
        }
        int i47 = 0;
        for (com.google.protobuf.g4 g4Var3 : this.f45473n) {
            com.google.protobuf.b4[] b4VarArr2 = g4Var3.f45133m;
            if (b4VarArr2.length == 1 && b4VarArr2[0].f44913i) {
                i47++;
            } else if (i47 > 0) {
                throw new com.google.protobuf.w3(this, "Synthetic oneofs must come last.");
            }
        }
        int length = this.f45473n.length;
        d4Var.f45010m.b(this);
    }
}
