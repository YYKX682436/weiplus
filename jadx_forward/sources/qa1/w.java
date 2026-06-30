package qa1;

/* loaded from: classes14.dex */
public class w implements qa1.n {

    /* renamed from: d, reason: collision with root package name */
    public final qa1.p f442561d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f442562e;

    public w(qa1.p pVar) {
        this.f442561d = pVar;
    }

    @Override // qa1.n
    public void A(android.view.SurfaceHolder surfaceHolder, qa1.o oVar) {
        int width = surfaceHolder.getSurfaceFrame().width();
        int height = surfaceHolder.getSurfaceFrame().height();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordableSurfaceView.LiveImp", "surface created %s %d %d", surfaceHolder, java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height));
        k63.o0 o0Var = (k63.o0) i95.n0.c(k63.o0.class);
        android.view.Surface surface = surfaceHolder.getSurface();
        ((k63.s) o0Var).getClass();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433707m, null, 0, surface, 6, null), p60.q.class, null);
        k63.o0 o0Var2 = (k63.o0) i95.n0.c(k63.o0.class);
        qa1.v vVar = new qa1.v(this, width, height, surfaceHolder, oVar);
        ((k63.s) o0Var2).getClass();
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433708n, null, 0, null, 12, null), p60.q.class, new k63.r(vVar));
    }

    @Override // qa1.n
    public boolean g(int i17) {
        int i18 = qa1.p.f442543p;
        return (i17 & 2) > 0;
    }

    @Override // qa1.u
    /* renamed from: getAbsSurfaceRenderer */
    public ms0.c mo159658xb03c03b4() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy queueEvent");
        return null;
    }

    @Override // qa1.u
    /* renamed from: getEGLContext */
    public android.opengl.EGLContext mo159659xe0fe423b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy getEGLContext");
        return null;
    }

    @Override // qa1.u
    /* renamed from: getPreviewTextureId */
    public int mo159660x174e6824() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy getPreviewTextureId");
        return 0;
    }

    @Override // qa1.u
    /* renamed from: getSurfaceHeight */
    public int mo159661xc2fc307e() {
        return this.f442561d.f442548n;
    }

    @Override // qa1.n
    /* renamed from: getSurfaceTexture */
    public java.lang.Object mo159662x182e20a4() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordableSurfaceView.LiveImp", "getSurfaceTexture %s", this.f442562e);
        return this.f442562e;
    }

    @Override // qa1.u
    /* renamed from: getSurfaceWidth */
    public int mo159663x40edc78f() {
        return this.f442561d.f442547m;
    }

    @Override // qa1.n
    /* renamed from: init */
    public void mo159664x316510() {
        this.f442562e = null;
    }

    @Override // qa1.u
    /* renamed from: isAvailable */
    public boolean mo159665x1a7eccbf() {
        return this.f442561d.f442546i;
    }

    @Override // et0.r
    public void l(yz5.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy requestRender");
    }

    @Override // qa1.n
    public void p(android.view.SurfaceHolder surfaceHolder, qa1.o oVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordableSurfaceView.LiveImp", "surface destroyed");
        qa1.p pVar = this.f442561d;
        pVar.a(surfaceHolder, z17);
        pVar.b(oVar);
    }

    @Override // qa1.n
    public void r(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19, qa1.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordableSurfaceView.LiveImp", "surface changed %s %d %d", surfaceHolder, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        ((k63.s) ((k63.o0) i95.n0.c(k63.o0.class))).getClass();
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433709o, null, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1765xc84b4196.C16072xd300b5e1(i18, i19), 6, null), p60.q.class, null);
        qa1.p pVar = this.f442561d;
        pVar.d(surfaceHolder, i17, i18, i19);
        pVar.b(oVar);
    }

    @Override // et0.r
    /* renamed from: requestRender */
    public void mo46859x511cb905() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy requestRender");
    }

    @Override // qa1.u
    /* renamed from: setOnSurfaceTextureAvailableDelegate */
    public void mo159666x86d373f(qa1.t tVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy setOnSurfaceTextureAvailableDelegate");
    }

    @Override // qa1.u
    /* renamed from: setOnTextureDrawFinishDelegate */
    public void mo159667x4c5d7736(yz5.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy setOnTextureDrawFinishDelegate");
    }

    @Override // qa1.u
    /* renamed from: setPreviewRenderer */
    public void mo159668xea80abe9(ms0.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy setPreviewRenderer");
    }
}
