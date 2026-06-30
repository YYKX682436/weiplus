package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class p9 implements com.p176xb6135e39.p283xc50a8b8b.b {

    /* renamed from: a, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.b f126942a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f126943b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f126944c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f126945d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f126946e;

    /* renamed from: f, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.n9 f126947f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.m9 f126948g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.o9 f126949h;

    public p9(java.util.List list, boolean z17, com.p176xb6135e39.p283xc50a8b8b.b bVar, boolean z18) {
        this.f126943b = list;
        this.f126944c = z17;
        this.f126942a = bVar;
        this.f126946e = z18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.b
    public void a() {
        q();
    }

    public com.p176xb6135e39.p283xc50a8b8b.p9 b(java.lang.Iterable iterable) {
        int i17;
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            com.p176xb6135e39.p283xc50a8b8b.c cVar = (com.p176xb6135e39.p283xc50a8b8b.c) it.next();
            java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
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
            java.util.List list = this.f126943b;
            if (list instanceof java.util.ArrayList) {
                ((java.util.ArrayList) list).ensureCapacity(list.size() + i17);
            }
        }
        java.util.Iterator it6 = iterable.iterator();
        while (it6.hasNext()) {
            f((com.p176xb6135e39.p283xc50a8b8b.c) it6.next());
        }
        q();
        o();
        return this;
    }

    public com.p176xb6135e39.p283xc50a8b8b.a c(int i17, com.p176xb6135e39.p283xc50a8b8b.c cVar) {
        j();
        i();
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = new com.p176xb6135e39.p283xc50a8b8b.t9(cVar, this, this.f126946e);
        this.f126943b.add(i17, null);
        ((java.util.ArrayList) this.f126945d).add(i17, t9Var);
        q();
        o();
        return t9Var.d();
    }

    public com.p176xb6135e39.p283xc50a8b8b.a d(com.p176xb6135e39.p283xc50a8b8b.c cVar) {
        j();
        i();
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = new com.p176xb6135e39.p283xc50a8b8b.t9(cVar, this, this.f126946e);
        this.f126943b.add(null);
        ((java.util.ArrayList) this.f126945d).add(t9Var);
        q();
        o();
        return t9Var.d();
    }

    public com.p176xb6135e39.p283xc50a8b8b.p9 e(int i17, com.p176xb6135e39.p283xc50a8b8b.c cVar) {
        java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
        cVar.getClass();
        j();
        this.f126943b.add(i17, cVar);
        java.util.List list = this.f126945d;
        if (list != null) {
            ((java.util.ArrayList) list).add(i17, null);
        }
        q();
        o();
        return this;
    }

    public com.p176xb6135e39.p283xc50a8b8b.p9 f(com.p176xb6135e39.p283xc50a8b8b.c cVar) {
        java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
        cVar.getClass();
        j();
        this.f126943b.add(cVar);
        java.util.List list = this.f126945d;
        if (list != null) {
            ((java.util.ArrayList) list).add(null);
        }
        q();
        o();
        return this;
    }

    public java.util.List g() {
        boolean z17;
        this.f126946e = true;
        boolean z18 = this.f126944c;
        if (!z18 && this.f126945d == null) {
            return this.f126943b;
        }
        if (!z18) {
            int i17 = 0;
            while (true) {
                if (i17 >= this.f126943b.size()) {
                    z17 = true;
                    break;
                }
                com.p176xb6135e39.p283xc50a8b8b.k8 k8Var = (com.p176xb6135e39.p283xc50a8b8b.k8) this.f126943b.get(i17);
                com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = (com.p176xb6135e39.p283xc50a8b8b.t9) this.f126945d.get(i17);
                if (t9Var != null && t9Var.b() != k8Var) {
                    z17 = false;
                    break;
                }
                i17++;
            }
            if (z17) {
                return this.f126943b;
            }
        }
        j();
        for (int i18 = 0; i18 < this.f126943b.size(); i18++) {
            this.f126943b.set(i18, m(i18, true));
        }
        java.util.List unmodifiableList = java.util.Collections.unmodifiableList(this.f126943b);
        this.f126943b = unmodifiableList;
        this.f126944c = false;
        return unmodifiableList;
    }

    public void h() {
        this.f126943b = java.util.Collections.emptyList();
        this.f126944c = false;
        java.util.List<com.p176xb6135e39.p283xc50a8b8b.t9> list = this.f126945d;
        if (list != null) {
            for (com.p176xb6135e39.p283xc50a8b8b.t9 t9Var : list) {
                if (t9Var != null) {
                    t9Var.f127087a = null;
                }
            }
            this.f126945d = null;
        }
        q();
        o();
    }

    public final void i() {
        if (this.f126945d == null) {
            this.f126945d = new java.util.ArrayList(this.f126943b.size());
            for (int i17 = 0; i17 < this.f126943b.size(); i17++) {
                this.f126945d.add(null);
            }
        }
    }

    public final void j() {
        if (this.f126944c) {
            return;
        }
        this.f126943b = new java.util.ArrayList(this.f126943b);
        this.f126944c = true;
    }

    public com.p176xb6135e39.p283xc50a8b8b.a k(int i17) {
        i();
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = (com.p176xb6135e39.p283xc50a8b8b.t9) ((java.util.ArrayList) this.f126945d).get(i17);
        if (t9Var == null) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var2 = new com.p176xb6135e39.p283xc50a8b8b.t9((com.p176xb6135e39.p283xc50a8b8b.c) this.f126943b.get(i17), this, this.f126946e);
            ((java.util.ArrayList) this.f126945d).set(i17, t9Var2);
            t9Var = t9Var2;
        }
        return t9Var.d();
    }

    public int l() {
        return this.f126943b.size();
    }

    public final com.p176xb6135e39.p283xc50a8b8b.c m(int i17, boolean z17) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var;
        java.util.List list = this.f126945d;
        if (list != null && (t9Var = (com.p176xb6135e39.p283xc50a8b8b.t9) list.get(i17)) != null) {
            return z17 ? t9Var.b() : t9Var.e();
        }
        return (com.p176xb6135e39.p283xc50a8b8b.c) this.f126943b.get(i17);
    }

    public com.p176xb6135e39.p283xc50a8b8b.r8 n(int i17) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var;
        java.util.List list = this.f126945d;
        if (list != null && (t9Var = (com.p176xb6135e39.p283xc50a8b8b.t9) list.get(i17)) != null) {
            return t9Var.f();
        }
        return (com.p176xb6135e39.p283xc50a8b8b.r8) this.f126943b.get(i17);
    }

    public final void o() {
        com.p176xb6135e39.p283xc50a8b8b.n9 n9Var = this.f126947f;
        if (n9Var != null) {
            n9Var.d();
        }
        com.p176xb6135e39.p283xc50a8b8b.m9 m9Var = this.f126948g;
        if (m9Var != null) {
            m9Var.d();
        }
        com.p176xb6135e39.p283xc50a8b8b.o9 o9Var = this.f126949h;
        if (o9Var != null) {
            o9Var.d();
        }
    }

    public boolean p() {
        return this.f126943b.isEmpty();
    }

    public final void q() {
        com.p176xb6135e39.p283xc50a8b8b.b bVar;
        if (!this.f126946e || (bVar = this.f126942a) == null) {
            return;
        }
        bVar.a();
        this.f126946e = false;
    }

    public void r(int i17) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var;
        j();
        this.f126943b.remove(i17);
        java.util.List list = this.f126945d;
        if (list != null && (t9Var = (com.p176xb6135e39.p283xc50a8b8b.t9) list.remove(i17)) != null) {
            t9Var.f127087a = null;
        }
        q();
        o();
    }

    public com.p176xb6135e39.p283xc50a8b8b.p9 s(int i17, com.p176xb6135e39.p283xc50a8b8b.c cVar) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var;
        java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
        cVar.getClass();
        j();
        this.f126943b.set(i17, cVar);
        java.util.List list = this.f126945d;
        if (list != null && (t9Var = (com.p176xb6135e39.p283xc50a8b8b.t9) ((java.util.ArrayList) list).set(i17, null)) != null) {
            t9Var.f127087a = null;
        }
        q();
        o();
        return this;
    }
}
