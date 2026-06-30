package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz.k f95914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f95916f;

    public h1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var, dz.k kVar, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar) {
        this.f95916f = p0Var;
        this.f95914d = kVar;
        this.f95915e = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f95916f;
        int k17 = p0Var.k(this.f95914d);
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar = this.f95915e;
        if (k17 == -9999) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: pending exit. waiting for next time");
            p0Var.X = bVar;
        } else if (bVar != null) {
            if (k17 == 0) {
                bVar.a(0, 0, "", "");
            } else {
                bVar.a(-10086, -17, "exit failed", "");
            }
        }
    }
}
