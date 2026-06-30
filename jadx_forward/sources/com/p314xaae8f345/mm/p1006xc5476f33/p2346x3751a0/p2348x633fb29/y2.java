package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes12.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 f258459d;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var) {
        this.f258459d = d3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.nio.ByteBuffer] */
    @Override // java.lang.Runnable
    public void run() {
        int a17;
        this.f258459d.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.G = (!fp.e0.e() || (a17 = (int) pj.h.a()) == -1) ? wh.m.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : a17 * 10;
        byte[] array = java.nio.ByteBuffer.allocate(4).putInt(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.G).array();
        this.f258459d.f257944a.f258065x.m72844xf1a2f51c(3, array, array.length);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = this.f258459d.f257944a.f258065x;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.G;
        c18912x54425f62.f258420t0 = i17;
        if (i17 <= 350) {
            c18912x54425f62.f258429w0++;
        } else if (i17 <= 380) {
            c18912x54425f62.f258432x0++;
        } else if (i17 <= 420) {
            c18912x54425f62.f258435y0++;
        } else {
            c18912x54425f62.f258438z0++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.H = wh.m.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        ph.c c17 = ph.t.k().c();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.H > 0) {
            byte[] array2 = java.nio.ByteBuffer.allocate(4).putInt(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.H).array();
            this.f258459d.f257944a.f258065x.m72844xf1a2f51c(7, array2, array2.length);
        }
        int i18 = 0;
        if (c17.d()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.I = 1;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.I = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f622 = this.f258459d.f257944a.f258065x;
        c18912x54425f622.G0 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.I;
        c18912x54425f622.E0 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.H;
        byte[] array3 = java.nio.ByteBuffer.allocate(4).putInt(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.I).array();
        this.f258459d.f257944a.f258065x.m72844xf1a2f51c(10, array3, array3.length);
        android.os.PowerManager powerManager = (android.os.PowerManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power");
        ?? isPowerSaveMode = powerManager != null ? powerManager.isPowerSaveMode() : 0;
        this.f258459d.f257944a.f258065x.I0 = isPowerSaveMode;
        byte[] array4 = java.nio.ByteBuffer.allocate(4).putInt(isPowerSaveMode).array();
        this.f258459d.f257944a.f258065x.m72844xf1a2f51c(8, array4, array4.length);
        if (ih.d.c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var = this.f258459d;
            if (d3Var.f257961r != null) {
                if (d3Var.f257962s == 1) {
                    synchronized (d3Var.f257960q) {
                        this.f258459d.f257959p.l();
                        this.f258459d.f257963t = 1;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var2 = this.f258459d;
                if (d3Var2.f257962s == 0) {
                    d3Var2.f257959p.F(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class);
                    synchronized (this.f258459d.f257960q) {
                        if (this.f258459d.f257959p.E()) {
                            this.f258459d.f257959p.a();
                        }
                        this.f258459d.f257959p.b();
                        this.f258459d.f257959p.I();
                        this.f258459d.f257962s = 1;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var3 = this.f258459d;
                if (d3Var3.f257962s == 1 && d3Var3.f257963t == 1) {
                    d3Var3.f257962s = 0;
                    d3Var3.f257963t = 0;
                    rh.c1 c1Var = d3Var3.f257959p;
                    if (c1Var.f476863l != null && (i18 = c1Var.s()) >= 0) {
                        byte[] array5 = java.nio.ByteBuffer.allocate(4).putInt(i18).array();
                        this.f258459d.f257944a.f258065x.m72844xf1a2f51c(4, array5, array5.length);
                    }
                }
            }
        }
        if (i18 > 0) {
            this.f258459d.f257944a.f258065x.A0 = i18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f623 = this.f258459d.f257944a.f258065x;
        if (c18912x54425f623.f258423u0 == -1) {
            c18912x54425f623.f258423u0 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.G;
        }
        if (c18912x54425f623.B0 == 0) {
            c18912x54425f623.B0 = c18912x54425f623.A0;
        }
        if (c18912x54425f623.D0 == 0) {
            c18912x54425f623.D0 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.H;
        }
        if (c18912x54425f623.F0 == -1) {
            c18912x54425f623.F0 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.I;
        }
        if (c18912x54425f623.H0 == -1) {
            c18912x54425f623.H0 = isPowerSaveMode;
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.G;
        if (i19 > c18912x54425f623.f258426v0) {
            c18912x54425f623.f258426v0 = i19;
        }
        if (i18 > c18912x54425f623.C0) {
            c18912x54425f623.C0 = i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipServiceEx", "battery temp %d, cpuLoad %d, batteryQuantity %d, islowpowermode %d, batteryCharge %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.H), java.lang.Integer.valueOf((int) isPowerSaveMode), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.I));
    }
}
