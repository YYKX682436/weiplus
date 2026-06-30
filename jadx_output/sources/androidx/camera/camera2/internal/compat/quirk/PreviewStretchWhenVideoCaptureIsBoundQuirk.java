package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class PreviewStretchWhenVideoCaptureIsBoundQuirk implements androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk {
    private static boolean isHuaweiP8Lite() {
        return "HUAWEI".equalsIgnoreCase(android.os.Build.MANUFACTURER) && "HUAWEI ALE-L04".equalsIgnoreCase(android.os.Build.MODEL);
    }

    private static boolean isOppoA37F() {
        return "OPPO".equalsIgnoreCase(android.os.Build.MANUFACTURER) && "A37F".equalsIgnoreCase(android.os.Build.MODEL);
    }

    private static boolean isSamsungJ1AceNeo() {
        return "Samsung".equalsIgnoreCase(android.os.Build.MANUFACTURER) && "sm-j111f".equalsIgnoreCase(android.os.Build.MODEL);
    }

    private static boolean isSamsungJ3() {
        return "Samsung".equalsIgnoreCase(android.os.Build.MANUFACTURER) && "sm-j320f".equalsIgnoreCase(android.os.Build.MODEL);
    }

    private static boolean isSamsungJ5() {
        return "Samsung".equalsIgnoreCase(android.os.Build.MANUFACTURER) && "sm-j510fn".equalsIgnoreCase(android.os.Build.MODEL);
    }

    private static boolean isSamsungJ7() {
        return "Samsung".equalsIgnoreCase(android.os.Build.MANUFACTURER) && "sm-j700f".equalsIgnoreCase(android.os.Build.MODEL);
    }

    public static boolean load() {
        return isHuaweiP8Lite() || isSamsungJ3() || isSamsungJ7() || isSamsungJ1AceNeo() || isOppoA37F() || isSamsungJ5();
    }
}
