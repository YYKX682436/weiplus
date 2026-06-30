package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class b0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.b0 f159408a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.b0();

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced59, boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.v0.a(c11858x835ced59, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.m1.f159454g, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.a1.f159404a);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159435a.j(c11858x835ced59, z17) || z17) {
            return;
        }
        java.lang.String field_appId = c11858x835ced59.f65990x28d45f97;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_appId, "field_appId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.b1) ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159439e).get(str);
        if (b1Var != null) {
            b1Var.b();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159441g;
        java.lang.Object obj = concurrentHashMap.get(field_appId);
        if (obj == null) {
            obj = new java.util.concurrent.ConcurrentHashMap();
            concurrentHashMap.put(field_appId, obj);
        }
        java.util.Map map = (java.util.Map) obj;
        if (map.get(str) == null) {
            map.put(str, java.lang.Boolean.FALSE);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.d1
    public final void a(java.lang.String deviceId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        t91.a aVar = t91.a.f498100a;
        aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onConnectStateChange, deviceId: " + deviceId + ", isConnected: " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced59 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59) ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159438d).get(deviceId);
        if (c11858x835ced59 == null) {
            aVar.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onConnectStateChange, deviceInfo is null");
            return;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159440f.add(deviceId);
            b(c11858x835ced59, z17, deviceId);
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159440f.remove(deviceId)) {
            aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onConnectStateChange, maybe device away");
        } else {
            b(c11858x835ced59, z17, deviceId);
        }
    }
}
