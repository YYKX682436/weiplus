package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.CameraProviderExecutionState */
/* loaded from: classes14.dex */
public final class C0679x76877a4f implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.ExecutionState {

    /* renamed from: mAttemptCount */
    private final int f1573x533d5f4f;

    /* renamed from: mCause */
    private final java.lang.Throwable f1574xbdde3ffc;

    /* renamed from: mStatus */
    private final int f1575x1a39f6bf;

    /* renamed from: mTaskExecutedTimeInMillis */
    private final long f1576x7240cd99;

    public C0679x76877a4f(long j17, int i17, java.lang.Throwable th6) {
        this.f1576x7240cd99 = android.os.SystemClock.elapsedRealtime() - j17;
        this.f1573x533d5f4f = i17;
        if (th6 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0688xc34dd98d.CameraIdListIncorrectException) {
            this.f1575x1a39f6bf = 2;
            this.f1574xbdde3ffc = th6;
            return;
        }
        if (!(th6 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0542x71a3036f)) {
            this.f1575x1a39f6bf = 0;
            this.f1574xbdde3ffc = th6;
            return;
        }
        java.lang.Throwable cause = th6.getCause();
        th6 = cause != null ? cause : th6;
        this.f1574xbdde3ffc = th6;
        if (th6 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0477xb32300c4) {
            this.f1575x1a39f6bf = 2;
        } else if (th6 instanceof java.lang.IllegalArgumentException) {
            this.f1575x1a39f6bf = 1;
        } else {
            this.f1575x1a39f6bf = 0;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.ExecutionState
    /* renamed from: getCause */
    public java.lang.Throwable mo4746x743e9ab3() {
        return this.f1574xbdde3ffc;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.ExecutionState
    /* renamed from: getExecutedTimeInMillis */
    public long mo4747x4c67275d() {
        return this.f1576x7240cd99;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.ExecutionState
    /* renamed from: getNumOfAttempts */
    public int mo4748xbd5f46ad() {
        return this.f1573x533d5f4f;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.ExecutionState
    /* renamed from: getStatus */
    public int mo4749x2fe4f2e8() {
        return this.f1575x1a39f6bf;
    }
}
