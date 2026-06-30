package com.p314xaae8f345.mm.p1006xc5476f33.p2323x6b0147b;

/* renamed from: com.tencent.mm.plugin.video.ObservableSurfaceView */
/* loaded from: classes14.dex */
public class SurfaceHolderCallbackC18785xa054a78f extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public android.view.SurfaceHolder f257056d;

    /* renamed from: e, reason: collision with root package name */
    public fo4.a f257057e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f257058f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f257059g;

    public SurfaceHolderCallbackC18785xa054a78f(android.content.Context context) {
        super(context);
        this.f257057e = null;
        this.f257058f = false;
        this.f257059g = false;
        android.view.SurfaceHolder holder = getHolder();
        this.f257056d = holder;
        holder.addCallback(this);
    }

    /* renamed from: getSurfaceHolder */
    public android.view.SurfaceHolder m72361xc38a6d03() {
        return this.f257056d;
    }

    /* renamed from: setNeedSetType */
    public void m72362xb7f8d384(boolean z17) {
        this.f257059g = z17;
        if (z17) {
            this.f257056d.setType(3);
        }
    }

    /* renamed from: setSurfaceChangeCallback */
    public void m72363x31bff2e0(fo4.a aVar) {
        this.f257057e = aVar;
        if (this.f257059g) {
            this.f257056d.setType(3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        try {
            this.f257056d.removeCallback(this);
        } catch (java.lang.Exception unused) {
        }
        this.f257056d = surfaceHolder;
        surfaceHolder.addCallback(this);
        fo4.a aVar = this.f257057e;
        if (aVar != null) {
            android.view.SurfaceHolder surfaceHolder2 = this.f257056d;
            yq4.b bVar = (yq4.b) aVar;
            if (!bVar.f546100n || surfaceHolder2.getSurface() == null) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Boolean.valueOf(bVar.f546100n);
                objArr[1] = java.lang.Boolean.valueOf(surfaceHolder2.getSurface() == null);
                objArr[2] = java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.CaptureRender", "surfaceChange failed, CameraOpen: %b, surface: %b, apiLevel: %s", objArr);
                return;
            }
            try {
                if (!bVar.f546096g.f529187c) {
                    bVar.f546096g.g(null);
                }
                bVar.f546096g.l();
                android.hardware.Camera camera = bVar.f546096g.f529185a;
                if (camera != null) {
                    camera.setPreviewDisplay(surfaceHolder2);
                }
                bVar.g();
                bVar.f546096g.k();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(159L, 0L, 1L, false);
                g0Var.mo68477x336bdfd8(159L, 2L, 1L, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.CaptureRender", "surfaceChange failed" + e17.getMessage());
                bVar.f546095f = 1;
            }
            if (bVar.f546108v) {
                bVar.h();
                bVar.f546108v = false;
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        this.f257058f = true;
        fo4.a aVar = this.f257057e;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.f257058f = false;
    }

    public SurfaceHolderCallbackC18785xa054a78f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f257057e = null;
        this.f257058f = false;
        this.f257059g = false;
        android.view.SurfaceHolder holder = getHolder();
        this.f257056d = holder;
        holder.addCallback(this);
    }

    public SurfaceHolderCallbackC18785xa054a78f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f257057e = null;
        this.f257058f = false;
        this.f257059g = false;
        android.view.SurfaceHolder holder = getHolder();
        this.f257056d = holder;
        holder.addCallback(this);
    }
}
