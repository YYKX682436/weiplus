package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class CameraMode {
    public static final int CONCURRENT_CAMERA = 1;
    public static final int DEFAULT = 0;
    public static final int ULTRA_HIGH_RESOLUTION_CAMERA = 2;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Mode {
    }

    private CameraMode() {
    }

    public static java.lang.String toLabelString(int i17) {
        return i17 != 1 ? i17 != 2 ? com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA";
    }
}
