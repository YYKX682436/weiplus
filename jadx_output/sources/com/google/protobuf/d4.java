package com.google.protobuf;

/* loaded from: classes16.dex */
public final class d4 extends com.google.protobuf.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.c2 f45004d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.protobuf.r3[] f45005e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.protobuf.x3[] f45006f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.protobuf.h4[] f45007g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.protobuf.b4[] f45008h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.protobuf.d4[] f45009i;

    /* renamed from: m, reason: collision with root package name */
    public final com.google.protobuf.v3 f45010m;

    public d4(com.google.protobuf.c2 c2Var, com.google.protobuf.d4[] d4VarArr, com.google.protobuf.v3 v3Var, boolean z17) {
        super(null);
        this.f45010m = v3Var;
        this.f45004d = c2Var;
        d4VarArr.clone();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.google.protobuf.d4 d4Var : d4VarArr) {
            hashMap.put(d4Var.getName(), d4Var);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            com.google.protobuf.t6 t6Var = c2Var.f44957h;
            if (i17 < ((com.google.protobuf.m6) t6Var).f45329f) {
                int h17 = ((com.google.protobuf.m6) t6Var).h(i17);
                if (h17 < 0 || h17 >= c2Var.f44956g.size()) {
                    break;
                }
                java.lang.String str = (java.lang.String) c2Var.f44956g.get(h17);
                com.google.protobuf.d4 d4Var2 = (com.google.protobuf.d4) hashMap.get(str);
                if (d4Var2 != null) {
                    arrayList.add(d4Var2);
                } else if (!z17) {
                    java.lang.String valueOf = java.lang.String.valueOf(str);
                    throw new com.google.protobuf.w3(this, valueOf.length() != 0 ? "Invalid public dependency: ".concat(valueOf) : new java.lang.String("Invalid public dependency: "), null);
                }
                i17++;
            } else {
                com.google.protobuf.d4[] d4VarArr2 = new com.google.protobuf.d4[arrayList.size()];
                this.f45009i = d4VarArr2;
                arrayList.toArray(d4VarArr2);
                v3Var.a(this.f45004d.g(), this);
                this.f45005e = new com.google.protobuf.r3[c2Var.f44959m.size()];
                for (int i18 = 0; i18 < c2Var.f44959m.size(); i18++) {
                    this.f45005e[i18] = new com.google.protobuf.r3((com.google.protobuf.x0) c2Var.f44959m.get(i18), this, null, i18);
                }
                this.f45006f = new com.google.protobuf.x3[c2Var.f44960n.size()];
                for (int i19 = 0; i19 < c2Var.f44960n.size(); i19++) {
                    this.f45006f[i19] = new com.google.protobuf.x3((com.google.protobuf.d1) c2Var.f44960n.get(i19), this, null, i19, null);
                }
                this.f45007g = new com.google.protobuf.h4[c2Var.f44961o.size()];
                for (int i27 = 0; i27 < c2Var.f44961o.size(); i27++) {
                    this.f45007g[i27] = new com.google.protobuf.h4((com.google.protobuf.z2) c2Var.f44961o.get(i27), this, i27, null);
                }
                this.f45008h = new com.google.protobuf.b4[c2Var.f44962p.size()];
                for (int i28 = 0; i28 < c2Var.f44962p.size(); i28++) {
                    this.f45008h[i28] = new com.google.protobuf.b4((com.google.protobuf.u1) c2Var.f44962p.get(i28), this, null, i28, true, null);
                }
                return;
            }
        }
        throw new com.google.protobuf.w3(this, "Invalid public dependency index.", null);
    }

    public static com.google.protobuf.d4 k(com.google.protobuf.c2 c2Var, com.google.protobuf.d4[] d4VarArr, boolean z17) {
        com.google.protobuf.d4 d4Var = new com.google.protobuf.d4(c2Var, d4VarArr, new com.google.protobuf.v3(d4VarArr, z17), z17);
        for (com.google.protobuf.r3 r3Var : d4Var.f45005e) {
            r3Var.k();
        }
        for (com.google.protobuf.h4 h4Var : d4Var.f45007g) {
            for (com.google.protobuf.f4 f4Var : h4Var.f45163g) {
                com.google.protobuf.d4 d4Var2 = f4Var.f45076f;
                com.google.protobuf.v3 v3Var = d4Var2.f45010m;
                com.google.protobuf.m2 m2Var = f4Var.f45074d;
                java.lang.String f17 = m2Var.f();
                com.google.protobuf.u3 u3Var = com.google.protobuf.u3.TYPES_ONLY;
                com.google.protobuf.e4 e17 = v3Var.e(f17, f4Var, u3Var);
                if (!(e17 instanceof com.google.protobuf.r3)) {
                    java.lang.String f18 = m2Var.f();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(f18).length() + 25);
                    sb6.append('\"');
                    sb6.append(f18);
                    sb6.append("\" is not a message type.");
                    throw new com.google.protobuf.w3(f4Var, sb6.toString());
                }
                com.google.protobuf.e4 e18 = d4Var2.f45010m.e(m2Var.h(), f4Var, u3Var);
                if (!(e18 instanceof com.google.protobuf.r3)) {
                    java.lang.String h17 = m2Var.h();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(h17).length() + 25);
                    sb7.append('\"');
                    sb7.append(h17);
                    sb7.append("\" is not a message type.");
                    throw new com.google.protobuf.w3(f4Var, sb7.toString());
                }
            }
        }
        for (com.google.protobuf.b4 b4Var : d4Var.f45008h) {
            com.google.protobuf.b4.k(b4Var);
        }
        return d4Var;
    }

    public static com.google.protobuf.d4 n(java.lang.String[] strArr, com.google.protobuf.d4[] d4VarArr) {
        byte[] bytes;
        if (strArr.length == 1) {
            bytes = strArr[0].getBytes(com.google.protobuf.w6.f45649b);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (java.lang.String str : strArr) {
                sb6.append(str);
            }
            bytes = sb6.toString().getBytes(com.google.protobuf.w6.f45649b);
        }
        try {
            com.google.protobuf.c2 c2Var = (com.google.protobuf.c2) com.google.protobuf.c2.f44952v.parseFrom(bytes);
            try {
                return k(c2Var, d4VarArr, true);
            } catch (com.google.protobuf.w3 e17) {
                java.lang.String name = c2Var.getName();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 35);
                sb7.append("Invalid embedded descriptor for \"");
                sb7.append(name);
                sb7.append("\".");
                throw new java.lang.IllegalArgumentException(sb7.toString(), e17);
            }
        } catch (com.google.protobuf.y6 e18) {
            throw new java.lang.IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e18);
        }
    }

    @Override // com.google.protobuf.e4
    public java.lang.String getName() {
        return this.f45004d.getName();
    }

    @Override // com.google.protobuf.e4
    public com.google.protobuf.d4 h() {
        return this;
    }

    @Override // com.google.protobuf.e4
    public java.lang.String i() {
        return this.f45004d.getName();
    }

    @Override // com.google.protobuf.e4
    public com.google.protobuf.k8 j() {
        return this.f45004d;
    }

    public java.util.List l() {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(this.f45005e));
    }

    public com.google.protobuf.c4 m() {
        return "proto3".equals(this.f45004d.i()) ? com.google.protobuf.c4.PROTO3 : com.google.protobuf.c4.PROTO2;
    }

    public d4(java.lang.String str, com.google.protobuf.r3 r3Var) {
        super(null);
        com.google.protobuf.v3 v3Var = new com.google.protobuf.v3(new com.google.protobuf.d4[0], true);
        this.f45010m = v3Var;
        com.google.protobuf.b2 builder = com.google.protobuf.c2.f44951u.toBuilder();
        java.lang.String concat = java.lang.String.valueOf(r3Var.f45467e).concat(".placeholder.proto");
        concat.getClass();
        builder.f44884d = 1 | builder.f44884d;
        builder.f44885e = concat;
        builder.onChanged();
        str.getClass();
        builder.f44884d |= 2;
        builder.f44886f = str;
        builder.onChanged();
        com.google.protobuf.p9 p9Var = builder.f44891n;
        com.google.protobuf.x0 x0Var = r3Var.f45466d;
        if (p9Var == null) {
            x0Var.getClass();
            if ((builder.f44884d & 32) == 0) {
                builder.f44890m = new java.util.ArrayList(builder.f44890m);
                builder.f44884d |= 32;
            }
            builder.f44890m.add(x0Var);
            builder.onChanged();
        } else {
            p9Var.f(x0Var);
        }
        com.google.protobuf.c2 buildPartial = builder.buildPartial();
        if (buildPartial.isInitialized()) {
            this.f45004d = buildPartial;
            this.f45009i = new com.google.protobuf.d4[0];
            this.f45005e = new com.google.protobuf.r3[]{r3Var};
            this.f45006f = new com.google.protobuf.x3[0];
            this.f45007g = new com.google.protobuf.h4[0];
            this.f45008h = new com.google.protobuf.b4[0];
            v3Var.a(str, this);
            v3Var.b(r3Var);
            return;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }
}
