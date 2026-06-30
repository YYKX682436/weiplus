package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteDebug */
/* loaded from: classes12.dex */
public final class C26953xd9a91187 {
    private static final java.lang.String TAG = "WCDB.SQLiteDebug";

    /* renamed from: sLastCorruptionException */
    private static final java.lang.ThreadLocal<java.lang.Throwable> f58257xb39bb34b;

    /* renamed from: sLastErrorLine */
    private static volatile int f58258x4eed8a73;

    /* renamed from: sLastIOTraceStats */
    private static volatile java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.IOTraceStats> f58259x9f0a7449;

    /* renamed from: com.tencent.wcdb.database.SQLiteDebug$DbStats */
    /* loaded from: classes12.dex */
    public static class DbStats {

        /* renamed from: cache */
        public java.lang.String f58260x5a0af82;

        /* renamed from: dbName */
        public java.lang.String f58261xb02e8c29;

        /* renamed from: dbSize */
        public long f58262xb030f19f;

        /* renamed from: lookaside */
        public int f58263x437849f9;

        /* renamed from: pageSize */
        public long f58264x3339d730;

        public DbStats(java.lang.String str, long j17, long j18, int i17, int i18, int i19, int i27) {
            this.f58261xb02e8c29 = str;
            this.f58264x3339d730 = j18 / 1024;
            this.f58262xb030f19f = (j17 * j18) / 1024;
            this.f58263x437849f9 = i17;
            this.f58260x5a0af82 = i18 + "/" + i19 + "/" + i27;
        }
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteDebug$IOTraceStats */
    /* loaded from: classes12.dex */
    public static class IOTraceStats {

        /* renamed from: dbName */
        public java.lang.String f58265xb02e8c29;

        /* renamed from: journalMode */
        public java.lang.String f58266xfea0e97a;

        /* renamed from: lastJournalReadOffset */
        public long f58267xd85e406a;

        /* renamed from: lastJournalReadPage */
        public byte[] f58268xf03e4826;

        /* renamed from: lastJournalWriteOffset */
        public long f58269x8563ad1;

        /* renamed from: lastJournalWritePage */
        public byte[] f58270x6efb04d;

        /* renamed from: lastReadOffset */
        public long f58271xe7084cff;

        /* renamed from: lastReadPage */
        public byte[] f58272x65bc75fb;

        /* renamed from: lastWriteOffset */
        public long f58273xceedc0dc;

        /* renamed from: lastWritePage */
        public byte[] f58274x41373d18;

        /* renamed from: pageCount */
        public long f58275x33223fc0;

        /* renamed from: pageSize */
        public long f58276x3339d730;

        /* renamed from: path */
        public java.lang.String f58277x346425;

        /* renamed from: toString */
        public java.lang.String m107756x9616526c() {
            return java.lang.String.format("[%s | %s] pageSize: %d, pageCount: %d, journal: %s, lastRead: %d, lastWrite: %d, lastJournalRead: %d, lastJournalWrite: %d", this.f58265xb02e8c29, this.f58277x346425, java.lang.Long.valueOf(this.f58276x3339d730), java.lang.Long.valueOf(this.f58275x33223fc0), this.f58266xfea0e97a, java.lang.Long.valueOf(this.f58271xe7084cff), java.lang.Long.valueOf(this.f58273xceedc0dc), java.lang.Long.valueOf(this.f58267xd85e406a), java.lang.Long.valueOf(this.f58269x8563ad1));
        }
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteDebug$PagerStats */
    /* loaded from: classes12.dex */
    public static class PagerStats {

        /* renamed from: dbStats */
        public java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.DbStats> f58278x55f1e6c1;

        /* renamed from: largestMemAlloc */
        public int f58279x51fe195c;

        /* renamed from: memoryUsed */
        public int f58280x7652b45e;

        /* renamed from: pageCacheOverflow */
        public int f58281xd1abd355;
    }

    static {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26961x60ffeeef.m107775x141073bf();
        f58257xb39bb34b = new java.lang.ThreadLocal<>();
    }

    private C26953xd9a91187() {
    }

    /* renamed from: collectLastIOTraceStats */
    public static void m107742x264f8700(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a c26942xf59ce42a) {
        try {
            f58258x4eed8a73 = m107750x85b60aa7();
            java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.IOTraceStats> arrayList = new java.util.ArrayList<>();
            long m107494xdc4f8f95 = c26942xf59ce42a.m107494xdc4f8f95(null);
            if (m107494xdc4f8f95 != 0) {
                m107749x1cf2a95f(m107494xdc4f8f95, arrayList);
                c26942xf59ce42a.m107484x3134699a(null);
            }
            f58259x9f0a7449 = arrayList;
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Cannot collect I/O trace statistics: " + e17.getMessage());
        }
    }

    /* renamed from: dump */
    public static void m107744x2f39f4(android.util.Printer printer, java.lang.String[] strArr) {
        boolean z17 = false;
        for (java.lang.String str : strArr) {
            if (str.equals("-v")) {
                z17 = true;
            }
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.m107621x77ca130d(printer, z17);
    }

    /* renamed from: getDatabaseInfo */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.PagerStats m107745x4593473f() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.PagerStats pagerStats = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.PagerStats();
        m107751x119afbbb(pagerStats);
        pagerStats.f58278x55f1e6c1 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.m107626x93bf228b();
        return pagerStats;
    }

    /* renamed from: getLastCorruptionException */
    public static java.lang.Throwable m107746x951c1508() {
        return f58257xb39bb34b.get();
    }

    /* renamed from: getLastErrorLine */
    public static int m107747x660c8470() {
        return f58258x4eed8a73;
    }

    /* renamed from: getLastIOTraceStats */
    public static java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.IOTraceStats> m107748x3ccfdd2c() {
        return f58259x9f0a7449;
    }

    /* renamed from: nativeGetIOTraceStats */
    private static native void m107749x1cf2a95f(long j17, java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.IOTraceStats> arrayList);

    /* renamed from: nativeGetLastErrorLine */
    private static native int m107750x85b60aa7();

    /* renamed from: nativeGetPagerStats */
    private static native void m107751x119afbbb(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.PagerStats pagerStats);

    /* renamed from: nativeSetIOTraceFlags */
    private static native void m107752x5280ce53(int i17);

    /* renamed from: setIOTraceFlags */
    public static void m107753x61ff776a(int i17) {
        m107752x5280ce53(i17);
    }

    /* renamed from: setLastCorruptionException */
    public static void m107754xab4bfa7c(java.lang.Throwable th6) {
        f58257xb39bb34b.set(th6);
    }

    /* renamed from: shouldLogSlowQuery */
    public static final boolean m107755x2d03b5b6(long j17) {
        return j17 > 300;
    }

    /* renamed from: collectLastIOTraceStats */
    public static void m107743x264f8700(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7) {
        try {
            f58258x4eed8a73 = m107750x85b60aa7();
            java.util.ArrayList<com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.IOTraceStats> arrayList = new java.util.ArrayList<>();
            long m107657x12386953 = c26948xabb259c7.m107657x12386953("collectIoStat", false, false);
            if (m107657x12386953 != 0) {
                m107749x1cf2a95f(m107657x12386953, arrayList);
            }
            c26948xabb259c7.m107714x63db387c(m107657x12386953, null);
            f58259x9f0a7449 = arrayList;
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Cannot collect I/O trace statistics: " + e17.getMessage());
        }
    }
}
