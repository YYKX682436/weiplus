package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class r3 extends com.p176xb6135e39.p283xc50a8b8b.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.x0 f126999d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f127000e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.d4 f127001f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.r3[] f127002g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.x3[] f127003h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.b4[] f127004i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.b4[] f127005m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.g4[] f127006n;

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
        com.p176xb6135e39.p283xc50a8b8b.q0 mo20599xaaa148a0 = com.p176xb6135e39.p283xc50a8b8b.x0.f127186s.mo20599xaaa148a0();
        str3.getClass();
        mo20599xaaa148a0.f126953d |= 1;
        mo20599xaaa148a0.f126954e = str3;
        mo20599xaaa148a0.m20881x7bb163d5();
        com.p176xb6135e39.p283xc50a8b8b.s0 mo20599xaaa148a02 = com.p176xb6135e39.p283xc50a8b8b.t0.f127040i.mo20599xaaa148a0();
        mo20599xaaa148a02.f127009d |= 1;
        mo20599xaaa148a02.f127010e = 1;
        mo20599xaaa148a02.m20881x7bb163d5();
        mo20599xaaa148a02.f127009d |= 2;
        mo20599xaaa148a02.f127011f = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965;
        mo20599xaaa148a02.m20881x7bb163d5();
        com.p176xb6135e39.p283xc50a8b8b.t0 mo20557x85702333 = mo20599xaaa148a02.mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = mo20599xaaa148a0.f126964r;
            if (p9Var == null) {
                if ((mo20599xaaa148a0.f126953d & 32) == 0) {
                    mo20599xaaa148a0.f126963q = new java.util.ArrayList(mo20599xaaa148a0.f126963q);
                    mo20599xaaa148a0.f126953d |= 32;
                }
                mo20599xaaa148a0.f126963q.add(mo20557x85702333);
                mo20599xaaa148a0.m20881x7bb163d5();
            } else {
                p9Var.f(mo20557x85702333);
            }
            com.p176xb6135e39.p283xc50a8b8b.x0 mo20557x857023332 = mo20599xaaa148a0.mo20557x85702333();
            if (mo20557x857023332.mo20562xf582434a()) {
                this.f126999d = mo20557x857023332;
                this.f127000e = str;
                this.f127002g = new com.p176xb6135e39.p283xc50a8b8b.r3[0];
                this.f127003h = new com.p176xb6135e39.p283xc50a8b8b.x3[0];
                this.f127004i = new com.p176xb6135e39.p283xc50a8b8b.b4[0];
                this.f127005m = new com.p176xb6135e39.p283xc50a8b8b.b4[0];
                this.f127006n = new com.p176xb6135e39.p283xc50a8b8b.g4[0];
                this.f127001f = new com.p176xb6135e39.p283xc50a8b8b.d4(str2, this);
                return;
            }
            throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x857023332);
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    /* renamed from: getName */
    public java.lang.String mo20569xfb82e301() {
        return this.f126999d.m20945xfb82e301();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public com.p176xb6135e39.p283xc50a8b8b.d4 h() {
        return this.f127001f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public java.lang.String i() {
        return this.f127000e;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public com.p176xb6135e39.p283xc50a8b8b.k8 j() {
        return this.f126999d;
    }

    public final void k() {
        for (com.p176xb6135e39.p283xc50a8b8b.r3 r3Var : this.f127002g) {
            r3Var.k();
        }
        for (com.p176xb6135e39.p283xc50a8b8b.b4 b4Var : this.f127004i) {
            com.p176xb6135e39.p283xc50a8b8b.b4.k(b4Var);
        }
        for (com.p176xb6135e39.p283xc50a8b8b.b4 b4Var2 : this.f127005m) {
            com.p176xb6135e39.p283xc50a8b8b.b4.k(b4Var2);
        }
    }

    public com.p176xb6135e39.p283xc50a8b8b.b4 l(java.lang.String str) {
        com.p176xb6135e39.p283xc50a8b8b.v3 v3Var = this.f127001f.f126543m;
        java.lang.String str2 = this.f127000e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 1 + java.lang.String.valueOf(str).length());
        sb6.append(str2);
        sb6.append('.');
        sb6.append(str);
        com.p176xb6135e39.p283xc50a8b8b.e4 c17 = v3Var.c(sb6.toString(), com.p176xb6135e39.p283xc50a8b8b.u3.ALL_SYMBOLS);
        if (c17 == null || !(c17 instanceof com.p176xb6135e39.p283xc50a8b8b.b4)) {
            return null;
        }
        return (com.p176xb6135e39.p283xc50a8b8b.b4) c17;
    }

    public com.p176xb6135e39.p283xc50a8b8b.b4 m(int i17) {
        return (com.p176xb6135e39.p283xc50a8b8b.b4) ((java.util.HashMap) this.f127001f.f126543m.f127141d).get(new com.p176xb6135e39.p283xc50a8b8b.s3(this, i17));
    }

    public java.util.List n() {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(this.f127004i));
    }

    public java.util.List o() {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(this.f127002g));
    }

    public java.util.List p() {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(this.f127006n));
    }

    public com.p176xb6135e39.p283xc50a8b8b.j2 r() {
        return this.f126999d.g();
    }

    public boolean s(int i17) {
        for (com.p176xb6135e39.p283xc50a8b8b.t0 t0Var : this.f126999d.f127194m) {
            if (t0Var.f127043e <= i17 && i17 < t0Var.f127044f) {
                return true;
            }
        }
        return false;
    }

    public r3(com.p176xb6135e39.p283xc50a8b8b.x0 x0Var, com.p176xb6135e39.p283xc50a8b8b.d4 d4Var, com.p176xb6135e39.p283xc50a8b8b.r3 r3Var, int i17) {
        super(null);
        this.f126999d = x0Var;
        this.f127000e = com.p176xb6135e39.p283xc50a8b8b.i4.a(d4Var, r3Var, x0Var.m20945xfb82e301());
        this.f127001f = d4Var;
        this.f127006n = new com.p176xb6135e39.p283xc50a8b8b.g4[x0Var.f()];
        for (int i18 = 0; i18 < x0Var.f(); i18++) {
            this.f127006n[i18] = new com.p176xb6135e39.p283xc50a8b8b.g4((com.p176xb6135e39.p283xc50a8b8b.t2) x0Var.f127195n.get(i18), d4Var, this, i18, null);
        }
        this.f127002g = new com.p176xb6135e39.p283xc50a8b8b.r3[x0Var.f127192h.size()];
        for (int i19 = 0; i19 < x0Var.f127192h.size(); i19++) {
            this.f127002g[i19] = new com.p176xb6135e39.p283xc50a8b8b.r3((com.p176xb6135e39.p283xc50a8b8b.x0) x0Var.f127192h.get(i19), d4Var, this, i19);
        }
        this.f127003h = new com.p176xb6135e39.p283xc50a8b8b.x3[x0Var.f127193i.size()];
        for (int i27 = 0; i27 < x0Var.f127193i.size(); i27++) {
            this.f127003h[i27] = new com.p176xb6135e39.p283xc50a8b8b.x3((com.p176xb6135e39.p283xc50a8b8b.d1) x0Var.f127193i.get(i27), d4Var, this, i27, null);
        }
        this.f127004i = new com.p176xb6135e39.p283xc50a8b8b.b4[x0Var.f127190f.size()];
        for (int i28 = 0; i28 < x0Var.f127190f.size(); i28++) {
            this.f127004i[i28] = new com.p176xb6135e39.p283xc50a8b8b.b4((com.p176xb6135e39.p283xc50a8b8b.u1) x0Var.f127190f.get(i28), d4Var, this, i28, false, null);
        }
        this.f127005m = new com.p176xb6135e39.p283xc50a8b8b.b4[x0Var.f127191g.size()];
        for (int i29 = 0; i29 < x0Var.f127191g.size(); i29++) {
            this.f127005m[i29] = new com.p176xb6135e39.p283xc50a8b8b.b4((com.p176xb6135e39.p283xc50a8b8b.u1) x0Var.f127191g.get(i29), d4Var, this, i29, true, null);
        }
        for (int i37 = 0; i37 < x0Var.f(); i37++) {
            com.p176xb6135e39.p283xc50a8b8b.g4 g4Var = this.f127006n[i37];
            g4Var.f126666m = new com.p176xb6135e39.p283xc50a8b8b.b4[g4Var.f126665i];
            g4Var.f126665i = 0;
        }
        for (int i38 = 0; i38 < x0Var.f127190f.size(); i38++) {
            com.p176xb6135e39.p283xc50a8b8b.b4 b4Var = this.f127004i[i38];
            com.p176xb6135e39.p283xc50a8b8b.g4 g4Var2 = b4Var.f126450p;
            if (g4Var2 != null) {
                com.p176xb6135e39.p283xc50a8b8b.b4[] b4VarArr = g4Var2.f126666m;
                int i39 = g4Var2.f126665i;
                g4Var2.f126665i = i39 + 1;
                b4VarArr[i39] = b4Var;
            }
        }
        int i47 = 0;
        for (com.p176xb6135e39.p283xc50a8b8b.g4 g4Var3 : this.f127006n) {
            com.p176xb6135e39.p283xc50a8b8b.b4[] b4VarArr2 = g4Var3.f126666m;
            if (b4VarArr2.length == 1 && b4VarArr2[0].f126446i) {
                i47++;
            } else if (i47 > 0) {
                throw new com.p176xb6135e39.p283xc50a8b8b.w3(this, "Synthetic oneofs must come last.");
            }
        }
        int length = this.f127006n.length;
        d4Var.f126543m.b(this);
    }
}
