package az0;

/* loaded from: classes14.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public int f97263a;

    /* renamed from: b, reason: collision with root package name */
    public int f97264b;

    /* renamed from: c, reason: collision with root package name */
    public int f97265c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f97266d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f97267e;

    public n2() {
        this.f97267e = -1;
        this.f97267e = rs0.i.f480829a.t("uniform mat4 uMVPMatrix;\n            uniform float flipY;\n            uniform mat4 uSTMatrix;\n            attribute vec4 aPosition;\n            attribute vec4 aTextureCoord;\n            varying vec2 vTextureCoord;\n            void main() {\n                gl_Position = uMVPMatrix * aPosition * vec4(1.0, flipY, 1.0, 1.0);\n                vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n            }\n            ", "#extension GL_OES_EGL_image_external : require\n            precision highp float;\n            varying vec2 vTextureCoord;\n            uniform samplerExternalOES sTexture;\n            void main() {\n                gl_FragColor = texture2D(sTexture, vTextureCoord);\n            }\n            ");
    }

    public final void a(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaasMJCaptureSessionPreload", str + ": glError 0x" + java.lang.Integer.toHexString(glGetError));
        }
    }

    public final void b(int i17, float[] fArr, int i18, int i19, int i27, int i28, boolean z17) {
        if (this.f97267e == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaasMJCaptureSessionPreload", "program is not ready");
            return;
        }
        a("draw start");
        int i29 = this.f97267e;
        android.opengl.GLES20.glUseProgram(i29);
        a("glUseProgram");
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(36197, i17);
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(i29, "aPosition");
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        android.opengl.GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, (java.nio.Buffer) asFloatBuffer);
        int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(i29, "aTextureCoord");
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        android.opengl.GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, 5126, false, 0, (java.nio.Buffer) asFloatBuffer2);
        android.opengl.GLES20.glUniformMatrix4fv(android.opengl.GLES20.glGetUniformLocation(i29, "uSTMatrix"), 1, false, fArr, 0);
        android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(i29, "flipY"), z17 ? -1 : 1);
        android.opengl.GLES20.glUniform1i(android.opengl.GLES20.glGetUniformLocation(i29, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2284xec3e5bc3), 0);
        a("glViewport");
        int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(i29, "uMVPMatrix");
        float[] fArr2 = new float[16];
        android.opengl.Matrix.setIdentityM(fArr2, 0);
        if (i18 == i27 && i19 == i28) {
            android.opengl.GLES20.glUniformMatrix4fv(glGetUniformLocation, 1, false, fArr2, 0);
        } else {
            float f17 = i27 / i28;
            float f18 = i19;
            float f19 = i18;
            if (f17 > f18 / f19) {
                android.opengl.Matrix.scaleM(fArr2, 0, (f18 / f17) / f19, 1.0f, 1.0f);
            } else {
                android.opengl.Matrix.scaleM(fArr2, 0, 1.0f, (f19 * f17) / f18, 1.0f);
            }
            android.opengl.GLES20.glUniformMatrix4fv(glGetUniformLocation, 1, false, fArr2, 0);
        }
        android.opengl.GLES20.glViewport(0, 0, i27, i28);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16384);
        a("before glDrawArrays");
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        a("glDrawArrays");
        android.opengl.GLES20.glDisableVertexAttribArray(glGetAttribLocation);
        android.opengl.GLES20.glDisableVertexAttribArray(glGetAttribLocation2);
        android.opengl.GLES20.glBindTexture(36197, 0);
        android.opengl.GLES20.glUseProgram(0);
    }
}
