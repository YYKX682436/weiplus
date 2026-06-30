package androidx.camera.camera2.internal.compat.params;

/* loaded from: classes14.dex */
public final class DynamicRangeConversions {
    private static final java.util.Map<androidx.camera.core.DynamicRange, java.util.List<java.lang.Long>> DR_TO_PROFILE_MAP;
    private static final java.util.Map<java.lang.Long, androidx.camera.core.DynamicRange> PROFILE_TO_DR_MAP;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        PROFILE_TO_DR_MAP = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        DR_TO_PROFILE_MAP = hashMap2;
        androidx.camera.core.DynamicRange dynamicRange = androidx.camera.core.DynamicRange.SDR;
        hashMap.put(1L, dynamicRange);
        hashMap2.put(dynamicRange, java.util.Collections.singletonList(1L));
        hashMap.put(2L, androidx.camera.core.DynamicRange.HLG_10_BIT);
        hashMap2.put((androidx.camera.core.DynamicRange) hashMap.get(2L), java.util.Collections.singletonList(2L));
        androidx.camera.core.DynamicRange dynamicRange2 = androidx.camera.core.DynamicRange.HDR10_10_BIT;
        hashMap.put(4L, dynamicRange2);
        hashMap2.put(dynamicRange2, java.util.Collections.singletonList(4L));
        androidx.camera.core.DynamicRange dynamicRange3 = androidx.camera.core.DynamicRange.HDR10_PLUS_10_BIT;
        hashMap.put(8L, dynamicRange3);
        hashMap2.put(dynamicRange3, java.util.Collections.singletonList(8L));
        java.util.List<java.lang.Long> asList = java.util.Arrays.asList(64L, 128L, 16L, 32L);
        java.util.Iterator<java.lang.Long> it = asList.iterator();
        while (it.hasNext()) {
            PROFILE_TO_DR_MAP.put(it.next(), androidx.camera.core.DynamicRange.DOLBY_VISION_10_BIT);
        }
        DR_TO_PROFILE_MAP.put(androidx.camera.core.DynamicRange.DOLBY_VISION_10_BIT, asList);
        java.util.List<java.lang.Long> asList2 = java.util.Arrays.asList(1024L, 2048L, 256L, 512L);
        java.util.Iterator<java.lang.Long> it6 = asList2.iterator();
        while (it6.hasNext()) {
            PROFILE_TO_DR_MAP.put(it6.next(), androidx.camera.core.DynamicRange.DOLBY_VISION_8_BIT);
        }
        DR_TO_PROFILE_MAP.put(androidx.camera.core.DynamicRange.DOLBY_VISION_8_BIT, asList2);
    }

    private DynamicRangeConversions() {
    }

    public static java.lang.Long dynamicRangeToFirstSupportedProfile(androidx.camera.core.DynamicRange dynamicRange, android.hardware.camera2.params.DynamicRangeProfiles dynamicRangeProfiles) {
        java.util.List<java.lang.Long> list = DR_TO_PROFILE_MAP.get(dynamicRange);
        if (list == null) {
            return null;
        }
        java.util.Set<java.lang.Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (java.lang.Long l17 : list) {
            if (supportedProfiles.contains(l17)) {
                return l17;
            }
        }
        return null;
    }

    public static androidx.camera.core.DynamicRange profileToDynamicRange(long j17) {
        return PROFILE_TO_DR_MAP.get(java.lang.Long.valueOf(j17));
    }
}
