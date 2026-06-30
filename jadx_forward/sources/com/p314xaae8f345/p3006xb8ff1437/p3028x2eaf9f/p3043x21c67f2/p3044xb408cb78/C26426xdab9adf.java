package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78;

/* renamed from: com.tencent.thumbplayer.core.postprocessor.filter.BlurFilter */
/* loaded from: classes14.dex */
public class C26426xdab9adf {

    /* renamed from: FLOAT_SIZE_BYTES */
    private static final int f53550x4d57ec70 = 4;
    private static final java.lang.String TAG = "sifeng: BlurFilter";

    /* renamed from: positoins */
    private static final float[] f53551x65c3301e = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: texcoords */
    private static final float[] f53552xa604eb05 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: FRAGMENT_SHADER */
    private java.lang.String f53553xb30c5cb4;

    /* renamed from: VERTEX_SHADER */
    private java.lang.String f53554xeb40e2e0;

    /* renamed from: mPositoins */
    private java.nio.FloatBuffer f53559xe07a7a31;

    /* renamed from: mTexcoords */
    private java.nio.FloatBuffer f53562x20bc3518;

    /* renamed from: muMVPMatrixHandle */
    private int f53569x3af65808;

    /* renamed from: muSTMatrixHandle */
    private int f53570xf4cf39f2;

    /* renamed from: mMVPMatrix */
    private float[] f53557x9264a89b = new float[16];

    /* renamed from: mSTMatrix */
    private float[] f53561xb3a2c4ef = new float[16];

    /* renamed from: mProgramHandle */
    private int f53560x636c8e5f = 0;

    /* renamed from: mWidth */
    private int f53564xbefb7959 = 0;

    /* renamed from: mHeight */
    private int f53556x6a4b7f4 = 0;

    /* renamed from: mpositionid */
    private int f53566xb7b11c31 = 0;

    /* renamed from: mtexcoordid */
    private int f53568x7ff890f6 = 0;

    /* renamed from: mtexSizeid */
    private int f53567x8dacce16 = 0;

    /* renamed from: mOffsetid */
    private int f53558xf7ee407b = 0;

    /* renamed from: minputImageTextureid */
    private int f53565xef05d538 = 0;

    /* renamed from: mFrameBuffer */
    private int[] f53555x84c4b560 = new int[3];

    /* renamed from: mTextureid */
    private int[] f53563x3e145189 = new int[3];

    public C26426xdab9adf(java.lang.String str) {
        for (int i17 = 0; i17 < 3; i17++) {
            this.f53555x84c4b560[i17] = 0;
            this.f53563x3e145189[i17] = 0;
        }
        float[] fArr = f53551x65c3301e;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f53559xe07a7a31 = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        float[] fArr2 = f53552xa604eb05;
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(fArr2.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f53562x20bc3518 = asFloatBuffer2;
        asFloatBuffer2.put(fArr2).position(0);
        android.opengl.Matrix.setIdentityM(this.f53561xb3a2c4ef, 0);
        java.io.InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(str + "/vertex_blur.glsl");
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
        this.f53554xeb40e2e0 = new java.lang.String(byteArrayOutputStream.toByteArray());
        java.io.InputStream resourceAsStream2 = getClass().getClassLoader().getResourceAsStream(str + "/fragment_blur.glsl");
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
        this.f53553xb30c5cb4 = new java.lang.String(byteArrayOutputStream2.toByteArray());
        if (!m102772xc6be737b() || m102770x15195fb("BlurFilter") != 0) {
            throw new java.lang.RuntimeException("sifeng: BlurFilter create failed");
        }
    }

    /* renamed from: checkGlError */
    private int m102770x15195fb(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return 0;
        }
        java.lang.Integer.toHexString(glGetError);
        return glGetError;
    }

    /* renamed from: compileShader */
    public int m102771xeda30bf8(java.lang.String str, int i17) {
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
    public boolean m102772xc6be737b() {
        int m102771xeda30bf8;
        int m102771xeda30bf82 = m102771xeda30bf8(this.f53554xeb40e2e0, 35633);
        if (m102771xeda30bf82 == 0 || (m102771xeda30bf8 = m102771xeda30bf8(this.f53553xb30c5cb4, 35632)) == 0) {
            return false;
        }
        this.f53560x636c8e5f = android.opengl.GLES20.glCreateProgram();
        if (m102770x15195fb("glCreateProgram") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f53560x636c8e5f, m102771xeda30bf82);
        if (m102770x15195fb("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f53560x636c8e5f, m102771xeda30bf8);
        if (m102770x15195fb("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glLinkProgram(this.f53560x636c8e5f);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetProgramiv(this.f53560x636c8e5f, 35714, iArr, 0);
        if (iArr[0] != 1) {
            android.opengl.GLES20.glGetProgramInfoLog(this.f53560x636c8e5f);
            android.opengl.GLES20.glDeleteProgram(this.f53560x636c8e5f);
            this.f53560x636c8e5f = 0;
            return false;
        }
        android.opengl.GLES20.glUseProgram(this.f53560x636c8e5f);
        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.f53560x636c8e5f, "position");
        this.f53566xb7b11c31 = glGetAttribLocation;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(this.f53560x636c8e5f, "texCoord");
        this.f53568x7ff890f6 = glGetAttribLocation2;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        this.f53567x8dacce16 = android.opengl.GLES20.glGetUniformLocation(this.f53560x636c8e5f, "texSize");
        this.f53558xf7ee407b = android.opengl.GLES20.glGetUniformLocation(this.f53560x636c8e5f, "Offset");
        this.f53565xef05d538 = android.opengl.GLES20.glGetUniformLocation(this.f53560x636c8e5f, "inputImageTexture");
        this.f53569x3af65808 = android.opengl.GLES20.glGetUniformLocation(this.f53560x636c8e5f, "uMVPMatrix");
        int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f53560x636c8e5f, "uSTMatrix");
        this.f53570xf4cf39f2 = glGetUniformLocation;
        return (this.f53566xb7b11c31 == -1 || this.f53568x7ff890f6 == -1 || this.f53565xef05d538 == -1 || this.f53569x3af65808 == -1 || glGetUniformLocation == -1 || this.f53567x8dacce16 == -1 || this.f53558xf7ee407b == -1) ? false : true;
    }

    /* renamed from: destroyBuffers */
    public void m102773xdd60ded9() {
        for (int i17 = 0; i17 < 3; i17++) {
            int[] iArr = this.f53555x84c4b560;
            if (iArr[i17] != 0) {
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr, i17);
                this.f53555x84c4b560[i17] = 0;
            }
            int[] iArr2 = this.f53563x3e145189;
            if (iArr2[i17] != 0) {
                android.opengl.GLES20.glDeleteTextures(1, iArr2, i17);
                this.f53563x3e145189[i17] = 0;
            }
        }
        int i18 = this.f53560x636c8e5f;
        if (i18 != 0) {
            android.opengl.GLES20.glDeleteProgram(i18);
            this.f53560x636c8e5f = 0;
        }
    }

    /* renamed from: getTexid */
    public int m102774x753005cc(int i17) {
        return this.f53563x3e145189[i17];
    }

    /* renamed from: process */
    public void m102775xed8d1e6f(int i17, int i18, int i19) {
        if (this.f53564xbefb7959 != i18 || this.f53556x6a4b7f4 != i19) {
            m102776xe1965249(i18, i19);
        }
        int i27 = i17;
        int i28 = 1;
        int i29 = 0;
        while (i29 < 3) {
            i28 = (i29 != 0 || i18 * i19 >= 921600) ? i28 * 2 : i28 * 1;
            android.opengl.GLES20.glBindFramebuffer(36160, this.f53555x84c4b560[i29]);
            android.opengl.GLES20.glUseProgram(this.f53560x636c8e5f);
            android.opengl.GLES20.glViewport(0, 0, i18 / i28, i19 / i28);
            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            android.opengl.GLES20.glClear(16384);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(3553, i27);
            android.opengl.GLES20.glUniform1i(this.f53565xef05d538, 0);
            android.opengl.GLES20.glUniform2f(this.f53567x8dacce16, r8 * 2, r10 * 2);
            android.opengl.GLES20.glUniform1f(this.f53558xf7ee407b, 1.0f);
            android.opengl.Matrix.setIdentityM(this.f53557x9264a89b, 0);
            android.opengl.GLES20.glUniformMatrix4fv(this.f53569x3af65808, 1, false, this.f53557x9264a89b, 0);
            android.opengl.GLES20.glUniformMatrix4fv(this.f53570xf4cf39f2, 1, false, this.f53561xb3a2c4ef, 0);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f53566xb7b11c31);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f53568x7ff890f6);
            this.f53559xe07a7a31.position(0);
            this.f53562x20bc3518.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f53566xb7b11c31, 3, 5126, false, 0, (java.nio.Buffer) this.f53559xe07a7a31);
            android.opengl.GLES20.glVertexAttribPointer(this.f53568x7ff890f6, 2, 5126, false, 0, (java.nio.Buffer) this.f53562x20bc3518);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f53566xb7b11c31);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f53568x7ff890f6);
            i27 = this.f53563x3e145189[i29];
            if (m102770x15195fb("BlurFilter") != 0) {
                throw new java.lang.RuntimeException("sifeng: BlurFilter process failed");
            }
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            i29++;
        }
    }

    /* renamed from: updatebuffer */
    public void m102776xe1965249(int i17, int i18) {
        int i19 = 1;
        int i27 = 0;
        while (i27 < 3) {
            int[] iArr = this.f53555x84c4b560;
            if (iArr[i27] != 0) {
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr, i27);
                this.f53555x84c4b560[i27] = 0;
            }
            int[] iArr2 = this.f53563x3e145189;
            if (iArr2[i27] != 0) {
                android.opengl.GLES20.glDeleteTextures(1, iArr2, i27);
                this.f53563x3e145189[i27] = 0;
            }
            i19 = (i27 != 0 || i17 * i18 >= 921600) ? i19 * 2 : i19 * 1;
            android.opengl.GLES20.glGenFramebuffers(1, this.f53555x84c4b560, i27);
            android.opengl.GLES20.glBindFramebuffer(36160, this.f53555x84c4b560[i27]);
            android.opengl.GLES20.glGenTextures(1, this.f53563x3e145189, i27);
            android.opengl.GLES20.glBindTexture(3553, this.f53563x3e145189[i27]);
            android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, i17 / i19, i18 / i19, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
            android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729);
            android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f53563x3e145189[i27], 0);
            android.opengl.GLES20.glBindTexture(3553, 0);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            i27++;
        }
        this.f53564xbefb7959 = i17;
        this.f53556x6a4b7f4 = i18;
    }
}
