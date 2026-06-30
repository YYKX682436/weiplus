package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class m implements com.tencent.mm.plugin.voip.model.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o f95944a;

    public m(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o oVar) {
        this.f95944a = oVar;
    }

    @Override // com.tencent.mm.plugin.voip.model.b
    public int a(byte[] bArr, int i17) {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o oVar = this.f95944a;
        if (oVar.f95972d != 2) {
            return -1;
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.getClass();
        int GetAudioData = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g0.f95910c.GetAudioData(bArr, i17);
        java.util.Iterator it = oVar.f95988t.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Iterator it6 = ((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.v1) ((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.n) ((java.util.Map.Entry) it.next()).getValue())).f96117a.T1.entrySet().iterator();
            while (it6.hasNext()) {
                try {
                    ((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c0) ((java.util.Map.Entry) it6.next()).getValue()).a(bArr, java.lang.System.nanoTime() / 1000);
                } catch (java.lang.IllegalStateException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "Failed to encode audio %s", e17);
                }
            }
        }
        if (oVar.f95979k) {
            return -10086;
        }
        return GetAudioData < 0 ? -1 : 0;
    }
}
