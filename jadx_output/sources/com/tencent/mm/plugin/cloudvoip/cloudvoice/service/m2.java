package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f95949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.n2 f95950e;

    public m2(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.n2 n2Var, int i17) {
        this.f95950e = n2Var;
        this.f95949d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "mJoinFailed->join fail, reset session");
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.n2 n2Var = this.f95950e;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = n2Var.f95968b;
        p0Var.f96015d.c(p0Var.f96028q);
        n2Var.f95968b.h();
        n2Var.f95968b.d(n2Var.f95967a, -10086, -5, "join room callback failed: " + this.f95949d);
    }
}
