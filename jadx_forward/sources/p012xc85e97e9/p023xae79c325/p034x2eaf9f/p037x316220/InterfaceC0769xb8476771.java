package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.UseCaseConfigFactory */
/* loaded from: classes14.dex */
public interface InterfaceC0769xb8476771 {

    /* renamed from: EMPTY_INSTANCE */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 f1839x2368ab67 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771() { // from class: androidx.camera.core.impl.UseCaseConfigFactory.1
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771
        /* renamed from: getConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo3297x1456a638(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType, int i17) {
            return null;
        }
    };

    /* renamed from: androidx.camera.core.impl.UseCaseConfigFactory$CaptureType */
    /* loaded from: classes14.dex */
    public enum CaptureType {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    /* renamed from: androidx.camera.core.impl.UseCaseConfigFactory$Provider */
    /* loaded from: classes14.dex */
    public interface Provider {
        /* renamed from: newInstance */
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 mo5763x6bff0255(android.content.Context context);
    }

    /* renamed from: getConfig */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo3297x1456a638(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType, int i17);
}
