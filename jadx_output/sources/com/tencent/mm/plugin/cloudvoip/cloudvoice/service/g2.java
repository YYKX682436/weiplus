package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.h2 f95912d;

    public g2(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.h2 h2Var) {
        this.f95912d = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.h2 h2Var = this.f95912d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(h2Var.f95917a.f96028q)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room now");
            return;
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = h2Var.f95917a;
        p0Var.f96015d.c(p0Var.f96028q);
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var2 = h2Var.f95917a;
        p0Var2.f96015d.b(p0Var2.f96028q, p0Var2.f96030s, new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.f2(this));
    }
}
