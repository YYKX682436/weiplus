package com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232;

/* renamed from: com.tencent.wechat.iam.finder_box.ZIDL_ED4dMDA8KE */
/* loaded from: classes4.dex */
class C27632x68b20b5f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299353a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299354b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_OI */
    private void m118411x1964d322(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299353a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BoxIamBizPersonalCenterRedDotManagerKE", "onRedDotUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BoxIamBizPersonalCenterRedDotManagerKE", "onRedDotUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }

    /* renamed from: ZIDL_QI */
    private void m118412x1964d360(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299354b;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BoxIamBizPersonalCenterRedDotManagerKE", "onCreatorTextRedDotUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BoxIamBizPersonalCenterRedDotManagerKE", "onCreatorTextRedDotUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }
}
