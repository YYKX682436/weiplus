package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class SupportedSurfaceCombination {
    private static final java.lang.String TAG = "SupportedSurfaceCombination";
    private final androidx.camera.camera2.internal.CamcorderProfileHelper mCamcorderProfileHelper;
    private final java.lang.String mCameraId;
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCharacteristics;
    private final androidx.camera.camera2.internal.DisplayInfoManager mDisplayInfoManager;
    private final androidx.camera.camera2.internal.DynamicRangeResolver mDynamicRangeResolver;
    private final androidx.camera.camera2.internal.compat.workaround.ExtraSupportedSurfaceCombinationsContainer mExtraSupportedSurfaceCombinationsContainer;
    private final int mHardwareLevel;
    private boolean mIsBurstCaptureSupported;
    private boolean mIsConcurrentCameraModeSupported;
    private boolean mIsPreviewStabilizationSupported;
    private boolean mIsRawSupported;
    private boolean mIsStreamUseCaseSupported;
    private boolean mIsUltraHighResolutionSensorSupported;
    androidx.camera.core.impl.SurfaceSizeDefinition mSurfaceSizeDefinition;
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> mSurfaceCombinations = new java.util.ArrayList();
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> mUltraHighSurfaceCombinations = new java.util.ArrayList();
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> mConcurrentSurfaceCombinations = new java.util.ArrayList();
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> mPreviewStabilizationSurfaceCombinations = new java.util.ArrayList();
    private final java.util.Map<androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings, java.util.List<androidx.camera.core.impl.SurfaceCombination>> mFeatureSettingsToSupportedCombinationsMap = new java.util.HashMap();
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> mSurfaceCombinations10Bit = new java.util.ArrayList();
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> mSurfaceCombinationsUltraHdr = new java.util.ArrayList();
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> mSurfaceCombinationsStreamUseCase = new java.util.ArrayList();
    java.util.List<java.lang.Integer> mSurfaceSizeDefinitionFormats = new java.util.ArrayList();
    private final androidx.camera.camera2.internal.compat.workaround.TargetAspectRatio mTargetAspectRatio = new androidx.camera.camera2.internal.compat.workaround.TargetAspectRatio();
    private final androidx.camera.camera2.internal.compat.workaround.ResolutionCorrector mResolutionCorrector = new androidx.camera.camera2.internal.compat.workaround.ResolutionCorrector();

    /* loaded from: classes14.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static android.util.Size[] getHighResolutionOutputSizes(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap, int i17) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i17);
        }
    }

    /* loaded from: classes14.dex */
    public static abstract class FeatureSettings {
        public static androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings of(int i17, int i18, boolean z17, boolean z18) {
            return new androidx.camera.camera2.internal.AutoValue_SupportedSurfaceCombination_FeatureSettings(i17, i18, z17, z18);
        }

        public abstract int getCameraMode();

        public abstract int getRequiredMaxBitDepth();

        public abstract boolean isPreviewStabilizationOn();

        public abstract boolean isUltraHdrOn();
    }

    public SupportedSurfaceCombination(android.content.Context context, java.lang.String str, androidx.camera.camera2.internal.compat.CameraManagerCompat cameraManagerCompat, androidx.camera.camera2.internal.CamcorderProfileHelper camcorderProfileHelper) {
        this.mIsRawSupported = false;
        this.mIsBurstCaptureSupported = false;
        this.mIsConcurrentCameraModeSupported = false;
        this.mIsStreamUseCaseSupported = false;
        this.mIsUltraHighResolutionSensorSupported = false;
        this.mIsPreviewStabilizationSupported = false;
        str.getClass();
        this.mCameraId = str;
        camcorderProfileHelper.getClass();
        this.mCamcorderProfileHelper = camcorderProfileHelper;
        this.mExtraSupportedSurfaceCombinationsContainer = new androidx.camera.camera2.internal.compat.workaround.ExtraSupportedSurfaceCombinationsContainer();
        this.mDisplayInfoManager = androidx.camera.camera2.internal.DisplayInfoManager.getInstance(context);
        try {
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str);
            this.mCharacteristics = cameraCharacteristicsCompat;
            java.lang.Integer num = (java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.mHardwareLevel = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i17 : iArr) {
                    if (i17 == 3) {
                        this.mIsRawSupported = true;
                    } else if (i17 == 6) {
                        this.mIsBurstCaptureSupported = true;
                    } else if (android.os.Build.VERSION.SDK_INT >= 31 && i17 == 16) {
                        this.mIsUltraHighResolutionSensorSupported = true;
                    }
                }
            }
            androidx.camera.camera2.internal.DynamicRangeResolver dynamicRangeResolver = new androidx.camera.camera2.internal.DynamicRangeResolver(this.mCharacteristics);
            this.mDynamicRangeResolver = dynamicRangeResolver;
            generateSupportedCombinationList();
            if (this.mIsUltraHighResolutionSensorSupported) {
                generateUltraHighSupportedCombinationList();
            }
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.mIsConcurrentCameraModeSupported = hasSystemFeature;
            if (hasSystemFeature) {
                generateConcurrentSupportedCombinationList();
            }
            if (dynamicRangeResolver.is10BitDynamicRangeSupported()) {
                generate10BitSupportedCombinationList();
            }
            if (isUltraHdrSupported()) {
                generateUltraHdrSupportedCombinationList();
            }
            boolean isStreamUseCaseSupported = androidx.camera.camera2.internal.StreamUseCaseUtil.isStreamUseCaseSupported(this.mCharacteristics);
            this.mIsStreamUseCaseSupported = isStreamUseCaseSupported;
            if (isStreamUseCaseSupported) {
                generateStreamUseCaseSupportedCombinationList();
            }
            boolean isPreviewStabilizationSupported = androidx.camera.camera2.internal.VideoStabilizationUtil.isPreviewStabilizationSupported(this.mCharacteristics);
            this.mIsPreviewStabilizationSupported = isPreviewStabilizationSupported;
            if (isPreviewStabilizationSupported) {
                generatePreviewStabilizationSupportedCombinationList();
            }
            generateSurfaceSizeDefinition();
            checkCustomization();
        } catch (androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat e17) {
            throw androidx.camera.camera2.internal.CameraUnavailableExceptionHelper.createFrom(e17);
        }
    }

    private void checkCustomization() {
    }

    private static android.util.Range<java.lang.Integer> compareIntersectingRanges(android.util.Range<java.lang.Integer> range, android.util.Range<java.lang.Integer> range2, android.util.Range<java.lang.Integer> range3) {
        double rangeLength = getRangeLength(range2.intersect(range));
        double rangeLength2 = getRangeLength(range3.intersect(range));
        double rangeLength3 = rangeLength2 / getRangeLength(range3);
        double rangeLength4 = rangeLength / getRangeLength(range2);
        if (rangeLength2 > rangeLength) {
            if (rangeLength3 >= 0.5d || rangeLength3 >= rangeLength4) {
                return range3;
            }
        } else if (rangeLength2 == rangeLength) {
            if (rangeLength3 > rangeLength4) {
                return range3;
            }
            if (rangeLength3 == rangeLength4 && range3.getLower().intValue() > range2.getLower().intValue()) {
                return range3;
            }
        } else if (rangeLength4 < 0.5d && rangeLength3 > rangeLength4) {
            return range3;
        }
        return range2;
    }

    private androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings createFeatureSettings(int i17, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> map, boolean z17, boolean z18) {
        int requiredMaxBitDepth = getRequiredMaxBitDepth(map);
        if (i17 != 0 && z18) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.mCameraId, androidx.camera.core.impl.CameraMode.toLabelString(i17)));
        }
        if (i17 == 0 || requiredMaxBitDepth != 10) {
            return androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings.of(i17, requiredMaxBitDepth, z17, z18);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.mCameraId, androidx.camera.core.impl.CameraMode.toLabelString(i17)));
    }

    private java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> filterSupportedSizes(java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> map, androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings featureSettings, android.util.Range<java.lang.Integer> range) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig : map.keySet()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            for (android.util.Size size : map.get(useCaseConfig)) {
                int inputFormat = useCaseConfig.getInputFormat();
                androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = androidx.camera.core.impl.SurfaceConfig.transformSurfaceConfig(featureSettings.getCameraMode(), inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat)).getConfigSize();
                int maxFrameRate = range != null ? getMaxFrameRate(this.mCharacteristics, inputFormat, size) : Integer.MAX_VALUE;
                java.util.Set set = (java.util.Set) hashMap2.get(configSize);
                if (set == null) {
                    set = new java.util.HashSet();
                    hashMap2.put(configSize, set);
                }
                if (!set.contains(java.lang.Integer.valueOf(maxFrameRate))) {
                    arrayList.add(size);
                    set.add(java.lang.Integer.valueOf(maxFrameRate));
                }
            }
            hashMap.put(useCaseConfig, arrayList);
        }
        return hashMap;
    }

    private void generate10BitSupportedCombinationList() {
        this.mSurfaceCombinations10Bit.addAll(androidx.camera.camera2.internal.GuaranteedConfigurationsUtil.get10BitSupportedCombinationList());
    }

    private void generateConcurrentSupportedCombinationList() {
        this.mConcurrentSurfaceCombinations.addAll(androidx.camera.camera2.internal.GuaranteedConfigurationsUtil.getConcurrentSupportedCombinationList());
    }

    private void generatePreviewStabilizationSupportedCombinationList() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            this.mPreviewStabilizationSurfaceCombinations.addAll(androidx.camera.camera2.internal.GuaranteedConfigurationsUtil.getPreviewStabilizationSupportedCombinationList());
        }
    }

    private void generateStreamUseCaseSupportedCombinationList() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            this.mSurfaceCombinationsStreamUseCase.addAll(androidx.camera.camera2.internal.GuaranteedConfigurationsUtil.getStreamUseCaseSupportedCombinationList());
        }
    }

    private void generateSupportedCombinationList() {
        this.mSurfaceCombinations.addAll(androidx.camera.camera2.internal.GuaranteedConfigurationsUtil.generateSupportedCombinationList(this.mHardwareLevel, this.mIsRawSupported, this.mIsBurstCaptureSupported));
        this.mSurfaceCombinations.addAll(this.mExtraSupportedSurfaceCombinationsContainer.get(this.mCameraId));
    }

    private void generateSurfaceSizeDefinition() {
        this.mSurfaceSizeDefinition = androidx.camera.core.impl.SurfaceSizeDefinition.create(androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_VGA, new java.util.HashMap(), this.mDisplayInfoManager.getPreviewSize(), new java.util.HashMap(), getRecordSize(), new java.util.HashMap(), new java.util.HashMap());
    }

    private void generateUltraHdrSupportedCombinationList() {
        this.mSurfaceCombinationsUltraHdr.addAll(androidx.camera.camera2.internal.GuaranteedConfigurationsUtil.getUltraHdrSupportedCombinationList());
    }

    private void generateUltraHighSupportedCombinationList() {
        this.mUltraHighSurfaceCombinations.addAll(androidx.camera.camera2.internal.GuaranteedConfigurationsUtil.getUltraHighResolutionSupportedCombinationList());
    }

    private java.util.List<java.util.List<android.util.Size>> getAllPossibleSizeArrangements(java.util.List<java.util.List<android.util.Size>> list) {
        java.util.Iterator<java.util.List<android.util.Size>> it = list.iterator();
        int i17 = 1;
        while (it.hasNext()) {
            i17 *= it.next().size();
        }
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Failed to find supported resolutions.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(new java.util.ArrayList());
        }
        int size = i17 / list.get(0).size();
        int i19 = i17;
        for (int i27 = 0; i27 < list.size(); i27++) {
            java.util.List<android.util.Size> list2 = list.get(i27);
            for (int i28 = 0; i28 < i17; i28++) {
                ((java.util.List) arrayList.get(i28)).add(list2.get((i28 % i19) / size));
            }
            if (i27 < list.size() - 1) {
                i19 = size;
                size /= list.get(i27 + 1).size();
            }
        }
        return arrayList;
    }

    private android.util.Range<java.lang.Integer> getClosestSupportedDeviceFrameRate(android.util.Range<java.lang.Integer> range, int i17) {
        if (range != null) {
            android.util.Range<java.lang.Integer> range2 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            if (!range.equals(range2)) {
                android.util.Range<java.lang.Integer>[] rangeArr = (android.util.Range[]) this.mCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null) {
                    return range2;
                }
                android.util.Range<java.lang.Integer> range3 = new android.util.Range<>(java.lang.Integer.valueOf(java.lang.Math.min(range.getLower().intValue(), i17)), java.lang.Integer.valueOf(java.lang.Math.min(range.getUpper().intValue(), i17)));
                int i18 = 0;
                for (android.util.Range<java.lang.Integer> range4 : rangeArr) {
                    if (i17 >= range4.getLower().intValue()) {
                        if (range2.equals(androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                            range2 = range4;
                        }
                        if (range4.equals(range3)) {
                            return range4;
                        }
                        try {
                            int rangeLength = getRangeLength(range4.intersect(range3));
                            if (i18 == 0) {
                                i18 = rangeLength;
                            } else {
                                if (rangeLength >= i18) {
                                    range2 = compareIntersectingRanges(range3, range2, range4);
                                    i18 = getRangeLength(range3.intersect(range2));
                                }
                                range4 = range2;
                            }
                        } catch (java.lang.IllegalArgumentException unused) {
                            if (i18 == 0) {
                                if (getRangeDistance(range4, range3) >= getRangeDistance(range2, range3)) {
                                    if (getRangeDistance(range4, range3) == getRangeDistance(range2, range3)) {
                                        if (range4.getLower().intValue() <= range2.getUpper().intValue() && getRangeLength(range4) >= getRangeLength(range2)) {
                                        }
                                    }
                                }
                            }
                        }
                        range2 = range4;
                    }
                }
                return range2;
            }
        }
        return androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
    }

    public static int getMaxFrameRate(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat, int i17, android.util.Size size) {
        try {
            return (int) (1.0E9d / ((android.hardware.camera2.params.StreamConfigurationMap) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i17, size));
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    private android.util.Size getMaxOutputSizeByFormat(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap, int i17, boolean z17) {
        android.util.Size[] highResolutionOutputSizes;
        android.util.Size[] outputSizes = i17 == 34 ? streamConfigurationMap.getOutputSizes(android.graphics.SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i17);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        androidx.camera.core.impl.utils.CompareSizesByArea compareSizesByArea = new androidx.camera.core.impl.utils.CompareSizesByArea();
        android.util.Size size = (android.util.Size) java.util.Collections.max(java.util.Arrays.asList(outputSizes), compareSizesByArea);
        android.util.Size size2 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_ZERO;
        if (z17 && (highResolutionOutputSizes = androidx.camera.camera2.internal.SupportedSurfaceCombination.Api23Impl.getHighResolutionOutputSizes(streamConfigurationMap, i17)) != null && highResolutionOutputSizes.length > 0) {
            size2 = (android.util.Size) java.util.Collections.max(java.util.Arrays.asList(highResolutionOutputSizes), compareSizesByArea);
        }
        return (android.util.Size) java.util.Collections.max(java.util.Arrays.asList(size, size2), compareSizesByArea);
    }

    private int getMaxSupportedFpsFromAttachedSurfaces(java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> list) {
        int i17 = Integer.MAX_VALUE;
        for (androidx.camera.core.impl.AttachedSurfaceInfo attachedSurfaceInfo : list) {
            i17 = getUpdatedMaximumFps(i17, attachedSurfaceInfo.getImageFormat(), attachedSurfaceInfo.getSize());
        }
        return i17;
    }

    private static int getRangeDistance(android.util.Range<java.lang.Integer> range, android.util.Range<java.lang.Integer> range2) {
        m3.h.e((range.contains((android.util.Range<java.lang.Integer>) range2.getUpper()) || range.contains((android.util.Range<java.lang.Integer>) range2.getLower())) ? false : true, "Ranges must not intersect");
        return range.getLower().intValue() > range2.getUpper().intValue() ? range.getLower().intValue() - range2.getUpper().intValue() : range2.getLower().intValue() - range.getUpper().intValue();
    }

    private static int getRangeLength(android.util.Range<java.lang.Integer> range) {
        return (range.getUpper().intValue() - range.getLower().intValue()) + 1;
    }

    private android.util.Size getRecordSize() {
        try {
            int parseInt = java.lang.Integer.parseInt(this.mCameraId);
            android.media.CamcorderProfile camcorderProfile = this.mCamcorderProfileHelper.hasProfile(parseInt, 1) ? this.mCamcorderProfileHelper.get(parseInt, 1) : null;
            return camcorderProfile != null ? new android.util.Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) : getRecordSizeByHasProfile(parseInt);
        } catch (java.lang.NumberFormatException unused) {
            return getRecordSizeFromStreamConfigurationMap();
        }
    }

    private android.util.Size getRecordSizeByHasProfile(int i17) {
        android.util.Size size = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_480P;
        android.media.CamcorderProfile camcorderProfile = this.mCamcorderProfileHelper.hasProfile(i17, 10) ? this.mCamcorderProfileHelper.get(i17, 10) : this.mCamcorderProfileHelper.hasProfile(i17, 8) ? this.mCamcorderProfileHelper.get(i17, 8) : this.mCamcorderProfileHelper.hasProfile(i17, 12) ? this.mCamcorderProfileHelper.get(i17, 12) : this.mCamcorderProfileHelper.hasProfile(i17, 6) ? this.mCamcorderProfileHelper.get(i17, 6) : this.mCamcorderProfileHelper.hasProfile(i17, 5) ? this.mCamcorderProfileHelper.get(i17, 5) : this.mCamcorderProfileHelper.hasProfile(i17, 4) ? this.mCamcorderProfileHelper.get(i17, 4) : null;
        return camcorderProfile != null ? new android.util.Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) : size;
    }

    private android.util.Size getRecordSizeFromStreamConfigurationMap() {
        android.util.Size[] outputSizes = this.mCharacteristics.getStreamConfigurationMapCompat().toStreamConfigurationMap().getOutputSizes(android.media.MediaRecorder.class);
        if (outputSizes == null) {
            return androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_480P;
        }
        java.util.Arrays.sort(outputSizes, new androidx.camera.core.impl.utils.CompareSizesByArea(true));
        for (android.util.Size size : outputSizes) {
            int width = size.getWidth();
            android.util.Size size2 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_1080P;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_480P;
    }

    private static int getRequiredMaxBitDepth(java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> map) {
        java.util.Iterator<androidx.camera.core.DynamicRange> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().getBitDepth() == 10) {
                return 10;
            }
        }
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.util.List<androidx.camera.core.impl.SurfaceCombination> getSurfaceCombinationsByFeatureSettings(androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings featureSettings) {
        java.util.List list;
        if (this.mFeatureSettingsToSupportedCombinationsMap.containsKey(featureSettings)) {
            return this.mFeatureSettingsToSupportedCombinationsMap.get(featureSettings);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (featureSettings.isUltraHdrOn()) {
            list = arrayList;
            if (featureSettings.getCameraMode() == 0) {
                arrayList.addAll(this.mSurfaceCombinationsUltraHdr);
                list = arrayList;
            }
        } else if (featureSettings.getRequiredMaxBitDepth() == 8) {
            int cameraMode = featureSettings.getCameraMode();
            if (cameraMode == 1) {
                list = this.mConcurrentSurfaceCombinations;
            } else if (cameraMode != 2) {
                arrayList.addAll(featureSettings.isPreviewStabilizationOn() ? this.mPreviewStabilizationSurfaceCombinations : this.mSurfaceCombinations);
                list = arrayList;
            } else {
                arrayList.addAll(this.mUltraHighSurfaceCombinations);
                arrayList.addAll(this.mSurfaceCombinations);
                list = arrayList;
            }
        } else {
            list = arrayList;
            if (featureSettings.getRequiredMaxBitDepth() == 10) {
                list = arrayList;
                if (featureSettings.getCameraMode() == 0) {
                    arrayList.addAll(this.mSurfaceCombinations10Bit);
                    list = arrayList;
                }
            }
        }
        this.mFeatureSettingsToSupportedCombinationsMap.put(featureSettings, list);
        return list;
    }

    private android.util.Pair<java.util.List<androidx.camera.core.impl.SurfaceConfig>, java.lang.Integer> getSurfaceConfigListAndFpsCeiling(int i17, java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> list, java.util.List<android.util.Size> list2, java.util.List<androidx.camera.core.impl.UseCaseConfig<?>> list3, java.util.List<java.lang.Integer> list4, int i18, java.util.Map<java.lang.Integer, androidx.camera.core.impl.AttachedSurfaceInfo> map, java.util.Map<java.lang.Integer, androidx.camera.core.impl.UseCaseConfig<?>> map2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.core.impl.AttachedSurfaceInfo attachedSurfaceInfo : list) {
            arrayList.add(attachedSurfaceInfo.getSurfaceConfig());
            if (map != null) {
                map.put(java.lang.Integer.valueOf(arrayList.size() - 1), attachedSurfaceInfo);
            }
        }
        for (int i19 = 0; i19 < list2.size(); i19++) {
            android.util.Size size = list2.get(i19);
            androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig = list3.get(list4.get(i19).intValue());
            int inputFormat = useCaseConfig.getInputFormat();
            arrayList.add(androidx.camera.core.impl.SurfaceConfig.transformSurfaceConfig(i17, inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat)));
            if (map2 != null) {
                map2.put(java.lang.Integer.valueOf(arrayList.size() - 1), useCaseConfig);
            }
            i18 = getUpdatedMaximumFps(i18, useCaseConfig.getInputFormat(), size);
        }
        return new android.util.Pair<>(arrayList, java.lang.Integer.valueOf(i18));
    }

    private android.util.Range<java.lang.Integer> getTargetFpsRange(java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> list, java.util.List<androidx.camera.core.impl.UseCaseConfig<?>> list2, java.util.List<java.lang.Integer> list3) {
        java.util.Iterator<androidx.camera.core.impl.AttachedSurfaceInfo> it = list.iterator();
        android.util.Range<java.lang.Integer> range = null;
        while (it.hasNext()) {
            range = getUpdatedTargetFramerate(it.next().getTargetFrameRate(), range);
        }
        java.util.Iterator<java.lang.Integer> it6 = list3.iterator();
        while (it6.hasNext()) {
            range = getUpdatedTargetFramerate(list2.get(it6.next().intValue()).getTargetFrameRate(null), range);
        }
        return range;
    }

    private int getUpdatedMaximumFps(int i17, int i18, android.util.Size size) {
        return java.lang.Math.min(i17, getMaxFrameRate(this.mCharacteristics, i18, size));
    }

    private android.util.Range<java.lang.Integer> getUpdatedTargetFramerate(android.util.Range<java.lang.Integer> range, android.util.Range<java.lang.Integer> range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    private static java.util.List<java.lang.Integer> getUseCasesPriorityOrder(java.util.List<androidx.camera.core.impl.UseCaseConfig<?>> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<androidx.camera.core.impl.UseCaseConfig<?>> it = list.iterator();
        while (it.hasNext()) {
            int surfaceOccupancyPriority = it.next().getSurfaceOccupancyPriority(0);
            if (!arrayList2.contains(java.lang.Integer.valueOf(surfaceOccupancyPriority))) {
                arrayList2.add(java.lang.Integer.valueOf(surfaceOccupancyPriority));
            }
        }
        java.util.Collections.sort(arrayList2);
        java.util.Collections.reverse(arrayList2);
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Integer) it6.next()).intValue();
            for (androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig : list) {
                if (intValue == useCaseConfig.getSurfaceOccupancyPriority(0)) {
                    arrayList.add(java.lang.Integer.valueOf(list.indexOf(useCaseConfig)));
                }
            }
        }
        return arrayList;
    }

    private static boolean isUltraHdrOn(java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> list, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> map) {
        java.util.Iterator<androidx.camera.core.impl.AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getImageFormat() == 4101) {
                return true;
            }
        }
        java.util.Iterator<androidx.camera.core.impl.UseCaseConfig<?>> it6 = map.keySet().iterator();
        while (it6.hasNext()) {
            if (it6.next().getInputFormat() == 4101) {
                return true;
            }
        }
        return false;
    }

    private boolean isUltraHdrSupported() {
        int[] outputFormats = this.mCharacteristics.getStreamConfigurationMapCompat().getOutputFormats();
        if (outputFormats == null) {
            return false;
        }
        for (int i17 : outputFormats) {
            if (i17 == 4101) {
                return true;
            }
        }
        return false;
    }

    private boolean isUseCasesCombinationSupported(androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings featureSettings, java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> list, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.camera.core.impl.AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getSurfaceConfig());
        }
        androidx.camera.core.impl.utils.CompareSizesByArea compareSizesByArea = new androidx.camera.core.impl.utils.CompareSizesByArea();
        for (androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig : map.keySet()) {
            java.util.List<android.util.Size> list2 = map.get(useCaseConfig);
            m3.h.b((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + useCaseConfig + ".");
            android.util.Size size = (android.util.Size) java.util.Collections.min(list2, compareSizesByArea);
            int inputFormat = useCaseConfig.getInputFormat();
            arrayList.add(androidx.camera.core.impl.SurfaceConfig.transformSurfaceConfig(featureSettings.getCameraMode(), inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat)));
        }
        return checkSupported(featureSettings, arrayList);
    }

    private void refreshPreviewSize() {
        this.mDisplayInfoManager.refresh();
        if (this.mSurfaceSizeDefinition == null) {
            generateSurfaceSizeDefinition();
        } else {
            this.mSurfaceSizeDefinition = androidx.camera.core.impl.SurfaceSizeDefinition.create(this.mSurfaceSizeDefinition.getAnalysisSize(), this.mSurfaceSizeDefinition.getS720pSizeMap(), this.mDisplayInfoManager.getPreviewSize(), this.mSurfaceSizeDefinition.getS1440pSizeMap(), this.mSurfaceSizeDefinition.getRecordSize(), this.mSurfaceSizeDefinition.getMaximumSizeMap(), this.mSurfaceSizeDefinition.getUltraMaximumSizeMap());
        }
    }

    private void updateMaximumSizeByFormat(java.util.Map<java.lang.Integer, android.util.Size> map, int i17) {
        android.util.Size maxOutputSizeByFormat = getMaxOutputSizeByFormat(this.mCharacteristics.getStreamConfigurationMapCompat().toStreamConfigurationMap(), i17, true);
        if (maxOutputSizeByFormat != null) {
            map.put(java.lang.Integer.valueOf(i17), maxOutputSizeByFormat);
        }
    }

    private void updateS720pOrS1440pSizeByFormat(java.util.Map<java.lang.Integer, android.util.Size> map, android.util.Size size, int i17) {
        if (this.mIsConcurrentCameraModeSupported) {
            android.util.Size maxOutputSizeByFormat = getMaxOutputSizeByFormat(this.mCharacteristics.getStreamConfigurationMapCompat().toStreamConfigurationMap(), i17, false);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            if (maxOutputSizeByFormat != null) {
                size = (android.util.Size) java.util.Collections.min(java.util.Arrays.asList(size, maxOutputSizeByFormat), new androidx.camera.core.impl.utils.CompareSizesByArea());
            }
            map.put(valueOf, size);
        }
    }

    private void updateUltraMaximumSizeByFormat(java.util.Map<java.lang.Integer, android.util.Size> map, int i17) {
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap;
        if (android.os.Build.VERSION.SDK_INT < 31 || !this.mIsUltraHighResolutionSensorSupported || (streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) this.mCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) == null) {
            return;
        }
        map.put(java.lang.Integer.valueOf(i17), getMaxOutputSizeByFormat(streamConfigurationMap, i17, true));
    }

    public java.util.List<android.util.Size> applyResolutionSelectionOrderRelatedWorkarounds(java.util.List<android.util.Size> list, int i17) {
        android.util.Rational rational;
        int i18 = this.mTargetAspectRatio.get(this.mCameraId, this.mCharacteristics);
        if (i18 == 0) {
            rational = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3;
        } else if (i18 == 1) {
            rational = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9;
        } else if (i18 != 2) {
            rational = null;
        } else {
            android.util.Size maximumSize = getUpdatedSurfaceSizeDefinitionByFormat(256).getMaximumSize(256);
            rational = new android.util.Rational(maximumSize.getWidth(), maximumSize.getHeight());
        }
        if (rational != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (android.util.Size size : list) {
                if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.mResolutionCorrector.insertOrPrioritize(androidx.camera.core.impl.SurfaceConfig.getConfigType(i17), list);
    }

    public boolean checkSupported(androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings featureSettings, java.util.List<androidx.camera.core.impl.SurfaceConfig> list) {
        java.util.Iterator<androidx.camera.core.impl.SurfaceCombination> it = getSurfaceCombinationsByFeatureSettings(featureSettings).iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            z17 = it.next().getOrderedSupportedSurfaceConfigList(list) != null;
            if (z17) {
                break;
            }
        }
        return z17;
    }

    public java.lang.String getCameraId() {
        return this.mCameraId;
    }

    public java.util.List<androidx.camera.core.impl.SurfaceConfig> getOrderedSupportedStreamUseCaseSurfaceConfigList(androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings featureSettings, java.util.List<androidx.camera.core.impl.SurfaceConfig> list) {
        if (!androidx.camera.camera2.internal.StreamUseCaseUtil.shouldUseStreamUseCase(featureSettings)) {
            return null;
        }
        java.util.Iterator<androidx.camera.core.impl.SurfaceCombination> it = this.mSurfaceCombinationsStreamUseCase.iterator();
        while (it.hasNext()) {
            java.util.List<androidx.camera.core.impl.SurfaceConfig> orderedSupportedSurfaceConfigList = it.next().getOrderedSupportedSurfaceConfigList(list);
            if (orderedSupportedSurfaceConfigList != null) {
                return orderedSupportedSurfaceConfigList;
            }
        }
        return null;
    }

    public android.util.Pair<java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec>, java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec>> getSuggestedStreamSpecifications(int i17, java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> list, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> map, boolean z17, boolean z18) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.util.HashMap hashMap3;
        android.util.Range<java.lang.Integer> range;
        java.util.List<java.lang.Integer> list2;
        java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> map2;
        int i18;
        java.lang.String str;
        java.lang.String str2;
        java.util.HashMap hashMap4;
        java.util.List<androidx.camera.core.impl.SurfaceConfig> list3;
        java.lang.String str3;
        java.lang.String str4;
        java.util.HashMap hashMap5;
        java.util.HashMap hashMap6;
        java.util.List<android.util.Size> list4;
        java.util.List<android.util.Size> list5;
        java.util.HashMap hashMap7;
        int i19;
        int i27;
        java.lang.String str5;
        refreshPreviewSize();
        java.util.ArrayList arrayList = new java.util.ArrayList(map.keySet());
        java.util.List<java.lang.Integer> useCasesPriorityOrder = getUseCasesPriorityOrder(arrayList);
        java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> resolveAndValidateDynamicRanges = this.mDynamicRangeResolver.resolveAndValidateDynamicRanges(list, arrayList, useCasesPriorityOrder);
        androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings createFeatureSettings = createFeatureSettings(i17, resolveAndValidateDynamicRanges, z17, isUltraHdrOn(list, map));
        boolean isUseCasesCombinationSupported = isUseCasesCombinationSupported(createFeatureSettings, list, map);
        java.lang.String str6 = ".  May be attempting to bind too many use cases. Existing surfaces: ";
        java.lang.String str7 = " New configs: ";
        java.lang.String str8 = "No supported surface combination is found for camera device - Id : ";
        if (!isUseCasesCombinationSupported) {
            throw new java.lang.IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.mCameraId + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
        }
        android.util.Range<java.lang.Integer> targetFpsRange = getTargetFpsRange(list, arrayList, useCasesPriorityOrder);
        java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> filterSupportedSizes = filterSupportedSizes(map, createFeatureSettings, targetFpsRange);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = useCasesPriorityOrder.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.UseCaseConfig useCaseConfig = (androidx.camera.core.impl.UseCaseConfig) arrayList.get(it.next().intValue());
            arrayList2.add(applyResolutionSelectionOrderRelatedWorkarounds(filterSupportedSizes.get(useCaseConfig), useCaseConfig.getInputFormat()));
        }
        java.util.List<java.util.List<android.util.Size>> allPossibleSizeArrangements = getAllPossibleSizeArrangements(arrayList2);
        java.util.HashMap hashMap8 = new java.util.HashMap();
        java.util.HashMap hashMap9 = new java.util.HashMap();
        java.util.HashMap hashMap10 = new java.util.HashMap();
        java.util.HashMap hashMap11 = new java.util.HashMap();
        boolean containsZslUseCase = androidx.camera.camera2.internal.StreamUseCaseUtil.containsZslUseCase(list, arrayList);
        int maxSupportedFpsFromAttachedSurfaces = getMaxSupportedFpsFromAttachedSurfaces(list);
        java.util.HashMap hashMap12 = hashMap11;
        if (!this.mIsStreamUseCaseSupported || containsZslUseCase) {
            hashMap = hashMap10;
            hashMap2 = hashMap9;
            hashMap3 = hashMap8;
            range = targetFpsRange;
            list2 = useCasesPriorityOrder;
            map2 = resolveAndValidateDynamicRanges;
            i18 = maxSupportedFpsFromAttachedSurfaces;
            str = "No supported surface combination is found for camera device - Id : ";
            str2 = " New configs: ";
            hashMap4 = hashMap12;
            list3 = null;
        } else {
            java.util.Iterator<java.util.List<android.util.Size>> it6 = allPossibleSizeArrangements.iterator();
            java.util.List<androidx.camera.core.impl.SurfaceConfig> list6 = null;
            while (true) {
                if (!it6.hasNext()) {
                    hashMap2 = hashMap9;
                    hashMap3 = hashMap8;
                    range = targetFpsRange;
                    list2 = useCasesPriorityOrder;
                    map2 = resolveAndValidateDynamicRanges;
                    i18 = maxSupportedFpsFromAttachedSurfaces;
                    str = str8;
                    str2 = str7;
                    str5 = str6;
                    hashMap4 = hashMap12;
                    hashMap = hashMap10;
                    break;
                }
                java.util.HashMap hashMap13 = hashMap12;
                java.util.HashMap hashMap14 = hashMap10;
                hashMap2 = hashMap9;
                hashMap3 = hashMap8;
                map2 = resolveAndValidateDynamicRanges;
                android.util.Range<java.lang.Integer> range2 = targetFpsRange;
                java.util.List<java.lang.Integer> list7 = useCasesPriorityOrder;
                range = range2;
                str = str8;
                int i28 = maxSupportedFpsFromAttachedSurfaces;
                i18 = maxSupportedFpsFromAttachedSurfaces;
                str2 = str7;
                list2 = useCasesPriorityOrder;
                str5 = str6;
                list6 = getOrderedSupportedStreamUseCaseSurfaceConfigList(createFeatureSettings, (java.util.List) getSurfaceConfigListAndFpsCeiling(i17, list, it6.next(), arrayList, list7, i28, hashMap14, hashMap13).first);
                hashMap = hashMap14;
                hashMap4 = hashMap13;
                if (list6 != null && !androidx.camera.camera2.internal.StreamUseCaseUtil.areCaptureTypesEligible(hashMap, hashMap4, list6)) {
                    list6 = null;
                }
                if (list6 != null) {
                    if (androidx.camera.camera2.internal.StreamUseCaseUtil.areStreamUseCasesAvailableForSurfaceConfigs(this.mCharacteristics, list6)) {
                        break;
                    }
                    list6 = null;
                }
                hashMap.clear();
                hashMap4.clear();
                hashMap12 = hashMap4;
                hashMap10 = hashMap;
                str6 = str5;
                str8 = str;
                str7 = str2;
                resolveAndValidateDynamicRanges = map2;
                hashMap9 = hashMap2;
                hashMap8 = hashMap3;
                targetFpsRange = range;
                maxSupportedFpsFromAttachedSurfaces = i18;
                useCasesPriorityOrder = list2;
            }
            if (list6 == null && !isUseCasesCombinationSupported) {
                throw new java.lang.IllegalArgumentException(str + this.mCameraId + str5 + list + str2 + arrayList);
            }
            list3 = list6;
        }
        java.util.Iterator<java.util.List<android.util.Size>> it7 = allPossibleSizeArrangements.iterator();
        boolean z19 = false;
        int i29 = Integer.MAX_VALUE;
        int i37 = Integer.MAX_VALUE;
        boolean z27 = false;
        boolean z28 = false;
        java.util.List<android.util.Size> list8 = null;
        java.util.List<android.util.Size> list9 = null;
        while (true) {
            if (!it7.hasNext()) {
                str3 = str;
                str4 = str2;
                hashMap5 = hashMap4;
                hashMap6 = hashMap;
                list4 = list8;
                list5 = list9;
                break;
            }
            java.util.List<android.util.Size> next = it7.next();
            int i38 = i29;
            int i39 = i37;
            str4 = str2;
            hashMap5 = hashMap4;
            str3 = str;
            hashMap6 = hashMap;
            android.util.Pair<java.util.List<androidx.camera.core.impl.SurfaceConfig>, java.lang.Integer> surfaceConfigListAndFpsCeiling = getSurfaceConfigListAndFpsCeiling(i17, list, next, arrayList, list2, i18, null, null);
            java.util.List<androidx.camera.core.impl.SurfaceConfig> list10 = (java.util.List) surfaceConfigListAndFpsCeiling.first;
            i37 = ((java.lang.Integer) surfaceConfigListAndFpsCeiling.second).intValue();
            int i47 = i18;
            boolean z29 = range == null || i47 <= i37 || i37 >= range.getLower().intValue();
            if (z27 || !checkSupported(createFeatureSettings, list10)) {
                i19 = i39;
                i27 = Integer.MAX_VALUE;
            } else {
                i19 = i39;
                i27 = Integer.MAX_VALUE;
                if (i19 == Integer.MAX_VALUE || i19 < i37) {
                    i19 = i37;
                    list8 = next;
                }
                if (z29) {
                    if (z28) {
                        list5 = list9;
                        list4 = next;
                        i29 = i38;
                        break;
                    }
                    i19 = i37;
                    z27 = true;
                    list8 = next;
                }
            }
            if (list3 == null || z28 || getOrderedSupportedStreamUseCaseSurfaceConfigList(createFeatureSettings, list10) == null) {
                i29 = i38;
            } else {
                if (i38 != i27 && i38 >= i37) {
                    i29 = i38;
                } else {
                    i29 = i37;
                    list9 = next;
                }
                if (z29) {
                    i29 = i37;
                    if (z27) {
                        i37 = i19;
                        list4 = list8;
                        list5 = next;
                        break;
                    }
                    z28 = true;
                    list9 = next;
                } else {
                    continue;
                }
            }
            i18 = i47;
            i37 = i19;
            hashMap = hashMap6;
            hashMap4 = hashMap5;
            str = str3;
            str2 = str4;
        }
        if (list4 == null) {
            throw new java.lang.IllegalArgumentException(str3 + this.mCameraId + " and Hardware level: " + this.mHardwareLevel + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + str4 + arrayList);
        }
        android.util.Range<java.lang.Integer> closestSupportedDeviceFrameRate = range != null ? getClosestSupportedDeviceFrameRate(range, i37) : null;
        java.util.Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            androidx.camera.core.impl.UseCaseConfig useCaseConfig2 = (androidx.camera.core.impl.UseCaseConfig) it8.next();
            java.util.List<java.lang.Integer> list11 = list2;
            androidx.camera.core.impl.StreamSpec.Builder builder = androidx.camera.core.impl.StreamSpec.builder(list4.get(list11.indexOf(java.lang.Integer.valueOf(arrayList.indexOf(useCaseConfig2)))));
            java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> map3 = map2;
            java.util.Iterator it9 = it8;
            androidx.camera.core.DynamicRange dynamicRange = map3.get(useCaseConfig2);
            dynamicRange.getClass();
            androidx.camera.core.impl.StreamSpec.Builder zslDisabled = builder.setDynamicRange(dynamicRange).setImplementationOptions(androidx.camera.camera2.internal.StreamUseCaseUtil.getStreamSpecImplementationOptions(useCaseConfig2)).setZslDisabled(z18);
            if (closestSupportedDeviceFrameRate != null) {
                zslDisabled.setExpectedFrameRateRange(closestSupportedDeviceFrameRate);
            }
            hashMap2.put(useCaseConfig2, zslDisabled.build());
            it8 = it9;
            list2 = list11;
            map2 = map3;
            closestSupportedDeviceFrameRate = closestSupportedDeviceFrameRate;
        }
        java.util.HashMap hashMap15 = hashMap2;
        if (list3 != null && i37 == i29 && list4.size() == list5.size()) {
            int i48 = 0;
            while (true) {
                if (i48 >= list4.size()) {
                    break;
                }
                if (!list4.get(i48).equals(list5.get(i48))) {
                    z19 = true;
                    break;
                }
                i48++;
            }
            if (!z19) {
                hashMap7 = hashMap3;
                if (!androidx.camera.camera2.internal.StreamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithInteropOverride(this.mCharacteristics, list, hashMap15, hashMap7)) {
                    androidx.camera.camera2.internal.StreamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs(hashMap15, hashMap7, hashMap6, hashMap5, list3);
                }
                return new android.util.Pair<>(hashMap15, hashMap7);
            }
        }
        hashMap7 = hashMap3;
        return new android.util.Pair<>(hashMap15, hashMap7);
    }

    public androidx.camera.core.impl.SurfaceSizeDefinition getUpdatedSurfaceSizeDefinitionByFormat(int i17) {
        if (!this.mSurfaceSizeDefinitionFormats.contains(java.lang.Integer.valueOf(i17))) {
            updateS720pOrS1440pSizeByFormat(this.mSurfaceSizeDefinition.getS720pSizeMap(), androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_720P, i17);
            updateS720pOrS1440pSizeByFormat(this.mSurfaceSizeDefinition.getS1440pSizeMap(), androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_1440P, i17);
            updateMaximumSizeByFormat(this.mSurfaceSizeDefinition.getMaximumSizeMap(), i17);
            updateUltraMaximumSizeByFormat(this.mSurfaceSizeDefinition.getUltraMaximumSizeMap(), i17);
            this.mSurfaceSizeDefinitionFormats.add(java.lang.Integer.valueOf(i17));
        }
        return this.mSurfaceSizeDefinition;
    }

    public boolean isBurstCaptureSupported() {
        return this.mIsBurstCaptureSupported;
    }

    public boolean isRawSupported() {
        return this.mIsRawSupported;
    }

    public androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int i17, int i18, android.util.Size size) {
        return androidx.camera.core.impl.SurfaceConfig.transformSurfaceConfig(i17, i18, size, getUpdatedSurfaceSizeDefinitionByFormat(i18));
    }
}
