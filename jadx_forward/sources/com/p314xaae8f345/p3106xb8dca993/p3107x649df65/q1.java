package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes13.dex */
public final class q1 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3106xb8dca993.p3107x649df65.p0 f297180d;

    public q1(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.p0 p0Var) {
        this.f297180d = p0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.f297180d.f297169a = com.tencent.tmsqmsp.oaid2.o0.a.a(iBinder);
        synchronized (this.f297180d.f297172d) {
            this.f297180d.f297172d.notify();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f297180d.f297169a = null;
    }
}
