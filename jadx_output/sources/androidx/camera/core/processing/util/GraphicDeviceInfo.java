package androidx.camera.core.processing.util;

/* loaded from: classes14.dex */
public abstract class GraphicDeviceInfo {

    /* loaded from: classes14.dex */
    public static abstract class Builder {
        public abstract androidx.camera.core.processing.util.GraphicDeviceInfo build();

        public abstract androidx.camera.core.processing.util.GraphicDeviceInfo.Builder setEglExtensions(java.lang.String str);

        public abstract androidx.camera.core.processing.util.GraphicDeviceInfo.Builder setEglVersion(java.lang.String str);

        public abstract androidx.camera.core.processing.util.GraphicDeviceInfo.Builder setGlExtensions(java.lang.String str);

        public abstract androidx.camera.core.processing.util.GraphicDeviceInfo.Builder setGlVersion(java.lang.String str);
    }

    public static androidx.camera.core.processing.util.GraphicDeviceInfo.Builder builder() {
        return new androidx.camera.core.processing.util.AutoValue_GraphicDeviceInfo.Builder().setGlVersion(androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN).setEglVersion(androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN).setGlExtensions("").setEglExtensions("");
    }

    public abstract java.lang.String getEglExtensions();

    public abstract java.lang.String getEglVersion();

    public abstract java.lang.String getGlExtensions();

    public abstract java.lang.String getGlVersion();
}
