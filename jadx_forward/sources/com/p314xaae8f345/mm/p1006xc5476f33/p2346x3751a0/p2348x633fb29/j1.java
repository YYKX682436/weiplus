package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class j1 implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 f258219a;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 i1Var) {
        this.f258219a = i1Var;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 i1Var = this.f258219a;
        if (i18 == 4 || i18 == 3 || i18 == 2) {
            i1Var.f258182d.f258067z.R();
        } else if (i18 == 15) {
            if (fp.h.c(31)) {
                i1Var.f258182d.f258067z.Z();
            } else {
                i1Var.f258182d.f258067z.R();
            }
        }
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        synchronized (this.f258219a.f258186h) {
            c(bArr, i17);
        }
    }

    public final void c(byte[] bArr, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar = this.f258219a.f258179a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 i1Var = this.f258219a;
        if (i1Var.f258181c != 2 || eVar == null) {
            return;
        }
        if (i1Var.f258185g == 1) {
            i1Var.f258183e = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 i1Var2 = this.f258219a;
            i1Var2.f258184f = i1Var2.f258183e;
            i1Var2.f258185g = 0;
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 i1Var3 = this.f258219a;
            long j17 = i1Var3.f258184f;
            i1Var3.f258183e = currentTimeMillis;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 i1Var4 = this.f258219a;
        if (1 == i1Var4.f258195q) {
            i1Var4.f258195q = 0;
            i1Var4.f258197s = java.lang.System.currentTimeMillis();
            vq4.d0.c("MicroMsg.Voip.VoipDeviceHandler", "amyfwang,first record");
        } else {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            long j18 = currentTimeMillis2 - this.f258219a.f258197s;
            if (j18 > 1000) {
                vq4.d0.c("MicroMsg.Voip.VoipDeviceHandler", "amyfwang,error,record deltaTime:" + j18);
            }
            this.f258219a.f258197s = currentTimeMillis2;
        }
        tl.w wVar = this.f258219a.f258180b;
        if (wVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 i1Var5 = this.f258219a;
            if (i1Var5.B != 1) {
                i1Var5.f258182d.f258065x.f258399m0 = wVar.c();
                this.f258219a.f258182d.f258065x.m72838xe4580fb6(bArr, i17);
            }
        }
    }
}
