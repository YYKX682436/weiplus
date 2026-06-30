package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class CameraQuirks {
    private static final java.lang.String TAG = "CameraQuirks";

    private CameraQuirks() {
    }

    public static androidx.camera.core.impl.Quirks get(java.lang.String str, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        androidx.camera.core.impl.QuirkSettings quirkSettings = androidx.camera.core.impl.QuirkSettingsHolder.instance().get();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk.class, androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk(cameraCharacteristicsCompat));
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk.class, androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk.class, androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk.class, androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk.class, androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk(cameraCharacteristicsCompat));
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk.class, androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk.class, androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk.class, androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.class, androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.class, androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk.class, androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk.class, androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk.class, androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk.class, androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk.class, androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk.class, androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.class, androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.class, androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.class, androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk.class, androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.class, androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk(cameraCharacteristicsCompat));
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk.class, androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.class, androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk.class, androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk.load(cameraCharacteristicsCompat))) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.class, androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.load())) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk());
        }
        androidx.camera.core.impl.Quirks quirks = new androidx.camera.core.impl.Quirks(arrayList);
        androidx.camera.core.Logger.d(TAG, "camera2 CameraQuirks = " + androidx.camera.core.impl.Quirks.toString(quirks));
        return quirks;
    }
}
