package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public final class t1 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3106xb8dca993.p3107x649df65.r0 f297204d;

    public t1(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.r0 r0Var) {
        this.f297204d = r0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this) {
            this.f297204d.f297188d = com.tencent.tmsqmsp.oaid2.q0.a.a(iBinder);
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.r0 r0Var = this.f297204d;
            com.tencent.tmsqmsp.oaid2.r0.b bVar = r0Var.f297185a;
            if (bVar != null) {
                bVar.a(r0Var);
            }
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.r0.f297184f + " Service onServiceConnected");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f297204d.f297188d = null;
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.r0.f297184f + " Service onServiceDisconnected");
    }
}
