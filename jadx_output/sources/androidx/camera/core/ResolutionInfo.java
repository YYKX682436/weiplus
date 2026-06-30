package androidx.camera.core;

/* loaded from: classes14.dex */
public class ResolutionInfo {
    private final androidx.camera.core.ResolutionInfo.ResolutionInfoInternal mResolutionInfoInternal;

    /* loaded from: classes14.dex */
    public static abstract class ResolutionInfoInternal {

        /* loaded from: classes14.dex */
        public static abstract class Builder {
            public abstract androidx.camera.core.ResolutionInfo.ResolutionInfoInternal build();

            public abstract androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder setCropRect(android.graphics.Rect rect);

            public abstract androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder setResolution(android.util.Size size);

            public abstract androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder setRotationDegrees(int i17);
        }

        public abstract android.graphics.Rect getCropRect();

        public abstract android.util.Size getResolution();

        public abstract int getRotationDegrees();
    }

    public ResolutionInfo(android.util.Size size, android.graphics.Rect rect, int i17) {
        this.mResolutionInfoInternal = new androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal.Builder().setResolution(size).setCropRect(rect).setRotationDegrees(i17).build();
    }

    public boolean equals(java.lang.Object obj) {
        return this.mResolutionInfoInternal.equals(obj);
    }

    public android.graphics.Rect getCropRect() {
        return this.mResolutionInfoInternal.getCropRect();
    }

    public android.util.Size getResolution() {
        return this.mResolutionInfoInternal.getResolution();
    }

    public int getRotationDegrees() {
        return this.mResolutionInfoInternal.getRotationDegrees();
    }

    public int hashCode() {
        return this.mResolutionInfoInternal.hashCode();
    }

    public java.lang.String toString() {
        return this.mResolutionInfoInternal.toString();
    }
}
