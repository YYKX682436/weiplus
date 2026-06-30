package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes7.dex */
public class a2 implements dz.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f95826a;

    public a2(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var) {
        this.f95826a = p0Var;
    }

    @Override // dz.m
    public void a() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f95826a;
        if (p0Var.Z1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "is interrupting");
            return;
        }
        p0Var.Z1 = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "onInterruptionBegin");
        p0Var.m(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.z1(p0Var));
    }

    @Override // dz.m
    public void b() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f95826a;
        if (!p0Var.Z1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "not call onInterruptionEnd");
        } else {
            p0Var.Z1 = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "onInterruptionEnd");
        }
    }
}
