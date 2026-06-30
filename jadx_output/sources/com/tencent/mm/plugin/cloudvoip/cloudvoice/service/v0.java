package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class v0 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f96115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f96116b;

    public v0(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar) {
        this.f96116b = p0Var;
        this.f96115a = bVar;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "mTalkFailed->join fail, reset session");
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f96116b;
        p0Var.f96015d.c(p0Var.f96028q);
        p0Var.h();
        p0Var.d(this.f96115a, -10086, -6, "join room talk callback failed: " + i17);
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
