package br4;

/* loaded from: classes14.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f23685f = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f23686g = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f23687a;

    /* renamed from: b, reason: collision with root package name */
    public java.nio.FloatBuffer f23688b;

    /* renamed from: c, reason: collision with root package name */
    public java.nio.FloatBuffer f23689c;

    /* renamed from: d, reason: collision with root package name */
    public is0.c f23690d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.SurfaceTexture f23691e;

    public b() {
        this.f23687a = 0;
        this.f23687a = br4.f.a("attribute vec4 vPosition;attribute vec2 vTexCoord;varying vec2 tc;void main() {  gl_Position = vPosition;  tc = vTexCoord;}", "#extension GL_OES_EGL_image_external : require\nprecision highp float;varying vec2 tc;uniform samplerExternalOES sTexture;void main() {   gl_FragColor = texture2D(sTexture, tc);}");
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipGLHProgram", "attachGLContext");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        br4.e b17 = br4.e.b();
        synchronized (b17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipHardDecodeUtil", "attachGLContext ,isContextAttached %s", b17.f23718a);
            if (b17.f23719b == null) {
                is0.c b18 = is0.b.b(false, 14L);
                b17.f23719b = b18;
                com.tencent.mm.plugin.voip.model.v2protocal.f176826m2 = b18;
                com.tencent.mars.xlog.Log.i("MicroMsg.VoipHardDecodeUtil", "attachGLContext, texture:%s", b18);
            }
            if (b17.f23718a.compareAndSet(true, false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoipHardDecodeUtil", "current has attach and it need to attach ");
            } else {
                if (b17.f23718a.compareAndSet(false, true)) {
                    b17.f23720c.attachToGLContext(b17.f23719b.f294395e);
                    ((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.m0) b17.f23721d).a();
                }
                b17.f23718a.get();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipGLHProgram", "attachGLContext done, used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public void b() {
        wq4.l0 l0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipGLHProgram", "detachGLContext");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        br4.e b17 = br4.e.b();
        synchronized (b17) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.VoipHardDecodeUtil", "detachGLContext, isContextAttached %s", b17.f23718a);
            if (b17.f23718a.compareAndSet(false, false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoipHardDecodeUtil", "current has attach and it need to detach ");
            }
            if (b17.f23718a.compareAndSet(true, false) && (l0Var = b17.f23720c) != null) {
                l0Var.detachFromGLContext();
                is0.c cVar = b17.f23719b;
                if (cVar != null) {
                    cVar.close();
                    b17.f23719b = null;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipGLHProgram", "detachGLContext done, used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public void c() {
        android.graphics.SurfaceTexture surfaceTexture = this.f23691e;
        if (surfaceTexture != null) {
            try {
                try {
                    surfaceTexture.updateTexImage();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoipGLHProgram", e17, "updateTexImage error", new java.lang.Object[0]);
                }
                android.opengl.GLES20.glUseProgram(this.f23687a);
                int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.f23687a, "vPosition");
                int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(this.f23687a, "vTexCoord");
                int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f23687a, androidx.camera.core.processing.util.GLUtils.VAR_TEXTURE);
                android.opengl.GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 8, (java.nio.Buffer) this.f23688b);
                android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                android.opengl.GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, 5126, false, 8, (java.nio.Buffer) this.f23689c);
                android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                android.opengl.GLES20.glActiveTexture(33984);
                android.opengl.GLES20.glBindTexture(36197, this.f23690d.f294395e);
                android.opengl.GLES20.glUniform1i(glGetUniformLocation, 0);
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                android.opengl.GLES20.glDrawArrays(5, 0, 4);
                android.opengl.GLES20.glFinish();
                android.opengl.GLES20.glDisableVertexAttribArray(glGetAttribLocation);
                android.opengl.GLES20.glDisableVertexAttribArray(glGetAttribLocation2);
                android.opengl.GLES20.glBindTexture(36197, 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoipGLHProgram", e18, "renderThis error", new java.lang.Object[0]);
            }
        }
    }
}
