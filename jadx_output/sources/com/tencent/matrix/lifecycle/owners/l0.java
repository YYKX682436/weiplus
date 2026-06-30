package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f52756a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f52757b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f52758c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f52759d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f52760e;

    /* renamed from: f, reason: collision with root package name */
    public final long f52761f;

    /* renamed from: g, reason: collision with root package name */
    public final int f52762g;

    public l0(java.lang.String tag, long j17, int i17) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f52760e = tag;
        this.f52761f = j17;
        this.f52762g = i17;
        this.f52756a = jz5.h.b(com.tencent.matrix.lifecycle.owners.i0.f52751d);
        this.f52757b = jz5.h.b(new com.tencent.matrix.lifecycle.owners.h0(this));
        this.f52758c = jz5.h.b(new com.tencent.matrix.lifecycle.owners.k0(this));
    }

    public abstract boolean a();

    public final boolean b() {
        oj.j.c(this.f52760e, "checkAndPostIfNeeded", new java.lang.Object[0]);
        d().removeCallbacks(e());
        if (!a()) {
            return false;
        }
        d().postDelayed(e(), c().a());
        return true;
    }

    public final com.tencent.matrix.lifecycle.owners.g0 c() {
        return (com.tencent.matrix.lifecycle.owners.g0) ((jz5.n) this.f52757b).getValue();
    }

    public final android.os.Handler d() {
        return (android.os.Handler) ((jz5.n) this.f52756a).getValue();
    }

    public final com.tencent.matrix.lifecycle.owners.j0 e() {
        return (com.tencent.matrix.lifecycle.owners.j0) ((jz5.n) this.f52758c).getValue();
    }

    public final void f() {
        com.tencent.matrix.lifecycle.owners.g0 c17 = c();
        java.lang.Long[] lArr = c17.f52744a;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(lArr, lArr.length);
        kotlin.jvm.internal.o.f(copyOf, "java.util.Arrays.copyOf(this, size)");
        c17.f52745b = (java.lang.Long[]) copyOf;
        long a17 = c().a();
        oj.j.c(this.f52760e, "post check: " + a17, new java.lang.Object[0]);
        d().removeCallbacks(e());
        d().postDelayed(e(), a17);
    }

    public final void g() {
        this.f52759d = 0;
        oj.j.c(this.f52760e, "stop", new java.lang.Object[0]);
        com.tencent.matrix.lifecycle.owners.g0 c17 = c();
        java.lang.Long[] lArr = c17.f52744a;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(lArr, lArr.length);
        kotlin.jvm.internal.o.f(copyOf, "java.util.Arrays.copyOf(this, size)");
        c17.f52745b = (java.lang.Long[]) copyOf;
        d().removeCallbacks(e());
    }
}
