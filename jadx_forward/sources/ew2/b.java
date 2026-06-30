package ew2;

/* loaded from: classes14.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError != 0) {
            if (glGetError == 1285) {
                throw new ew2.a(glGetError, msg);
            }
            throw new android.opengl.GLException(glGetError, msg + ": GLES20 error: " + glGetError);
        }
    }
}
