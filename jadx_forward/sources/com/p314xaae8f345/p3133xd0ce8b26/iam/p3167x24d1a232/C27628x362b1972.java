package com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232;

/* renamed from: com.tencent.wechat.iam.finder_box.ZIDL_E4kPx_59_KE */
/* loaded from: classes11.dex */
class C27628x362b1972 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299348a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_BI */
    private void m118355x1964d18f(int i17, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86 c27695xd9fb0a86) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299348a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BoxIamBizAudioPlayListManagerKE", "onSpecialPlayListChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("BoxIamBizAudioPlayListManagerKE", "onSpecialPlayListChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            if (i17 == 0 || i17 == 1 || i17 != 2) {
            }
            throw null;
        }
    }
}
