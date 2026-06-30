package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.ImageCaptureLatencyEstimate */
/* loaded from: classes4.dex */
public class C0530x9aaaab3b {

    /* renamed from: UNDEFINED_CAPTURE_LATENCY */
    public static final long f1105x31a5b3b6 = -1;

    /* renamed from: UNDEFINED_IMAGE_CAPTURE_LATENCY */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0530x9aaaab3b f1106xc8ed2bf2 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0530x9aaaab3b(-1, -1);

    /* renamed from: UNDEFINED_PROCESSING_LATENCY */
    public static final long f1107xa60d3f21 = -1;

    /* renamed from: mCaptureLatencyMillis */
    private final long f1108xac34434b;

    /* renamed from: mProcessingLatencyMillis */
    private final long f1109x1a84a164;

    /* renamed from: mTotalCaptureLatencyMillis */
    private final long f1110xa4cf10b5;

    public C0530x9aaaab3b(long j17, long j18) {
        this.f1108xac34434b = j17;
        this.f1109x1a84a164 = j18;
        this.f1110xa4cf10b5 = m4605xb659002b(j17, j18);
    }

    /* renamed from: computeTotalCaptureLatencyMillis */
    private long m4605xb659002b(long j17, long j18) {
        if (j17 == -1 || j18 == -1) {
            return -1L;
        }
        return j17 + j18;
    }

    /* renamed from: equals */
    public boolean m4606xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0530x9aaaab3b)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0530x9aaaab3b c0530x9aaaab3b = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0530x9aaaab3b) obj;
        return this.f1108xac34434b == c0530x9aaaab3b.m4607xf11a43b4() && this.f1109x1a84a164 == c0530x9aaaab3b.m4608xe40e5c5b() && this.f1110xa4cf10b5 == c0530x9aaaab3b.m4609x32d5e9ec();
    }

    /* renamed from: getCaptureLatencyMillis */
    public long m4607xf11a43b4() {
        return this.f1108xac34434b;
    }

    /* renamed from: getProcessingLatencyMillis */
    public long m4608xe40e5c5b() {
        return this.f1109x1a84a164;
    }

    /* renamed from: getTotalCaptureLatencyMillis */
    public long m4609x32d5e9ec() {
        return this.f1110xa4cf10b5;
    }

    /* renamed from: hashCode */
    public int m4610x8cdac1b() {
        return java.util.Objects.hash(java.lang.Long.valueOf(this.f1108xac34434b), java.lang.Long.valueOf(this.f1109x1a84a164), java.lang.Long.valueOf(this.f1110xa4cf10b5));
    }

    /* renamed from: toString */
    public java.lang.String m4611x9616526c() {
        return "captureLatencyMillis=" + this.f1108xac34434b + ", processingLatencyMillis=" + this.f1109x1a84a164 + ", totalCaptureLatencyMillis=" + this.f1110xa4cf10b5;
    }
}
