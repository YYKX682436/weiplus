package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class l implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o f95936a;

    public l(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o oVar) {
        this.f95936a = oVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        synchronized (this.f95936a.f95975g) {
            c(bArr, i17);
        }
    }

    public final void c(byte[] bArr, int i17) {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o oVar = this.f95936a;
        int i18 = oVar.f95976h + 1;
        oVar.f95976h = i18;
        if (i18 % 50 == 0) {
            oVar.f95976h = 0;
            int length = bArr.length;
        }
        if (oVar.f95972d == 2) {
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p pVar = oVar.f95969a;
            com.tencent.mm.plugin.voip.model.e eVar = pVar.f96006c.f257032l;
            if (eVar != null) {
                if (oVar.f95973e <= 10) {
                    oVar.f95973e = 92;
                }
                int a17 = ((oVar.f95973e * 3) + ((eVar != null ? eVar.a() : -1) + 24)) / 4;
                oVar.f95973e = a17;
                if (oVar.f95974f == 1) {
                    com.tencent.mm.plugin.voip.model.e eVar2 = pVar.f96006c.f257032l;
                    int i19 = eVar2 != null ? (eVar2.I / eVar2.f176451n) * eVar2.f176450m : -1;
                    if (i19 >= a17) {
                        i19 -= a17;
                    }
                    oVar.f95973e = i19;
                    oVar.f95974f = 0;
                } else {
                    oVar.f95973e = 0;
                }
                if (1 == oVar.f95977i) {
                    oVar.f95977i = 0;
                    oVar.f95978j = java.lang.System.currentTimeMillis();
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "amyfwang,first record");
                } else {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    long j17 = currentTimeMillis - oVar.f95978j;
                    if (j17 > 1000) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "amyfwang,error,deltaTime:" + j17);
                    }
                    oVar.f95978j = currentTimeMillis;
                }
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
                int length2 = bArr.length;
                int i27 = oVar.f95973e;
                p0Var.getClass();
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g0.f95910c.SendAudioData(bArr, length2, i27);
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w1 w1Var = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w1(p0Var, bArr);
                com.tencent.mm.sdk.platformtools.n3 n3Var = p0Var.f96023n;
                if (n3Var.getSerialTag().equals(xu5.b.e())) {
                    w1Var.run();
                } else {
                    n3Var.post(w1Var);
                }
            }
        }
    }
}
