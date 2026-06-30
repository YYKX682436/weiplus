package os0;

/* loaded from: classes10.dex */
public class e extends os0.a {
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public int H;

    public /* synthetic */ e(int i17, int i18, int i19, int i27, int i28, int i29, int i37, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, i18, (i37 & 4) != 0 ? i17 : i19, (i37 & 8) != 0 ? i18 : i27, (i37 & 16) != 0 ? 1 : i28, (i37 & 32) != 0 ? 1 : i29);
    }

    @Override // os0.a
    public void n() {
        super.n();
        android.opengl.GLES20.glDeleteProgram(this.C);
    }

    @Override // os0.a
    public void p() {
        int i17 = this.H;
        if (i17 == -1 || !android.opengl.GLES20.glIsTexture(i17)) {
            return;
        }
        android.opengl.GLES20.glUseProgram(this.C);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, this.H);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 10497.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 10497.0f);
        android.opengl.GLES20.glUniform1i(this.F, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.G, 1, false, this.f429536l, 0);
        this.f429532h.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.D, 2, 5126, false, 0, (java.nio.Buffer) this.f429532h);
        int i18 = this.D;
        android.opengl.GLES20.glEnableVertexAttribArray(i18);
        this.f429531g.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.E, 2, 5126, false, 0, (java.nio.Buffer) this.f429531g);
        int i19 = this.E;
        android.opengl.GLES20.glEnableVertexAttribArray(i19);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(i18);
        android.opengl.GLES20.glDisableVertexAttribArray(i19);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glBindTexture(36197, 0);
    }

    @Override // os0.a
    public void r(int i17) {
        this.H = i17;
    }

    public e(int i17, int i18, int i19, int i27, int i28, int i29) {
        super(i17, i18, i19, i27, i28, i29);
        this.H = -1;
        int t17 = rs0.i.f480829a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.C = t17;
        this.D = android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
        this.E = android.opengl.GLES20.glGetAttribLocation(t17, "a_texCoord");
        this.F = android.opengl.GLES20.glGetUniformLocation(t17, "texture");
        this.G = android.opengl.GLES20.glGetUniformLocation(t17, "uMatrix");
    }
}
