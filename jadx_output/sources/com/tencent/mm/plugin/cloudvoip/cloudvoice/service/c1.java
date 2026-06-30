package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class c1 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f95873a;

    public c1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var) {
        this.f95873a = p0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: call broken! %d, %s", java.lang.Integer.valueOf(i17), (java.lang.String) obj);
        this.f95873a.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b1(this));
        return "";
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public /* bridge */ /* synthetic */ java.lang.Object b(byte[] bArr) {
        return "";
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public byte[] c(java.lang.Object obj) {
        return new byte[0];
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public boolean d() {
        return false;
    }
}
