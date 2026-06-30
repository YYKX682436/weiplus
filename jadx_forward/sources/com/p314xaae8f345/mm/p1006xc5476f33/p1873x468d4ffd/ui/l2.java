package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d f230896b;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d, int i17) {
        this.f230896b = activityC16554x70dcab5d;
        this.f230895a = i17;
    }

    public void a(byte[] bArr, int i17, int i18, int i19, int i27) {
        int i28;
        if (bArr == null || i17 < 0 || i18 < 0 || i19 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCaptureUI", "onPictureYuvTaken, data is null!! current state: %d", java.lang.Integer.valueOf(this.f230896b.f230764g));
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230896b;
            activityC16554x70dcab5d.f230767l1 = false;
            if (activityC16554x70dcab5d.f230764g == 7) {
                activityC16554x70dcab5d.i7(this.f230895a);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "data frameWidth %s frameHeight %s rotate %s deviceDegree %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d.U6(this.f230896b);
        this.f230896b.Z6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d2 = this.f230896b;
        activityC16554x70dcab5d2.P = i17;
        activityC16554x70dcab5d2.Q = i18;
        activityC16554x70dcab5d2.R = i19;
        activityC16554x70dcab5d2.S = i27;
        byte[] bArr2 = activityC16554x70dcab5d2.N;
        if (bArr2 != null) {
            ei3.x.f334720d.o(bArr2);
            this.f230896b.N = null;
        }
        this.f230896b.N = ei3.x.f334720d.m(java.lang.Integer.valueOf(bArr.length));
        java.lang.System.arraycopy(bArr, 0, this.f230896b.N, 0, bArr.length);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d3 = this.f230896b;
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.j2 j2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.j2(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        activityC16554x70dcab5d3.f230783x1 = t0Var.k(j2Var, 0L);
        di3.x.b(true, ai3.d.n("TIME_RECODER_2_PLAY"));
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d4 = this.f230896b;
        if (activityC16554x70dcab5d4.f230772p0) {
            i28 = java.lang.Math.abs(i19 - i27) != 0 ? 0 : 180;
            bArr = ai3.d.w(bArr, i17, i18, i28 % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3);
            this.f230896b.D.a(bArr, true, 0);
        } else {
            if (i27 == 180) {
                i19 += i27;
            }
            if (i19 > 360) {
                i19 += org.p3343x72743996.net.InterfaceC29524x4f65168b.f73983x984b3535;
            }
            i28 = i19;
            activityC16554x70dcab5d4.D.a(bArr, false, i28);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d5 = this.f230896b;
        activityC16554x70dcab5d5.T = bArr;
        activityC16554x70dcab5d5.U = i28;
        activityC16554x70dcab5d5.i7(3);
        this.f230896b.f230771p.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.k2(this));
        int i29 = this.f230896b.V.f230358o;
        if (i29 == 1 || i29 == 2 || i29 == 7) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13819, 1, java.lang.Integer.valueOf(this.f230896b.V.f230358o), this.f230896b.V.f230360q, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
        }
    }
}
