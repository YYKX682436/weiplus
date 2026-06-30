package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d;

/* loaded from: classes16.dex */
public final class b extends jb.d {

    /* renamed from: u, reason: collision with root package name */
    public static final java.io.Writer f126290u = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.a();

    /* renamed from: v, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.q f126291v = new com.p176xb6135e39.p280x308fcb.q("closed");

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f126292r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f126293s;

    /* renamed from: t, reason: collision with root package name */
    public com.p176xb6135e39.p280x308fcb.l f126294t;

    public b() {
        super(f126290u);
        this.f126292r = new java.util.ArrayList();
        this.f126294t = com.p176xb6135e39.p280x308fcb.n.f126373d;
    }

    @Override // jb.d
    public jb.d A(java.lang.String str) {
        if (str == null) {
            I(com.p176xb6135e39.p280x308fcb.n.f126373d);
            return this;
        }
        I(new com.p176xb6135e39.p280x308fcb.q(str));
        return this;
    }

    @Override // jb.d
    public jb.d C(boolean z17) {
        I(new com.p176xb6135e39.p280x308fcb.q(java.lang.Boolean.valueOf(z17)));
        return this;
    }

    public final com.p176xb6135e39.p280x308fcb.l F() {
        return (com.p176xb6135e39.p280x308fcb.l) ((java.util.ArrayList) this.f126292r).get(((java.util.ArrayList) r0).size() - 1);
    }

    public final void I(com.p176xb6135e39.p280x308fcb.l lVar) {
        if (this.f126293s != null) {
            lVar.getClass();
            if (!(lVar instanceof com.p176xb6135e39.p280x308fcb.n) || this.f380210o) {
                com.p176xb6135e39.p280x308fcb.o oVar = (com.p176xb6135e39.p280x308fcb.o) F();
                java.lang.String str = this.f126293s;
                oVar.getClass();
                oVar.f126374d.put(str, lVar);
            }
            this.f126293s = null;
            return;
        }
        if (((java.util.ArrayList) this.f126292r).isEmpty()) {
            this.f126294t = lVar;
            return;
        }
        com.p176xb6135e39.p280x308fcb.l F = F();
        if (!(F instanceof com.p176xb6135e39.p280x308fcb.k)) {
            throw new java.lang.IllegalStateException();
        }
        com.p176xb6135e39.p280x308fcb.k kVar = (com.p176xb6135e39.p280x308fcb.k) F;
        kVar.getClass();
        if (lVar == null) {
            lVar = com.p176xb6135e39.p280x308fcb.n.f126373d;
        }
        ((java.util.ArrayList) kVar.f126372d).add(lVar);
    }

    @Override // jb.d
    public jb.d b() {
        com.p176xb6135e39.p280x308fcb.k kVar = new com.p176xb6135e39.p280x308fcb.k();
        I(kVar);
        ((java.util.ArrayList) this.f126292r).add(kVar);
        return this;
    }

    @Override // jb.d
    public jb.d c() {
        com.p176xb6135e39.p280x308fcb.o oVar = new com.p176xb6135e39.p280x308fcb.o();
        I(oVar);
        ((java.util.ArrayList) this.f126292r).add(oVar);
        return this;
    }

    @Override // jb.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.util.List list = this.f126292r;
        if (!((java.util.ArrayList) list).isEmpty()) {
            throw new java.io.IOException("Incomplete document");
        }
        ((java.util.ArrayList) list).add(f126291v);
    }

    @Override // jb.d, java.io.Flushable
    public void flush() {
    }

    @Override // jb.d
    public jb.d i() {
        java.util.List list = this.f126292r;
        if (((java.util.ArrayList) list).isEmpty() || this.f126293s != null) {
            throw new java.lang.IllegalStateException();
        }
        if (!(F() instanceof com.p176xb6135e39.p280x308fcb.k)) {
            throw new java.lang.IllegalStateException();
        }
        ((java.util.ArrayList) list).remove(((java.util.ArrayList) list).size() - 1);
        return this;
    }

    @Override // jb.d
    public jb.d j() {
        java.util.List list = this.f126292r;
        if (((java.util.ArrayList) list).isEmpty() || this.f126293s != null) {
            throw new java.lang.IllegalStateException();
        }
        if (!(F() instanceof com.p176xb6135e39.p280x308fcb.o)) {
            throw new java.lang.IllegalStateException();
        }
        ((java.util.ArrayList) list).remove(((java.util.ArrayList) list).size() - 1);
        return this;
    }

    @Override // jb.d
    public jb.d k(java.lang.String str) {
        if (((java.util.ArrayList) this.f126292r).isEmpty() || this.f126293s != null) {
            throw new java.lang.IllegalStateException();
        }
        if (!(F() instanceof com.p176xb6135e39.p280x308fcb.o)) {
            throw new java.lang.IllegalStateException();
        }
        this.f126293s = str;
        return this;
    }

    @Override // jb.d
    public jb.d p() {
        I(com.p176xb6135e39.p280x308fcb.n.f126373d);
        return this;
    }

    @Override // jb.d
    public jb.d w(long j17) {
        I(new com.p176xb6135e39.p280x308fcb.q(java.lang.Long.valueOf(j17)));
        return this;
    }

    @Override // jb.d
    public jb.d x(java.lang.Boolean bool) {
        if (bool == null) {
            I(com.p176xb6135e39.p280x308fcb.n.f126373d);
            return this;
        }
        I(new com.p176xb6135e39.p280x308fcb.q(bool));
        return this;
    }

    @Override // jb.d
    public jb.d z(java.lang.Number number) {
        if (number == null) {
            I(com.p176xb6135e39.p280x308fcb.n.f126373d);
            return this;
        }
        if (!this.f380207i) {
            double doubleValue = number.doubleValue();
            if (java.lang.Double.isNaN(doubleValue) || java.lang.Double.isInfinite(doubleValue)) {
                throw new java.lang.IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        I(new com.p176xb6135e39.p280x308fcb.q(number));
        return this;
    }
}
