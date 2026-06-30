package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class l implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o f177469a;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o oVar) {
        this.f177469a = oVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        synchronized (this.f177469a.f177508g) {
            c(bArr, i17);
        }
    }

    public final void c(byte[] bArr, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o oVar = this.f177469a;
        int i18 = oVar.f177509h + 1;
        oVar.f177509h = i18;
        if (i18 % 50 == 0) {
            oVar.f177509h = 0;
            int length = bArr.length;
        }
        if (oVar.f177505d == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p pVar = oVar.f177502a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar = pVar.f177539c.f338565l;
            if (eVar != null) {
                if (oVar.f177506e <= 10) {
                    oVar.f177506e = 92;
                }
                int a17 = ((oVar.f177506e * 3) + ((eVar != null ? eVar.a() : -1) + 24)) / 4;
                oVar.f177506e = a17;
                if (oVar.f177507f == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar2 = pVar.f177539c.f338565l;
                    int i19 = eVar2 != null ? (eVar2.I / eVar2.f257984n) * eVar2.f257983m : -1;
                    if (i19 >= a17) {
                        i19 -= a17;
                    }
                    oVar.f177506e = i19;
                    oVar.f177507f = 0;
                } else {
                    oVar.f177506e = 0;
                }
                if (1 == oVar.f177510i) {
                    oVar.f177510i = 0;
                    oVar.f177511j = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "amyfwang,first record");
                } else {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    long j17 = currentTimeMillis - oVar.f177511j;
                    if (j17 > 1000) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "amyfwang,error,deltaTime:" + j17);
                    }
                    oVar.f177511j = currentTimeMillis;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
                int length2 = bArr.length;
                int i27 = oVar.f177506e;
                p0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.g0.f177443c.m120002x47289dd8(bArr, length2, i27);
                com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.w1 w1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.w1(p0Var, bArr);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = p0Var.f177556n;
                if (n3Var.mo50284xdd3e8650().equals(xu5.b.e())) {
                    w1Var.run();
                } else {
                    n3Var.mo50293x3498a0(w1Var);
                }
            }
        }
    }
}
