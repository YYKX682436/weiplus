package androidx.camera.core.impl;

/* loaded from: classes13.dex */
public abstract class SurfaceConfig {
    public static final long DEFAULT_STREAM_USE_CASE_VALUE = 0;

    /* loaded from: classes13.dex */
    public enum ConfigSize {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);

        final int mId;

        ConfigSize(int i17) {
            this.mId = i17;
        }

        public int getId() {
            return this.mId;
        }
    }

    /* loaded from: classes13.dex */
    public enum ConfigType {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW
    }

    public static androidx.camera.core.impl.SurfaceConfig create(androidx.camera.core.impl.SurfaceConfig.ConfigType configType, androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize) {
        return new androidx.camera.core.impl.AutoValue_SurfaceConfig(configType, configSize, 0L);
    }

    public static androidx.camera.core.impl.SurfaceConfig.ConfigType getConfigType(int i17) {
        if (i17 == 35) {
            return androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV;
        }
        if (i17 == 256) {
            return androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG;
        }
        if (i17 == 4101) {
            return androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG_R;
        }
        if (i17 == 32) {
            return androidx.camera.core.impl.SurfaceConfig.ConfigType.RAW;
        }
        return androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV;
    }

    public static androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int i17, int i18, android.util.Size size, androidx.camera.core.impl.SurfaceSizeDefinition surfaceSizeDefinition) {
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType = getConfigType(i18);
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.NOT_SUPPORT;
        int area = androidx.camera.core.internal.utils.SizeUtil.getArea(size);
        if (i17 == 1) {
            if (area <= androidx.camera.core.internal.utils.SizeUtil.getArea(surfaceSizeDefinition.getS720pSize(i18))) {
                configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.s720p;
            } else if (area <= androidx.camera.core.internal.utils.SizeUtil.getArea(surfaceSizeDefinition.getS1440pSize(i18))) {
                configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.s1440p;
            }
        } else if (area <= androidx.camera.core.internal.utils.SizeUtil.getArea(surfaceSizeDefinition.getAnalysisSize())) {
            configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA;
        } else if (area <= androidx.camera.core.internal.utils.SizeUtil.getArea(surfaceSizeDefinition.getPreviewSize())) {
            configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW;
        } else if (area <= androidx.camera.core.internal.utils.SizeUtil.getArea(surfaceSizeDefinition.getRecordSize())) {
            configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.RECORD;
        } else if (area <= androidx.camera.core.internal.utils.SizeUtil.getArea(surfaceSizeDefinition.getMaximumSize(i18))) {
            configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM;
        } else {
            android.util.Size ultraMaximumSize = surfaceSizeDefinition.getUltraMaximumSize(i18);
            if (ultraMaximumSize != null && area <= androidx.camera.core.internal.utils.SizeUtil.getArea(ultraMaximumSize)) {
                configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.ULTRA_MAXIMUM;
            }
        }
        return create(configType, configSize);
    }

    public abstract androidx.camera.core.impl.SurfaceConfig.ConfigSize getConfigSize();

    public abstract androidx.camera.core.impl.SurfaceConfig.ConfigType getConfigType();

    public abstract long getStreamUseCase();

    public final boolean isSupported(androidx.camera.core.impl.SurfaceConfig surfaceConfig) {
        return surfaceConfig.getConfigSize().getId() <= getConfigSize().getId() && surfaceConfig.getConfigType() == getConfigType();
    }

    public static androidx.camera.core.impl.SurfaceConfig create(androidx.camera.core.impl.SurfaceConfig.ConfigType configType, androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize, long j17) {
        return new androidx.camera.core.impl.AutoValue_SurfaceConfig(configType, configSize, j17);
    }
}
