package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.FocusMeteringAction */
/* loaded from: classes14.dex */
public final class C0502x5ba1de27 {

    /* renamed from: DEFAULT_AUTOCANCEL_DURATION */
    static final long f957x67c410c = 5000;

    /* renamed from: DEFAULT_METERING_MODE */
    static final int f958x36d178cb = 7;

    /* renamed from: FLAG_AE */
    public static final int f959xfc5a2dd7 = 2;

    /* renamed from: FLAG_AF */
    public static final int f960xfc5a2dd8 = 1;

    /* renamed from: FLAG_AWB */
    public static final int f961x8eeb8f79 = 4;

    /* renamed from: mAutoCancelDurationInMillis */
    private final long f962x4a14caf5;

    /* renamed from: mMeteringPointsAe */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37> f963x549871cd;

    /* renamed from: mMeteringPointsAf */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37> f964x549871ce;

    /* renamed from: mMeteringPointsAwb */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37> f965x3e75ca63;

    /* renamed from: androidx.camera.core.FocusMeteringAction$Builder */
    /* loaded from: classes14.dex */
    public static class Builder {

        /* renamed from: mAutoCancelDurationInMillis */
        long f966x4a14caf5;

        /* renamed from: mMeteringPointsAe */
        final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37> f967x549871cd;

        /* renamed from: mMeteringPointsAf */
        final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37> f968x549871ce;

        /* renamed from: mMeteringPointsAwb */
        final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37> f969x3e75ca63;

        public Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37 c0548xb03aad37) {
            this(c0548xb03aad37, 7);
        }

        /* renamed from: addPoint */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27.Builder m4396xb581296f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37 c0548xb03aad37) {
            return m4397xb581296f(c0548xb03aad37, 7);
        }

        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 m4398x59bc66e() {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27(this);
        }

        /* renamed from: disableAutoCancel */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27.Builder m4399x88c53611() {
            this.f966x4a14caf5 = 0L;
            return this;
        }

        /* renamed from: removePoints */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27.Builder m4400xc7b8ce87(int i17) {
            if ((i17 & 1) != 0) {
                this.f968x549871ce.clear();
            }
            if ((i17 & 2) != 0) {
                this.f967x549871cd.clear();
            }
            if ((i17 & 4) != 0) {
                this.f969x3e75ca63.clear();
            }
            return this;
        }

        /* renamed from: setAutoCancelDuration */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27.Builder m4401xa1b35bf(long j17, java.util.concurrent.TimeUnit timeUnit) {
            m3.h.b(j17 >= 1, "autoCancelDuration must be at least 1");
            this.f966x4a14caf5 = timeUnit.toMillis(j17);
            return this;
        }

        public Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37 c0548xb03aad37, int i17) {
            this.f968x549871ce = new java.util.ArrayList();
            this.f967x549871cd = new java.util.ArrayList();
            this.f969x3e75ca63 = new java.util.ArrayList();
            this.f966x4a14caf5 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27.f957x67c410c;
            m4397xb581296f(c0548xb03aad37, i17);
        }

        /* renamed from: addPoint */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27.Builder m4397xb581296f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37 c0548xb03aad37, int i17) {
            boolean z17 = false;
            m3.h.b(c0548xb03aad37 != null, "Point cannot be null.");
            if (i17 >= 1 && i17 <= 7) {
                z17 = true;
            }
            m3.h.b(z17, "Invalid metering mode " + i17);
            if ((i17 & 1) != 0) {
                this.f968x549871ce.add(c0548xb03aad37);
            }
            if ((i17 & 2) != 0) {
                this.f967x549871cd.add(c0548xb03aad37);
            }
            if ((i17 & 4) != 0) {
                this.f969x3e75ca63.add(c0548xb03aad37);
            }
            return this;
        }

        public Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 c0502x5ba1de27) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f968x549871ce = arrayList;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            this.f967x549871cd = arrayList2;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            this.f969x3e75ca63 = arrayList3;
            this.f966x4a14caf5 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27.f957x67c410c;
            arrayList.addAll(c0502x5ba1de27.m4393xd6590eb7());
            arrayList2.addAll(c0502x5ba1de27.m4392xd6590eb6());
            arrayList3.addAll(c0502x5ba1de27.m4394xf4c8ca9a());
            this.f966x4a14caf5 = c0502x5ba1de27.m4391x7ce9189e();
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.FocusMeteringAction$MeteringMode */
    /* loaded from: classes6.dex */
    public @interface MeteringMode {
    }

    public C0502x5ba1de27(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27.Builder builder) {
        this.f964x549871ce = java.util.Collections.unmodifiableList(builder.f968x549871ce);
        this.f963x549871cd = java.util.Collections.unmodifiableList(builder.f967x549871cd);
        this.f965x3e75ca63 = java.util.Collections.unmodifiableList(builder.f969x3e75ca63);
        this.f962x4a14caf5 = builder.f966x4a14caf5;
    }

    /* renamed from: getAutoCancelDurationInMillis */
    public long m4391x7ce9189e() {
        return this.f962x4a14caf5;
    }

    /* renamed from: getMeteringPointsAe */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37> m4392xd6590eb6() {
        return this.f963x549871cd;
    }

    /* renamed from: getMeteringPointsAf */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37> m4393xd6590eb7() {
        return this.f964x549871ce;
    }

    /* renamed from: getMeteringPointsAwb */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37> m4394xf4c8ca9a() {
        return this.f965x3e75ca63;
    }

    /* renamed from: isAutoCancelEnabled */
    public boolean m4395x59c9ee() {
        return this.f962x4a14caf5 > 0;
    }
}
