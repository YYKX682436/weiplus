package com.p314xaae8f345.mm.ui;

/* loaded from: classes12.dex */
public final class cf {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.cf f279625d = new com.p314xaae8f345.mm.ui.cf();

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f279626a = new java.lang.ref.WeakReference(null);

    /* renamed from: c, reason: collision with root package name */
    public boolean f279628c = true;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f279627b = new com.p314xaae8f345.mm.ui.bf(this, android.os.Looper.getMainLooper());

    public final boolean a(java.lang.String str) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            if (this.f279626a != null) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MainThreadSyncBarrier", "Sync barrier ref is empty.");
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MainThreadSyncBarrier", "Call " + str + " in main thread!");
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return true;
    }

    public void b() {
        if (a("removeSyncBarrier()")) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainThreadSyncBarrier", "removeSyncBarrier()");
        android.os.Message message = (android.os.Message) this.f279626a.get();
        if (message == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MainThreadSyncBarrier", "Sync barrier message is empty.");
            return;
        }
        android.os.Handler handler = this.f279627b;
        handler.removeMessages(255);
        this.f279626a = new java.lang.ref.WeakReference(null);
        if (message.getTarget() == null) {
            message.setTarget(handler);
        }
        handler.sendEmptyMessageAtTime(0, 0L);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o3.b(false);
    }

    public void c() {
        if (a("sendSyncBarrier()")) {
            return;
        }
        boolean c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o3.c();
        this.f279628c = c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainThreadSyncBarrier", "bIsSyncBarrierEnabled = %s", java.lang.Boolean.valueOf(c17));
        if (!this.f279628c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainThreadSyncBarrier", "SyncBarrier hack not enabled");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainThreadSyncBarrier", "sendSyncBarrier()");
        if (this.f279626a.get() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MainThreadSyncBarrier", "Exist a sync barrier message. Wrong state.");
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return;
        }
        android.os.Handler handler = this.f279627b;
        android.os.Message obtainMessage = handler.obtainMessage();
        handler.sendMessageAtFrontOfQueue(obtainMessage);
        obtainMessage.setTarget(null);
        obtainMessage.arg1 = -1;
        this.f279626a = new java.lang.ref.WeakReference(obtainMessage);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o3.b(true);
        android.os.Message obtain = android.os.Message.obtain();
        obtain.setAsynchronous(true);
        obtain.what = 255;
        handler.sendMessageDelayed(obtain, 600L);
    }
}
