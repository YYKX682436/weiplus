package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f96075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f96076e;

    public r1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var, boolean z17) {
        this.f96076e = p0Var;
        this.f96075d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = !this.f96075d;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f96076e;
        if (z17 == p0Var.Z) {
            return;
        }
        p0Var.Z = z17;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g0.f95910c.SwitchAV(z17 ? 1 : 0, p0Var.f96026p0 ? 1 : 0, 0);
    }
}
