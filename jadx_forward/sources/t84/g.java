package t84;

/* loaded from: classes4.dex */
public class g implements android.opengl.GLSurfaceView.Renderer {

    /* renamed from: a, reason: collision with root package name */
    public int f497984a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f497985b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77 f497986c;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77 c17797xece4de77, android.content.Context context) {
        this.f497986c = c17797xece4de77;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77 c17797xece4de77;
        java.util.Iterator it;
        boolean z17;
        java.lang.String str2;
        float f17;
        android.graphics.Bitmap bitmap;
        java.lang.String str3 = "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer");
        boolean z18 = false;
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16384);
        android.opengl.GLES20.glEnable(3042);
        android.opengl.GLES20.glBlendFunc(1, 771);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77 c17797xece4de772 = this.f497986c;
        java.util.Iterator it6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77.a(c17797xece4de772).iterator();
        while (it6.hasNext()) {
            t84.a aVar = (t84.a) it6.next();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            float[] fArr = c17797xece4de772.f245116m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            aVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            if (aVar.f497972t != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            } else {
                if (aVar.f497961i == null || aVar.f497962j == null) {
                    str = str3;
                    c17797xece4de77 = c17797xece4de772;
                    it = it6;
                    z17 = z18;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                } else {
                    boolean z19 = aVar.f497969q;
                    if (z19) {
                        if (z19 && (bitmap = aVar.f497959g) != null && aVar.f497965m == 0) {
                            aVar.f497965m = t84.i.b(bitmap);
                        }
                        t84.c cVar = (t84.c) aVar;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetMVPMatrix", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        float[] fArr2 = new float[16];
                        float[] fArr3 = cVar.L;
                        android.opengl.Matrix.setIdentityM(fArr3, 0);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateNormalizedTransXY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getParentWidth", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        int i17 = cVar.f497953a;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getParentWidth", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        float f18 = -(i17 - cVar.f497955c);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        c17797xece4de77 = c17797xece4de772;
                        float f19 = cVar.f497970r;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        float f27 = f18 / f19;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getParentHeight", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        it = it6;
                        int i18 = cVar.f497954b;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getParentHeight", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        float f28 = i18 - cVar.f497956d;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        float f29 = cVar.f497970r;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        cVar.f497977x = f27 + cVar.h(cVar.f497975v + cVar.I);
                        cVar.f497978y = (f28 / f29) - cVar.h(cVar.f497976w + cVar.f497974J);
                        if (cVar.H) {
                            float f37 = cVar.D;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                            float f38 = cVar.I;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTranslationX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                            str2 = "onGetMVPMatrix";
                            float f39 = cVar.f497975v;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTranslationX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                            float f47 = -((f37 - ((f38 + f39) + (cVar.f497955c / 2.0f))) + cVar.f497975v);
                            float f48 = cVar.E;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                            float f49 = cVar.f497974J;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTranslationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                            str = str3;
                            float f57 = cVar.f497976w;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTranslationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                            float f58 = (f48 - ((f49 + f57) + (cVar.f497956d / 2.0f))) + cVar.f497976w;
                            cVar.F = cVar.h(f47);
                            cVar.G = cVar.h(f58);
                            f17 = 0.0f;
                        } else {
                            str = str3;
                            str2 = "onGetMVPMatrix";
                            f17 = 0.0f;
                            cVar.F = 0.0f;
                            cVar.G = 0.0f;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateNormalizedTransXY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        android.opengl.Matrix.translateM(fArr3, 0, cVar.f497977x, cVar.f497978y, f17);
                        android.opengl.Matrix.rotateM(cVar.L, 0, 0.0f, 1.0f, 0.0f, 0.0f);
                        android.opengl.Matrix.rotateM(cVar.L, 0, cVar.C, 0.0f, 1.0f, 0.0f);
                        android.opengl.Matrix.translateM(fArr3, 0, -cVar.F, -cVar.G, 0.0f);
                        android.opengl.Matrix.rotateM(cVar.L, 0, cVar.B, 0.0f, 0.0f, 1.0f);
                        z17 = false;
                        android.opengl.Matrix.translateM(fArr3, 0, cVar.F, cVar.G, 0.0f);
                        android.opengl.Matrix.scaleM(fArr3, 0, cVar.f497979z, cVar.A, 1.0f);
                        android.opengl.Matrix.multiplyMM(fArr2, 0, fArr, 0, cVar.L, 0);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        android.opengl.GLES20.glUseProgram(aVar.f497966n);
                        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(aVar.f497966n, "aPosition");
                        aVar.f497963k = glGetAttribLocation;
                        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                        android.opengl.GLES20.glVertexAttribPointer(aVar.f497963k, 3, 5126, false, 12, (java.nio.Buffer) aVar.f497961i);
                        int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(aVar.f497966n, "aTextureCoord");
                        aVar.f497964l = glGetAttribLocation2;
                        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                        android.opengl.GLES20.glVertexAttribPointer(aVar.f497964l, 2, 5126, false, 8, (java.nio.Buffer) aVar.f497962j);
                        android.opengl.GLES20.glUniformMatrix4fv(android.opengl.GLES20.glGetUniformLocation(aVar.f497966n, "uMVPMatrix"), 1, false, fArr2, 0);
                        int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(aVar.f497966n, "uAlpha");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetAlpha", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        float f59 = cVar.K;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetAlpha", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
                        android.opengl.GLES20.glUniform1f(glGetUniformLocation, f59);
                        android.opengl.GLES20.glActiveTexture(33984);
                        android.opengl.GLES20.glBindTexture(3553, aVar.f497965m);
                        android.opengl.GLES20.glDrawArrays(5, 0, 4);
                        android.opengl.GLES20.glDisableVertexAttribArray(aVar.f497963k);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                    }
                }
                z18 = z17;
                c17797xece4de772 = c17797xece4de77;
                it6 = it;
                str3 = str;
            }
            str = str3;
            c17797xece4de77 = c17797xece4de772;
            it = it6;
            z17 = z18;
            z18 = z17;
            c17797xece4de772 = c17797xece4de77;
            it6 = it;
            str3 = str;
        }
        java.lang.String str4 = str3;
        if (this.f497984a == 0) {
            this.f497985b = java.lang.System.currentTimeMillis();
        }
        int i19 = this.f497984a + 1;
        this.f497984a = i19;
        if (i19 == 20) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GLViewContainer", "FrameRate=" + ((this.f497984a * 1000.0f) / ((float) (java.lang.System.currentTimeMillis() - this.f497985b))));
            this.f497985b = 0L;
            this.f497984a = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDrawFrame", str4);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSurfaceChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GLViewContainer", "onSurfaceChanged, w=" + i17 + ", h=" + i18);
        android.opengl.GLES20.glViewport(0, 0, i17, i18);
        float f17 = ((float) i17) / ((float) i18);
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77.f245109p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77 c17797xece4de77 = this.f497986c;
        float[] fArr = c17797xece4de77.f245117n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        android.opengl.Matrix.orthoM(fArr, 0, -f17, f17, -1.0f, 1.0f, -10.0f, 10.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        float[] fArr2 = c17797xece4de77.f245118o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        android.opengl.Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        float[] fArr3 = c17797xece4de77.f245116m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        float[] fArr4 = c17797xece4de77.f245117n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        float[] fArr5 = c17797xece4de77.f245118o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        android.opengl.Matrix.multiplyMM(fArr3, 0, fArr4, 0, fArr5, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$302", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        c17797xece4de77.f245110d = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$302", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$402", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        c17797xece4de77.f245111e = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$402", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        c17797xece4de77.g(i17, i18);
        if (i17 != 0 && i18 != 0) {
            java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77.a(c17797xece4de77).iterator();
            while (it.hasNext()) {
                ((t84.a) it.next()).e(i17, i18);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer");
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSurfaceCreated", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GLViewContainer", "onSurfaceCreated");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLProgramLoader");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadShader", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        int glCreateShader = android.opengl.GLES20.glCreateShader(35633);
        android.opengl.GLES20.glShaderSource(glCreateShader, "attribute vec4 aPosition;attribute vec2 aTextureCoord;uniform mat4 uMVPMatrix;varying vec2 vTextureCoord;void main(){gl_Position = uMVPMatrix * aPosition;\nvTextureCoord = aTextureCoord;\n}");
        android.opengl.GLES20.glCompileShader(glCreateShader);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadShader", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadShader", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        int glCreateShader2 = android.opengl.GLES20.glCreateShader(35632);
        android.opengl.GLES20.glShaderSource(glCreateShader2, "precision lowp float;varying vec2 vTextureCoord;uniform float uAlpha;uniform sampler2D uTexture;void main() {gl_FragColor = texture2D(uTexture, vTextureCoord);float alpha = uAlpha;gl_FragColor.a = gl_FragColor.a * alpha;gl_FragColor.r = gl_FragColor.r * alpha;gl_FragColor.g = gl_FragColor.g * alpha;gl_FragColor.b = gl_FragColor.b * alpha;}");
        android.opengl.GLES20.glCompileShader(glCreateShader2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadShader", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        android.opengl.GLES20.glAttachShader(glCreateProgram, glCreateShader);
        android.opengl.GLES20.glAttachShader(glCreateProgram, glCreateShader2);
        android.opengl.GLES20.glLinkProgram(glCreateProgram);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GLProgramLoader", "loadProgram, cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", progrom=" + glCreateProgram);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLProgramLoader");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77.f245109p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77 c17797xece4de77 = this.f497986c;
        c17797xece4de77.f245113g = glCreateProgram;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        java.util.HashMap hashMap = c17797xece4de77.f245114h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        hashMap.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        c17797xece4de77.f245112f = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16384);
        java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77.a(c17797xece4de77).iterator();
        while (it.hasNext()) {
            t84.a aVar = (t84.a) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            int i18 = c17797xece4de77.f245113g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            aVar.d(c17797xece4de77, i18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceCreated", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer");
    }
}
