package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class DynamicRangeResolver {
    private static final java.lang.String TAG = "DynamicRangeResolver";
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCharacteristics;
    private final androidx.camera.camera2.internal.compat.params.DynamicRangesCompat mDynamicRangesInfo;
    private final boolean mIs10BitSupported;

    /* loaded from: classes14.dex */
    public static final class Api33Impl {
        private Api33Impl() {
        }

        public static androidx.camera.core.DynamicRange getRecommended10BitDynamicRange(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
            java.lang.Long l17 = (java.lang.Long) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l17 != null) {
                return androidx.camera.camera2.internal.compat.params.DynamicRangeConversions.profileToDynamicRange(l17.longValue());
            }
            return null;
        }
    }

    public DynamicRangeResolver(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mCharacteristics = cameraCharacteristicsCompat;
        this.mDynamicRangesInfo = androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.fromCameraCharacteristics(cameraCharacteristicsCompat);
        int[] iArr = (int[]) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z17 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                if (iArr[i17] == 18) {
                    z17 = true;
                    break;
                }
                i17++;
            }
        }
        this.mIs10BitSupported = z17;
    }

    private static boolean canResolve(androidx.camera.core.DynamicRange dynamicRange, androidx.camera.core.DynamicRange dynamicRange2) {
        m3.h.e(dynamicRange2.isFullySpecified(), "Fully specified range is not actually fully specified.");
        if (dynamicRange.getEncoding() == 2 && dynamicRange2.getEncoding() == 1) {
            return false;
        }
        if (dynamicRange.getEncoding() == 2 || dynamicRange.getEncoding() == 0 || dynamicRange.getEncoding() == dynamicRange2.getEncoding()) {
            return dynamicRange.getBitDepth() == 0 || dynamicRange.getBitDepth() == dynamicRange2.getBitDepth();
        }
        return false;
    }

    private static boolean canResolveWithinConstraints(androidx.camera.core.DynamicRange dynamicRange, androidx.camera.core.DynamicRange dynamicRange2, java.util.Set<androidx.camera.core.DynamicRange> set) {
        if (set.contains(dynamicRange2)) {
            return canResolve(dynamicRange, dynamicRange2);
        }
        androidx.camera.core.Logger.d(TAG, java.lang.String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", dynamicRange, dynamicRange2));
        return false;
    }

    private static androidx.camera.core.DynamicRange findSupportedHdrMatch(androidx.camera.core.DynamicRange dynamicRange, java.util.Collection<androidx.camera.core.DynamicRange> collection, java.util.Set<androidx.camera.core.DynamicRange> set) {
        if (dynamicRange.getEncoding() == 1) {
            return null;
        }
        for (androidx.camera.core.DynamicRange dynamicRange2 : collection) {
            m3.h.d(dynamicRange2, "Fully specified DynamicRange cannot be null.");
            int encoding = dynamicRange2.getEncoding();
            m3.h.e(dynamicRange2.isFullySpecified(), "Fully specified DynamicRange must have fully defined encoding.");
            if (encoding != 1 && canResolveWithinConstraints(dynamicRange, dynamicRange2, set)) {
                return dynamicRange2;
            }
        }
        return null;
    }

    private static boolean isFullyUnspecified(androidx.camera.core.DynamicRange dynamicRange) {
        return java.util.Objects.equals(dynamicRange, androidx.camera.core.DynamicRange.UNSPECIFIED);
    }

    private static boolean isPartiallySpecified(androidx.camera.core.DynamicRange dynamicRange) {
        return dynamicRange.getEncoding() == 2 || (dynamicRange.getEncoding() != 0 && dynamicRange.getBitDepth() == 0) || (dynamicRange.getEncoding() == 0 && dynamicRange.getBitDepth() != 0);
    }

    private androidx.camera.core.DynamicRange resolveDynamicRange(androidx.camera.core.DynamicRange dynamicRange, java.util.Set<androidx.camera.core.DynamicRange> set, java.util.Set<androidx.camera.core.DynamicRange> set2, java.util.Set<androidx.camera.core.DynamicRange> set3, java.lang.String str) {
        androidx.camera.core.DynamicRange dynamicRange2;
        if (dynamicRange.isFullySpecified()) {
            if (set.contains(dynamicRange)) {
                return dynamicRange;
            }
            return null;
        }
        int encoding = dynamicRange.getEncoding();
        int bitDepth = dynamicRange.getBitDepth();
        if (encoding == 1 && bitDepth == 0) {
            androidx.camera.core.DynamicRange dynamicRange3 = androidx.camera.core.DynamicRange.SDR;
            if (set.contains(dynamicRange3)) {
                return dynamicRange3;
            }
            return null;
        }
        androidx.camera.core.DynamicRange findSupportedHdrMatch = findSupportedHdrMatch(dynamicRange, set2, set);
        if (findSupportedHdrMatch != null) {
            androidx.camera.core.Logger.d(TAG, java.lang.String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, dynamicRange, findSupportedHdrMatch));
            return findSupportedHdrMatch;
        }
        androidx.camera.core.DynamicRange findSupportedHdrMatch2 = findSupportedHdrMatch(dynamicRange, set3, set);
        if (findSupportedHdrMatch2 != null) {
            androidx.camera.core.Logger.d(TAG, java.lang.String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, dynamicRange, findSupportedHdrMatch2));
            return findSupportedHdrMatch2;
        }
        androidx.camera.core.DynamicRange dynamicRange4 = androidx.camera.core.DynamicRange.SDR;
        if (canResolveWithinConstraints(dynamicRange, dynamicRange4, set)) {
            androidx.camera.core.Logger.d(TAG, java.lang.String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, dynamicRange, dynamicRange4));
            return dynamicRange4;
        }
        if (encoding == 2 && (bitDepth == 10 || bitDepth == 0)) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                dynamicRange2 = androidx.camera.camera2.internal.DynamicRangeResolver.Api33Impl.getRecommended10BitDynamicRange(this.mCharacteristics);
                if (dynamicRange2 != null) {
                    linkedHashSet.add(dynamicRange2);
                }
            } else {
                dynamicRange2 = null;
            }
            linkedHashSet.add(androidx.camera.core.DynamicRange.HLG_10_BIT);
            androidx.camera.core.DynamicRange findSupportedHdrMatch3 = findSupportedHdrMatch(dynamicRange, linkedHashSet, set);
            if (findSupportedHdrMatch3 != null) {
                java.lang.Object[] objArr = new java.lang.Object[4];
                objArr[0] = str;
                objArr[1] = findSupportedHdrMatch3.equals(dynamicRange2) ? "recommended" : "required";
                objArr[2] = dynamicRange;
                objArr[3] = findSupportedHdrMatch3;
                androidx.camera.core.Logger.d(TAG, java.lang.String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", objArr));
                return findSupportedHdrMatch3;
            }
        }
        for (androidx.camera.core.DynamicRange dynamicRange5 : set) {
            m3.h.e(dynamicRange5.isFullySpecified(), "Candidate dynamic range must be fully specified.");
            if (!dynamicRange5.equals(androidx.camera.core.DynamicRange.SDR) && canResolve(dynamicRange, dynamicRange5)) {
                androidx.camera.core.Logger.d(TAG, java.lang.String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, dynamicRange, dynamicRange5));
                return dynamicRange5;
            }
        }
        return null;
    }

    private androidx.camera.core.DynamicRange resolveDynamicRangeAndUpdateConstraints(java.util.Set<androidx.camera.core.DynamicRange> set, java.util.Set<androidx.camera.core.DynamicRange> set2, java.util.Set<androidx.camera.core.DynamicRange> set3, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, java.util.Set<androidx.camera.core.DynamicRange> set4) {
        androidx.camera.core.DynamicRange dynamicRange = useCaseConfig.getDynamicRange();
        androidx.camera.core.DynamicRange resolveDynamicRange = resolveDynamicRange(dynamicRange, set4, set2, set3, useCaseConfig.getTargetName());
        if (resolveDynamicRange == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", useCaseConfig.getTargetName(), dynamicRange, android.text.TextUtils.join("\n  ", set), android.text.TextUtils.join("\n  ", set4)));
        }
        updateConstraints(set4, resolveDynamicRange, this.mDynamicRangesInfo);
        return resolveDynamicRange;
    }

    private static void updateConstraints(java.util.Set<androidx.camera.core.DynamicRange> set, androidx.camera.core.DynamicRange dynamicRange, androidx.camera.camera2.internal.compat.params.DynamicRangesCompat dynamicRangesCompat) {
        m3.h.e(!set.isEmpty(), "Cannot update already-empty constraints.");
        java.util.Set<androidx.camera.core.DynamicRange> dynamicRangeCaptureRequestConstraints = dynamicRangesCompat.getDynamicRangeCaptureRequestConstraints(dynamicRange);
        if (dynamicRangeCaptureRequestConstraints.isEmpty()) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet(set);
        set.retainAll(dynamicRangeCaptureRequestConstraints);
        if (set.isEmpty()) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", dynamicRange, android.text.TextUtils.join("\n  ", dynamicRangeCaptureRequestConstraints), android.text.TextUtils.join("\n  ", hashSet)));
        }
    }

    public boolean is10BitDynamicRangeSupported() {
        return this.mIs10BitSupported;
    }

    public java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> resolveAndValidateDynamicRanges(java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> list, java.util.List<androidx.camera.core.impl.UseCaseConfig<?>> list2, java.util.List<java.lang.Integer> list3) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<androidx.camera.core.impl.AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().getDynamicRange());
        }
        java.util.Set<androidx.camera.core.DynamicRange> supportedDynamicRanges = this.mDynamicRangesInfo.getSupportedDynamicRanges();
        java.util.HashSet hashSet = new java.util.HashSet(supportedDynamicRanges);
        java.util.Iterator<androidx.camera.core.DynamicRange> it6 = linkedHashSet.iterator();
        while (it6.hasNext()) {
            updateConstraints(hashSet, it6.next(), this.mDynamicRangesInfo);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it7 = list3.iterator();
        while (it7.hasNext()) {
            androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig = list2.get(it7.next().intValue());
            androidx.camera.core.DynamicRange dynamicRange = useCaseConfig.getDynamicRange();
            if (isFullyUnspecified(dynamicRange)) {
                arrayList3.add(useCaseConfig);
            } else if (isPartiallySpecified(dynamicRange)) {
                arrayList2.add(useCaseConfig);
            } else {
                arrayList.add(useCaseConfig);
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        java.util.Iterator it8 = arrayList4.iterator();
        while (it8.hasNext()) {
            androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig2 = (androidx.camera.core.impl.UseCaseConfig) it8.next();
            androidx.camera.core.DynamicRange resolveDynamicRangeAndUpdateConstraints = resolveDynamicRangeAndUpdateConstraints(supportedDynamicRanges, linkedHashSet, linkedHashSet2, useCaseConfig2, hashSet);
            hashMap.put(useCaseConfig2, resolveDynamicRangeAndUpdateConstraints);
            if (!linkedHashSet.contains(resolveDynamicRangeAndUpdateConstraints)) {
                linkedHashSet2.add(resolveDynamicRangeAndUpdateConstraints);
            }
        }
        return hashMap;
    }
}
