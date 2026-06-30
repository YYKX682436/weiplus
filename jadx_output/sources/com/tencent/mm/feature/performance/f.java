package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f67563g = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    public final int f67564d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f67565e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f67566f;

    public f(int i17, java.lang.String moduleName, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 4) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        this.f67564d = i17;
        this.f67565e = moduleName;
        this.f67566f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ph.u e17;
        gi.h1 h1Var;
        if (this.f67566f) {
            return;
        }
        com.tencent.mm.feature.performance.d dVar = com.tencent.mm.feature.performance.q.f67630d;
        if (com.tencent.mm.feature.performance.d.a(dVar) == null || (e17 = gi.d.e()) == null || (h1Var = (gi.h1) e17.f354296h.i(gi.h1.class)) == null) {
            return;
        }
        android.os.Handler a17 = com.tencent.mm.feature.performance.d.a(dVar);
        kotlin.jvm.internal.o.d(a17);
        a17.post(new com.tencent.mm.feature.performance.e(this, h1Var));
    }
}
