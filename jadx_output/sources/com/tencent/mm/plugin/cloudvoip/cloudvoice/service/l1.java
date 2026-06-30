package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f95940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f95941f;

    public l1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar, boolean z17) {
        this.f95941f = p0Var;
        this.f95939d = bVar;
        this.f95940e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f95941f;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2 r2Var = p0Var.f96024o;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2 r2Var2 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2.InRoom;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar = this.f95939d;
        if (r2Var != r2Var2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room!");
            if (bVar != null) {
                bVar.a(-10086, com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND, "not in room", "");
                return;
            }
        }
        p0Var.f96018g.f95979k = this.f95940e;
        if (bVar != null) {
            bVar.a(0, 0, "ok", "");
        }
    }
}
