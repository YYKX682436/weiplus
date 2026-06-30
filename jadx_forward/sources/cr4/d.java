package cr4;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f303525a;

    /* renamed from: b, reason: collision with root package name */
    public int f303526b;

    /* renamed from: c, reason: collision with root package name */
    public int f303527c;

    /* renamed from: d, reason: collision with root package name */
    public is0.c f303528d;

    /* renamed from: e, reason: collision with root package name */
    public is0.c f303529e;

    /* renamed from: f, reason: collision with root package name */
    public is0.c f303530f;

    /* renamed from: g, reason: collision with root package name */
    public int f303531g;

    /* renamed from: h, reason: collision with root package name */
    public int f303532h;

    /* renamed from: i, reason: collision with root package name */
    public int f303533i;

    /* renamed from: j, reason: collision with root package name */
    public int f303534j;

    /* renamed from: k, reason: collision with root package name */
    public java.nio.ByteBuffer f303535k;

    /* renamed from: l, reason: collision with root package name */
    public java.nio.ByteBuffer f303536l;

    /* renamed from: m, reason: collision with root package name */
    public java.nio.ByteBuffer f303537m;

    /* renamed from: n, reason: collision with root package name */
    public int f303538n;

    public d() {
        int t17 = rs0.i.f480829a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n                precision highp float;\n                uniform sampler2D samplerY;\n                uniform sampler2D samplerU;\n                uniform sampler2D samplerV;\n                varying vec2 v_texCoord;\n                void main() {\n                  vec4 c = vec4((texture2D(samplerY, v_texCoord).r - 16./255.) * 1.164);\n                  vec4 U; vec4 V;\n                  U = vec4(texture2D(samplerU, v_texCoord).r - 128./255.);\n                  V = vec4(texture2D(samplerV, v_texCoord).r - 128./255.);\n                  c += V * vec4(1.596, -0.813, 0, 0);\n                  c += U * vec4(0, -0.392, 2.017, 0);\n                  c.a = 1.0;\n                  gl_FragColor = c;\n                }\n            ");
        this.f303525a = t17;
        this.f303526b = android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
        this.f303527c = android.opengl.GLES20.glGetAttribLocation(this.f303525a, "a_texCoord");
        this.f303531g = android.opengl.GLES20.glGetUniformLocation(this.f303525a, "samplerY");
        this.f303532h = android.opengl.GLES20.glGetUniformLocation(this.f303525a, "samplerU");
        this.f303533i = android.opengl.GLES20.glGetUniformLocation(this.f303525a, "samplerV");
        this.f303534j = android.opengl.GLES20.glGetUniformLocation(this.f303525a, "uMatrix");
        this.f303528d = is0.b.b(true, 14L);
        this.f303529e = is0.b.b(true, 14L);
        this.f303530f = is0.b.b(true, 14L);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
    }
}
