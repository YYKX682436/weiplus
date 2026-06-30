package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f95947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f95948f;

    public m1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar, boolean z17) {
        this.f95948f = p0Var;
        this.f95946d = bVar;
        this.f95947e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f95948f.f96024o != com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2.InRoom) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room!");
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar = this.f95946d;
            if (bVar != null) {
                bVar.a(-10086, com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND, "not in room", "");
                return;
            }
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o oVar = this.f95948f.f96018g;
        boolean z17 = this.f95947e;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "set record mute from %b to %b", java.lang.Boolean.valueOf(oVar.f95980l), java.lang.Boolean.valueOf(z17));
        boolean z18 = oVar.f95980l;
        oVar.f95980l = z17;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        p0Var.getClass();
        boolean z19 = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = z17 ? "mute" : "unMute";
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: onMicMute %s", objArr);
        p0Var.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r1(p0Var, z17));
        if (z18 != z17) {
            if (z17) {
                if (oVar.f95970b != null) {
                    boolean l17 = oVar.f95970b.l();
                    oVar.f95970b = null;
                    com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g0.b(402, new byte[1], 1);
                    z19 = l17;
                }
                if (!z19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "Failed to stop recorder");
                }
            } else {
                if (oVar.f95970b == null) {
                    oVar.a();
                    z19 = oVar.f95970b.k();
                }
                if (!z19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "Failed to start record");
                }
            }
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar2 = this.f95946d;
        if (bVar2 != null) {
            if (z19) {
                bVar2.a(0, 0, "ok", "");
            } else {
                bVar2.a(-10086, -15, "set mute failed", "");
            }
        }
    }
}
