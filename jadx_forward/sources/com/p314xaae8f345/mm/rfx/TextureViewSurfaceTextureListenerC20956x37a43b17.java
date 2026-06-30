package com.p314xaae8f345.mm.rfx;

/* renamed from: com.tencent.mm.rfx.RfxPagView */
/* loaded from: classes13.dex */
public class TextureViewSurfaceTextureListenerC20956x37a43b17 extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener, gs.c, com.p314xaae8f345.mm.rfx.p2589x5fb4e56.g {

    /* renamed from: mAnimator */
    private com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20959x8fcda259 f39128xf597d274;

    /* renamed from: mFilePath */
    private java.lang.String f39129xf924574e;

    /* renamed from: mIsAttachedToWindow */
    private boolean f39130xf385e4a6;

    /* renamed from: mIsVisible */
    private boolean f39131x73fa81fb;

    /* renamed from: mListener */
    private android.view.TextureView.SurfaceTextureListener f39132x753a6c41;

    /* renamed from: mPagFlushListeners */
    private final java.util.ArrayList<com.p314xaae8f345.mm.rfx.h> f39133xbc3c20e4;

    /* renamed from: mPagPlayer */
    private com.p314xaae8f345.mm.rfx.C20948xd56d46d3 f39134x8c3f392a;

    /* renamed from: mPagSurface */
    private com.p314xaae8f345.mm.rfx.C20951x8730befb f39135xaa9d1784;

    /* renamed from: mSharedContext */
    private android.opengl.EGLContext f39136x82565e1d;

    /* renamed from: mSurfaceDestroyTaskExecutor */
    private com.p314xaae8f345.mm.rfx.j f39137xe25e02f2;

    /* renamed from: mViewListeners */
    private final java.util.ArrayList<com.p314xaae8f345.mm.rfx.i> f39138xee7be9ad;

    public TextureViewSurfaceTextureListenerC20956x37a43b17(android.content.Context context) {
        super(context);
        this.f39134x8c3f392a = null;
        this.f39135xaa9d1784 = null;
        this.f39128xf597d274 = null;
        this.f39129xf924574e = "";
        this.f39130xf385e4a6 = false;
        this.f39136x82565e1d = null;
        this.f39138xee7be9ad = new java.util.ArrayList<>();
        this.f39133xbc3c20e4 = new java.util.ArrayList<>();
        this.f39137xe25e02f2 = null;
        this.f39131x73fa81fb = false;
        m77550xd396bb8b();
    }

    /* renamed from: checkVisible */
    private void m77546x18346a4a() {
        boolean z17 = this.f39130xf385e4a6 && isShown();
        if (this.f39131x73fa81fb == z17) {
            return;
        }
        this.f39131x73fa81fb = z17;
        if (!z17) {
            m77548x9b59067().m77636xffd6ec16(0L);
        } else {
            m77548x9b59067().m77636xffd6ec16(m77549x10f56061().m77481x89444d94());
            m77548x9b59067().m77641xce0038c9();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: destroySurface */
    public void m77547x6153d753(android.graphics.SurfaceTexture surfaceTexture) {
        m77549x10f56061().m77499x42c875eb(null);
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f39132x753a6c41;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
    }

    /* renamed from: getPagAnimator */
    private com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20959x8fcda259 m77548x9b59067() {
        m77549x10f56061();
        if (this.f39128xf597d274 == null) {
            this.f39128xf597d274 = com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20959x8fcda259.m77617x63e4ed8(getContext(), this);
        }
        return this.f39128xf597d274;
    }

    /* renamed from: getPagPlayer */
    private com.p314xaae8f345.mm.rfx.C20948xd56d46d3 m77549x10f56061() {
        if (this.f39134x8c3f392a == null) {
            this.f39134x8c3f392a = new com.p314xaae8f345.mm.rfx.C20948xd56d46d3();
        }
        return this.f39134x8c3f392a;
    }

    /* renamed from: setupSurfaceTexture */
    private void m77550xd396bb8b() {
        gs.a aVar = gs.a.f356491f;
        aVar.getClass();
        if (getContext() instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) getContext();
            if (!activity.isDestroyed()) {
                android.app.FragmentManager fragmentManager = activity.getFragmentManager();
                gs.b bVar = (gs.b) ((java.util.HashMap) aVar.f356493e).get(fragmentManager);
                if (bVar == null && (bVar = (gs.b) fragmentManager.findFragmentByTag("io.rfxpag.manager")) == null) {
                    bVar = new gs.b();
                    ((java.util.HashMap) aVar.f356493e).put(fragmentManager, bVar);
                    fragmentManager.beginTransaction().add(bVar, "io.rfxpag.manager").commitAllowingStateLoss();
                    aVar.f356492d.obtainMessage(1, fragmentManager).sendToTarget();
                }
                synchronized (bVar.f356495e) {
                    bVar.f356494d.add(this);
                }
            }
        }
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    /* renamed from: updateTextureView */
    private void m77551x1c41c5d7() {
        post(new com.p314xaae8f345.mm.rfx.d(this));
    }

    /* renamed from: addListener */
    public void m77552x162a7075(com.p314xaae8f345.mm.rfx.i iVar) {
        synchronized (this) {
            this.f39138xee7be9ad.add(iVar);
        }
    }

    @java.lang.Deprecated
    /* renamed from: addPagFlushListener */
    public void m77553x73081da3(com.p314xaae8f345.mm.rfx.h hVar) {
        synchronized (this) {
            this.f39133xbc3c20e4.add(hVar);
        }
    }

    /* renamed from: duration */
    public long m77554x89444d94() {
        return m77549x10f56061().m77481x89444d94();
    }

    /* renamed from: flush */
    public boolean m77555x5d03b04() {
        return m77549x10f56061().m77483x5d03b04();
    }

    /* renamed from: flushWithInfo */
    public com.p314xaae8f345.mm.rfx.C20944x47b47a89 m77556x183a11b8() {
        return m77549x10f56061().m77485x183a11b8();
    }

    /* renamed from: freeCache */
    public void m77557xe496cc76() {
    }

    /* renamed from: getComposition */
    public com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77558xa7d55074() {
        return m77549x10f56061().m77486xa7d55074();
    }

    /* renamed from: getPath */
    public java.lang.String m77559xfb83cc9b() {
        return this.f39129xf924574e;
    }

    /* renamed from: getProgress */
    public double m77560x402effa3() {
        return m77549x10f56061().m77487x402effa3();
    }

    /* renamed from: isPlaying */
    public boolean m77561xc00617a4() {
        return m77548x9b59067().m77631x39e05d35();
    }

    /* renamed from: isSync */
    public boolean m77562xb9a8f6e5() {
        return m77548x9b59067().m77632xb9a8f6e5();
    }

    /* renamed from: matrix */
    public android.graphics.Matrix m77563xbf8d97c1() {
        return m77549x10f56061().m77489xbf8d97c1();
    }

    /* renamed from: maxFrameRate */
    public float m77564xcba736e9() {
        return m77549x10f56061().m77490xcba736e9();
    }

    @Override // com.p314xaae8f345.mm.rfx.p2589x5fb4e56.g
    /* renamed from: onAnimationCancel */
    public void mo77565x827d33f(com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20959x8fcda259 c20959x8fcda259) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f39138xee7be9ad);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.rfx.i) it.next()).c(this);
        }
    }

    @Override // com.p314xaae8f345.mm.rfx.p2589x5fb4e56.g
    /* renamed from: onAnimationEnd */
    public void mo77566xbb3aa236(com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20959x8fcda259 c20959x8fcda259) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f39138xee7be9ad);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.rfx.i) it.next()).d(this);
        }
    }

    @Override // com.p314xaae8f345.mm.rfx.p2589x5fb4e56.g
    /* renamed from: onAnimationRepeat */
    public void mo77567x21f9d260(com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20959x8fcda259 c20959x8fcda259) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f39138xee7be9ad);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.rfx.i) it.next()).a(this);
        }
    }

    @Override // com.p314xaae8f345.mm.rfx.p2589x5fb4e56.g
    /* renamed from: onAnimationStart */
    public void mo77568xd7e2f2fd(com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20959x8fcda259 c20959x8fcda259) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f39138xee7be9ad);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.rfx.i) it.next()).f(this);
        }
    }

    @Override // com.p314xaae8f345.mm.rfx.p2589x5fb4e56.g
    /* renamed from: onAnimationUpdate */
    public void mo77569x27addd8e(com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20959x8fcda259 c20959x8fcda259) {
        java.util.ArrayList arrayList;
        m77549x10f56061().m77497x3ae760af(c20959x8fcda259.m77633xc454c22d());
        synchronized (this) {
            if (this.f39130xf385e4a6) {
                if (this.f39131x73fa81fb) {
                    c20959x8fcda259.m77636xffd6ec16(m77549x10f56061().m77481x89444d94());
                }
                com.p314xaae8f345.mm.rfx.C20944x47b47a89 m77556x183a11b8 = m77556x183a11b8();
                if (m77556x183a11b8 != null) {
                    if (m77556x183a11b8.f39077x9ab14c87) {
                        m77551x1c41c5d7();
                    }
                    synchronized (this) {
                        arrayList = new java.util.ArrayList(this.f39138xee7be9ad);
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.rfx.i iVar = (com.p314xaae8f345.mm.rfx.i) it.next();
                        iVar.b(this);
                        iVar.e(this, m77556x183a11b8);
                    }
                    if (this.f39133xbc3c20e4.isEmpty()) {
                        return;
                    }
                    post(new com.p314xaae8f345.mm.rfx.g(this));
                }
            }
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        this.f39130xf385e4a6 = true;
        super.onAttachedToWindow();
        m77546x18346a4a();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f39130xf385e4a6 = false;
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.rfx.C20951x8730befb c20951x8730befb = this.f39135xaa9d1784;
        if (c20951x8730befb != null) {
            c20951x8730befb.m77524x41012807();
            this.f39135xaa9d1784 = null;
        }
        m77546x18346a4a();
    }

    @Override // gs.c
    /* renamed from: onResume */
    public void mo77570x57429eec() {
        if (this.f39131x73fa81fb) {
            setVisibility(4);
            setVisibility(0);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.mm.rfx.C20951x8730befb c20951x8730befb = this.f39135xaa9d1784;
        if (c20951x8730befb != null) {
            c20951x8730befb.m77524x41012807();
            this.f39135xaa9d1784 = null;
        }
        this.f39135xaa9d1784 = com.p314xaae8f345.mm.rfx.C20951x8730befb.m77509xaa114218(surfaceTexture, this.f39136x82565e1d);
        m77549x10f56061().m77499x42c875eb(this.f39135xaa9d1784);
        if (this.f39135xaa9d1784 == null) {
            return;
        }
        m77548x9b59067().m77641xce0038c9();
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f39132x753a6c41;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.mm.rfx.j jVar = this.f39137xe25e02f2;
        if (jVar != null) {
            com.p314xaae8f345.mm.rfx.e eVar = new com.p314xaae8f345.mm.rfx.e(this, surfaceTexture);
            ((ym5.y1) jVar).getClass();
            ((ku5.t0) ku5.t0.f394148d).g(eVar);
        } else {
            m77547x6153d753(surfaceTexture);
        }
        post(new com.p314xaae8f345.mm.rfx.f(this, surfaceTexture));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.mm.rfx.C20951x8730befb c20951x8730befb = this.f39135xaa9d1784;
        if (c20951x8730befb != null) {
            c20951x8730befb.m77525xee5c006a();
            m77548x9b59067().m77641xce0038c9();
        }
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f39132x753a6c41;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f39132x753a6c41;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z17) {
        super.onVisibilityAggregated(this.f39131x73fa81fb);
        m77546x18346a4a();
    }

    /* renamed from: pause */
    public void m77571x65825f6() {
        m77548x9b59067().m77628xae7a2e7a();
    }

    /* renamed from: play */
    public void m77572x348b34() {
        m77549x10f56061().m77491xed060d07();
        m77548x9b59067().m77640x68ac462();
    }

    /* renamed from: release */
    public void m77573x41012807() {
        com.p314xaae8f345.mm.rfx.C20951x8730befb c20951x8730befb = this.f39135xaa9d1784;
        if (c20951x8730befb != null) {
            c20951x8730befb.m77524x41012807();
            this.f39135xaa9d1784 = null;
        }
        com.p314xaae8f345.mm.rfx.C20948xd56d46d3 c20948xd56d46d3 = this.f39134x8c3f392a;
        if (c20948xd56d46d3 != null) {
            c20948xd56d46d3.m77492x41012807();
        }
    }

    /* renamed from: removeListener */
    public void m77574xf1335d58(com.p314xaae8f345.mm.rfx.i iVar) {
        synchronized (this) {
            this.f39138xee7be9ad.remove(iVar);
        }
    }

    @java.lang.Deprecated
    /* renamed from: removePagFlushListener */
    public void m77575x55137786(com.p314xaae8f345.mm.rfx.h hVar) {
        synchronized (this) {
            this.f39133xbc3c20e4.remove(hVar);
        }
    }

    /* renamed from: repeatCount */
    public int m77576x5dab7c34() {
        return m77548x9b59067().m77635x5dab7c34();
    }

    /* renamed from: scaleMode */
    public int m77577x900e020d() {
        return m77549x10f56061().m77493x900e020d();
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
    }

    /* renamed from: setComposition */
    public void m77578x3e3ac3e8(com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee) {
        this.f39129xf924574e = null;
        m77549x10f56061().m77494x3e3ac3e8(c20942x379cf5ee);
        m77548x9b59067().m77637x3ae760af(m77549x10f56061().m77487x402effa3());
        if (this.f39131x73fa81fb) {
            m77548x9b59067().m77636xffd6ec16(m77549x10f56061().m77481x89444d94());
        }
    }

    /* renamed from: setMatrix */
    public void m77579x17d9eec3(android.graphics.Matrix matrix) {
        m77549x10f56061().m77495x17d9eec3(matrix);
    }

    /* renamed from: setMaxFrameRate */
    public void m77580x62e2c46b(float f17) {
        m77549x10f56061().m77496x62e2c46b(f17);
    }

    /* renamed from: setPath */
    public boolean m77581x764e93a7(java.lang.String str) {
        com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77391x243906 = (str == null || !str.startsWith("assets://")) ? com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77391x243906(str) : com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77390x243906(getContext().getAssets(), str.substring(9));
        m77578x3e3ac3e8(m77391x243906);
        this.f39129xf924574e = str;
        return m77391x243906 != null;
    }

    /* renamed from: setPathAsync */
    public void m77582x4398af15(java.lang.String str, com.p314xaae8f345.mm.rfx.a aVar) {
    }

    /* renamed from: setProgress */
    public void m77583x3ae760af(double d17) {
        m77549x10f56061().m77497x3ae760af(d17);
        m77548x9b59067().m77637x3ae760af(m77549x10f56061().m77487x402effa3());
        m77548x9b59067().m77641xce0038c9();
    }

    /* renamed from: setRepeatCount */
    public void m77584xcde73672(int i17) {
        m77548x9b59067().m77638xcde73672(i17);
    }

    /* renamed from: setScaleMode */
    public void m77585xebcf33cb(int i17) {
        m77549x10f56061().m77498xebcf33cb(i17);
    }

    /* renamed from: setSurfaceDestroyTaskExecutor */
    public void m77586x4f106a7(com.p314xaae8f345.mm.rfx.j jVar) {
        this.f39137xe25e02f2 = jVar;
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(android.view.TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (surfaceTextureListener == this) {
            super.setSurfaceTextureListener(surfaceTextureListener);
        } else {
            this.f39132x753a6c41 = surfaceTextureListener;
        }
    }

    /* renamed from: setSync */
    public void m77587x76504a1d(boolean z17) {
        m77548x9b59067().m77639x76504a1d(z17);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        m77546x18346a4a();
    }

    /* renamed from: stop */
    public void m77588x360802() {
        m77548x9b59067().m77628xae7a2e7a();
    }

    public TextureViewSurfaceTextureListenerC20956x37a43b17(android.content.Context context, android.opengl.EGLContext eGLContext) {
        super(context);
        this.f39134x8c3f392a = null;
        this.f39135xaa9d1784 = null;
        this.f39128xf597d274 = null;
        this.f39129xf924574e = "";
        this.f39130xf385e4a6 = false;
        this.f39136x82565e1d = null;
        this.f39138xee7be9ad = new java.util.ArrayList<>();
        this.f39133xbc3c20e4 = new java.util.ArrayList<>();
        this.f39137xe25e02f2 = null;
        this.f39131x73fa81fb = false;
        this.f39136x82565e1d = eGLContext;
        m77550xd396bb8b();
    }

    public TextureViewSurfaceTextureListenerC20956x37a43b17(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39134x8c3f392a = null;
        this.f39135xaa9d1784 = null;
        this.f39128xf597d274 = null;
        this.f39129xf924574e = "";
        this.f39130xf385e4a6 = false;
        this.f39136x82565e1d = null;
        this.f39138xee7be9ad = new java.util.ArrayList<>();
        this.f39133xbc3c20e4 = new java.util.ArrayList<>();
        this.f39137xe25e02f2 = null;
        this.f39131x73fa81fb = false;
        m77550xd396bb8b();
    }

    public TextureViewSurfaceTextureListenerC20956x37a43b17(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f39134x8c3f392a = null;
        this.f39135xaa9d1784 = null;
        this.f39128xf597d274 = null;
        this.f39129xf924574e = "";
        this.f39130xf385e4a6 = false;
        this.f39136x82565e1d = null;
        this.f39138xee7be9ad = new java.util.ArrayList<>();
        this.f39133xbc3c20e4 = new java.util.ArrayList<>();
        this.f39137xe25e02f2 = null;
        this.f39131x73fa81fb = false;
        m77550xd396bb8b();
    }
}
