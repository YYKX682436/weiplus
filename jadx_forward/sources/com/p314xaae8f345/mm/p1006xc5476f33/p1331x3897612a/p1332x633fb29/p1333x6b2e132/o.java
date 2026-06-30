package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132;

/* loaded from: classes15.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.p f177724d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.n nVar) {
        this.f177724d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.p pVar = this.f177724d;
        try {
            pVar.f177729e = pVar.f177729e.replaceAll("[^0-9a-zA-Z一-龥.?!,;:。？！，、；：@%&/]+", "");
            java.lang.String str = pVar.f177729e;
            float f17 = pVar.f177733i;
            float f18 = pVar.f177734j;
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.C13131x7a99ab9f c13131x7a99ab9f = pVar.f177728d;
            byte[] bytes = pVar.f177729e.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            byte[] bArr = pVar.f177732h;
            pVar.getClass();
            int m54554xbe6554ea = c13131x7a99ab9f.m54554xbe6554ea(bytes, bArr, 256000, pVar.f177733i, pVar.f177734j);
            if (m54554xbe6554ea != -1) {
                byte[] bArr2 = new byte[m54554xbe6554ea];
                java.lang.System.arraycopy(pVar.f177732h, 0, bArr2, 0, m54554xbe6554ea);
                if (!pVar.f177731g) {
                    android.os.Message mo50289x733c63a2 = pVar.f177735k.mo50289x733c63a2(0);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putByteArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, bArr2);
                    mo50289x733c63a2.setData(bundle);
                    pVar.f177735k.mo50308x2936bf5f(mo50289x733c63a2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.InnerSynthesizer", "Synthesizer run success");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.InnerSynthesizer", "Synthesizer run fail");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = pVar.f177735k;
                n3Var.mo50308x2936bf5f(n3Var.mo50289x733c63a2(-1));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.InnerSynthesizer", "SynthesizerRunnable Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = pVar.f177735k;
            n3Var2.mo50308x2936bf5f(n3Var2.mo50289x733c63a2(-1));
        }
    }
}
