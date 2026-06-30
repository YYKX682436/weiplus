package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class u0 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f96100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f96101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f96102c;

    public u0(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var, boolean z17, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar) {
        this.f96102c = p0Var;
        this.f96100a = z17;
        this.f96101b = bVar;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        this.f96102c.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t0(this, (r45.s70) obj));
        return "";
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public java.lang.Object b(byte[] bArr) {
        r45.s70 s70Var = new r45.s70();
        try {
            s70Var.parseFrom(bArr);
            return s70Var;
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
        return false;
    }
}
