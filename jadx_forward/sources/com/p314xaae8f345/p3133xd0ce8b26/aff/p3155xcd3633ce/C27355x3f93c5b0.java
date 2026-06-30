package com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.aff.migration.ZIDL_t1VLdSnZKE */
/* loaded from: classes11.dex */
public class C27355x3f93c5b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298917a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298918b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298919c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298920d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_EBI */
    private void m113449x13356b04() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298917a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("MigrationManagerKE", "onCloseTaskDetailPageEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("MigrationManagerKE", "onCloseTaskDetailPageEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }

    /* renamed from: ZIDL_FBI */
    private void m113450x13356ec5(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298918b;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("MigrationManagerKE", "onNotifyTaskProgressEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("MigrationManagerKE", "onNotifyTaskProgressEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }

    /* renamed from: ZIDL_GBI */
    private void m113451x13357286(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298919c;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("MigrationManagerKE", "onNotifyTaskStatusEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("MigrationManagerKE", "onNotifyTaskStatusEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }

    /* renamed from: ZIDL_HBI */
    private void m113452x13357647(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298920d;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("MigrationManagerKE", "onNotifyTaskSceneEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("MigrationManagerKE", "onNotifyTaskSceneEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }
}
