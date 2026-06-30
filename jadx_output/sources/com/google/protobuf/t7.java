package com.google.protobuf;

/* loaded from: classes16.dex */
public final class t7 extends com.google.protobuf.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f45549d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f45550e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.protobuf.s7 f45551f;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f45552g = -1;

    public t7(com.google.protobuf.r3 r3Var, com.google.protobuf.ub ubVar, java.lang.Object obj, com.google.protobuf.ub ubVar2, java.lang.Object obj2) {
        this.f45549d = obj;
        this.f45550e = obj2;
        this.f45551f = new com.google.protobuf.s7(r3Var, this, ubVar, ubVar2);
    }

    public final void d(com.google.protobuf.b4 b4Var) {
        com.google.protobuf.r3 r3Var = b4Var.f44915n;
        com.google.protobuf.s7 s7Var = this.f45551f;
        if (r3Var == s7Var.f45495e) {
            return;
        }
        java.lang.String str = s7Var.f45495e.f45467e;
        java.lang.String str2 = b4Var.f44910f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 42 + java.lang.String.valueOf(str).length());
        sb6.append("Wrong FieldDescriptor \"");
        sb6.append(str2);
        sb6.append("\" used in message \"");
        sb6.append(str);
        throw new java.lang.RuntimeException(sb6.toString());
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.q7 newBuilderForType() {
        com.google.protobuf.s7 s7Var = this.f45551f;
        return new com.google.protobuf.q7(s7Var, s7Var.f45580b, s7Var.f45582d, false, false);
    }

    @Override // com.google.protobuf.r8
    public java.util.Map getAllFields() {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        for (com.google.protobuf.b4 b4Var : this.f45551f.f45495e.n()) {
            d(b4Var);
            treeMap.put(b4Var, getField(b4Var));
        }
        return java.util.Collections.unmodifiableMap(treeMap);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        com.google.protobuf.s7 s7Var = this.f45551f;
        return new com.google.protobuf.t7(s7Var, s7Var.f45580b, s7Var.f45582d);
    }

    @Override // com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return this.f45551f.f45495e;
    }

    @Override // com.google.protobuf.r8
    public java.lang.Object getField(com.google.protobuf.b4 b4Var) {
        d(b4Var);
        java.lang.Object obj = b4Var.f44909e.f45563f == 1 ? this.f45549d : this.f45550e;
        return b4Var.f44914m == com.google.protobuf.a4.f44857i ? b4Var.m().m(((java.lang.Integer) obj).intValue()) : obj;
    }

    @Override // com.google.protobuf.o8
    public int getSerializedSize() {
        if (this.f45552g != -1) {
            return this.f45552g;
        }
        int a17 = com.google.protobuf.v7.a(this.f45551f, this.f45549d, this.f45550e);
        this.f45552g = a17;
        return a17;
    }

    @Override // com.google.protobuf.r8
    public com.google.protobuf.wa getUnknownFields() {
        return com.google.protobuf.wa.f45651e;
    }

    @Override // com.google.protobuf.r8
    public boolean hasField(com.google.protobuf.b4 b4Var) {
        d(b4Var);
        return true;
    }

    @Override // com.google.protobuf.p8
    public boolean isInitialized() {
        if (this.f45551f.f45581c.f45597d == com.google.protobuf.vb.MESSAGE) {
            return ((com.google.protobuf.o8) this.f45550e).isInitialized();
        }
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 toBuilder() {
        return new com.google.protobuf.q7(this.f45551f, this.f45549d, this.f45550e, true, true);
    }

    @Override // com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.v7.d(k0Var, this.f45551f, this.f45549d, this.f45550e);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        com.google.protobuf.s7 s7Var = this.f45551f;
        return new com.google.protobuf.t7(s7Var, s7Var.f45580b, s7Var.f45582d);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 toBuilder() {
        return new com.google.protobuf.q7(this.f45551f, this.f45549d, this.f45550e, true, true);
    }

    public t7(com.google.protobuf.s7 s7Var, java.lang.Object obj, java.lang.Object obj2) {
        this.f45549d = obj;
        this.f45550e = obj2;
        this.f45551f = s7Var;
    }

    public t7(com.google.protobuf.s7 s7Var, com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.google.protobuf.p7 p7Var) {
        try {
            this.f45551f = s7Var;
            java.util.AbstractMap.SimpleImmutableEntry simpleImmutableEntry = (java.util.AbstractMap.SimpleImmutableEntry) com.google.protobuf.v7.b(d0Var, s7Var, t4Var);
            this.f45549d = simpleImmutableEntry.getKey();
            this.f45550e = simpleImmutableEntry.getValue();
        } catch (com.google.protobuf.y6 e17) {
            e17.f45739d = this;
            throw e17;
        } catch (java.io.IOException e18) {
            com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
            y6Var.f45739d = this;
            throw y6Var;
        }
    }
}
