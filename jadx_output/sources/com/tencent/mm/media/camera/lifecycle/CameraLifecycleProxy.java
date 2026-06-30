package com.tencent.mm.media.camera.lifecycle;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/media/camera/lifecycle/CameraLifecycleProxy;", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/v;", "Lnr0/a0;", "cameraKitLifecycle", "<init>", "(Lnr0/a0;)V", "plugin-camera_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class CameraLifecycleProxy implements androidx.lifecycle.y, androidx.lifecycle.v {

    /* renamed from: d, reason: collision with root package name */
    public final nr0.a0 f68862d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.b0 f68863e;

    public CameraLifecycleProxy(nr0.a0 cameraKitLifecycle) {
        kotlin.jvm.internal.o.g(cameraKitLifecycle, "cameraKitLifecycle");
        this.f68862d = cameraKitLifecycle;
        this.f68863e = new androidx.lifecycle.b0(this, true);
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f68863e;
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraLifecycleProxy", "onStateChanged:" + event);
        int i17 = wr0.a.f448755a[event.ordinal()];
        nr0.a0 a0Var = this.f68862d;
        androidx.lifecycle.b0 b0Var = this.f68863e;
        if (i17 == 1) {
            b0Var.f(event);
            pr0.r rVar = (pr0.r) a0Var;
            rVar.getClass();
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new pr0.o(rVar, null), 3, null);
            return;
        }
        if (i17 == 2) {
            pr0.r rVar2 = (pr0.r) a0Var;
            rVar2.getClass();
            rVar2.f357909t = rVar2.m("onPause", new pr0.p(rVar2, null));
            b0Var.f(androidx.lifecycle.m.ON_PAUSE);
            b0Var.f(androidx.lifecycle.m.ON_STOP);
            return;
        }
        if (i17 != 3) {
            if (i17 == 4 || i17 == 5) {
                b0Var.f(event);
                return;
            }
            return;
        }
        b0Var.f(event);
        pr0.r rVar3 = (pr0.r) a0Var;
        rVar3.getClass();
        rVar3.m("onResume", new pr0.q(rVar3, null));
    }
}
