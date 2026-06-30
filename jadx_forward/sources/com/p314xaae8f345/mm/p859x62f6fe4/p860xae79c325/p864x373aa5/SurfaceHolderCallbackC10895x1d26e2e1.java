package com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/media/camera/view/CameraKitSurfaceView;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback;", "Lbs0/i;", "Lnr0/z;", "kit", "Ljz5/f0;", "setCameraKitEnv", "", "radius", "setCornerRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-camera_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.media.camera.view.CameraKitSurfaceView */
/* loaded from: classes14.dex */
public final class SurfaceHolderCallbackC10895x1d26e2e1 extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback, bs0.i {

    /* renamed from: d, reason: collision with root package name */
    public nr0.z f150398d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f150399e;

    /* renamed from: f, reason: collision with root package name */
    public int f150400f;

    /* renamed from: g, reason: collision with root package name */
    public int f150401g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceHolderCallbackC10895x1d26e2e1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        getHolder().addCallback(this);
        try {
            try {
                try {
                    getHolder().setType(2);
                } catch (java.lang.Exception unused) {
                }
            } catch (java.lang.Exception unused2) {
                getHolder().setType(1);
            }
        } catch (java.lang.Exception unused3) {
            getHolder().setType(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitSurfaceView", "CameraKitSurfaceView create");
    }

    @Override // bs0.i
    /* renamed from: setCameraKitEnv */
    public void mo11087x5156873e(nr0.z zVar) {
        this.f150398d = zVar;
        android.view.Surface surface = this.f150399e;
        if (surface == null || zVar == null) {
            return;
        }
        ((pr0.n0) zVar).o(surface, java.lang.Integer.valueOf(this.f150400f), java.lang.Integer.valueOf(this.f150401g));
    }

    @Override // bs0.i
    /* renamed from: setCornerRadius */
    public void mo11088xba0484c9(float f17) {
        if (f17 == 0.0f) {
            return;
        }
        setClipToOutline(true);
        setOutlineProvider(new bs0.a(f17));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitSurfaceView", "[" + hashCode() + "]surfaceChanged width:" + i18 + " height:" + i19);
        nr0.z zVar = this.f150398d;
        if (zVar != null) {
            pr0.n0 n0Var = (pr0.n0) zVar;
            n0Var.l("updateScreenSize", new pr0.m0(n0Var, i18, i19, null));
        }
        this.f150400f = i18;
        this.f150401g = i19;
        setBackgroundColor(0);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitSurfaceView", "[" + hashCode() + "]surfaceCreated");
        nr0.z zVar = this.f150398d;
        if (zVar != null) {
            android.view.Surface surface = holder.getSurface();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(surface, "getSurface(...)");
            ((pr0.n0) zVar).o(surface, null, null);
        }
        this.f150399e = holder.getSurface();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitSurfaceView", "[" + hashCode() + "]surfaceDestroyed");
        nr0.z zVar = this.f150398d;
        if (zVar != null) {
            pr0.n0 n0Var = (pr0.n0) zVar;
            n0Var.m("unbindSurface", new pr0.k0(n0Var, null));
        }
        this.f150399e = null;
        this.f150400f = 0;
        this.f150401g = 0;
        setBackgroundColor(-16777216);
    }
}
