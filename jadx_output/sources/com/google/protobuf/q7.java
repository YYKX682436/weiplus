package com.google.protobuf;

/* loaded from: classes16.dex */
public class q7 extends com.google.protobuf.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.s7 f45448d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f45449e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f45450f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45451g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f45452h;

    public q7(com.google.protobuf.s7 s7Var, java.lang.Object obj, java.lang.Object obj2, boolean z17, boolean z18) {
        this.f45448d = s7Var;
        this.f45449e = obj;
        this.f45450f = obj2;
        this.f45451g = z17;
        this.f45452h = z18;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        throw new java.lang.RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.t7 build() {
        com.google.protobuf.t7 t7Var = new com.google.protobuf.t7(this.f45448d, this.f45449e, this.f45450f);
        if (t7Var.isInitialized()) {
            return t7Var;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) t7Var);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 buildPartial() {
        return new com.google.protobuf.t7(this.f45448d, this.f45449e, this.f45450f);
    }

    public final void c(com.google.protobuf.b4 b4Var) {
        com.google.protobuf.r3 r3Var = b4Var.f44915n;
        com.google.protobuf.s7 s7Var = this.f45448d;
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

    public java.lang.Object clone() {
        return new com.google.protobuf.q7(this.f45448d, this.f45449e, this.f45450f, this.f45451g, this.f45452h);
    }

    @Override // com.google.protobuf.r8
    public java.util.Map getAllFields() {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        for (com.google.protobuf.b4 b4Var : this.f45448d.f45495e.n()) {
            if (hasField(b4Var)) {
                treeMap.put(b4Var, getField(b4Var));
            }
        }
        return java.util.Collections.unmodifiableMap(treeMap);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        com.google.protobuf.s7 s7Var = this.f45448d;
        return new com.google.protobuf.t7(s7Var, s7Var.f45580b, s7Var.f45582d);
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return this.f45448d.f45495e;
    }

    @Override // com.google.protobuf.r8
    public java.lang.Object getField(com.google.protobuf.b4 b4Var) {
        c(b4Var);
        java.lang.Object obj = b4Var.f44909e.f45563f == 1 ? this.f45449e : this.f45450f;
        return b4Var.f44914m == com.google.protobuf.a4.f44857i ? b4Var.m().m(((java.lang.Integer) obj).intValue()) : obj;
    }

    @Override // com.google.protobuf.r8
    public com.google.protobuf.wa getUnknownFields() {
        return com.google.protobuf.wa.f45651e;
    }

    @Override // com.google.protobuf.r8
    public boolean hasField(com.google.protobuf.b4 b4Var) {
        c(b4Var);
        return b4Var.f44909e.f45563f == 1 ? this.f45451g : this.f45452h;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 newBuilderForField(com.google.protobuf.b4 b4Var) {
        c(b4Var);
        if (b4Var.f44909e.f45563f == 2 && b4Var.f44914m.f44859d == com.google.protobuf.z3.MESSAGE) {
            return ((com.google.protobuf.k8) this.f45450f).newBuilderForType();
        }
        java.lang.String str = b4Var.f44910f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 32);
        sb6.append("\"");
        sb6.append(str);
        sb6.append("\" is not a message value field.");
        throw new java.lang.RuntimeException(sb6.toString());
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        c(b4Var);
        if (b4Var.f44909e.f45563f == 1) {
            this.f45449e = obj;
            this.f45451g = true;
        } else {
            com.google.protobuf.a4 a4Var = b4Var.f44914m;
            if (a4Var == com.google.protobuf.a4.f44857i) {
                obj = java.lang.Integer.valueOf(((com.google.protobuf.y3) obj).f45727e.f45220f);
            } else if (a4Var == com.google.protobuf.a4.f44855g && obj != null) {
                com.google.protobuf.s7 s7Var = this.f45448d;
                if (!s7Var.f45582d.getClass().isInstance(obj)) {
                    obj = ((com.google.protobuf.k8) s7Var.f45582d).toBuilder().mergeFrom((com.google.protobuf.k8) obj).build();
                }
            }
            this.f45450f = obj;
            this.f45452h = true;
        }
        return this;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setUnknownFields(com.google.protobuf.wa waVar) {
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 buildPartial() {
        return new com.google.protobuf.t7(this.f45448d, this.f45449e, this.f45450f);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        com.google.protobuf.s7 s7Var = this.f45448d;
        return new com.google.protobuf.t7(s7Var, s7Var.f45580b, s7Var.f45582d);
    }
}
