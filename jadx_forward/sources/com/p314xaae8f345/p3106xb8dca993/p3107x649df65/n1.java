package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public final class n1 implements android.content.ServiceConnection {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3106xb8dca993.p3107x649df65.m1 f297156e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3106xb8dca993.p3107x649df65.k f297157f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f297155d = new java.util.concurrent.CountDownLatch(2);

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.tmsqmsp.oaid2.l.c f297158g = new com.tencent.tmsqmsp.oaid2.l.c(this);

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.tmsqmsp.oaid2.l.b f297159h = new com.tencent.tmsqmsp.oaid2.l.b(this);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.f297156e = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.m1();
        if (iBinder != null) {
            try {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.hihonor.cloudservice.oaid.IOAIDService");
                if (queryLocalInterface instanceof com.p314xaae8f345.p3106xb8dca993.p3107x649df65.k) {
                    this.f297157f = (com.p314xaae8f345.p3106xb8dca993.p3107x649df65.k) queryLocalInterface;
                } else {
                    this.f297157f = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.j(iBinder);
                }
            } catch (java.lang.Throwable unused) {
                java.util.concurrent.CountDownLatch countDownLatch = this.f297155d;
                countDownLatch.countDown();
                countDownLatch.countDown();
                return;
            }
        }
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.k kVar = this.f297157f;
        if (kVar == null) {
            return;
        }
        kVar.b(this.f297159h);
        this.f297157f.a(this.f297158g);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        java.util.concurrent.CountDownLatch countDownLatch = this.f297155d;
        countDownLatch.countDown();
        countDownLatch.countDown();
    }
}
