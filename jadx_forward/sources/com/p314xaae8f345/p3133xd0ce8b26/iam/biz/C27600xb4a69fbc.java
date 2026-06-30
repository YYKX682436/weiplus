package com.p314xaae8f345.p3133xd0ce8b26.iam.biz;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.iam.biz.ZIDL_XqmGHCCoKE */
/* loaded from: classes11.dex */
public class C27600xb4a69fbc {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299257a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299258b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299259c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299260d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_ABI */
    private void m118080x13355c00(boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299260d;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizPersonalCenterRedDotManagerKE", "onCreatorRedPointUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizPersonalCenterRedDotManagerKE", "onCreatorRedPointUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }

    /* renamed from: ZIDL_PI */
    private void m118081x1964d341(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299257a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizPersonalCenterRedDotManagerKE", "onEnterWorksEntryTimestampChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizPersonalCenterRedDotManagerKE", "onEnterWorksEntryTimestampChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((jr1.h) ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.b1) entry.getValue())).getClass();
            ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).f431048m = j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansUtil", "subscribeWorkEntryTimestampUpdated, timestamp: " + j17);
            rk.e.a(((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi(), null, 5, false, 5, null);
        }
    }

    /* renamed from: ZIDL_WI */
    private void m118082x1964d41a(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299258b;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizPersonalCenterRedDotManagerKE", "onRedDotUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizPersonalCenterRedDotManagerKE", "onRedDotUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((com.p314xaae8f345.p3133xd0ce8b26.iam.biz.g1) entry.getValue()).a((com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o4) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o4.f299966f, bArr));
        }
    }

    /* renamed from: ZIDL_YI */
    private void m118083x1964d458(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299259c;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizPersonalCenterRedDotManagerKE", "onCreatorTextRedDotUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizPersonalCenterRedDotManagerKE", "onCreatorTextRedDotUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }
}
