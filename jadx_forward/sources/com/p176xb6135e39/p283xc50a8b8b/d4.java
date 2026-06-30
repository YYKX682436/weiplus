package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class d4 extends com.p176xb6135e39.p283xc50a8b8b.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.c2 f126537d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.r3[] f126538e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.x3[] f126539f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.h4[] f126540g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.b4[] f126541h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.d4[] f126542i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.v3 f126543m;

    public d4(com.p176xb6135e39.p283xc50a8b8b.c2 c2Var, com.p176xb6135e39.p283xc50a8b8b.d4[] d4VarArr, com.p176xb6135e39.p283xc50a8b8b.v3 v3Var, boolean z17) {
        super(null);
        this.f126543m = v3Var;
        this.f126537d = c2Var;
        d4VarArr.clone();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.p176xb6135e39.p283xc50a8b8b.d4 d4Var : d4VarArr) {
            hashMap.put(d4Var.mo20569xfb82e301(), d4Var);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.t6 t6Var = c2Var.f126490h;
            if (i17 < ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).f126862f) {
                int h17 = ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).h(i17);
                if (h17 < 0 || h17 >= c2Var.f126489g.size()) {
                    break;
                }
                java.lang.String str = (java.lang.String) c2Var.f126489g.get(h17);
                com.p176xb6135e39.p283xc50a8b8b.d4 d4Var2 = (com.p176xb6135e39.p283xc50a8b8b.d4) hashMap.get(str);
                if (d4Var2 != null) {
                    arrayList.add(d4Var2);
                } else if (!z17) {
                    java.lang.String valueOf = java.lang.String.valueOf(str);
                    throw new com.p176xb6135e39.p283xc50a8b8b.w3(this, valueOf.length() != 0 ? "Invalid public dependency: ".concat(valueOf) : new java.lang.String("Invalid public dependency: "), null);
                }
                i17++;
            } else {
                com.p176xb6135e39.p283xc50a8b8b.d4[] d4VarArr2 = new com.p176xb6135e39.p283xc50a8b8b.d4[arrayList.size()];
                this.f126542i = d4VarArr2;
                arrayList.toArray(d4VarArr2);
                v3Var.a(this.f126537d.g(), this);
                this.f126538e = new com.p176xb6135e39.p283xc50a8b8b.r3[c2Var.f126492m.size()];
                for (int i18 = 0; i18 < c2Var.f126492m.size(); i18++) {
                    this.f126538e[i18] = new com.p176xb6135e39.p283xc50a8b8b.r3((com.p176xb6135e39.p283xc50a8b8b.x0) c2Var.f126492m.get(i18), this, null, i18);
                }
                this.f126539f = new com.p176xb6135e39.p283xc50a8b8b.x3[c2Var.f126493n.size()];
                for (int i19 = 0; i19 < c2Var.f126493n.size(); i19++) {
                    this.f126539f[i19] = new com.p176xb6135e39.p283xc50a8b8b.x3((com.p176xb6135e39.p283xc50a8b8b.d1) c2Var.f126493n.get(i19), this, null, i19, null);
                }
                this.f126540g = new com.p176xb6135e39.p283xc50a8b8b.h4[c2Var.f126494o.size()];
                for (int i27 = 0; i27 < c2Var.f126494o.size(); i27++) {
                    this.f126540g[i27] = new com.p176xb6135e39.p283xc50a8b8b.h4((com.p176xb6135e39.p283xc50a8b8b.z2) c2Var.f126494o.get(i27), this, i27, null);
                }
                this.f126541h = new com.p176xb6135e39.p283xc50a8b8b.b4[c2Var.f126495p.size()];
                for (int i28 = 0; i28 < c2Var.f126495p.size(); i28++) {
                    this.f126541h[i28] = new com.p176xb6135e39.p283xc50a8b8b.b4((com.p176xb6135e39.p283xc50a8b8b.u1) c2Var.f126495p.get(i28), this, null, i28, true, null);
                }
                return;
            }
        }
        throw new com.p176xb6135e39.p283xc50a8b8b.w3(this, "Invalid public dependency index.", null);
    }

    public static com.p176xb6135e39.p283xc50a8b8b.d4 k(com.p176xb6135e39.p283xc50a8b8b.c2 c2Var, com.p176xb6135e39.p283xc50a8b8b.d4[] d4VarArr, boolean z17) {
        com.p176xb6135e39.p283xc50a8b8b.d4 d4Var = new com.p176xb6135e39.p283xc50a8b8b.d4(c2Var, d4VarArr, new com.p176xb6135e39.p283xc50a8b8b.v3(d4VarArr, z17), z17);
        for (com.p176xb6135e39.p283xc50a8b8b.r3 r3Var : d4Var.f126538e) {
            r3Var.k();
        }
        for (com.p176xb6135e39.p283xc50a8b8b.h4 h4Var : d4Var.f126540g) {
            for (com.p176xb6135e39.p283xc50a8b8b.f4 f4Var : h4Var.f126696g) {
                com.p176xb6135e39.p283xc50a8b8b.d4 d4Var2 = f4Var.f126609f;
                com.p176xb6135e39.p283xc50a8b8b.v3 v3Var = d4Var2.f126543m;
                com.p176xb6135e39.p283xc50a8b8b.m2 m2Var = f4Var.f126607d;
                java.lang.String f17 = m2Var.f();
                com.p176xb6135e39.p283xc50a8b8b.u3 u3Var = com.p176xb6135e39.p283xc50a8b8b.u3.TYPES_ONLY;
                com.p176xb6135e39.p283xc50a8b8b.e4 e17 = v3Var.e(f17, f4Var, u3Var);
                if (!(e17 instanceof com.p176xb6135e39.p283xc50a8b8b.r3)) {
                    java.lang.String f18 = m2Var.f();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(f18).length() + 25);
                    sb6.append('\"');
                    sb6.append(f18);
                    sb6.append("\" is not a message type.");
                    throw new com.p176xb6135e39.p283xc50a8b8b.w3(f4Var, sb6.toString());
                }
                com.p176xb6135e39.p283xc50a8b8b.e4 e18 = d4Var2.f126543m.e(m2Var.h(), f4Var, u3Var);
                if (!(e18 instanceof com.p176xb6135e39.p283xc50a8b8b.r3)) {
                    java.lang.String h17 = m2Var.h();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(h17).length() + 25);
                    sb7.append('\"');
                    sb7.append(h17);
                    sb7.append("\" is not a message type.");
                    throw new com.p176xb6135e39.p283xc50a8b8b.w3(f4Var, sb7.toString());
                }
            }
        }
        for (com.p176xb6135e39.p283xc50a8b8b.b4 b4Var : d4Var.f126541h) {
            com.p176xb6135e39.p283xc50a8b8b.b4.k(b4Var);
        }
        return d4Var;
    }

    public static com.p176xb6135e39.p283xc50a8b8b.d4 n(java.lang.String[] strArr, com.p176xb6135e39.p283xc50a8b8b.d4[] d4VarArr) {
        byte[] bytes;
        if (strArr.length == 1) {
            bytes = strArr[0].getBytes(com.p176xb6135e39.p283xc50a8b8b.w6.f127182b);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (java.lang.String str : strArr) {
                sb6.append(str);
            }
            bytes = sb6.toString().getBytes(com.p176xb6135e39.p283xc50a8b8b.w6.f127182b);
        }
        try {
            com.p176xb6135e39.p283xc50a8b8b.c2 c2Var = (com.p176xb6135e39.p283xc50a8b8b.c2) com.p176xb6135e39.p283xc50a8b8b.c2.f126485v.mo20642x92b714fd(bytes);
            try {
                return k(c2Var, d4VarArr, true);
            } catch (com.p176xb6135e39.p283xc50a8b8b.w3 e17) {
                java.lang.String m20602xfb82e301 = c2Var.m20602xfb82e301();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(m20602xfb82e301).length() + 35);
                sb7.append("Invalid embedded descriptor for \"");
                sb7.append(m20602xfb82e301);
                sb7.append("\".");
                throw new java.lang.IllegalArgumentException(sb7.toString(), e17);
            }
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e18) {
            throw new java.lang.IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e18);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    /* renamed from: getName */
    public java.lang.String mo20569xfb82e301() {
        return this.f126537d.m20602xfb82e301();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public com.p176xb6135e39.p283xc50a8b8b.d4 h() {
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public java.lang.String i() {
        return this.f126537d.m20602xfb82e301();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public com.p176xb6135e39.p283xc50a8b8b.k8 j() {
        return this.f126537d;
    }

    public java.util.List l() {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(this.f126538e));
    }

    public com.p176xb6135e39.p283xc50a8b8b.c4 m() {
        return "proto3".equals(this.f126537d.i()) ? com.p176xb6135e39.p283xc50a8b8b.c4.PROTO3 : com.p176xb6135e39.p283xc50a8b8b.c4.PROTO2;
    }

    public d4(java.lang.String str, com.p176xb6135e39.p283xc50a8b8b.r3 r3Var) {
        super(null);
        com.p176xb6135e39.p283xc50a8b8b.v3 v3Var = new com.p176xb6135e39.p283xc50a8b8b.v3(new com.p176xb6135e39.p283xc50a8b8b.d4[0], true);
        this.f126543m = v3Var;
        com.p176xb6135e39.p283xc50a8b8b.b2 mo20599xaaa148a0 = com.p176xb6135e39.p283xc50a8b8b.c2.f126484u.mo20599xaaa148a0();
        java.lang.String concat = java.lang.String.valueOf(r3Var.f127000e).concat(".placeholder.proto");
        concat.getClass();
        mo20599xaaa148a0.f126417d = 1 | mo20599xaaa148a0.f126417d;
        mo20599xaaa148a0.f126418e = concat;
        mo20599xaaa148a0.m20881x7bb163d5();
        str.getClass();
        mo20599xaaa148a0.f126417d |= 2;
        mo20599xaaa148a0.f126419f = str;
        mo20599xaaa148a0.m20881x7bb163d5();
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = mo20599xaaa148a0.f126424n;
        com.p176xb6135e39.p283xc50a8b8b.x0 x0Var = r3Var.f126999d;
        if (p9Var == null) {
            x0Var.getClass();
            if ((mo20599xaaa148a0.f126417d & 32) == 0) {
                mo20599xaaa148a0.f126423m = new java.util.ArrayList(mo20599xaaa148a0.f126423m);
                mo20599xaaa148a0.f126417d |= 32;
            }
            mo20599xaaa148a0.f126423m.add(x0Var);
            mo20599xaaa148a0.m20881x7bb163d5();
        } else {
            p9Var.f(x0Var);
        }
        com.p176xb6135e39.p283xc50a8b8b.c2 mo20557x85702333 = mo20599xaaa148a0.mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            this.f126537d = mo20557x85702333;
            this.f126542i = new com.p176xb6135e39.p283xc50a8b8b.d4[0];
            this.f126538e = new com.p176xb6135e39.p283xc50a8b8b.r3[]{r3Var};
            this.f126539f = new com.p176xb6135e39.p283xc50a8b8b.x3[0];
            this.f126540g = new com.p176xb6135e39.p283xc50a8b8b.h4[0];
            this.f126541h = new com.p176xb6135e39.p283xc50a8b8b.b4[0];
            v3Var.a(str, this);
            v3Var.b(r3Var);
            return;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }
}
