package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.AspectRatioUtil */
/* loaded from: classes14.dex */
public final class C0778x7b7add15 {

    /* renamed from: ALIGN16 */
    private static final int f1851xf44b7fca = 16;

    /* renamed from: ASPECT_RATIO_4_3 */
    public static final android.util.Rational f1854x8750dd6d = new android.util.Rational(4, 3);

    /* renamed from: ASPECT_RATIO_3_4 */
    public static final android.util.Rational f1853x8750d9ad = new android.util.Rational(3, 4);

    /* renamed from: ASPECT_RATIO_16_9 */
    public static final android.util.Rational f1852x62c8deba = new android.util.Rational(16, 9);

    /* renamed from: ASPECT_RATIO_9_16 */
    public static final android.util.Rational f1855x62cd1606 = new android.util.Rational(9, 16);

    /* renamed from: androidx.camera.core.impl.utils.AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace */
    /* loaded from: classes14.dex */
    public static final class CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace implements java.util.Comparator<android.util.Rational> {

        /* renamed from: mFullFovRatio */
        private final android.util.Rational f1856x76306bfa;

        /* renamed from: mTargetRatio */
        private final android.util.Rational f1857x2d0d524d;

        /* renamed from: mTransformedMappingArea */
        private final android.graphics.RectF f1858x2155893d;

        public CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(android.util.Rational rational, android.util.Rational rational2) {
            this.f1857x2d0d524d = rational;
            this.f1856x76306bfa = rational2 == null ? new android.util.Rational(4, 3) : rational2;
            this.f1858x2155893d = m5792xc4bd1366(rational);
        }

        /* renamed from: getMappingAreaSize */
        private float m5790xc451b6e6(android.graphics.RectF rectF) {
            return rectF.width() * rectF.height();
        }

        /* renamed from: getOverlappingAreaSize */
        private float m5791xec5c5851(android.graphics.RectF rectF, android.graphics.RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        /* renamed from: getTransformedMappingArea */
        private android.graphics.RectF m5792xc4bd1366(android.util.Rational rational) {
            return rational.floatValue() == this.f1856x76306bfa.floatValue() ? new android.graphics.RectF(0.0f, 0.0f, this.f1856x76306bfa.getNumerator(), this.f1856x76306bfa.getDenominator()) : rational.floatValue() > this.f1856x76306bfa.floatValue() ? new android.graphics.RectF(0.0f, 0.0f, this.f1856x76306bfa.getNumerator(), (rational.getDenominator() * this.f1856x76306bfa.getNumerator()) / rational.getNumerator()) : new android.graphics.RectF(0.0f, 0.0f, (rational.getNumerator() * this.f1856x76306bfa.getDenominator()) / rational.getDenominator(), this.f1856x76306bfa.getDenominator());
        }

        /* renamed from: isMappingAreaCovered */
        private boolean m5793x5c280265(android.graphics.RectF rectF, android.graphics.RectF rectF2) {
            return rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height();
        }

        @Override // java.util.Comparator
        public int compare(android.util.Rational rational, android.util.Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            android.graphics.RectF m5792xc4bd1366 = m5792xc4bd1366(rational);
            android.graphics.RectF m5792xc4bd13662 = m5792xc4bd1366(rational2);
            boolean m5793x5c280265 = m5793x5c280265(m5792xc4bd1366, this.f1858x2155893d);
            boolean m5793x5c2802652 = m5793x5c280265(m5792xc4bd13662, this.f1858x2155893d);
            if (m5793x5c280265 && m5793x5c2802652) {
                return (int) java.lang.Math.signum(m5790xc451b6e6(m5792xc4bd1366) - m5790xc451b6e6(m5792xc4bd13662));
            }
            if (m5793x5c280265) {
                return -1;
            }
            if (m5793x5c2802652) {
                return 1;
            }
            return -((int) java.lang.Math.signum(m5791xec5c5851(m5792xc4bd1366, this.f1858x2155893d) - m5791xec5c5851(m5792xc4bd13662, this.f1858x2155893d)));
        }
    }

    private C0778x7b7add15() {
    }

    /* renamed from: hasMatchingAspectRatio */
    public static boolean m5786xf847b95c(android.util.Size size, android.util.Rational rational) {
        return m5787xf847b95c(size, rational, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.f2129x8adda99d);
    }

    /* renamed from: isPossibleMod16FromAspectRatio */
    private static boolean m5788xc770de3d(android.util.Size size, android.util.Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        android.util.Rational rational2 = new android.util.Rational(rational.getDenominator(), rational.getNumerator());
        int i17 = width % 16;
        if (i17 == 0 && height % 16 == 0) {
            return m5789xf7a8ffcb(java.lang.Math.max(0, height + (-16)), width, rational) || m5789xf7a8ffcb(java.lang.Math.max(0, width + (-16)), height, rational2);
        }
        if (i17 == 0) {
            return m5789xf7a8ffcb(height, width, rational);
        }
        if (height % 16 == 0) {
            return m5789xf7a8ffcb(width, height, rational2);
        }
        return false;
    }

    /* renamed from: ratioIntersectsMod16Segment */
    private static boolean m5789xf7a8ffcb(int i17, int i18, android.util.Rational rational) {
        m3.h.a(i18 % 16 == 0);
        double numerator = (i17 * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) java.lang.Math.max(0, i18 + (-16))) && numerator < ((double) (i18 + 16));
    }

    /* renamed from: hasMatchingAspectRatio */
    public static boolean m5787xf847b95c(android.util.Size size, android.util.Rational rational, android.util.Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new android.util.Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(size) >= p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(size2)) {
            return m5788xc770de3d(size, rational);
        }
        return false;
    }
}
