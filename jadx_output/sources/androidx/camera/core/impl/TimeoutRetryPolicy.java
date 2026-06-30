package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class TimeoutRetryPolicy implements androidx.camera.core.RetryPolicy {
    private final androidx.camera.core.RetryPolicy mDelegatePolicy;
    private final long mTimeoutInMillis;

    public TimeoutRetryPolicy(long j17, androidx.camera.core.RetryPolicy retryPolicy) {
        m3.h.b(j17 >= 0, "Timeout must be non-negative.");
        this.mTimeoutInMillis = j17;
        this.mDelegatePolicy = retryPolicy;
    }

    @Override // androidx.camera.core.RetryPolicy
    public long getTimeoutInMillis() {
        return this.mTimeoutInMillis;
    }

    @Override // androidx.camera.core.RetryPolicy
    public androidx.camera.core.RetryPolicy.RetryConfig onRetryDecisionRequested(androidx.camera.core.RetryPolicy.ExecutionState executionState) {
        androidx.camera.core.RetryPolicy.RetryConfig onRetryDecisionRequested = this.mDelegatePolicy.onRetryDecisionRequested(executionState);
        return (getTimeoutInMillis() <= 0 || executionState.getExecutedTimeInMillis() < getTimeoutInMillis() - onRetryDecisionRequested.getRetryDelayInMillis()) ? onRetryDecisionRequested : androidx.camera.core.RetryPolicy.RetryConfig.NOT_RETRY;
    }
}
