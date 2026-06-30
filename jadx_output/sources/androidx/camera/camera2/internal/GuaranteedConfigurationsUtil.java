package androidx.camera.camera2.internal;

/* loaded from: classes13.dex */
public final class GuaranteedConfigurationsUtil {
    private GuaranteedConfigurationsUtil() {
    }

    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> generateSupportedCombinationList(int i17, boolean z17, boolean z18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(getLegacySupportedCombinationList());
        if (i17 == 0 || i17 == 1 || i17 == 3) {
            arrayList.addAll(getLimitedSupportedCombinationList());
        }
        if (i17 == 1 || i17 == 3) {
            arrayList.addAll(getFullSupportedCombinationList());
        }
        if (z17) {
            arrayList.addAll(getRAWSupportedCombinationList());
        }
        if (z18 && i17 == 0) {
            arrayList.addAll(getBurstSupportedCombinationList());
        }
        if (i17 == 3) {
            arrayList.addAll(getLevel3SupportedCombinationList());
        }
        return arrayList;
    }

    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> get10BitSupportedCombinationList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination2 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV;
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination2);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination3 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType3 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG;
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize));
        arrayList.add(surfaceCombination3);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination4 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination4);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination5 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination5);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination6 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.RECORD;
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize3));
        arrayList.add(surfaceCombination6);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination7 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize3));
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize3));
        arrayList.add(surfaceCombination7);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination8 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize3));
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize3));
        arrayList.add(surfaceCombination8);
        return arrayList;
    }

    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getBurstSupportedCombinationList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        arrayList.add(surfaceCombination);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination2 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV;
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination2);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination3 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination3);
        return arrayList;
    }

    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getConcurrentSupportedCombinationList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.s1440p;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination2 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV;
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination2);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination3 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType3 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG;
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize));
        arrayList.add(surfaceCombination3);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination4 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.s720p;
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize));
        arrayList.add(surfaceCombination4);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination5 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize));
        arrayList.add(surfaceCombination5);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination6 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination6);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination7 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination7);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination8 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination8);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination9 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination9.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination9.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination9);
        return arrayList;
    }

    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getFullSupportedCombinationList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        arrayList.add(surfaceCombination);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination2 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV;
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination2);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination3 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination3);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination4 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG, configSize2));
        arrayList.add(surfaceCombination4);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination5 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA;
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize3));
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination5);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination6 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize3));
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination6);
        return arrayList;
    }

    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getLegacySupportedCombinationList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination2 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG;
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination2);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination3 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType3 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV;
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize));
        arrayList.add(surfaceCombination3);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination4 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination4);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination5 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize2));
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination5);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination6 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        arrayList.add(surfaceCombination6);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination7 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize2));
        arrayList.add(surfaceCombination7);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination8 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize2));
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination8);
        return arrayList;
    }

    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getLevel3SupportedCombinationList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize3));
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType3 = androidx.camera.core.impl.SurfaceConfig.ConfigType.RAW;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize3));
        arrayList.add(surfaceCombination);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination2 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG, configSize3));
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize3));
        arrayList.add(surfaceCombination2);
        return arrayList;
    }

    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getLimitedSupportedCombinationList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.RECORD;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        arrayList.add(surfaceCombination);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination2 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV;
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination2);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination3 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination3);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination4 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2));
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType3 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG;
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize2));
        arrayList.add(surfaceCombination4);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination5 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize2));
        arrayList.add(surfaceCombination5);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination6 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination6);
        return arrayList;
    }

    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getPreviewStabilizationSupportedCombinationList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.s1440p;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination2 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV;
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination2);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination3 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType3 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize2));
        arrayList.add(surfaceCombination3);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination4 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize2));
        arrayList.add(surfaceCombination4);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination5 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination5);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination6 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombination6);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination7 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize3));
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination7);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination8 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize3));
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination8);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination9 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination9.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize3));
        surfaceCombination9.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination9);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination10 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination10.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize3));
        surfaceCombination10.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombination10);
        return arrayList;
    }

    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getRAWSupportedCombinationList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType = androidx.camera.core.impl.SurfaceConfig.ConfigType.RAW;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination2 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination2);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination3 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType3 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV;
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize2));
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination3);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination4 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination4);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination5 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize2));
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination5);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination6 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize2));
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize2));
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination6);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination7 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType4 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG;
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType4, configSize));
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination7);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination8 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize2));
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType4, configSize));
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination8);
        return arrayList;
    }

    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getStreamUseCaseSupportedCombinationList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.s1440p;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize, 4L));
        arrayList.add(surfaceCombination);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination2 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV;
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize, 4L));
        arrayList.add(surfaceCombination2);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination3 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.RECORD;
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2, 3L));
        arrayList.add(surfaceCombination3);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination4 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2, 3L));
        arrayList.add(surfaceCombination4);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination5 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType3 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize3, 2L));
        arrayList.add(surfaceCombination5);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination6 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize3, 2L));
        arrayList.add(surfaceCombination6);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination7 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize4 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize3, 2L));
        arrayList.add(surfaceCombination7);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination8 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize3, 2L));
        arrayList.add(surfaceCombination8);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination9 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination9.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination9.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2, 3L));
        arrayList.add(surfaceCombination9);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination10 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination10.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination10.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2, 3L));
        arrayList.add(surfaceCombination10);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination11 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination11.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination11.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize4, 1L));
        arrayList.add(surfaceCombination11);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination12 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination12.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination12.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize2, 3L));
        surfaceCombination12.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize2, 2L));
        arrayList.add(surfaceCombination12);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination13 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination13.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination13.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2, 3L));
        surfaceCombination13.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize2, 2L));
        arrayList.add(surfaceCombination13);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination14 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination14.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination14.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize4, 1L));
        surfaceCombination14.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize3, 2L));
        arrayList.add(surfaceCombination14);
        return arrayList;
    }

    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getUltraHdrSupportedCombinationList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG_R;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination2 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV, androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination2);
        return arrayList;
    }

    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getUltraHighResolutionSupportedCombinationList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.core.impl.SurfaceCombination surfaceCombination = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = androidx.camera.core.impl.SurfaceConfig.ConfigSize.ULTRA_MAXIMUM;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV;
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.RECORD;
        surfaceCombination.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize3));
        arrayList.add(surfaceCombination);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination2 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType3 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG;
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize));
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination2.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize3));
        arrayList.add(surfaceCombination2);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination3 = new androidx.camera.core.impl.SurfaceCombination();
        androidx.camera.core.impl.SurfaceConfig.ConfigType configType4 = androidx.camera.core.impl.SurfaceConfig.ConfigType.RAW;
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType4, configSize));
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination3.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize3));
        arrayList.add(surfaceCombination3);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination4 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize4 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination4.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize4));
        arrayList.add(surfaceCombination4);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination5 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize));
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination5.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize4));
        arrayList.add(surfaceCombination5);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination6 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType4, configSize));
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination6.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize4));
        arrayList.add(surfaceCombination6);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination7 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination7.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize4));
        arrayList.add(surfaceCombination7);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination8 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize));
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination8.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize4));
        arrayList.add(surfaceCombination8);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination9 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination9.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType4, configSize));
        surfaceCombination9.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination9.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize4));
        arrayList.add(surfaceCombination9);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination10 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination10.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType, configSize));
        surfaceCombination10.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination10.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType4, configSize4));
        arrayList.add(surfaceCombination10);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination11 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination11.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType3, configSize));
        surfaceCombination11.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination11.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType4, configSize4));
        arrayList.add(surfaceCombination11);
        androidx.camera.core.impl.SurfaceCombination surfaceCombination12 = new androidx.camera.core.impl.SurfaceCombination();
        surfaceCombination12.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType4, configSize));
        surfaceCombination12.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType2, configSize2));
        surfaceCombination12.addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig.create(configType4, configSize4));
        arrayList.add(surfaceCombination12);
        return arrayList;
    }
}
