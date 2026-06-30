package androidx.camera.core.streamsharing;

/* loaded from: classes14.dex */
public class VirtualCameraInfo extends androidx.camera.core.impl.ForwardingCameraInfo {
    private final java.lang.String mVirtualCameraId;
    private int mVirtualCameraRotationDegrees;

    public VirtualCameraInfo(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal) {
        super(cameraInfoInternal);
        this.mVirtualCameraId = "virtual-" + cameraInfoInternal.getCameraId() + "-" + java.util.UUID.randomUUID().toString();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public java.lang.String getCameraId() {
        return this.mVirtualCameraId;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }

    public void setVirtualCameraRotationDegrees(int i17) {
        this.mVirtualCameraRotationDegrees = i17;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int i17) {
        return androidx.camera.core.impl.utils.TransformUtils.within360(super.getSensorRotationDegrees(i17) - this.mVirtualCameraRotationDegrees);
    }
}
