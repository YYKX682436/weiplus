package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public final class r1 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q f297189d;

    public r1(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q qVar) {
        this.f297189d = qVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.c("HSDID did service binded");
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n a17 = com.tencent.tmsqmsp.oaid2.n.a.a(iBinder);
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q qVar = this.f297189d;
        qVar.f297177c = a17;
        qVar.a(true);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f297189d.a(false);
    }
}
