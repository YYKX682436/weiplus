package go0;

/* loaded from: classes14.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f355387a;

    /* renamed from: b, reason: collision with root package name */
    public is0.c f355388b;

    /* renamed from: c, reason: collision with root package name */
    public volatile go0.a f355389c;

    /* renamed from: d, reason: collision with root package name */
    public final os0.e f355390d;

    /* renamed from: e, reason: collision with root package name */
    public final int f355391e;

    /* renamed from: f, reason: collision with root package name */
    public int f355392f;

    /* renamed from: g, reason: collision with root package name */
    public int f355393g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f355394h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced f355395i;

    /* renamed from: j, reason: collision with root package name */
    public p05.v0 f355396j;

    /* renamed from: k, reason: collision with root package name */
    public p05.t0 f355397k;

    /* renamed from: l, reason: collision with root package name */
    public p05.u0 f355398l;

    /* renamed from: m, reason: collision with root package name */
    public p05.p0 f355399m;

    /* renamed from: n, reason: collision with root package name */
    public p05.q0 f355400n;

    public t1(boolean z17) {
        this.f355387a = z17;
        int t17 = rs0.i.f480829a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        void main() {\n            gl_Position = a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "#extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f355391e = t17;
        android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
        android.opengl.GLES20.glGetAttribLocation(t17, "a_texCoord");
        android.opengl.GLES20.glGetUniformLocation(t17, "texture");
        android.opengl.GLES20.glTexParameterf(36197, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(36197, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameterf(36197, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(36197, 10243, 33071.0f);
        if (this.f355390d == null) {
            this.f355390d = new os0.e(0, 0, 0, 0, 2, 0, 32, null);
        }
    }
}
