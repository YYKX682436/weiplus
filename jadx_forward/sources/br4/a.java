package br4;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public int f105201d;

    /* renamed from: e, reason: collision with root package name */
    public int f105202e;

    /* renamed from: j, reason: collision with root package name */
    public java.nio.FloatBuffer f105207j;

    /* renamed from: k, reason: collision with root package name */
    public java.nio.FloatBuffer f105208k;

    /* renamed from: l, reason: collision with root package name */
    public java.nio.FloatBuffer f105209l;

    /* renamed from: m, reason: collision with root package name */
    public int f105210m;

    /* renamed from: n, reason: collision with root package name */
    public int f105211n;

    /* renamed from: o, reason: collision with root package name */
    public java.nio.ByteBuffer f105212o;

    /* renamed from: p, reason: collision with root package name */
    public int f105213p;

    /* renamed from: q, reason: collision with root package name */
    public int f105214q;

    /* renamed from: t, reason: collision with root package name */
    public java.nio.FloatBuffer f105217t;

    /* renamed from: a, reason: collision with root package name */
    public int f105198a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f105199b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f105200c = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f105203f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f105204g = 0;

    /* renamed from: h, reason: collision with root package name */
    public is0.a f105205h = null;

    /* renamed from: i, reason: collision with root package name */
    public is0.c f105206i = null;

    /* renamed from: r, reason: collision with root package name */
    public final float[] f105215r = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: s, reason: collision with root package name */
    public final float[] f105216s = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    public final void a(int i17, int i18, int i19, int i27) {
        android.opengl.GLES20.glBindFramebuffer(36160, i17);
        if (i17 > 0) {
            android.opengl.GLES20.glBindTexture(3553, i18);
            android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, i19, i27, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i18, 0);
            android.opengl.GLES20.glBindTexture(3553, 0);
        }
    }

    public final void b(int i17, int i18, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2, boolean z17) {
        android.opengl.GLES20.glUseProgram(i17);
        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(i17, "vPosition");
        this.f105210m = glGetAttribLocation;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        android.opengl.GLES20.glVertexAttribPointer(this.f105210m, 2, 5126, false, 8, (java.nio.Buffer) floatBuffer);
        int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(i17, "vTexCoord");
        this.f105211n = glGetAttribLocation2;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        android.opengl.GLES20.glVertexAttribPointer(this.f105211n, 2, 5126, false, 8, (java.nio.Buffer) floatBuffer2);
        if (z17) {
            android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(i17, "smoothDegree"), 0.5f);
            android.opengl.GLES20.glUniform1i(android.opengl.GLES20.glGetUniformLocation(i17, "showCounter"), 0);
            android.opengl.GLES20.glUniform1i(android.opengl.GLES20.glGetUniformLocation(i17, "showMode"), 2);
            android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(i17, "brightness"), 0.8f);
            android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(i17, "texelWidth"), this.f105213p);
            android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(i17, "texelHeight"), this.f105214q);
        }
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, i18);
        android.opengl.GLES20.glUniform1i(android.opengl.GLES20.glGetAttribLocation(i17, "inputImageTexture"), 0);
    }

    public void c() {
        if (this.f105205h == null || this.f105213p <= 0 || this.f105214q <= 0) {
            d(this.f105203f, this.f105204g);
        }
        a(this.f105205h.f375920e, this.f105206i.f375928e, this.f105213p, this.f105214q);
        b(this.f105198a, this.f105200c, this.f105207j, this.f105217t, true);
        f(true);
        a(0, 0, 0, 0);
        b(this.f105199b, this.f105206i.f375928e, this.f105209l, this.f105208k, false);
        f(false);
    }

    public final void d(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipGLSProgram", "initOutputFrameBuffer, width:%s, height:%s, frameBufferTextureOutput:%s, frameBufferOutput:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), this.f105206i, this.f105205h);
        is0.a aVar = this.f105205h;
        if (aVar != null) {
            aVar.close();
        }
        is0.c cVar = this.f105206i;
        if (cVar != null) {
            cVar.close();
        }
        this.f105213p = i17;
        this.f105214q = i18;
        this.f105206i = is0.b.b(true, 14L);
        this.f105205h = is0.b.f375924a.a(14L);
        android.opengl.GLES20.glBindTexture(3553, this.f105206i.f375928e);
        android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
        android.opengl.GLES20.glTexParameteri(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729);
        android.opengl.GLES20.glTexParameteri(3553, 10242, 10497);
        android.opengl.GLES20.glTexParameteri(3553, 10243, 10497);
        android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, this.f105213p, this.f105214q, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }

    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipGLSProgram", "%s do destroy", java.lang.Integer.valueOf(hashCode()));
        is0.a aVar = this.f105205h;
        if (aVar != null) {
            aVar.close();
        }
        is0.c cVar = this.f105206i;
        if (cVar != null) {
            cVar.close();
        }
        android.opengl.GLES20.glDeleteProgram(this.f105198a);
        android.opengl.GLES20.glDeleteProgram(this.f105199b);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glFinish();
        java.nio.FloatBuffer floatBuffer = this.f105208k;
        if (floatBuffer != null) {
            floatBuffer.clear();
        }
        java.nio.FloatBuffer floatBuffer2 = this.f105207j;
        if (floatBuffer2 != null) {
            floatBuffer2.clear();
        }
        java.nio.FloatBuffer floatBuffer3 = this.f105217t;
        if (floatBuffer3 != null) {
            floatBuffer3.clear();
        }
        this.f105217t = null;
        this.f105207j = null;
        this.f105208k = null;
        this.f105198a = 0;
        this.f105199b = 0;
        this.f105205h = null;
        this.f105206i = null;
        this.f105201d = 0;
        this.f105202e = 0;
        this.f105214q = 0;
        this.f105213p = 0;
        this.f105204g = 0;
        this.f105203f = 0;
    }

    public final void f(boolean z17) {
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16640);
        if (z17) {
            android.opengl.GLES20.glViewport(0, 0, this.f105203f, this.f105204g);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            java.nio.ByteBuffer byteBuffer = this.f105212o;
            if (byteBuffer == null || byteBuffer.capacity() < this.f105204g * this.f105203f * 4) {
                this.f105212o = java.nio.ByteBuffer.allocateDirect(this.f105204g * this.f105203f * 4).order(java.nio.ByteOrder.nativeOrder());
            }
            this.f105212o.position(0);
            android.opengl.GLES20.glReadPixels(0, 0, this.f105203f, this.f105204g, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, this.f105212o);
            this.f105212o.position(0);
            this.f105212o.array();
            a(0, 0, 0, 0);
        } else {
            android.opengl.GLES20.glViewport(0, 0, this.f105201d, this.f105202e);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
        }
        android.opengl.GLES20.glUseProgram(0);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f105210m);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f105211n);
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
        java.nio.FloatBuffer floatBuffer = this.f105208k;
        if (floatBuffer == null || floatBuffer.capacity() < copyOf.length) {
            this.f105208k = java.nio.ByteBuffer.allocateDirect(copyOf.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.f105208k.put(copyOf);
        this.f105208k.position(0);
        float[] copyOf2 = java.util.Arrays.copyOf(fArr, fArr.length);
        java.nio.FloatBuffer floatBuffer2 = this.f105209l;
        if (floatBuffer2 == null || floatBuffer2.capacity() < copyOf2.length) {
            this.f105209l = java.nio.ByteBuffer.allocateDirect(copyOf2.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.f105209l.put(copyOf2);
        this.f105209l.position(0);
    }
}
