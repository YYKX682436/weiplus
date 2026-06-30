package com.p314xaae8f345.p3133xd0ce8b26.iam.biz;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.iam.biz.ZIDL_XqmGB1Os3KE */
/* loaded from: classes11.dex */
public class C27598x84bb4b7f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299253a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299254b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299255c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299256d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_QI */
    private void m118041x1964d360(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299253a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizPersonalCenterManagerKE", "onLoginSuccessEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizPersonalCenterManagerKE", "onLoginSuccessEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.y0) entry.getValue()).a(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
        }
    }

    /* renamed from: ZIDL_SI */
    private void m118042x1964d39e() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299254b;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizPersonalCenterManagerKE", "onUnregisteredRedDotChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizPersonalCenterManagerKE", "onUnregisteredRedDotChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }

    /* renamed from: ZIDL_UI */
    private void m118043x1964d3dc(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299255c;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizPersonalCenterManagerKE", "onBizClearedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizPersonalCenterManagerKE", "onBizClearedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.r0) entry.getValue()).a(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
        }
    }

    /* renamed from: ZIDL_WI */
    private void m118044x1964d41a(boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299256d;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizPersonalCenterManagerKE", "onFailedRedDotChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizPersonalCenterManagerKE", "onFailedRedDotChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            pm0.v.X(new v01.n(((v01.o) ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t0) entry.getValue())).f513748a, z17));
        }
    }
}
