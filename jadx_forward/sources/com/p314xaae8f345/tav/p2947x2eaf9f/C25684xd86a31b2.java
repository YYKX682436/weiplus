package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.LookupFilter */
/* loaded from: classes14.dex */
public class C25684xd86a31b2 extends com.p314xaae8f345.tav.p2947x2eaf9f.C25685xacd027da {

    /* renamed from: FRAGMENT_SHADER */
    private static final java.lang.String f47514xb30c5cb4 = "sTexture;\nprecision mediump float;\nuniform sampler2D sLookupTexture; // lookup texture\nvarying highp vec2 vTextureCoord;\n\nuniform lowp float intensity;\nuniform lowp float uAlpha;\n\nvoid main()\n{\n    highp vec4 textureColor = texture2D(sTexture, vTextureCoord);\n    textureColor = clamp(textureColor, 0.0, 1.0);\n    highp float blueColor = textureColor.b * 63.0;\n    \n    highp vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n    \n    highp vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 8.0);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n    \n    highp float redPos = 0.125 * textureColor.r;\n    highp float greenPos = 0.125 * textureColor.g;\n    redPos = clamp(redPos, 2.0/512.0, 0.125- 2.0/512.0);\n    greenPos = clamp(greenPos, 2.0/512.0, 0.125- 2.0/512.0);\n    highp vec2 texPos1;\n    texPos1.x = (quad1.x * 0.125) + redPos;\n    texPos1.y = (quad1.y * 0.125)  + greenPos;\n    \n    highp vec2 texPos2;\n    texPos2.x = (quad2.x * 0.125)  + redPos;\n    texPos2.y = (quad2.y * 0.125) + greenPos;\n    \n    lowp vec4 newColor1 = texture2D(sLookupTexture, texPos1);\n    lowp vec4 newColor2 = texture2D(sLookupTexture, texPos2);\n    \n    lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n    newColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), intensity);\n    gl_FragColor = mix(vec4(0,0,0,1), newColor, uAlpha);\n}";

    /* renamed from: FRAGMENT_SHADER_PREFIX */
    private static final java.lang.String f47515x2c7f547d = "uniform sampler2D  ";

    /* renamed from: FRAGMENT_SHADER_PREFIX_OES */
    private static final java.lang.String f47516x7bc32e7b = " #extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES ";

    /* renamed from: VERTEX_SHADER */
    private static final java.lang.String f47517xeb40e2e0 = "uniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nattribute vec2 aPosition;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";

    /* renamed from: intensity */
    public float f47518x1dc31833;

    /* renamed from: intensityHandle */
    private int f47519x1f56403b;

    /* renamed from: lookupBitmap */
    public android.graphics.Bitmap f47520xc7cf0349;

    /* renamed from: lookupBitmapPath */
    public java.lang.String f47521x76c00f0e;

    /* renamed from: lookupTextureID */
    private int f47522xa141831c;

    /* renamed from: sLookupTextureHandle */
    private int f47523xa8d10056;

    public C25684xd86a31b2(android.graphics.Bitmap bitmap) {
        this(bitmap, 1.0f);
    }

    /* renamed from: equals */
    public boolean m96773xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.C25684xd86a31b2 c25684xd86a31b2 = (com.p314xaae8f345.tav.p2947x2eaf9f.C25684xd86a31b2) obj;
        if (this.f47518x1dc31833 == c25684xd86a31b2.f47518x1dc31833 && this.f47520xc7cf0349 == c25684xd86a31b2.f47520xc7cf0349) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25685xacd027da
    /* renamed from: finishDraw */
    public void mo96774x449bac77(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        super.mo96774x449bac77(c25745xc3945049);
        android.opengl.GLES20.glActiveTexture(33985);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25685xacd027da
    /* renamed from: initShaderForTextureInfo */
    public void mo96775x24d49c55(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        if (c25745xc3945049.f47893x602fd2f5 == 36197) {
            m96783xc918e5fe(f47517xeb40e2e0, " #extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES sTexture;\nprecision mediump float;\nuniform sampler2D sLookupTexture; // lookup texture\nvarying highp vec2 vTextureCoord;\n\nuniform lowp float intensity;\nuniform lowp float uAlpha;\n\nvoid main()\n{\n    highp vec4 textureColor = texture2D(sTexture, vTextureCoord);\n    textureColor = clamp(textureColor, 0.0, 1.0);\n    highp float blueColor = textureColor.b * 63.0;\n    \n    highp vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n    \n    highp vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 8.0);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n    \n    highp float redPos = 0.125 * textureColor.r;\n    highp float greenPos = 0.125 * textureColor.g;\n    redPos = clamp(redPos, 2.0/512.0, 0.125- 2.0/512.0);\n    greenPos = clamp(greenPos, 2.0/512.0, 0.125- 2.0/512.0);\n    highp vec2 texPos1;\n    texPos1.x = (quad1.x * 0.125) + redPos;\n    texPos1.y = (quad1.y * 0.125)  + greenPos;\n    \n    highp vec2 texPos2;\n    texPos2.x = (quad2.x * 0.125)  + redPos;\n    texPos2.y = (quad2.y * 0.125) + greenPos;\n    \n    lowp vec4 newColor1 = texture2D(sLookupTexture, texPos1);\n    lowp vec4 newColor2 = texture2D(sLookupTexture, texPos2);\n    \n    lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n    newColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), intensity);\n    gl_FragColor = mix(vec4(0,0,0,1), newColor, uAlpha);\n}");
        } else {
            m96783xc918e5fe(f47517xeb40e2e0, "uniform sampler2D  sTexture;\nprecision mediump float;\nuniform sampler2D sLookupTexture; // lookup texture\nvarying highp vec2 vTextureCoord;\n\nuniform lowp float intensity;\nuniform lowp float uAlpha;\n\nvoid main()\n{\n    highp vec4 textureColor = texture2D(sTexture, vTextureCoord);\n    textureColor = clamp(textureColor, 0.0, 1.0);\n    highp float blueColor = textureColor.b * 63.0;\n    \n    highp vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n    \n    highp vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 8.0);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n    \n    highp float redPos = 0.125 * textureColor.r;\n    highp float greenPos = 0.125 * textureColor.g;\n    redPos = clamp(redPos, 2.0/512.0, 0.125- 2.0/512.0);\n    greenPos = clamp(greenPos, 2.0/512.0, 0.125- 2.0/512.0);\n    highp vec2 texPos1;\n    texPos1.x = (quad1.x * 0.125) + redPos;\n    texPos1.y = (quad1.y * 0.125)  + greenPos;\n    \n    highp vec2 texPos2;\n    texPos2.x = (quad2.x * 0.125)  + redPos;\n    texPos2.y = (quad2.y * 0.125) + greenPos;\n    \n    lowp vec4 newColor1 = texture2D(sLookupTexture, texPos1);\n    lowp vec4 newColor2 = texture2D(sLookupTexture, texPos2);\n    \n    lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n    newColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), intensity);\n    gl_FragColor = mix(vec4(0,0,0,1), newColor, uAlpha);\n}");
        }
        this.f47523xa8d10056 = android.opengl.GLES20.glGetUniformLocation(this.f47534xed8f1e84, "sLookupTexture");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation sLookupTexture");
        if (this.f47523xa8d10056 == -1) {
            throw new java.lang.RuntimeException("Could not get uniform location for sLookupTexture");
        }
        this.f47519x1f56403b = android.opengl.GLES20.glGetUniformLocation(this.f47534xed8f1e84, "intensity");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation intensity");
        if (this.f47519x1f56403b == -1) {
            throw new java.lang.RuntimeException("Could not get uniform location for intensity");
        }
        if (this.f47522xa141831c == -1) {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            int i17 = iArr[0];
            android.opengl.GLES20.glBindTexture(3553, i17);
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glBindTexture mTextureID");
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
            android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glTexParameter");
            android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5293x7d837a53, m96782xcb62bb0d(), m96781x8725acc0(), 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5293x7d837a53, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
            android.opengl.GLUtils.texImage2D(3553, 0, this.f47520xc7cf0349, 0);
            this.f47522xa141831c = i17;
        }
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25685xacd027da
    /* renamed from: prepareDraw */
    public void mo96776xb1bad2eb(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, float[] fArr) {
        super.mo96776xb1bad2eb(c25745xc3945049, fArr);
        android.opengl.GLES20.glActiveTexture(33985);
        android.opengl.GLES20.glBindTexture(3553, this.f47522xa141831c);
        android.opengl.GLES20.glUniform1i(this.f47523xa8d10056, 1);
        android.opengl.GLES20.glUniform1f(this.f47519x1f56403b, this.f47518x1dc31833);
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25685xacd027da
    /* renamed from: release */
    public void mo96777x41012807() {
        super.mo96777x41012807();
        int i17 = this.f47522xa141831c;
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
            this.f47522xa141831c = -1;
        }
    }

    public C25684xd86a31b2(android.graphics.Bitmap bitmap, float f17) {
        this.f47522xa141831c = -1;
        this.f47520xc7cf0349 = bitmap;
        this.f47518x1dc31833 = f17;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25685xacd027da
    /* renamed from: clone */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25685xacd027da mo96772x5a5dd5d() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25684xd86a31b2 c25684xd86a31b2 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25684xd86a31b2(this.f47520xc7cf0349, this.f47518x1dc31833);
        com.p314xaae8f345.tav.p2947x2eaf9f.C25685xacd027da c25685xacd027da = this.f47540xd237c5d8;
        if (c25685xacd027da != null) {
            c25684xd86a31b2.m96788x2df8f796(c25685xacd027da.mo96772x5a5dd5d());
        }
        return c25684xd86a31b2;
    }
}
