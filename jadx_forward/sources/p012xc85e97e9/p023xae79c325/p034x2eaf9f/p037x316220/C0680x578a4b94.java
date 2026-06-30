package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.CameraProviderInitRetryPolicy */
/* loaded from: classes14.dex */
public final class C0680x578a4b94 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0749xea3b6eb7 {

    /* renamed from: mDelegatePolicy */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda f1577x4f5e80e4;

    /* renamed from: androidx.camera.core.impl.CameraProviderInitRetryPolicy$Legacy */
    /* loaded from: classes14.dex */
    public static final class Legacy implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0749xea3b6eb7 {

        /* renamed from: mBasePolicy */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda f1580xa60c6fb0;

        public Legacy(long j17) {
            this.f1580xa60c6fb0 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0680x578a4b94(j17);
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0749xea3b6eb7
        /* renamed from: copy */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda mo5297x2eaf75(long j17) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0680x578a4b94.Legacy(j17);
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda
        /* renamed from: getTimeoutInMillis */
        public long mo4742x1de4f616() {
            return this.f1580xa60c6fb0.mo4742x1de4f616();
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda
        /* renamed from: onRetryDecisionRequested */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig mo4743xed10d9e9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.ExecutionState executionState) {
            if (this.f1580xa60c6fb0.mo4743xed10d9e9(executionState).m4754xe4a0b4b5()) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig.f1193xc6800f8e;
            }
            java.lang.Throwable mo4746x743e9ab3 = executionState.mo4746x743e9ab3();
            if (mo4746x743e9ab3 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0688xc34dd98d.CameraIdListIncorrectException) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0688xc34dd98d.CameraIdListIncorrectException) mo4746x743e9ab3).m5325x1243ed7() > 0) {
                    return p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig.f1191xf042adcd;
                }
            }
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig.f1196x3da2a9fc;
        }
    }

    public C0680x578a4b94(final long j17) {
        this.f1577x4f5e80e4 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0762x94e9b5f9(j17, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda() { // from class: androidx.camera.core.impl.CameraProviderInitRetryPolicy.1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda
            /* renamed from: getTimeoutInMillis */
            public long mo4742x1de4f616() {
                return j17;
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda
            /* renamed from: onRetryDecisionRequested */
            public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig mo4743xed10d9e9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.ExecutionState executionState) {
                return executionState.mo4749x2fe4f2e8() == 1 ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig.f1196x3da2a9fc : p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig.f1193xc6800f8e;
            }
        });
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0749xea3b6eb7
    /* renamed from: copy */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda mo5297x2eaf75(long j17) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0680x578a4b94(j17);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda
    /* renamed from: getTimeoutInMillis */
    public long mo4742x1de4f616() {
        return this.f1577x4f5e80e4.mo4742x1de4f616();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda
    /* renamed from: onRetryDecisionRequested */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig mo4743xed10d9e9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.ExecutionState executionState) {
        return this.f1577x4f5e80e4.mo4743xed10d9e9(executionState);
    }
}
