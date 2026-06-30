package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public final class JpegHalCorruptImageQuirk implements androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk {
    private static final java.util.Set<java.lang.String> KNOWN_AFFECTED_DEVICES = new java.util.HashSet(java.util.Arrays.asList("heroqltevzw", "heroqltetmo", "k61v1_basic_ref"));

    public static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return KNOWN_AFFECTED_DEVICES.contains(android.os.Build.DEVICE.toLowerCase(java.util.Locale.US));
    }
}
