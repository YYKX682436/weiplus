package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class n0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.d1 {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f159462a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k1 f159463b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k1();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f159464c;

    /* renamed from: d, reason: collision with root package name */
    public volatile yz5.a f159465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.o0 f159466e;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.o0 o0Var) {
        this.f159466e = o0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.d1
    public void a(java.lang.String deviceId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        this.f159466e.f159469b.a(deviceId, z17);
        if (z17) {
            return;
        }
        if (30000 < android.os.SystemClock.elapsedRealtime() - this.f159462a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k1 k1Var = this.f159463b;
            k1Var.getClass();
            t91.a.f498100a.a("MicroMsg.AppBrand.AutoConnectGattRetryStrategy", "reset#RetryDelayMillsResolver");
            synchronized (k1Var) {
                k1Var.f159447a = 1;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.m0(this, deviceId);
        if (this.f159464c) {
            this.f159465d = m0Var;
        } else {
            m0Var.mo152xb9724478();
        }
    }
}
