package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class q2 implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 f231615d;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 r2Var) {
        this.f231615d = r2Var;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] data, android.hardware.Camera arg1) {
        int i17;
        int i18;
        boolean z17;
        int i19;
        java.lang.Boolean valueOf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arg1, "arg1");
        if (data.length <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(159L, 0L, 1L, false);
            g0Var.mo68477x336bdfd8(159L, 3L, 1L, false);
            xq4.d dVar = this.f231615d.f231628i;
            if (dVar != null) {
                dVar.o();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 r2Var = this.f231615d;
        if (r2Var.f231625f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.CaptureRender", "onPreviewFrame mSize is null");
            return;
        }
        if (r2Var.f231628i != null) {
            byte[] bArr = r2Var.f231636q;
            if (bArr == null || bArr.length != data.length) {
                r2Var.f231636q = new byte[data.length];
            }
            java.lang.System.arraycopy(data, 0, r2Var.f231636q, 0, data.length);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 r2Var2 = this.f231615d;
            if (r2Var2.f231620a) {
                i17 = xq4.e.f537649d;
                wo.e eVar = wo.v1.f529355b;
                if (eVar.f529198j) {
                    wo.d dVar2 = eVar.f529197i;
                    if (dVar2.f529179d != 0) {
                        i18 = dVar2.f529180e;
                        i19 = i18;
                        z17 = true;
                    }
                }
                z17 = false;
                i19 = 1;
            } else {
                i17 = xq4.e.f537650e;
                wo.e eVar2 = wo.v1.f529355b;
                if (eVar2.f529200l) {
                    wo.d dVar3 = eVar2.f529199k;
                    if (dVar3.f529179d != 0) {
                        i18 = dVar3.f529180e;
                        i19 = i18;
                        z17 = true;
                    }
                }
                z17 = false;
                i19 = 1;
            }
            int i27 = i17 > 0 ? 32 : 0;
            if (z17) {
                valueOf = java.lang.Boolean.FALSE;
            } else {
                valueOf = java.lang.Boolean.valueOf(i17 > 0);
            }
            r2Var2.f231621b = valueOf;
            wo.q1 q1Var = this.f231615d.f231625f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q1Var);
            int i28 = q1Var.f529323a;
            wo.q1 q1Var2 = this.f231615d.f231625f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q1Var2);
            int i29 = q1Var2.f529324b;
            if (z17) {
                this.f231615d.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 r2Var3 = this.f231615d;
                if (r2Var3.f231630k == null) {
                    byte[] bArr2 = new byte[((i28 * i29) * 3) / 2];
                    r2Var3.f231630k = bArr2;
                    bArr2[0] = 90;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
                byte[] bArr3 = this.f231615d.f231636q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bArr3);
                int length = bArr3.length;
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 r2Var4 = this.f231615d;
                int i37 = r2Var4.f231626g;
                byte[] bArr4 = r2Var4.f231630k;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bArr4);
                int length2 = bArr4.length;
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 i1Var = Bi.f258091a.f257944a.A;
                if (i1Var.f258181c != 3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = i1Var.f258182d;
                    if (g1Var.f258065x.Q1 && g1Var.t()) {
                        g1Var.f258065x.m72867x5e9bac15(bArr3, length, i28, i29, i37, bArr4, length2, i28, i29, i19);
                    }
                }
                xq4.d dVar4 = this.f231615d.f231628i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar4);
                byte[] bArr5 = this.f231615d.f231630k;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bArr5);
                dVar4.v(bArr5, bArr5.length, i28, i29, this.f231615d.f231626g, i27, 0.0d);
            } else {
                xq4.d dVar5 = this.f231615d.f231628i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar5);
                byte[] bArr6 = this.f231615d.f231636q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bArr6);
                long length3 = bArr6.length;
                wo.q1 q1Var3 = this.f231615d.f231625f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q1Var3);
                int i38 = q1Var3.f529323a;
                wo.q1 q1Var4 = this.f231615d.f231625f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q1Var4);
                dVar5.v(bArr6, length3, i38, q1Var4.f529324b, this.f231615d.f231626g, i27, 0.0d);
            }
            r45.n27 n27Var = vq4.p0.f520907a;
            if (this.f231615d.f231623d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.CaptureRender", "the camera is null and has been release");
            } else if (this.f231615d.f231623d != null) {
                wo.d1 d1Var = this.f231615d.f231623d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d1Var);
                d1Var.a(data);
            }
        }
    }
}
