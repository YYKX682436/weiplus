package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes15.dex */
public final class z1 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3106xb8dca993.p3107x649df65.a0 f297228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3106xb8dca993.p3107x649df65.z f297229e;

    public z1(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.z zVar, com.p314xaae8f345.p3106xb8dca993.p3107x649df65.a0 a0Var) {
        this.f297229e = zVar;
        this.f297228d = a0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y yVar;
        synchronized (this) {
            this.f297229e.f297227d = com.tencent.tmsqmsp.oaid2.y.a.a(iBinder);
            yVar = this.f297229e.f297227d;
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.c.a(new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b0(yVar, this.f297228d));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.z zVar = this.f297229e;
        zVar.f297227d = null;
        zVar.f297227d = null;
    }
}
