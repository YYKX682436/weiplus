package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.owners.d0 f52714d = new com.tencent.matrix.lifecycle.owners.d0();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.matrix.lifecycle.owners.f0 f0Var = com.tencent.matrix.lifecycle.owners.f0.f52742x;
        if (com.tencent.matrix.lifecycle.owners.f0.f52726h.isEmpty()) {
            com.tencent.matrix.lifecycle.owners.f0.f52729k = true;
            com.tencent.matrix.lifecycle.IForegroundStatefulOwner iForegroundStatefulOwner = com.tencent.matrix.lifecycle.owners.f0.f52732n;
            if (iForegroundStatefulOwner == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
            }
            ((com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$AsyncOwner) iForegroundStatefulOwner).turnOffAsync();
        }
        f0Var.c();
    }
}
