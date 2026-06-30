package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class Preview3AThreadCrashQuirk implements androidx.camera.core.impl.Quirk {
    public static boolean load() {
        return "samsungexynos7870".equalsIgnoreCase(android.os.Build.HARDWARE);
    }
}
