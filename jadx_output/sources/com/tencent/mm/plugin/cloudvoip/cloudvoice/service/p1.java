package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f96045d;

    public p1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var) {
        this.f96045d = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f96045d;
        if (p0Var.f96026p0) {
            return;
        }
        p0Var.f96026p0 = true;
        com.tencent.mm.sdk.platformtools.o4.M("" + p0Var.f96028q + "_wxa_voip").putBoolean("isCameraStart", p0Var.f96026p0);
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g0.f95910c.SwitchAV(p0Var.Z ? 1 : 0, p0Var.f96026p0 ? 1 : 0, 0);
    }
}
