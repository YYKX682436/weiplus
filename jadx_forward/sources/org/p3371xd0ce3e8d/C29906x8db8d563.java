package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.VideoFrameDrawer */
/* loaded from: classes16.dex */
public class C29906x8db8d563 {
    public static final java.lang.String TAG = "VideoFrameDrawer";

    /* renamed from: srcPoints */
    static final float[] f76119xe0de0be7 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: lastI420Frame */
    private org.p3371xd0ce3e8d.C29904x150215d2 f76121x29caa48e;

    /* renamed from: renderHeight */
    private int f76122x189ab65d;

    /* renamed from: renderWidth */
    private int f76125x9e8789d0;

    /* renamed from: dstPoints */
    private final float[] f76120x1c06a708 = new float[6];

    /* renamed from: renderSize */
    private final android.graphics.Point f76124x472bdab7 = new android.graphics.Point();

    /* renamed from: yuvUploader */
    private final org.p3371xd0ce3e8d.C29906x8db8d563.YuvUploader f76126xbe475d68 = new org.p3371xd0ce3e8d.C29906x8db8d563.YuvUploader(null);

    /* renamed from: renderMatrix */
    private final android.graphics.Matrix f76123x20efbcf7 = new android.graphics.Matrix();

    /* renamed from: org.webrtc.VideoFrameDrawer$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type */
        static final /* synthetic */ int[] f76127xd4533a1e;

        static {
            int[] iArr = new int[org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer.Type.m156552xcee59d22().length];
            f76127xd4533a1e = iArr;
            try {
                iArr[org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer.Type.OES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f76127xd4533a1e[org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer.Type.RGB.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: org.webrtc.VideoFrameDrawer$YuvUploader */
    /* loaded from: classes16.dex */
    public static class YuvUploader {

        /* renamed from: copyBuffer */
        private java.nio.ByteBuffer f76128xaca90415;

        /* renamed from: yuvTextures */
        private int[] f76129x254b8db2;

        private YuvUploader() {
        }

        public /* synthetic */ YuvUploader(org.p3371xd0ce3e8d.C29906x8db8d563.AnonymousClass1 anonymousClass1) {
            this();
        }

        /* renamed from: getYuvTextures */
        public int[] m156564xff21d47c() {
            return this.f76129x254b8db2;
        }

        /* renamed from: release */
        public void m156565x41012807() {
            this.f76128xaca90415 = null;
            int[] iArr = this.f76129x254b8db2;
            if (iArr != null) {
                android.opengl.GLES20.glDeleteTextures(3, iArr, 0);
                this.f76129x254b8db2 = null;
            }
        }

        /* renamed from: uploadFromBuffer */
        public int[] m156566xa27cd6b(org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer i420Buffer) {
            return m156567x10223263(i420Buffer.mo155645x755bd410(), i420Buffer.mo155641x1c4fb41d(), new int[]{i420Buffer.mo155644xcda3b86a(), i420Buffer.mo155642xcda3b866(), i420Buffer.mo155643xcda3b867()}, new java.nio.ByteBuffer[]{i420Buffer.mo155640x744cac39(), i420Buffer.mo155638x744cac35(), i420Buffer.mo155639x744cac36()});
        }

        /* renamed from: uploadYuvData */
        public int[] m156567x10223263(int i17, int i18, int[] iArr, java.nio.ByteBuffer[] byteBufferArr) {
            java.nio.ByteBuffer byteBuffer;
            java.nio.ByteBuffer byteBuffer2;
            int i19 = i17 / 2;
            int[] iArr2 = {i17, i19, i19};
            int i27 = i18 / 2;
            int[] iArr3 = {i18, i27, i27};
            int i28 = 0;
            for (int i29 = 0; i29 < 3; i29++) {
                int i37 = iArr[i29];
                int i38 = iArr2[i29];
                if (i37 > i38) {
                    i28 = java.lang.Math.max(i28, i38 * iArr3[i29]);
                }
            }
            if (i28 > 0 && ((byteBuffer2 = this.f76128xaca90415) == null || byteBuffer2.capacity() < i28)) {
                this.f76128xaca90415 = java.nio.ByteBuffer.allocateDirect(i28);
            }
            if (this.f76129x254b8db2 == null) {
                this.f76129x254b8db2 = new int[3];
                for (int i39 = 0; i39 < 3; i39++) {
                    this.f76129x254b8db2[i39] = org.p3371xd0ce3e8d.C29784x7f4262a7.m155563xe06639e6(3553);
                }
            }
            for (int i47 = 0; i47 < 3; i47++) {
                android.opengl.GLES20.glActiveTexture(33984 + i47);
                android.opengl.GLES20.glBindTexture(3553, this.f76129x254b8db2[i47]);
                int i48 = iArr[i47];
                int i49 = iArr2[i47];
                if (i48 == i49) {
                    byteBuffer = byteBufferArr[i47];
                } else {
                    org.p3371xd0ce3e8d.C29919xe8726508.m156608x58e79be7(byteBufferArr[i47], i48, this.f76128xaca90415, i49, i49, iArr3[i47]);
                    byteBuffer = this.f76128xaca90415;
                }
                android.opengl.GLES20.glTexImage2D(3553, 0, 6409, iArr2[i47], iArr3[i47], 0, 6409, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, byteBuffer);
            }
            return this.f76129x254b8db2;
        }
    }

    /* renamed from: calculateTransformedRenderSize */
    private void m156555x4922fa5c(int i17, int i18, android.graphics.Matrix matrix) {
        if (matrix == null) {
            this.f76125x9e8789d0 = i17;
            this.f76122x189ab65d = i18;
            return;
        }
        matrix.mapPoints(this.f76120x1c06a708, f76119xe0de0be7);
        for (int i19 = 0; i19 < 3; i19++) {
            float[] fArr = this.f76120x1c06a708;
            int i27 = i19 * 2;
            int i28 = i27 + 0;
            fArr[i28] = fArr[i28] * i17;
            int i29 = i27 + 1;
            fArr[i29] = fArr[i29] * i18;
        }
        float[] fArr2 = this.f76120x1c06a708;
        this.f76125x9e8789d0 = m156556x11318bf5(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        float[] fArr3 = this.f76120x1c06a708;
        this.f76122x189ab65d = m156556x11318bf5(fArr3[0], fArr3[1], fArr3[4], fArr3[5]);
    }

    /* renamed from: distance */
    private static int m156556x11318bf5(float f17, float f18, float f19, float f27) {
        return (int) java.lang.Math.round(java.lang.Math.hypot(f19 - f17, f27 - f18));
    }

    /* renamed from: drawTexture */
    public static void m156557x785a8b37(org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer, org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer textureBuffer, android.graphics.Matrix matrix, int i17, int i18, int i19, int i27, int i28, int i29) {
        android.graphics.Matrix matrix2 = new android.graphics.Matrix(textureBuffer.mo156447xb1778017());
        matrix2.preConcat(matrix);
        float[] m156228xb41d2bfd = org.p3371xd0ce3e8d.C29847x54db44ae.m156228xb41d2bfd(matrix2);
        int i37 = org.p3371xd0ce3e8d.C29906x8db8d563.AnonymousClass1.f76127xd4533a1e[textureBuffer.mo156448xfb85f7b0().ordinal()];
        if (i37 == 1) {
            glDrawer.mo155539x7205d179(textureBuffer.mo156445xc2ca74e0(), m156228xb41d2bfd, i17, i18, i19, i27, i28, i29);
        } else {
            if (i37 != 2) {
                throw new java.lang.RuntimeException("Unknown texture type.");
            }
            glDrawer.mo155540x7205dce9(textureBuffer.mo156445xc2ca74e0(), m156228xb41d2bfd, i17, i18, i19, i27, i28, i29);
        }
    }

    /* renamed from: drawFrame */
    public void m156558x75e3689(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer) {
        m156559x75e3689(c29904x150215d2, glDrawer, null);
    }

    /* renamed from: prepareBufferForViewportSize */
    public org.p3371xd0ce3e8d.C29904x150215d2.Buffer m156561x886f1e09(org.p3371xd0ce3e8d.C29904x150215d2.Buffer buffer, int i17, int i18) {
        buffer.mo155514xc84df105();
        return buffer;
    }

    /* renamed from: release */
    public void m156562x41012807() {
        this.f76126xbe475d68.m156565x41012807();
        this.f76121x29caa48e = null;
    }

    /* renamed from: drawFrame */
    public void m156559x75e3689(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer, android.graphics.Matrix matrix) {
        m156560x75e3689(c29904x150215d2, glDrawer, matrix, 0, 0, c29904x150215d2.m156546xdcea9b53(), c29904x150215d2.m156545xa699d53a());
    }

    /* renamed from: drawFrame */
    public void m156560x75e3689(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer, android.graphics.Matrix matrix, int i17, int i18, int i19, int i27) {
        m156555x4922fa5c(c29904x150215d2.m156546xdcea9b53(), c29904x150215d2.m156545xa699d53a(), matrix);
        if (this.f76125x9e8789d0 > 0 && this.f76122x189ab65d > 0) {
            boolean z17 = c29904x150215d2.m156544x12f2b736() instanceof org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer;
            this.f76123x20efbcf7.reset();
            this.f76123x20efbcf7.preTranslate(0.5f, 0.5f);
            if (!z17) {
                this.f76123x20efbcf7.preScale(1.0f, -1.0f);
            }
            this.f76123x20efbcf7.preRotate(c29904x150215d2.m156547x79734cf4());
            this.f76123x20efbcf7.preTranslate(-0.5f, -0.5f);
            if (matrix != null) {
                this.f76123x20efbcf7.preConcat(matrix);
            }
            if (z17) {
                this.f76121x29caa48e = null;
                m156557x785a8b37(glDrawer, (org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer) c29904x150215d2.m156544x12f2b736(), this.f76123x20efbcf7, this.f76125x9e8789d0, this.f76122x189ab65d, i17, i18, i19, i27);
                return;
            }
            if (c29904x150215d2 != this.f76121x29caa48e) {
                this.f76121x29caa48e = c29904x150215d2;
                org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer mo155646xcc305184 = c29904x150215d2.m156544x12f2b736().mo155646xcc305184();
                this.f76126xbe475d68.m156566xa27cd6b(mo155646xcc305184);
                mo155646xcc305184.mo155513x41012807();
            }
            glDrawer.mo155541x7205f8f6(this.f76126xbe475d68.m156564xff21d47c(), org.p3371xd0ce3e8d.C29847x54db44ae.m156228xb41d2bfd(this.f76123x20efbcf7), this.f76125x9e8789d0, this.f76122x189ab65d, i17, i18, i19, i27);
            return;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Illegal frame size: " + this.f76125x9e8789d0 + "x" + this.f76122x189ab65d);
    }
}
