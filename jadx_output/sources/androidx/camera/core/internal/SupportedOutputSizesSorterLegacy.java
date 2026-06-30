package androidx.camera.core.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class SupportedOutputSizesSorterLegacy {
    private static final java.lang.String TAG = "SupportedOutputSizesCollector";
    private final android.util.Rational mFullFovRatio;
    private final boolean mIsSensorLandscapeResolution;
    private final int mLensFacing;
    private final int mSensorOrientation;

    public SupportedOutputSizesSorterLegacy(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, android.util.Rational rational) {
        this.mSensorOrientation = cameraInfoInternal.getSensorRotationDegrees();
        this.mLensFacing = cameraInfoInternal.getLensFacing();
        this.mFullFovRatio = rational;
        boolean z17 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z17 = false;
        }
        this.mIsSensorLandscapeResolution = z17;
    }

    private static android.util.Size flipSizeByRotation(android.util.Size size, int i17, int i18, int i19) {
        return (size == null || !isRotationNeeded(i17, i18, i19)) ? size : new android.util.Size(size.getHeight(), size.getWidth());
    }

    private static android.util.Rational getAspectRatioGroupKeyOfTargetSize(android.util.Size size, java.util.List<android.util.Size> list) {
        if (size == null) {
            return null;
        }
        for (android.util.Rational rational : androidx.camera.core.internal.SupportedOutputSizesSorter.getResolutionListGroupingAspectRatioKeys(list)) {
            if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                return rational;
            }
        }
        return new android.util.Rational(size.getWidth(), size.getHeight());
    }

    private android.util.Rational getTargetAspectRatioByLegacyApi(androidx.camera.core.impl.ImageOutputConfig imageOutputConfig, java.util.List<android.util.Size> list) {
        if (imageOutputConfig.hasTargetAspectRatio()) {
            return androidx.camera.core.internal.SupportedOutputSizesSorter.getTargetAspectRatioRationalValue(imageOutputConfig.getTargetAspectRatio(), this.mIsSensorLandscapeResolution);
        }
        android.util.Size targetSize = getTargetSize(imageOutputConfig);
        if (targetSize != null) {
            return getAspectRatioGroupKeyOfTargetSize(targetSize, list);
        }
        return null;
    }

    private android.util.Size getTargetSize(androidx.camera.core.impl.ImageOutputConfig imageOutputConfig) {
        return flipSizeByRotation(imageOutputConfig.getTargetResolution(null), imageOutputConfig.getTargetRotation(0), this.mLensFacing, this.mSensorOrientation);
    }

    private static boolean isRotationNeeded(int i17, int i18, int i19) {
        int relativeImageRotation = androidx.camera.core.impl.utils.CameraOrientationUtil.getRelativeImageRotation(androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(i17), i19, 1 == i18);
        return relativeImageRotation == 90 || relativeImageRotation == 270;
    }

    public java.util.List<android.util.Size> sortSupportedOutputSizes(java.util.List<android.util.Size> list, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig) {
        if (list.isEmpty()) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.Collections.sort(arrayList, new androidx.camera.core.impl.utils.CompareSizesByArea(true));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        androidx.camera.core.impl.ImageOutputConfig imageOutputConfig = (androidx.camera.core.impl.ImageOutputConfig) useCaseConfig;
        android.util.Size maxResolution = imageOutputConfig.getMaxResolution(null);
        android.util.Size size = (android.util.Size) arrayList.get(0);
        if (maxResolution == null || androidx.camera.core.internal.utils.SizeUtil.getArea(size) < androidx.camera.core.internal.utils.SizeUtil.getArea(maxResolution)) {
            maxResolution = size;
        }
        android.util.Size targetSize = getTargetSize(imageOutputConfig);
        android.util.Size size2 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_VGA;
        int area = androidx.camera.core.internal.utils.SizeUtil.getArea(size2);
        if (androidx.camera.core.internal.utils.SizeUtil.getArea(maxResolution) < area) {
            size2 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_ZERO;
        } else if (targetSize != null && androidx.camera.core.internal.utils.SizeUtil.getArea(targetSize) < area) {
            size2 = targetSize;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.util.Size size3 = (android.util.Size) it.next();
            if (androidx.camera.core.internal.utils.SizeUtil.getArea(size3) <= androidx.camera.core.internal.utils.SizeUtil.getArea(maxResolution) && androidx.camera.core.internal.utils.SizeUtil.getArea(size3) >= androidx.camera.core.internal.utils.SizeUtil.getArea(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new java.lang.IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + maxResolution + "\ninitial size list: " + arrayList);
        }
        android.util.Rational targetAspectRatioByLegacyApi = getTargetAspectRatioByLegacyApi(imageOutputConfig, arrayList2);
        if (targetSize == null) {
            targetSize = imageOutputConfig.getDefaultResolution(null);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        new java.util.HashMap();
        if (targetAspectRatioByLegacyApi == null) {
            arrayList3.addAll(arrayList2);
            if (targetSize != null) {
                androidx.camera.core.internal.SupportedOutputSizesSorter.sortSupportedSizesByFallbackRuleClosestHigherThenLower(arrayList3, targetSize, true);
            }
        } else {
            java.util.Map<android.util.Rational, java.util.List<android.util.Size>> groupSizesByAspectRatio = androidx.camera.core.internal.SupportedOutputSizesSorter.groupSizesByAspectRatio(arrayList2);
            if (targetSize != null) {
                java.util.Iterator<android.util.Rational> it6 = groupSizesByAspectRatio.keySet().iterator();
                while (it6.hasNext()) {
                    androidx.camera.core.internal.SupportedOutputSizesSorter.sortSupportedSizesByFallbackRuleClosestHigherThenLower(groupSizesByAspectRatio.get(it6.next()), targetSize, true);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(groupSizesByAspectRatio.keySet());
            java.util.Collections.sort(arrayList4, new androidx.camera.core.impl.utils.AspectRatioUtil.CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(targetAspectRatioByLegacyApi, this.mFullFovRatio));
            java.util.Iterator it7 = arrayList4.iterator();
            while (it7.hasNext()) {
                for (android.util.Size size4 : groupSizesByAspectRatio.get((android.util.Rational) it7.next())) {
                    if (!arrayList3.contains(size4)) {
                        arrayList3.add(size4);
                    }
                }
            }
        }
        return arrayList3;
    }
}
