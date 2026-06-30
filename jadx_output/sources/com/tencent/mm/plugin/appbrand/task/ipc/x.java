package com.tencent.mm.plugin.appbrand.task.ipc;

/* loaded from: classes7.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f89074d;

    public x(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f89074d = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f89074d;
        com.tencent.mm.plugin.appbrand.hc hcVar = o6Var.f74796e;
        if (hcVar == null || hcVar.getActiveRuntime() != o6Var) {
            return;
        }
        o6Var.h0();
    }
}
