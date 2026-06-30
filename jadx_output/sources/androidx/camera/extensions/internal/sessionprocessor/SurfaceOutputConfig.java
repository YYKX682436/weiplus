package androidx.camera.extensions.internal.sessionprocessor;

/* loaded from: classes14.dex */
public abstract class SurfaceOutputConfig implements androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig {
    public static androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig create(int i17, int i18, java.lang.String str, java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> list, android.view.Surface surface) {
        return new androidx.camera.extensions.internal.sessionprocessor.AutoValue_SurfaceOutputConfig(i17, i18, str, list, surface);
    }

    public abstract android.view.Surface getSurface();

    public static androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig create(int i17, android.view.Surface surface) {
        return create(i17, -1, null, java.util.Collections.emptyList(), surface);
    }
}
