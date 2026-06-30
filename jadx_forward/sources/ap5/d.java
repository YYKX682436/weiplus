package ap5;

/* loaded from: classes14.dex */
public class d extends ap5.b {

    /* renamed from: m, reason: collision with root package name */
    public final int f94351m;

    /* renamed from: n, reason: collision with root package name */
    public final int f94352n;

    /* renamed from: o, reason: collision with root package name */
    public final int f94353o;

    /* renamed from: p, reason: collision with root package name */
    public final int f94354p;

    /* renamed from: q, reason: collision with root package name */
    public final int f94355q;

    /* renamed from: r, reason: collision with root package name */
    public int f94356r;

    public d(int i17, int i18, int i19, int i27, int i28, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(i17, i18, (i29 & 4) != 0 ? i17 : i19, (i29 & 8) != 0 ? i18 : i27, (i29 & 16) != 0 ? 1 : i28);
        this.f94356r = -1;
        int a17 = dp5.c.f323811a.a("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f94351m = a17;
        this.f94352n = android.opengl.GLES20.glGetAttribLocation(a17, "a_position");
        this.f94353o = android.opengl.GLES20.glGetAttribLocation(a17, "a_texCoord");
        this.f94354p = android.opengl.GLES20.glGetUniformLocation(a17, "texture");
        this.f94355q = android.opengl.GLES20.glGetUniformLocation(a17, "uMatrix");
    }

    @Override // ap5.b
    public void c() {
        int i17;
        int i18 = this.f94356r;
        if (i18 == -1 || !android.opengl.GLES20.glIsTexture(i18) || (i17 = this.f94351m) == 0) {
            return;
        }
        android.opengl.GLES20.glUseProgram(i17);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, this.f94356r);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 10497.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 10497.0f);
        android.opengl.GLES20.glUniform1i(this.f94354p, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.f94355q, 1, false, this.f94339h, 0);
        this.f94338g.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f94352n, 2, 5126, false, 0, (java.nio.Buffer) this.f94338g);
        int i19 = this.f94352n;
        android.opengl.GLES20.glEnableVertexAttribArray(i19);
        this.f94337f.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f94353o, 2, 5126, false, 0, (java.nio.Buffer) this.f94337f);
        int i27 = this.f94353o;
        android.opengl.GLES20.glEnableVertexAttribArray(i27);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(i19);
        android.opengl.GLES20.glDisableVertexAttribArray(i27);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glBindTexture(36197, 0);
    }
}
