package androidx.camera.core.streamsharing;

/* loaded from: classes14.dex */
public class ResolutionsMerger {
    private static final double SAME_AREA_WIDTH_HEIGHT_RATIO = java.lang.Math.sqrt(2.3703703703703702d);
    private static final java.lang.String TAG = "ResolutionsMerger";
    private final androidx.camera.core.impl.CameraInfoInternal mCameraInfo;
    private final java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> mChildSizesCache;
    private final java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> mChildrenConfigs;
    private final android.util.Rational mFallbackAspectRatio;
    private final android.util.Rational mSensorAspectRatio;
    private final android.util.Size mSensorSize;
    private final androidx.camera.core.internal.SupportedOutputSizesSorter mSizeSorter;

    /* loaded from: classes14.dex */
    public static class CompareAspectRatioByOverlappingAreaToReference implements java.util.Comparator<android.util.Rational> {
        private final android.util.Rational mReferenceAspectRatio;
        private final boolean mReverse;

        public CompareAspectRatioByOverlappingAreaToReference(android.util.Rational rational, boolean z17) {
            this.mReferenceAspectRatio = rational;
            this.mReverse = z17;
        }

        @Override // java.util.Comparator
        public int compare(android.util.Rational rational, android.util.Rational rational2) {
            float computeAreaOverlapping = androidx.camera.core.streamsharing.ResolutionsMerger.computeAreaOverlapping(rational, this.mReferenceAspectRatio);
            float computeAreaOverlapping2 = androidx.camera.core.streamsharing.ResolutionsMerger.computeAreaOverlapping(rational2, this.mReferenceAspectRatio);
            if (this.mReverse) {
                return java.lang.Float.compare(computeAreaOverlapping2, computeAreaOverlapping);
            }
            return java.lang.Float.compare(computeAreaOverlapping, computeAreaOverlapping2);
        }
    }

    public ResolutionsMerger(androidx.camera.core.impl.CameraInternal cameraInternal, java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> set) {
        this(androidx.camera.core.impl.utils.TransformUtils.rectToSize(cameraInternal.getCameraControlInternal().getSensorRect()), cameraInternal.getCameraInfoInternal(), set);
    }

    private boolean areCroppingInDifferentDirection(float f17, float f18, float f19) {
        if (f17 == f18 || f18 == f19) {
            return false;
        }
        return f17 > f18 ? f18 < f19 : f18 > f19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float computeAreaOverlapping(android.util.Rational rational, android.util.Rational rational2) {
        float floatValue = rational.floatValue();
        float floatValue2 = rational2.floatValue();
        return floatValue > floatValue2 ? floatValue2 / floatValue : floatValue / floatValue2;
    }

    private java.util.List<android.util.Size> filterOutChildSizesCausingDoubleCropping(android.util.Rational rational, java.util.List<android.util.Size> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : list) {
            if (!isDoubleCropping(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private static java.util.List<android.util.Size> filterOutChildSizesThatWillNeverBeSelected(java.util.List<android.util.Size> list) {
        android.util.Rational rational;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : list) {
            java.util.Iterator it = hashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rational = null;
                    break;
                }
                rational = (android.util.Rational) it.next();
                if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    break;
                }
            }
            if (rational != null) {
                android.util.Size size2 = (android.util.Size) hashMap.get(rational);
                java.util.Objects.requireNonNull(size2);
                if (size.getHeight() <= size2.getHeight()) {
                    if (size.getWidth() <= size2.getWidth()) {
                        if (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight()) {
                        }
                    }
                }
            } else {
                rational = toRational(size);
            }
            arrayList.add(size);
            hashMap.put(rational, size);
        }
        return arrayList;
    }

    public static java.util.List<android.util.Size> filterOutParentSizeThatIsTooSmall(java.util.Collection<android.util.Size> collection, java.util.List<android.util.Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : list) {
            if (isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent(collection, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public static java.util.List<android.util.Size> filterResolutionsByAspectRatio(android.util.Rational rational, java.util.List<android.util.Size> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : list) {
            if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private static android.util.Rational findCloserAspectRatio(android.util.Size size) {
        return ((double) size.getWidth()) / ((double) size.getHeight()) > SAME_AREA_WIDTH_HEIGHT_RATIO ? androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9 : androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3;
    }

    private java.util.List<android.util.Size> getCameraSupportedHighResolutions() {
        return this.mCameraInfo.getSupportedHighResolutions(34);
    }

    private java.util.List<android.util.Size> getCameraSupportedResolutions() {
        return this.mCameraInfo.getSupportedResolutions(34);
    }

    private static android.graphics.Rect getCenterCroppedRectangle(android.util.Rational rational, android.util.Size size) {
        android.graphics.RectF rectF;
        android.graphics.RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        android.util.Rational rational2 = toRational(size);
        if (rational.floatValue() == rational2.floatValue()) {
            rectF2 = new android.graphics.RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > rational2.floatValue()) {
                float f17 = width;
                float floatValue = f17 / rational.floatValue();
                float f18 = (height - floatValue) / 2.0f;
                rectF = new android.graphics.RectF(0.0f, f18, f17, floatValue + f18);
            } else {
                float f19 = height;
                float floatValue2 = rational.floatValue() * f19;
                float f27 = (width - floatValue2) / 2.0f;
                rectF = new android.graphics.RectF(f27, 0.0f, floatValue2 + f27, f19);
            }
            rectF2 = rectF;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF2.round(rect);
        return rect;
    }

    private java.util.Set<android.util.Size> getChildrenRequiredResolutions() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<androidx.camera.core.impl.UseCaseConfig<?>> it = this.mChildrenConfigs.iterator();
        while (it.hasNext()) {
            hashSet.addAll(getSortedChildSizes(it.next()));
        }
        return hashSet;
    }

    public static android.graphics.Rect getCropRectOfReferenceAspectRatio(android.util.Size size, android.util.Size size2) {
        return getCenterCroppedRectangle(toRational(size2), size);
    }

    private static android.util.Rational getFallbackAspectRatio(android.util.Rational rational) {
        android.util.Rational rational2 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3;
        if (rational.equals(rational2)) {
            return androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9;
        }
        if (rational.equals(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9)) {
            return rational2;
        }
        throw new java.lang.IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    public static java.util.List<android.util.Size> getParentSizesThatAreTooLarge(java.util.Collection<android.util.Size> collection, java.util.List<android.util.Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new java.util.ArrayList();
        }
        java.util.List<android.util.Size> removeDuplicates = removeDuplicates(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : removeDuplicates) {
            if (isAllChildSizesCanBeCroppedOutWithoutUpscalingParent(collection, size)) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    private android.util.Pair<android.graphics.Rect, android.util.Size> getPreferredChildSizePairInternal(android.graphics.Rect rect, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, boolean z17) {
        android.util.Size preferredChildSize;
        if (z17) {
            preferredChildSize = getPreferredChildSizeForViewport(androidx.camera.core.impl.utils.TransformUtils.rectToSize(rect), useCaseConfig);
        } else {
            android.util.Size rectToSize = androidx.camera.core.impl.utils.TransformUtils.rectToSize(rect);
            preferredChildSize = getPreferredChildSize(rectToSize, useCaseConfig);
            rect = getCropRectOfReferenceAspectRatio(rectToSize, preferredChildSize);
        }
        return new android.util.Pair<>(rect, preferredChildSize);
    }

    private static android.util.Rational getSensorAspectRatio(android.util.Size size) {
        android.util.Rational findCloserAspectRatio = findCloserAspectRatio(size);
        androidx.camera.core.Logger.d(TAG, "The closer aspect ratio to the sensor size (" + size + ") is " + findCloserAspectRatio + ".");
        return findCloserAspectRatio;
    }

    private java.util.List<android.util.Size> getSortedChildSizes(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig) {
        if (!this.mChildrenConfigs.contains(useCaseConfig)) {
            throw new java.lang.IllegalArgumentException("Invalid child config: " + useCaseConfig);
        }
        if (this.mChildSizesCache.containsKey(useCaseConfig)) {
            java.util.List<android.util.Size> list = this.mChildSizesCache.get(useCaseConfig);
            java.util.Objects.requireNonNull(list);
            return list;
        }
        java.util.List<android.util.Size> filterOutChildSizesThatWillNeverBeSelected = filterOutChildSizesThatWillNeverBeSelected(this.mSizeSorter.getSortedSupportedOutputSizes(useCaseConfig));
        this.mChildSizesCache.put(useCaseConfig, filterOutChildSizesThatWillNeverBeSelected);
        return filterOutChildSizesThatWillNeverBeSelected;
    }

    private static java.util.List<android.util.Size> getSupportedPrivResolutions(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list) {
        for (android.util.Pair<java.lang.Integer, android.util.Size[]> pair : list) {
            if (((java.lang.Integer) pair.first).equals(34)) {
                return java.util.Arrays.asList((android.util.Size[]) pair.second);
            }
        }
        return new java.util.ArrayList();
    }

    private java.util.Map<android.util.Rational, java.util.List<android.util.Size>> groupSizesByAspectRatio(java.util.List<android.util.Size> list) {
        java.util.List list2;
        java.util.HashMap hashMap = new java.util.HashMap();
        android.util.Rational rational = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3;
        hashMap.put(rational, new java.util.ArrayList());
        android.util.Rational rational2 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9;
        hashMap.put(rational2, new java.util.ArrayList());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rational);
        arrayList.add(rational2);
        for (android.util.Size size : list) {
            if (size.getHeight() > 0) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        list2 = null;
                        break;
                    }
                    android.util.Rational rational3 = (android.util.Rational) it.next();
                    if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational3)) {
                        list2 = (java.util.List) hashMap.get(rational3);
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new java.util.ArrayList();
                    android.util.Rational rational4 = toRational(size);
                    arrayList.add(rational4);
                    hashMap.put(rational4, list2);
                }
                list2.add(size);
            }
        }
        return hashMap;
    }

    public static boolean hasUpscaling(android.util.Size size, android.util.Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    private static boolean isAllChildSizesCanBeCroppedOutWithoutUpscalingParent(java.util.Collection<android.util.Size> collection, android.util.Size size) {
        java.util.Iterator<android.util.Size> it = collection.iterator();
        while (it.hasNext()) {
            if (hasUpscaling(it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent(java.util.Collection<android.util.Size> collection, android.util.Size size) {
        java.util.Iterator<android.util.Size> it = collection.iterator();
        while (it.hasNext()) {
            if (!hasUpscaling(it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    private boolean isDoubleCropping(android.util.Rational rational, android.util.Size size) {
        if (this.mSensorAspectRatio.equals(rational) || androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
            return false;
        }
        return areCroppingInDifferentDirection(this.mSensorAspectRatio.floatValue(), rational.floatValue(), toRationalWithMod16Considered(size).floatValue());
    }

    private boolean needToAddSensorResolutions() {
        java.util.Iterator<android.util.Size> it = getChildrenRequiredResolutions().iterator();
        while (it.hasNext()) {
            if (!androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(it.next(), this.mFallbackAspectRatio)) {
                return true;
            }
        }
        return false;
    }

    private static java.util.List<android.util.Size> removeDuplicates(java.util.List<android.util.Size> list) {
        return list.isEmpty() ? list : new java.util.ArrayList(new java.util.LinkedHashSet(list));
    }

    public static android.graphics.Rect reverseRect(android.graphics.Rect rect) {
        return new android.graphics.Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    private java.util.List<android.util.Size> selectOtherAspectRatioParentResolutionsWithFovPriority(java.util.List<android.util.Size> list, boolean z17) {
        java.util.Map<android.util.Rational, java.util.List<android.util.Size>> groupSizesByAspectRatio = groupSizesByAspectRatio(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(groupSizesByAspectRatio.keySet());
        sortByFov(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.util.Rational rational = (android.util.Rational) it.next();
            if (!rational.equals(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9) && !rational.equals(androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3)) {
                java.util.List<android.util.Size> list2 = groupSizesByAspectRatio.get(rational);
                java.util.Objects.requireNonNull(list2);
                arrayList2.addAll(selectParentResolutionsByAspectRatio(rational, list2, z17));
            }
        }
        return arrayList2;
    }

    private java.util.List<android.util.Size> selectParentResolutions(java.util.List<android.util.Size> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (needToAddSensorResolutions()) {
            arrayList.addAll(selectParentResolutionsByAspectRatio(this.mSensorAspectRatio, list, false));
        }
        arrayList.addAll(selectParentResolutionsByAspectRatio(this.mFallbackAspectRatio, list, false));
        arrayList.addAll(selectOtherAspectRatioParentResolutionsWithFovPriority(list, false));
        if (arrayList.isEmpty()) {
            androidx.camera.core.Logger.w(TAG, "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(selectOtherAspectRatioParentResolutionsWithFovPriority(list, true));
        }
        androidx.camera.core.Logger.d(TAG, "Parent resolutions: " + arrayList);
        return arrayList;
    }

    private java.util.List<android.util.Size> selectParentResolutionsByAspectRatio(android.util.Rational rational, java.util.List<android.util.Size> list, boolean z17) {
        java.util.List<android.util.Size> filterResolutionsByAspectRatio = filterResolutionsByAspectRatio(rational, list);
        sortInDescendingOrder(filterResolutionsByAspectRatio);
        java.util.HashSet hashSet = new java.util.HashSet(filterResolutionsByAspectRatio);
        java.util.Iterator<androidx.camera.core.impl.UseCaseConfig<?>> it = this.mChildrenConfigs.iterator();
        while (it.hasNext()) {
            java.util.List<android.util.Size> sortedChildSizes = getSortedChildSizes(it.next());
            if (!z17) {
                sortedChildSizes = filterOutChildSizesCausingDoubleCropping(rational, sortedChildSizes);
            }
            if (sortedChildSizes.isEmpty()) {
                return new java.util.ArrayList();
            }
            filterResolutionsByAspectRatio = filterOutParentSizeThatIsTooSmall(sortedChildSizes, filterResolutionsByAspectRatio);
            hashSet.retainAll(getParentSizesThatAreTooLarge(sortedChildSizes, filterResolutionsByAspectRatio));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : filterResolutionsByAspectRatio) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private boolean shouldIncludeHighResolutions() {
        boolean z17;
        androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector;
        java.util.Iterator<androidx.camera.core.impl.UseCaseConfig<?>> it = this.mChildrenConfigs.iterator();
        while (true) {
            z17 = false;
            if (!it.hasNext()) {
                break;
            }
            androidx.camera.core.impl.UseCaseConfig<?> next = it.next();
            if (!next.isHighResolutionDisabled(false) && (next instanceof androidx.camera.core.impl.ImageOutputConfig) && (resolutionSelector = ((androidx.camera.core.impl.ImageOutputConfig) next).getResolutionSelector(null)) != null) {
                z17 = true;
                if (resolutionSelector.getAllowedResolutionMode() == 1) {
                    break;
                }
            }
        }
        return z17;
    }

    private void sortByFov(java.util.List<android.util.Rational> list) {
        java.util.Collections.sort(list, new androidx.camera.core.streamsharing.ResolutionsMerger.CompareAspectRatioByOverlappingAreaToReference(toRational(this.mSensorSize), true));
    }

    public static void sortInDescendingOrder(java.util.List<android.util.Size> list) {
        java.util.Collections.sort(list, new androidx.camera.core.impl.utils.CompareSizesByArea(true));
    }

    private static android.util.Rational toRational(android.util.Size size) {
        return new android.util.Rational(size.getWidth(), size.getHeight());
    }

    private static android.util.Rational toRationalWithMod16Considered(android.util.Size size) {
        android.util.Rational rational = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3;
        if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
            return rational;
        }
        android.util.Rational rational2 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9;
        return androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational2) ? rational2 : toRational(size);
    }

    public java.util.List<android.util.Size> getMergedResolutions(androidx.camera.core.impl.MutableConfig mutableConfig) {
        java.util.List<android.util.Size> cameraSupportedResolutions = getCameraSupportedResolutions();
        if (shouldIncludeHighResolutions()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(cameraSupportedResolutions);
            arrayList.addAll(getCameraSupportedHighResolutions());
            cameraSupportedResolutions = arrayList;
        }
        java.util.List list = (java.util.List) mutableConfig.retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, null);
        if (list != null) {
            cameraSupportedResolutions = getSupportedPrivResolutions(list);
        }
        return selectParentResolutions(cameraSupportedResolutions);
    }

    public android.util.Size getPreferredChildSize(android.util.Size size, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig) {
        java.util.List<android.util.Size> sortedChildSizes = getSortedChildSizes(useCaseConfig);
        for (android.util.Size size2 : sortedChildSizes) {
            if (!isDoubleCropping(size, size2) && !hasUpscaling(size2, size)) {
                return size2;
            }
        }
        for (android.util.Size size3 : sortedChildSizes) {
            if (!hasUpscaling(size3, size)) {
                return size3;
            }
        }
        return size;
    }

    public android.util.Size getPreferredChildSizeForViewport(android.util.Size size, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig) {
        java.util.Iterator<android.util.Size> it = getSortedChildSizes(useCaseConfig).iterator();
        while (it.hasNext()) {
            android.util.Size rectToSize = androidx.camera.core.impl.utils.TransformUtils.rectToSize(getCropRectOfReferenceAspectRatio(it.next(), size));
            if (!hasUpscaling(rectToSize, size)) {
                return rectToSize;
            }
        }
        return size;
    }

    public android.util.Pair<android.graphics.Rect, android.util.Size> getPreferredChildSizePair(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, android.graphics.Rect rect, int i17, boolean z17) {
        boolean z18;
        if (androidx.camera.core.impl.utils.TransformUtils.is90or270(i17)) {
            rect = reverseRect(rect);
            z18 = true;
        } else {
            z18 = false;
        }
        android.util.Pair<android.graphics.Rect, android.util.Size> preferredChildSizePairInternal = getPreferredChildSizePairInternal(rect, useCaseConfig, z17);
        android.graphics.Rect rect2 = (android.graphics.Rect) preferredChildSizePairInternal.first;
        android.util.Size size = (android.util.Size) preferredChildSizePairInternal.second;
        if (z18) {
            size = androidx.camera.core.impl.utils.TransformUtils.reverseSize(size);
            rect2 = reverseRect(rect2);
        }
        return new android.util.Pair<>(rect2, size);
    }

    private ResolutionsMerger(android.util.Size size, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> set) {
        this(size, cameraInfoInternal, set, new androidx.camera.core.internal.SupportedOutputSizesSorter(cameraInfoInternal, size));
    }

    public ResolutionsMerger(android.util.Size size, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> set, androidx.camera.core.internal.SupportedOutputSizesSorter supportedOutputSizesSorter) {
        this.mChildSizesCache = new java.util.HashMap();
        this.mSensorSize = size;
        android.util.Rational sensorAspectRatio = getSensorAspectRatio(size);
        this.mSensorAspectRatio = sensorAspectRatio;
        this.mFallbackAspectRatio = getFallbackAspectRatio(sensorAspectRatio);
        this.mCameraInfo = cameraInfoInternal;
        this.mChildrenConfigs = set;
        this.mSizeSorter = supportedOutputSizesSorter;
    }

    private boolean isDoubleCropping(android.util.Size size, android.util.Size size2) {
        return isDoubleCropping(toRationalWithMod16Considered(size), size2);
    }
}
