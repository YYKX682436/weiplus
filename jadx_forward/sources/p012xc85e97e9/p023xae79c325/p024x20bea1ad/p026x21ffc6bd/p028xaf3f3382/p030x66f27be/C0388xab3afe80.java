package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk */
/* loaded from: classes14.dex */
public class C0388xab3afe80 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.InterfaceC0859x5340759f {

    /* renamed from: KNOWN_AFFECTED_FRONT_CAMERA_DEVICES */
    private static final java.util.Set<java.lang.String> f721x98a59b68 = new java.util.HashSet(java.util.Arrays.asList("redmi note 8 pro"));

    /* renamed from: load */
    public static boolean m4020x32c4e6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        return f721x98a59b68.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.US)) && ((java.lang.Integer) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
