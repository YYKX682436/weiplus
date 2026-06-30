package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class g5 implements androidx.lifecycle.y, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f90452d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.b0 f90453e;

    public g5(int i17, im5.c lifecycleKeeper) {
        kotlin.jvm.internal.o.g(lifecycleKeeper, "lifecycleKeeper");
        this.f90452d = "MicroMsg.VendingLifecycleAdapter#" + i17;
        androidx.lifecycle.b0 b0Var = new androidx.lifecycle.b0(this, true);
        this.f90453e = b0Var;
        lifecycleKeeper.keep(this);
        b0Var.i(androidx.lifecycle.n.CREATED);
    }

    @Override // im5.a
    public void dead() {
        com.tencent.mars.xlog.Log.i(this.f90452d, "dead");
        this.f90453e.i(androidx.lifecycle.n.DESTROYED);
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f90453e;
    }
}
