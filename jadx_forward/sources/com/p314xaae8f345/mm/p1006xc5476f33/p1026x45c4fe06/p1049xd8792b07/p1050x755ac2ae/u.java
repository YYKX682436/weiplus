package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u f159492a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f159493b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f159494c;

    static {
        java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newSetFromMap, "newSetFromMap(...)");
        f159494c = newSetFromMap;
    }

    public final void a(java.lang.String appId, java.lang.String wechatToken, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wechatToken, "wechatToken");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        t91.a.f498100a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "deleteInfoAsync, appId: " + appId + ", wechatToken: " + wechatToken);
        if (!f159493b) {
            uk0.a.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11852xac37013f(appId, wechatToken), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.j.f159432d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k(callback));
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.i(callback, appId, wechatToken), "MicroMsg.AppBrandMonitoredBluetoothDeviceService");
    }

    public final void b(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        t91.a.f498100a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "getAllInfoAsync");
        if (!f159493b) {
            uk0.a.b(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.o.f159467d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.p(callback));
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.n(callback), "MicroMsg.AppBrandMonitoredBluetoothDeviceService");
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 info, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        t91.a aVar = t91.a.f498100a;
        if (t91.a.f498101b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.n0.f159223a.b().mo40552x32c580(0L, null, null, null, 0, 0, 0L, 0L, "MicroMsg.AppBrandMonitoredBluetoothDeviceService: setInfoAsync");
        }
        if (!f159493b) {
            uk0.a.b(info, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.r.f159486d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.s(callback));
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.q(callback, info), "MicroMsg.AppBrandMonitoredBluetoothDeviceService");
    }

    public final void d(java.lang.String appId, java.lang.String deviceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        t91.a aVar = t91.a.f498100a;
        aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "statWeAppConnectGattSuccess, appId: " + appId + ", deviceId: " + deviceId);
        if (!f159494c.contains(appId)) {
            aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "statWeAppConnectGattSuccess, we dont care");
        } else if (f159493b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159435a.k(appId, deviceId);
        } else {
            uk0.a.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11853xb230f2c0(appId, deviceId), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.t.f159490d, null, 4, null);
        }
    }
}
