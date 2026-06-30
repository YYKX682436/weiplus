package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class j3 implements java.lang.Runnable, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.n2 f172016d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f172017e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f172018f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f172019g;

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.n2 mRegistry, java.lang.Runnable runnable, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mRegistry, "mRegistry");
        this.f172016d = mRegistry;
        this.f172017e = runnable;
        this.f172018f = str;
        this.f172019g = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j3 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.n2 registry, java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(registry, "registry");
        if (runnable instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j3) {
            runnable = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j3) runnable).f172017e;
        }
        java.lang.String stackTraceString = android.util.Log.getStackTraceString(new java.lang.Throwable());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTraceString, "getStackTraceString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j3 j3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j3(registry, runnable, stackTraceString);
        registry.mo46316x322b85(j3Var);
        return j3Var;
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        this.f172019g.set(true);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.n2 n2Var = this.f172016d;
        if (this.f172019g.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.WXA.LifeCycleWrappedRunnable", "run() but dead, <init> stackTrace = " + this.f172018f);
        } else {
            try {
                java.lang.Runnable runnable = this.f172017e;
                if (runnable != null) {
                    runnable.run();
                }
            } finally {
                n2Var.n2(this);
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m53118x9616526c() {
        return "[LifeCycleWrappedRunnable]" + this.f172017e;
    }
}
