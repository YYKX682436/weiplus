package com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.aff.ext_device.ZIDL__wvRFproKE */
/* loaded from: classes11.dex */
public class C27295xc8383f1d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298218a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298219b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298220c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298221d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_CI */
    private void m112651x1964d1ae(boolean z17, byte[][] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298218a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("ExtDeviceStatusManagerKE", "onOnlineDeviceInfoChangeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("ExtDeviceStatusManagerKE", "onOnlineDeviceInfoChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119629xd40dd8d(com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.o.f298244s, bArr);
            throw null;
        }
    }

    /* renamed from: ZIDL_EI */
    private void m112652x1964d1ec() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298219b;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("ExtDeviceStatusManagerKE", "onOnlineDeviceBannerInfoChangeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("ExtDeviceStatusManagerKE", "onOnlineDeviceBannerInfoChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }

    /* renamed from: ZIDL_LI */
    private void m112653x1964d2c5(byte[] bArr, int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298220c;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("ExtDeviceStatusManagerKE", "onSyncStatusChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("ExtDeviceStatusManagerKE", "onSyncStatusChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }

    /* renamed from: ZIDL_MI */
    private void m112654x1964d2e4(int i17) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("ExtDeviceStatusManagerKE", "onOverallSyncStatusChangedEvent size: " + this.f298221d.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f298221d.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("ExtDeviceStatusManagerKE", "onOverallSyncStatusChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.k kVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.k) entry.getValue();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.n a17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.n.a(i17);
            final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.l0 l0Var = ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.C22389x608481d) kVar).f289080a;
            if (l0Var.f289079q != a17) {
                l0Var.f289079q = a17;
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.conversation.banner.l0$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.l0.this.i();
                    }
                });
            }
        }
    }
}
