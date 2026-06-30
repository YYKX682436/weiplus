package qm5;

/* loaded from: classes14.dex */
public abstract class k {
    public static int a(java.lang.String str, int i17) {
        int[] iArr = new int[1];
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        android.opengl.GLES20.glGetShaderInfoLog(glCreateShader);
        return 0;
    }

    public static int b(android.graphics.Bitmap bitmap, int i17, boolean z17) {
        int[] iArr = new int[1];
        if (i17 == -1) {
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            android.opengl.GLES20.glBindTexture(3553, iArr[0]);
            android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            android.opengl.GLES20.glBindTexture(3553, i17);
            android.opengl.GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            iArr[0] = i17;
        }
        if (z17) {
            bitmap.recycle();
        }
        return iArr[0];
    }
}
