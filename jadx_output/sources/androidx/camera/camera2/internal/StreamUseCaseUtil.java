package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public final class StreamUseCaseUtil {
    public static final androidx.camera.core.impl.Config.Option<java.lang.Long> STREAM_USE_CASE_STREAM_SPEC_OPTION = androidx.camera.core.impl.Config.Option.create("camera2.streamSpec.streamUseCase", java.lang.Long.TYPE);
    private static final java.util.Map<java.lang.Long, java.util.Set<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType>> STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP;
    private static final java.util.Map<java.lang.Long, java.util.Set<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType>> STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP;
    private static final java.lang.String TAG = "StreamUseCaseUtil";

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP = hashMap2;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            java.util.HashSet hashSet = new java.util.HashSet();
            androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW;
            hashSet.add(captureType);
            androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType2 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.METERING_REPEATING;
            hashSet.add(captureType2);
            hashMap.put(4L, hashSet);
            java.util.HashSet hashSet2 = new java.util.HashSet();
            hashSet2.add(captureType);
            hashSet2.add(captureType2);
            hashSet2.add(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS);
            hashMap.put(1L, hashSet2);
            java.util.HashSet hashSet3 = new java.util.HashSet();
            androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType3 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE;
            hashSet3.add(captureType3);
            hashMap.put(2L, hashSet3);
            java.util.HashSet hashSet4 = new java.util.HashSet();
            androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType4 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
            hashSet4.add(captureType4);
            hashMap.put(3L, hashSet4);
            java.util.HashSet hashSet5 = new java.util.HashSet();
            hashSet5.add(captureType);
            hashSet5.add(captureType3);
            hashSet5.add(captureType4);
            hashMap2.put(4L, hashSet5);
            java.util.HashSet hashSet6 = new java.util.HashSet();
            hashSet6.add(captureType);
            hashSet6.add(captureType4);
            hashMap2.put(3L, hashSet6);
        }
    }

    private StreamUseCaseUtil() {
    }

    public static boolean areCaptureTypesEligible(java.util.Map<java.lang.Integer, androidx.camera.core.impl.AttachedSurfaceInfo> map, java.util.Map<java.lang.Integer, androidx.camera.core.impl.UseCaseConfig<?>> map2, java.util.List<androidx.camera.core.impl.SurfaceConfig> list) {
        for (int i17 = 0; i17 < list.size(); i17++) {
            long streamUseCase = list.get(i17).getStreamUseCase();
            if (map.containsKey(java.lang.Integer.valueOf(i17))) {
                androidx.camera.core.impl.AttachedSurfaceInfo attachedSurfaceInfo = map.get(java.lang.Integer.valueOf(i17));
                if (!isEligibleCaptureType(attachedSurfaceInfo.getCaptureTypes().size() == 1 ? attachedSurfaceInfo.getCaptureTypes().get(0) : androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING, streamUseCase, attachedSurfaceInfo.getCaptureTypes())) {
                    return false;
                }
            } else {
                if (!map2.containsKey(java.lang.Integer.valueOf(i17))) {
                    throw new java.lang.AssertionError("SurfaceConfig does not map to any use case");
                }
                androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig = map2.get(java.lang.Integer.valueOf(i17));
                if (!isEligibleCaptureType(useCaseConfig.getCaptureType(), streamUseCase, useCaseConfig.getCaptureType() == androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING ? ((androidx.camera.core.streamsharing.StreamSharingConfig) useCaseConfig).getCaptureTypes() : java.util.Collections.emptyList())) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean areStreamUseCasesAvailable(java.util.Set<java.lang.Long> set, java.util.Set<java.lang.Long> set2) {
        java.util.Iterator<java.lang.Long> it = set2.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean areStreamUseCasesAvailableForSurfaceConfigs(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat, java.util.List<androidx.camera.core.impl.SurfaceConfig> list) {
        long[] jArr;
        if (android.os.Build.VERSION.SDK_INT < 33 || (jArr = (long[]) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (long j17 : jArr) {
            hashSet.add(java.lang.Long.valueOf(j17));
        }
        java.util.Iterator<androidx.camera.core.impl.SurfaceConfig> it = list.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(java.lang.Long.valueOf(it.next().getStreamUseCase()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsZslUseCase(java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> list, java.util.List<androidx.camera.core.impl.UseCaseConfig<?>> list2) {
        for (androidx.camera.core.impl.AttachedSurfaceInfo attachedSurfaceInfo : list) {
            if (isZslUseCase(attachedSurfaceInfo.getImplementationOptions(), attachedSurfaceInfo.getCaptureTypes().get(0))) {
                return true;
            }
        }
        for (androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig : list2) {
            if (isZslUseCase(useCaseConfig, useCaseConfig.getCaptureType())) {
                return true;
            }
        }
        return false;
    }

    public static androidx.camera.camera2.impl.Camera2ImplConfig getStreamSpecImplementationOptions(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig) {
        androidx.camera.core.impl.MutableOptionsBundle create = androidx.camera.core.impl.MutableOptionsBundle.create();
        androidx.camera.core.impl.Config.Option<?> option = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION;
        if (useCaseConfig.containsOption(option)) {
            create.insertOption(option, (java.lang.Long) useCaseConfig.retrieveOption(option));
        }
        androidx.camera.core.impl.Config.Option<?> option2 = androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED;
        if (useCaseConfig.containsOption(option2)) {
            create.insertOption(option2, (java.lang.Boolean) useCaseConfig.retrieveOption(option2));
        }
        androidx.camera.core.impl.Config.Option<?> option3 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE;
        if (useCaseConfig.containsOption(option3)) {
            create.insertOption(option3, (java.lang.Integer) useCaseConfig.retrieveOption(option3));
        }
        androidx.camera.core.impl.Config.Option<?> option4 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT;
        if (useCaseConfig.containsOption(option4)) {
            create.insertOption(option4, (java.lang.Integer) useCaseConfig.retrieveOption(option4));
        }
        return new androidx.camera.camera2.impl.Camera2ImplConfig(create);
    }

    private static androidx.camera.core.impl.Config getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(androidx.camera.core.impl.Config config, long j17) {
        androidx.camera.core.impl.Config.Option<java.lang.Long> option = STREAM_USE_CASE_STREAM_SPEC_OPTION;
        if (config.containsOption(option) && ((java.lang.Long) config.retrieveOption(option)).longValue() == j17) {
            return null;
        }
        androidx.camera.core.impl.MutableOptionsBundle from = androidx.camera.core.impl.MutableOptionsBundle.from(config);
        from.insertOption(option, java.lang.Long.valueOf(j17));
        return new androidx.camera.camera2.impl.Camera2ImplConfig(from);
    }

    private static boolean isEligibleCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType, long j17, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list) {
        if (android.os.Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (captureType != androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
            java.util.Map<java.lang.Long, java.util.Set<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType>> map = STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP;
            return map.containsKey(java.lang.Long.valueOf(j17)) && map.get(java.lang.Long.valueOf(j17)).contains(captureType);
        }
        java.util.Map<java.lang.Long, java.util.Set<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType>> map2 = STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP;
        if (!map2.containsKey(java.lang.Long.valueOf(j17))) {
            return false;
        }
        java.util.Set<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> set = map2.get(java.lang.Long.valueOf(j17));
        if (list.size() != set.size()) {
            return false;
        }
        java.util.Iterator<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean isStreamUseCaseSupported(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        long[] jArr;
        return (android.os.Build.VERSION.SDK_INT < 33 || (jArr = (long[]) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    private static boolean isValidCamera2InteropOverride(java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> list, java.util.List<androidx.camera.core.impl.UseCaseConfig<?>> list2, java.util.Set<java.lang.Long> set) {
        boolean z17;
        boolean z18;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<androidx.camera.core.impl.AttachedSurfaceInfo> it = list.iterator();
        if (it.hasNext()) {
            androidx.camera.core.impl.AttachedSurfaceInfo next = it.next();
            androidx.camera.core.impl.Config implementationOptions = next.getImplementationOptions();
            androidx.camera.core.impl.Config.Option<java.lang.Long> option = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION;
            if (implementationOptions.containsOption(option) && ((java.lang.Long) next.getImplementationOptions().retrieveOption(option)).longValue() != 0) {
                z17 = true;
                z18 = false;
            } else {
                z18 = true;
                z17 = false;
            }
        } else {
            z17 = false;
            z18 = false;
        }
        for (androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig : list2) {
            androidx.camera.core.impl.Config.Option<?> option2 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION;
            if (useCaseConfig.containsOption(option2)) {
                long longValue = ((java.lang.Long) useCaseConfig.retrieveOption(option2)).longValue();
                if (longValue != 0) {
                    if (z18) {
                        throwInvalidCamera2InteropOverrideException();
                    }
                    hashSet.add(java.lang.Long.valueOf(longValue));
                    z17 = true;
                } else if (z17) {
                    throwInvalidCamera2InteropOverrideException();
                }
            } else if (z17) {
                throwInvalidCamera2InteropOverrideException();
            }
            z18 = true;
        }
        return !z18 && areStreamUseCasesAvailable(set, hashSet);
    }

    private static boolean isZslUseCase(androidx.camera.core.impl.Config config, androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType) {
        if (((java.lang.Boolean) config.retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED, java.lang.Boolean.FALSE)).booleanValue()) {
            return false;
        }
        androidx.camera.core.impl.Config.Option<java.lang.Integer> option = androidx.camera.core.impl.ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE;
        return config.containsOption(option) && androidx.camera.camera2.internal.TemplateTypeUtil.getSessionConfigTemplateType(captureType, ((java.lang.Integer) config.retrieveOption(option)).intValue()) == 5;
    }

    public static boolean populateStreamUseCaseStreamSpecOptionWithInteropOverride(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat, java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> list, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec> map, java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec> map2) {
        if (android.os.Build.VERSION.SDK_INT < 33) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.keySet());
        java.util.Iterator<androidx.camera.core.impl.AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().getImplementationOptions().getClass();
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            androidx.camera.core.impl.StreamSpec streamSpec = map.get((androidx.camera.core.impl.UseCaseConfig) it6.next());
            streamSpec.getClass();
            streamSpec.getImplementationOptions().getClass();
        }
        long[] jArr = (long[]) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null && jArr.length != 0) {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (long j17 : jArr) {
                hashSet.add(java.lang.Long.valueOf(j17));
            }
            if (isValidCamera2InteropOverride(list, arrayList, hashSet)) {
                for (androidx.camera.core.impl.AttachedSurfaceInfo attachedSurfaceInfo : list) {
                    androidx.camera.core.impl.Config implementationOptions = attachedSurfaceInfo.getImplementationOptions();
                    androidx.camera.core.impl.Config updatedImplementationOptionsWithUseCaseStreamSpecOption = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(implementationOptions, ((java.lang.Long) implementationOptions.retrieveOption(androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION)).longValue());
                    if (updatedImplementationOptionsWithUseCaseStreamSpecOption != null) {
                        map2.put(attachedSurfaceInfo, attachedSurfaceInfo.toStreamSpec(updatedImplementationOptionsWithUseCaseStreamSpecOption));
                    }
                }
                java.util.Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig = (androidx.camera.core.impl.UseCaseConfig) it7.next();
                    androidx.camera.core.impl.StreamSpec streamSpec2 = map.get(useCaseConfig);
                    androidx.camera.core.impl.Config implementationOptions2 = streamSpec2.getImplementationOptions();
                    androidx.camera.core.impl.Config updatedImplementationOptionsWithUseCaseStreamSpecOption2 = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(implementationOptions2, ((java.lang.Long) implementationOptions2.retrieveOption(androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION)).longValue());
                    if (updatedImplementationOptionsWithUseCaseStreamSpecOption2 != null) {
                        map.put(useCaseConfig, streamSpec2.toBuilder().setImplementationOptions(updatedImplementationOptionsWithUseCaseStreamSpecOption2).build());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs(java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec> map, java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec> map2, java.util.Map<java.lang.Integer, androidx.camera.core.impl.AttachedSurfaceInfo> map3, java.util.Map<java.lang.Integer, androidx.camera.core.impl.UseCaseConfig<?>> map4, java.util.List<androidx.camera.core.impl.SurfaceConfig> list) {
        for (int i17 = 0; i17 < list.size(); i17++) {
            long streamUseCase = list.get(i17).getStreamUseCase();
            if (map3.containsKey(java.lang.Integer.valueOf(i17))) {
                androidx.camera.core.impl.AttachedSurfaceInfo attachedSurfaceInfo = map3.get(java.lang.Integer.valueOf(i17));
                androidx.camera.core.impl.Config updatedImplementationOptionsWithUseCaseStreamSpecOption = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(attachedSurfaceInfo.getImplementationOptions(), streamUseCase);
                if (updatedImplementationOptionsWithUseCaseStreamSpecOption != null) {
                    map2.put(attachedSurfaceInfo, attachedSurfaceInfo.toStreamSpec(updatedImplementationOptionsWithUseCaseStreamSpecOption));
                }
            } else {
                if (!map4.containsKey(java.lang.Integer.valueOf(i17))) {
                    throw new java.lang.AssertionError("SurfaceConfig does not map to any use case");
                }
                androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig = map4.get(java.lang.Integer.valueOf(i17));
                androidx.camera.core.impl.StreamSpec streamSpec = map.get(useCaseConfig);
                androidx.camera.core.impl.Config updatedImplementationOptionsWithUseCaseStreamSpecOption2 = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(streamSpec.getImplementationOptions(), streamUseCase);
                if (updatedImplementationOptionsWithUseCaseStreamSpecOption2 != null) {
                    map.put(useCaseConfig, streamSpec.toBuilder().setImplementationOptions(updatedImplementationOptionsWithUseCaseStreamSpecOption2).build());
                }
            }
        }
    }

    public static void populateSurfaceToStreamUseCaseMapping(java.util.Collection<androidx.camera.core.impl.SessionConfig> collection, java.util.Collection<androidx.camera.core.impl.UseCaseConfig<?>> collection2, java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> map) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList(collection2);
        java.util.Iterator<androidx.camera.core.impl.SessionConfig> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            androidx.camera.core.impl.SessionConfig next = it.next();
            androidx.camera.core.impl.Config implementationOptions = next.getImplementationOptions();
            androidx.camera.core.impl.Config.Option<java.lang.Long> option = STREAM_USE_CASE_STREAM_SPEC_OPTION;
            if (!implementationOptions.containsOption(option) || next.getSurfaces().size() == 1) {
                if (next.getImplementationOptions().containsOption(option)) {
                    z17 = true;
                    break;
                }
            } else {
                androidx.camera.core.Logger.e(TAG, java.lang.String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", java.lang.Integer.valueOf(next.getSurfaces().size())));
                return;
            }
        }
        if (z17) {
            int i17 = 0;
            for (androidx.camera.core.impl.SessionConfig sessionConfig : collection) {
                if (((androidx.camera.core.impl.UseCaseConfig) arrayList.get(i17)).getCaptureType() == androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.METERING_REPEATING) {
                    m3.h.e(!sessionConfig.getSurfaces().isEmpty(), "MeteringRepeating should contain a surface");
                    map.put(sessionConfig.getSurfaces().get(0), 1L);
                } else {
                    androidx.camera.core.impl.Config implementationOptions2 = sessionConfig.getImplementationOptions();
                    androidx.camera.core.impl.Config.Option<java.lang.Long> option2 = STREAM_USE_CASE_STREAM_SPEC_OPTION;
                    if (implementationOptions2.containsOption(option2) && !sessionConfig.getSurfaces().isEmpty()) {
                        map.put(sessionConfig.getSurfaces().get(0), (java.lang.Long) sessionConfig.getImplementationOptions().retrieveOption(option2));
                    }
                }
                i17++;
            }
        }
    }

    public static boolean shouldUseStreamUseCase(androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings featureSettings) {
        return featureSettings.getCameraMode() == 0 && featureSettings.getRequiredMaxBitDepth() == 8;
    }

    private static void throwInvalidCamera2InteropOverrideException() {
        throw new java.lang.IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }
}
