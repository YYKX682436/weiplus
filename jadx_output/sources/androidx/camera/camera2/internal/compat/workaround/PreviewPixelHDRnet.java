package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes14.dex */
public class PreviewPixelHDRnet {
    public static final android.util.Rational ASPECT_RATIO_16_9 = new android.util.Rational(16, 9);

    private PreviewPixelHDRnet() {
    }

    private static boolean isAspectRatioMatch(android.util.Size size, android.util.Rational rational) {
        return rational.equals(new android.util.Rational(size.getWidth(), size.getHeight()));
    }

    public static void setHDRnet(android.util.Size size, androidx.camera.core.impl.SessionConfig.Builder builder) {
        if (((androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk) androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk.class)) == null || isAspectRatioMatch(size, ASPECT_RATIO_16_9)) {
            return;
        }
        androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder2 = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
        builder2.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.TONEMAP_MODE, 2);
        builder.addImplementationOptions(builder2.build());
    }
}
