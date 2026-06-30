package androidx.camera.extensions.internal;

/* loaded from: classes14.dex */
public class ExtensionsUtils {

    /* loaded from: classes14.dex */
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static java.util.Set<java.lang.String> getPhysicalCameraIds(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
            try {
                return cameraCharacteristics.getPhysicalCameraIds();
            } catch (java.lang.Exception unused) {
                return java.util.Collections.emptySet();
            }
        }
    }

    private ExtensionsUtils() {
    }

    public static java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> getCameraCharacteristicsMap(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal) {
        java.util.Set<java.lang.String> physicalCameraIds;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String cameraId = cameraInfoInternal.getCameraId();
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = (android.hardware.camera2.CameraCharacteristics) cameraInfoInternal.getCameraCharacteristics();
        linkedHashMap.put(cameraId, cameraCharacteristics);
        if (android.os.Build.VERSION.SDK_INT < 28 || (physicalCameraIds = androidx.camera.extensions.internal.ExtensionsUtils.Api28Impl.getPhysicalCameraIds(cameraCharacteristics)) == null) {
            return linkedHashMap;
        }
        for (java.lang.String str : physicalCameraIds) {
            if (!java.util.Objects.equals(str, cameraId)) {
                linkedHashMap.put(str, (android.hardware.camera2.CameraCharacteristics) cameraInfoInternal.getPhysicalCameraCharacteristics(str));
            }
        }
        return linkedHashMap;
    }
}
