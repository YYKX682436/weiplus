package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class u5 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.b5 f45578d;

    public u5() {
        this.f45578d = new com.google.protobuf.b5();
    }

    private void j(com.google.protobuf.b4 b4Var) {
        if (b4Var.f44915n != getDescriptorForType()) {
            throw new java.lang.IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    public boolean f() {
        return this.f45578d.o();
    }

    public int g() {
        return this.f45578d.m();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.r8
    public java.util.Map getAllFields() {
        java.util.Map d17;
        d17 = d(false);
        d17.putAll(h());
        return java.util.Collections.unmodifiableMap(d17);
    }

    @Override // com.google.protobuf.l6
    public java.util.Map getAllFieldsRaw() {
        java.util.Map d17;
        d17 = d(false);
        d17.putAll(h());
        return java.util.Collections.unmodifiableMap(d17);
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.r8
    public java.lang.Object getField(com.google.protobuf.b4 b4Var) {
        if (!b4Var.o()) {
            return super.getField(b4Var);
        }
        j(b4Var);
        java.lang.Object j17 = this.f45578d.j(b4Var);
        return j17 == null ? b4Var.d1() ? java.util.Collections.emptyList() : b4Var.f44914m.f44859d == com.google.protobuf.z3.MESSAGE ? com.google.protobuf.l4.d(b4Var.n()) : b4Var.l() : j17;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object getRepeatedField(com.google.protobuf.b4 b4Var, int i17) {
        if (!b4Var.o()) {
            return super.getRepeatedField(b4Var, i17);
        }
        j(b4Var);
        com.google.protobuf.b5 b5Var = this.f45578d;
        b5Var.getClass();
        if (!b4Var.d1()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object j17 = b5Var.j(b4Var);
        if (j17 != null) {
            return ((java.util.List) j17).get(i17);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // com.google.protobuf.l6
    public int getRepeatedFieldCount(com.google.protobuf.b4 b4Var) {
        if (!b4Var.o()) {
            return super.getRepeatedFieldCount(b4Var);
        }
        j(b4Var);
        com.google.protobuf.b5 b5Var = this.f45578d;
        b5Var.getClass();
        if (!b4Var.d1()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object j17 = b5Var.j(b4Var);
        if (j17 == null) {
            return 0;
        }
        return ((java.util.List) j17).size();
    }

    public java.util.Map h() {
        return this.f45578d.i();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.r8
    public boolean hasField(com.google.protobuf.b4 b4Var) {
        if (!b4Var.o()) {
            return super.hasField(b4Var);
        }
        j(b4Var);
        return this.f45578d.n(b4Var);
    }

    public com.google.protobuf.t5 i() {
        return new com.google.protobuf.t5(this, false, null);
    }

    @Override // com.google.protobuf.l6
    public void makeExtensionsImmutable() {
        this.f45578d.s();
    }

    @Override // com.google.protobuf.l6
    public boolean parseUnknownField(com.google.protobuf.d0 d0Var, com.google.protobuf.sa saVar, com.google.protobuf.t4 t4Var, int i17) {
        d0Var.getClass();
        return com.google.protobuf.w8.c(d0Var, saVar, t4Var, getDescriptorForType(), new com.google.protobuf.t8(this.f45578d), i17);
    }

    @Override // com.google.protobuf.l6
    public boolean parseUnknownFieldProto3(com.google.protobuf.d0 d0Var, com.google.protobuf.sa saVar, com.google.protobuf.t4 t4Var, int i17) {
        return parseUnknownField(d0Var, saVar, t4Var, i17);
    }

    public u5(com.google.protobuf.s5 s5Var) {
        super(s5Var);
        com.google.protobuf.b5 b5Var;
        com.google.protobuf.z4 z4Var = s5Var.f45494d;
        if (z4Var == null) {
            b5Var = com.google.protobuf.b5.f44920d;
        } else if (z4Var.f45787a.isEmpty()) {
            b5Var = com.google.protobuf.b5.f44920d;
        } else {
            z4Var.f45789c = false;
            com.google.protobuf.ba baVar = z4Var.f45787a;
            if (z4Var.f45790d) {
                baVar = com.google.protobuf.b5.c(baVar, false);
                com.google.protobuf.z4.g(baVar);
            }
            com.google.protobuf.b5 b5Var2 = new com.google.protobuf.b5(baVar);
            b5Var2.f44923c = z4Var.f45788b;
            b5Var = b5Var2;
        }
        this.f45578d = b5Var;
    }
}
