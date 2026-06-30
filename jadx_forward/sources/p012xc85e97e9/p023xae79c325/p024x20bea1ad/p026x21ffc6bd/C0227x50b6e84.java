package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.DynamicRangeResolver */
/* loaded from: classes14.dex */
public final class C0227x50b6e84 {
    private static final java.lang.String TAG = "DynamicRangeResolver";

    /* renamed from: mCharacteristics */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 f414x7488e20b;

    /* renamed from: mDynamicRangesInfo */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7 f415x443f2d56;

    /* renamed from: mIs10BitSupported */
    private final boolean f416x31a68017;

    /* renamed from: androidx.camera.camera2.internal.DynamicRangeResolver$Api33Impl */
    /* loaded from: classes14.dex */
    public static final class Api33Impl {
        private Api33Impl() {
        }

        /* renamed from: getRecommended10BitDynamicRange */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m3397xc012d747(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
            java.lang.Long l17 = (java.lang.Long) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l17 != null) {
                return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0344x583fb2df.m3797x8e0e7462(l17.longValue());
            }
            return null;
        }
    }

    public C0227x50b6e84(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        this.f414x7488e20b = c0322x11ef9595;
        this.f415x443f2d56 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7.m3798x532ddec9(c0322x11ef9595);
        int[] iArr = (int[]) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
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
        this.f416x31a68017 = z17;
    }

    /* renamed from: canResolve */
    private static boolean m3387xedb72ffc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e2) {
        m3.h.e(c0491x2bb48c5e2.m4389x3f7fd8d0(), "Fully specified range is not actually fully specified.");
        if (c0491x2bb48c5e.m4386xe1d96ac9() == 2 && c0491x2bb48c5e2.m4386xe1d96ac9() == 1) {
            return false;
        }
        if (c0491x2bb48c5e.m4386xe1d96ac9() == 2 || c0491x2bb48c5e.m4386xe1d96ac9() == 0 || c0491x2bb48c5e.m4386xe1d96ac9() == c0491x2bb48c5e2.m4386xe1d96ac9()) {
            return c0491x2bb48c5e.m4385xbc5bbb2c() == 0 || c0491x2bb48c5e.m4385xbc5bbb2c() == c0491x2bb48c5e2.m4385xbc5bbb2c();
        }
        return false;
    }

    /* renamed from: canResolveWithinConstraints */
    private static boolean m3388x2d13d02f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e2, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> set) {
        if (set.contains(c0491x2bb48c5e2)) {
            return m3387xedb72ffc(c0491x2bb48c5e, c0491x2bb48c5e2);
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, java.lang.String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", c0491x2bb48c5e, c0491x2bb48c5e2));
        return false;
    }

    /* renamed from: findSupportedHdrMatch */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m3389xd1c1be84(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> collection, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> set) {
        if (c0491x2bb48c5e.m4386xe1d96ac9() == 1) {
            return null;
        }
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e2 : collection) {
            m3.h.d(c0491x2bb48c5e2, "Fully specified DynamicRange cannot be null.");
            int m4386xe1d96ac9 = c0491x2bb48c5e2.m4386xe1d96ac9();
            m3.h.e(c0491x2bb48c5e2.m4389x3f7fd8d0(), "Fully specified DynamicRange must have fully defined encoding.");
            if (m4386xe1d96ac9 != 1 && m3388x2d13d02f(c0491x2bb48c5e, c0491x2bb48c5e2, set)) {
                return c0491x2bb48c5e2;
            }
        }
        return null;
    }

    /* renamed from: isFullyUnspecified */
    private static boolean m3390x2999de57(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
        return java.util.Objects.equals(c0491x2bb48c5e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.f954x1f661f17);
    }

    /* renamed from: isPartiallySpecified */
    private static boolean m3391x2970bd4c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
        return c0491x2bb48c5e.m4386xe1d96ac9() == 2 || (c0491x2bb48c5e.m4386xe1d96ac9() != 0 && c0491x2bb48c5e.m4385xbc5bbb2c() == 0) || (c0491x2bb48c5e.m4386xe1d96ac9() == 0 && c0491x2bb48c5e.m4385xbc5bbb2c() != 0);
    }

    /* renamed from: resolveDynamicRange */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m3392x782d8c4a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> set, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> set2, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> set3, java.lang.String str) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e2;
        if (c0491x2bb48c5e.m4389x3f7fd8d0()) {
            if (set.contains(c0491x2bb48c5e)) {
                return c0491x2bb48c5e;
            }
            return null;
        }
        int m4386xe1d96ac9 = c0491x2bb48c5e.m4386xe1d96ac9();
        int m4385xbc5bbb2c = c0491x2bb48c5e.m4385xbc5bbb2c();
        if (m4386xe1d96ac9 == 1 && m4385xbc5bbb2c == 0) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR;
            if (set.contains(c0491x2bb48c5e3)) {
                return c0491x2bb48c5e3;
            }
            return null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m3389xd1c1be84 = m3389xd1c1be84(c0491x2bb48c5e, set2, set);
        if (m3389xd1c1be84 != null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, java.lang.String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, c0491x2bb48c5e, m3389xd1c1be84));
            return m3389xd1c1be84;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m3389xd1c1be842 = m3389xd1c1be84(c0491x2bb48c5e, set3, set);
        if (m3389xd1c1be842 != null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, java.lang.String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, c0491x2bb48c5e, m3389xd1c1be842));
            return m3389xd1c1be842;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR;
        if (m3388x2d13d02f(c0491x2bb48c5e, c0491x2bb48c5e4, set)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, java.lang.String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, c0491x2bb48c5e, c0491x2bb48c5e4));
            return c0491x2bb48c5e4;
        }
        if (m4386xe1d96ac9 == 2 && (m4385xbc5bbb2c == 10 || m4385xbc5bbb2c == 0)) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                c0491x2bb48c5e2 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0227x50b6e84.Api33Impl.m3397xc012d747(this.f414x7488e20b);
                if (c0491x2bb48c5e2 != null) {
                    linkedHashSet.add(c0491x2bb48c5e2);
                }
            } else {
                c0491x2bb48c5e2 = null;
            }
            linkedHashSet.add(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.f953x804a42c9);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m3389xd1c1be843 = m3389xd1c1be84(c0491x2bb48c5e, linkedHashSet, set);
            if (m3389xd1c1be843 != null) {
                java.lang.Object[] objArr = new java.lang.Object[4];
                objArr[0] = str;
                objArr[1] = m3389xd1c1be843.m4384xb2c87fbf(c0491x2bb48c5e2) ? "recommended" : "required";
                objArr[2] = c0491x2bb48c5e;
                objArr[3] = m3389xd1c1be843;
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, java.lang.String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", objArr));
                return m3389xd1c1be843;
            }
        }
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e5 : set) {
            m3.h.e(c0491x2bb48c5e5.m4389x3f7fd8d0(), "Candidate dynamic range must be fully specified.");
            if (!c0491x2bb48c5e5.m4384xb2c87fbf(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR) && m3387xedb72ffc(c0491x2bb48c5e, c0491x2bb48c5e5)) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, java.lang.String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, c0491x2bb48c5e, c0491x2bb48c5e5));
                return c0491x2bb48c5e5;
            }
        }
        return null;
    }

    /* renamed from: resolveDynamicRangeAndUpdateConstraints */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m3393x29817400(java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> set, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> set2, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> set3, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> set4) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m5475x82dbcab4 = interfaceC0768x83509b59.m5475x82dbcab4();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m3392x782d8c4a = m3392x782d8c4a(m5475x82dbcab4, set4, set2, set3, interfaceC0768x83509b59.m6138xb3ee7b2());
        if (m3392x782d8c4a == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", interfaceC0768x83509b59.m6138xb3ee7b2(), m5475x82dbcab4, android.text.TextUtils.join("\n  ", set), android.text.TextUtils.join("\n  ", set4)));
        }
        m3394x5c4cedad(set4, m3392x782d8c4a, this.f415x443f2d56);
        return m3392x782d8c4a;
    }

    /* renamed from: updateConstraints */
    private static void m3394x5c4cedad(java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> set, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7 c0345x87152bb7) {
        m3.h.e(!set.isEmpty(), "Cannot update already-empty constraints.");
        java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> m3800x5b8d41b9 = c0345x87152bb7.m3800x5b8d41b9(c0491x2bb48c5e);
        if (m3800x5b8d41b9.isEmpty()) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet(set);
        set.retainAll(m3800x5b8d41b9);
        if (set.isEmpty()) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", c0491x2bb48c5e, android.text.TextUtils.join("\n  ", m3800x5b8d41b9), android.text.TextUtils.join("\n  ", hashSet)));
        }
    }

    /* renamed from: is10BitDynamicRangeSupported */
    public boolean m3395x160998ec() {
        return this.f416x31a68017;
    }

    /* renamed from: resolveAndValidateDynamicRanges */
    public java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> m3396xa383aef4(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> list, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> list2, java.util.List<java.lang.Integer> list3) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().mo5094x82dbcab4());
        }
        java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> m3801x41312cdd = this.f415x443f2d56.m3801x41312cdd();
        java.util.HashSet hashSet = new java.util.HashSet(m3801x41312cdd);
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> it6 = linkedHashSet.iterator();
        while (it6.hasNext()) {
            m3394x5c4cedad(hashSet, it6.next(), this.f415x443f2d56);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it7 = list3.iterator();
        while (it7.hasNext()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59 = list2.get(it7.next().intValue());
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m5475x82dbcab4 = interfaceC0768x83509b59.m5475x82dbcab4();
            if (m3390x2999de57(m5475x82dbcab4)) {
                arrayList3.add(interfaceC0768x83509b59);
            } else if (m3391x2970bd4c(m5475x82dbcab4)) {
                arrayList2.add(interfaceC0768x83509b59);
            } else {
                arrayList.add(interfaceC0768x83509b59);
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
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b592 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59) it8.next();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m3393x29817400 = m3393x29817400(m3801x41312cdd, linkedHashSet, linkedHashSet2, interfaceC0768x83509b592, hashSet);
            hashMap.put(interfaceC0768x83509b592, m3393x29817400);
            if (!linkedHashSet.contains(m3393x29817400)) {
                linkedHashSet2.add(m3393x29817400);
            }
        }
        return hashMap;
    }
}
