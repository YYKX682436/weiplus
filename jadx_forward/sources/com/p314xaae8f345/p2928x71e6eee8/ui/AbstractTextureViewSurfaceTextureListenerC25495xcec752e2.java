package com.p314xaae8f345.p2928x71e6eee8.ui;

/* renamed from: com.tencent.scanlib.ui.ScanView */
/* loaded from: classes14.dex */
public abstract class AbstractTextureViewSurfaceTextureListenerC25495xcec752e2 extends android.widget.FrameLayout implements android.hardware.Camera.PreviewCallback, android.hardware.Camera.AutoFocusCallback, android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.TextureView f296834d;

    /* renamed from: e, reason: collision with root package name */
    public qt5.i0 f296835e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.SurfaceTexture f296836f;

    /* renamed from: g, reason: collision with root package name */
    public int f296837g;

    /* renamed from: h, reason: collision with root package name */
    public long f296838h;

    /* renamed from: i, reason: collision with root package name */
    public long f296839i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f296840m;

    /* renamed from: n, reason: collision with root package name */
    public final tt5.h f296841n;

    /* renamed from: o, reason: collision with root package name */
    public final tt5.g f296842o;

    public AbstractTextureViewSurfaceTextureListenerC25495xcec752e2(android.content.Context context) {
        super(context);
        this.f296840m = false;
        this.f296841n = new tt5.h(this, android.os.Looper.myLooper());
        this.f296842o = new tt5.g(this, android.os.Looper.myLooper());
    }

    public void a() {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "try close camera");
        if (((qt5.c) this.f296835e).f448190b) {
            qt5.f0 a17 = qt5.f0.a();
            qt5.q qVar = new qt5.q(this.f296835e);
            a17.getClass();
            a17.f448219a.mo126587xcadc4018(new qt5.c0(a17, qVar));
        }
    }

    public void b() {
        this.f296835e = new qt5.c();
    }

    public void c(long j17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f296839i;
        long j18 = 1000;
        tt5.g gVar = this.f296842o;
        if (currentTimeMillis > j18) {
            gVar.removeMessages(0);
            gVar.sendEmptyMessageDelayed(0, j17);
        } else {
            gVar.removeMessages(0);
            gVar.sendEmptyMessageDelayed(0, j17 + (j18 - currentTimeMillis));
        }
    }

    public void d() {
        android.view.TextureView textureView = new android.view.TextureView(getContext());
        this.f296834d = textureView;
        textureView.setSurfaceTextureListener(this);
        addView(this.f296834d, new android.widget.FrameLayout.LayoutParams(-1, -1));
        b();
        this.f296837g = getResources().getConfiguration().orientation;
        g(null);
    }

    public void e() {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "onPause");
    }

    public void f() {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "onResume");
    }

    public void g(qt5.f fVar) {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "try open camera");
        if (((qt5.c) this.f296835e).f448190b) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "camera is already open!");
            if (fVar != null) {
                fVar.a();
                return;
            }
            return;
        }
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "camera is not open");
        int rotation = ((android.app.Activity) getContext()).getWindowManager().getDefaultDisplay().getRotation();
        qt5.f0 a17 = qt5.f0.a();
        qt5.s sVar = new qt5.s(this.f296835e, rotation);
        a17.getClass();
        if (fVar != null) {
            fVar.e();
        }
        a17.f448219a.mo126587xcadc4018(new qt5.y(a17, fVar, sVar));
    }

    public void h(qt5.i iVar) {
        int rotation = ((android.app.Activity) getContext()).getWindowManager().getDefaultDisplay().getRotation();
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "try reopen camera " + rotation);
        qt5.f0 a17 = qt5.f0.a();
        qt5.u uVar = new qt5.u(this.f296835e, rotation);
        a17.getClass();
        if (iVar != null) {
            iVar.e();
        }
        a17.f448219a.mo126587xcadc4018(new qt5.e0(a17, iVar, uVar));
    }

    public void i(qt5.l lVar) {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "try start preview");
        if (!((qt5.c) this.f296835e).f448190b || ((qt5.c) this.f296835e).f448191c || this.f296836f == null) {
            return;
        }
        qt5.f0 a17 = qt5.f0.a();
        qt5.v vVar = new qt5.v(this.f296835e, this.f296836f);
        tt5.a aVar = new tt5.a(this, lVar);
        a17.getClass();
        aVar.e();
        a17.f448219a.mo126587xcadc4018(new qt5.a0(a17, aVar, vVar));
    }

    public void j() {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "try stop preview");
        if (((qt5.c) this.f296835e).f448190b) {
            qt5.f0 a17 = qt5.f0.a();
            qt5.w wVar = new qt5.w(this.f296835e);
            a17.getClass();
            a17.f448219a.mo126587xcadc4018(new qt5.b0(a17, wVar));
        }
    }

    public void k(long j17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f296838h;
        long j18 = 80;
        tt5.h hVar = this.f296841n;
        if (currentTimeMillis > j18) {
            hVar.removeMessages(0);
            hVar.sendEmptyMessageDelayed(0, j17);
        } else {
            hVar.removeMessages(0);
            hVar.sendEmptyMessageDelayed(0, j17 + (j18 - currentTimeMillis));
        }
    }

    public void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "onAutoFocus %s", java.lang.Boolean.valueOf(z17));
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "onConfigurationChanged %d,%d", java.lang.Integer.valueOf(configuration.orientation), java.lang.Integer.valueOf(this.f296837g));
        int i17 = configuration.orientation;
        if (i17 == this.f296837g || this.f296835e == null) {
            return;
        }
        this.f296837g = i17;
        h(new tt5.f(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
        a();
    }

    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        this.f296838h = 0L;
    }

    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "surface available, %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f296836f = surfaceTexture;
        if (!((qt5.c) this.f296835e).f448190b) {
            g(new tt5.d(this, i17, i18));
            return;
        }
        ((qt5.c) this.f296835e).l(new android.graphics.Point(i17, i18));
        i(new tt5.b(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "surface destroyed");
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "surface size changed, %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public AbstractTextureViewSurfaceTextureListenerC25495xcec752e2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f296840m = false;
        this.f296841n = new tt5.h(this, android.os.Looper.myLooper());
        this.f296842o = new tt5.g(this, android.os.Looper.myLooper());
    }

    public AbstractTextureViewSurfaceTextureListenerC25495xcec752e2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f296840m = false;
        this.f296841n = new tt5.h(this, android.os.Looper.myLooper());
        this.f296842o = new tt5.g(this, android.os.Looper.myLooper());
    }
}
