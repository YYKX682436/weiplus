package com.tencent.mm.plugin.api.recordView;

/* loaded from: classes10.dex */
public class o implements android.opengl.GLSurfaceView.Renderer {

    /* renamed from: x, reason: collision with root package name */
    public static final float[] f74769x = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: y, reason: collision with root package name */
    public static final float[] f74770y = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: g, reason: collision with root package name */
    public java.nio.ByteBuffer f74777g;

    /* renamed from: h, reason: collision with root package name */
    public java.nio.ByteBuffer f74778h;

    /* renamed from: i, reason: collision with root package name */
    public int f74779i;

    /* renamed from: j, reason: collision with root package name */
    public int f74780j;

    /* renamed from: k, reason: collision with root package name */
    public int f74781k;

    /* renamed from: l, reason: collision with root package name */
    public int f74782l;

    /* renamed from: m, reason: collision with root package name */
    public int f74783m;

    /* renamed from: n, reason: collision with root package name */
    public int f74784n;

    /* renamed from: o, reason: collision with root package name */
    public int f74785o;

    /* renamed from: p, reason: collision with root package name */
    public int f74786p;

    /* renamed from: q, reason: collision with root package name */
    public java.nio.FloatBuffer f74787q;

    /* renamed from: r, reason: collision with root package name */
    public java.nio.FloatBuffer f74788r;

    /* renamed from: t, reason: collision with root package name */
    public int f74790t;

    /* renamed from: u, reason: collision with root package name */
    public final int f74791u;

    /* renamed from: v, reason: collision with root package name */
    public final int f74792v;

    /* renamed from: w, reason: collision with root package name */
    public java.nio.ByteBuffer f74793w;

    /* renamed from: a, reason: collision with root package name */
    public int f74771a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f74772b = 0;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f74773c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f74774d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f74775e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f74776f = 0;

    /* renamed from: s, reason: collision with root package name */
    public final float[] f74789s = new float[16];

    public o(int i17, int i18, int i19, int i27) {
        java.util.Arrays.copyOf(f74770y, 8);
        this.f74790t = 0;
        this.f74791u = 0;
        this.f74792v = 0;
        this.f74793w = null;
        int a17 = com.tencent.mm.plugin.api.recordView.e.a();
        this.f74791u = a17;
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        int i28 = iArr[0];
        if (i28 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCameraGLUtil", "gen frame buffer error");
            i28 = 0;
        }
        this.f74792v = i28;
        android.opengl.GLES20.glBindFramebuffer(36160, i28);
        android.opengl.GLES20.glBindTexture(3553, a17);
        android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, i19, i27, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, a17, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glViewport(0, 0, i19, i27);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        if (this.f74793w == null) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16640);
        if (this.f74781k != 0 && this.f74779i != -1 && this.f74780j != -1 && this.f74774d > 0 && this.f74775e > 0 && this.f74773c != null) {
            android.opengl.GLES20.glBindFramebuffer(36160, this.f74792v);
            int i17 = this.f74791u;
            android.opengl.GLES20.glBindTexture(3553, i17);
            android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, this.f74771a, this.f74772b, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i17, 0);
            android.opengl.GLES20.glBindTexture(3553, 0);
            android.opengl.GLES20.glViewport(0, 0, this.f74771a, this.f74772b);
            android.opengl.GLES20.glUseProgram(this.f74781k);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(3553, this.f74779i);
            android.opengl.GLES20.glTexImage2D(3553, 0, 6409, this.f74774d, this.f74775e, 0, 6409, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f74777g);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            android.opengl.GLES20.glUniform1i(this.f74784n, 0);
            android.opengl.GLES20.glActiveTexture(33985);
            android.opengl.GLES20.glBindTexture(3553, this.f74780j);
            android.opengl.GLES20.glTexImage2D(3553, 0, 6410, this.f74774d / 2, this.f74775e / 2, 0, 6410, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f74778h);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            android.opengl.GLES20.glUniform1i(this.f74785o, 1);
            float[] fArr = this.f74789s;
            android.opengl.Matrix.setIdentityM(fArr, 0);
            int i18 = this.f74776f;
            int i19 = this.f74790t;
            if (i19 == 90 || i19 == 270) {
                i18 = (((i18 - i19) + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) + 180) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
            }
            android.opengl.Matrix.setRotateM(this.f74789s, 0, i18, 0.0f, 0.0f, -1.0f);
            int i27 = this.f74776f;
            if (i27 == 90 || i27 == 270) {
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            } else {
                android.opengl.Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
            }
            android.opengl.GLES20.glUniformMatrix4fv(this.f74786p, 1, false, fArr, 0);
            this.f74787q.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f74783m, 2, 5126, false, 0, (java.nio.Buffer) this.f74787q);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f74783m);
            this.f74788r.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f74782l, 2, 5126, false, 0, (java.nio.Buffer) this.f74788r);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f74782l);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f74783m);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f74782l);
            android.opengl.GLES20.glBindTexture(3553, 0);
            android.opengl.GLES20.glFinish();
            this.f74793w.position(0);
            android.opengl.GLES20.glReadPixels(0, 0, this.f74771a, this.f74772b, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f74793w);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            android.opengl.GLES20.glUseProgram(0);
        }
        android.os.SystemClock.elapsedRealtime();
        android.os.SystemClock.elapsedRealtime();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.YUVDateRenderToRGBBufferRenderer", "onSurfaceChanged, surfaceWidth: %s, height: %s this %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), this);
        if (i17 == this.f74771a && i18 == this.f74772b) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.YUVDateRenderToRGBBufferRenderer", "onSurfaceChanged change viewpoint");
        android.opengl.GLES20.glViewport(0, 0, i17, i18);
        this.f74771a = i17;
        this.f74772b = i18;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.tencent.mars.xlog.Log.i("MicroMsg.YUVDateRenderToRGBBufferRenderer", "onSurfaceCreated this %s", this);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glDisable(2929);
        int c17 = com.tencent.mm.plugin.api.recordView.e.c("attribute vec4 a_position;                         \nattribute vec2 a_texCoord;                         \nvarying vec2 v_texCoord;                           \nuniform mat4 uMatrix;                              \nvoid main() {                                      \n   gl_Position = uMatrix * a_position;             \n   v_texCoord = a_texCoord;                        \n}                                                  \n", "#ifdef GL_ES                                       \nprecision highp float;                             \n#endif                                             \nvarying vec2 v_texCoord;                           \nuniform sampler2D y_texture;                       \nuniform sampler2D uv_texture;                      \nvoid main (void) {                                 \n   float r, g, b, y, u, v;                         \n   y = texture2D(y_texture, v_texCoord).r;         \n   u = texture2D(uv_texture, v_texCoord).a;        \n   v = texture2D(uv_texture, v_texCoord).r;        \n   u = u - 0.5;                                    \n   v = v - 0.5;                                    \n   r = y + 1.370705 * v;                           \n   g = y - 0.337633 * u - 0.698001 * v;            \n   b = y + 1.732446 * u;                           \n   gl_FragColor = vec4(r, g, b, 1.0);              \n}                                                  \n");
        this.f74781k = c17;
        if (c17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.YUVDateRenderToRGBBufferRenderer", "onSurfaceCreated, load program failed!");
        }
        this.f74783m = android.opengl.GLES20.glGetAttribLocation(this.f74781k, "a_position");
        this.f74782l = android.opengl.GLES20.glGetAttribLocation(this.f74781k, "a_texCoord");
        this.f74784n = android.opengl.GLES20.glGetUniformLocation(this.f74781k, "y_texture");
        this.f74785o = android.opengl.GLES20.glGetUniformLocation(this.f74781k, "uv_texture");
        this.f74786p = android.opengl.GLES20.glGetUniformLocation(this.f74781k, "uMatrix");
        this.f74779i = com.tencent.mm.plugin.api.recordView.e.a();
        this.f74780j = com.tencent.mm.plugin.api.recordView.e.a();
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f74787q = asFloatBuffer;
        asFloatBuffer.put(f74769x);
        this.f74787q.position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f74788r = asFloatBuffer2;
        asFloatBuffer2.put(f74770y);
        this.f74788r.position(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.YUVDateRenderToRGBBufferRenderer", "onSurfaceCreated, yTextureId: %s, uvTextureId: %s this %s", java.lang.Integer.valueOf(this.f74779i), java.lang.Integer.valueOf(this.f74780j), this);
    }
}
