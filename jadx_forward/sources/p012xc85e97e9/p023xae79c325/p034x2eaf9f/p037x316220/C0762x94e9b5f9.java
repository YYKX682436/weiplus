package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.TimeoutRetryPolicy */
/* loaded from: classes14.dex */
public final class C0762x94e9b5f9 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda {

    /* renamed from: mDelegatePolicy */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda f1818x4f5e80e4;

    /* renamed from: mTimeoutInMillis */
    private final long f1819x931541f;

    public C0762x94e9b5f9(long j17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda interfaceC0559x1327bdda) {
        m3.h.b(j17 >= 0, "Timeout must be non-negative.");
        this.f1819x931541f = j17;
        this.f1818x4f5e80e4 = interfaceC0559x1327bdda;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda
    /* renamed from: getTimeoutInMillis */
    public long mo4742x1de4f616() {
        return this.f1819x931541f;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda
    /* renamed from: onRetryDecisionRequested */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig mo4743xed10d9e9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.ExecutionState executionState) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig mo4743xed10d9e9 = this.f1818x4f5e80e4.mo4743xed10d9e9(executionState);
        return (mo4742x1de4f616() <= 0 || executionState.mo4747x4c67275d() < mo4742x1de4f616() - mo4743xed10d9e9.m4752x27084e9c()) ? mo4743xed10d9e9 : p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.RetryConfig.f1196x3da2a9fc;
    }
}
