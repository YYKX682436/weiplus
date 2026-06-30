package com.google.protobuf;

/* loaded from: classes16.dex */
public final class c6 extends com.google.protobuf.b6 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f44982c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f44983d;

    public c6(com.google.protobuf.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2) {
        super(b4Var, str, cls, cls2);
        this.f44982c = com.google.protobuf.l6.access$1000(this.f44924a, "newBuilder", new java.lang.Class[0]);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 10);
        sb6.append("get");
        sb6.append(str);
        sb6.append("Builder");
        this.f44983d = com.google.protobuf.l6.access$1000(cls2, sb6.toString(), new java.lang.Class[]{java.lang.Integer.TYPE});
    }

    @Override // com.google.protobuf.b6, com.google.protobuf.v5
    public void d(com.google.protobuf.q5 q5Var, java.lang.Object obj) {
        super.d(q5Var, p(obj));
    }

    @Override // com.google.protobuf.b6, com.google.protobuf.v5
    public void f(com.google.protobuf.q5 q5Var, int i17, java.lang.Object obj) {
        super.f(q5Var, i17, p(obj));
    }

    @Override // com.google.protobuf.b6, com.google.protobuf.v5
    public com.google.protobuf.j8 i(com.google.protobuf.q5 q5Var, int i17) {
        return (com.google.protobuf.j8) com.google.protobuf.l6.access$1100(this.f44983d, q5Var, new java.lang.Object[]{java.lang.Integer.valueOf(i17)});
    }

    @Override // com.google.protobuf.b6, com.google.protobuf.v5
    public com.google.protobuf.j8 newBuilder() {
        return (com.google.protobuf.j8) com.google.protobuf.l6.access$1100(this.f44982c, null, new java.lang.Object[0]);
    }

    public final java.lang.Object p(java.lang.Object obj) {
        if (this.f44924a.isInstance(obj)) {
            return obj;
        }
        return ((com.google.protobuf.j8) com.google.protobuf.l6.access$1100(this.f44982c, null, new java.lang.Object[0])).mergeFrom((com.google.protobuf.k8) obj).build();
    }
}
