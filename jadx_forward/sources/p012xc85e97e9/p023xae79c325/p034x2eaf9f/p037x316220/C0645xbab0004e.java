package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.AutoValue_CameraThreadConfig */
/* loaded from: classes14.dex */
final class C0645xbab0004e extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0687x3f6d91d1 {

    /* renamed from: cameraExecutor */
    private final java.util.concurrent.Executor f1426x318b2b18;

    /* renamed from: schedulerHandler */
    private final android.os.Handler f1427x5adbf60f;

    public C0645xbab0004e(java.util.concurrent.Executor executor, android.os.Handler handler) {
        if (executor == null) {
            throw new java.lang.NullPointerException("Null cameraExecutor");
        }
        this.f1426x318b2b18 = executor;
        if (handler == null) {
            throw new java.lang.NullPointerException("Null schedulerHandler");
        }
        this.f1427x5adbf60f = handler;
    }

    /* renamed from: equals */
    public boolean m5104xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0687x3f6d91d1)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0687x3f6d91d1 abstractC0687x3f6d91d1 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0687x3f6d91d1) obj;
        return this.f1426x318b2b18.equals(abstractC0687x3f6d91d1.mo5105x2022f80e()) && this.f1427x5adbf60f.equals(abstractC0687x3f6d91d1.mo5106x2b45d85());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0687x3f6d91d1
    /* renamed from: getCameraExecutor */
    public java.util.concurrent.Executor mo5105x2022f80e() {
        return this.f1426x318b2b18;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0687x3f6d91d1
    /* renamed from: getSchedulerHandler */
    public android.os.Handler mo5106x2b45d85() {
        return this.f1427x5adbf60f;
    }

    /* renamed from: hashCode */
    public int m5107x8cdac1b() {
        return ((this.f1426x318b2b18.hashCode() ^ 1000003) * 1000003) ^ this.f1427x5adbf60f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m5108x9616526c() {
        return "CameraThreadConfig{cameraExecutor=" + this.f1426x318b2b18 + ", schedulerHandler=" + this.f1427x5adbf60f + "}";
    }
}
