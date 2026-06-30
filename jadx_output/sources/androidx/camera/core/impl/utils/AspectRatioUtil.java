package androidx.camera.core.impl.utils;

/* loaded from: classes14.dex */
public final class AspectRatioUtil {
    private static final int ALIGN16 = 16;
    public static final android.util.Rational ASPECT_RATIO_4_3 = new android.util.Rational(4, 3);
    public static final android.util.Rational ASPECT_RATIO_3_4 = new android.util.Rational(3, 4);
    public static final android.util.Rational ASPECT_RATIO_16_9 = new android.util.Rational(16, 9);
    public static final android.util.Rational ASPECT_RATIO_9_16 = new android.util.Rational(9, 16);

    /* loaded from: classes14.dex */
    public static final class CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace implements java.util.Comparator<android.util.Rational> {
        private final android.util.Rational mFullFovRatio;
        private final android.util.Rational mTargetRatio;
        private final android.graphics.RectF mTransformedMappingArea;

        public CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(android.util.Rational rational, android.util.Rational rational2) {
            this.mTargetRatio = rational;
            this.mFullFovRatio = rational2 == null ? new android.util.Rational(4, 3) : rational2;
            this.mTransformedMappingArea = getTransformedMappingArea(rational);
        }

        private float getMappingAreaSize(android.graphics.RectF rectF) {
            return rectF.width() * rectF.height();
        }

        private float getOverlappingAreaSize(android.graphics.RectF rectF, android.graphics.RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        private android.graphics.RectF getTransformedMappingArea(android.util.Rational rational) {
            return rational.floatValue() == this.mFullFovRatio.floatValue() ? new android.graphics.RectF(0.0f, 0.0f, this.mFullFovRatio.getNumerator(), this.mFullFovRatio.getDenominator()) : rational.floatValue() > this.mFullFovRatio.floatValue() ? new android.graphics.RectF(0.0f, 0.0f, this.mFullFovRatio.getNumerator(), (rational.getDenominator() * this.mFullFovRatio.getNumerator()) / rational.getNumerator()) : new android.graphics.RectF(0.0f, 0.0f, (rational.getNumerator() * this.mFullFovRatio.getDenominator()) / rational.getDenominator(), this.mFullFovRatio.getDenominator());
        }

        private boolean isMappingAreaCovered(android.graphics.RectF rectF, android.graphics.RectF rectF2) {
            return rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height();
        }

        @Override // java.util.Comparator
        public int compare(android.util.Rational rational, android.util.Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            android.graphics.RectF transformedMappingArea = getTransformedMappingArea(rational);
            android.graphics.RectF transformedMappingArea2 = getTransformedMappingArea(rational2);
            boolean isMappingAreaCovered = isMappingAreaCovered(transformedMappingArea, this.mTransformedMappingArea);
            boolean isMappingAreaCovered2 = isMappingAreaCovered(transformedMappingArea2, this.mTransformedMappingArea);
            if (isMappingAreaCovered && isMappingAreaCovered2) {
                return (int) java.lang.Math.signum(getMappingAreaSize(transformedMappingArea) - getMappingAreaSize(transformedMappingArea2));
            }
            if (isMappingAreaCovered) {
                return -1;
            }
            if (isMappingAreaCovered2) {
                return 1;
            }
            return -((int) java.lang.Math.signum(getOverlappingAreaSize(transformedMappingArea, this.mTransformedMappingArea) - getOverlappingAreaSize(transformedMappingArea2, this.mTransformedMappingArea)));
        }
    }

    private AspectRatioUtil() {
    }

    public static boolean hasMatchingAspectRatio(android.util.Size size, android.util.Rational rational) {
        return hasMatchingAspectRatio(size, rational, androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_VGA);
    }

    private static boolean isPossibleMod16FromAspectRatio(android.util.Size size, android.util.Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        android.util.Rational rational2 = new android.util.Rational(rational.getDenominator(), rational.getNumerator());
        int i17 = width % 16;
        if (i17 == 0 && height % 16 == 0) {
            return ratioIntersectsMod16Segment(java.lang.Math.max(0, height + (-16)), width, rational) || ratioIntersectsMod16Segment(java.lang.Math.max(0, width + (-16)), height, rational2);
        }
        if (i17 == 0) {
            return ratioIntersectsMod16Segment(height, width, rational);
        }
        if (height % 16 == 0) {
            return ratioIntersectsMod16Segment(width, height, rational2);
        }
        return false;
    }

    private static boolean ratioIntersectsMod16Segment(int i17, int i18, android.util.Rational rational) {
        m3.h.a(i18 % 16 == 0);
        double numerator = (i17 * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) java.lang.Math.max(0, i18 + (-16))) && numerator < ((double) (i18 + 16));
    }

    public static boolean hasMatchingAspectRatio(android.util.Size size, android.util.Rational rational, android.util.Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new android.util.Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (androidx.camera.core.internal.utils.SizeUtil.getArea(size) >= androidx.camera.core.internal.utils.SizeUtil.getArea(size2)) {
            return isPossibleMod16FromAspectRatio(size, rational);
        }
        return false;
    }
}
