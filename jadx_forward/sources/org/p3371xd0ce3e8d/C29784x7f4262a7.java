package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.GlUtil */
/* loaded from: classes14.dex */
public class C29784x7f4262a7 {

    /* renamed from: org.webrtc.GlUtil$GlOutOfMemoryException */
    /* loaded from: classes14.dex */
    public static class GlOutOfMemoryException extends android.opengl.GLException {
        public GlOutOfMemoryException(int i17, java.lang.String str) {
            super(i17, str);
        }
    }

    private C29784x7f4262a7() {
    }

    /* renamed from: checkNoGLES2Error */
    public static void m155561x7db050b2(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError != 0) {
            if (glGetError == 1285) {
                throw new org.p3371xd0ce3e8d.C29784x7f4262a7.GlOutOfMemoryException(glGetError, str);
            }
            throw new android.opengl.GLException(glGetError, str + ": GLES20 error: " + glGetError);
        }
    }

    /* renamed from: createFloatBuffer */
    public static java.nio.FloatBuffer m155562xa4cb3f20(float[] fArr) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    /* renamed from: generateTexture */
    public static int m155563xe06639e6(int i17) {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        int i18 = iArr[0];
        android.opengl.GLES20.glBindTexture(i17, i18);
        android.opengl.GLES20.glTexParameterf(i17, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(i17, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameterf(i17, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(i17, 10243, 33071.0f);
        m155561x7db050b2("generateTexture");
        return i18;
    }
}
