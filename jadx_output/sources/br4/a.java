package br4;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public int f23668d;

    /* renamed from: e, reason: collision with root package name */
    public int f23669e;

    /* renamed from: j, reason: collision with root package name */
    public java.nio.FloatBuffer f23674j;

    /* renamed from: k, reason: collision with root package name */
    public java.nio.FloatBuffer f23675k;

    /* renamed from: l, reason: collision with root package name */
    public java.nio.FloatBuffer f23676l;

    /* renamed from: m, reason: collision with root package name */
    public int f23677m;

    /* renamed from: n, reason: collision with root package name */
    public int f23678n;

    /* renamed from: o, reason: collision with root package name */
    public java.nio.ByteBuffer f23679o;

    /* renamed from: p, reason: collision with root package name */
    public int f23680p;

    /* renamed from: q, reason: collision with root package name */
    public int f23681q;

    /* renamed from: t, reason: collision with root package name */
    public java.nio.FloatBuffer f23684t;

    /* renamed from: a, reason: collision with root package name */
    public int f23665a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f23666b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f23667c = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f23670f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f23671g = 0;

    /* renamed from: h, reason: collision with root package name */
    public is0.a f23672h = null;

    /* renamed from: i, reason: collision with root package name */
    public is0.c f23673i = null;

    /* renamed from: r, reason: collision with root package name */
    public final float[] f23682r = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: s, reason: collision with root package name */
    public final float[] f23683s = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    public final void a(int i17, int i18, int i19, int i27) {
        android.opengl.GLES20.glBindFramebuffer(36160, i17);
        if (i17 > 0) {
            android.opengl.GLES20.glBindTexture(3553, i18);
            android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, i19, i27, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i18, 0);
            android.opengl.GLES20.glBindTexture(3553, 0);
        }
    }

    public final void b(int i17, int i18, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2, boolean z17) {
        android.opengl.GLES20.glUseProgram(i17);
        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(i17, "vPosition");
        this.f23677m = glGetAttribLocation;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        android.opengl.GLES20.glVertexAttribPointer(this.f23677m, 2, 5126, false, 8, (java.nio.Buffer) floatBuffer);
        int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(i17, "vTexCoord");
        this.f23678n = glGetAttribLocation2;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        android.opengl.GLES20.glVertexAttribPointer(this.f23678n, 2, 5126, false, 8, (java.nio.Buffer) floatBuffer2);
        if (z17) {
            android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(i17, "smoothDegree"), 0.5f);
            android.opengl.GLES20.glUniform1i(android.opengl.GLES20.glGetUniformLocation(i17, "showCounter"), 0);
            android.opengl.GLES20.glUniform1i(android.opengl.GLES20.glGetUniformLocation(i17, "showMode"), 2);
            android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(i17, "brightness"), 0.8f);
            android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(i17, "texelWidth"), this.f23680p);
            android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(i17, "texelHeight"), this.f23681q);
        }
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, i18);
        android.opengl.GLES20.glUniform1i(android.opengl.GLES20.glGetAttribLocation(i17, "inputImageTexture"), 0);
    }

    public void c() {
        if (this.f23672h == null || this.f23680p <= 0 || this.f23681q <= 0) {
            d(this.f23670f, this.f23671g);
        }
        a(this.f23672h.f294387e, this.f23673i.f294395e, this.f23680p, this.f23681q);
        b(this.f23665a, this.f23667c, this.f23674j, this.f23684t, true);
        f(true);
        a(0, 0, 0, 0);
        b(this.f23666b, this.f23673i.f294395e, this.f23676l, this.f23675k, false);
        f(false);
    }

    public final void d(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipGLSProgram", "initOutputFrameBuffer, width:%s, height:%s, frameBufferTextureOutput:%s, frameBufferOutput:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), this.f23673i, this.f23672h);
        is0.a aVar = this.f23672h;
        if (aVar != null) {
            aVar.close();
        }
        is0.c cVar = this.f23673i;
        if (cVar != null) {
            cVar.close();
        }
        this.f23680p = i17;
        this.f23681q = i18;
        this.f23673i = is0.b.b(true, 14L);
        this.f23672h = is0.b.f294391a.a(14L);
        android.opengl.GLES20.glBindTexture(3553, this.f23673i.f294395e);
        android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
        android.opengl.GLES20.glTexParameteri(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729);
        android.opengl.GLES20.glTexParameteri(3553, 10242, 10497);
        android.opengl.GLES20.glTexParameteri(3553, 10243, 10497);
        android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, this.f23680p, this.f23681q, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }

    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipGLSProgram", "%s do destroy", java.lang.Integer.valueOf(hashCode()));
        is0.a aVar = this.f23672h;
        if (aVar != null) {
            aVar.close();
        }
        is0.c cVar = this.f23673i;
        if (cVar != null) {
            cVar.close();
        }
        android.opengl.GLES20.glDeleteProgram(this.f23665a);
        android.opengl.GLES20.glDeleteProgram(this.f23666b);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glFinish();
        java.nio.FloatBuffer floatBuffer = this.f23675k;
        if (floatBuffer != null) {
            floatBuffer.clear();
        }
        java.nio.FloatBuffer floatBuffer2 = this.f23674j;
        if (floatBuffer2 != null) {
            floatBuffer2.clear();
        }
        java.nio.FloatBuffer floatBuffer3 = this.f23684t;
        if (floatBuffer3 != null) {
            floatBuffer3.clear();
        }
        this.f23684t = null;
        this.f23674j = null;
        this.f23675k = null;
        this.f23665a = 0;
        this.f23666b = 0;
        this.f23672h = null;
        this.f23673i = null;
        this.f23668d = 0;
        this.f23669e = 0;
        this.f23681q = 0;
        this.f23680p = 0;
        this.f23671g = 0;
        this.f23670f = 0;
    }

    public final void f(boolean z17) {
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16640);
        if (z17) {
            android.opengl.GLES20.glViewport(0, 0, this.f23670f, this.f23671g);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            java.nio.ByteBuffer byteBuffer = this.f23679o;
            if (byteBuffer == null || byteBuffer.capacity() < this.f23671g * this.f23670f * 4) {
                this.f23679o = java.nio.ByteBuffer.allocateDirect(this.f23671g * this.f23670f * 4).order(java.nio.ByteOrder.nativeOrder());
            }
            this.f23679o.position(0);
            android.opengl.GLES20.glReadPixels(0, 0, this.f23670f, this.f23671g, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f23679o);
            this.f23679o.position(0);
            this.f23679o.array();
            a(0, 0, 0, 0);
        } else {
            android.opengl.GLES20.glViewport(0, 0, this.f23668d, this.f23669e);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
        }
        android.opengl.GLES20.glUseProgram(0);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f23677m);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f23678n);
    }

    public final void g(int i17, float[] fArr) {
        if (i17 == 1) {
            float f17 = fArr[0];
            float f18 = fArr[1];
            fArr[0] = fArr[4];
            fArr[1] = fArr[5];
            fArr[4] = fArr[6];
            fArr[5] = fArr[7];
            fArr[6] = fArr[2];
            fArr[7] = fArr[3];
            fArr[2] = f17;
            fArr[3] = f18;
            return;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            float f19 = fArr[0];
            float f27 = fArr[1];
            fArr[0] = fArr[2];
            fArr[1] = fArr[3];
            fArr[2] = fArr[6];
            fArr[3] = fArr[7];
            fArr[6] = fArr[4];
            fArr[7] = fArr[5];
            fArr[4] = f19;
            fArr[5] = f27;
            return;
        }
        float f28 = fArr[0];
        fArr[0] = fArr[6];
        fArr[6] = f28;
        float f29 = fArr[1];
        fArr[1] = fArr[7];
        fArr[7] = f29;
        float f37 = fArr[2];
        fArr[2] = fArr[4];
        fArr[4] = f37;
        float f38 = fArr[3];
        fArr[3] = fArr[5];
        fArr[5] = f38;
    }

    public void h(float[] fArr, float[] fArr2) {
        if (fArr2 == null || fArr == null) {
            return;
        }
        float[] copyOf = java.util.Arrays.copyOf(fArr2, fArr2.length);
        g(2, copyOf);
        java.nio.FloatBuffer floatBuffer = this.f23675k;
        if (floatBuffer == null || floatBuffer.capacity() < copyOf.length) {
            this.f23675k = java.nio.ByteBuffer.allocateDirect(copyOf.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.f23675k.put(copyOf);
        this.f23675k.position(0);
        float[] copyOf2 = java.util.Arrays.copyOf(fArr, fArr.length);
        java.nio.FloatBuffer floatBuffer2 = this.f23676l;
        if (floatBuffer2 == null || floatBuffer2.capacity() < copyOf2.length) {
            this.f23676l = java.nio.ByteBuffer.allocateDirect(copyOf2.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.f23676l.put(copyOf2);
        this.f23676l.position(0);
    }
}
