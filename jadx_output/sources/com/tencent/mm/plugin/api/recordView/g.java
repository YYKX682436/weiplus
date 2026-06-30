package com.tencent.mm.plugin.api.recordView;

/* loaded from: classes10.dex */
public class g {

    /* renamed from: h, reason: collision with root package name */
    public static final float[] f74735h = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f74736i = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.Object f74737j = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public int f74738a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f74739b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f74740c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f74741d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f74742e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.nio.FloatBuffer f74743f;

    /* renamed from: g, reason: collision with root package name */
    public java.nio.FloatBuffer f74744g;

    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceChanged, surfaceWidth: %s, height: %s this %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), this);
        if (i17 == this.f74738a && i18 == this.f74739b) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceChanged change viewpoint");
        android.opengl.GLES20.glViewport(0, 0, i17, i18);
        this.f74738a = i17;
        this.f74739b = i18;
    }
}
