package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes7.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.s0 f96072d;

    public q0(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.s0 s0Var) {
        this.f96072d = s0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.s0 s0Var = this.f96072d;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.i iVar = s0Var.f96085a.f95926b.X1;
        if (iVar != null) {
            md1.k kVar = (md1.k) iVar;
            kVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "qlong: dispatchInterruptionBegin by onPhoneCall!");
            com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) kVar.f325755a.get();
            if (c0Var != null) {
                com.tencent.mm.plugin.appbrand.jsapi.audio.f.a(c0Var);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: hy: phone broken. exit room if in room");
        s0Var.f96085a.f95926b.k(dz.k.ReasonInCommingCall);
    }
}
