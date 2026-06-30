package ap5;

/* loaded from: classes14.dex */
public class c extends ap5.b {

    /* renamed from: m, reason: collision with root package name */
    public final int f94344m;

    /* renamed from: n, reason: collision with root package name */
    public final int f94345n;

    /* renamed from: o, reason: collision with root package name */
    public final int f94346o;

    /* renamed from: p, reason: collision with root package name */
    public final int f94347p;

    /* renamed from: q, reason: collision with root package name */
    public final int f94348q;

    /* renamed from: r, reason: collision with root package name */
    public int f94349r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f94350s;

    public c(int i17, int i18, int i19, int i27, int i28, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(i17, i18, (i29 & 4) != 0 ? i17 : i19, (i29 & 8) != 0 ? i18 : i27, (i29 & 16) != 0 ? 1 : i28);
        this.f94349r = -1;
        this.f94350s = "MicroMsg.GLTextureRenderProcExternalTexture";
        int a17 = dp5.c.f323811a.a("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "#extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f94344m = a17;
        this.f94345n = android.opengl.GLES20.glGetAttribLocation(a17, "a_position");
        this.f94346o = android.opengl.GLES20.glGetAttribLocation(a17, "a_texCoord");
        this.f94347p = android.opengl.GLES20.glGetUniformLocation(a17, "texture");
        this.f94348q = android.opengl.GLES20.glGetUniformLocation(a17, "uMatrix");
    }

    @Override // ap5.b
    public void c() {
        int i17;
        int i18 = this.f94349r;
        if (i18 == -1 || !android.opengl.GLES20.glIsTexture(i18) || (i17 = this.f94344m) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f94350s, "draw with invalid texture");
            return;
        }
        android.opengl.GLES20.glUseProgram(i17);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(36197, this.f94349r);
        android.opengl.GLES20.glTexParameterf(36197, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(36197, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameterf(36197, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(36197, 10243, 33071.0f);
        android.opengl.GLES20.glUniform1i(this.f94347p, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.f94348q, 1, false, this.f94339h, 0);
        this.f94338g.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f94345n, 2, 5126, false, 0, (java.nio.Buffer) this.f94338g);
        int i19 = this.f94345n;
        android.opengl.GLES20.glEnableVertexAttribArray(i19);
        this.f94337f.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f94346o, 2, 5126, false, 0, (java.nio.Buffer) this.f94337f);
        int i27 = this.f94346o;
        android.opengl.GLES20.glEnableVertexAttribArray(i27);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(i19);
        android.opengl.GLES20.glDisableVertexAttribArray(i27);
        android.opengl.GLES20.glBindTexture(36197, 0);
    }
}
