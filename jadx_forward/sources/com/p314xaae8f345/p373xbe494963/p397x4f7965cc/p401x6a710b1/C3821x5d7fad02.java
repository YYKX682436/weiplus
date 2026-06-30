package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videobase.utils.OpenGlUtils */
/* loaded from: classes14.dex */
public class C3821x5d7fad02 {
    private static final java.lang.String TAG = "OpenGlUtils";

    /* renamed from: com.tencent.liteav.videobase.utils.OpenGlUtils$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128323a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.m29578xcee59d22().length];
            f128323a = iArr;
            try {
                iArr[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f128323a[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_180.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f128323a[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f128323a[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: attachTextureToFrameBuffer */
    public static void m31146xf049ff1c(int i17, int i18) {
        android.opengl.GLES20.glBindFramebuffer(36160, i18);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i17, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
    }

    /* renamed from: bindFramebuffer */
    public static void m31147xfc642370(int i17, int i18) {
        android.opengl.GLES20.glBindFramebuffer(i17, i18);
    }

    /* renamed from: bindTexture */
    public static void m31148x89bf7a1e(int i17, int i18) {
        android.opengl.GLES20.glBindTexture(i17, i18);
    }

    /* renamed from: checkGlError */
    public static void m31149x15195fb(java.lang.String str) {
    }

    /* renamed from: convertYuvFormat */
    public static void m31150x1d0ae8fe(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType pixelFormatType, java.lang.Object obj, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType pixelFormatType2, java.lang.Object obj2, int i17, int i18) {
        int m30955x754a37bb = pixelFormatType.m30955x754a37bb();
        int m30955x754a37bb2 = pixelFormatType2.m30955x754a37bb();
        boolean z17 = obj instanceof java.nio.ByteBuffer;
        if ((z17 && (obj2 instanceof java.nio.ByteBuffer)) ? m31173x34943990(m30955x754a37bb, (java.nio.ByteBuffer) obj, m30955x754a37bb2, (java.nio.ByteBuffer) obj2, i17, i18) : (z17 && (obj2 instanceof byte[])) ? m31172x7d81e309(m30955x754a37bb, (java.nio.ByteBuffer) obj, m30955x754a37bb2, (byte[]) obj2, i17, i18) : ((obj instanceof byte[]) && (obj2 instanceof java.nio.ByteBuffer)) ? m31171x607dd2df(m30955x754a37bb, (byte[]) obj, m30955x754a37bb2, (java.nio.ByteBuffer) obj2, i17, i18) : m31170x6e6863da(m30955x754a37bb, (byte[]) obj, m30955x754a37bb2, (byte[]) obj2, i17, i18)) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Do not support " + pixelFormatType + " to " + pixelFormatType2);
    }

    /* renamed from: createNormalCubeVerticesBuffer */
    public static java.nio.FloatBuffer m31151xdc301791() {
        float[] fArr = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.f128176d;
        return (java.nio.FloatBuffer) java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).position(0);
    }

    /* renamed from: createTexture */
    public static int m31152x3164f87f(int i17, int i18, int i19, int i27) {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d(TAG, "glGenTextures textureId: " + iArr[0]);
        android.opengl.GLES20.glBindTexture(3553, iArr[0]);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
        android.opengl.GLES20.glTexImage2D(3553, 0, i19, i17, i18, 0, i27, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
        return iArr[0];
    }

    /* renamed from: createTextureCoordsBuffer */
    public static java.nio.FloatBuffer m31153xd04d1c1d(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar, boolean z17, boolean z18) {
        float[] fArr = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.f128177e;
        float[] fArr2 = new float[fArr.length];
        m31165x7e679789(fArr2, kVar, z17, z18);
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr2).position(0);
        return asFloatBuffer;
    }

    /* renamed from: deleteFrameBuffer */
    public static void m31154xe08f1d62(int i17) {
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
        }
    }

    /* renamed from: deleteShaderId */
    public static void m31155x58882aab(int i17) {
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteShader(i17);
        }
    }

    /* renamed from: deleteTexture */
    public static void m31156x9f4940f0(int i17) {
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
        }
    }

    /* renamed from: detachTextureFromFrameBuffer */
    public static void m31157xeca9d2db(int i17) {
        android.opengl.GLES20.glBindFramebuffer(36160, i17);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
    }

    /* renamed from: flip */
    private static float m31158x30006d(float f17) {
        return f17 == 0.0f ? 1.0f : 0.0f;
    }

    /* renamed from: generateFrameBufferId */
    public static int m31159xd3fd3e93() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        return iArr[0];
    }

    /* renamed from: generateTextureOES */
    public static int m31160x982ce597() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        android.opengl.GLES20.glBindTexture(36197, iArr[0]);
        android.opengl.GLES20.glTexParameterf(36197, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(36197, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    /* renamed from: getCurrentContext */
    public static java.lang.Object m31161xc88b72ec() {
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 17 ? android.opengl.EGL14.eglGetCurrentContext() : ((javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL()).eglGetCurrentContext();
    }

    /* renamed from: getGLContextNativeHandle */
    public static long m31162xbb3f7db3(java.lang.Object obj) {
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 17 || !(obj instanceof android.opengl.EGLContext)) {
            return 0L;
        }
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 21 ? ((android.opengl.EGLContext) obj).getNativeHandle() : ((android.opengl.EGLContext) obj).getHandle();
    }

    /* renamed from: getGLErrorCount */
    public static int m31163x841c9d02() {
        int i17 = 0;
        while (android.opengl.GLES20.glGetError() != 0) {
            i17++;
        }
        return i17;
    }

    /* renamed from: glViewport */
    public static void m31164x2199b4ab(int i17, int i18, int i19, int i27) {
        android.opengl.GLES20.glViewport(i17, i18, i19, i27);
    }

    /* renamed from: initTextureCoordsBuffer */
    public static void m31165x7e679789(float[] fArr, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar, boolean z17, boolean z18) {
        float[] fArr2 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.f128177e;
        if (kVar != null) {
            int i17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.AnonymousClass1.f128323a[kVar.ordinal()];
            if (i17 == 1) {
                fArr2 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.f128179g;
            } else if (i17 == 2) {
                fArr2 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.f128180h;
            } else if (i17 == 3) {
                fArr2 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.f128178f;
            }
        }
        java.lang.System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        if (z17) {
            fArr[0] = m31158x30006d(fArr[0]);
            fArr[2] = m31158x30006d(fArr[2]);
            fArr[4] = m31158x30006d(fArr[4]);
            fArr[6] = m31158x30006d(fArr[6]);
        }
        if (z18) {
            fArr[1] = m31158x30006d(fArr[1]);
            fArr[3] = m31158x30006d(fArr[3]);
            fArr[5] = m31158x30006d(fArr[5]);
            fArr[7] = m31158x30006d(fArr[7]);
        }
    }

    /* renamed from: isNoGLContext */
    public static boolean m31166x23d560df(java.lang.Object obj) {
        return obj instanceof javax.microedition.khronos.egl.EGLContext ? obj.equals(javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) : (obj instanceof android.opengl.EGLContext) && m31162xbb3f7db3(obj) == 0;
    }

    /* renamed from: loadTexture */
    public static int m31168x8ced7955(android.graphics.Bitmap bitmap, int i17, boolean z17) {
        int[] iArr = new int[1];
        if (i17 == -1) {
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d(TAG, "glGenTextures textureId: " + iArr[0]);
            m31148x89bf7a1e(3553, iArr[0]);
            android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            m31148x89bf7a1e(3553, i17);
            android.opengl.GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            iArr[0] = i17;
        }
        if (z17) {
            bitmap.recycle();
        }
        return iArr[0];
    }

    /* renamed from: loadYuv420DataToTextures */
    public static void m31169x4baa401b(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int[] iArr) {
        if (byteBuffer.isDirect()) {
            m31179x8fdeb9d0(byteBuffer, i17, i18, i19, iArr);
        } else {
            m31178x68562ecf(byteBuffer.array(), i17, i18, i19, iArr);
        }
    }

    /* renamed from: nativeConvertYuvFormatArrayToArray */
    private static native boolean m31170x6e6863da(int i17, byte[] bArr, int i18, byte[] bArr2, int i19, int i27);

    /* renamed from: nativeConvertYuvFormatArrayToBuffer */
    private static native boolean m31171x607dd2df(int i17, byte[] bArr, int i18, java.nio.ByteBuffer byteBuffer, int i19, int i27);

    /* renamed from: nativeConvertYuvFormatBufferToArray */
    private static native boolean m31172x7d81e309(int i17, java.nio.ByteBuffer byteBuffer, int i18, byte[] bArr, int i19, int i27);

    /* renamed from: nativeConvertYuvFormatBufferToBuffer */
    private static native boolean m31173x34943990(int i17, java.nio.ByteBuffer byteBuffer, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27);

    /* renamed from: nativeCopyDataFromByteArrayToByteBuffer */
    public static native void m31174xcc1eca34(byte[] bArr, java.nio.ByteBuffer byteBuffer, int i17);

    /* renamed from: nativeCopyDataFromByteBufferToByteArray */
    public static native void m31175xf4fb168e(java.nio.ByteBuffer byteBuffer, byte[] bArr, int i17);

    /* renamed from: nativeCopyDataFromByteBufferToByteBuffer */
    public static native void m31176xac4176ab(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, int i17);

    /* renamed from: nativeCopyYuvFromByteBufferToByteBuffer */
    public static native void m31177xb53017c3(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, int i19, int i27, int i28);

    /* renamed from: nativeLoadYuv420ByteArrayToTextures */
    private static native void m31178x68562ecf(byte[] bArr, int i17, int i18, int i19, int[] iArr);

    /* renamed from: nativeLoadYuv420ByteBufferToTextures */
    private static native void m31179x8fdeb9d0(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int[] iArr);

    /* renamed from: readPixels */
    public static void m31180xdc78bbe3(int i17, int i18, int i19, int i27, java.lang.Object obj) {
        if (obj instanceof java.nio.Buffer) {
            java.nio.Buffer buffer = (java.nio.Buffer) obj;
            buffer.position(0);
            android.opengl.GLES20.glReadPixels(i17, i18, i19, i27, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, buffer);
        } else if (obj instanceof byte[]) {
            android.opengl.GLES20.glReadPixels(i17, i18, i19, i27, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, java.nio.ByteBuffer.wrap((byte[]) obj));
        } else {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "read pixels failed due to unsupport object. ".concat(java.lang.String.valueOf(obj)));
        }
    }

    /* renamed from: reverseMappingPoint */
    public static android.graphics.Point m31181x681f0164(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType gLScaleType, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar, android.graphics.Point point, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x2754212) {
        float f17 = (c3779x2754212.f14764x6be2dc6 * 1.0f) / c3779x275421.f14764x6be2dc6;
        float f18 = (c3779x2754212.f14763xb7389127 * 1.0f) / c3779x275421.f14763xb7389127;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate((-c3779x275421.f14764x6be2dc6) / 2.0f, (-c3779x275421.f14763xb7389127) / 2.0f);
        if (gLScaleType == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.CENTER_CROP) {
            float min = java.lang.Math.min(f17, f18);
            matrix.postScale(min, min);
        } else if (gLScaleType == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.FILL) {
            matrix.postScale(f17, f18);
        } else if (gLScaleType == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.FIT_CENTER) {
            float max = java.lang.Math.max(f17, f18);
            matrix.postScale(max, max);
        }
        matrix.postRotate(360 - kVar.f14773xbee9dd04);
        if (kVar == com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90 || kVar == com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270) {
            matrix.postTranslate(c3779x2754212.f14763xb7389127 / 2.0f, c3779x2754212.f14764x6be2dc6 / 2.0f);
        } else {
            matrix.postTranslate(c3779x2754212.f14764x6be2dc6 / 2.0f, c3779x2754212.f14763xb7389127 / 2.0f);
        }
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{point.x, point.y});
        return new android.graphics.Point((int) fArr[0], (int) fArr[1]);
    }

    /* renamed from: loadTexture */
    public static int m31167x8ced7955(int i17, java.nio.Buffer buffer, int i18, int i19, int i27) {
        int[] iArr = new int[1];
        if (i27 == -1) {
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d(TAG, "glGenTextures textureId: " + iArr[0]);
            m31148x89bf7a1e(3553, iArr[0]);
            android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            android.opengl.GLES20.glTexImage2D(3553, 0, i17, i18, i19, 0, i17, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, buffer);
        } else {
            m31148x89bf7a1e(3553, i27);
            android.opengl.GLES20.glTexSubImage2D(3553, 0, 0, 0, i18, i19, i17, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, buffer);
            iArr[0] = i27;
        }
        return iArr[0];
    }
}
