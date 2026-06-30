package com.google.protobuf;

/* loaded from: classes16.dex */
public class w5 implements com.google.protobuf.v5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.protobuf.b4 f45646a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.protobuf.k8 f45647b;

    public w5(com.google.protobuf.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2) {
        this.f45646a = b4Var;
        this.f45647b = ((com.google.protobuf.x7) ((com.google.protobuf.l6) com.google.protobuf.l6.access$1100(com.google.protobuf.l6.access$1000(cls, "getDefaultInstance", new java.lang.Class[0]), null, new java.lang.Object[0])).internalGetMapField(b4Var.f44909e.f45563f).f45029e).f45684a;
    }

    @Override // com.google.protobuf.v5
    public java.lang.Object a(com.google.protobuf.l6 l6Var) {
        return m(l6Var);
    }

    @Override // com.google.protobuf.v5
    public int b(com.google.protobuf.l6 l6Var) {
        return l6Var.internalGetMapField(this.f45646a.f44909e.f45563f).d().size();
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
        q5Var.internalGetMutableMapField(this.f45646a.f44909e.f45563f).f().add(p((com.google.protobuf.k8) obj));
    }

    @Override // com.google.protobuf.v5
    public boolean e(com.google.protobuf.l6 l6Var) {
        throw new java.lang.UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // com.google.protobuf.v5
    public void f(com.google.protobuf.q5 q5Var, int i17, java.lang.Object obj) {
        q5Var.internalGetMutableMapField(this.f45646a.f44909e.f45563f).f().set(i17, p((com.google.protobuf.k8) obj));
    }

    @Override // com.google.protobuf.v5
    public java.lang.Object g(com.google.protobuf.q5 q5Var, int i17) {
        return q5Var.internalGetMapField(this.f45646a.f44909e.f45563f).d().get(i17);
    }

    @Override // com.google.protobuf.v5
    public boolean h(com.google.protobuf.q5 q5Var) {
        throw new java.lang.UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // com.google.protobuf.v5
    public com.google.protobuf.j8 i(com.google.protobuf.q5 q5Var, int i17) {
        throw new java.lang.UnsupportedOperationException("Nested builder not supported for map fields.");
    }

    @Override // com.google.protobuf.v5
    public int j(com.google.protobuf.q5 q5Var) {
        return q5Var.internalGetMapField(this.f45646a.f44909e.f45563f).d().size();
    }

    @Override // com.google.protobuf.v5
    public void k(com.google.protobuf.q5 q5Var) {
        q5Var.internalGetMutableMapField(this.f45646a.f44909e.f45563f).f().clear();
    }

    @Override // com.google.protobuf.v5
    public com.google.protobuf.j8 l(com.google.protobuf.q5 q5Var) {
        throw new java.lang.UnsupportedOperationException("Nested builder not supported for map fields.");
    }

    @Override // com.google.protobuf.v5
    public java.lang.Object m(com.google.protobuf.l6 l6Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < b(l6Var); i17++) {
            arrayList.add(o(l6Var, i17));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.protobuf.v5
    public java.lang.Object n(com.google.protobuf.q5 q5Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < j(q5Var); i17++) {
            arrayList.add(g(q5Var, i17));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.protobuf.v5
    public com.google.protobuf.j8 newBuilder() {
        return ((com.google.protobuf.t7) this.f45647b).newBuilderForType();
    }

    @Override // com.google.protobuf.v5
    public java.lang.Object o(com.google.protobuf.l6 l6Var, int i17) {
        return l6Var.internalGetMapField(this.f45646a.f44909e.f45563f).d().get(i17);
    }

    public final com.google.protobuf.k8 p(com.google.protobuf.k8 k8Var) {
        if (k8Var == null) {
            return null;
        }
        com.google.protobuf.k8 k8Var2 = this.f45647b;
        if (k8Var2.getClass().isInstance(k8Var)) {
            return k8Var;
        }
        com.google.protobuf.t7 t7Var = (com.google.protobuf.t7) k8Var2;
        return new com.google.protobuf.q7(t7Var.f45551f, t7Var.f45549d, t7Var.f45550e, true, true).mergeFrom(k8Var).build();
    }
}
