package ap5;

/* loaded from: classes14.dex */
public class c extends ap5.b {

    /* renamed from: m, reason: collision with root package name */
    public final int f12811m;

    /* renamed from: n, reason: collision with root package name */
    public final int f12812n;

    /* renamed from: o, reason: collision with root package name */
    public final int f12813o;

    /* renamed from: p, reason: collision with root package name */
    public final int f12814p;

    /* renamed from: q, reason: collision with root package name */
    public final int f12815q;

    /* renamed from: r, reason: collision with root package name */
    public int f12816r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f12817s;

    public c(int i17, int i18, int i19, int i27, int i28, int i29, kotlin.jvm.internal.i iVar) {
        super(i17, i18, (i29 & 4) != 0 ? i17 : i19, (i29 & 8) != 0 ? i18 : i27, (i29 & 16) != 0 ? 1 : i28);
        this.f12816r = -1;
        this.f12817s = "MicroMsg.GLTextureRenderProcExternalTexture";
        int a17 = dp5.c.f242278a.a("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "#extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f12811m = a17;
        this.f12812n = android.opengl.GLES20.glGetAttribLocation(a17, "a_position");
        this.f12813o = android.opengl.GLES20.glGetAttribLocation(a17, "a_texCoord");
        this.f12814p = android.opengl.GLES20.glGetUniformLocation(a17, "texture");
        this.f12815q = android.opengl.GLES20.glGetUniformLocation(a17, "uMatrix");
    }

    @Override // ap5.b
    public void c() {
        int i17;
        int i18 = this.f12816r;
        if (i18 == -1 || !android.opengl.GLES20.glIsTexture(i18) || (i17 = this.f12811m) == 0) {
            com.tencent.mars.xlog.Log.e(this.f12817s, "draw with invalid texture");
            return;
        }
        android.opengl.GLES20.glUseProgram(i17);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(36197, this.f12816r);
        android.opengl.GLES20.glTexParameterf(36197, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(36197, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameterf(36197, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(36197, 10243, 33071.0f);
        android.opengl.GLES20.glUniform1i(this.f12814p, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.f12815q, 1, false, this.f12806h, 0);
        this.f12805g.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f12812n, 2, 5126, false, 0, (java.nio.Buffer) this.f12805g);
        int i19 = this.f12812n;
        android.opengl.GLES20.glEnableVertexAttribArray(i19);
        this.f12804f.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f12813o, 2, 5126, false, 0, (java.nio.Buffer) this.f12804f);
        int i27 = this.f12813o;
        android.opengl.GLES20.glEnableVertexAttribArray(i27);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(i19);
        android.opengl.GLES20.glDisableVertexAttribArray(i27);
        android.opengl.GLES20.glBindTexture(36197, 0);
    }
}
