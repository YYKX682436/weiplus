package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class z0 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f96147a;

    public z0(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var) {
        this.f96147a = p0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: on avmembers changed errCode: " + i17);
        this.f96147a.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y0(this, (r45.p70) obj, i17));
        return "";
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public java.lang.Object b(byte[] bArr) {
        r45.p70 p70Var = new r45.p70();
        try {
            p70Var.parseFrom(bArr);
            return p70Var;
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
