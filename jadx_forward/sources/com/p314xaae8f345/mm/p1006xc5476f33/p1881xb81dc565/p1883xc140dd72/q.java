package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class q implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s f231277a;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s sVar) {
        this.f231277a = sVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        synchronized (this.f231277a.f231299h) {
            c(bArr, i17);
        }
    }

    public final void c(byte[] bArr, int i17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s sVar = this.f231277a;
        int i19 = sVar.f231300i + 1;
        sVar.f231300i = i19;
        if (i19 % 50 == 0) {
            sVar.f231300i = 0;
            int length = bArr.length;
        }
        if (sVar.f231296e == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.t tVar = sVar.f231292a;
            if (tVar.f231324c != null) {
                if (sVar.f231297f <= 10) {
                    sVar.f231297f = 92;
                }
                zi3.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J;
                int i27 = -1;
                if (fVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar = fVar.f554703k;
                    i18 = eVar != null ? eVar.a() : -1;
                } else {
                    i18 = 0;
                }
                sVar.f231297f = ((sVar.f231297f * 3) + (i18 + 24)) / 4;
                if (sVar.f231298g == 1) {
                    tVar.getClass();
                    zi3.f fVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J;
                    if (fVar2 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar2 = fVar2.f554703k;
                        if (eVar2 != null) {
                            i27 = (eVar2.I / eVar2.f257984n) * eVar2.f257983m;
                        }
                    } else {
                        i27 = 0;
                    }
                    int i28 = sVar.f231297f;
                    if (i27 >= i28) {
                        i27 -= i28;
                    }
                    sVar.f231297f = i27;
                    sVar.f231298g = 0;
                } else {
                    sVar.f231297f = 0;
                }
                if (1 == sVar.f231301j) {
                    sVar.f231301j = 0;
                    sVar.f231302k = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkAudioMgr", "amyfwang,first record");
                } else {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    long j17 = currentTimeMillis - sVar.f231302k;
                    if (j17 > 1000) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkAudioMgr", "amyfwang,error,deltaTime:" + j17);
                    }
                    sVar.f231302k = currentTimeMillis;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
                int length2 = bArr.length;
                int i29 = sVar.f231297f;
                i4Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.m120002x47289dd8(bArr, length2, i29);
            }
        }
    }
}
