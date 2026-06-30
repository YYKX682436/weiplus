package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.g0 f52838d;

    public f0(com.tencent.matrix.lifecycle.supervisor.g0 g0Var) {
        this.f52838d = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj.j.c(com.tencent.matrix.lifecycle.supervisor.d0.f52834k.b(), "SubordinatePacemaker: callback when foreground", new java.lang.Object[0]);
        this.f52838d.f52839d.invoke();
    }
}
