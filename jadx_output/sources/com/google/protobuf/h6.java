package com.google.protobuf;

/* loaded from: classes16.dex */
public final class h6 extends com.google.protobuf.g6 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Method f45164f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Method f45165g;

    public h6(com.google.protobuf.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2, java.lang.String str2) {
        super(b4Var, str, cls, cls2, str2);
        this.f45164f = com.google.protobuf.l6.access$1000(this.f45135a, "newBuilder", new java.lang.Class[0]);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 10);
        sb6.append("get");
        sb6.append(str);
        sb6.append("Builder");
        this.f45165g = com.google.protobuf.l6.access$1000(cls2, sb6.toString(), new java.lang.Class[0]);
    }

    @Override // com.google.protobuf.g6, com.google.protobuf.v5
    public void c(com.google.protobuf.q5 q5Var, java.lang.Object obj) {
        if (!this.f45135a.isInstance(obj)) {
            obj = ((com.google.protobuf.j8) com.google.protobuf.l6.access$1100(this.f45164f, null, new java.lang.Object[0])).mergeFrom((com.google.protobuf.k8) obj).buildPartial();
        }
        super.c(q5Var, obj);
    }

    @Override // com.google.protobuf.g6, com.google.protobuf.v5
    public com.google.protobuf.j8 l(com.google.protobuf.q5 q5Var) {
        return (com.google.protobuf.j8) com.google.protobuf.l6.access$1100(this.f45165g, q5Var, new java.lang.Object[0]);
    }

    @Override // com.google.protobuf.g6, com.google.protobuf.v5
    public com.google.protobuf.j8 newBuilder() {
        return (com.google.protobuf.j8) com.google.protobuf.l6.access$1100(this.f45164f, null, new java.lang.Object[0]);
    }
}
