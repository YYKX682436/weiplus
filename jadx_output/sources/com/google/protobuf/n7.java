package com.google.protobuf;

/* loaded from: classes13.dex */
public class n7 implements com.google.protobuf.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.protobuf.m8[] f45338a;

    public n7(com.google.protobuf.m8... m8VarArr) {
        this.f45338a = m8VarArr;
    }

    @Override // com.google.protobuf.m8
    public com.google.protobuf.l8 a(java.lang.Class cls) {
        for (com.google.protobuf.m8 m8Var : this.f45338a) {
            if (m8Var.b(cls)) {
                return m8Var.a(cls);
            }
        }
        java.lang.String name = cls.getName();
        throw new java.lang.UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new java.lang.String("No factory is available for message type: "));
    }

    @Override // com.google.protobuf.m8
    public boolean b(java.lang.Class cls) {
        for (com.google.protobuf.m8 m8Var : this.f45338a) {
            if (m8Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
