package com.google.protobuf;

/* loaded from: classes16.dex */
public class b6 implements com.google.protobuf.v5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f44924a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.protobuf.z5 f44925b;

    public b6(com.google.protobuf.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2) {
        com.google.protobuf.a6 a6Var = new com.google.protobuf.a6(b4Var, str, cls, cls2);
        this.f44924a = a6Var.f44862c.getReturnType();
        this.f44925b = a6Var;
    }

    @Override // com.google.protobuf.v5
    public java.lang.Object a(com.google.protobuf.l6 l6Var) {
        return m(l6Var);
    }

    @Override // com.google.protobuf.v5
    public int b(com.google.protobuf.l6 l6Var) {
        return ((java.lang.Integer) com.google.protobuf.l6.access$1100(((com.google.protobuf.a6) this.f44925b).f44866g, l6Var, new java.lang.Object[0])).intValue();
    }

    @Override // com.google.protobuf.v5
    public void c(com.google.protobuf.q5 q5Var, java.lang.Object obj) {
        k(q5Var);
        java.util.Iterator it = ((java.util.List) obj).iterator();
        while (it.hasNext()) {
            d(q5Var, it.next());
        }
    }

    @Override // com.google.protobuf.v5
    public void d(com.google.protobuf.q5 q5Var, java.lang.Object obj) {
        com.google.protobuf.l6.access$1100(((com.google.protobuf.a6) this.f44925b).f44865f, q5Var, new java.lang.Object[]{obj});
    }

    @Override // com.google.protobuf.v5
    public boolean e(com.google.protobuf.l6 l6Var) {
        throw new java.lang.UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // com.google.protobuf.v5
    public void f(com.google.protobuf.q5 q5Var, int i17, java.lang.Object obj) {
        com.google.protobuf.a6 a6Var = (com.google.protobuf.a6) this.f44925b;
        com.google.protobuf.l6.access$1100(a6Var.f44864e, q5Var, new java.lang.Object[]{java.lang.Integer.valueOf(i17), obj});
    }

    @Override // com.google.protobuf.v5
    public java.lang.Object g(com.google.protobuf.q5 q5Var, int i17) {
        com.google.protobuf.a6 a6Var = (com.google.protobuf.a6) this.f44925b;
        return com.google.protobuf.l6.access$1100(a6Var.f44863d, q5Var, new java.lang.Object[]{java.lang.Integer.valueOf(i17)});
    }

    @Override // com.google.protobuf.v5
    public boolean h(com.google.protobuf.q5 q5Var) {
        throw new java.lang.UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // com.google.protobuf.v5
    public com.google.protobuf.j8 i(com.google.protobuf.q5 q5Var, int i17) {
        throw new java.lang.UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }

    @Override // com.google.protobuf.v5
    public int j(com.google.protobuf.q5 q5Var) {
        return ((java.lang.Integer) com.google.protobuf.l6.access$1100(((com.google.protobuf.a6) this.f44925b).f44867h, q5Var, new java.lang.Object[0])).intValue();
    }

    @Override // com.google.protobuf.v5
    public void k(com.google.protobuf.q5 q5Var) {
        com.google.protobuf.l6.access$1100(((com.google.protobuf.a6) this.f44925b).f44868i, q5Var, new java.lang.Object[0]);
    }

    @Override // com.google.protobuf.v5
    public com.google.protobuf.j8 l(com.google.protobuf.q5 q5Var) {
        throw new java.lang.UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // com.google.protobuf.v5
    public java.lang.Object m(com.google.protobuf.l6 l6Var) {
        return com.google.protobuf.l6.access$1100(((com.google.protobuf.a6) this.f44925b).f44860a, l6Var, new java.lang.Object[0]);
    }

    @Override // com.google.protobuf.v5
    public java.lang.Object n(com.google.protobuf.q5 q5Var) {
        return com.google.protobuf.l6.access$1100(((com.google.protobuf.a6) this.f44925b).f44861b, q5Var, new java.lang.Object[0]);
    }

    @Override // com.google.protobuf.v5
    public com.google.protobuf.j8 newBuilder() {
        throw new java.lang.UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // com.google.protobuf.v5
    public java.lang.Object o(com.google.protobuf.l6 l6Var, int i17) {
        com.google.protobuf.a6 a6Var = (com.google.protobuf.a6) this.f44925b;
        return com.google.protobuf.l6.access$1100(a6Var.f44862c, l6Var, new java.lang.Object[]{java.lang.Integer.valueOf(i17)});
    }
}
