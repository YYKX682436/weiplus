package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd;

/* renamed from: androidx.camera.extensions.internal.VendorExtender */
/* loaded from: classes14.dex */
public interface InterfaceC0999xfb817acf {
    /* renamed from: createSessionProcessor */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc mo6664xed7bdfb8(android.content.Context context) {
        return null;
    }

    /* renamed from: getEstimatedCaptureLatencyRange */
    default android.util.Range<java.lang.Long> mo6665x4b4b39df(android.util.Size size) {
        return null;
    }

    /* renamed from: getSupportedCaptureOutputResolutions */
    default java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> mo6666x801660f8() {
        return java.util.Collections.emptyList();
    }

    /* renamed from: getSupportedCaptureResultKeys */
    default java.util.List<android.hardware.camera2.CaptureResult.Key> mo6667xe60e807f() {
        return java.util.Collections.emptyList();
    }

    /* renamed from: getSupportedPostviewResolutions */
    default java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> mo6668x8d2e83aa(android.util.Size size) {
        return java.util.Collections.emptyMap();
    }

    /* renamed from: getSupportedPreviewOutputResolutions */
    default java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> mo6669xfed98b6() {
        return java.util.Collections.emptyList();
    }

    /* renamed from: getSupportedYuvAnalysisResolutions */
    default android.util.Size[] mo6670x360a99a9() {
        return new android.util.Size[0];
    }

    /* renamed from: init */
    default void mo6671x316510(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93) {
    }

    /* renamed from: isCaptureProcessProgressAvailable */
    default boolean mo6672x9df7b749() {
        return false;
    }

    /* renamed from: isCurrentExtensionModeAvailable */
    default boolean mo6673x8f908e36() {
        return false;
    }

    /* renamed from: isExtensionAvailable */
    default boolean mo6674x5f77814(java.lang.String str, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> map) {
        return false;
    }

    /* renamed from: isExtensionStrengthAvailable */
    default boolean mo6675xa01385d3() {
        return false;
    }

    /* renamed from: isPostviewAvailable */
    default boolean mo6676x1222f0fa() {
        return false;
    }

    /* renamed from: willReceiveOnCaptureCompleted */
    default boolean m6714x2de4ee35() {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2441xa9797f9d;
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6689x884246e(abstractC1001x782db4b8) || p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6699x884246e(abstractC1001x782db4b8)) {
            return false;
        }
        return !mo6667xe60e807f().isEmpty();
    }
}
