package com.p314xaae8f345.tav.p2967xc53e9ae1;

/* renamed from: com.tencent.tav.player.TAVGLUtils */
/* loaded from: classes14.dex */
public class C25851xe58d3f23 {
    private static final java.lang.String TAG = "TAVGLUtils";

    /* renamed from: _hellAccFlag_ */
    private byte f48763x7f11beae;

    /* renamed from: convertStreamToString */
    public static java.lang.String m98274xab1fa9f(java.io.InputStream inputStream) {
        java.util.Scanner useDelimiter = new java.util.Scanner(inputStream, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    /* renamed from: isSupportGLOES3 */
    public static boolean m98275x303c8480() {
        java.lang.String glGetString = android.opengl.GLES20.glGetString(7939);
        return glGetString != null && glGetString.contains("GL_OES_EGL_image_external_essl3");
    }

    /* renamed from: isSupportGLSL3 */
    public static boolean m98276x752b4dd0() {
        java.lang.String glGetString = android.opengl.GLES20.glGetString(35724);
        return glGetString != null && glGetString.contains("OpenGL ES GLSL ES 3");
    }

    /* renamed from: lerp */
    public static float m98277x32a177(float f17, float f18, float f19) {
        return (f17 * (1.0f - f19)) + (f18 * f19);
    }

    /* renamed from: loadShaderCode */
    public static java.lang.String m98278xf0a458f8(android.content.Context context, java.lang.String str) {
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = context.getAssets().open(str);
                java.lang.String m98274xab1fa9f = m98274xab1fa9f(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                return m98274xab1fa9f;
            } catch (java.lang.Throwable th6) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
                throw th6;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "loadShaderCode", e17);
            if (inputStream == null) {
                return "";
            }
            try {
                inputStream.close();
                return "";
            } catch (java.io.IOException unused3) {
                return "";
            }
        }
    }

    /* renamed from: saveBitmap */
    public static android.graphics.Bitmap m98279x2229cd0c(int i17, int i18, int i19) {
        int[] iArr = new int[1];
        android.opengl.GLES20.glBindTexture(3553, i17);
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i17, 0);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i18 * i19 * 4);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocateDirect.rewind();
        android.opengl.GLES20.glReadPixels(0, 0, i18, i19, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, allocateDirect);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_4444;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/tav/player/TAVGLUtils", "saveBitmap", "(III)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/tav/player/TAVGLUtils", "saveBitmap", "(III)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        allocateDirect.rewind();
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glDeleteFramebuffers(1, iArr, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        return createBitmap;
    }
}
