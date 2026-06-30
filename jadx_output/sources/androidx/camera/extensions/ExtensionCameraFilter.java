package androidx.camera.extensions;

/* loaded from: classes14.dex */
final class ExtensionCameraFilter implements androidx.camera.core.CameraFilter {
    private final androidx.camera.core.impl.Identifier mId;
    private final androidx.camera.extensions.internal.VendorExtender mVendorExtender;

    public ExtensionCameraFilter(java.lang.String str, androidx.camera.extensions.internal.VendorExtender vendorExtender) {
        this.mId = androidx.camera.core.impl.Identifier.create(str);
        this.mVendorExtender = vendorExtender;
    }

    @Override // androidx.camera.core.CameraFilter
    public java.util.List<androidx.camera.core.CameraInfo> filter(java.util.List<androidx.camera.core.CameraInfo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.core.CameraInfo cameraInfo : list) {
            m3.h.b(cameraInfo instanceof androidx.camera.core.impl.CameraInfoInternal, "The camera info doesn't contain internal implementation.");
            androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal = (androidx.camera.core.impl.CameraInfoInternal) cameraInfo;
            if (this.mVendorExtender.isExtensionAvailable(cameraInfoInternal.getCameraId(), androidx.camera.extensions.internal.ExtensionsUtils.getCameraCharacteristicsMap(cameraInfoInternal))) {
                arrayList.add(cameraInfo);
            }
        }
        return arrayList;
    }

    @Override // androidx.camera.core.CameraFilter
    public androidx.camera.core.impl.Identifier getIdentifier() {
        return this.mId;
    }
}
