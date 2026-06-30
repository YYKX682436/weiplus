package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes15.dex */
public final class x1 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3106xb8dca993.p3107x649df65.x f297221d;

    public x1(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.x xVar) {
        this.f297221d = xVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this) {
            this.f297221d.f297218b = com.tencent.tmsqmsp.oaid2.v.a.a(iBinder);
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.x xVar = this.f297221d;
            com.tencent.tmsqmsp.oaid2.x.b bVar = xVar.f297220d;
            if (bVar != null) {
                bVar.a(xVar);
            }
            this.f297221d.b("Service onServiceConnected");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.x xVar = this.f297221d;
        xVar.f297218b = null;
        xVar.b("Service onServiceDisconnected");
    }
}
