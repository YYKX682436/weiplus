package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public class LensFacingCameraFilter implements androidx.camera.core.CameraFilter {
    private final int mLensFacing;

    public LensFacingCameraFilter(int i17) {
        this.mLensFacing = i17;
    }

    @Override // androidx.camera.core.CameraFilter
    public java.util.List<androidx.camera.core.CameraInfo> filter(java.util.List<androidx.camera.core.CameraInfo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.core.CameraInfo cameraInfo : list) {
            m3.h.b(cameraInfo instanceof androidx.camera.core.impl.CameraInfoInternal, "The camera info doesn't contain internal implementation.");
            if (cameraInfo.getLensFacing() == this.mLensFacing) {
                arrayList.add(cameraInfo);
            }
        }
        return arrayList;
    }

    public int getLensFacing() {
        return this.mLensFacing;
    }
}
