package com.google.protobuf;

/* loaded from: classes16.dex */
public class p9 implements com.google.protobuf.b {

    /* renamed from: a, reason: collision with root package name */
    public com.google.protobuf.b f45409a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f45410b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f45411c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f45412d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45413e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.protobuf.n9 f45414f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.m9 f45415g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.protobuf.o9 f45416h;

    public p9(java.util.List list, boolean z17, com.google.protobuf.b bVar, boolean z18) {
        this.f45410b = list;
        this.f45411c = z17;
        this.f45409a = bVar;
        this.f45413e = z18;
    }

    @Override // com.google.protobuf.b
    public void a() {
        q();
    }

    public com.google.protobuf.p9 b(java.lang.Iterable iterable) {
        int i17;
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            com.google.protobuf.c cVar = (com.google.protobuf.c) it.next();
            java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
            cVar.getClass();
        }
        if (iterable instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) iterable;
            if (collection.isEmpty()) {
                return this;
            }
            i17 = collection.size();
        } else {
            i17 = -1;
        }
        j();
        if (i17 >= 0) {
            java.util.List list = this.f45410b;
            if (list instanceof java.util.ArrayList) {
                ((java.util.ArrayList) list).ensureCapacity(list.size() + i17);
            }
        }
        java.util.Iterator it6 = iterable.iterator();
        while (it6.hasNext()) {
            f((com.google.protobuf.c) it6.next());
        }
        q();
        o();
        return this;
    }

    public com.google.protobuf.a c(int i17, com.google.protobuf.c cVar) {
        j();
        i();
        com.google.protobuf.t9 t9Var = new com.google.protobuf.t9(cVar, this, this.f45413e);
        this.f45410b.add(i17, null);
        ((java.util.ArrayList) this.f45412d).add(i17, t9Var);
        q();
        o();
        return t9Var.d();
    }

    public com.google.protobuf.a d(com.google.protobuf.c cVar) {
        j();
        i();
        com.google.protobuf.t9 t9Var = new com.google.protobuf.t9(cVar, this, this.f45413e);
        this.f45410b.add(null);
        ((java.util.ArrayList) this.f45412d).add(t9Var);
        q();
        o();
        return t9Var.d();
    }

    public com.google.protobuf.p9 e(int i17, com.google.protobuf.c cVar) {
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        cVar.getClass();
        j();
        this.f45410b.add(i17, cVar);
        java.util.List list = this.f45412d;
        if (list != null) {
            ((java.util.ArrayList) list).add(i17, null);
        }
        q();
        o();
        return this;
    }

    public com.google.protobuf.p9 f(com.google.protobuf.c cVar) {
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        cVar.getClass();
        j();
        this.f45410b.add(cVar);
        java.util.List list = this.f45412d;
        if (list != null) {
            ((java.util.ArrayList) list).add(null);
        }
        q();
        o();
        return this;
    }

    public java.util.List g() {
        boolean z17;
        this.f45413e = true;
        boolean z18 = this.f45411c;
        if (!z18 && this.f45412d == null) {
            return this.f45410b;
        }
        if (!z18) {
            int i17 = 0;
            while (true) {
                if (i17 >= this.f45410b.size()) {
                    z17 = true;
                    break;
                }
                com.google.protobuf.k8 k8Var = (com.google.protobuf.k8) this.f45410b.get(i17);
                com.google.protobuf.t9 t9Var = (com.google.protobuf.t9) this.f45412d.get(i17);
                if (t9Var != null && t9Var.b() != k8Var) {
                    z17 = false;
                    break;
                }
                i17++;
            }
            if (z17) {
                return this.f45410b;
            }
        }
        j();
        for (int i18 = 0; i18 < this.f45410b.size(); i18++) {
            this.f45410b.set(i18, m(i18, true));
        }
        java.util.List unmodifiableList = java.util.Collections.unmodifiableList(this.f45410b);
        this.f45410b = unmodifiableList;
        this.f45411c = false;
        return unmodifiableList;
    }

    public void h() {
        this.f45410b = java.util.Collections.emptyList();
        this.f45411c = false;
        java.util.List<com.google.protobuf.t9> list = this.f45412d;
        if (list != null) {
            for (com.google.protobuf.t9 t9Var : list) {
                if (t9Var != null) {
                    t9Var.f45554a = null;
                }
            }
            this.f45412d = null;
        }
        q();
        o();
    }

    public final void i() {
        if (this.f45412d == null) {
            this.f45412d = new java.util.ArrayList(this.f45410b.size());
            for (int i17 = 0; i17 < this.f45410b.size(); i17++) {
                this.f45412d.add(null);
            }
        }
    }

    public final void j() {
        if (this.f45411c) {
            return;
        }
        this.f45410b = new java.util.ArrayList(this.f45410b);
        this.f45411c = true;
    }

    public com.google.protobuf.a k(int i17) {
        i();
        com.google.protobuf.t9 t9Var = (com.google.protobuf.t9) ((java.util.ArrayList) this.f45412d).get(i17);
        if (t9Var == null) {
            com.google.protobuf.t9 t9Var2 = new com.google.protobuf.t9((com.google.protobuf.c) this.f45410b.get(i17), this, this.f45413e);
            ((java.util.ArrayList) this.f45412d).set(i17, t9Var2);
            t9Var = t9Var2;
        }
        return t9Var.d();
    }

    public int l() {
        return this.f45410b.size();
    }

    public final com.google.protobuf.c m(int i17, boolean z17) {
        com.google.protobuf.t9 t9Var;
        java.util.List list = this.f45412d;
        if (list != null && (t9Var = (com.google.protobuf.t9) list.get(i17)) != null) {
            return z17 ? t9Var.b() : t9Var.e();
        }
        return (com.google.protobuf.c) this.f45410b.get(i17);
    }

    public com.google.protobuf.r8 n(int i17) {
        com.google.protobuf.t9 t9Var;
        java.util.List list = this.f45412d;
        if (list != null && (t9Var = (com.google.protobuf.t9) list.get(i17)) != null) {
            return t9Var.f();
        }
        return (com.google.protobuf.r8) this.f45410b.get(i17);
    }

    public final void o() {
        com.google.protobuf.n9 n9Var = this.f45414f;
        if (n9Var != null) {
            n9Var.d();
        }
        com.google.protobuf.m9 m9Var = this.f45415g;
        if (m9Var != null) {
            m9Var.d();
        }
        com.google.protobuf.o9 o9Var = this.f45416h;
        if (o9Var != null) {
            o9Var.d();
        }
    }

    public boolean p() {
        return this.f45410b.isEmpty();
    }

    public final void q() {
        com.google.protobuf.b bVar;
        if (!this.f45413e || (bVar = this.f45409a) == null) {
            return;
        }
        bVar.a();
        this.f45413e = false;
    }

    public void r(int i17) {
        com.google.protobuf.t9 t9Var;
        j();
        this.f45410b.remove(i17);
        java.util.List list = this.f45412d;
        if (list != null && (t9Var = (com.google.protobuf.t9) list.remove(i17)) != null) {
            t9Var.f45554a = null;
        }
        q();
        o();
    }

    public com.google.protobuf.p9 s(int i17, com.google.protobuf.c cVar) {
        com.google.protobuf.t9 t9Var;
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        cVar.getClass();
        j();
        this.f45410b.set(i17, cVar);
        java.util.List list = this.f45412d;
        if (list != null && (t9Var = (com.google.protobuf.t9) ((java.util.ArrayList) list).set(i17, null)) != null) {
            t9Var.f45554a = null;
        }
        q();
        o();
        return this;
    }
}
