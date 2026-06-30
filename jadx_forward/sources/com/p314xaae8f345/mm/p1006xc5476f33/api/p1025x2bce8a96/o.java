package com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96;

/* loaded from: classes10.dex */
public class o implements android.opengl.GLSurfaceView.Renderer {

    /* renamed from: x, reason: collision with root package name */
    public static final float[] f156302x = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: y, reason: collision with root package name */
    public static final float[] f156303y = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: g, reason: collision with root package name */
    public java.nio.ByteBuffer f156310g;

    /* renamed from: h, reason: collision with root package name */
    public java.nio.ByteBuffer f156311h;

    /* renamed from: i, reason: collision with root package name */
    public int f156312i;

    /* renamed from: j, reason: collision with root package name */
    public int f156313j;

    /* renamed from: k, reason: collision with root package name */
    public int f156314k;

    /* renamed from: l, reason: collision with root package name */
    public int f156315l;

    /* renamed from: m, reason: collision with root package name */
    public int f156316m;

    /* renamed from: n, reason: collision with root package name */
    public int f156317n;

    /* renamed from: o, reason: collision with root package name */
    public int f156318o;

    /* renamed from: p, reason: collision with root package name */
    public int f156319p;

    /* renamed from: q, reason: collision with root package name */
    public java.nio.FloatBuffer f156320q;

    /* renamed from: r, reason: collision with root package name */
    public java.nio.FloatBuffer f156321r;

    /* renamed from: t, reason: collision with root package name */
    public int f156323t;

    /* renamed from: u, reason: collision with root package name */
    public final int f156324u;

    /* renamed from: v, reason: collision with root package name */
    public final int f156325v;

    /* renamed from: w, reason: collision with root package name */
    public java.nio.ByteBuffer f156326w;

    /* renamed from: a, reason: collision with root package name */
    public int f156304a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f156305b = 0;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f156306c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f156307d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f156308e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f156309f = 0;

    /* renamed from: s, reason: collision with root package name */
    public final float[] f156322s = new float[16];

    public o(int i17, int i18, int i19, int i27) {
        java.util.Arrays.copyOf(f156303y, 8);
        this.f156323t = 0;
        this.f156324u = 0;
        this.f156325v = 0;
        this.f156326w = null;
        int a17 = com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.e.a();
        this.f156324u = a17;
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        int i28 = iArr[0];
        if (i28 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightCameraGLUtil", "gen frame buffer error");
            i28 = 0;
        }
        this.f156325v = i28;
        android.opengl.GLES20.glBindFramebuffer(36160, i28);
        android.opengl.GLES20.glBindTexture(3553, a17);
        android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, i19, i27, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, a17, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glViewport(0, 0, i19, i27);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        if (this.f156326w == null) {
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16640);
        if (this.f156314k != 0 && this.f156312i != -1 && this.f156313j != -1 && this.f156307d > 0 && this.f156308e > 0 && this.f156306c != null) {
            android.opengl.GLES20.glBindFramebuffer(36160, this.f156325v);
            int i17 = this.f156324u;
            android.opengl.GLES20.glBindTexture(3553, i17);
            android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, this.f156304a, this.f156305b, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i17, 0);
            android.opengl.GLES20.glBindTexture(3553, 0);
            android.opengl.GLES20.glViewport(0, 0, this.f156304a, this.f156305b);
            android.opengl.GLES20.glUseProgram(this.f156314k);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(3553, this.f156312i);
            android.opengl.GLES20.glTexImage2D(3553, 0, 6409, this.f156307d, this.f156308e, 0, 6409, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, this.f156310g);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            android.opengl.GLES20.glUniform1i(this.f156317n, 0);
            android.opengl.GLES20.glActiveTexture(33985);
            android.opengl.GLES20.glBindTexture(3553, this.f156313j);
            android.opengl.GLES20.glTexImage2D(3553, 0, 6410, this.f156307d / 2, this.f156308e / 2, 0, 6410, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, this.f156311h);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            android.opengl.GLES20.glUniform1i(this.f156318o, 1);
            float[] fArr = this.f156322s;
            android.opengl.Matrix.setIdentityM(fArr, 0);
            int i18 = this.f156309f;
            int i19 = this.f156323t;
            if (i19 == 90 || i19 == 270) {
                i18 = (((i18 - i19) + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) + 180) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
            }
            android.opengl.Matrix.setRotateM(this.f156322s, 0, i18, 0.0f, 0.0f, -1.0f);
            int i27 = this.f156309f;
            if (i27 == 90 || i27 == 270) {
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            } else {
                android.opengl.Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
            }
            android.opengl.GLES20.glUniformMatrix4fv(this.f156319p, 1, false, fArr, 0);
            this.f156320q.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f156316m, 2, 5126, false, 0, (java.nio.Buffer) this.f156320q);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f156316m);
            this.f156321r.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f156315l, 2, 5126, false, 0, (java.nio.Buffer) this.f156321r);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f156315l);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f156316m);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f156315l);
            android.opengl.GLES20.glBindTexture(3553, 0);
            android.opengl.GLES20.glFinish();
            this.f156326w.position(0);
            android.opengl.GLES20.glReadPixels(0, 0, this.f156304a, this.f156305b, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, this.f156326w);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            android.opengl.GLES20.glUseProgram(0);
        }
        android.os.SystemClock.elapsedRealtime();
        android.os.SystemClock.elapsedRealtime();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YUVDateRenderToRGBBufferRenderer", "onSurfaceChanged, surfaceWidth: %s, height: %s this %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), this);
        if (i17 == this.f156304a && i18 == this.f156305b) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YUVDateRenderToRGBBufferRenderer", "onSurfaceChanged change viewpoint");
        android.opengl.GLES20.glViewport(0, 0, i17, i18);
        this.f156304a = i17;
        this.f156305b = i18;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YUVDateRenderToRGBBufferRenderer", "onSurfaceCreated this %s", this);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glDisable(2929);
        int c17 = com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.e.c("attribute vec4 a_position;                         \nattribute vec2 a_texCoord;                         \nvarying vec2 v_texCoord;                           \nuniform mat4 uMatrix;                              \nvoid main() {                                      \n   gl_Position = uMatrix * a_position;             \n   v_texCoord = a_texCoord;                        \n}                                                  \n", "#ifdef GL_ES                                       \nprecision highp float;                             \n#endif                                             \nvarying vec2 v_texCoord;                           \nuniform sampler2D y_texture;                       \nuniform sampler2D uv_texture;                      \nvoid main (void) {                                 \n   float r, g, b, y, u, v;                         \n   y = texture2D(y_texture, v_texCoord).r;         \n   u = texture2D(uv_texture, v_texCoord).a;        \n   v = texture2D(uv_texture, v_texCoord).r;        \n   u = u - 0.5;                                    \n   v = v - 0.5;                                    \n   r = y + 1.370705 * v;                           \n   g = y - 0.337633 * u - 0.698001 * v;            \n   b = y + 1.732446 * u;                           \n   gl_FragColor = vec4(r, g, b, 1.0);              \n}                                                  \n");
        this.f156314k = c17;
        if (c17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.YUVDateRenderToRGBBufferRenderer", "onSurfaceCreated, load program failed!");
        }
        this.f156316m = android.opengl.GLES20.glGetAttribLocation(this.f156314k, "a_position");
        this.f156315l = android.opengl.GLES20.glGetAttribLocation(this.f156314k, "a_texCoord");
        this.f156317n = android.opengl.GLES20.glGetUniformLocation(this.f156314k, "y_texture");
        this.f156318o = android.opengl.GLES20.glGetUniformLocation(this.f156314k, "uv_texture");
        this.f156319p = android.opengl.GLES20.glGetUniformLocation(this.f156314k, "uMatrix");
        this.f156312i = com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.e.a();
        this.f156313j = com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.e.a();
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f156320q = asFloatBuffer;
        asFloatBuffer.put(f156302x);
        this.f156320q.position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f156321r = asFloatBuffer2;
        asFloatBuffer2.put(f156303y);
        this.f156321r.position(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YUVDateRenderToRGBBufferRenderer", "onSurfaceCreated, yTextureId: %s, uvTextureId: %s this %s", java.lang.Integer.valueOf(this.f156312i), java.lang.Integer.valueOf(this.f156313j), this);
    }
}
