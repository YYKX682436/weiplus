package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class w5 implements com.p176xb6135e39.p283xc50a8b8b.v5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.b4 f127179a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.k8 f127180b;

    public w5(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2) {
        this.f127179a = b4Var;
        this.f127180b = ((com.p176xb6135e39.p283xc50a8b8b.x7) ((com.p176xb6135e39.p283xc50a8b8b.l6) com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls, "getDefaultInstance", new java.lang.Class[0]), null, new java.lang.Object[0])).mo20780xf53a7b77(b4Var.f126442e.f127096f).f126562e).f127217a;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object a(com.p176xb6135e39.p283xc50a8b8b.l6 l6Var) {
        return m(l6Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public int b(com.p176xb6135e39.p283xc50a8b8b.l6 l6Var) {
        return l6Var.mo20780xf53a7b77(this.f127179a.f126442e.f127096f).d().size();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public void c(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, java.lang.Object obj) {
        k(q5Var);
        java.util.Iterator it = ((java.util.List) obj).iterator();
        while (it.hasNext()) {
            d(q5Var, it.next());
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public void d(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, java.lang.Object obj) {
        q5Var.mo20878x45eb59ab(this.f127179a.f126442e.f127096f).f().add(p((com.p176xb6135e39.p283xc50a8b8b.k8) obj));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public boolean e(com.p176xb6135e39.p283xc50a8b8b.l6 l6Var) {
        throw new java.lang.UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public void f(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, int i17, java.lang.Object obj) {
        q5Var.mo20878x45eb59ab(this.f127179a.f126442e.f127096f).f().set(i17, p((com.p176xb6135e39.p283xc50a8b8b.k8) obj));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object g(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, int i17) {
        return q5Var.mo20877xf53a7b77(this.f127179a.f126442e.f127096f).d().get(i17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public boolean h(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        throw new java.lang.UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public com.p176xb6135e39.p283xc50a8b8b.j8 i(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, int i17) {
        throw new java.lang.UnsupportedOperationException("Nested builder not supported for map fields.");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public int j(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        return q5Var.mo20877xf53a7b77(this.f127179a.f126442e.f127096f).d().size();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public void k(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        q5Var.mo20878x45eb59ab(this.f127179a.f126442e.f127096f).f().clear();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public com.p176xb6135e39.p283xc50a8b8b.j8 l(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        throw new java.lang.UnsupportedOperationException("Nested builder not supported for map fields.");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object m(com.p176xb6135e39.p283xc50a8b8b.l6 l6Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < b(l6Var); i17++) {
            arrayList.add(o(l6Var, i17));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object n(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < j(q5Var); i17++) {
            arrayList.add(g(q5Var, i17));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    /* renamed from: newBuilder */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20575x3136c9db() {
        return ((com.p176xb6135e39.p283xc50a8b8b.t7) this.f127180b).mo20596xab31548();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object o(com.p176xb6135e39.p283xc50a8b8b.l6 l6Var, int i17) {
        return l6Var.mo20780xf53a7b77(this.f127179a.f126442e.f127096f).d().get(i17);
    }

    public final com.p176xb6135e39.p283xc50a8b8b.k8 p(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var == null) {
            return null;
        }
        com.p176xb6135e39.p283xc50a8b8b.k8 k8Var2 = this.f127180b;
        if (k8Var2.getClass().isInstance(k8Var)) {
            return k8Var;
        }
        com.p176xb6135e39.p283xc50a8b8b.t7 t7Var = (com.p176xb6135e39.p283xc50a8b8b.t7) k8Var2;
        return new com.p176xb6135e39.p283xc50a8b8b.q7(t7Var.f127084f, t7Var.f127082d, t7Var.f127083e, true, true).mo20527x60f45402(k8Var).mo20556x59bc66e();
    }
}
