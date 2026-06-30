package wo;

/* loaded from: classes14.dex */
public class d1 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f529183d = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f529184e = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.Camera f529185a;

    /* renamed from: b, reason: collision with root package name */
    public int f529186b = 1;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f529187c;

    public d1(android.hardware.Camera camera) {
        this.f529187c = false;
        this.f529185a = camera;
        if (camera == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MCamera", "init MCamera with null camera!!!", new java.lang.Object[0]);
            return;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = f529183d;
        atomicInteger.incrementAndGet();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = f529184e;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MCamera", "init MCamera, initCount:%s, releaseCount:%s, isCameraRelease:%s", atomicInteger, atomicInteger2, java.lang.Boolean.valueOf(this.f529187c));
        if (atomicInteger.get() - atomicInteger2.get() > 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MCamera", "MCamera leak, do report, current process:%s", bm5.f1.a());
            vo.c cVar = vo.c.INSTANCE;
            cVar.b(650L, 61L, 1L);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                cVar.b(650L, 62L, 1L);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s()) {
                cVar.b(650L, 63L, 1L);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j()) {
                cVar.b(650L, 64L, 1L);
            }
            atomicInteger.set(0);
            atomicInteger2.set(0);
        }
        this.f529187c = false;
    }

    public final void a(byte[] bArr) {
        android.hardware.Camera camera = this.f529185a;
        if (camera != null) {
            camera.addCallbackBuffer(bArr);
        }
    }

    public final void b(android.hardware.Camera.AutoFocusCallback autoFocusCallback) {
        android.hardware.Camera camera = this.f529185a;
        if (camera != null) {
            camera.autoFocus(new wo.c1(this, autoFocusCallback));
        }
    }

    public android.hardware.Camera.Parameters c() {
        android.hardware.Camera camera = this.f529185a;
        if (camera != null) {
            return camera.getParameters();
        }
        return null;
    }

    public final void d() {
        if (this.f529185a != null) {
            try {
                this.f529187c = true;
                yj0.a.j(this.f529185a, "com/tencent/mm/compatible/deviceinfo/MCamera", "release", "()V", "android/hardware/Camera", "release", "()V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MCamera", "release camera failed cause sometimes native crash while", e17.fillInStackTrace());
            } finally {
                java.util.concurrent.atomic.AtomicInteger atomicInteger = f529184e;
                atomicInteger.incrementAndGet();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MCamera", "release MCamera, initCount: %s, releaseCount: %s,isCameraRelease %s", f529183d, atomicInteger, java.lang.Boolean.valueOf(this.f529187c));
            }
        }
    }

    public final void e(int i17) {
        android.hardware.Camera camera = this.f529185a;
        if (camera != null) {
            camera.setDisplayOrientation(i17);
        }
    }

    public void f(android.hardware.Camera.Parameters parameters) {
        android.hardware.Camera camera = this.f529185a;
        if (camera != null) {
            camera.setParameters(parameters);
        }
    }

    public final void g(android.hardware.Camera.PreviewCallback previewCallback) {
        android.hardware.Camera camera = this.f529185a;
        if (camera != null) {
            camera.setPreviewCallback(previewCallback);
        }
    }

    public final void h(android.hardware.Camera.PreviewCallback previewCallback) {
        android.hardware.Camera camera = this.f529185a;
        if (camera != null) {
            camera.setPreviewCallbackWithBuffer(previewCallback);
        }
    }

    public final void i(android.graphics.SurfaceTexture surfaceTexture) {
        android.hardware.Camera camera = this.f529185a;
        if (camera != null) {
            camera.setPreviewTexture(surfaceTexture);
        }
    }

    public void j(java.lang.String str) {
        android.hardware.Camera camera = this.f529185a;
        if (camera != null) {
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            parameters.set("wechat-scene", str);
            camera.setParameters(parameters);
        }
    }

    public final void k() {
        android.hardware.Camera camera = this.f529185a;
        if (camera != null) {
            yj0.a.j(camera, "com/tencent/mm/compatible/deviceinfo/MCamera", "startPreview", "()V", "android/hardware/Camera", "startPreview", "()V");
        }
    }

    public final void l() {
        android.hardware.Camera camera = this.f529185a;
        if (camera != null) {
            camera.stopPreview();
        }
    }
}
