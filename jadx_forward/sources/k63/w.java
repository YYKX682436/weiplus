package k63;

/* loaded from: classes10.dex */
public class w extends os0.a {
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public int H;

    public w(int i17, int i18, int i19, int i27, int i28, int i29) {
        super(i17, i18, i19, i27, i28, i29);
        this.H = -1;
        int t17 = rs0.i.f480829a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "#extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.C = t17;
        this.D = android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
        this.E = android.opengl.GLES20.glGetAttribLocation(t17, "a_texCoord");
        this.F = android.opengl.GLES20.glGetUniformLocation(t17, "texture");
        this.G = android.opengl.GLES20.glGetUniformLocation(t17, "uMatrix");
    }

    @Override // os0.a
    public void n() {
        super.n();
        android.opengl.GLES20.glDeleteProgram(this.C);
    }

    @Override // os0.a
    public void p() {
        if (this.H != -1) {
            android.opengl.GLES20.glUseProgram(this.C);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(36197, this.H);
            android.opengl.GLES20.glTexParameterf(36197, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(36197, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
            android.opengl.GLES20.glTexParameterf(36197, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(36197, 10243, 33071.0f);
            android.opengl.GLES20.glUniform1i(this.F, 0);
            android.opengl.GLES20.glUniformMatrix4fv(this.G, 1, false, this.f429536l, 0);
            this.f429532h.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.D, 2, 5126, false, 0, (java.nio.Buffer) this.f429532h);
            int i17 = this.D;
            android.opengl.GLES20.glEnableVertexAttribArray(i17);
            this.f429531g.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.E, 2, 5126, false, 0, (java.nio.Buffer) this.f429531g);
            int i18 = this.E;
            android.opengl.GLES20.glEnableVertexAttribArray(i18);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(i17);
            android.opengl.GLES20.glDisableVertexAttribArray(i18);
            android.opengl.GLES20.glBindTexture(36197, 0);
        }
    }

    @Override // os0.a
    public void r(int i17) {
        this.H = i17;
    }
}
