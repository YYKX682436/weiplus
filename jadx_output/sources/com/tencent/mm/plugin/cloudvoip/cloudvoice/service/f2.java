package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class f2 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g2 f95903a;

    public f2(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g2 g2Var) {
        this.f95903a = g2Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w2
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t2 t2Var, boolean z17) {
        if (i17 == 0 && i18 == 0 && t2Var != null && t2Var.a()) {
            java.lang.String str2 = t2Var.f96097a;
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g0.f95910c.UpdateAuthKey(str2.getBytes(), str2.getBytes().length);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: refresh session key error!");
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f95903a.f95912d.f95917a;
        dz.k kVar = dz.k.ReasonSessionUpdateFailed;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var2 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        p0Var.k(kVar);
    }
}
