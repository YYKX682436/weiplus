package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

/* loaded from: classes7.dex */
public final class h0 extends lk0.e {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f158240e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final fb1.h f158241d;

    public h0(fb1.h onStatusChange) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onStatusChange, "onStatusChange");
        this.f158241d = onStatusChange;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.tencent.mm.plugin.appbrand.av_device_usage.OnAVDeviceStatusChangeStub$onCallback$observer$1] */
    @Override // lk0.f
    public void f(android.os.Bundle bundle) {
        fb1.c cVar;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.C11722xfe5ba80.class.getClassLoader());
        int i17 = bundle.getInt("callbackType", 0);
        if (i17 == 1) {
            final lk0.f d17 = lk0.e.d(bundle.getBinder("sender"));
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeStub.onCallback, sender is null");
                return;
            }
            ?? r07 = new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.plugin.appbrand.av_device_usage.OnAVDeviceStatusChangeStub$onCallback$observer$1
                @Override // p012xc85e97e9.p093xedfae76a.v
                /* renamed from: onStateChanged */
                public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    if (p012xc85e97e9.p093xedfae76a.m.ON_DESTROY == event) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeStub.onCallback, onDestroy");
                        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.x.f158278e;
                        lk0.f fVar = lk0.f.this;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageClientService", "LifecycleSendProxy.onDestroy");
                        try {
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            bundle2.putBoolean("lifecycleOnDestroy", true);
                            fVar.f(bundle2);
                        } catch (android.os.DeadObjectException unused) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AVDeviceUsageClientService", "LifecycleSendProxy.onDestroy, trigger DeadObjectException");
                        }
                        this.f158241d.mo10388x95c7fa5f().mo273xed6858b4().c(this);
                    }
                }
            };
            d17.asBinder().linkToDeath(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.e0(this, r07), 0);
            nf.e.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.f0(d17, this, r07));
            return;
        }
        if (i17 != 2) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.C11722xfe5ba80 c11722xfe5ba80 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.C11722xfe5ba80) bundle.getParcelable("status");
        if (c11722xfe5ba80 == null || (cVar = c11722xfe5ba80.f158214f) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeStub.onCallback, parcelable is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeStub.onCallback, onStatusChange, status: " + cVar);
        nf.e.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.g0(this, cVar));
    }
}
