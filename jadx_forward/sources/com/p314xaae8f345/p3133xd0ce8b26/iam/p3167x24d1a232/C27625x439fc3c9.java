package com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232;

/* renamed from: com.tencent.wechat.iam.finder_box.ZIDL_D39_TNmwpKE */
/* loaded from: classes8.dex */
class C27625x439fc3c9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299346a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299347b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_NI */
    private void m118329x1964d303(byte[][] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299346a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BoxIamBizProfileNativeToCppManagerKE", "onOutboxMessagesUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BoxIamBizProfileNativeToCppManagerKE", "onOutboxMessagesUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119629xd40dd8d(r45.e6.f454570f, bArr);
            throw null;
        }
    }

    /* renamed from: ZIDL_PI */
    private void m118330x1964d341(byte[][] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299347b;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BoxIamBizProfileNativeToCppManagerKE", "onProfileMessagesUpdatedNotifyEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BoxIamBizProfileNativeToCppManagerKE", "onProfileMessagesUpdatedNotifyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119629xd40dd8d(r45.s5.f467041o, bArr);
            throw null;
        }
    }
}
