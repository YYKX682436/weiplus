package com.google.protobuf;

/* loaded from: classes16.dex */
public final class l4 extends com.google.protobuf.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.r3 f45286d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.protobuf.b5 f45287e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.protobuf.b4[] f45288f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.protobuf.wa f45289g;

    /* renamed from: h, reason: collision with root package name */
    public int f45290h = -1;

    public l4(com.google.protobuf.r3 r3Var, com.google.protobuf.b5 b5Var, com.google.protobuf.b4[] b4VarArr, com.google.protobuf.wa waVar) {
        this.f45286d = r3Var;
        this.f45287e = b5Var;
        this.f45288f = b4VarArr;
        this.f45289g = waVar;
    }

    public static com.google.protobuf.l4 d(com.google.protobuf.r3 r3Var) {
        return new com.google.protobuf.l4(r3Var, com.google.protobuf.b5.f44920d, new com.google.protobuf.b4[r3Var.f45466d.f()], com.google.protobuf.wa.f45651e);
    }

    public static boolean e(com.google.protobuf.r3 r3Var, com.google.protobuf.b5 b5Var) {
        for (com.google.protobuf.b4 b4Var : r3Var.n()) {
            if (b4Var.s() && !b5Var.n(b4Var)) {
                return false;
            }
        }
        return b5Var.o();
    }

    @Override // com.google.protobuf.r8
    public java.util.Map getAllFields() {
        return this.f45287e.i();
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return d(this.f45286d);
    }

    @Override // com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return this.f45286d;
    }

    @Override // com.google.protobuf.r8
    public java.lang.Object getField(com.google.protobuf.b4 b4Var) {
        if (b4Var.f44915n != this.f45286d) {
            throw new java.lang.IllegalArgumentException("FieldDescriptor does not match message type.");
        }
        java.lang.Object j17 = this.f45287e.j(b4Var);
        return j17 == null ? b4Var.d1() ? java.util.Collections.emptyList() : b4Var.f44914m.f44859d == com.google.protobuf.z3.MESSAGE ? d(b4Var.n()) : b4Var.l() : j17;
    }

    @Override // com.google.protobuf.o8
    public int getSerializedSize() {
        int m17;
        int serializedSize;
        int i17 = this.f45290h;
        if (i17 != -1) {
            return i17;
        }
        boolean z17 = this.f45286d.r().f45226f;
        com.google.protobuf.wa waVar = this.f45289g;
        com.google.protobuf.b5 b5Var = this.f45287e;
        if (z17) {
            m17 = b5Var.k();
            serializedSize = waVar.a();
        } else {
            m17 = b5Var.m();
            serializedSize = waVar.getSerializedSize();
        }
        int i18 = m17 + serializedSize;
        this.f45290h = i18;
        return i18;
    }

    @Override // com.google.protobuf.r8
    public com.google.protobuf.wa getUnknownFields() {
        return this.f45289g;
    }

    @Override // com.google.protobuf.r8
    public boolean hasField(com.google.protobuf.b4 b4Var) {
        if (b4Var.f44915n == this.f45286d) {
            return this.f45287e.n(b4Var);
        }
        throw new java.lang.IllegalArgumentException("FieldDescriptor does not match message type.");
    }

    @Override // com.google.protobuf.p8
    public boolean isInitialized() {
        return e(this.f45286d, this.f45287e);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return new com.google.protobuf.k4(this.f45286d);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 toBuilder() {
        return new com.google.protobuf.k4(this.f45286d).mergeFrom(this);
    }

    @Override // com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.ba baVar;
        com.google.protobuf.ba baVar2;
        boolean z17 = this.f45286d.r().f45226f;
        com.google.protobuf.wa waVar = this.f45289g;
        int i17 = 0;
        com.google.protobuf.b5 b5Var = this.f45287e;
        if (z17) {
            while (true) {
                baVar2 = b5Var.f44921a;
                if (i17 >= baVar2.d()) {
                    break;
                }
                b5Var.z(baVar2.c(i17), k0Var);
                i17++;
            }
            java.util.Iterator it = baVar2.e().iterator();
            while (it.hasNext()) {
                b5Var.z((java.util.Map.Entry) it.next(), k0Var);
            }
            waVar.c(k0Var);
            return;
        }
        while (true) {
            baVar = b5Var.f44921a;
            if (i17 >= baVar.d()) {
                break;
            }
            java.util.Map.Entry c17 = baVar.c(i17);
            com.google.protobuf.b5.y((com.google.protobuf.a5) c17.getKey(), c17.getValue(), k0Var);
            i17++;
        }
        for (java.util.Map.Entry entry : baVar.e()) {
            com.google.protobuf.b5.y((com.google.protobuf.a5) entry.getKey(), entry.getValue(), k0Var);
        }
        waVar.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return d(this.f45286d);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return new com.google.protobuf.k4(this.f45286d);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 toBuilder() {
        return new com.google.protobuf.k4(this.f45286d).mergeFrom(this);
    }
}
