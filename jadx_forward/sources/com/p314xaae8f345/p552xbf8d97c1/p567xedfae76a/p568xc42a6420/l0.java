package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420;

/* loaded from: classes12.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f134289a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f134290b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f134291c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f134292d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f134293e;

    /* renamed from: f, reason: collision with root package name */
    public final long f134294f;

    /* renamed from: g, reason: collision with root package name */
    public final int f134295g;

    public l0(java.lang.String tag, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f134293e = tag;
        this.f134294f = j17;
        this.f134295g = i17;
        this.f134289a = jz5.h.b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.i0.f134284d);
        this.f134290b = jz5.h.b(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.h0(this));
        this.f134291c = jz5.h.b(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.k0(this));
    }

    public abstract boolean a();

    public final boolean b() {
        oj.j.c(this.f134293e, "checkAndPostIfNeeded", new java.lang.Object[0]);
        d().removeCallbacks(e());
        if (!a()) {
            return false;
        }
        d().postDelayed(e(), c().a());
        return true;
    }

    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.g0 c() {
        return (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.g0) ((jz5.n) this.f134290b).mo141623x754a37bb();
    }

    public final android.os.Handler d() {
        return (android.os.Handler) ((jz5.n) this.f134289a).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.j0 e() {
        return (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.j0) ((jz5.n) this.f134291c).mo141623x754a37bb();
    }

    public final void f() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.g0 c17 = c();
        java.lang.Long[] lArr = c17.f134277a;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(lArr, lArr.length);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "java.util.Arrays.copyOf(this, size)");
        c17.f134278b = (java.lang.Long[]) copyOf;
        long a17 = c().a();
        oj.j.c(this.f134293e, "post check: " + a17, new java.lang.Object[0]);
        d().removeCallbacks(e());
        d().postDelayed(e(), a17);
    }

    public final void g() {
        this.f134292d = 0;
        oj.j.c(this.f134293e, "stop", new java.lang.Object[0]);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.g0 c17 = c();
        java.lang.Long[] lArr = c17.f134277a;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(lArr, lArr.length);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "java.util.Arrays.copyOf(this, size)");
        c17.f134278b = (java.lang.Long[]) copyOf;
        d().removeCallbacks(e());
    }
}
