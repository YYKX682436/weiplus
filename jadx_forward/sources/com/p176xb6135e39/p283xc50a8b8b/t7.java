package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class t7 extends com.p176xb6135e39.p283xc50a8b8b.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f127082d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f127083e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.s7 f127084f;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f127085g = -1;

    public t7(com.p176xb6135e39.p283xc50a8b8b.r3 r3Var, com.p176xb6135e39.p283xc50a8b8b.ub ubVar, java.lang.Object obj, com.p176xb6135e39.p283xc50a8b8b.ub ubVar2, java.lang.Object obj2) {
        this.f127082d = obj;
        this.f127083e = obj2;
        this.f127084f = new com.p176xb6135e39.p283xc50a8b8b.s7(r3Var, this, ubVar, ubVar2);
    }

    public final void d(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        com.p176xb6135e39.p283xc50a8b8b.r3 r3Var = b4Var.f126448n;
        com.p176xb6135e39.p283xc50a8b8b.s7 s7Var = this.f127084f;
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

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.q7 mo20596xab31548() {
        com.p176xb6135e39.p283xc50a8b8b.s7 s7Var = this.f127084f;
        return new com.p176xb6135e39.p283xc50a8b8b.q7(s7Var, s7Var.f127113b, s7Var.f127115d, false, false);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getAllFields */
    public java.util.Map mo20727xcee5d904() {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        for (com.p176xb6135e39.p283xc50a8b8b.b4 b4Var : this.f127084f.f127028e.n()) {
            d(b4Var);
            treeMap.put(b4Var, mo20728x746c4744(b4Var));
        }
        return java.util.Collections.unmodifiableMap(treeMap);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        com.p176xb6135e39.p283xc50a8b8b.s7 s7Var = this.f127084f;
        return new com.p176xb6135e39.p283xc50a8b8b.t7(s7Var, s7Var.f127113b, s7Var.f127115d);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return this.f127084f.f127028e;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getField */
    public java.lang.Object mo20728x746c4744(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        d(b4Var);
        java.lang.Object obj = b4Var.f126442e.f127096f == 1 ? this.f127082d : this.f127083e;
        return b4Var.f126447m == com.p176xb6135e39.p283xc50a8b8b.a4.f126390i ? b4Var.m().m(((java.lang.Integer) obj).intValue()) : obj;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        if (this.f127085g != -1) {
            return this.f127085g;
        }
        int a17 = com.p176xb6135e39.p283xc50a8b8b.v7.a(this.f127084f, this.f127082d, this.f127083e);
        this.f127085g = a17;
        return a17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return com.p176xb6135e39.p283xc50a8b8b.wa.f127184e;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: hasField */
    public boolean mo20729x6ffae80(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        d(b4Var);
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public boolean mo20562xf582434a() {
        if (this.f127084f.f127114c.f127130d == com.p176xb6135e39.p283xc50a8b8b.vb.MESSAGE) {
            return ((com.p176xb6135e39.p283xc50a8b8b.o8) this.f127083e).mo20562xf582434a();
        }
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20599xaaa148a0() {
        return new com.p176xb6135e39.p283xc50a8b8b.q7(this.f127084f, this.f127082d, this.f127083e, true, true);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        com.p176xb6135e39.p283xc50a8b8b.v7.d(k0Var, this.f127084f, this.f127082d, this.f127083e);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        com.p176xb6135e39.p283xc50a8b8b.s7 s7Var = this.f127084f;
        return new com.p176xb6135e39.p283xc50a8b8b.t7(s7Var, s7Var.f127113b, s7Var.f127115d);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20599xaaa148a0() {
        return new com.p176xb6135e39.p283xc50a8b8b.q7(this.f127084f, this.f127082d, this.f127083e, true, true);
    }

    public t7(com.p176xb6135e39.p283xc50a8b8b.s7 s7Var, java.lang.Object obj, java.lang.Object obj2) {
        this.f127082d = obj;
        this.f127083e = obj2;
        this.f127084f = s7Var;
    }

    public t7(com.p176xb6135e39.p283xc50a8b8b.s7 s7Var, com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, com.p176xb6135e39.p283xc50a8b8b.p7 p7Var) {
        try {
            this.f127084f = s7Var;
            java.util.AbstractMap.SimpleImmutableEntry simpleImmutableEntry = (java.util.AbstractMap.SimpleImmutableEntry) com.p176xb6135e39.p283xc50a8b8b.v7.b(d0Var, s7Var, t4Var);
            this.f127082d = simpleImmutableEntry.getKey();
            this.f127083e = simpleImmutableEntry.getValue();
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            e17.f127272d = this;
            throw e17;
        } catch (java.io.IOException e18) {
            com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
            y6Var.f127272d = this;
            throw y6Var;
        }
    }
}
