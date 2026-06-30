package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986;

/* renamed from: androidx.camera.camera2.internal.compat.params.DynamicRangeConversions */
/* loaded from: classes14.dex */
public final class C0344x583fb2df {

    /* renamed from: DR_TO_PROFILE_MAP */
    private static final java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e, java.util.List<java.lang.Long>> f647x23648193;

    /* renamed from: PROFILE_TO_DR_MAP */
    private static final java.util.Map<java.lang.Long, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> f648xd7432519;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f648xd7432519 = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        f647x23648193 = hashMap2;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR;
        hashMap.put(1L, c0491x2bb48c5e);
        hashMap2.put(c0491x2bb48c5e, java.util.Collections.singletonList(1L));
        hashMap.put(2L, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.f953x804a42c9);
        hashMap2.put((p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e) hashMap.get(2L), java.util.Collections.singletonList(2L));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.f950xc96beed7;
        hashMap.put(4L, c0491x2bb48c5e2);
        hashMap2.put(c0491x2bb48c5e2, java.util.Collections.singletonList(4L));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.f951x1f9c7b48;
        hashMap.put(8L, c0491x2bb48c5e3);
        hashMap2.put(c0491x2bb48c5e3, java.util.Collections.singletonList(8L));
        java.util.List<java.lang.Long> asList = java.util.Arrays.asList(64L, 128L, 16L, 32L);
        java.util.Iterator<java.lang.Long> it = asList.iterator();
        while (it.hasNext()) {
            f648xd7432519.put(it.next(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.f941x1341243d);
        }
        f647x23648193.put(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.f941x1341243d, asList);
        java.util.List<java.lang.Long> asList2 = java.util.Arrays.asList(1024L, 2048L, 256L, 512L);
        java.util.Iterator<java.lang.Long> it6 = asList2.iterator();
        while (it6.hasNext()) {
            f648xd7432519.put(it6.next(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.f942x9dfdd0f6);
        }
        f647x23648193.put(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.f942x9dfdd0f6, asList2);
    }

    private C0344x583fb2df() {
    }

    /* renamed from: dynamicRangeToFirstSupportedProfile */
    public static java.lang.Long m3796xce3eea12(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, android.hardware.camera2.params.DynamicRangeProfiles dynamicRangeProfiles) {
        java.util.List<java.lang.Long> list = f647x23648193.get(c0491x2bb48c5e);
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

    /* renamed from: profileToDynamicRange */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m3797x8e0e7462(long j17) {
        return f648xd7432519.get(java.lang.Long.valueOf(j17));
    }
}
