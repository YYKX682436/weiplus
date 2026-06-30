package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public abstract class OutputSurface {
    public static androidx.camera.core.impl.OutputSurface create(android.view.Surface surface, android.util.Size size, int i17) {
        return new androidx.camera.core.impl.AutoValue_OutputSurface(surface, size, i17);
    }

    public abstract int getImageFormat();

    public abstract android.util.Size getSize();

    public abstract android.view.Surface getSurface();
}
