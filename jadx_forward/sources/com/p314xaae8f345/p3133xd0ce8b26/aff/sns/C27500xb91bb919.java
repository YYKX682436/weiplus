package com.p314xaae8f345.p3133xd0ce8b26.aff.sns;

/* renamed from: com.tencent.wechat.aff.sns.ZIDL_vWtfeknlKE */
/* loaded from: classes4.dex */
class C27500xb91bb919 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299030a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299031b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299032c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299033d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_JI */
    private void m116753x1964d287(int i17, int i18, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299030a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("SnsDBManagerKE", "onSnsInfoChangeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("SnsDBManagerKE", "onSnsInfoChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }

    /* renamed from: ZIDL_KI */
    private void m116754x1964d2a6(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299031b;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("SnsDBManagerKE", "onUserHideEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("SnsDBManagerKE", "onUserHideEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }

    /* renamed from: ZIDL_SI */
    private void m116755x1964d39e(byte[] bArr, long j17, long j18) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299032c;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("SnsDBManagerKE", "onSnsMessageChangeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("SnsDBManagerKE", "onSnsMessageChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }

    /* renamed from: ZIDL_TI */
    private void m116756x1964d3bd(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299033d;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("SnsDBManagerKE", "onSnsNewFeedChangeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("SnsDBManagerKE", "onSnsNewFeedChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }
}
