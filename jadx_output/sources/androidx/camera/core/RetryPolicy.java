package androidx.camera.core;

/* loaded from: classes14.dex */
public interface RetryPolicy {
    public static final long DEFAULT_RETRY_TIMEOUT_IN_MILLIS = 6000;
    public static final androidx.camera.core.RetryPolicy NEVER = new androidx.camera.core.RetryPolicy$$a();
    public static final androidx.camera.core.RetryPolicy DEFAULT = new androidx.camera.core.impl.CameraProviderInitRetryPolicy.Legacy(getDefaultRetryTimeoutInMillis());
    public static final androidx.camera.core.RetryPolicy RETRY_UNAVAILABLE_CAMERA = new androidx.camera.core.impl.CameraProviderInitRetryPolicy(getDefaultRetryTimeoutInMillis());

    /* loaded from: classes14.dex */
    public static final class Builder {
        private final androidx.camera.core.RetryPolicy mBasePolicy;
        private long mTimeoutInMillis;

        public Builder(androidx.camera.core.RetryPolicy retryPolicy) {
            this.mBasePolicy = retryPolicy;
            this.mTimeoutInMillis = retryPolicy.getTimeoutInMillis();
        }

        public androidx.camera.core.RetryPolicy build() {
            androidx.camera.core.RetryPolicy retryPolicy = this.mBasePolicy;
            return retryPolicy instanceof androidx.camera.core.impl.RetryPolicyInternal ? ((androidx.camera.core.impl.RetryPolicyInternal) retryPolicy).copy(this.mTimeoutInMillis) : new androidx.camera.core.impl.TimeoutRetryPolicy(this.mTimeoutInMillis, this.mBasePolicy);
        }

        public androidx.camera.core.RetryPolicy.Builder setTimeoutInMillis(long j17) {
            this.mTimeoutInMillis = j17;
            return this;
        }
    }

    /* loaded from: classes14.dex */
    public interface ExecutionState {
        public static final int STATUS_CAMERA_UNAVAILABLE = 2;
        public static final int STATUS_CONFIGURATION_FAIL = 1;
        public static final int STATUS_UNKNOWN_ERROR = 0;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes6.dex */
        public @interface Status {
        }

        java.lang.Throwable getCause();

        long getExecutedTimeInMillis();

        int getNumOfAttempts();

        int getStatus();
    }

    /* loaded from: classes14.dex */
    public static final class RetryConfig {
        private static final long DEFAULT_DELAY_MILLIS = 500;
        private static final long MINI_DELAY_MILLIS = 100;
        private final boolean mCompleteWithoutFailure;
        private final long mDelayInMillis;
        private final boolean mShouldRetry;
        public static final androidx.camera.core.RetryPolicy.RetryConfig NOT_RETRY = new androidx.camera.core.RetryPolicy.RetryConfig(false, 0);
        public static final androidx.camera.core.RetryPolicy.RetryConfig DEFAULT_DELAY_RETRY = new androidx.camera.core.RetryPolicy.RetryConfig(true);
        public static final androidx.camera.core.RetryPolicy.RetryConfig MINI_DELAY_RETRY = new androidx.camera.core.RetryPolicy.RetryConfig(true, 100);
        public static androidx.camera.core.RetryPolicy.RetryConfig COMPLETE_WITHOUT_FAILURE = new androidx.camera.core.RetryPolicy.RetryConfig(false, 0L, true);

        /* loaded from: classes14.dex */
        public static final class Builder {
            private boolean mShouldRetry = true;
            private long mTimeoutInMillis = androidx.camera.core.RetryPolicy.RetryConfig.getDefaultRetryDelayInMillis();

            public androidx.camera.core.RetryPolicy.RetryConfig build() {
                return new androidx.camera.core.RetryPolicy.RetryConfig(this.mShouldRetry, this.mTimeoutInMillis);
            }

            public androidx.camera.core.RetryPolicy.RetryConfig.Builder setRetryDelayInMillis(long j17) {
                this.mTimeoutInMillis = j17;
                return this;
            }

            public androidx.camera.core.RetryPolicy.RetryConfig.Builder setShouldRetry(boolean z17) {
                this.mShouldRetry = z17;
                return this;
            }
        }

        public static long getDefaultRetryDelayInMillis() {
            return 500L;
        }

        public long getRetryDelayInMillis() {
            return this.mDelayInMillis;
        }

        public boolean shouldCompleteWithoutFailure() {
            return this.mCompleteWithoutFailure;
        }

        public boolean shouldRetry() {
            return this.mShouldRetry;
        }

        private RetryConfig(boolean z17) {
            this(z17, getDefaultRetryDelayInMillis());
        }

        private RetryConfig(boolean z17, long j17) {
            this(z17, j17, false);
        }

        private RetryConfig(boolean z17, long j17, boolean z18) {
            this.mShouldRetry = z17;
            this.mDelayInMillis = j17;
            if (z18) {
                m3.h.b(!z17, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.mCompleteWithoutFailure = z18;
        }
    }

    static long getDefaultRetryTimeoutInMillis() {
        return DEFAULT_RETRY_TIMEOUT_IN_MILLIS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ androidx.camera.core.RetryPolicy.RetryConfig lambda$static$0(androidx.camera.core.RetryPolicy.ExecutionState executionState) {
        return androidx.camera.core.RetryPolicy.RetryConfig.NOT_RETRY;
    }

    default long getTimeoutInMillis() {
        return 0L;
    }

    androidx.camera.core.RetryPolicy.RetryConfig onRetryDecisionRequested(androidx.camera.core.RetryPolicy.ExecutionState executionState);
}
