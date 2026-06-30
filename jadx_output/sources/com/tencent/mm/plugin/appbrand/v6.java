package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class v6 extends com.tencent.mm.plugin.appbrand.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f90646b;

    public v6(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f90646b = o6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public java.lang.String b() {
        return "startPrepareMainProcess";
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public void c() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f90646b;
        boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
        com.tencent.mm.plugin.appbrand.keylogger.w.g(o6Var.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareMainProcess);
        com.tencent.mm.plugin.appbrand.ipc.y.a(new com.tencent.mm.plugin.appbrand.m7(o6Var, this), o6Var);
    }
}
