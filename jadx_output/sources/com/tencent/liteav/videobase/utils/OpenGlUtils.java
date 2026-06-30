package com.tencent.liteav.videobase.utils;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class OpenGlUtils {
    private static final java.lang.String TAG = "OpenGlUtils";

    /* renamed from: com.tencent.liteav.videobase.utils.OpenGlUtils$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46790a;

        static {
            int[] iArr = new int[com.tencent.liteav.base.util.k.values().length];
            f46790a = iArr;
            try {
                iArr[com.tencent.liteav.base.util.k.ROTATION_90.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f46790a[com.tencent.liteav.base.util.k.ROTATION_180.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f46790a[com.tencent.liteav.base.util.k.ROTATION_270.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f46790a[com.tencent.liteav.base.util.k.NORMAL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public static void attachTextureToFrameBuffer(int i17, int i18) {
        android.opengl.GLES20.glBindFramebuffer(36160, i18);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i17, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
    }

    public static void bindFramebuffer(int i17, int i18) {
        android.opengl.GLES20.glBindFramebuffer(i17, i18);
    }

    public static void bindTexture(int i17, int i18) {
        android.opengl.GLES20.glBindTexture(i17, i18);
    }

    public static void checkGlError(java.lang.String str) {
    }

    public static void convertYuvFormat(com.tencent.liteav.videobase.base.GLConstants.PixelFormatType pixelFormatType, java.lang.Object obj, com.tencent.liteav.videobase.base.GLConstants.PixelFormatType pixelFormatType2, java.lang.Object obj2, int i17, int i18) {
        int value = pixelFormatType.getValue();
        int value2 = pixelFormatType2.getValue();
        boolean z17 = obj instanceof java.nio.ByteBuffer;
        if ((z17 && (obj2 instanceof java.nio.ByteBuffer)) ? nativeConvertYuvFormatBufferToBuffer(value, (java.nio.ByteBuffer) obj, value2, (java.nio.ByteBuffer) obj2, i17, i18) : (z17 && (obj2 instanceof byte[])) ? nativeConvertYuvFormatBufferToArray(value, (java.nio.ByteBuffer) obj, value2, (byte[]) obj2, i17, i18) : ((obj instanceof byte[]) && (obj2 instanceof java.nio.ByteBuffer)) ? nativeConvertYuvFormatArrayToBuffer(value, (byte[]) obj, value2, (java.nio.ByteBuffer) obj2, i17, i18) : nativeConvertYuvFormatArrayToArray(value, (byte[]) obj, value2, (byte[]) obj2, i17, i18)) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Do not support " + pixelFormatType + " to " + pixelFormatType2);
    }

    public static java.nio.FloatBuffer createNormalCubeVerticesBuffer() {
        float[] fArr = com.tencent.liteav.videobase.base.GLConstants.f46643d;
        return (java.nio.FloatBuffer) java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).position(0);
    }

    public static int createTexture(int i17, int i18, int i19, int i27) {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        com.tencent.liteav.base.util.LiteavLog.d(TAG, "glGenTextures textureId: " + iArr[0]);
        android.opengl.GLES20.glBindTexture(3553, iArr[0]);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
        android.opengl.GLES20.glTexImage2D(3553, 0, i19, i17, i18, 0, i27, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
        return iArr[0];
    }

    public static java.nio.FloatBuffer createTextureCoordsBuffer(com.tencent.liteav.base.util.k kVar, boolean z17, boolean z18) {
        float[] fArr = com.tencent.liteav.videobase.base.GLConstants.f46644e;
        float[] fArr2 = new float[fArr.length];
        initTextureCoordsBuffer(fArr2, kVar, z17, z18);
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr2).position(0);
        return asFloatBuffer;
    }

    public static void deleteFrameBuffer(int i17) {
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
        }
    }

    public static void deleteShaderId(int i17) {
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteShader(i17);
        }
    }

    public static void deleteTexture(int i17) {
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
        }
    }

    public static void detachTextureFromFrameBuffer(int i17) {
        android.opengl.GLES20.glBindFramebuffer(36160, i17);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
    }

    private static float flip(float f17) {
        return f17 == 0.0f ? 1.0f : 0.0f;
    }

    public static int generateFrameBufferId() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        return iArr[0];
    }

    public static int generateTextureOES() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        android.opengl.GLES20.glBindTexture(36197, iArr[0]);
        android.opengl.GLES20.glTexParameterf(36197, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(36197, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    public static java.lang.Object getCurrentContext() {
        return com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 17 ? android.opengl.EGL14.eglGetCurrentContext() : ((javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL()).eglGetCurrentContext();
    }

    public static long getGLContextNativeHandle(java.lang.Object obj) {
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 17 || !(obj instanceof android.opengl.EGLContext)) {
            return 0L;
        }
        return com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? ((android.opengl.EGLContext) obj).getNativeHandle() : ((android.opengl.EGLContext) obj).getHandle();
    }

    public static int getGLErrorCount() {
        int i17 = 0;
        while (android.opengl.GLES20.glGetError() != 0) {
            i17++;
        }
        return i17;
    }

    public static void glViewport(int i17, int i18, int i19, int i27) {
        android.opengl.GLES20.glViewport(i17, i18, i19, i27);
    }

    public static void initTextureCoordsBuffer(float[] fArr, com.tencent.liteav.base.util.k kVar, boolean z17, boolean z18) {
        float[] fArr2 = com.tencent.liteav.videobase.base.GLConstants.f46644e;
        if (kVar != null) {
            int i17 = com.tencent.liteav.videobase.utils.OpenGlUtils.AnonymousClass1.f46790a[kVar.ordinal()];
            if (i17 == 1) {
                fArr2 = com.tencent.liteav.videobase.base.GLConstants.f46646g;
            } else if (i17 == 2) {
                fArr2 = com.tencent.liteav.videobase.base.GLConstants.f46647h;
            } else if (i17 == 3) {
                fArr2 = com.tencent.liteav.videobase.base.GLConstants.f46645f;
            }
        }
        java.lang.System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        if (z17) {
            fArr[0] = flip(fArr[0]);
            fArr[2] = flip(fArr[2]);
            fArr[4] = flip(fArr[4]);
            fArr[6] = flip(fArr[6]);
        }
        if (z18) {
            fArr[1] = flip(fArr[1]);
            fArr[3] = flip(fArr[3]);
            fArr[5] = flip(fArr[5]);
            fArr[7] = flip(fArr[7]);
        }
    }

    public static boolean isNoGLContext(java.lang.Object obj) {
        return obj instanceof javax.microedition.khronos.egl.EGLContext ? obj.equals(javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) : (obj instanceof android.opengl.EGLContext) && getGLContextNativeHandle(obj) == 0;
    }

    public static int loadTexture(android.graphics.Bitmap bitmap, int i17, boolean z17) {
        int[] iArr = new int[1];
        if (i17 == -1) {
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            com.tencent.liteav.base.util.LiteavLog.d(TAG, "glGenTextures textureId: " + iArr[0]);
            bindTexture(3553, iArr[0]);
            android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            bindTexture(3553, i17);
            android.opengl.GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            iArr[0] = i17;
        }
        if (z17) {
            bitmap.recycle();
        }
        return iArr[0];
    }

    public static void loadYuv420DataToTextures(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int[] iArr) {
        if (byteBuffer.isDirect()) {
            nativeLoadYuv420ByteBufferToTextures(byteBuffer, i17, i18, i19, iArr);
        } else {
            nativeLoadYuv420ByteArrayToTextures(byteBuffer.array(), i17, i18, i19, iArr);
        }
    }

    private static native boolean nativeConvertYuvFormatArrayToArray(int i17, byte[] bArr, int i18, byte[] bArr2, int i19, int i27);

    private static native boolean nativeConvertYuvFormatArrayToBuffer(int i17, byte[] bArr, int i18, java.nio.ByteBuffer byteBuffer, int i19, int i27);

    private static native boolean nativeConvertYuvFormatBufferToArray(int i17, java.nio.ByteBuffer byteBuffer, int i18, byte[] bArr, int i19, int i27);

    private static native boolean nativeConvertYuvFormatBufferToBuffer(int i17, java.nio.ByteBuffer byteBuffer, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27);

    public static native void nativeCopyDataFromByteArrayToByteBuffer(byte[] bArr, java.nio.ByteBuffer byteBuffer, int i17);

    public static native void nativeCopyDataFromByteBufferToByteArray(java.nio.ByteBuffer byteBuffer, byte[] bArr, int i17);

    public static native void nativeCopyDataFromByteBufferToByteBuffer(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, int i17);

    public static native void nativeCopyYuvFromByteBufferToByteBuffer(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, int i19, int i27, int i28);

    private static native void nativeLoadYuv420ByteArrayToTextures(byte[] bArr, int i17, int i18, int i19, int[] iArr);

    private static native void nativeLoadYuv420ByteBufferToTextures(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int[] iArr);

    public static void readPixels(int i17, int i18, int i19, int i27, java.lang.Object obj) {
        if (obj instanceof java.nio.Buffer) {
            java.nio.Buffer buffer = (java.nio.Buffer) obj;
            buffer.position(0);
            android.opengl.GLES20.glReadPixels(i17, i18, i19, i27, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, buffer);
        } else if (obj instanceof byte[]) {
            android.opengl.GLES20.glReadPixels(i17, i18, i19, i27, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, java.nio.ByteBuffer.wrap((byte[]) obj));
        } else {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "read pixels failed due to unsupport object. ".concat(java.lang.String.valueOf(obj)));
        }
    }

    public static android.graphics.Point reverseMappingPoint(com.tencent.liteav.videobase.base.GLConstants.GLScaleType gLScaleType, com.tencent.liteav.base.util.k kVar, android.graphics.Point point, com.tencent.liteav.base.util.Size size, com.tencent.liteav.base.util.Size size2) {
        float f17 = (size2.width * 1.0f) / size.width;
        float f18 = (size2.height * 1.0f) / size.height;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate((-size.width) / 2.0f, (-size.height) / 2.0f);
        if (gLScaleType == com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP) {
            float min = java.lang.Math.min(f17, f18);
            matrix.postScale(min, min);
        } else if (gLScaleType == com.tencent.liteav.videobase.base.GLConstants.GLScaleType.FILL) {
            matrix.postScale(f17, f18);
        } else if (gLScaleType == com.tencent.liteav.videobase.base.GLConstants.GLScaleType.FIT_CENTER) {
            float max = java.lang.Math.max(f17, f18);
            matrix.postScale(max, max);
        }
        matrix.postRotate(360 - kVar.mValue);
        if (kVar == com.tencent.liteav.base.util.k.ROTATION_90 || kVar == com.tencent.liteav.base.util.k.ROTATION_270) {
            matrix.postTranslate(size2.height / 2.0f, size2.width / 2.0f);
        } else {
            matrix.postTranslate(size2.width / 2.0f, size2.height / 2.0f);
        }
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{point.x, point.y});
        return new android.graphics.Point((int) fArr[0], (int) fArr[1]);
    }

    public static int loadTexture(int i17, java.nio.Buffer buffer, int i18, int i19, int i27) {
        int[] iArr = new int[1];
        if (i27 == -1) {
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            com.tencent.liteav.base.util.LiteavLog.d(TAG, "glGenTextures textureId: " + iArr[0]);
            bindTexture(3553, iArr[0]);
            android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            android.opengl.GLES20.glTexImage2D(3553, 0, i17, i18, i19, 0, i17, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, buffer);
        } else {
            bindTexture(3553, i27);
            android.opengl.GLES20.glTexSubImage2D(3553, 0, 0, 0, i18, i19, i17, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, buffer);
            iArr[0] = i27;
        }
        return iArr[0];
    }
}
