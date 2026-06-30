package androidx.camera.core.processing.concurrent;

/* loaded from: classes14.dex */
public abstract class DualOutConfig {
    public static androidx.camera.core.processing.concurrent.DualOutConfig of(androidx.camera.core.processing.util.OutConfig outConfig, androidx.camera.core.processing.util.OutConfig outConfig2) {
        return new androidx.camera.core.processing.concurrent.AutoValue_DualOutConfig(outConfig, outConfig2);
    }

    public abstract androidx.camera.core.processing.util.OutConfig getPrimaryOutConfig();

    public abstract androidx.camera.core.processing.util.OutConfig getSecondaryOutConfig();
}
