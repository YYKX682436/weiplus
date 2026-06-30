package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0007¨\u0006\u0010"}, d2 = {"Landroidx/camera/core/impl/DynamicRanges;", "", "()V", "canMatchBitDepth", "", "dynamicRangeToTest", "Landroidx/camera/core/DynamicRange;", "fullySpecifiedDynamicRange", "canMatchEncoding", "canResolve", "fullySpecifiedDynamicRanges", "", "canResolveUnderSpecifiedTo", "underSpecifiedDynamicRange", "findAllPossibleMatches", "dynamicRangesToTest", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.camera.core.impl.DynamicRanges */
/* loaded from: classes14.dex */
public final class C0705x4adcffd5 {

    /* renamed from: INSTANCE */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0705x4adcffd5 f1651x4fbc8495 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0705x4adcffd5();

    private C0705x4adcffd5() {
    }

    /* renamed from: canMatchBitDepth */
    private final boolean m5423x6cc208ab(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e dynamicRangeToTest, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e fullySpecifiedDynamicRange) {
        m3.h.e(fullySpecifiedDynamicRange.m4389x3f7fd8d0(), "Fully specified range is not actually fully specified.");
        return dynamicRangeToTest.m4385xbc5bbb2c() == 0 || dynamicRangeToTest.m4385xbc5bbb2c() == fullySpecifiedDynamicRange.m4385xbc5bbb2c();
    }

    /* renamed from: canMatchEncoding */
    private final boolean m5424x923fb848(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e dynamicRangeToTest, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e fullySpecifiedDynamicRange) {
        m3.h.e(fullySpecifiedDynamicRange.m4389x3f7fd8d0(), "Fully specified range is not actually fully specified.");
        int m4386xe1d96ac9 = dynamicRangeToTest.m4386xe1d96ac9();
        if (m4386xe1d96ac9 == 0) {
            return true;
        }
        int m4386xe1d96ac92 = fullySpecifiedDynamicRange.m4386xe1d96ac9();
        return (m4386xe1d96ac9 == 2 && m4386xe1d96ac92 != 1) || m4386xe1d96ac9 == m4386xe1d96ac92;
    }

    /* renamed from: canResolve */
    public static final boolean m5425xedb72ffc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e dynamicRangeToTest, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> fullySpecifiedDynamicRanges) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dynamicRangeToTest, "dynamicRangeToTest");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangeToTest.m4389x3f7fd8d0()) {
            return fullySpecifiedDynamicRanges.contains(dynamicRangeToTest);
        }
        java.util.Iterator<T> it = fullySpecifiedDynamicRanges.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (f1651x4fbc8495.m5426xb1a5466f(dynamicRangeToTest, (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e) obj)) {
                break;
            }
        }
        return obj != null;
    }

    /* renamed from: canResolveUnderSpecifiedTo */
    private final boolean m5426xb1a5466f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e underSpecifiedDynamicRange, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e fullySpecifiedDynamicRange) {
        return m5423x6cc208ab(underSpecifiedDynamicRange, fullySpecifiedDynamicRange) && m5424x923fb848(underSpecifiedDynamicRange, fullySpecifiedDynamicRange);
    }

    /* renamed from: findAllPossibleMatches */
    public static final java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> m5427xdb7243a(java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> dynamicRangesToTest, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> fullySpecifiedDynamicRanges) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dynamicRangesToTest, "dynamicRangesToTest");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangesToTest.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Candidate dynamic range set must contain at least 1 candidate dynamic range.");
        }
        lz5.q qVar = new lz5.q();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e : dynamicRangesToTest) {
            if (!c0491x2bb48c5e.m4389x3f7fd8d0()) {
                for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e2 : fullySpecifiedDynamicRanges) {
                    if (f1651x4fbc8495.m5426xb1a5466f(c0491x2bb48c5e, c0491x2bb48c5e2)) {
                        qVar.add(c0491x2bb48c5e2);
                    }
                }
            } else if (fullySpecifiedDynamicRanges.contains(c0491x2bb48c5e)) {
                qVar.add(c0491x2bb48c5e);
            }
        }
        return kz5.o1.a(qVar);
    }
}
