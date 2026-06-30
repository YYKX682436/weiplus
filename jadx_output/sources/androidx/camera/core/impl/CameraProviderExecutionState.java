package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class CameraProviderExecutionState implements androidx.camera.core.RetryPolicy.ExecutionState {
    private final int mAttemptCount;
    private final java.lang.Throwable mCause;
    private final int mStatus;
    private final long mTaskExecutedTimeInMillis;

    public CameraProviderExecutionState(long j17, int i17, java.lang.Throwable th6) {
        this.mTaskExecutedTimeInMillis = android.os.SystemClock.elapsedRealtime() - j17;
        this.mAttemptCount = i17;
        if (th6 instanceof androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException) {
            this.mStatus = 2;
            this.mCause = th6;
            return;
        }
        if (!(th6 instanceof androidx.camera.core.InitializationException)) {
            this.mStatus = 0;
            this.mCause = th6;
            return;
        }
        java.lang.Throwable cause = th6.getCause();
        th6 = cause != null ? cause : th6;
        this.mCause = th6;
        if (th6 instanceof androidx.camera.core.CameraUnavailableException) {
            this.mStatus = 2;
        } else if (th6 instanceof java.lang.IllegalArgumentException) {
            this.mStatus = 1;
        } else {
            this.mStatus = 0;
        }
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public java.lang.Throwable getCause() {
        return this.mCause;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public long getExecutedTimeInMillis() {
        return this.mTaskExecutedTimeInMillis;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public int getNumOfAttempts() {
        return this.mAttemptCount;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public int getStatus() {
        return this.mStatus;
    }
}
