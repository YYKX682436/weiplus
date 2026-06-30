package br4;

/* loaded from: classes14.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f105218f = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f105219g = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f105220a;

    /* renamed from: b, reason: collision with root package name */
    public java.nio.FloatBuffer f105221b;

    /* renamed from: c, reason: collision with root package name */
    public java.nio.FloatBuffer f105222c;

    /* renamed from: d, reason: collision with root package name */
    public is0.c f105223d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.SurfaceTexture f105224e;

    public b() {
        this.f105220a = 0;
        this.f105220a = br4.f.a("attribute vec4 vPosition;attribute vec2 vTexCoord;varying vec2 tc;void main() {  gl_Position = vPosition;  tc = vTexCoord;}", "#extension GL_OES_EGL_image_external : require\nprecision highp float;varying vec2 tc;uniform samplerExternalOES sTexture;void main() {   gl_FragColor = texture2D(sTexture, tc);}");
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipGLHProgram", "attachGLContext");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        br4.e b17 = br4.e.b();
        synchronized (b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipHardDecodeUtil", "attachGLContext ,isContextAttached %s", b17.f105251a);
            if (b17.f105252b == null) {
                is0.c b18 = is0.b.b(false, 14L);
                b17.f105252b = b18;
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.f258359m2 = b18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipHardDecodeUtil", "attachGLContext, texture:%s", b18);
            }
            if (b17.f105251a.compareAndSet(true, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipHardDecodeUtil", "current has attach and it need to attach ");
            } else {
                if (b17.f105251a.compareAndSet(false, true)) {
                    b17.f105253c.attachToGLContext(b17.f105252b.f375928e);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.m0) b17.f105254d).a();
                }
                b17.f105251a.get();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipGLHProgram", "attachGLContext done, used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public void b() {
        wq4.l0 l0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipGLHProgram", "detachGLContext");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        br4.e b17 = br4.e.b();
        synchronized (b17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VoipHardDecodeUtil", "detachGLContext, isContextAttached %s", b17.f105251a);
            if (b17.f105251a.compareAndSet(false, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipHardDecodeUtil", "current has attach and it need to detach ");
            }
            if (b17.f105251a.compareAndSet(true, false) && (l0Var = b17.f105253c) != null) {
                l0Var.detachFromGLContext();
                is0.c cVar = b17.f105252b;
                if (cVar != null) {
                    cVar.close();
                    b17.f105252b = null;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipGLHProgram", "detachGLContext done, used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public void c() {
        android.graphics.SurfaceTexture surfaceTexture = this.f105224e;
        if (surfaceTexture != null) {
            try {
                try {
                    surfaceTexture.updateTexImage();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipGLHProgram", e17, "updateTexImage error", new java.lang.Object[0]);
                }
                android.opengl.GLES20.glUseProgram(this.f105220a);
                int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.f105220a, "vPosition");
                int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(this.f105220a, "vTexCoord");
                int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f105220a, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2284xec3e5bc3);
                android.opengl.GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 8, (java.nio.Buffer) this.f105221b);
                android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                android.opengl.GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, 5126, false, 8, (java.nio.Buffer) this.f105222c);
                android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                android.opengl.GLES20.glActiveTexture(33984);
                android.opengl.GLES20.glBindTexture(36197, this.f105223d.f375928e);
                android.opengl.GLES20.glUniform1i(glGetUniformLocation, 0);
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                android.opengl.GLES20.glDrawArrays(5, 0, 4);
                android.opengl.GLES20.glFinish();
                android.opengl.GLES20.glDisableVertexAttribArray(glGetAttribLocation);
                android.opengl.GLES20.glDisableVertexAttribArray(glGetAttribLocation2);
                android.opengl.GLES20.glBindTexture(36197, 0);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipGLHProgram", e18, "renderThis error", new java.lang.Object[0]);
            }
        }
    }
}
