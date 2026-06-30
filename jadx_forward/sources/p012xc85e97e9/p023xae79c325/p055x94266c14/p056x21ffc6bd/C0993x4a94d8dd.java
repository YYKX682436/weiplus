package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd;

/* renamed from: androidx.camera.extensions.internal.ExtensionsUtils */
/* loaded from: classes14.dex */
public class C0993x4a94d8dd {

    /* renamed from: androidx.camera.extensions.internal.ExtensionsUtils$Api28Impl */
    /* loaded from: classes14.dex */
    public static class Api28Impl {
        private Api28Impl() {
        }

        /* renamed from: getPhysicalCameraIds */
        public static java.util.Set<java.lang.String> m6706xda421586(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
            try {
                return cameraCharacteristics.getPhysicalCameraIds();
            } catch (java.lang.Exception unused) {
                return java.util.Collections.emptySet();
            }
        }
    }

    private C0993x4a94d8dd() {
    }

    /* renamed from: getCameraCharacteristicsMap */
    public static java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> m6705xc80a217f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570) {
        java.util.Set<java.lang.String> m6706xda421586;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String mo3161x72efd496 = interfaceC0675x66574570.mo3161x72efd496();
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = (android.hardware.camera2.CameraCharacteristics) interfaceC0675x66574570.mo3158x9b962a9d();
        linkedHashMap.put(mo3161x72efd496, cameraCharacteristics);
        if (android.os.Build.VERSION.SDK_INT < 28 || (m6706xda421586 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0993x4a94d8dd.Api28Impl.m6706xda421586(cameraCharacteristics)) == null) {
            return linkedHashMap;
        }
        for (java.lang.String str : m6706xda421586) {
            if (!java.util.Objects.equals(str, mo3161x72efd496)) {
                linkedHashMap.put(str, (android.hardware.camera2.CameraCharacteristics) interfaceC0675x66574570.mo3169x89bd6c06(str));
            }
        }
        return linkedHashMap;
    }
}
