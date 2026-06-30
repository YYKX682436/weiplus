package com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96;

/* loaded from: classes10.dex */
public class g {

    /* renamed from: h, reason: collision with root package name */
    public static final float[] f156268h = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f156269i = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.Object f156270j = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public int f156271a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f156272b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f156273c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f156274d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f156275e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.nio.FloatBuffer f156276f;

    /* renamed from: g, reason: collision with root package name */
    public java.nio.FloatBuffer f156277g;

    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceChanged, surfaceWidth: %s, height: %s this %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), this);
        if (i17 == this.f156271a && i18 == this.f156272b) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceChanged change viewpoint");
        android.opengl.GLES20.glViewport(0, 0, i17, i18);
        this.f156271a = i17;
        this.f156272b = i18;
    }
}
