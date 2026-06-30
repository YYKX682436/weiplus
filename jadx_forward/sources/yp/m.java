package yp;

/* loaded from: classes10.dex */
public class m implements yp.j, android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.SurfaceView f545920d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.SurfaceHolder f545921e;

    /* renamed from: f, reason: collision with root package name */
    public yp.i f545922f;

    public m(android.view.SurfaceView surfaceView, yp.i iVar, boolean z17) {
        this.f545922f = iVar;
        this.f545920d = surfaceView;
        surfaceView.setWillNotCacheDrawing(true);
        surfaceView.setDrawingCacheEnabled(false);
        surfaceView.setWillNotDraw(true);
        if (z17) {
            surfaceView.setZOrderOnTop(true);
        } else {
            surfaceView.setZOrderMediaOverlay(true);
        }
        android.view.SurfaceHolder holder = surfaceView.getHolder();
        this.f545921e = holder;
        holder.addCallback(this);
        holder.setFormat(-2);
    }

    @Override // yp.j
    public void a(yp.i iVar) {
        this.f545922f = iVar;
    }

    @Override // yp.j
    public float b() {
        return this.f545920d.getY();
    }

    @Override // yp.j
    /* renamed from: getView */
    public android.view.View mo177446xfb86a31b() {
        return this.f545920d;
    }

    @Override // yp.j
    /* renamed from: lockCanvas */
    public android.graphics.Canvas mo177447x18d65a63() {
        return this.f545921e.lockCanvas();
    }

    @Override // yp.j
    /* renamed from: setOnTouchListener */
    public void mo177448xcc7da8b2(android.view.View.OnTouchListener onTouchListener) {
        this.f545920d.setOnTouchListener(onTouchListener);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        yp.i iVar = this.f545922f;
        if (iVar != null) {
            iVar.c();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SurfaceDanmakuView", "surfaceChanged, width = " + i18 + ", height = " + i19);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        yp.i iVar = this.f545922f;
        if (iVar != null) {
            iVar.b();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SurfaceDanmakuView", "surfaceCreated, isHardwareAccelerateEnable = false");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        yp.i iVar = this.f545922f;
        if (iVar != null) {
            iVar.a();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SurfaceDanmakuView", "surfaceDestroyed");
    }

    @Override // yp.j
    /* renamed from: unlock */
    public void mo177449xcde7df44() {
        java.lang.Object obj;
        android.view.SurfaceView surfaceView = this.f545920d;
        try {
            java.lang.reflect.Field declaredField = android.view.SurfaceView.class.getDeclaredField("mSurfaceLock");
            declaredField.setAccessible(true);
            obj = declaredField.get(surfaceView);
        } catch (java.lang.Exception unused) {
            obj = null;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = (java.util.concurrent.locks.ReentrantLock) obj;
        android.view.Surface surface = surfaceView.getHolder().getSurface();
        try {
            try {
                java.lang.reflect.Method declaredMethod = android.view.Surface.class.getDeclaredMethod("nativeRelease", java.lang.Long.TYPE);
                declaredMethod.setAccessible(true);
                java.lang.reflect.Field declaredField2 = android.view.Surface.class.getDeclaredField("mLockedObject");
                declaredField2.setAccessible(true);
                java.lang.Long l17 = (java.lang.Long) declaredField2.get(surface);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("surface_lock", "SurfaceDanmakuView unlock lockObjectValue = " + l17);
                if (l17.longValue() != 0) {
                    declaredMethod.invoke(null, l17);
                }
                declaredField2.setLong(surface, 0L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("surface_lock", "SurfaceDanmakuView unlock surfaceLock = " + reentrantLock);
                if (reentrantLock == null || !reentrantLock.isLocked()) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("surface_lock", "SurfaceDanmakuView unlock:release failed" + e17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("surface_lock", "SurfaceDanmakuView unlock surfaceLock = " + reentrantLock);
                if (reentrantLock == null || !reentrantLock.isLocked()) {
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("surface_lock", "SurfaceDanmakuView unlock");
            reentrantLock.unlock();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("surface_lock", "SurfaceDanmakuView unlock surfaceLock = " + reentrantLock);
            if (reentrantLock != null && reentrantLock.isLocked()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("surface_lock", "SurfaceDanmakuView unlock");
                reentrantLock.unlock();
            }
            throw th6;
        }
    }

    @Override // yp.j
    /* renamed from: unlockCanvasAndPost */
    public void mo177450x65a3f1bb(android.graphics.Canvas canvas) {
        this.f545921e.unlockCanvasAndPost(canvas);
    }
}
