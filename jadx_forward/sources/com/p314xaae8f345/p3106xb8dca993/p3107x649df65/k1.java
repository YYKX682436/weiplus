package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes15.dex */
public final class k1 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tmsqmsp.oaid2.f.b f297136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3106xb8dca993.p3107x649df65.f f297137e;

    public k1(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.f fVar, com.tencent.tmsqmsp.oaid2.f.b bVar) {
        this.f297137e = fVar;
        this.f297136d = bVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this) {
            this.f297137e.f297118d = com.tencent.tmsqmsp.oaid2.g.a.a(iBinder);
            com.tencent.tmsqmsp.oaid2.f.b bVar = this.f297136d;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f297137e.f297118d = null;
    }
}
