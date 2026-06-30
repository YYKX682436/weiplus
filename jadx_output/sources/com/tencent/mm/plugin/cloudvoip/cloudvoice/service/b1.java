package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c1 f95830d;

    public b1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c1 c1Var) {
        this.f95830d = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f95830d.f95873a;
        if (p0Var.f96025p != dz.k.ReasonManual) {
            p0Var.f96025p = dz.k.ReasonInterrupted;
        }
    }
}
