package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements androidx.camera.core.impl.Quirk {
    private static final androidx.camera.core.impl.SurfaceCombination FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION = createFullYuvPrivYuvConfiguration();
    private static final androidx.camera.core.impl.SurfaceCombination LEVEL_3_LEVEL_PRIV_PRIV_YUV_SUBSET_CONFIGURATION = createLevel3PrivPrivYuvSubsetConfiguration();
    private static final java.util.Set<java.lang.String> SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_GOOGLE_MODELS = new java.util.HashSet(java.util.Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
    private static final java.util.Set<java.lang.String> SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_SAMSUNG_MODELS = new java.util.HashSet(java.util.Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    private static final java.lang.String TAG = "ExtraSupportedSurfaceCombinationsQuirk";

    private static androidx.camera.core.impl.SurfaceCombination createFullYuvPrivYuvConfiguration() {
        androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA));
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV, androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM));
        return surfaceCombination;
    }

    private static androidx.camera.core.impl.SurfaceCombination createLevel3PrivPrivYuvSubsetConfiguration() {
        androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA));
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV, androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM));
        return surfaceCombination;
    }

    private java.util.List<androidx.camera.core.impl.SurfaceCombination> getSamsungS7ExtraCombinations(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.equals("1")) {
            arrayList.add(FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION);
        }
        return arrayList;
    }

    private static boolean isSamsungS7() {
        java.lang.String str = android.os.Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    public static boolean load() {
        return isSamsungS7() || supportExtraLevel3ConfigurationsGoogleDevice() || supportExtraLevel3ConfigurationsSamsungDevice();
    }

    private static boolean supportExtraLevel3ConfigurationsGoogleDevice() {
        if (!"google".equalsIgnoreCase(android.os.Build.BRAND)) {
            return false;
        }
        return SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_GOOGLE_MODELS.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }

    private static boolean supportExtraLevel3ConfigurationsSamsungDevice() {
        if (!"samsung".equalsIgnoreCase(android.os.Build.BRAND)) {
            return false;
        }
        java.lang.String upperCase = android.os.Build.MODEL.toUpperCase(java.util.Locale.US);
        java.util.Iterator<java.lang.String> it = SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_SAMSUNG_MODELS.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public java.util.List<androidx.camera.core.impl.SurfaceCombination> getExtraSupportedSurfaceCombinations(java.lang.String str) {
        return isSamsungS7() ? getSamsungS7ExtraCombinations(str) : (supportExtraLevel3ConfigurationsGoogleDevice() || supportExtraLevel3ConfigurationsSamsungDevice()) ? java.util.Collections.singletonList(LEVEL_3_LEVEL_PRIV_PRIV_YUV_SUBSET_CONFIGURATION) : java.util.Collections.emptyList();
    }
}
