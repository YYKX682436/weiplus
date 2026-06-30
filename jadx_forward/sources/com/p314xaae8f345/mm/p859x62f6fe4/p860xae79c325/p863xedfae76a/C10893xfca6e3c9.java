package com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p863xedfae76a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/media/camera/lifecycle/CameraLifecycleProxy;", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/v;", "Lnr0/a0;", "cameraKitLifecycle", "<init>", "(Lnr0/a0;)V", "plugin-camera_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.media.camera.lifecycle.CameraLifecycleProxy */
/* loaded from: classes14.dex */
public final class C10893xfca6e3c9 implements p012xc85e97e9.p093xedfae76a.y, p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: d, reason: collision with root package name */
    public final nr0.a0 f150395d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f150396e;

    public C10893xfca6e3c9(nr0.a0 cameraKitLifecycle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraKitLifecycle, "cameraKitLifecycle");
        this.f150395d = cameraKitLifecycle;
        this.f150396e = new p012xc85e97e9.p093xedfae76a.b0(this, true);
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f150396e;
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraLifecycleProxy", "onStateChanged:" + event);
        int i17 = wr0.a.f530288a[event.ordinal()];
        nr0.a0 a0Var = this.f150395d;
        p012xc85e97e9.p093xedfae76a.b0 b0Var = this.f150396e;
        if (i17 == 1) {
            b0Var.f(event);
            pr0.r rVar = (pr0.r) a0Var;
            rVar.getClass();
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new pr0.o(rVar, null), 3, null);
            return;
        }
        if (i17 == 2) {
            pr0.r rVar2 = (pr0.r) a0Var;
            rVar2.getClass();
            rVar2.f439442t = rVar2.m("onPause", new pr0.p(rVar2, null));
            b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
            b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
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
