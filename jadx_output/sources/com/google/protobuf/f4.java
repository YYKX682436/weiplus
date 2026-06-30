package com.google.protobuf;

/* loaded from: classes16.dex */
public final class f4 extends com.google.protobuf.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.m2 f45074d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f45075e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.protobuf.d4 f45076f;

    public f4(com.google.protobuf.m2 m2Var, com.google.protobuf.d4 d4Var, com.google.protobuf.h4 h4Var, int i17, com.google.protobuf.q3 q3Var) {
        super(null);
        this.f45074d = m2Var;
        this.f45076f = d4Var;
        java.lang.String str = h4Var.f45161e;
        java.lang.String name = m2Var.getName();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(name).length());
        sb6.append(str);
        sb6.append('.');
        sb6.append(name);
        this.f45075e = sb6.toString();
        d4Var.f45010m.b(this);
    }

    @Override // com.google.protobuf.e4
    public java.lang.String getName() {
        return this.f45074d.getName();
    }

    @Override // com.google.protobuf.e4
    public com.google.protobuf.d4 h() {
        return this.f45076f;
    }

    @Override // com.google.protobuf.e4
    public java.lang.String i() {
        return this.f45075e;
    }

    @Override // com.google.protobuf.e4
    public com.google.protobuf.k8 j() {
        return this.f45074d;
    }
}
