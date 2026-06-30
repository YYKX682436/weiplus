package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes13.dex */
public final class s implements android.content.ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ThreadPoolExecutor f297190c = new java.util.concurrent.ThreadPoolExecutor(0, 3, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(2048), new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy());

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> f297192b = new java.util.concurrent.LinkedBlockingQueue<>(1);

    /* renamed from: a, reason: collision with root package name */
    public boolean f297191a = false;

    /* loaded from: classes13.dex */
    public class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final android.os.IBinder f297193a;

        public a(android.os.IBinder iBinder) {
            this.f297193a = iBinder;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.s.this.f297192b.offer(this.f297193a);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        try {
            f297190c.execute(new com.tencent.tmsqmsp.oaid2.s.a(iBinder));
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
    }
}
