package br4;

/* loaded from: classes14.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f23692a;

    /* renamed from: d, reason: collision with root package name */
    public java.nio.FloatBuffer f23695d;

    /* renamed from: e, reason: collision with root package name */
    public java.nio.FloatBuffer f23696e;

    /* renamed from: f, reason: collision with root package name */
    public br4.a f23697f;

    /* renamed from: g, reason: collision with root package name */
    public qm5.f f23698g;

    /* renamed from: h, reason: collision with root package name */
    public is0.c f23699h;

    /* renamed from: i, reason: collision with root package name */
    public is0.c f23700i;

    /* renamed from: j, reason: collision with root package name */
    public is0.a f23701j;

    /* renamed from: s, reason: collision with root package name */
    public java.nio.FloatBuffer f23710s;

    /* renamed from: t, reason: collision with root package name */
    public java.nio.FloatBuffer f23711t;

    /* renamed from: b, reason: collision with root package name */
    public final is0.c[] f23693b = new is0.c[3];

    /* renamed from: c, reason: collision with root package name */
    public final int[] f23694c = new int[3];

    /* renamed from: k, reason: collision with root package name */
    public boolean f23702k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f23703l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23704m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23705n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f23706o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f23707p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f23708q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f23709r = 0;

    /* renamed from: u, reason: collision with root package name */
    public final float[] f23712u = new float[8];

    /* renamed from: v, reason: collision with root package name */
    public final float[] f23713v = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: w, reason: collision with root package name */
    public final float[] f23714w = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: x, reason: collision with root package name */
    public final float[] f23715x = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: y, reason: collision with root package name */
    public final float[] f23716y = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    public c() {
        this.f23692a = 0;
        this.f23699h = null;
        this.f23700i = null;
        this.f23701j = null;
        f();
        this.f23692a = br4.f.a("attribute vec4 vPosition;attribute vec2 vTexCoord;varying vec2 tc;void main() {  gl_Position = vPosition;  tc = vTexCoord;}", "precision highp float;uniform sampler2D samplerY;uniform sampler2D samplerU;uniform sampler2D samplerV;uniform sampler2D samplerUV;uniform int yuvType;varying vec2 tc;void main() {  vec4 c = vec4((texture2D(samplerY, tc).r - 16./255.) * 1.164);  vec4 U; vec4 V; if (yuvType == 0 || yuvType == 1){      U = vec4(texture2D(samplerU, tc).r - 128./255.);      V = vec4(texture2D(samplerV, tc).r - 128./255.);  } else {      U = vec4(texture2D(samplerUV, tc).a - 128./255.);      V = vec4(texture2D(samplerUV, tc).r - 128./255.);  }   c += V * vec4(1.596, -0.813, 0, 0);  c += U * vec4(0, -0.392, 2.017, 0);  c.a = 1.0;  gl_FragColor = c;}");
        int i17 = 0;
        while (true) {
            is0.c[] cVarArr = this.f23693b;
            if (i17 >= cVarArr.length) {
                break;
            }
            cVarArr[i17] = is0.b.b(true, 14L);
            i17++;
        }
        br4.a aVar = new br4.a();
        this.f23697f = aVar;
        aVar.e();
        aVar.f23665a = br4.f.a("attribute vec4 vPosition;attribute vec2 vTexCoord;varying vec2 tc;void main() {  gl_Position = vPosition;  tc = vTexCoord;}", "varying highp vec2 tc;\nuniform sampler2D inputImageTexture;\nuniform mediump float smoothDegree;\nuniform mediump int showCounter;\nuniform mediump int showMode;\n\nuniform mediump float brightness;\nuniform mediump float texelWidth;\nuniform mediump float texelHeight;\n\nprecision highp float;\nconst mat3 RGBtoYUV = mat3(0.299,  0.587, 0.114, 0.5, -0.4187, -0.0813, -0.169, -0.3313,  0.5 );    //full range\nconst mat3 YUVtoRGB = mat3(1.1643, 1.5958, 0.0, 1.1643, -0.8129, -0.3917, 1.1643, 0.0, 2.017 );\n\nconst highp mat3 saturateMatrix = mat3(\n1.1102, -0.0598, -0.061,\n-0.0774, 1.0826, -0.1186,\n-0.0228, -0.0228, 1.1772);\n\n\nvec3 rgb2hsv(vec3 c)\n{\n    vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);\n    vec4 p = mix(vec4(c.bg, K.wz), vec4(c.gb, K.xy), step(c.b, c.g));\n    vec4 q = mix(vec4(p.xyw, c.r), vec4(c.r, p.yzx), step(p.x, c.r));\n\n    float d = q.x - min(q.w, q.y);\n    float e = 1.0e-10;\n    return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);\n}\n\nvec3 hsv2rgb(vec3 c)\n{\n    vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);\n    vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);\n    return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);\n}\n\nvec3 yuv2rgb(vec3 c)\n{\n    vec3 rgb = YUVtoRGB*c;\n    return rgb;\n}\nvec3 rgb2yuv(vec3 c)\n{\n    vec3 yuv = c*RGBtoYUV;\n    return yuv;\n}\nmediump float hardLight(mediump float color){\n    if (color <= 0.5)\n    color = color * color * 2.0;\n    else\n    color = 1.0 - ((1.0 - color)*(1.0 - color) * 2.0);\n    return color;\n}\n\nfloat lum(vec3 v)\n{\n    return dot(v, vec3(0.299, 0.587, 0.114));\n}\n\nvec4 getValue(vec4 newValue, vec4 originValue)\n{\n    return mix(newValue, originValue, step(lum(newValue.rgb), lum(originValue.rgb)));\n}\n\nvec4 Sobel2()\n{\n    vec2 samplerSteps = vec2(1.0/texelWidth, 1.0/texelHeight);\n    vec2 coords[8];\n    coords[0] = tc - samplerSteps * 2.0;\n    coords[1] = tc + vec2(0.0, -samplerSteps.y) * 2.0;\n    coords[2] = tc + vec2(samplerSteps.x, -samplerSteps.y) * 2.0;\n\n    coords[3] = tc - vec2(samplerSteps.x, 0.0) * 2.0;\n    coords[4] = tc + vec2(samplerSteps.x, 0.0) * 2.0;\n\n    coords[5] = tc + vec2(-samplerSteps.x, samplerSteps.y) * 2.0;\n    coords[6] = tc + vec2(0.0, samplerSteps.y) * 2.0;\n    coords[7] = tc + vec2(samplerSteps.x, samplerSteps.y) * 2.0;\n\n    vec3 colors[8];\n    for(int i = 0; i < 8; ++i)\n    {\n        colors[i] = texture2D(inputImageTexture, coords[i]).rgb;\n    }\n\n    vec4 src = texture2D(inputImageTexture, tc);\n    vec3 h = -colors[0] - 2.0 * colors[1] - colors[2] + colors[5] + 2.0 * colors[6] + colors[7];\n    vec3 v = -colors[0] + colors[2] - 2.0 * colors[3] + 2.0 * colors[4] - colors[5] + colors[7];\n    return vec4(mix(src.rgb, sqrt(h * h + v * v), 1.0), src.a);\n}\n\nvec4 maxFilter()\n{\n    vec2 samplerSteps = vec2(1.0/texelWidth, 1.0/texelHeight);\n    vec2 texCoord[13];\n    vec4 vMin;\n    vec2 thisCoord = tc;\n\n    texCoord[0] = thisCoord + vec2(0, -samplerSteps.y * 2.0);\n    texCoord[1] = thisCoord - samplerSteps;\n    texCoord[2] = thisCoord + vec2(0, -samplerSteps.y);\n    texCoord[3] = thisCoord + vec2(samplerSteps.x, -samplerSteps.y);\n    texCoord[4] = thisCoord + vec2(-samplerSteps.x * 2.0, 0.0);\n    texCoord[5] = thisCoord + vec2(-samplerSteps.x, 0.0);\n    texCoord[6] = thisCoord;\n    texCoord[7] = thisCoord + vec2(samplerSteps.x, 0.0);\n    texCoord[8] = thisCoord + vec2(samplerSteps.x * 2.0, 0.0);\n    texCoord[9] = thisCoord + vec2(-samplerSteps.x, samplerSteps.y);\n    texCoord[10] = thisCoord + vec2(0.0, samplerSteps.y);\n    texCoord[11] = thisCoord + samplerSteps;\n    texCoord[12] = thisCoord + vec2(0.0, 2.0* samplerSteps.y);\n\n\n\n    {\n        vec4 vTemp;\n\n        vMin = texture2D(inputImageTexture, texCoord[0]);\n\n        vTemp = texture2D(inputImageTexture, texCoord[1]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[2]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[3]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[4]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[5]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[6]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[7]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[8]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[9]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[10]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[11]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[12]);\n        vMin = getValue(vTemp, vMin);\n    }\n    return vMin;\n}\n\nvoid main()\n{\n    //highp vec4 smoothNew;\n    highp vec3 yuv;\n    highp vec3 rgb;\n\n    vec3 centralColor = texture2D(inputImageTexture,  tc ).rgb;\n    //vec3 maxFilt = texture2D(inputImageTexture3, tc).rgb;  //canny\n    //vec3 lunkuo  = texture2D(inputImageTexture3, tc).rgb;\n\n    vec2 blurCoordinates[20];\n    vec2 imageStep = vec2(1.5/texelWidth, 1.5/texelHeight);\n\n    //重新调整了滤波的范围和权重，减少水波纹\n    blurCoordinates[0] = tc + vec2(0.0, -4.0) * imageStep;\n    blurCoordinates[1] = tc + vec2(2.0, -3.0) * imageStep;\n    blurCoordinates[2] = tc + vec2(3.0, -2.0) * imageStep;\n    blurCoordinates[3] = tc + vec2(4.0, 0.0) * imageStep;\n    blurCoordinates[4] = tc + vec2(3.0, 2.0) * imageStep;\n    blurCoordinates[5] = tc + vec2(2.0, 3.0) * imageStep;\n    blurCoordinates[6] = tc + vec2(0.0, 4.0) * imageStep;\n    blurCoordinates[7] = tc + vec2(-2.0, 3.0) * imageStep;\n    blurCoordinates[8] = tc + vec2(-3.0, 2.0) * imageStep;\n    blurCoordinates[9] = tc + vec2(-4.0, 0.0) * imageStep;\n    blurCoordinates[10] = tc + vec2(-3.0, -2.0) * imageStep;\n    blurCoordinates[11] = tc + vec2(-2.0, -3.0) * imageStep;\n\n    blurCoordinates[12] = tc + vec2(0.0, -2.0) * imageStep;\n    blurCoordinates[13] = tc + vec2(-1.0, -1.0) * imageStep;\n    blurCoordinates[14] = tc + vec2(-2.0, 0.0) * imageStep;\n    blurCoordinates[15] = tc + vec2(-1.0, 1.0) * imageStep;\n    blurCoordinates[16] = tc + vec2(0.0, 2.0) * imageStep;\n    blurCoordinates[17] = tc + vec2(1.0, 1.0) * imageStep;\n    blurCoordinates[18] = tc + vec2(2.0, 0.0) * imageStep;\n    blurCoordinates[19] = tc + vec2(1.0, -1.0) * imageStep;\n\n    //vec3 centralColor = texture2D(inputImageTexture, tc).rgb;\n    //float sampleColor = centralColor.g * 24.0;\n    vec3 sampleColor = centralColor * 24.0;\n\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[0]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[1]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[2]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[3]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[4]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[5]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[6]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[7]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[8]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[9]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[10]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[11]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[12]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[13]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[14]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[15]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[16]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[17]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[18]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[19]).rgb;\n\n    sampleColor = sampleColor/44.0;\n\n    float dis = centralColor.g - sampleColor.g + 0.5;   //high\n\n    for (int i = 0; i < 5; i++) {\n        dis = hardLight(dis);\n    }\n\n    // 0.065 -> 1.125, 加大滤波强度\n    vec3 result = centralColor * 1.125 - dis * 0.125; //central+(central-dis)*0.065\n\n    float hue = dot(result, vec3(0.299,0.587,0.114)) - 0.3;   //luminance\n    hue = pow(clamp(hue, 0.0, 1.0), 0.3);\n\n    yuv= rgb2yuv(sampleColor);\n    float cr=yuv.y-0.094;\n    float cb=yuv.z+0.0745;\n\n    float tx = ((25.59*cr-19.19*cb)*255.0 + 51.0)*0.04;\n    float ty = ((25.59*cr+19.19*cb)*255.0 + 77.0)*0.07;\n    float val0 = tx*tx + ty*ty;\n\n    float chroma_sum=yuv.y+yuv.z+1.0;\n    float chroma_diff=yuv.y-yuv.z;\n    float chroma_diff_th = 0.1-(yuv.x/10.0);\n\n    float face = 1.0;\n    if(yuv.z>-0.1667 && yuv.z<0.0294 && chroma_sum>0.7804 && chroma_sum<1.098 && chroma_diff>chroma_diff_th){\n        if(yuv.x<0.3922) {\n            if(val0<1700.0) {\n                face = 0.0;\n            } else {\n                hue = 0.0;\n            }\n        } else {\n            if(val0<3150.0) {\n                face = 0.0;\n            } else {\n                hue = 0.0;\n            }\n        }\n    } else {\n        hue = 0.0;\n    }\n\n    result = centralColor * (1.0 - hue) + result * hue;\n    result = result+vec3(brightness*0.1);\n\n    // 这里可以进一步简化计算\n    if(showMode == 1 /*|| showMode == 2*/)\n    {\n         result = vec3(hue);\n    }\n    else if(showMode == 0)\n    {\n        result = centralColor;\n    }\n\n    vec3 smoothNew = mix(centralColor, result, smoothDegree);\n\n\n//showCounter用于显示mask\nif(showCounter == 1)\n{\n    smoothNew =vec3(face);\n}\n\n//mode3:显示边缘\nif(showMode == 3)\n{\n    vec3 maxValue = maxFilter().rgb;\n    float lumOrigin = lum(centralColor);\n    float lumMax = lum(maxValue) + 0.001;\n    float blendColor = min(lumOrigin / lumMax, 1.0);\n\n    float smoothDegree2 =  0.8 + (smoothDegree/5.0); //约束范围：0.8~1.0\n    smoothNew =mix(centralColor, vec3(blendColor), smoothDegree2);\n}\n\n//mode4:显示轮廓\nif(showMode == 4)\n{\n    vec4 src  = Sobel2();\n    // saturation合并到level中\n    max(src.r, src.g);\n    float lum = (max(max(src.r, src.g),src.b) + min(min(src.r, src.g), src.b)) / 2.0;\n    src = vec4(mix(vec3(lum), src.rgb, 0.0), src.a);  //intensity = 0.0\n\n    // level filter: colorLevel.x = dark = 0.33, colorLevel.y = light = 0.60\n    float colorLevelx = 0.3;\n    float colorLevely = 0.60;\n    //float gamma = 0.99;\n    float gamma = smoothDegree;\n    src.rgb = clamp((src.rgb - colorLevelx) / (colorLevely - colorLevelx), 0.0, 1.0);\n    src.rgb = clamp(pow(src.rgb, vec3(gamma)), 0.0, 1.0);\n    smoothNew = src.rgb;\n}\n\ngl_FragColor = vec4(smoothNew, 1.0);\n}");
        aVar.f23666b = br4.f.a("attribute vec4 vPosition;attribute vec2 vTexCoord;varying vec2 tc;void main() {  gl_Position = vPosition;  tc = vTexCoord;}", "precision mediump float;\nvarying vec2 tc;\nuniform sampler2D inputImageTexture;\nvoid main() {\n    vec4 color = texture2D(inputImageTexture, tc);\n    gl_FragColor = color;\n}");
        this.f23699h = is0.b.b(true, 14L);
        is0.a a17 = is0.b.f294391a.a(14L);
        this.f23701j = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipGLSProgram", "initRenderOutputFbo, texture:%s, fbo:%s", this.f23699h, a17);
        is0.c b17 = is0.b.b(true, 14L);
        this.f23700i = b17;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipGLSProgram", "init stFilterOutputTexture, texture:%s ", b17);
        br4.a aVar2 = this.f23697f;
        int i18 = this.f23700i.f294395e;
        aVar2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipGLSProgram", "initData, texture:%s", java.lang.Integer.valueOf(i18));
        aVar2.f23667c = i18;
        float[] fArr = aVar2.f23683s;
        aVar2.g(2, fArr);
        float[] fArr2 = aVar2.f23682r;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(fArr2.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        aVar2.f23674j = asFloatBuffer;
        asFloatBuffer.put(fArr2);
        aVar2.f23674j.position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        aVar2.f23684t = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        aVar2.f23684t.position(0);
        qm5.f fVar = new qm5.f(false);
        this.f23698g = fVar;
        fVar.e();
        this.f23698g.f(this.f23708q, this.f23709r);
        qm5.f fVar2 = this.f23698g;
        int i19 = this.f23700i.f294395e;
        if (fVar2.A) {
            return;
        }
        fVar2.f364819t = i19;
        fVar2.i();
    }

    public final void a() {
        android.opengl.GLES20.glFinish();
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glUseProgram(0);
    }

    public void b(float[] fArr, float[] fArr2) {
        java.nio.FloatBuffer floatBuffer = this.f23695d;
        if (floatBuffer == null || floatBuffer.capacity() != fArr.length) {
            this.f23695d = java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.f23695d.put(fArr);
        this.f23695d.position(0);
        java.nio.FloatBuffer floatBuffer2 = this.f23696e;
        if (floatBuffer2 == null || floatBuffer2.capacity() != fArr2.length) {
            this.f23696e = java.nio.ByteBuffer.allocateDirect(fArr2.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.f23696e.put(fArr2);
        this.f23696e.position(0);
    }

    public void c(float[] fArr, float[] fArr2, float[] fArr3) {
        java.nio.FloatBuffer floatBuffer = this.f23710s;
        if (floatBuffer == null || floatBuffer.capacity() != fArr.length) {
            this.f23710s = java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.f23710s.put(fArr);
        this.f23710s.position(0);
        this.f23698g.l(2, fArr2, fArr3);
        java.nio.FloatBuffer floatBuffer2 = this.f23711t;
        if (floatBuffer2 == null || floatBuffer2.capacity() != fArr3.length) {
            this.f23711t = java.nio.ByteBuffer.allocateDirect(fArr3.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.f23711t.put(fArr3);
        this.f23711t.position(0);
    }

    public void d(int i17, int i18, int i19, boolean z17) {
        boolean z18;
        if (i17 == 0 || i17 == 1) {
            this.f23702k = false;
            this.f23704m = false;
        } else {
            this.f23702k = (i18 & 8) != 0;
            this.f23704m = (i18 & 32) != 0;
        }
        if (z17 && ((z18 = this.f23702k) != this.f23703l || this.f23704m != this.f23705n)) {
            this.f23703l = z18;
            boolean z19 = this.f23704m;
            this.f23705n = z19;
            if (z19 && z18) {
                br4.a aVar = this.f23697f;
                int i27 = this.f23700i.f294395e;
                aVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.VoipGLSProgram", "set input texture:%s", java.lang.Integer.valueOf(i27));
                aVar.f23667c = i27;
                qm5.f fVar = this.f23698g;
                int i28 = this.f23700i.f294395e;
                if (!fVar.A) {
                    fVar.f364819t = i28;
                    fVar.i();
                }
                this.f23698g.m(false);
            } else if (z19 && !z18) {
                this.f23698g.m(true);
            } else if (!z19 && z18) {
                br4.a aVar2 = this.f23697f;
                int i29 = this.f23699h.f294395e;
                aVar2.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.VoipGLSProgram", "set input texture:%s", java.lang.Integer.valueOf(i29));
                aVar2.f23667c = i29;
            }
        }
        boolean z27 = this.f23704m;
        float[] fArr = this.f23712u;
        float[] fArr2 = this.f23714w;
        float[] fArr3 = this.f23713v;
        float[] fArr4 = this.f23716y;
        float[] fArr5 = this.f23715x;
        if (z27 && this.f23702k) {
            this.f23699h.i(this.f23701j, this.f23708q, this.f23709r);
            b(fArr5, fArr4);
            android.opengl.GLES20.glViewport(0, 0, this.f23708q, this.f23709r);
            e(i17);
            a();
            qm5.f fVar2 = this.f23698g;
            int i37 = this.f23700i.f294395e;
            if (!fVar2.A) {
                fVar2.f364819t = i37;
                fVar2.i();
            }
            int i38 = this.f23699h.f294395e;
            c(fArr3, fArr2, fArr);
            this.f23698g.b(this.f23699h.f294395e, i38, i38, this.f23710s, this.f23711t);
            a();
            this.f23697f.h(fArr3, fArr2);
            this.f23697f.c();
            a();
        } else if (z27 && !this.f23702k) {
            this.f23699h.i(this.f23701j, this.f23708q, this.f23709r);
            b(fArr5, fArr4);
            android.opengl.GLES20.glViewport(0, 0, this.f23708q, this.f23709r);
            e(i17);
            a();
            int i39 = this.f23699h.f294395e;
            c(fArr3, fArr2, fArr);
            this.f23698g.b(this.f23699h.f294395e, i39, i39, this.f23710s, this.f23711t);
            a();
        } else if (z27 || !this.f23702k) {
            e(i17);
        } else {
            this.f23699h.i(this.f23701j, this.f23708q, this.f23709r);
            b(fArr5, fArr4);
            android.opengl.GLES20.glViewport(0, 0, this.f23708q, this.f23709r);
            e(i17);
            a();
            this.f23697f.h(fArr3, fArr2);
            this.f23697f.c();
            a();
        }
        a();
    }

    public final void e(int i17) {
        int i18;
        android.opengl.GLES20.glUseProgram(this.f23692a);
        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.f23692a, "vPosition");
        if (glGetAttribLocation < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoipGLSProgram", "int mPositionHandle error: %s, reinit program", java.lang.Integer.valueOf(glGetAttribLocation));
            android.opengl.GLES20.glDeleteProgram(this.f23692a);
            int a17 = br4.f.a("attribute vec4 vPosition;attribute vec2 vTexCoord;varying vec2 tc;void main() {  gl_Position = vPosition;  tc = vTexCoord;}", "precision highp float;uniform sampler2D samplerY;uniform sampler2D samplerU;uniform sampler2D samplerV;uniform sampler2D samplerUV;uniform int yuvType;varying vec2 tc;void main() {  vec4 c = vec4((texture2D(samplerY, tc).r - 16./255.) * 1.164);  vec4 U; vec4 V; if (yuvType == 0 || yuvType == 1){      U = vec4(texture2D(samplerU, tc).r - 128./255.);      V = vec4(texture2D(samplerV, tc).r - 128./255.);  } else {      U = vec4(texture2D(samplerUV, tc).a - 128./255.);      V = vec4(texture2D(samplerUV, tc).r - 128./255.);  }   c += V * vec4(1.596, -0.813, 0, 0);  c += U * vec4(0, -0.392, 2.017, 0);  c.a = 1.0;  gl_FragColor = c;}");
            this.f23692a = a17;
            glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(a17, "vPosition");
        }
        int i19 = glGetAttribLocation;
        android.opengl.GLES20.glEnableVertexAttribArray(i19);
        android.opengl.GLES20.glVertexAttribPointer(i19, 2, 5126, false, 8, (java.nio.Buffer) this.f23695d);
        int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(this.f23692a, "vTexCoord");
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        android.opengl.GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, 5126, false, 8, (java.nio.Buffer) this.f23696e);
        int i27 = 2;
        int[] iArr = this.f23694c;
        if (i17 == 0 || i17 == 1) {
            iArr[0] = android.opengl.GLES20.glGetUniformLocation(this.f23692a, "samplerY");
            iArr[1] = android.opengl.GLES20.glGetUniformLocation(this.f23692a, "samplerU");
            iArr[2] = android.opengl.GLES20.glGetUniformLocation(this.f23692a, "samplerV");
            i18 = 0;
            i27 = 3;
        } else if (i17 == 3) {
            iArr[0] = android.opengl.GLES20.glGetUniformLocation(this.f23692a, "samplerY");
            iArr[1] = android.opengl.GLES20.glGetUniformLocation(this.f23692a, "samplerUV");
            i18 = 0;
        } else {
            i18 = 0;
            i27 = 0;
        }
        while (i18 < i27) {
            android.opengl.GLES20.glActiveTexture(33984 + i18);
            android.opengl.GLES20.glBindTexture(3553, this.f23693b[i18].f294395e);
            android.opengl.GLES20.glUniform1i(iArr[i18], i18);
            i18++;
        }
        int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f23692a, "yuvType");
        if (glGetUniformLocation >= 0) {
            android.opengl.GLES20.glUniform1i(glGetUniformLocation, i17);
        }
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
    }

    public synchronized void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipGLSProgram", "%s do destroy", java.lang.Integer.valueOf(hashCode()));
        is0.c cVar = this.f23699h;
        if (cVar != null) {
            cVar.close();
        }
        is0.c cVar2 = this.f23700i;
        if (cVar2 != null) {
            cVar2.close();
        }
        for (is0.c cVar3 : this.f23693b) {
            if (cVar3 != null) {
                cVar3.close();
            }
        }
        is0.a aVar = this.f23701j;
        if (aVar != null) {
            aVar.close();
        }
        android.opengl.GLES20.glDeleteProgram(this.f23692a);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glFinish();
        java.nio.FloatBuffer floatBuffer = this.f23696e;
        if (floatBuffer != null) {
            floatBuffer.clear();
        }
        java.nio.FloatBuffer floatBuffer2 = this.f23695d;
        if (floatBuffer2 != null) {
            floatBuffer2.clear();
        }
        this.f23699h = null;
        this.f23700i = null;
        this.f23701j = null;
        this.f23695d = null;
        this.f23696e = null;
        this.f23692a = 0;
        br4.a aVar2 = this.f23697f;
        if (aVar2 != null) {
            aVar2.e();
        }
        qm5.f fVar = this.f23698g;
        if (fVar != null) {
            fVar.a();
        }
    }

    public final void g(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19) {
        this.f23693b[i19].a(i17, i18, 6409, byteBuffer, 9729, 33071);
    }
}
