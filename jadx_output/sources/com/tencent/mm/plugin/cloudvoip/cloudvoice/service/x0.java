package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class x0 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f96127a;

    public x0(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var) {
        this.f96127a = p0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: on member changed");
        this.f96127a.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w0(this, (r45.b80) obj, i17));
        return "";
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public java.lang.Object b(byte[] bArr) {
        r45.b80 b80Var = new r45.b80();
        try {
            b80Var.parseFrom(bArr);
            return b80Var;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenVoice.OpenVoiceService", e17, "hy: unable to parse from data", new java.lang.Object[0]);
            return null;
        }
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
