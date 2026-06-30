package com.google.protobuf;

/* loaded from: classes16.dex */
public final class j5 implements com.google.protobuf.a5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.q6 f45235d;

    /* renamed from: e, reason: collision with root package name */
    public final int f45236e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.protobuf.ub f45237f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f45238g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f45239h;

    public j5(com.google.protobuf.q6 q6Var, int i17, com.google.protobuf.ub ubVar, boolean z17, boolean z18) {
        this.f45235d = q6Var;
        this.f45236e = i17;
        this.f45237f = ubVar;
        this.f45238g = z17;
        this.f45239h = z18;
    }

    @Override // com.google.protobuf.a5
    public boolean C1() {
        return this.f45239h;
    }

    @Override // com.google.protobuf.a5
    public com.google.protobuf.ub P() {
        return this.f45237f;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f45236e - ((com.google.protobuf.j5) obj).f45236e;
    }

    @Override // com.google.protobuf.a5
    public boolean d1() {
        return this.f45238g;
    }

    @Override // com.google.protobuf.a5
    public int getNumber() {
        return this.f45236e;
    }

    @Override // com.google.protobuf.a5
    public com.google.protobuf.n8 q(com.google.protobuf.n8 n8Var, com.google.protobuf.o8 o8Var) {
        return ((com.google.protobuf.h5) n8Var).mergeFrom((com.google.protobuf.n5) o8Var);
    }

    @Override // com.google.protobuf.a5
    public com.google.protobuf.vb u0() {
        return this.f45237f.f45597d;
    }
}
