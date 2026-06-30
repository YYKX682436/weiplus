package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class o0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f159468a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.d1 f159469b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f159470c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.n0 f159471d;

    public o0(java.lang.String deviceId, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.d1 gattConnectListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gattConnectListener, "gattConnectListener");
        this.f159468a = deviceId;
        this.f159469b = gattConnectListener;
        this.f159470c = "MicroMsg.AppBrand.AutoConnectGattRetryStrategy#" + hashCode();
        this.f159471d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.n0(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.b1
    public boolean a() {
        t91.a aVar = t91.a.f498100a;
        aVar.a(this.f159470c, "connect");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0 u0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0.f159495a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.n0 n0Var = this.f159471d;
        n0Var.getClass();
        aVar.a(n0Var.f159466e.f159470c, "get#gattConnectListenerWithRetry");
        n0Var.f159462a = android.os.SystemClock.elapsedRealtime();
        return u0Var.a(this.f159468a, n0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.b1
    public void b() {
        t91.a aVar = t91.a.f498100a;
        aVar.a(this.f159470c, "pauseConnect");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.n0 n0Var = this.f159471d;
        n0Var.getClass();
        aVar.a(n0Var.f159466e.f159470c, "pause#gattConnectListenerWithRetry");
        n0Var.f159464c = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.b1
    public void c(boolean z17) {
        t91.a aVar = t91.a.f498100a;
        aVar.a(this.f159470c, "resumeConnect, canReset: " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.n0 n0Var = this.f159471d;
        n0Var.getClass();
        aVar.a(n0Var.f159466e.f159470c, "resume#gattConnectListenerWithRetry, canReset: " + z17);
        n0Var.f159464c = false;
        if (z17) {
            aVar.a(n0Var.f159466e.f159470c, "reset#gattConnectListenerWithRetry");
            n0Var.f159462a = -1L;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k1 k1Var = n0Var.f159463b;
            k1Var.getClass();
            aVar.a("MicroMsg.AppBrand.AutoConnectGattRetryStrategy", "reset#RetryDelayMillsResolver");
            synchronized (k1Var) {
                k1Var.f159447a = 1;
            }
        }
        yz5.a aVar2 = n0Var.f159465d;
        if (aVar2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.m0) aVar2).mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.b1
    /* renamed from: disconnect */
    public boolean mo50230x1f9d589c() {
        t91.a aVar = t91.a.f498100a;
        aVar.a(this.f159470c, "disconnect");
        boolean b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0.f159495a.b(this.f159468a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.n0 n0Var = this.f159471d;
        n0Var.getClass();
        aVar.a(n0Var.f159466e.f159470c, "reset#gattConnectListenerWithRetry");
        n0Var.f159462a = -1L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k1 k1Var = n0Var.f159463b;
        k1Var.getClass();
        aVar.a("MicroMsg.AppBrand.AutoConnectGattRetryStrategy", "reset#RetryDelayMillsResolver");
        synchronized (k1Var) {
            k1Var.f159447a = 1;
        }
        return b17;
    }
}
