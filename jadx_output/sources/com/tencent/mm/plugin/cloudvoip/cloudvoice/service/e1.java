package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class e1 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f95894a;

    public e1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var) {
        this.f95894a = p0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        android.media.AudioTrack audioTrack;
        com.tencent.mm.plugin.voip.model.e eVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "onResult");
        if (this.f95894a.U) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "call end, stop ring");
            wq4.k0 k0Var = this.f95894a.f96020i;
            if (k0Var != null) {
                k0Var.e();
            }
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95992d = this.f95894a.f96018g.f95969a.f96006c.f();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o oVar = this.f95894a.f96018g;
        int i18 = 0;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95993e = oVar.f95970b == null ? 0 : oVar.f95970b.f420152e;
        com.tencent.mm.plugin.voip.model.e eVar2 = this.f95894a.f96018g.f95969a.f96006c.f257032l;
        int i19 = -1;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95994f = eVar2 != null ? eVar2.g() : -1;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o oVar2 = this.f95894a.f96018g;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95995g = oVar2.f95969a.f96006c.f257031k ? 1 : 0;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95996h = oVar2.f95970b == null ? 0 : oVar2.f95970b.b();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p pVar = this.f95894a.f96018g.f95969a;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95997i = (pVar == null || (eVar = pVar.f96006c.f257032l) == null) ? 0 : eVar.L;
        com.tencent.mm.plugin.voip.model.e eVar3 = pVar.f96006c.f257032l;
        if (eVar3 != null) {
            android.media.AudioManager audioManager = (android.media.AudioManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
            if (audioManager != null && (audioTrack = eVar3.f176452o) != null) {
                i18 = audioManager.getStreamVolume(audioTrack.getStreamType());
            }
            i19 = i18;
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95998j = i19;
        r45.t70 t70Var = new r45.t70();
        t70Var.f386175d = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95989a;
        t70Var.f386177f = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95990b;
        t70Var.f386178g = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95991c;
        t70Var.f386186r = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95996h;
        t70Var.f386191w = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95997i;
        t70Var.f386185q = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95995g;
        t70Var.f386181m = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95993e;
        t70Var.f386179h = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95992d;
        t70Var.f386182n = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95994f;
        t70Var.f386187s = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0.f95998j;
        this.f95894a.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d1(this, i17));
        return t70Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public /* bridge */ /* synthetic */ java.lang.Object b(byte[] bArr) {
        return null;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public byte[] c(java.lang.Object obj) {
        r45.t70 t70Var = (r45.t70) obj;
        if (t70Var != null) {
            try {
                return t70Var.toByteArray();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenVoice.OpenVoiceService", e17, "hy: error when convert to byte array", new java.lang.Object[0]);
            }
        }
        return new byte[0];
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public boolean d() {
        return true;
    }
}
