package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p059xe2513c1e;

/* renamed from: androidx.camera.extensions.internal.compat.workaround.OnEnableDisableSessionDurationCheck */
/* loaded from: classes14.dex */
public class C1013x8ed74224 {

    /* renamed from: MIN_DURATION_FOR_ENABLE_DISABLE_SESSION */
    static final long f2458x2f14c797 = 100;
    private static final java.lang.String TAG = "OnEnableDisableSessionDurationCheck";

    /* renamed from: mEnabledMinimumDuration */
    private final boolean f2459xa84c630e;

    /* renamed from: mOnEnableSessionTimeStamp */
    private long f2460x3322c8ef;

    public C1013x8ed74224() {
        this(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p058x66f27be.C1004xcf1a968b.get(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p057xaf3f3382.p058x66f27be.C1003xc8dc1e7.class) != null);
    }

    /* renamed from: ensureMinDurationAfterOnEnableSession */
    private void m6750x27ac1d80() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = this.f2460x3322c8ef;
        while (true) {
            long j18 = elapsedRealtime - j17;
            if (j18 >= 100) {
                return;
            }
            long j19 = 100 - j18;
            try {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "onDisableSession too soon, wait " + j19 + " ms");
                java.lang.Thread.sleep(j19);
                elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                j17 = this.f2460x3322c8ef;
            } catch (java.lang.InterruptedException unused) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "sleep interrupted");
                return;
            }
        }
    }

    /* renamed from: onDisableSessionInvoked */
    public void m6751x52ab17df() {
        if (this.f2459xa84c630e) {
            m6750x27ac1d80();
        }
    }

    /* renamed from: onEnableSessionInvoked */
    public void m6752x27b19858() {
        if (this.f2459xa84c630e) {
            this.f2460x3322c8ef = android.os.SystemClock.elapsedRealtime();
        }
    }

    public C1013x8ed74224(boolean z17) {
        this.f2460x3322c8ef = 0L;
        this.f2459xa84c630e = z17;
    }
}
