package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

/* loaded from: classes7.dex */
public final class c0 implements fb1.h, p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f158221g = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    public final lk0.f f158222d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.c0 f158223e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f158224f;

    public c0(lk0.f ipcProxy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ipcProxy, "ipcProxy");
        this.f158222d = ipcProxy;
        this.f158223e = this;
        p012xc85e97e9.p093xedfae76a.b0 b0Var = new p012xc85e97e9.p093xedfae76a.b0(this, true);
        this.f158224f = b0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeProxy.<init>, ipcProxy: " + ipcProxy);
        nf.e.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.y(this));
        f158221g.add(this);
        nf.e.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.b0(this));
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.h0.f158240e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.x xVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.x(b0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeProxy.provideLifecycleSender, sender: " + xVar);
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("callbackType", 1);
            bundle.putBinder("sender", xVar);
            ipcProxy.f(bundle);
        } catch (android.os.DeadObjectException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeProxy.provideLifecycleSender, trigger DeadObjectException");
        }
        this.f158222d.asBinder().linkToDeath(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.a0(this), 0);
    }

    @Override // fb1.h
    public void a(fb1.c status) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.C11722xfe5ba80 c11722xfe5ba80;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.h0.f158240e;
        lk0.f fVar = this.f158222d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeProxy.onStatusChange, status: " + status);
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("callbackType", 2);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(status, fb1.b.f342361a)) {
                c11722xfe5ba80 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.C11722xfe5ba80(true, "");
            } else {
                if (!(status instanceof fb1.a)) {
                    throw new jz5.j();
                }
                c11722xfe5ba80 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.C11722xfe5ba80(false, ((fb1.a) status).f342360a);
            }
            bundle.putParcelable("status", c11722xfe5ba80);
            fVar.f(bundle);
        } catch (android.os.DeadObjectException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeProxy.onStatusChange, trigger DeadObjectException");
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f158224f;
    }

    @Override // fb1.h
    /* renamed from: getLifecycleOwner */
    public p012xc85e97e9.p093xedfae76a.y mo10388x95c7fa5f() {
        return this.f158223e;
    }
}
