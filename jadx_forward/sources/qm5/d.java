package qm5;

/* loaded from: classes14.dex */
public class d extends qm5.j {

    /* renamed from: o, reason: collision with root package name */
    public int f446335o;

    /* renamed from: p, reason: collision with root package name */
    public float f446336p;

    /* renamed from: q, reason: collision with root package name */
    public int f446337q;

    /* renamed from: r, reason: collision with root package name */
    public int f446338r;

    /* renamed from: s, reason: collision with root package name */
    public int f446339s;

    /* renamed from: t, reason: collision with root package name */
    public int f446340t;

    /* renamed from: u, reason: collision with root package name */
    public int f446341u;

    public d() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}", "varying mediump vec2 textureCoordinate;\nvarying mediump vec2 textureCoordinate2;\n \n \nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform mediump int mvControl;\nuniform mediump int mvSwitch;\nuniform mediump float noiseLevel;\nuniform mediump float texelWidth;\nuniform mediump float texelHeight;\nconst mediump float thresholdChroma = 0.012;\nconst mediump float belta = -0.06 ;\n \nconst mediump mat3 RGBtoYUV = mat3(0.299,  0.587, 0.114, 0.5, -0.4187, -0.0813, -0.169, -0.3313,  0.5 );\nmediump vec3 rgb2yuv(mediump vec3 c)\n{\nmediump vec3 yuv = c*RGBtoYUV;\nreturn yuv;\n}\nmediump vec4 Sobel()\n{\n    mediump vec2 samplerSteps = vec2(1.0/texelWidth, 1.0/texelHeight);\n    mediump vec2 coords[8];\n    coords[0] = textureCoordinate - samplerSteps * 2.0;\n    coords[1] = textureCoordinate + vec2(0.0, -samplerSteps.y) * 2.0;\n    coords[2] = textureCoordinate + vec2(samplerSteps.x, -samplerSteps.y) * 2.0;\n\n    coords[3] = textureCoordinate - vec2(samplerSteps.x, 0.0) * 2.0;\n    coords[4] = textureCoordinate + vec2(samplerSteps.x, 0.0) * 2.0;\n\n    coords[5] = textureCoordinate + vec2(-samplerSteps.x, samplerSteps.y) * 2.0;\n    coords[6] = textureCoordinate + vec2(0.0, samplerSteps.y) * 2.0;\n    coords[7] = textureCoordinate + vec2(samplerSteps.x, samplerSteps.y) * 2.0;\n\n    mediump vec3 colors[8];\n    for(int i = 0; i < 8; ++i)\n    {\n        colors[i] = texture2D(inputImageTexture, coords[i]).rgb;\n    }\n\n    mediump vec4 src = texture2D(inputImageTexture, textureCoordinate);\n    mediump vec3 h = -colors[0] - 2.0 * colors[1] - colors[2] + colors[5] + 2.0 * colors[6] + colors[7];\n    mediump vec3 v = -colors[0] + colors[2] - 2.0 * colors[3] + 2.0 * colors[4] - colors[5] + colors[7];\n    return vec4(sqrt(h * h + v * v) * 1.2 , src.a);\n}\n \nvoid main()\n{\nmediump vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\nmediump vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\nmediump vec3 yuvCurFrame;\nmediump vec3 yuvPreFrame;\nmediump float thresholdLuma;\nif(mvControl == 1 || mvSwitch == 0) {\ngl_FragColor = textureColor;\n} else {\nyuvCurFrame = rgb2yuv(textureColor.rgb);\nyuvPreFrame = rgb2yuv(textureColor2.rgb);\n \nmediump float motionMask = 1.0;\nmediump float lumaDiff = abs(yuvCurFrame.r - yuvPreFrame.r);\nmediump float cbDiff = abs(yuvCurFrame.g - yuvPreFrame.g);\nmediump float crDiff = abs(yuvCurFrame.b - yuvPreFrame.b);\nmediump vec4 sobleImage  = Sobel();\n \nif(yuvCurFrame.r > 0.40 ) {\nthresholdLuma = noiseLevel * 1.0; \n} else {\nthresholdLuma = noiseLevel * 1.2; \n}\n \nif( lumaDiff >= thresholdLuma || sobleImage.r > 0.9 || sobleImage.g > 0.9 || sobleImage.b > 0.9) {\nmotionMask = 1.0;\n} else {\nmotionMask = 1.0 - exp(lumaDiff / belta);\n}\n \nif(cbDiff > thresholdChroma || cbDiff > thresholdChroma ) {\nmotionMask = 1.0;\n}\ngl_FragColor = vec4(motionMask) ;\n}\n}");
    }

    @Override // qm5.j, qm5.c
    public void e() {
        super.e();
        this.f446337q = android.opengl.GLES20.glGetUniformLocation(this.f446328d, "mvControl");
        this.f446338r = android.opengl.GLES20.glGetUniformLocation(this.f446328d, "mvSwitch");
        this.f446339s = android.opengl.GLES20.glGetUniformLocation(this.f446328d, "noiseLevel");
        this.f446340t = android.opengl.GLES20.glGetUniformLocation(this.f446328d, "texelWidth");
        this.f446341u = android.opengl.GLES20.glGetUniformLocation(this.f446328d, "texelHeight");
        this.f446335o = 1;
        this.f446336p = 0.05f;
        g(new qm5.a(this, this.f446337q, 0));
        int i17 = this.f446335o;
        this.f446335o = i17;
        g(new qm5.a(this, this.f446338r, i17));
        float f17 = this.f446336p;
        this.f446336p = f17;
        g(new qm5.b(this, this.f446339s, f17));
    }
}
