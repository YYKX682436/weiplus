package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class q7 extends com.p176xb6135e39.p283xc50a8b8b.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.s7 f126981d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f126982e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f126983f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f126984g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f126985h;

    public q7(com.p176xb6135e39.p283xc50a8b8b.s7 s7Var, java.lang.Object obj, java.lang.Object obj2, boolean z17, boolean z18) {
        this.f126981d = s7Var;
        this.f126982e = obj;
        this.f126983f = obj2;
        this.f126984g = z17;
        this.f126985h = z18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        throw new java.lang.RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.t7 mo20556x59bc66e() {
        com.p176xb6135e39.p283xc50a8b8b.t7 t7Var = new com.p176xb6135e39.p283xc50a8b8b.t7(this.f126981d, this.f126982e, this.f126983f);
        if (t7Var.mo20562xf582434a()) {
            return t7Var;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) t7Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: buildPartial */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20557x85702333() {
        return new com.p176xb6135e39.p283xc50a8b8b.t7(this.f126981d, this.f126982e, this.f126983f);
    }

    public final void c(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        com.p176xb6135e39.p283xc50a8b8b.r3 r3Var = b4Var.f126448n;
        com.p176xb6135e39.p283xc50a8b8b.s7 s7Var = this.f126981d;
        if (r3Var == s7Var.f127028e) {
            return;
        }
        java.lang.String str = s7Var.f127028e.f127000e;
        java.lang.String str2 = b4Var.f126443f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 42 + java.lang.String.valueOf(str).length());
        sb6.append("Wrong FieldDescriptor \"");
        sb6.append(str2);
        sb6.append("\" used in message \"");
        sb6.append(str);
        throw new java.lang.RuntimeException(sb6.toString());
    }

    /* renamed from: clone */
    public java.lang.Object m20885x5a5dd5d() {
        return new com.p176xb6135e39.p283xc50a8b8b.q7(this.f126981d, this.f126982e, this.f126983f, this.f126984g, this.f126985h);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getAllFields */
    public java.util.Map mo20727xcee5d904() {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        for (com.p176xb6135e39.p283xc50a8b8b.b4 b4Var : this.f126981d.f127028e.n()) {
            if (mo20729x6ffae80(b4Var)) {
                treeMap.put(b4Var, mo20728x746c4744(b4Var));
            }
        }
        return java.util.Collections.unmodifiableMap(treeMap);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        com.p176xb6135e39.p283xc50a8b8b.s7 s7Var = this.f126981d;
        return new com.p176xb6135e39.p283xc50a8b8b.t7(s7Var, s7Var.f127113b, s7Var.f127115d);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return this.f126981d.f127028e;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getField */
    public java.lang.Object mo20728x746c4744(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        c(b4Var);
        java.lang.Object obj = b4Var.f126442e.f127096f == 1 ? this.f126982e : this.f126983f;
        return b4Var.f126447m == com.p176xb6135e39.p283xc50a8b8b.a4.f126390i ? b4Var.m().m(((java.lang.Integer) obj).intValue()) : obj;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return com.p176xb6135e39.p283xc50a8b8b.wa.f127184e;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: hasField */
    public boolean mo20729x6ffae80(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        c(b4Var);
        return b4Var.f126442e.f127096f == 1 ? this.f126984g : this.f126985h;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: newBuilderForField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20722x4ae2dcac(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        c(b4Var);
        if (b4Var.f126442e.f127096f == 2 && b4Var.f126447m.f126392d == com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE) {
            return ((com.p176xb6135e39.p283xc50a8b8b.k8) this.f126983f).mo20596xab31548();
        }
        java.lang.String str = b4Var.f126443f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 32);
        sb6.append("\"");
        sb6.append(str);
        sb6.append("\" is not a message value field.");
        throw new java.lang.RuntimeException(sb6.toString());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        c(b4Var);
        if (b4Var.f126442e.f127096f == 1) {
            this.f126982e = obj;
            this.f126984g = true;
        } else {
            com.p176xb6135e39.p283xc50a8b8b.a4 a4Var = b4Var.f126447m;
            if (a4Var == com.p176xb6135e39.p283xc50a8b8b.a4.f126390i) {
                obj = java.lang.Integer.valueOf(((com.p176xb6135e39.p283xc50a8b8b.y3) obj).f127260e.f126753f);
            } else if (a4Var == com.p176xb6135e39.p283xc50a8b8b.a4.f126388g && obj != null) {
                com.p176xb6135e39.p283xc50a8b8b.s7 s7Var = this.f126981d;
                if (!s7Var.f127115d.getClass().isInstance(obj)) {
                    obj = ((com.p176xb6135e39.p283xc50a8b8b.k8) s7Var.f127115d).mo20599xaaa148a0().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) obj).mo20556x59bc66e();
                }
            }
            this.f126983f = obj;
            this.f126985h = true;
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: buildPartial */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20557x85702333() {
        return new com.p176xb6135e39.p283xc50a8b8b.t7(this.f126981d, this.f126982e, this.f126983f);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        com.p176xb6135e39.p283xc50a8b8b.s7 s7Var = this.f126981d;
        return new com.p176xb6135e39.p283xc50a8b8b.t7(s7Var, s7Var.f127113b, s7Var.f127115d);
    }
}
