package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class p0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f159480a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.d1 f159481b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f159482c;

    public p0(java.lang.String deviceId, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.d1 gattConnectListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gattConnectListener, "gattConnectListener");
        this.f159480a = deviceId;
        this.f159481b = gattConnectListener;
        this.f159482c = "MicroMsg.AppBrand.AutoConnectGattSimpleStrategy#" + hashCode();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.b1
    public boolean a() {
        t91.a.f498100a.a(this.f159482c, "connect");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0.f159495a.a(this.f159480a, this.f159481b);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.b1
    public void b() {
        t91.a.f498100a.a(this.f159482c, "pauseConnect");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.b1
    public void c(boolean z17) {
        t91.a.f498100a.a(this.f159482c, "resumeConnect, canReset: " + z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.b1
    /* renamed from: disconnect */
    public boolean mo50230x1f9d589c() {
        t91.a.f498100a.a(this.f159482c, "disconnect");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0.f159495a.b(this.f159480a);
    }
}
