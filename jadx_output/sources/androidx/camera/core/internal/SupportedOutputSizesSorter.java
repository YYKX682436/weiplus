package androidx.camera.core.internal;

/* loaded from: classes14.dex */
public class SupportedOutputSizesSorter {
    private static final java.lang.String TAG = "SupportedOutputSizesCollector";
    private final androidx.camera.core.impl.CameraInfoInternal mCameraInfoInternal;
    private final android.util.Rational mFullFovRatio;
    private final int mLensFacing;
    private final int mSensorOrientation;
    private final androidx.camera.core.internal.SupportedOutputSizesSorterLegacy mSupportedOutputSizesSorterLegacy;

    public SupportedOutputSizesSorter(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, android.util.Size size) {
        this.mCameraInfoInternal = cameraInfoInternal;
        this.mSensorOrientation = cameraInfoInternal.getSensorRotationDegrees();
        this.mLensFacing = cameraInfoInternal.getLensFacing();
        android.util.Rational calculateFullFovRatioFromActiveArraySize = size != null ? calculateFullFovRatioFromActiveArraySize(size) : calculateFullFovRatioFromSupportedOutputSizes(cameraInfoInternal);
        this.mFullFovRatio = calculateFullFovRatioFromActiveArraySize;
        this.mSupportedOutputSizesSorterLegacy = new androidx.camera.core.internal.SupportedOutputSizesSorterLegacy(cameraInfoInternal, calculateFullFovRatioFromActiveArraySize);
    }

    private static java.util.LinkedHashMap<android.util.Rational, java.util.List<android.util.Size>> applyAspectRatioStrategy(java.util.List<android.util.Size> list, androidx.camera.core.resolutionselector.AspectRatioStrategy aspectRatioStrategy, android.util.Rational rational) {
        return applyAspectRatioStrategyFallbackRule(groupSizesByAspectRatio(list), aspectRatioStrategy, rational);
    }

    private static java.util.LinkedHashMap<android.util.Rational, java.util.List<android.util.Size>> applyAspectRatioStrategyFallbackRule(java.util.Map<android.util.Rational, java.util.List<android.util.Size>> map, androidx.camera.core.resolutionselector.AspectRatioStrategy aspectRatioStrategy, android.util.Rational rational) {
        boolean z17 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z17 = false;
        }
        android.util.Rational targetAspectRatioRationalValue = getTargetAspectRatioRationalValue(aspectRatioStrategy.getPreferredAspectRatio(), z17);
        if (aspectRatioStrategy.getFallbackRule() == 0) {
            android.util.Rational targetAspectRatioRationalValue2 = getTargetAspectRatioRationalValue(aspectRatioStrategy.getPreferredAspectRatio(), z17);
            java.util.Iterator it = new java.util.ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                android.util.Rational rational2 = (android.util.Rational) it.next();
                if (!rational2.equals(targetAspectRatioRationalValue2)) {
                    map.remove(rational2);
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.keySet());
        java.util.Collections.sort(arrayList, new androidx.camera.core.impl.utils.AspectRatioUtil.CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(targetAspectRatioRationalValue, rational));
        java.util.LinkedHashMap<android.util.Rational, java.util.List<android.util.Size>> linkedHashMap = new java.util.LinkedHashMap<>();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            android.util.Rational rational3 = (android.util.Rational) it6.next();
            linkedHashMap.put(rational3, map.get(rational3));
        }
        return linkedHashMap;
    }

    private java.util.List<android.util.Size> applyHighResolutionSettings(java.util.List<android.util.Size> list, androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector, int i17) {
        if (resolutionSelector.getAllowedResolutionMode() != 1) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.mCameraInfoInternal.getSupportedHighResolutions(i17));
        java.util.Collections.sort(arrayList, new androidx.camera.core.impl.utils.CompareSizesByArea(true));
        return arrayList;
    }

    private static void applyMaxResolutionRestriction(java.util.LinkedHashMap<android.util.Rational, java.util.List<android.util.Size>> linkedHashMap, android.util.Size size) {
        int area = androidx.camera.core.internal.utils.SizeUtil.getArea(size);
        java.util.Iterator<android.util.Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            java.util.List<android.util.Size> list = linkedHashMap.get(it.next());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.util.Size size2 : list) {
                if (androidx.camera.core.internal.utils.SizeUtil.getArea(size2) <= area) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    private static java.util.List<android.util.Size> applyResolutionFilter(java.util.List<android.util.Size> list, androidx.camera.core.resolutionselector.ResolutionFilter resolutionFilter, int i17, int i18, int i19) {
        if (resolutionFilter == null) {
            return list;
        }
        java.util.List<android.util.Size> filter = resolutionFilter.filter(new java.util.ArrayList(list), androidx.camera.core.impl.utils.CameraOrientationUtil.getRelativeImageRotation(androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(i17), i18, i19 == 1));
        if (list.containsAll(filter)) {
            return filter;
        }
        throw new java.lang.IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    private static void applyResolutionStrategy(java.util.LinkedHashMap<android.util.Rational, java.util.List<android.util.Size>> linkedHashMap, androidx.camera.core.resolutionselector.ResolutionStrategy resolutionStrategy) {
        if (resolutionStrategy == null) {
            return;
        }
        java.util.Iterator<android.util.Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            applyResolutionStrategyFallbackRule(linkedHashMap.get(it.next()), resolutionStrategy);
        }
    }

    private static void applyResolutionStrategyFallbackRule(java.util.List<android.util.Size> list, androidx.camera.core.resolutionselector.ResolutionStrategy resolutionStrategy) {
        if (list.isEmpty()) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(resolutionStrategy.getFallbackRule());
        if (resolutionStrategy.equals(androidx.camera.core.resolutionselector.ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY)) {
            return;
        }
        android.util.Size boundSize = resolutionStrategy.getBoundSize();
        int intValue = valueOf.intValue();
        if (intValue == 0) {
            sortSupportedSizesByFallbackRuleNone(list, boundSize);
            return;
        }
        if (intValue == 1) {
            sortSupportedSizesByFallbackRuleClosestHigherThenLower(list, boundSize, true);
            return;
        }
        if (intValue == 2) {
            sortSupportedSizesByFallbackRuleClosestHigherThenLower(list, boundSize, false);
        } else if (intValue == 3) {
            sortSupportedSizesByFallbackRuleClosestLowerThenHigher(list, boundSize, true);
        } else {
            if (intValue != 4) {
                return;
            }
            sortSupportedSizesByFallbackRuleClosestLowerThenHigher(list, boundSize, false);
        }
    }

    private android.util.Rational calculateFullFovRatioFromActiveArraySize(android.util.Size size) {
        return new android.util.Rational(size.getWidth(), size.getHeight());
    }

    private android.util.Rational calculateFullFovRatioFromSupportedOutputSizes(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal) {
        java.util.List<android.util.Size> supportedResolutions = cameraInfoInternal.getSupportedResolutions(256);
        if (supportedResolutions.isEmpty()) {
            return null;
        }
        android.util.Size size = (android.util.Size) java.util.Collections.max(supportedResolutions, new androidx.camera.core.impl.utils.CompareSizesByArea());
        return new android.util.Rational(size.getWidth(), size.getHeight());
    }

    private java.util.List<android.util.Size> getResolutionCandidateList(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list, int i17) {
        java.util.List<android.util.Size> sizeListByFormat = getSizeListByFormat(list, i17);
        if (sizeListByFormat == null) {
            sizeListByFormat = this.mCameraInfoInternal.getSupportedResolutions(i17);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(sizeListByFormat);
        java.util.Collections.sort(arrayList, new androidx.camera.core.impl.utils.CompareSizesByArea(true));
        if (arrayList.isEmpty()) {
            androidx.camera.core.Logger.w(TAG, "The retrieved supported resolutions from camera info internal is empty. Format is " + i17 + ".");
        }
        return arrayList;
    }

    public static java.util.List<android.util.Rational> getResolutionListGroupingAspectRatioKeys(java.util.List<android.util.Size> list) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3);
        arrayList.add(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9);
        for (android.util.Size size : list) {
            android.util.Rational rational = new android.util.Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, (android.util.Rational) it.next())) {
                        z17 = true;
                        break;
                    }
                }
                if (!z17) {
                    arrayList.add(rational);
                }
            }
        }
        return arrayList;
    }

    private java.util.List<android.util.Size> getSizeListByFormat(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list, int i17) {
        android.util.Size[] sizeArr;
        if (list != null) {
            for (android.util.Pair<java.lang.Integer, android.util.Size[]> pair : list) {
                if (((java.lang.Integer) pair.first).intValue() == i17) {
                    sizeArr = (android.util.Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        if (sizeArr == null) {
            return null;
        }
        return java.util.Arrays.asList(sizeArr);
    }

    public static android.util.Rational getTargetAspectRatioRationalValue(int i17, boolean z17) {
        if (i17 != -1) {
            if (i17 == 0) {
                return z17 ? androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3 : androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_3_4;
            }
            if (i17 == 1) {
                return z17 ? androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9 : androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_9_16;
            }
            androidx.camera.core.Logger.e(TAG, "Undefined target aspect ratio: " + i17);
        }
        return null;
    }

    public static java.util.Map<android.util.Rational, java.util.List<android.util.Size>> groupSizesByAspectRatio(java.util.List<android.util.Size> list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<android.util.Rational> it = getResolutionListGroupingAspectRatioKeys(list).iterator();
        while (it.hasNext()) {
            hashMap.put(it.next(), new java.util.ArrayList());
        }
        for (android.util.Size size : list) {
            for (android.util.Rational rational : hashMap.keySet()) {
                if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    ((java.util.List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    public static java.util.List<android.util.Size> sortSupportedOutputSizesByResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector, java.util.List<android.util.Size> list, android.util.Size size, int i17, android.util.Rational rational, int i18, int i19) {
        java.util.LinkedHashMap<android.util.Rational, java.util.List<android.util.Size>> applyAspectRatioStrategy = applyAspectRatioStrategy(list, resolutionSelector.getAspectRatioStrategy(), rational);
        if (size != null) {
            applyMaxResolutionRestriction(applyAspectRatioStrategy, size);
        }
        applyResolutionStrategy(applyAspectRatioStrategy, resolutionSelector.getResolutionStrategy());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.List<android.util.Size>> it = applyAspectRatioStrategy.values().iterator();
        while (it.hasNext()) {
            for (android.util.Size size2 : it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return applyResolutionFilter(arrayList, resolutionSelector.getResolutionFilter(), i17, i18, i19);
    }

    public static void sortSupportedSizesByFallbackRuleClosestHigherThenLower(java.util.List<android.util.Size> list, android.util.Size size, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            android.util.Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        java.util.Collections.reverse(list);
        if (z17) {
            list.addAll(arrayList);
        }
    }

    private static void sortSupportedSizesByFallbackRuleClosestLowerThenHigher(java.util.List<android.util.Size> list, android.util.Size size, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            android.util.Size size2 = list.get(i17);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z17) {
            list.addAll(arrayList);
        }
    }

    private static void sortSupportedSizesByFallbackRuleNone(java.util.List<android.util.Size> list, android.util.Size size) {
        boolean contains = list.contains(size);
        list.clear();
        if (contains) {
            list.add(size);
        }
    }

    public java.util.List<android.util.Size> getSortedSupportedOutputSizes(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig) {
        androidx.camera.core.impl.ImageOutputConfig imageOutputConfig = (androidx.camera.core.impl.ImageOutputConfig) useCaseConfig;
        java.util.List<android.util.Size> customOrderedResolutions = imageOutputConfig.getCustomOrderedResolutions(null);
        if (customOrderedResolutions != null) {
            return customOrderedResolutions;
        }
        androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector = imageOutputConfig.getResolutionSelector(null);
        java.util.List<android.util.Size> resolutionCandidateList = getResolutionCandidateList(imageOutputConfig.getSupportedResolutions(null), useCaseConfig.getInputFormat());
        if (resolutionSelector == null) {
            return this.mSupportedOutputSizesSorterLegacy.sortSupportedOutputSizes(resolutionCandidateList, useCaseConfig);
        }
        android.util.Size maxResolution = ((androidx.camera.core.impl.ImageOutputConfig) useCaseConfig).getMaxResolution(null);
        int targetRotation = imageOutputConfig.getTargetRotation(0);
        if (!useCaseConfig.isHighResolutionDisabled(false)) {
            resolutionCandidateList = applyHighResolutionSettings(resolutionCandidateList, resolutionSelector, useCaseConfig.getInputFormat());
        }
        return sortSupportedOutputSizesByResolutionSelector(imageOutputConfig.getResolutionSelector(), resolutionCandidateList, maxResolution, targetRotation, this.mFullFovRatio, this.mSensorOrientation, this.mLensFacing);
    }
}
