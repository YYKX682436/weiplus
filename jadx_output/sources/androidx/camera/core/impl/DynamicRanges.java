package androidx.camera.core.impl;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0007¨\u0006\u0010"}, d2 = {"Landroidx/camera/core/impl/DynamicRanges;", "", "()V", "canMatchBitDepth", "", "dynamicRangeToTest", "Landroidx/camera/core/DynamicRange;", "fullySpecifiedDynamicRange", "canMatchEncoding", "canResolve", "fullySpecifiedDynamicRanges", "", "canResolveUnderSpecifiedTo", "underSpecifiedDynamicRange", "findAllPossibleMatches", "dynamicRangesToTest", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DynamicRanges {
    public static final androidx.camera.core.impl.DynamicRanges INSTANCE = new androidx.camera.core.impl.DynamicRanges();

    private DynamicRanges() {
    }

    private final boolean canMatchBitDepth(androidx.camera.core.DynamicRange dynamicRangeToTest, androidx.camera.core.DynamicRange fullySpecifiedDynamicRange) {
        m3.h.e(fullySpecifiedDynamicRange.isFullySpecified(), "Fully specified range is not actually fully specified.");
        return dynamicRangeToTest.getBitDepth() == 0 || dynamicRangeToTest.getBitDepth() == fullySpecifiedDynamicRange.getBitDepth();
    }

    private final boolean canMatchEncoding(androidx.camera.core.DynamicRange dynamicRangeToTest, androidx.camera.core.DynamicRange fullySpecifiedDynamicRange) {
        m3.h.e(fullySpecifiedDynamicRange.isFullySpecified(), "Fully specified range is not actually fully specified.");
        int encoding = dynamicRangeToTest.getEncoding();
        if (encoding == 0) {
            return true;
        }
        int encoding2 = fullySpecifiedDynamicRange.getEncoding();
        return (encoding == 2 && encoding2 != 1) || encoding == encoding2;
    }

    public static final boolean canResolve(androidx.camera.core.DynamicRange dynamicRangeToTest, java.util.Set<androidx.camera.core.DynamicRange> fullySpecifiedDynamicRanges) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(dynamicRangeToTest, "dynamicRangeToTest");
        kotlin.jvm.internal.o.g(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangeToTest.isFullySpecified()) {
            return fullySpecifiedDynamicRanges.contains(dynamicRangeToTest);
        }
        java.util.Iterator<T> it = fullySpecifiedDynamicRanges.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (INSTANCE.canResolveUnderSpecifiedTo(dynamicRangeToTest, (androidx.camera.core.DynamicRange) obj)) {
                break;
            }
        }
        return obj != null;
    }

    private final boolean canResolveUnderSpecifiedTo(androidx.camera.core.DynamicRange underSpecifiedDynamicRange, androidx.camera.core.DynamicRange fullySpecifiedDynamicRange) {
        return canMatchBitDepth(underSpecifiedDynamicRange, fullySpecifiedDynamicRange) && canMatchEncoding(underSpecifiedDynamicRange, fullySpecifiedDynamicRange);
    }

    public static final java.util.Set<androidx.camera.core.DynamicRange> findAllPossibleMatches(java.util.Set<androidx.camera.core.DynamicRange> dynamicRangesToTest, java.util.Set<androidx.camera.core.DynamicRange> fullySpecifiedDynamicRanges) {
        kotlin.jvm.internal.o.g(dynamicRangesToTest, "dynamicRangesToTest");
        kotlin.jvm.internal.o.g(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangesToTest.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Candidate dynamic range set must contain at least 1 candidate dynamic range.");
        }
        lz5.q qVar = new lz5.q();
        for (androidx.camera.core.DynamicRange dynamicRange : dynamicRangesToTest) {
            if (!dynamicRange.isFullySpecified()) {
                for (androidx.camera.core.DynamicRange dynamicRange2 : fullySpecifiedDynamicRanges) {
                    if (INSTANCE.canResolveUnderSpecifiedTo(dynamicRange, dynamicRange2)) {
                        qVar.add(dynamicRange2);
                    }
                }
            } else if (fullySpecifiedDynamicRanges.contains(dynamicRange)) {
                qVar.add(dynamicRange);
            }
        }
        return kz5.o1.a(qVar);
    }
}
