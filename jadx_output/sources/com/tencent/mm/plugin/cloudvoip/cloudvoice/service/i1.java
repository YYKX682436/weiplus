package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f95919d;

    public i1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var) {
        this.f95919d = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f95919d;
        if (p0Var.f96024o != com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2.NotInRoom || p0Var.R) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: still not join room in %d ms. directly release", 180000L);
        p0Var.p(true);
    }
}
