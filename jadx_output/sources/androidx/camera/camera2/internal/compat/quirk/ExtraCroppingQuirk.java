package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class ExtraCroppingQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Map<java.lang.String, android.util.Range<java.lang.Integer>> SAMSUNG_DISTORTION_MODELS_TO_API_LEVEL_MAP;

    /* renamed from: androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType;

        static {
            int[] iArr = new int[androidx.camera.core.impl.SurfaceConfig.ConfigType.values().length];
            $SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType = iArr;
            try {
                iArr[androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType[androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType[androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        SAMSUNG_DISTORTION_MODELS_TO_API_LEVEL_MAP = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new android.util.Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new android.util.Range(21, 26));
    }

    private static boolean isSamsungDistortion() {
        if (!("samsung".equalsIgnoreCase(android.os.Build.BRAND) && SAMSUNG_DISTORTION_MODELS_TO_API_LEVEL_MAP.containsKey(android.os.Build.MODEL.toUpperCase(java.util.Locale.US)))) {
            return false;
        }
        android.util.Range<java.lang.Integer> range = SAMSUNG_DISTORTION_MODELS_TO_API_LEVEL_MAP.get(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
        if (range == null) {
            return true;
        }
        return range.contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
    }

    public static boolean load() {
        return isSamsungDistortion();
    }

    public android.util.Size getVerifiedResolution(androidx.camera.core.impl.SurfaceConfig.ConfigType configType) {
        if (!isSamsungDistortion()) {
            return null;
        }
        int i17 = androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType[configType.ordinal()];
        if (i17 == 1) {
            return new android.util.Size(1920, 1080);
        }
        if (i17 == 2) {
            return new android.util.Size(1280, com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH);
        }
        if (i17 != 3) {
            return null;
        }
        return new android.util.Size(3264, 1836);
    }
}
