package com.p314xaae8f345.p3133xd0ce8b26.aff.sns;

/* renamed from: com.tencent.wechat.aff.sns.ZIDL_vWtfD3iFjKE */
/* loaded from: classes4.dex */
class C27498x38c71d9d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299029a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_FI */
    private void m116691x1964d20b(int i17, int i18, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299029a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("SnsCoverLogicDBManagerKE", "onSnsCoverInfoChangeEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("SnsCoverLogicDBManagerKE", "onSnsCoverInfoChangeEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }
}
