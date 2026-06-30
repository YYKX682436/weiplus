package com.google.protobuf;

/* loaded from: classes16.dex */
public class t8 implements com.google.protobuf.v8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.protobuf.b5 f45553a;

    public t8(com.google.protobuf.b5 b5Var) {
        this.f45553a = b5Var;
    }

    @Override // com.google.protobuf.v8
    public com.google.protobuf.p4 a(com.google.protobuf.q4 q4Var, com.google.protobuf.r3 r3Var, int i17) {
        q4Var.getClass();
        android.support.v4.media.f.a(q4Var.f45447d.get(new com.google.protobuf.o4(r3Var, i17)));
        return null;
    }

    @Override // com.google.protobuf.v8
    public com.google.protobuf.v8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        this.f45553a.a(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.v8
    public com.google.protobuf.zb b(com.google.protobuf.b4 b4Var) {
        return b4Var.t() ? com.google.protobuf.zb.f45810e : com.google.protobuf.zb.f45809d;
    }

    @Override // com.google.protobuf.v8
    public java.lang.Object c(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.google.protobuf.b4 b4Var, com.google.protobuf.k8 k8Var) {
        com.google.protobuf.k8 k8Var2;
        com.google.protobuf.j8 newBuilderForType = k8Var.newBuilderForType();
        if (!b4Var.d1() && (k8Var2 = (com.google.protobuf.k8) this.f45553a.j(b4Var)) != null) {
            newBuilderForType.mergeFrom(k8Var2);
        }
        d0Var.w(newBuilderForType, t4Var);
        return newBuilderForType.buildPartial();
    }

    @Override // com.google.protobuf.v8
    public com.google.protobuf.u8 d() {
        return com.google.protobuf.u8.EXTENSION_SET;
    }

    @Override // com.google.protobuf.v8
    public java.lang.Object e(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.google.protobuf.b4 b4Var, com.google.protobuf.k8 k8Var) {
        com.google.protobuf.k8 k8Var2;
        com.google.protobuf.j8 newBuilderForType = k8Var.newBuilderForType();
        if (!b4Var.d1() && (k8Var2 = (com.google.protobuf.k8) this.f45553a.j(b4Var)) != null) {
            newBuilderForType.mergeFrom(k8Var2);
        }
        d0Var.s(b4Var.f44909e.f45563f, newBuilderForType, t4Var);
        return newBuilderForType.buildPartial();
    }

    @Override // com.google.protobuf.v8
    public com.google.protobuf.v8 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        this.f45553a.v(b4Var, obj);
        return this;
    }
}
