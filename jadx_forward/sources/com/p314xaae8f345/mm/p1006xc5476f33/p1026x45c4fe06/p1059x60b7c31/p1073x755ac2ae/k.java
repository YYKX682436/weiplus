package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae;

/* loaded from: classes7.dex */
public abstract class k implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.d, ob1.k {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f161613a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f161614b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f161615c;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f161613a = runtime;
        this.f161614b = "MicroMsg.AppBrand.BluetoothConnectStateChangeListener#" + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.i.f161607b.d(runtime);
    }

    @Override // ob1.k
    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161614b, "onBleConnectionStateChange, deviceId: " + str + ", connected: " + z17);
        if (str == null) {
            return;
        }
        b(str, z17);
    }

    public abstract void b(java.lang.String str, boolean z17);
}
