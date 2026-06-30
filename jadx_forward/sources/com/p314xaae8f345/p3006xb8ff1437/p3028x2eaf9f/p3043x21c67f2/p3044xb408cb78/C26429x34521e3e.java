package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78;

/* renamed from: com.tencent.thumbplayer.core.postprocessor.filter.Texture2OESFIlter */
/* loaded from: classes14.dex */
public class C26429x34521e3e {

    /* renamed from: FLOAT_SIZE_BYTES */
    private static final int f53622x4d57ec70 = 4;
    private static final java.lang.String TAG = "sifeng: Texture2OES";

    /* renamed from: positoins */
    private static final float[] f53623x65c3301e = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: texcoords */
    private static final float[] f53624xa604eb05 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: FRAGMENT_SHADER */
    private java.lang.String f53625xb30c5cb4;

    /* renamed from: VERTEX_SHADER */
    private java.lang.String f53626xeb40e2e0;

    /* renamed from: mPositoins */
    private java.nio.FloatBuffer f53629xe07a7a31;

    /* renamed from: mTexcoords */
    private java.nio.FloatBuffer f53632x20bc3518;

    /* renamed from: muMVPMatrixHandle */
    private int f53642x3af65808;

    /* renamed from: muSTMatrixHandle */
    private int f53643xf4cf39f2;

    /* renamed from: mMVPMatrix */
    private float[] f53628x9264a89b = new float[16];

    /* renamed from: mSTMatrix */
    private float[] f53631xb3a2c4ef = new float[16];

    /* renamed from: mProgramHandle */
    private int f53630x636c8e5f = 0;

    /* renamed from: mWidth */
    private int f53633xbefb7959 = 0;

    /* renamed from: mHeight */
    private int f53627x6a4b7f4 = 0;

    /* renamed from: mpositionid */
    private int f53639xb7b11c31 = 0;

    /* renamed from: mtexcoordid */
    private int f53641x7ff890f6 = 0;

    /* renamed from: minputImageTextureid */
    private int f53637xef05d538 = 0;

    /* renamed from: mblurredImageTexture1id */
    private int f53634x7312564f = 0;

    /* renamed from: mblurredImageTexture2id */
    private int f53635x73125a10 = 0;

    /* renamed from: mblurredImageTexture3id */
    private int f53636x73125dd1 = 0;

    /* renamed from: mresiduemapid */
    private int f53640xb9e525b9 = 0;

    /* renamed from: mmodeid */
    private int f53638x4652a4ab = 0;

    public C26429x34521e3e(java.lang.String str) {
        float[] fArr = f53623x65c3301e;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f53629xe07a7a31 = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        float[] fArr2 = f53624xa604eb05;
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(fArr2.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f53632x20bc3518 = asFloatBuffer2;
        asFloatBuffer2.put(fArr2).position(0);
        android.opengl.Matrix.setIdentityM(this.f53631xb3a2c4ef, 0);
        java.io.InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(str + "/vertex_general.glsl");
        byte[] bArr = new byte[1024];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        if (resourceAsStream != null) {
            while (true) {
                int read = resourceAsStream.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            }
        }
        resourceAsStream.close();
        byteArrayOutputStream.close();
        this.f53626xeb40e2e0 = new java.lang.String(byteArrayOutputStream.toByteArray());
        java.io.InputStream resourceAsStream2 = getClass().getClassLoader().getResourceAsStream(str + "/fragment_texture2oes.glsl");
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
        if (resourceAsStream2 != null) {
            while (true) {
                int read2 = resourceAsStream2.read(bArr);
                if (read2 == -1) {
                    break;
                } else {
                    byteArrayOutputStream2.write(bArr, 0, read2);
                }
            }
        }
        resourceAsStream2.close();
        byteArrayOutputStream2.close();
        this.f53625xb30c5cb4 = new java.lang.String(byteArrayOutputStream2.toByteArray());
        if (!m102798xc6be737b() || m102796x15195fb("USM3FusionFilter") != 0) {
            throw new java.lang.RuntimeException("Texture2OES create failed");
        }
    }

    /* renamed from: checkGlError */
    private int m102796x15195fb(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return 0;
        }
        java.lang.Integer.toHexString(glGetError);
        return glGetError;
    }

    /* renamed from: compileShader */
    public int m102797xeda30bf8(java.lang.String str, int i17) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        android.opengl.GLES20.glGetShaderInfoLog(glCreateShader);
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* renamed from: compileShaders */
    public boolean m102798xc6be737b() {
        int m102797xeda30bf8;
        int m102797xeda30bf82 = m102797xeda30bf8(this.f53626xeb40e2e0, 35633);
        if (m102797xeda30bf82 == 0 || (m102797xeda30bf8 = m102797xeda30bf8(this.f53625xb30c5cb4, 35632)) == 0) {
            return false;
        }
        this.f53630x636c8e5f = android.opengl.GLES20.glCreateProgram();
        if (m102796x15195fb("glCreateProgram") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f53630x636c8e5f, m102797xeda30bf82);
        if (m102796x15195fb("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f53630x636c8e5f, m102797xeda30bf8);
        if (m102796x15195fb("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glLinkProgram(this.f53630x636c8e5f);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetProgramiv(this.f53630x636c8e5f, 35714, iArr, 0);
        if (iArr[0] != 1) {
            android.opengl.GLES20.glGetProgramInfoLog(this.f53630x636c8e5f);
            android.opengl.GLES20.glDeleteProgram(this.f53630x636c8e5f);
            this.f53630x636c8e5f = 0;
            return false;
        }
        android.opengl.GLES20.glUseProgram(this.f53630x636c8e5f);
        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.f53630x636c8e5f, "position");
        this.f53639xb7b11c31 = glGetAttribLocation;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(this.f53630x636c8e5f, "texCoord");
        this.f53641x7ff890f6 = glGetAttribLocation2;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        this.f53637xef05d538 = android.opengl.GLES20.glGetUniformLocation(this.f53630x636c8e5f, "inputImageTexture");
        this.f53638x4652a4ab = android.opengl.GLES20.glGetUniformLocation(this.f53630x636c8e5f, "mode");
        this.f53642x3af65808 = android.opengl.GLES20.glGetUniformLocation(this.f53630x636c8e5f, "uMVPMatrix");
        int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f53630x636c8e5f, "uSTMatrix");
        this.f53643xf4cf39f2 = glGetUniformLocation;
        return (this.f53639xb7b11c31 == -1 || this.f53641x7ff890f6 == -1 || this.f53637xef05d538 == -1 || this.f53642x3af65808 == -1 || glGetUniformLocation == -1) ? false : true;
    }

    /* renamed from: destroyBuffers */
    public void m102799xdd60ded9() {
        int i17 = this.f53630x636c8e5f;
        if (i17 != 0) {
            android.opengl.GLES20.glDeleteProgram(i17);
            this.f53630x636c8e5f = 0;
        }
    }

    /* renamed from: process */
    public void m102800xed8d1e6f(int i17, int i18, int i19, boolean z17) {
        if (this.f53633xbefb7959 != i18 || this.f53627x6a4b7f4 != i19) {
            m102801xe1965249(i18, i19);
        }
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glUseProgram(this.f53630x636c8e5f);
        android.opengl.GLES20.glViewport(0, 0, i18, i19);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16384);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, i17);
        android.opengl.GLES20.glUniform1i(this.f53637xef05d538, 0);
        if (z17) {
            android.opengl.GLES20.glUniform1i(this.f53638x4652a4ab, 1);
        } else {
            android.opengl.GLES20.glUniform1i(this.f53638x4652a4ab, 0);
        }
        android.opengl.Matrix.setIdentityM(this.f53628x9264a89b, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.f53642x3af65808, 1, false, this.f53628x9264a89b, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.f53643xf4cf39f2, 1, false, this.f53631xb3a2c4ef, 0);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f53639xb7b11c31);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f53641x7ff890f6);
        this.f53629xe07a7a31.position(0);
        this.f53632x20bc3518.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f53639xb7b11c31, 3, 5126, false, 0, (java.nio.Buffer) this.f53629xe07a7a31);
        android.opengl.GLES20.glVertexAttribPointer(this.f53641x7ff890f6, 2, 5126, false, 0, (java.nio.Buffer) this.f53632x20bc3518);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f53639xb7b11c31);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f53641x7ff890f6);
        if (m102796x15195fb("USM3FusionFilter") != 0) {
            throw new java.lang.RuntimeException("sifeng: USM3FusionFilter process failed");
        }
    }

    /* renamed from: updatebuffer */
    public void m102801xe1965249(int i17, int i18) {
        this.f53633xbefb7959 = i17;
        this.f53627x6a4b7f4 = i18;
    }
}
