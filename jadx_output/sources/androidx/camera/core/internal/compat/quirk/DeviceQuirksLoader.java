package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes13.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
    }

    public static java.util.List<androidx.camera.core.impl.Quirk> loadQuirks(androidx.camera.core.impl.QuirkSettings quirkSettings) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (quirkSettings.shouldEnableQuirk(androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk.class, androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk.load())) {
            arrayList.add(new androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk.class, androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk.load())) {
            arrayList.add(new androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.class, androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.load())) {
            arrayList.add(new androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.class, androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.load())) {
            arrayList.add(new androidx.camera.core.internal.compat.quirk.LowMemoryQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.class, androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.load())) {
            arrayList.add(new androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.class, androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.load())) {
            arrayList.add(new androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk());
        }
        return arrayList;
    }
}
