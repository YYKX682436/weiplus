package d32;

/* loaded from: classes10.dex */
public final class k implements android.opengl.GLSurfaceView.Renderer {
    public int A;
    public is0.c B;
    public is0.c C;
    public final java.nio.FloatBuffer D;
    public final java.nio.FloatBuffer E;
    public final java.nio.FloatBuffer F;
    public final float[] G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public java.nio.ByteBuffer f307694J;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f307695a;

    /* renamed from: b, reason: collision with root package name */
    public final t85.j f307696b;

    /* renamed from: c, reason: collision with root package name */
    public int f307697c;

    /* renamed from: d, reason: collision with root package name */
    public int f307698d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f307699e;

    /* renamed from: f, reason: collision with root package name */
    public is0.c f307700f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.SurfaceTexture f307701g;

    /* renamed from: h, reason: collision with root package name */
    public is0.c f307702h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f307703i;

    /* renamed from: j, reason: collision with root package name */
    public int f307704j;

    /* renamed from: k, reason: collision with root package name */
    public int f307705k;

    /* renamed from: l, reason: collision with root package name */
    public int f307706l;

    /* renamed from: m, reason: collision with root package name */
    public int f307707m;

    /* renamed from: n, reason: collision with root package name */
    public int f307708n;

    /* renamed from: o, reason: collision with root package name */
    public int f307709o;

    /* renamed from: p, reason: collision with root package name */
    public int f307710p;

    /* renamed from: q, reason: collision with root package name */
    public int f307711q;

    /* renamed from: r, reason: collision with root package name */
    public int f307712r;

    /* renamed from: s, reason: collision with root package name */
    public int f307713s;

    /* renamed from: t, reason: collision with root package name */
    public int f307714t;

    /* renamed from: u, reason: collision with root package name */
    public int f307715u;

    /* renamed from: v, reason: collision with root package name */
    public int f307716v;

    /* renamed from: w, reason: collision with root package name */
    public int f307717w;

    /* renamed from: x, reason: collision with root package name */
    public int f307718x;

    /* renamed from: y, reason: collision with root package name */
    public int f307719y;

    /* renamed from: z, reason: collision with root package name */
    public p05.l4 f307720z;

    public k(boolean z17, t85.j jVar) {
        this.f307695a = z17;
        this.f307696b = jVar;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asFloatBuffer, "asFloatBuffer(...)");
        this.D = asFloatBuffer;
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asFloatBuffer2, "asFloatBuffer(...)");
        this.E = asFloatBuffer2;
        this.F = java.nio.ByteBuffer.allocateDirect(8).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.G = new float[16];
        this.I = true;
        this.f307694J = java.nio.ByteBuffer.allocate(this.f307697c * this.f307698d * 4);
    }

    public final void a(boolean z17) {
        is0.c cVar = this.B;
        if (cVar == null || this.C == null) {
            return;
        }
        int i17 = this.A;
        int i18 = cVar != null ? cVar.f375928e : 0;
        android.opengl.GLES20.glBindFramebuffer(36160, i17);
        android.opengl.GLES20.glBindTexture(3553, i18);
        android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, 640, 640, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i18, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glViewport(0, 0, 640, 640);
        is0.c cVar2 = this.f307700f;
        java.nio.FloatBuffer floatBuffer = this.E;
        java.nio.FloatBuffer floatBuffer2 = this.D;
        if (cVar2 != null) {
            android.opengl.GLES20.glUseProgram(this.f307716v);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(36197, cVar2.f375928e);
            android.opengl.GLES20.glTexParameterf(36197, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(36197, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
            android.opengl.GLES20.glTexParameterf(36197, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(36197, 10243, 33071.0f);
            android.opengl.GLES20.glUniform1i(this.f307719y, 0);
            floatBuffer2.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f307717w, 2, 5126, false, 0, (java.nio.Buffer) this.D);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f307717w);
            floatBuffer.position(0);
            floatBuffer.put(d32.c.f307672d);
            floatBuffer.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f307718x, 2, 5126, false, 0, (java.nio.Buffer) this.E);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f307718x);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f307717w);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f307718x);
            android.opengl.GLES20.glBindTexture(3553, 0);
            android.opengl.GLES20.glBindTexture(36197, 0);
            android.opengl.GLES20.glFinish();
        }
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glFinish();
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glViewport(0, 0, 640, 640);
        p05.l4 l4Var = this.f307720z;
        if (l4Var != null) {
            is0.c cVar3 = this.B;
            rh0.d0.b(l4Var, cVar3 != null ? cVar3.f375928e : 0, false, 0, false, 14, null);
        }
        if (this.I) {
            this.I = false;
            p05.l4 l4Var2 = this.f307720z;
            if (l4Var2 != null) {
                is0.c cVar4 = this.B;
                rh0.d0.b(l4Var2, cVar4 != null ? cVar4.f375928e : 0, false, 0, false, 14, null);
            }
        }
        is0.c cVar5 = this.C;
        if (cVar5 != null) {
            is0.c.b(cVar5, 640, 640, 0, null, 0, 0, 60, null);
        }
        p05.l4 l4Var3 = this.f307720z;
        if (l4Var3 != null) {
            is0.c cVar6 = this.B;
            int i19 = cVar6 != null ? cVar6.f375928e : 0;
            is0.c cVar7 = this.C;
            rh0.d0.c(l4Var3, i19, cVar7 != null ? cVar7.f375928e : 0, 0L, 0, false, false, false, 124, null);
        }
        is0.c cVar8 = this.C;
        android.opengl.GLES20.glFinish();
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glViewport(0, 0, this.f307697c, this.f307698d);
        if (cVar8 == null) {
            return;
        }
        android.opengl.GLES20.glViewport(0, 0, this.f307697c, this.f307698d);
        android.opengl.GLES20.glUseProgram(this.f307704j);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, cVar8.f375928e);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
        android.opengl.GLES20.glUniform1i(this.f307708n, 0);
        android.opengl.GLES20.glUniform1i(this.f307707m, 2);
        android.opengl.GLES20.glUniform1i(this.f307713s, 1);
        android.opengl.GLES20.glUniform1i(this.f307715u, this.f307695a ? 1 : 0);
        if (this.f307699e != null) {
            android.opengl.GLES20.glActiveTexture(33985);
            is0.c cVar9 = this.f307702h;
            if (cVar9 != null) {
                android.graphics.Bitmap bitmap = this.f307699e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
                is0.c.c(cVar9, bitmap, 0, 0, 6, null);
            }
            android.opengl.GLES20.glUniform1i(this.f307709o, 1);
        } else {
            android.opengl.GLES20.glUniform1i(this.f307709o, 1);
        }
        floatBuffer2.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f307705k, 2, 5126, false, 0, (java.nio.Buffer) this.D);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f307705k);
        floatBuffer.position(0);
        floatBuffer.put(d32.c.f307671c);
        floatBuffer.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f307706l, 2, 5126, false, 0, (java.nio.Buffer) this.E);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f307706l);
        float f17 = this.f307697c;
        java.nio.FloatBuffer floatBuffer3 = this.F;
        floatBuffer3.put(f17);
        floatBuffer3.put(this.f307698d);
        floatBuffer3.position(0);
        android.opengl.GLES20.glUniform2fv(this.f307710p, 1, floatBuffer3);
        android.opengl.GLES20.glUniform1f(this.f307711q, java.lang.Math.max(this.f307697c, this.f307698d) * 0.06666667f);
        float[] fArr = this.G;
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        android.opengl.GLES20.glUniformMatrix4fv(this.f307714t, 1, false, fArr, 0);
        if (this.f307699e != null) {
            android.opengl.GLES20.glUniform1i(this.f307712r, 1);
        } else {
            android.opengl.GLES20.glUniform1i(this.f307712r, 0);
        }
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f307705k);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f307706l);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glBindTexture(36197, 0);
        android.opengl.GLES20.glFinish();
        this.f307694J.position(0);
        int i27 = this.f307697c;
        android.opengl.GLES20.glReadPixels(0, 0, i27, i27, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, this.f307694J);
        android.opengl.GLES20.glUseProgram(0);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            android.opengl.GLES20.glClear(16640);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            android.graphics.SurfaceTexture surfaceTexture = this.f307701g;
            if (surfaceTexture == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoDecodeSurfaceTexture");
                throw null;
            }
            surfaceTexture.updateTexImage();
            a(this.f307703i);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureMixRenderer", "draw frame used " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiCaptureMixRenderer", e17, "EmojiCaptureMixRenderer draw frame failed", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markMixFrameDrawFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1012L, 27L, 1L);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureMixRenderer", "onSurfaceChanged, width:" + i17 + ", height:" + i18);
        this.f307697c = i17;
        this.f307698d = i18;
        this.f307694J = java.nio.ByteBuffer.allocate(i17 * i18 * 4);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureMixRenderer", "onSurfaceCreated");
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glDisable(2929);
    }
}
