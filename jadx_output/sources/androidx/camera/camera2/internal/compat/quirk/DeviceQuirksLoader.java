package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
    }

    public static java.util.List<androidx.camera.core.impl.Quirk> loadQuirks(androidx.camera.core.impl.QuirkSettings quirkSettings) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk.class, androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.class, androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.class, androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk.class, androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk.class, androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk.class, androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.class, androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.class, androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.class, androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk.class, androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk.class, androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.class, androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.class, androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk.class, androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.class, androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk.class, androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk.class, androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk.class, androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk());
        }
        return arrayList;
    }
}
