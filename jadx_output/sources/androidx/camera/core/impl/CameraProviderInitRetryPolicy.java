package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class CameraProviderInitRetryPolicy implements androidx.camera.core.impl.RetryPolicyInternal {
    private final androidx.camera.core.RetryPolicy mDelegatePolicy;

    /* loaded from: classes14.dex */
    public static final class Legacy implements androidx.camera.core.impl.RetryPolicyInternal {
        private final androidx.camera.core.RetryPolicy mBasePolicy;

        public Legacy(long j17) {
            this.mBasePolicy = new androidx.camera.core.impl.CameraProviderInitRetryPolicy(j17);
        }

        @Override // androidx.camera.core.impl.RetryPolicyInternal
        public androidx.camera.core.RetryPolicy copy(long j17) {
            return new androidx.camera.core.impl.CameraProviderInitRetryPolicy.Legacy(j17);
        }

        @Override // androidx.camera.core.RetryPolicy
        public long getTimeoutInMillis() {
            return this.mBasePolicy.getTimeoutInMillis();
        }

        @Override // androidx.camera.core.RetryPolicy
        public androidx.camera.core.RetryPolicy.RetryConfig onRetryDecisionRequested(androidx.camera.core.RetryPolicy.ExecutionState executionState) {
            if (this.mBasePolicy.onRetryDecisionRequested(executionState).shouldRetry()) {
                return androidx.camera.core.RetryPolicy.RetryConfig.DEFAULT_DELAY_RETRY;
            }
            java.lang.Throwable cause = executionState.getCause();
            if (cause instanceof androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException) {
                androidx.camera.core.Logger.e("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException) cause).getAvailableCameraCount() > 0) {
                    return androidx.camera.core.RetryPolicy.RetryConfig.COMPLETE_WITHOUT_FAILURE;
                }
            }
            return androidx.camera.core.RetryPolicy.RetryConfig.NOT_RETRY;
        }
    }

    public CameraProviderInitRetryPolicy(final long j17) {
        this.mDelegatePolicy = new androidx.camera.core.impl.TimeoutRetryPolicy(j17, new androidx.camera.core.RetryPolicy() { // from class: androidx.camera.core.impl.CameraProviderInitRetryPolicy.1
            @Override // androidx.camera.core.RetryPolicy
            public long getTimeoutInMillis() {
                return j17;
            }

            @Override // androidx.camera.core.RetryPolicy
            public androidx.camera.core.RetryPolicy.RetryConfig onRetryDecisionRequested(androidx.camera.core.RetryPolicy.ExecutionState executionState) {
                return executionState.getStatus() == 1 ? androidx.camera.core.RetryPolicy.RetryConfig.NOT_RETRY : androidx.camera.core.RetryPolicy.RetryConfig.DEFAULT_DELAY_RETRY;
            }
        });
    }

    @Override // androidx.camera.core.impl.RetryPolicyInternal
    public androidx.camera.core.RetryPolicy copy(long j17) {
        return new androidx.camera.core.impl.CameraProviderInitRetryPolicy(j17);
    }

    @Override // androidx.camera.core.RetryPolicy
    public long getTimeoutInMillis() {
        return this.mDelegatePolicy.getTimeoutInMillis();
    }

    @Override // androidx.camera.core.RetryPolicy
    public androidx.camera.core.RetryPolicy.RetryConfig onRetryDecisionRequested(androidx.camera.core.RetryPolicy.ExecutionState executionState) {
        return this.mDelegatePolicy.onRetryDecisionRequested(executionState);
    }
}
