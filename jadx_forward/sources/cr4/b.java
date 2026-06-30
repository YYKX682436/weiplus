package cr4;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f303517a;

    /* renamed from: b, reason: collision with root package name */
    public int f303518b;

    /* renamed from: c, reason: collision with root package name */
    public int f303519c;

    /* renamed from: d, reason: collision with root package name */
    public int f303520d;

    /* renamed from: e, reason: collision with root package name */
    public int f303521e;

    /* renamed from: f, reason: collision with root package name */
    public int f303522f;

    public b(boolean z17) {
        this.f303517a = z17;
        if (z17) {
            int t17 = rs0.i.f480829a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "#extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
            this.f303518b = t17;
            this.f303519c = android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
            this.f303520d = android.opengl.GLES20.glGetAttribLocation(this.f303518b, "a_texCoord");
            this.f303521e = android.opengl.GLES20.glGetUniformLocation(this.f303518b, "texture");
            this.f303522f = android.opengl.GLES20.glGetUniformLocation(this.f303518b, "uMatrix");
            android.opengl.GLES20.glTexParameterf(36197, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(36197, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
            android.opengl.GLES20.glTexParameterf(36197, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(36197, 10243, 33071.0f);
            return;
        }
        int t18 = rs0.i.f480829a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f303518b = t18;
        this.f303519c = android.opengl.GLES20.glGetAttribLocation(t18, "a_position");
        this.f303520d = android.opengl.GLES20.glGetAttribLocation(this.f303518b, "a_texCoord");
        this.f303521e = android.opengl.GLES20.glGetUniformLocation(this.f303518b, "texture");
        this.f303522f = android.opengl.GLES20.glGetUniformLocation(this.f303518b, "uMatrix");
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 10497.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 10497.0f);
    }

    public final void a(java.nio.FloatBuffer cubeBuffer, java.nio.FloatBuffer textureCoordBuff, int i17, float[] transformMatrix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cubeBuffer, "cubeBuffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureCoordBuff, "textureCoordBuff");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transformMatrix, "transformMatrix");
        if (this.f303517a) {
            if (i17 != -1) {
                android.opengl.GLES20.glUseProgram(this.f303518b);
                android.opengl.GLES20.glActiveTexture(33984);
                android.opengl.GLES20.glBindTexture(36197, i17);
                android.opengl.GLES20.glUniform1i(this.f303521e, 0);
                android.opengl.GLES20.glUniformMatrix4fv(this.f303522f, 1, false, transformMatrix, 0);
                cubeBuffer.position(0);
                android.opengl.GLES20.glVertexAttribPointer(this.f303519c, 2, 5126, false, 8, (java.nio.Buffer) cubeBuffer);
                android.opengl.GLES20.glEnableVertexAttribArray(this.f303519c);
                textureCoordBuff.position(0);
                android.opengl.GLES20.glVertexAttribPointer(this.f303520d, 2, 5126, false, 8, (java.nio.Buffer) textureCoordBuff);
                android.opengl.GLES20.glEnableVertexAttribArray(this.f303520d);
                android.opengl.GLES20.glDrawArrays(5, 0, 4);
                android.opengl.GLES20.glDisableVertexAttribArray(this.f303519c);
                android.opengl.GLES20.glDisableVertexAttribArray(this.f303520d);
                return;
            }
            return;
        }
        if (i17 == -1 || !android.opengl.GLES20.glIsTexture(i17)) {
            return;
        }
        android.opengl.GLES20.glUseProgram(this.f303518b);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, i17);
        android.opengl.GLES20.glUniform1i(this.f303521e, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.f303522f, 1, false, transformMatrix, 0);
        android.opengl.GLES20.glVertexAttribPointer(this.f303519c, 2, 5126, false, 0, (java.nio.Buffer) cubeBuffer);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f303519c);
        android.opengl.GLES20.glVertexAttribPointer(this.f303520d, 2, 5126, false, 0, (java.nio.Buffer) textureCoordBuff);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f303520d);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f303519c);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f303520d);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glBindTexture(36197, 0);
    }
}
