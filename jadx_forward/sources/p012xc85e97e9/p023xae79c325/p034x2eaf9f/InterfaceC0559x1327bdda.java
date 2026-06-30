package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.RetryPolicy */
/* loaded from: classes14.dex */
public interface InterfaceC0559x1327bdda {

    /* renamed from: DEFAULT_RETRY_TIMEOUT_IN_MILLIS */
    public static final long f1183xe66aab0d = 6000;

    /* renamed from: NEVER */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda f1184x46bd26c = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0560x1dc6c7c7();

    /* renamed from: DEFAULT */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda f1182x86df6221 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0680x578a4b94.Legacy(m4740x1b0ce72f());

    /* renamed from: RETRY_UNAVAILABLE_CAMERA */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda f1185x9615f12b = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0680x578a4b94(m4740x1b0ce72f());

    /* renamed from: androidx.camera.core.RetryPolicy$Builder */
    /* loaded from: classes14.dex */
    public static final class Builder {

        /* renamed from: mBasePolicy */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda f1186xa60c6fb0;

        /* renamed from: mTimeoutInMillis */
        private long f1187x931541f;

        public Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda interfaceC0559x1327bdda) {
            this.f1186xa60c6fb0 = interfaceC0559x1327bdda;
            this.f1187x931541f = interfaceC0559x1327bdda.mo4742x1de4f616();
        }

        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda m4744x59bc66e() {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda interfaceC0559x1327bdda = this.f1186xa60c6fb0;
            return interfaceC0559x1327bdda instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0749xea3b6eb7 ? ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0749xea3b6eb7) interfaceC0559x1327bdda).mo5297x2eaf75(this.f1187x931541f) : new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0762x94e9b5f9(this.f1187x931541f, this.f1186xa60c6fb0);
        }

        /* renamed from: setTimeoutInMillis */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.Builder m4745x54bb8f8a(long j17) {
            this.f1187x931541f = j17;
            return this;
        }
    }

    /* renamed from: androidx.camera.core.RetryPolicy$ExecutionState */
    /* loaded from: classes14.dex */
    public interface ExecutionState {

        /* renamed from: STATUS_CAMERA_UNAVAILABLE */
        public static final int f1188x3b593b83 = 2;

        /* renamed from: STATUS_CONFIGURATION_FAIL */
        public static final int f1189xbbcfda54 = 1;

        /* renamed from: STATUS_UNKNOWN_ERROR */
        public static final int f1190x38e3f406 = 0;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* renamed from: androidx.camera.core.RetryPolicy$ExecutionState$Status */
        /* loaded from: classes6.dex */
        public @interface Status {
        }

        /* renamed from: getCause */
        java.lang.Throwable mo4746x743e9ab3();

        /* renamed from: getExecutedTimeInMillis */
        long mo4747x4c67275d();

        /* renamed from: getNumOfAttempts */
        int mo4748xbd5f46ad();

        /* renamed from: getStatus */
        int mo4749x2fe4f2e8();
    }

    /* renamed from: androidx.camera.core.RetryPolicy$RetryConfig */
    /* loaded from: classes14.dex */
    public static final class RetryConfig {

        /* renamed from: DEFAULT_DELAY_MILLIS */
        private static final long f1192x12e4a00 = 500;

        /* renamed from: MINI_DELAY_MILLIS */
        private static final long f1194x7fb0578a = 100;

        /* renamed from: mCompleteWithoutFailure */
        private final boolean f1197xba3daa08;

        /* renamed from: mDelayInMillis */
        private final long f1198xe77d5701;

        /* renamed from: mShouldRetry */
        private final boolean f1199x8eadc608;

        /* renamed from: NOT_RETRY */
        public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig f1196x3da2a9fc = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig(false, 0);

        /* renamed from: DEFAULT_DELAY_RETRY */
        public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig f1193xc6800f8e = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig(true);

        /* renamed from: MINI_DELAY_RETRY */
        public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig f1195xfc2128c4 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig(true, 100);

        /* renamed from: COMPLETE_WITHOUT_FAILURE */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig f1191xf042adcd = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig(false, 0L, true);

        /* renamed from: androidx.camera.core.RetryPolicy$RetryConfig$Builder */
        /* loaded from: classes14.dex */
        public static final class Builder {

            /* renamed from: mShouldRetry */
            private boolean f1200x8eadc608 = true;

            /* renamed from: mTimeoutInMillis */
            private long f1201x931541f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig.m4751x96426e11();

            /* renamed from: build */
            public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig m4755x59bc66e() {
                return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig(this.f1200x8eadc608, this.f1201x931541f);
            }

            /* renamed from: setRetryDelayInMillis */
            public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig.Builder m4756xbe33d0a8(long j17) {
                this.f1201x931541f = j17;
                return this;
            }

            /* renamed from: setShouldRetry */
            public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig.Builder m4757x54dc6ef3(boolean z17) {
                this.f1200x8eadc608 = z17;
                return this;
            }
        }

        /* renamed from: getDefaultRetryDelayInMillis */
        public static long m4751x96426e11() {
            return 500L;
        }

        /* renamed from: getRetryDelayInMillis */
        public long m4752x27084e9c() {
            return this.f1198xe77d5701;
        }

        /* renamed from: shouldCompleteWithoutFailure */
        public boolean m4753x1d4ae6ce() {
            return this.f1197xba3daa08;
        }

        /* renamed from: shouldRetry */
        public boolean m4754xe4a0b4b5() {
            return this.f1199x8eadc608;
        }

        private RetryConfig(boolean z17) {
            this(z17, m4751x96426e11());
        }

        private RetryConfig(boolean z17, long j17) {
            this(z17, j17, false);
        }

        private RetryConfig(boolean z17, long j17, boolean z18) {
            this.f1199x8eadc608 = z17;
            this.f1198xe77d5701 = j17;
            if (z18) {
                m3.h.b(!z17, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.f1197xba3daa08 = z18;
        }
    }

    /* renamed from: getDefaultRetryTimeoutInMillis */
    static long m4740x1b0ce72f() {
        return f1183xe66aab0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$static$0 */
    static /* synthetic */ p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig m4741xdec287b7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.ExecutionState executionState) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig.f1196x3da2a9fc;
    }

    /* renamed from: getTimeoutInMillis */
    default long mo4742x1de4f616() {
        return 0L;
    }

    /* renamed from: onRetryDecisionRequested */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig mo4743xed10d9e9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.ExecutionState executionState);
}
