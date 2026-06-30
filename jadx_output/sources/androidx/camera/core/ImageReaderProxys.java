package androidx.camera.core;

/* loaded from: classes14.dex */
public final class ImageReaderProxys {
    private ImageReaderProxys() {
    }

    public static androidx.camera.core.impl.ImageReaderProxy createIsolatedReader(int i17, int i18, int i19, int i27) {
        return new androidx.camera.core.AndroidImageReaderProxy(android.media.ImageReader.newInstance(i17, i18, i19, i27));
    }
}
