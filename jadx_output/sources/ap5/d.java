package ap5;

/* loaded from: classes14.dex */
public class d extends ap5.b {

    /* renamed from: m, reason: collision with root package name */
    public final int f12818m;

    /* renamed from: n, reason: collision with root package name */
    public final int f12819n;

    /* renamed from: o, reason: collision with root package name */
    public final int f12820o;

    /* renamed from: p, reason: collision with root package name */
    public final int f12821p;

    /* renamed from: q, reason: collision with root package name */
    public final int f12822q;

    /* renamed from: r, reason: collision with root package name */
    public int f12823r;

    public d(int i17, int i18, int i19, int i27, int i28, int i29, kotlin.jvm.internal.i iVar) {
        super(i17, i18, (i29 & 4) != 0 ? i17 : i19, (i29 & 8) != 0 ? i18 : i27, (i29 & 16) != 0 ? 1 : i28);
        this.f12823r = -1;
        int a17 = dp5.c.f242278a.a("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f12818m = a17;
        this.f12819n = android.opengl.GLES20.glGetAttribLocation(a17, "a_position");
        this.f12820o = android.opengl.GLES20.glGetAttribLocation(a17, "a_texCoord");
        this.f12821p = android.opengl.GLES20.glGetUniformLocation(a17, "texture");
        this.f12822q = android.opengl.GLES20.glGetUniformLocation(a17, "uMatrix");
    }

    @Override // ap5.b
    public void c() {
        int i17;
        int i18 = this.f12823r;
        if (i18 == -1 || !android.opengl.GLES20.glIsTexture(i18) || (i17 = this.f12818m) == 0) {
            return;
        }
        android.opengl.GLES20.glUseProgram(i17);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, this.f12823r);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 10497.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 10497.0f);
        android.opengl.GLES20.glUniform1i(this.f12821p, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.f12822q, 1, false, this.f12806h, 0);
        this.f12805g.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f12819n, 2, 5126, false, 0, (java.nio.Buffer) this.f12805g);
        int i19 = this.f12819n;
        android.opengl.GLES20.glEnableVertexAttribArray(i19);
        this.f12804f.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f12820o, 2, 5126, false, 0, (java.nio.Buffer) this.f12804f);
        int i27 = this.f12820o;
        android.opengl.GLES20.glEnableVertexAttribArray(i27);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(i19);
        android.opengl.GLES20.glDisableVertexAttribArray(i27);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glBindTexture(36197, 0);
    }
}
