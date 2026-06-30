package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class ExtraSupportedOutputSizeQuirk implements androidx.camera.core.impl.Quirk {
    private android.util.Size[] getMotoE5PlayExtraSupportedResolutions() {
        return new android.util.Size[]{new android.util.Size(1440, 1080), new android.util.Size(com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH)};
    }

    private static boolean isMotoE5Play() {
        return "motorola".equalsIgnoreCase(android.os.Build.BRAND) && "moto e5 play".equalsIgnoreCase(android.os.Build.MODEL);
    }

    public static boolean load() {
        return isMotoE5Play();
    }

    public android.util.Size[] getExtraSupportedResolutions(int i17) {
        return (i17 == 34 && isMotoE5Play()) ? getMotoE5PlayExtraSupportedResolutions() : new android.util.Size[0];
    }

    public <T> android.util.Size[] getExtraSupportedResolutions(java.lang.Class<T> cls) {
        return (android.hardware.camera2.params.StreamConfigurationMap.isOutputSupportedFor(cls) && isMotoE5Play()) ? getMotoE5PlayExtraSupportedResolutions() : new android.util.Size[0];
    }
}
