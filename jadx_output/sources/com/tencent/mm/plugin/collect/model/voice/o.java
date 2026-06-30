package com.tencent.mm.plugin.collect.model.voice;

/* loaded from: classes15.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.model.voice.p f96191d;

    public o(com.tencent.mm.plugin.collect.model.voice.p pVar, com.tencent.mm.plugin.collect.model.voice.n nVar) {
        this.f96191d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.collect.model.voice.p pVar = this.f96191d;
        try {
            pVar.f96196e = pVar.f96196e.replaceAll("[^0-9a-zA-Z一-龥.?!,;:。？！，、；：@%&/]+", "");
            java.lang.String str = pVar.f96196e;
            float f17 = pVar.f96200i;
            float f18 = pVar.f96201j;
            com.tencent.mm.plugin.collect.model.voice.SynthesizerNative synthesizerNative = pVar.f96195d;
            byte[] bytes = pVar.f96196e.getBytes(com.tencent.mapsdk.internal.rv.f51270c);
            byte[] bArr = pVar.f96199h;
            pVar.getClass();
            int readmoney = synthesizerNative.readmoney(bytes, bArr, 256000, pVar.f96200i, pVar.f96201j);
            if (readmoney != -1) {
                byte[] bArr2 = new byte[readmoney];
                java.lang.System.arraycopy(pVar.f96199h, 0, bArr2, 0, readmoney);
                if (!pVar.f96198g) {
                    android.os.Message obtainMessage = pVar.f96202k.obtainMessage(0);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putByteArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, bArr2);
                    obtainMessage.setData(bundle);
                    pVar.f96202k.sendMessage(obtainMessage);
                    com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.InnerSynthesizer", "Synthesizer run success");
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.InnerSynthesizer", "Synthesizer run fail");
                com.tencent.mm.sdk.platformtools.n3 n3Var = pVar.f96202k;
                n3Var.sendMessage(n3Var.obtainMessage(-1));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.InnerSynthesizer", "SynthesizerRunnable Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = pVar.f96202k;
            n3Var2.sendMessage(n3Var2.obtainMessage(-1));
        }
    }
}
