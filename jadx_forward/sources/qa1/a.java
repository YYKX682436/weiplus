package qa1;

/* loaded from: classes14.dex */
public class a implements qa1.n {

    /* renamed from: d, reason: collision with root package name */
    public final qa1.p f442492d;

    public a(qa1.p pVar) {
        this.f442492d = pVar;
    }

    @Override // qa1.n
    public void A(android.view.SurfaceHolder surfaceHolder, qa1.o oVar) {
        qa1.p pVar = this.f442492d;
        pVar.e(surfaceHolder);
        pVar.b(oVar);
    }

    @Override // qa1.n
    public boolean g(int i17) {
        return i17 == 0;
    }

    @Override // qa1.u
    /* renamed from: getAbsSurfaceRenderer */
    public ms0.c mo159658xb03c03b4() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy queueEvent");
        return null;
    }

    @Override // qa1.u
    /* renamed from: getEGLContext */
    public android.opengl.EGLContext mo159659xe0fe423b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy getEGLContext");
        return null;
    }

    @Override // qa1.u
    /* renamed from: getPreviewTextureId */
    public int mo159660x174e6824() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy getPreviewTextureId");
        return 0;
    }

    @Override // qa1.u
    /* renamed from: getSurfaceHeight */
    public int mo159661xc2fc307e() {
        return this.f442492d.f442548n;
    }

    @Override // qa1.n
    /* renamed from: getSurfaceTexture */
    public java.lang.Object mo159662x182e20a4() {
        return this.f442492d.c();
    }

    @Override // qa1.u
    /* renamed from: getSurfaceWidth */
    public int mo159663x40edc78f() {
        return this.f442492d.f442547m;
    }

    @Override // qa1.n
    /* renamed from: init */
    public void mo159664x316510() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: init. switch to support node js");
    }

    @Override // qa1.u
    /* renamed from: isAvailable */
    public boolean mo159665x1a7eccbf() {
        return this.f442492d.f442546i;
    }

    @Override // et0.r
    public void l(yz5.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy requestRender");
    }

    @Override // qa1.n
    public void p(android.view.SurfaceHolder surfaceHolder, qa1.o oVar, boolean z17) {
        qa1.p pVar = this.f442492d;
        pVar.a(surfaceHolder, z17);
        pVar.b(oVar);
    }

    @Override // qa1.n
    public void r(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19, qa1.o oVar) {
        qa1.p pVar = this.f442492d;
        pVar.d(surfaceHolder, i17, i18, i19);
        pVar.b(oVar);
    }

    @Override // et0.r
    /* renamed from: requestRender */
    public void mo46859x511cb905() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy requestRender");
    }

    @Override // qa1.u
    /* renamed from: setOnSurfaceTextureAvailableDelegate */
    public void mo159666x86d373f(qa1.t tVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy setOnSurfaceTextureAvailableDelegate");
    }

    @Override // qa1.u
    /* renamed from: setOnTextureDrawFinishDelegate */
    public void mo159667x4c5d7736(yz5.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy setOnTextureDrawFinishDelegate");
    }

    @Override // qa1.u
    /* renamed from: setPreviewRenderer */
    public void mo159668xea80abe9(ms0.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy setPreviewRenderer");
    }
}
