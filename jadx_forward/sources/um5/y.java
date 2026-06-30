package um5;

/* loaded from: classes10.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.FloatBuffer f510755a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.FloatBuffer f510756b;

    /* renamed from: c, reason: collision with root package name */
    public int f510757c;

    /* renamed from: d, reason: collision with root package name */
    public int f510758d;

    /* renamed from: e, reason: collision with root package name */
    public int f510759e;

    /* renamed from: f, reason: collision with root package name */
    public int f510760f;

    public y() {
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f510755a = asFloatBuffer;
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer2.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.f510756b = asFloatBuffer2;
        int m97613x737641e8 = com.p314xaae8f345.tav.p2959x5befac44.C25776x50c7b664.m97613x737641e8("\n            attribute vec4 aPosition;\n            attribute vec2 aTextureCoord;\n            varying vec2 vTextureCoord;\n            void main() {\n              gl_Position = aPosition;\n              vTextureCoord = aTextureCoord;\n            }\n        ", "\n            precision mediump float;\n            varying vec2 vTextureCoord;\n            uniform sampler2D sTexture;\n            void main() {\n              gl_FragColor = texture2D(sTexture, vTextureCoord);\n            }\n        ");
        this.f510757c = m97613x737641e8;
        if (m97613x737641e8 == 0) {
            new java.lang.RuntimeException("failed creating program");
        } else {
            this.f510758d = android.opengl.GLES20.glGetAttribLocation(m97613x737641e8, "aPosition");
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetAttribLocation aPosition");
            if (this.f510758d == -1) {
                new java.lang.RuntimeException("Could not get attribute location for aPosition");
            } else {
                this.f510759e = android.opengl.GLES20.glGetAttribLocation(this.f510757c, "aTextureCoord");
                com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetAttribLocation aTextureCoord");
                if (this.f510759e == -1) {
                    new java.lang.RuntimeException("Could not get attribute location for aTextureCoord");
                } else {
                    this.f510760f = android.opengl.GLES20.glGetUniformLocation(this.f510757c, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2284xec3e5bc3);
                    com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation sTexture");
                    if (this.f510760f == -1) {
                        new java.lang.RuntimeException("Could not get uniform location for sTexture");
                    }
                }
            }
        }
        android.opengl.GLES20.glDisable(3042);
    }
}
