package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class h2 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f95917a;

    public h2(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var) {
        this.f95917a = p0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: session key expired!! reset session key");
        this.f95917a.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g2(this));
        return "";
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public java.lang.Object b(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new java.lang.String(bArr);
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public byte[] c(java.lang.Object obj) {
        return new byte[0];
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public boolean d() {
        return true;
    }
}
