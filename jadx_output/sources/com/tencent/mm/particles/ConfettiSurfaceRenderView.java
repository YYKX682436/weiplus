package com.tencent.mm.particles;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/particles/ConfettiSurfaceRenderView;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback;", "Le51/m;", "Landroid/os/Looper;", "getLooper", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "particles-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class ConfettiSurfaceRenderView extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback, e51.m {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f72359d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.SurfaceHolder f72360e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.HandlerThread f72361f;

    /* renamed from: g, reason: collision with root package name */
    public e51.e f72362g;

    public ConfettiSurfaceRenderView(android.content.Context context) {
        super(context);
        this.f72360e = getHolder();
        setZOrderMediaOverlay(true);
        android.view.SurfaceHolder surfaceHolder = this.f72360e;
        if (surfaceHolder != null) {
            surfaceHolder.setFormat(-2);
        }
        android.view.SurfaceHolder surfaceHolder2 = this.f72360e;
        if (surfaceHolder2 != null) {
            surfaceHolder2.addCallback(this);
        }
    }

    private final android.os.Looper getLooper() {
        android.os.HandlerThread handlerThread = this.f72361f;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f72361f = null;
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("ConfettiRenderThread", 5);
        this.f72361f = a17;
        a17.start();
        android.os.HandlerThread handlerThread2 = this.f72361f;
        kotlin.jvm.internal.o.d(handlerThread2);
        android.os.Looper looper = handlerThread2.getLooper();
        kotlin.jvm.internal.o.f(looper, "getLooper(...)");
        return looper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0019, code lost:
    
        if (r1 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
    
        r1.unlockCanvasAndPost(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0024, code lost:
    
        if (r1 == null) goto L25;
     */
    @Override // e51.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r3 = this;
            boolean r0 = r3.f72359d
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r3.getVisibility()
            r1 = 0
            if (r0 == 0) goto L41
            android.graphics.Canvas r0 = r3.b()
            if (r0 == 0) goto L32
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            r0.drawColor(r1, r2)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            android.view.SurfaceHolder r1 = r3.f72360e     // Catch: java.lang.Exception -> L32
            if (r1 == 0) goto L32
            goto L26
        L1c:
            r1 = move-exception
            goto L2a
        L1e:
            r1 = move-exception
            r1.toString()     // Catch: java.lang.Throwable -> L1c
            android.view.SurfaceHolder r1 = r3.f72360e     // Catch: java.lang.Exception -> L32
            if (r1 == 0) goto L32
        L26:
            r1.unlockCanvasAndPost(r0)     // Catch: java.lang.Exception -> L32
            goto L32
        L2a:
            android.view.SurfaceHolder r2 = r3.f72360e     // Catch: java.lang.Exception -> L31
            if (r2 == 0) goto L31
            r2.unlockCanvasAndPost(r0)     // Catch: java.lang.Exception -> L31
        L31:
            throw r1
        L32:
            e51.e r0 = r3.f72362g
            if (r0 == 0) goto L40
            android.os.Message r1 = android.os.Message.obtain()
            r2 = 3
            r1.what = r2
            r0.sendMessage(r1)
        L40:
            return
        L41:
            android.graphics.Canvas r0 = r3.b()
            if (r0 == 0) goto L84
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            r0.drawColor(r1, r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            e51.e r1 = r3.f72362g     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            if (r1 == 0) goto L53
            r1.a(r0)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
        L53:
            boolean r1 = r3.f72359d     // Catch: java.lang.Exception -> L6e
            if (r1 == 0) goto L84
            android.view.SurfaceHolder r1 = r3.f72360e     // Catch: java.lang.Exception -> L6e
            if (r1 == 0) goto L84
        L5b:
            r1.unlockCanvasAndPost(r0)     // Catch: java.lang.Exception -> L6e
            goto L84
        L5f:
            r1 = move-exception
            goto L73
        L61:
            r1 = move-exception
            r1.toString()     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r3.f72359d     // Catch: java.lang.Exception -> L6e
            if (r1 == 0) goto L84
            android.view.SurfaceHolder r1 = r3.f72360e     // Catch: java.lang.Exception -> L6e
            if (r1 == 0) goto L84
            goto L5b
        L6e:
            r0 = move-exception
            r0.toString()
            goto L84
        L73:
            boolean r2 = r3.f72359d     // Catch: java.lang.Exception -> L7f
            if (r2 == 0) goto L83
            android.view.SurfaceHolder r2 = r3.f72360e     // Catch: java.lang.Exception -> L7f
            if (r2 == 0) goto L83
            r2.unlockCanvasAndPost(r0)     // Catch: java.lang.Exception -> L7f
            goto L83
        L7f:
            r0 = move-exception
            r0.toString()
        L83:
            throw r1
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.particles.ConfettiSurfaceRenderView.a():void");
    }

    public final android.graphics.Canvas b() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.view.SurfaceHolder surfaceHolder = this.f72360e;
            if (surfaceHolder != null) {
                return surfaceHolder.lockHardwareCanvas();
            }
            return null;
        }
        android.view.SurfaceHolder surfaceHolder2 = this.f72360e;
        if (surfaceHolder2 != null) {
            return surfaceHolder2.lockCanvas();
        }
        return null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f72359d = true;
        android.graphics.Canvas b17 = b();
        if (b17 != null) {
            b17.drawColor(0);
            android.view.SurfaceHolder surfaceHolder = this.f72360e;
            if (surfaceHolder != null) {
                surfaceHolder.unlockCanvasAndPost(b17);
            }
        }
        if (this.f72362g == null) {
            this.f72362g = new e51.e(getLooper(), this);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f72359d = false;
        android.os.HandlerThread handlerThread = this.f72361f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        e51.e eVar = this.f72362g;
        if (eVar != null) {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 3;
            eVar.sendMessage(obtain);
        }
    }

    public ConfettiSurfaceRenderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f72360e = getHolder();
        setZOrderMediaOverlay(true);
        android.view.SurfaceHolder surfaceHolder = this.f72360e;
        if (surfaceHolder != null) {
            surfaceHolder.setFormat(-2);
        }
        android.view.SurfaceHolder surfaceHolder2 = this.f72360e;
        if (surfaceHolder2 != null) {
            surfaceHolder2.addCallback(this);
        }
    }
}
