package nh2;

/* loaded from: classes10.dex */
public final class i implements nh2.c, android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.SurfaceHolder f418644d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.SurfaceView f418645e;

    /* renamed from: f, reason: collision with root package name */
    public nh2.b f418646f;

    public i(android.view.SurfaceView surfaceView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceView, "surfaceView");
        this.f418645e = surfaceView;
        android.view.SurfaceHolder holder = surfaceView.getHolder();
        this.f418644d = holder;
        if (holder != null) {
            holder.addCallback(this);
        }
        if (holder != null) {
            holder.setFormat(-2);
        }
    }

    @Override // nh2.c
    public void a(nh2.b bVar) {
        this.f418646f = bVar;
    }

    @Override // nh2.c
    /* renamed from: lockCanvas */
    public android.graphics.Canvas mo149601x18d65a63() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.view.SurfaceHolder surfaceHolder = this.f418644d;
        if (i17 >= 26) {
            if (surfaceHolder != null) {
                return surfaceHolder.lockHardwareCanvas();
            }
            return null;
        }
        if (surfaceHolder != null) {
            return surfaceHolder.lockCanvas();
        }
        return null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        nh2.b bVar = this.f418646f;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        nh2.b bVar = this.f418646f;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        nh2.b bVar = this.f418646f;
        if (bVar != null) {
            bVar.d();
        }
    }

    @Override // nh2.c
    /* renamed from: unlockCanvasAndPost */
    public void mo149602x65a3f1bb(android.graphics.Canvas canvas) {
        android.view.SurfaceHolder surfaceHolder = this.f418644d;
        if (surfaceHolder != null) {
            surfaceHolder.unlockCanvasAndPost(canvas);
        }
    }
}
