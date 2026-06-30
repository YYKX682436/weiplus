package com.p314xaae8f345.p542x3306d5.p546x2eaf0c;

/* renamed from: com.tencent.mars.comm.WakerLock */
/* loaded from: classes12.dex */
public class C4559x8e92a579 {
    private static final java.lang.String TAG = "MicroMsg.WakerLock";

    /* renamed from: _hellAccFlag_ */
    private byte f19344x7f11beae;

    /* renamed from: mHandler */
    private android.os.Handler f19345xc7640a1d;

    /* renamed from: mReleaser */
    private java.lang.Runnable f19346x42180d8 = new java.lang.Runnable() { // from class: com.tencent.mars.comm.WakerLock.1
        @Override // java.lang.Runnable
        public void run() {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4559x8e92a579.this.mo40017xcdd95364();
        }
    };

    /* renamed from: wakeLock */
    private android.os.PowerManager.WakeLock f19347x113258ef;

    public C4559x8e92a579(android.content.Context context) {
        this.f19347x113258ef = null;
        this.f19345xc7640a1d = null;
        android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(1, TAG);
        this.f19347x113258ef = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        this.f19345xc7640a1d = new android.os.Handler(context.getMainLooper());
    }

    /* renamed from: finalize */
    public void mo40009xd764dc1e() {
        mo40017xcdd95364();
    }

    /* renamed from: isLocking */
    public boolean mo40012xf1a1864d() {
        return this.f19347x113258ef.isHeld();
    }

    /* renamed from: lock */
    public void mo40014x32c52b(long j17) {
        mo40013x32c52b();
        this.f19345xc7640a1d.postDelayed(this.f19346x42180d8, j17);
    }

    /* renamed from: unLock */
    public void mo40017xcdd95364() {
        this.f19345xc7640a1d.removeCallbacks(this.f19346x42180d8);
        if (this.f19347x113258ef.isHeld()) {
            android.os.PowerManager.WakeLock wakeLock = this.f19347x113258ef;
            yj0.a.c(wakeLock, "com/tencent/mars/comm/WakerLock", "unLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            yj0.a.f(wakeLock, "com/tencent/mars/comm/WakerLock", "unLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    /* renamed from: lock */
    public void mo40013x32c52b() {
        this.f19345xc7640a1d.removeCallbacks(this.f19346x42180d8);
        android.os.PowerManager.WakeLock wakeLock = this.f19347x113258ef;
        yj0.a.c(wakeLock, "com/tencent/mars/comm/WakerLock", "lock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        wakeLock.acquire();
        yj0.a.f(wakeLock, "com/tencent/mars/comm/WakerLock", "lock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
    }
}
