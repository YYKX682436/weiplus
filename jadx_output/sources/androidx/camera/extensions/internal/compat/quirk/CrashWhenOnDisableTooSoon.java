package androidx.camera.extensions.internal.compat.quirk;

/* loaded from: classes14.dex */
public class CrashWhenOnDisableTooSoon implements androidx.camera.core.impl.Quirk {
    public static boolean load() {
        return android.os.Build.BRAND.equalsIgnoreCase("SAMSUNG");
    }
}
