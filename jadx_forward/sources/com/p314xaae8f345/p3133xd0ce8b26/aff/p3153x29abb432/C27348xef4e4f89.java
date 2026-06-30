package com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.aff.local_connection.ZIDL_tTtjjalFKE */
/* loaded from: classes7.dex */
public class C27348xef4e4f89 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298888a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298889b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298890c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_JI */
    private void m113263x1964d287(byte[] bArr, int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298888a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("NearConnectionManagerKE", "onConnectedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("NearConnectionManagerKE", "onConnectedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.b bVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.b) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            kp.o oVar = (kp.o) bVar;
            oVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NearConnectionService", "Connected: ip = " + str + ", port = " + i17);
            gz.k kVar = oVar.f392337a.f392364d;
            if (kVar != null) {
                kVar.a(str, i17);
            }
        }
    }

    /* renamed from: ZIDL_KI */
    private void m113264x1964d2a6(int i17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298889b;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("NearConnectionManagerKE", "onDisconnectedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("NearConnectionManagerKE", "onDisconnectedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.c cVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.c) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            kp.p pVar = (kp.p) cVar;
            pVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NearConnectionService", "Disconnected: reason = " + i17 + ", errMsg = " + str);
            gz.k kVar = pVar.f392343a.f392364d;
            if (kVar != null) {
                kVar.b(i17, str);
            }
        }
    }

    /* renamed from: ZIDL_LI */
    private void m113265x1964d2c5(int i17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298890c;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("NearConnectionManagerKE", "onConnectFailedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("NearConnectionManagerKE", "onConnectFailedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.a aVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.a) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            kp.q qVar = (kp.q) aVar;
            qVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NearConnectionService", "ConnectFailed: reason = " + i17 + ", errMsg = " + str);
            gz.k kVar = qVar.f392346a.f392364d;
            if (kVar != null) {
                kVar.c(i17, str);
            }
        }
    }
}
