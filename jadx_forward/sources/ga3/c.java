package ga3;

/* loaded from: classes15.dex */
public class c implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ga3.e f351376a;

    public c(ga3.e eVar) {
        this.f351376a = eVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecorder", "LiteApp state:%d, detailState:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        ga3.d dVar = this.f351376a.f351382f;
        if (dVar != null) {
            ga3.m mVar = (ga3.m) dVar;
            mVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "LiteApp onRecError state:%d, detailState:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            ga3.v vVar = mVar.f351393a;
            vVar.b();
            vVar.h(1);
        }
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        ga3.v vVar;
        kh1.e eVar;
        ga3.e eVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecorder", "LiteApp onRecPcmDataReady()");
        ga3.d dVar = this.f351376a.f351382f;
        if (dVar == null || (eVar = (vVar = ((ga3.m) dVar).f351393a).f351413f) == null || (eVar2 = vVar.f351408a) == null) {
            return;
        }
        tl.w wVar = eVar2.f351377a;
        vVar.f351416i += wVar != null ? wVar.f501688h : 20;
        try {
            if (!eVar.d(vVar.f351415h, bArr, i17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppRecordMgr", "LiteApp encode pcm fail!");
            }
            if (vVar.f351419l > 0) {
                if (vVar.f351411d.f167369e == 16000) {
                    int i18 = i17 % 4;
                    if (i18 != 0) {
                        i17 -= i18;
                    }
                    if (i17 <= 0) {
                        bArr = null;
                    } else {
                        int i19 = i17 / 2;
                        byte[] bArr2 = new byte[i19];
                        for (int i27 = 0; i27 < i19; i27 += 2) {
                            int i28 = i27 * 2;
                            bArr2[i27] = bArr[i28];
                            bArr2[i27 + 1] = bArr[i28 + 1];
                        }
                        bArr = bArr2;
                    }
                    i17 = bArr.length;
                }
                double d17 = 0.0d;
                for (int i29 = 0; i29 < i17 / 2; i29++) {
                    int i37 = i29 * 2;
                    short s17 = (short) ((bArr[i37 + 1] << 8) | (bArr[i37] & 255));
                    d17 += s17 * s17;
                }
                double log10 = java.lang.Math.log10(d17 / i17) * 10.0d;
                if (java.lang.Double.isNaN(log10) || java.lang.Double.isInfinite(log10)) {
                    return;
                }
                int i38 = vVar.f351421n;
                if (i38 <= 1) {
                    vVar.f351420m = (int) log10;
                } else {
                    vVar.f351420m = (int) (((vVar.f351420m * (i38 - 1)) + log10) / i38);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppRecordMgr", e17, "onRecPcmDataReady", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = vVar.f351411d;
            if (c12420xb1146e9c != null && "mp3".equalsIgnoreCase(c12420xb1146e9c.f167372h)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.o0.a(19);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c2 = vVar.f351411d;
            if (c12420xb1146e9c2 == null || !"aac".equalsIgnoreCase(c12420xb1146e9c2.f167372h)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.o0.a(23);
        }
    }
}
