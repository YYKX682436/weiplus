package androidx.camera.core.internal.compat;

/* loaded from: classes6.dex */
public final class MediaActionSoundCompat {
    private MediaActionSoundCompat() {
    }

    public static boolean mustPlayShutterSound() {
        return android.os.Build.VERSION.SDK_INT >= 33 ? androidx.camera.core.internal.compat.MediaActionSoundCompatApi33Impl.mustPlayShutterSound() : androidx.camera.core.internal.compat.MediaActionSoundCompatBaseImpl.mustPlayShutterSound();
    }
}
