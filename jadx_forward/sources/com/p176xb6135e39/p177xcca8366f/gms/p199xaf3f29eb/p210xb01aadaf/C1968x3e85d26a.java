package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf;

/* renamed from: com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate */
/* loaded from: classes13.dex */
public class C1968x3e85d26a extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1968x3e85d26a> f5974x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.zae();
    private final int zaa;
    private final int zab;
    private final java.lang.Long zac;
    private final java.lang.Long zad;
    private final int zae;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1968x3e85d26a.ProgressInfo zaf;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* renamed from: com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate$InstallState */
    /* loaded from: classes6.dex */
    public @interface InstallState {

        /* renamed from: STATE_CANCELED */
        public static final int f5975x518b48a7 = 3;

        /* renamed from: STATE_COMPLETED */
        public static final int f5976x6fd6b3dd = 4;

        /* renamed from: STATE_DOWNLOADING */
        public static final int f5977x74cc3f6c = 2;

        /* renamed from: STATE_DOWNLOAD_PAUSED */
        public static final int f5978x3b8cc8f7 = 7;

        /* renamed from: STATE_FAILED */
        public static final int f5979x230807cb = 5;

        /* renamed from: STATE_INSTALLING */
        public static final int f5980xe0edbcf5 = 6;

        /* renamed from: STATE_PENDING */
        public static final int f5981x560d87a9 = 1;

        /* renamed from: STATE_UNKNOWN */
        public static final int f5982x6dc2aa5c = 0;
    }

    /* renamed from: com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate$ProgressInfo */
    /* loaded from: classes13.dex */
    public static class ProgressInfo {
        private final long zaa;
        private final long zab;

        public ProgressInfo(long j17, long j18) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18218x7b46f5f3(j18);
            this.zaa = j17;
            this.zab = j18;
        }

        /* renamed from: getBytesDownloaded */
        public long m18443xfbc2f7bc() {
            return this.zaa;
        }

        /* renamed from: getTotalBytesToDownload */
        public long m18444x52540b80() {
            return this.zab;
        }
    }

    public C1968x3e85d26a(int i17, int i18, java.lang.Long l17, java.lang.Long l18, int i19) {
        this.zaa = i17;
        this.zab = i18;
        this.zac = l17;
        this.zad = l18;
        this.zae = i19;
        this.zaf = (l17 == null || l18 == null || l18.longValue() == 0) ? null : new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1968x3e85d26a.ProgressInfo(l17.longValue(), l18.longValue());
    }

    /* renamed from: getErrorCode */
    public int m18439x130a215f() {
        return this.zae;
    }

    /* renamed from: getInstallState */
    public int m18440xd99a8a2c() {
        return this.zab;
    }

    /* renamed from: getProgressInfo */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1968x3e85d26a.ProgressInfo m18441x8bb34ef1() {
        return this.zaf;
    }

    /* renamed from: getSessionId */
    public int m18442x23a7af9b() {
        return this.zaa;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, m18442x23a7af9b());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 2, m18440xd99a8a2c());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18344xaf7bb21a(parcel, 3, this.zac, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18344xaf7bb21a(parcel, 4, this.zad, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 5, m18439x130a215f());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}
