package com.p314xaae8f345.p3133xd0ce8b26.iam.biz;

/* renamed from: com.tencent.wechat.iam.biz.ZIDL_wkT3ITVWKE */
/* loaded from: classes4.dex */
class C27616x8ba366c1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299270a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_EI */
    private void m118234x1964d1ec(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299270a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizNativeToCppManagerKE", "onNotifyMessageEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizNativeToCppManagerKE", "onNotifyMessageEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }
}
