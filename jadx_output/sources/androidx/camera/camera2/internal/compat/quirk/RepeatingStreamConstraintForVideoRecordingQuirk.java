package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class RepeatingStreamConstraintForVideoRecordingQuirk implements androidx.camera.core.impl.Quirk {
    public static boolean isHuaweiMate9() {
        return "Huawei".equalsIgnoreCase(android.os.Build.BRAND) && "mha-l29".equalsIgnoreCase(android.os.Build.MODEL);
    }

    public static boolean load() {
        return isHuaweiMate9();
    }
}
