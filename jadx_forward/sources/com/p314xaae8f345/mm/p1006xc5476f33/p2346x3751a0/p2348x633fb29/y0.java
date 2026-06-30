package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f258454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f258455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f258456f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z0 f258457g;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z0 z0Var, int i17, int i18, int i19) {
        this.f258457g = z0Var;
        this.f258454d = i17;
        this.f258455e = i18;
        this.f258456f = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        vq4.d0.c("MicroMsg.Voip.VoipContext", "v2protocal StartConnectChannel relay");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z0 z0Var = this.f258457g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = z0Var.f258462b.f258065x;
        int i17 = c18912x54425f62.W0;
        int i18 = (((i17 >> 2) & 3) >> 1) & 1 & ((i17 & 3) >> 1) & 1;
        int i19 = c18912x54425f62.f258407p;
        long j17 = c18912x54425f62.f258410q;
        int i27 = c18912x54425f62.f258413r;
        long j18 = c18912x54425f62.f258416s;
        byte[] bArr = c18912x54425f62.f258422u;
        int i28 = c18912x54425f62.f258437z;
        int i29 = c18912x54425f62.A;
        int i37 = c18912x54425f62.B;
        int i38 = c18912x54425f62.f258431x;
        byte[] bArr2 = c18912x54425f62.f258434y;
        int length = bArr2 == null ? 0 : bArr2.length;
        int i39 = c18912x54425f62.C;
        int i47 = c18912x54425f62.f258389j;
        int i48 = c18912x54425f62.f258379f1;
        byte[] bArr3 = c18912x54425f62.f258382g1;
        int i49 = c18912x54425f62.f258385h1;
        int i57 = c18912x54425f62.D;
        long j19 = c18912x54425f62.E;
        byte[] bArr4 = c18912x54425f62.G;
        int length2 = bArr4 == null ? 0 : bArr4.length;
        byte[] bArr5 = c18912x54425f62.F;
        int m72842x4deff112 = c18912x54425f62.m72842x4deff112(i19, j17, i27, 0, j18, bArr, i28, i29, i37, i38, length, bArr2, i39, i18, i47, i48, bArr3, i49, i57, j19, length2, bArr4, bArr5 == null ? 0 : bArr5.length, bArr5, c18912x54425f62.f258388i1, this.f258454d, this.f258455e, this.f258456f, "", "", com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.w());
        if (m72842x4deff112 < 0) {
            vq4.d0.b("MicroMsg.Voip.VoipContext", "v2protocal setConfigInfo or connectToPeerRelay failed, ret:" + m72842x4deff112);
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = z0Var.f258462b;
            g1Var.f258065x.M1.f258246a = 14;
            g1Var.v(1, -9002, "", -1);
            z0Var.f258461a.a();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f622 = z0Var.f258462b.f258065x;
        byte[] bArr6 = c18912x54425f622.f258427v1;
        if (bArr6 == null) {
            vq4.d0.b("MicroMsg.Voip.VoipContext", "relay conns buf null");
            z0Var.f258462b.v(1, -9002, "", -1);
            z0Var.f258461a.a();
            return;
        }
        int m72777xf4d2fd75 = c18912x54425f622.m72777xf4d2fd75(bArr6, bArr6.length, 0, false);
        if (m72777xf4d2fd75 < 0) {
            vq4.d0.b("MicroMsg.Voip.VoipContext", "add relayconns err:" + m72777xf4d2fd75);
            z0Var.f258462b.v(1, -9002, "", -1);
            z0Var.f258461a.a();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var2 = z0Var.f258462b;
        g1Var2.f258044c = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var = g1Var2.f258065x.M1;
        l1Var.f258254h = (byte) 1;
        l1Var.f258262p = 1;
        z0Var.f258461a.a();
    }
}
