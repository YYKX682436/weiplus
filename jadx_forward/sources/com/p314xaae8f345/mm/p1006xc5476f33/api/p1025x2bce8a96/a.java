package com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96;

/* loaded from: classes10.dex */
public class a implements android.opengl.GLSurfaceView.Renderer {

    /* renamed from: h, reason: collision with root package name */
    public static final float[] f156250h = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f156251i = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f156252a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f156253b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f156254c;

    /* renamed from: d, reason: collision with root package name */
    public int f156255d;

    /* renamed from: e, reason: collision with root package name */
    public int f156256e;

    /* renamed from: f, reason: collision with root package name */
    public java.nio.FloatBuffer f156257f;

    /* renamed from: g, reason: collision with root package name */
    public java.nio.FloatBuffer f156258g;

    public a() {
        java.util.Arrays.copyOf(f156251i, 8);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16640);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceChanged, surfaceWidth: %s, height: %s this %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), this);
        if (i17 == this.f156252a && i18 == this.f156253b) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceChanged change viewpoint");
        android.opengl.GLES20.glViewport(0, 0, i17, i18);
        this.f156252a = i17;
        this.f156253b = i18;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated this %s", this);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glDisable(2929);
        int c17 = com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.e.c("attribute vec4 a_position;                         \nattribute vec2 a_texCoord;                         \nvarying vec2 v_texCoord;                           \nuniform mat4 uMatrix;                              \nvoid main() {                                      \n   gl_Position = uMatrix * a_position;             \n   v_texCoord = a_texCoord;                        \n}                                                  \n", "#ifdef GL_ES                                       \nprecision highp float;                             \n#endif                                             \nvarying vec2 v_texCoord;                           \nuniform sampler2D y_texture;                       \nuniform sampler2D uv_texture;                      \nvoid main (void) {                                 \n   float r, g, b, y, u, v;                         \n   y = texture2D(y_texture, v_texCoord).r;         \n   u = texture2D(uv_texture, v_texCoord).a;        \n   v = texture2D(uv_texture, v_texCoord).r;        \n   u = u - 0.5;                                    \n   v = v - 0.5;                                    \n   r = y + 1.370705 * v;                           \n   g = y - 0.337633 * u - 0.698001 * v;            \n   b = y + 1.732446 * u;                           \n   gl_FragColor = vec4(r, g, b, 1.0);              \n}                                                  \n");
        this.f156256e = c17;
        if (c17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated, load program failed!");
        }
        android.opengl.GLES20.glGetAttribLocation(this.f156256e, "a_position");
        android.opengl.GLES20.glGetAttribLocation(this.f156256e, "a_texCoord");
        android.opengl.GLES20.glGetUniformLocation(this.f156256e, "y_texture");
        android.opengl.GLES20.glGetUniformLocation(this.f156256e, "uv_texture");
        android.opengl.GLES20.glGetUniformLocation(this.f156256e, "uMatrix");
        this.f156254c = com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.e.a();
        this.f156255d = com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.e.a();
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f156257f = asFloatBuffer;
        asFloatBuffer.put(f156250h);
        this.f156257f.position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f156258g = asFloatBuffer2;
        asFloatBuffer2.put(f156251i);
        this.f156258g.position(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated, yTextureId: %s, uvTextureId: %s this %s", java.lang.Integer.valueOf(this.f156254c), java.lang.Integer.valueOf(this.f156255d), this);
    }
}
