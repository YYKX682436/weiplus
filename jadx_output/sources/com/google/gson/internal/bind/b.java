package com.google.gson.internal.bind;

/* loaded from: classes16.dex */
public final class b extends jb.d {

    /* renamed from: u, reason: collision with root package name */
    public static final java.io.Writer f44757u = new com.google.gson.internal.bind.a();

    /* renamed from: v, reason: collision with root package name */
    public static final com.google.gson.q f44758v = new com.google.gson.q("closed");

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f44759r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f44760s;

    /* renamed from: t, reason: collision with root package name */
    public com.google.gson.l f44761t;

    public b() {
        super(f44757u);
        this.f44759r = new java.util.ArrayList();
        this.f44761t = com.google.gson.n.f44840d;
    }

    @Override // jb.d
    public jb.d A(java.lang.String str) {
        if (str == null) {
            I(com.google.gson.n.f44840d);
            return this;
        }
        I(new com.google.gson.q(str));
        return this;
    }

    @Override // jb.d
    public jb.d C(boolean z17) {
        I(new com.google.gson.q(java.lang.Boolean.valueOf(z17)));
        return this;
    }

    public final com.google.gson.l F() {
        return (com.google.gson.l) ((java.util.ArrayList) this.f44759r).get(((java.util.ArrayList) r0).size() - 1);
    }

    public final void I(com.google.gson.l lVar) {
        if (this.f44760s != null) {
            lVar.getClass();
            if (!(lVar instanceof com.google.gson.n) || this.f298677o) {
                com.google.gson.o oVar = (com.google.gson.o) F();
                java.lang.String str = this.f44760s;
                oVar.getClass();
                oVar.f44841d.put(str, lVar);
            }
            this.f44760s = null;
            return;
        }
        if (((java.util.ArrayList) this.f44759r).isEmpty()) {
            this.f44761t = lVar;
            return;
        }
        com.google.gson.l F = F();
        if (!(F instanceof com.google.gson.k)) {
            throw new java.lang.IllegalStateException();
        }
        com.google.gson.k kVar = (com.google.gson.k) F;
        kVar.getClass();
        if (lVar == null) {
            lVar = com.google.gson.n.f44840d;
        }
        ((java.util.ArrayList) kVar.f44839d).add(lVar);
    }

    @Override // jb.d
    public jb.d b() {
        com.google.gson.k kVar = new com.google.gson.k();
        I(kVar);
        ((java.util.ArrayList) this.f44759r).add(kVar);
        return this;
    }

    @Override // jb.d
    public jb.d c() {
        com.google.gson.o oVar = new com.google.gson.o();
        I(oVar);
        ((java.util.ArrayList) this.f44759r).add(oVar);
        return this;
    }

    @Override // jb.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.util.List list = this.f44759r;
        if (!((java.util.ArrayList) list).isEmpty()) {
            throw new java.io.IOException("Incomplete document");
        }
        ((java.util.ArrayList) list).add(f44758v);
    }

    @Override // jb.d, java.io.Flushable
    public void flush() {
    }

    @Override // jb.d
    public jb.d i() {
        java.util.List list = this.f44759r;
        if (((java.util.ArrayList) list).isEmpty() || this.f44760s != null) {
            throw new java.lang.IllegalStateException();
        }
        if (!(F() instanceof com.google.gson.k)) {
            throw new java.lang.IllegalStateException();
        }
        ((java.util.ArrayList) list).remove(((java.util.ArrayList) list).size() - 1);
        return this;
    }

    @Override // jb.d
    public jb.d j() {
        java.util.List list = this.f44759r;
        if (((java.util.ArrayList) list).isEmpty() || this.f44760s != null) {
            throw new java.lang.IllegalStateException();
        }
        if (!(F() instanceof com.google.gson.o)) {
            throw new java.lang.IllegalStateException();
        }
        ((java.util.ArrayList) list).remove(((java.util.ArrayList) list).size() - 1);
        return this;
    }

    @Override // jb.d
    public jb.d k(java.lang.String str) {
        if (((java.util.ArrayList) this.f44759r).isEmpty() || this.f44760s != null) {
            throw new java.lang.IllegalStateException();
        }
        if (!(F() instanceof com.google.gson.o)) {
            throw new java.lang.IllegalStateException();
        }
        this.f44760s = str;
        return this;
    }

    @Override // jb.d
    public jb.d p() {
        I(com.google.gson.n.f44840d);
        return this;
    }

    @Override // jb.d
    public jb.d w(long j17) {
        I(new com.google.gson.q(java.lang.Long.valueOf(j17)));
        return this;
    }

    @Override // jb.d
    public jb.d x(java.lang.Boolean bool) {
        if (bool == null) {
            I(com.google.gson.n.f44840d);
            return this;
        }
        I(new com.google.gson.q(bool));
        return this;
    }

    @Override // jb.d
    public jb.d z(java.lang.Number number) {
        if (number == null) {
            I(com.google.gson.n.f44840d);
            return this;
        }
        if (!this.f298674i) {
            double doubleValue = number.doubleValue();
            if (java.lang.Double.isNaN(doubleValue) || java.lang.Double.isInfinite(doubleValue)) {
                throw new java.lang.IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        I(new com.google.gson.q(number));
        return this;
    }
}
