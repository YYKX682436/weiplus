package cr4;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q05.c f303504a;

    /* renamed from: b, reason: collision with root package name */
    public int f303505b;

    /* renamed from: c, reason: collision with root package name */
    public int f303506c;

    /* renamed from: d, reason: collision with root package name */
    public int f303507d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f303508e;

    /* renamed from: f, reason: collision with root package name */
    public final int f303509f;

    /* renamed from: g, reason: collision with root package name */
    public final int f303510g;

    /* renamed from: h, reason: collision with root package name */
    public final int f303511h;

    /* renamed from: i, reason: collision with root package name */
    public final int f303512i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f303513j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f303514k;

    /* renamed from: l, reason: collision with root package name */
    public java.nio.FloatBuffer f303515l;

    /* renamed from: m, reason: collision with root package name */
    public java.nio.FloatBuffer f303516m;

    public a() {
        int t17 = rs0.i.f480829a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        void main() {\n            gl_Position = a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f303509f = t17;
        this.f303510g = android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
        this.f303511h = android.opengl.GLES20.glGetAttribLocation(t17, "a_texCoord");
        this.f303512i = android.opengl.GLES20.glGetUniformLocation(t17, "texture");
        android.opengl.GLES20.glGetUniformLocation(t17, "uMatrix");
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 10497.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 10497.0f);
        try {
            this.f303504a = new q05.c(4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipSharperRendererProgram", "sifeng sharpen shader create success");
        } catch (java.lang.Exception unused) {
            this.f303504a = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipSharperRendererProgram", "sifeng sharpen shader create failed");
        }
        this.f303513j = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        this.f303514k = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    }
}
