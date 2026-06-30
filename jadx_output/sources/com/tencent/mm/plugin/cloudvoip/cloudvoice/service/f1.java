package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f95901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g1 f95902e;

    public f1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g1 g1Var, java.util.ArrayList arrayList) {
        this.f95902e = g1Var;
        this.f95901d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f95902e.f95911a;
        if (p0Var.f96024o != com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2.InRoom) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: onSpeakerListChanged but not in room!");
            return;
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar = p0Var.D;
        if (bVar != null) {
            bVar.a(0, 0, "on talklist change", this.f95901d);
        }
    }
}
