package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class e2 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fw1.b f95896b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f95897c;

    public e2(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar, fw1.b bVar2) {
        this.f95897c = p0Var;
        this.f95895a = bVar;
        this.f95896b = bVar2;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w2
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t2 t2Var, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: session result: %d, %d, %s, %s, %b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, t2Var, java.lang.Boolean.valueOf(z17));
        this.f95897c.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d2(this, i17, i18, t2Var, z17, str));
    }
}
