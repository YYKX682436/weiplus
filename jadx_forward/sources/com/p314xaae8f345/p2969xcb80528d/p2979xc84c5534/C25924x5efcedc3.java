package com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534;

/* renamed from: com.tencent.tavkit.report.MemoryReportHelper */
/* loaded from: classes15.dex */
public class C25924x5efcedc3 {

    /* renamed from: MIN_TICK_INTERVAL_MS */
    public static final int f49082xb27d6e2b = 1000;
    private static final java.lang.String TAG = "MemoryReportHelper";

    /* renamed from: lastTickTime */
    private static long f49083xce602c0;

    /* renamed from: consumerHashMap */
    private java.util.Map<java.lang.String, com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25924x5efcedc3.Consumer> f49084xfdfafc98;

    /* renamed from: context */
    private android.content.Context f49085x38b735af;

    /* renamed from: com.tencent.tavkit.report.MemoryReportHelper$Consumer */
    /* loaded from: classes15.dex */
    public static class Consumer {
        private final java.lang.String key;

        /* renamed from: totalM */
        private long f49088xcc448d89 = 0;

        /* renamed from: count */
        private long f49086x5a7510f = 0;

        /* renamed from: maxM */
        private long f49087x330769 = 0;

        public Consumer(java.lang.String str) {
            this.key = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getAvgMB */
        public long m98828x742bbe31() {
            long j17 = this.f49086x5a7510f;
            if (j17 == 0) {
                return 0L;
            }
            return this.f49088xcc448d89 / j17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: tick */
        public void m98829x36519d(long j17) {
            this.f49088xcc448d89 += j17;
            this.f49086x5a7510f++;
            if (j17 > this.f49087x330769) {
                this.f49087x330769 = j17;
            }
        }

        /* renamed from: getMaxM */
        public long m98830xfb826fdf() {
            return this.f49087x330769;
        }
    }

    /* renamed from: com.tencent.tavkit.report.MemoryReportHelper$Instance */
    /* loaded from: classes15.dex */
    public static class Instance {

        /* renamed from: INSTANCE */
        private static final com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25924x5efcedc3 f49089x4fbc8495 = new com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25924x5efcedc3();

        private Instance() {
        }
    }

    /* renamed from: appendKeys */
    public static java.lang.String m98814x8077542e(java.util.Collection<java.lang.String> collection) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str : collection) {
            if (sb6.length() > 0) {
                sb6.append(",");
            }
            sb6.append(str);
        }
        return sb6.toString();
    }

    /* renamed from: appendReportKey */
    public static java.lang.String m98815x8ec0291(java.util.Collection<?> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.InterfaceC25923x5f2d05b7) {
                arrayList.add(((com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.InterfaceC25923x5f2d05b7) obj).mo98523xea5dc5d5());
            }
        }
        return m98814x8077542e(arrayList);
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25924x5efcedc3 m98816x9cf0d20b() {
        return com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25924x5efcedc3.Instance.f49089x4fbc8495;
    }

    /* renamed from: isInIntervalTime */
    public static boolean m98817x73291ac1() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f49083xce602c0 < 1000) {
            return true;
        }
        f49083xce602c0 = currentTimeMillis;
        return false;
    }

    /* renamed from: clear */
    public void m98818x5a5b64d() {
        this.f49084xfdfafc98.clear();
    }

    /* renamed from: getAvgMBValues */
    public java.util.Map<java.lang.String, java.lang.Long> m98819x411eb3() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25924x5efcedc3.Consumer consumer : this.f49084xfdfafc98.values()) {
            if (consumer != null) {
                hashMap.put(consumer.key, java.lang.Long.valueOf(consumer.m98828x742bbe31()));
            }
        }
        return hashMap;
    }

    /* renamed from: getMaxMBValues */
    public java.util.Map<java.lang.String, java.lang.Long> m98820xc97e9745() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25924x5efcedc3.Consumer consumer : this.f49084xfdfafc98.values()) {
            if (consumer != null) {
                hashMap.put(consumer.key, java.lang.Long.valueOf(consumer.m98830xfb826fdf()));
            }
        }
        return hashMap;
    }

    /* renamed from: getPidMemorySize */
    public int m98821x5508c0d7(int i17, android.content.Context context) {
        android.os.Debug.MemoryInfo[] processMemoryInfo = ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getProcessMemoryInfo(new int[]{i17});
        processMemoryInfo[0].getTotalSharedDirty();
        return processMemoryInfo[0].getTotalPss();
    }

    /* renamed from: init */
    public void m98822x316510(android.content.Context context) {
        this.f49085x38b735af = context;
    }

    /* renamed from: tick */
    public void m98823x36519d(java.lang.String str) {
        if (this.f49085x38b735af == null) {
            return;
        }
        m98824x36519d(str, m98821x5508c0d7(android.os.Process.myPid(), this.f49085x38b735af) / 1024);
    }

    private C25924x5efcedc3() {
        this.f49084xfdfafc98 = new java.util.HashMap();
    }

    /* renamed from: tick */
    public void m98824x36519d(java.lang.String str, long j17) {
        com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25924x5efcedc3.Consumer consumer = this.f49084xfdfafc98.get(str);
        if (consumer == null) {
            consumer = new com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25924x5efcedc3.Consumer(str);
            this.f49084xfdfafc98.put(consumer.key, consumer);
        }
        consumer.m98829x36519d(j17);
    }
}
