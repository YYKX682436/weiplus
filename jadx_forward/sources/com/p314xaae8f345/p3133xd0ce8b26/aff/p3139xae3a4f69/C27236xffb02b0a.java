package com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69;

/* renamed from: com.tencent.wechat.aff.data_report.ZIDL_MK0DaVBcKE */
/* loaded from: classes11.dex */
class C27236xffb02b0a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298137a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298138b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_II */
    private void m112272x1964d268(int i17, int i18, int i19) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298137a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("DataReportCgiManagerKE", "onDataReportIdKeyEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("DataReportCgiManagerKE", "onDataReportIdKeyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.a) entry.getValue()).a(i17, i18, i19);
        }
    }

    /* renamed from: ZIDL_KI */
    private void m112273x1964d2a6(int i17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f298138b;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("DataReportCgiManagerKE", "onDataReportKVEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("DataReportCgiManagerKE", "onDataReportKVEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.b bVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.b) entry.getValue();
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            bVar.getClass();
        }
    }
}
