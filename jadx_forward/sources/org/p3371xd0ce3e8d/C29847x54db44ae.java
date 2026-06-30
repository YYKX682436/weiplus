package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.RendererCommon */
/* loaded from: classes16.dex */
public class C29847x54db44ae {

    /* renamed from: BALANCED_VISIBLE_FRACTION */
    private static float f75867xc7ffd9a6 = 0.5625f;

    /* renamed from: org.webrtc.RendererCommon$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$org$webrtc$RendererCommon$ScalingType */
        static final /* synthetic */ int[] f75868x90a0c822;

        static {
            int[] iArr = new int[org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType.m156237xcee59d22().length];
            f75868x90a0c822 = iArr;
            try {
                iArr[org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f75868x90a0c822[org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType.SCALE_ASPECT_FILL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f75868x90a0c822[org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: org.webrtc.RendererCommon$GlDrawer */
    /* loaded from: classes16.dex */
    public interface GlDrawer {
        /* renamed from: drawOes */
        void mo155539x7205d179(int i17, float[] fArr, int i18, int i19, int i27, int i28, int i29, int i37);

        /* renamed from: drawRgb */
        void mo155540x7205dce9(int i17, float[] fArr, int i18, int i19, int i27, int i28, int i29, int i37);

        /* renamed from: drawYuv */
        void mo155541x7205f8f6(int[] iArr, float[] fArr, int i17, int i18, int i19, int i27, int i28, int i29);

        /* renamed from: release */
        void mo155542x41012807();
    }

    /* renamed from: org.webrtc.RendererCommon$RendererEvents */
    /* loaded from: classes16.dex */
    public interface RendererEvents {
        /* renamed from: onFirstFrameRendered */
        void mo51494x452e7cb1();

        /* renamed from: onFrameResolutionChanged */
        void mo51495xd8b11f3a(int i17, int i18, int i19);

        /* renamed from: onRenderStats */
        void mo51496xbae2a94a(org.p3371xd0ce3e8d.C29838x24207153 c29838x24207153);
    }

    /* renamed from: org.webrtc.RendererCommon$ScalingType */
    /* loaded from: classes16.dex */
    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    /* renamed from: org.webrtc.RendererCommon$VideoLayoutMeasure */
    /* loaded from: classes16.dex */
    public static class VideoLayoutMeasure {

        /* renamed from: visibleFractionMatchOrientation */
        private float f75873xc545877f;

        /* renamed from: visibleFractionMismatchOrientation */
        private float f75874xa32b31ee;

        public VideoLayoutMeasure() {
            org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType scalingType = org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType.SCALE_ASPECT_BALANCED;
            this.f75873xc545877f = org.p3371xd0ce3e8d.C29847x54db44ae.m156230x330aea8b(scalingType);
            this.f75874xa32b31ee = org.p3371xd0ce3e8d.C29847x54db44ae.m156230x330aea8b(scalingType);
        }

        /* renamed from: measure */
        public android.graphics.Point m156238x37eda55e(int i17, int i18, int i19, int i27) {
            int defaultSize = android.view.View.getDefaultSize(Integer.MAX_VALUE, i17);
            int defaultSize2 = android.view.View.getDefaultSize(Integer.MAX_VALUE, i18);
            if (i19 == 0 || i27 == 0 || defaultSize == 0 || defaultSize2 == 0) {
                return new android.graphics.Point(defaultSize, defaultSize2);
            }
            float f17 = i19 / i27;
            android.graphics.Point m156231x400482ad = org.p3371xd0ce3e8d.C29847x54db44ae.m156231x400482ad(((f17 > 1.0f ? 1 : (f17 == 1.0f ? 0 : -1)) > 0) == (((float) defaultSize) / ((float) defaultSize2) > 1.0f) ? this.f75873xc545877f : this.f75874xa32b31ee, f17, defaultSize, defaultSize2);
            if (android.view.View.MeasureSpec.getMode(i17) == 1073741824) {
                m156231x400482ad.x = defaultSize;
            }
            if (android.view.View.MeasureSpec.getMode(i18) == 1073741824) {
                m156231x400482ad.y = defaultSize2;
            }
            return m156231x400482ad;
        }

        /* renamed from: setScalingType */
        public void m156239x40429d9f(org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType scalingType) {
            m156240x40429d9f(scalingType, scalingType);
        }

        /* renamed from: setVisibleFraction */
        public void m156241xa5dbefd2(float f17, float f18) {
            this.f75873xc545877f = f17;
            this.f75874xa32b31ee = f18;
        }

        /* renamed from: setScalingType */
        public void m156240x40429d9f(org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType scalingType, org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType scalingType2) {
            this.f75873xc545877f = org.p3371xd0ce3e8d.C29847x54db44ae.m156230x330aea8b(scalingType);
            this.f75874xa32b31ee = org.p3371xd0ce3e8d.C29847x54db44ae.m156230x330aea8b(scalingType2);
        }
    }

    /* renamed from: adjustOrigin */
    private static void m156227x2d15ab95(float[] fArr) {
        float f17 = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[12] = f17;
        float f18 = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[13] = f18;
        fArr[12] = f17 + 0.5f;
        fArr[13] = f18 + 0.5f;
    }

    /* renamed from: convertMatrixFromAndroidGraphicsMatrix */
    public static float[] m156228xb41d2bfd(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    /* renamed from: convertMatrixToAndroidGraphicsMatrix */
    public static android.graphics.Matrix m156229x48aaa4cc(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertScalingTypeToVisibleFraction */
    public static float m156230x330aea8b(org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType scalingType) {
        int i17 = org.p3371xd0ce3e8d.C29847x54db44ae.AnonymousClass1.f75868x90a0c822[scalingType.ordinal()];
        if (i17 == 1) {
            return 1.0f;
        }
        if (i17 == 2) {
            return 0.0f;
        }
        if (i17 == 3) {
            return f75867xc7ffd9a6;
        }
        throw new java.lang.IllegalArgumentException();
    }

    /* renamed from: getDisplaySize */
    public static android.graphics.Point m156232x400482ad(org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType scalingType, float f17, int i17, int i18) {
        return m156231x400482ad(m156230x330aea8b(scalingType), f17, i17, i18);
    }

    /* renamed from: getLayoutMatrix */
    public static float[] m156233xc61d8a01(boolean z17, float f17, float f18) {
        float f19;
        float f27;
        if (f18 > f17) {
            f27 = f17 / f18;
            f19 = 1.0f;
        } else {
            f19 = f18 / f17;
            f27 = 1.0f;
        }
        if (z17) {
            f19 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f19, f27, 1.0f);
        m156227x2d15ab95(fArr);
        return fArr;
    }

    /* renamed from: getDisplaySize */
    public static android.graphics.Point m156231x400482ad(float f17, float f18, int i17, int i18) {
        if (f17 != 0.0f && f18 != 0.0f) {
            return new android.graphics.Point(java.lang.Math.min(i17, java.lang.Math.round((i18 / f17) * f18)), java.lang.Math.min(i18, java.lang.Math.round((i17 / f17) / f18)));
        }
        return new android.graphics.Point(i17, i18);
    }
}
