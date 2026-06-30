package androidx.camera.camera2.internal.compat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class StreamConfigurationMapCompatApi23Impl extends androidx.camera.camera2.internal.compat.StreamConfigurationMapCompatBaseImpl {
    public StreamConfigurationMapCompatApi23Impl(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompatBaseImpl, androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public android.util.Size[] getOutputSizes(int i17) {
        return this.mStreamConfigurationMap.getOutputSizes(i17);
    }
}
