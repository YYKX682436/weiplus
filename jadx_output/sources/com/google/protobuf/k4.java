package com.google.protobuf;

/* loaded from: classes16.dex */
public final class k4 extends com.google.protobuf.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.r3 f45258d;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.protobuf.b4[] f45260f;

    /* renamed from: e, reason: collision with root package name */
    public com.google.protobuf.b5 f45259e = new com.google.protobuf.b5();

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.wa f45261g = com.google.protobuf.wa.f45651e;

    public k4(com.google.protobuf.r3 r3Var) {
        this.f45258d = r3Var;
        this.f45260f = new com.google.protobuf.b4[r3Var.f45466d.f()];
        if (r3Var.r().f45229i) {
            for (com.google.protobuf.b4 b4Var : r3Var.n()) {
                if (b4Var.f44914m.f44859d == com.google.protobuf.z3.MESSAGE) {
                    this.f45259e.v(b4Var, com.google.protobuf.l4.d(b4Var.n()));
                } else {
                    this.f45259e.v(b4Var, b4Var.l());
                }
            }
        }
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        e(b4Var);
        com.google.protobuf.b5 b5Var = this.f45259e;
        if (b5Var.f44922b) {
            this.f45259e = b5Var.clone();
        }
        this.f45259e.a(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.l4 build() {
        if (isInitialized()) {
            return buildPartial();
        }
        com.google.protobuf.b5 b5Var = this.f45259e;
        com.google.protobuf.b4[] b4VarArr = this.f45260f;
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) new com.google.protobuf.l4(this.f45258d, b5Var, (com.google.protobuf.b4[]) java.util.Arrays.copyOf(b4VarArr, b4VarArr.length), this.f45261g));
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.l4 buildPartial() {
        this.f45259e.s();
        com.google.protobuf.b5 b5Var = this.f45259e;
        com.google.protobuf.b4[] b4VarArr = this.f45260f;
        return new com.google.protobuf.l4(this.f45258d, b5Var, (com.google.protobuf.b4[]) java.util.Arrays.copyOf(b4VarArr, b4VarArr.length), this.f45261g);
    }

    public java.lang.Object clone() {
        com.google.protobuf.k4 k4Var = new com.google.protobuf.k4(this.f45258d);
        k4Var.f45259e.t(this.f45259e);
        com.google.protobuf.wa waVar = this.f45261g;
        com.google.protobuf.wa waVar2 = k4Var.f45261g;
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        b17.f(waVar2);
        b17.f(waVar);
        k4Var.f45261g = b17.build();
        com.google.protobuf.b4[] b4VarArr = this.f45260f;
        java.lang.System.arraycopy(b4VarArr, 0, k4Var.f45260f, 0, b4VarArr.length);
        return k4Var;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.k4 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (!(k8Var instanceof com.google.protobuf.l4)) {
            return (com.google.protobuf.k4) super.mergeFrom(k8Var);
        }
        com.google.protobuf.l4 l4Var = (com.google.protobuf.l4) k8Var;
        if (l4Var.f45286d != this.f45258d) {
            throw new java.lang.IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
        }
        com.google.protobuf.b5 b5Var = this.f45259e;
        if (b5Var.f44922b) {
            this.f45259e = b5Var.clone();
        }
        this.f45259e.t(l4Var.f45287e);
        com.google.protobuf.wa waVar = this.f45261g;
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        b17.f(waVar);
        b17.f(l4Var.f45289g);
        this.f45261g = b17.build();
        int i17 = 0;
        while (true) {
            com.google.protobuf.b4[] b4VarArr = this.f45260f;
            if (i17 >= b4VarArr.length) {
                return this;
            }
            com.google.protobuf.b4 b4Var = b4VarArr[i17];
            com.google.protobuf.b4[] b4VarArr2 = l4Var.f45288f;
            if (b4Var == null) {
                b4VarArr[i17] = b4VarArr2[i17];
            } else {
                com.google.protobuf.b4 b4Var2 = b4VarArr2[i17];
                if (b4Var2 != null && b4Var != b4Var2) {
                    com.google.protobuf.b5 b5Var2 = this.f45259e;
                    com.google.protobuf.ba baVar = b5Var2.f44921a;
                    baVar.remove(b4Var);
                    if (baVar.isEmpty()) {
                        b5Var2.f44923c = false;
                    }
                    b4VarArr[i17] = b4VarArr2[i17];
                }
            }
            i17++;
        }
    }

    public final void e(com.google.protobuf.b4 b4Var) {
        if (b4Var.f44915n != this.f45258d) {
            throw new java.lang.IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    @Override // com.google.protobuf.r8
    public java.util.Map getAllFields() {
        return this.f45259e.i();
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.l4.d(this.f45258d);
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return this.f45258d;
    }

    @Override // com.google.protobuf.r8
    public java.lang.Object getField(com.google.protobuf.b4 b4Var) {
        e(b4Var);
        java.lang.Object j17 = this.f45259e.j(b4Var);
        return j17 == null ? b4Var.d1() ? java.util.Collections.emptyList() : b4Var.f44914m.f44859d == com.google.protobuf.z3.MESSAGE ? com.google.protobuf.l4.d(b4Var.n()) : b4Var.l() : j17;
    }

    @Override // com.google.protobuf.r8
    public com.google.protobuf.wa getUnknownFields() {
        return this.f45261g;
    }

    @Override // com.google.protobuf.r8
    public boolean hasField(com.google.protobuf.b4 b4Var) {
        e(b4Var);
        return this.f45259e.n(b4Var);
    }

    @Override // com.google.protobuf.p8
    public boolean isInitialized() {
        return com.google.protobuf.l4.e(this.f45258d, this.f45259e);
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m468mergeUnknownFields(com.google.protobuf.wa waVar) {
        com.google.protobuf.wa waVar2 = this.f45261g;
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        b17.f(waVar2);
        b17.f(waVar);
        this.f45261g = b17.build();
        return this;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 newBuilderForField(com.google.protobuf.b4 b4Var) {
        e(b4Var);
        if (b4Var.f44914m.f44859d == com.google.protobuf.z3.MESSAGE) {
            return new com.google.protobuf.k4(b4Var.n());
        }
        throw new java.lang.IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        e(b4Var);
        com.google.protobuf.b5 b5Var = this.f45259e;
        if (b5Var.f44922b) {
            this.f45259e = b5Var.clone();
        }
        if (b4Var.f44914m == com.google.protobuf.a4.f44857i) {
            if (b4Var.d1()) {
                for (java.lang.Object obj2 : (java.util.List) obj) {
                    java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
                    obj2.getClass();
                    if (!(obj2 instanceof com.google.protobuf.y3)) {
                        throw new java.lang.IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
                    }
                }
            } else {
                java.nio.charset.Charset charset2 = com.google.protobuf.w6.f45648a;
                obj.getClass();
                if (!(obj instanceof com.google.protobuf.y3)) {
                    throw new java.lang.IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
                }
            }
        }
        com.google.protobuf.g4 g4Var = b4Var.f44917p;
        if (g4Var != null) {
            com.google.protobuf.b4[] b4VarArr = this.f45260f;
            int i17 = g4Var.f45127d;
            com.google.protobuf.b4 b4Var2 = b4VarArr[i17];
            if (b4Var2 != null && b4Var2 != b4Var) {
                com.google.protobuf.b5 b5Var2 = this.f45259e;
                com.google.protobuf.ba baVar = b5Var2.f44921a;
                baVar.remove(b4Var2);
                if (baVar.isEmpty()) {
                    b5Var2.f44923c = false;
                }
            }
            b4VarArr[i17] = b4Var;
        } else if (b4Var.f44911g.m() == com.google.protobuf.c4.PROTO3 && !b4Var.d1() && b4Var.f44914m.f44859d != com.google.protobuf.z3.MESSAGE && obj.equals(b4Var.l())) {
            com.google.protobuf.b5 b5Var3 = this.f45259e;
            com.google.protobuf.ba baVar2 = b5Var3.f44921a;
            baVar2.remove(b4Var);
            if (baVar2.isEmpty()) {
                b5Var3.f44923c = false;
            }
            return this;
        }
        this.f45259e.v(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setUnknownFields(com.google.protobuf.wa waVar) {
        this.f45261g = waVar;
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return com.google.protobuf.l4.d(this.f45258d);
    }
}
