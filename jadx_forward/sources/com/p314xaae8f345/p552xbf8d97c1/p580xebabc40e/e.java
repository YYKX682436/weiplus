package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes7.dex */
public final class e extends com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.k {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f134473d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.PowerManager.WakeLock f134474e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.PowerManager.WakeLock f134475f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f134476g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f134477h;

    public e(android.content.Context context, android.content.ComponentName componentName) {
        super(componentName);
        android.content.Context applicationContext = context.getApplicationContext();
        this.f134473d = applicationContext;
        if (applicationContext.checkPermission("android.permission.WAKE_LOCK", android.os.Process.myPid(), android.os.Process.myUid()) != 0) {
            oj.j.f("Matrix.JobIntentService", "it would be better to grant WAKE_LOCK permission to your app so that tinker can use WakeLock to keep system awake.", new java.lang.Object[0]);
            this.f134475f = null;
            this.f134474e = null;
            return;
        }
        android.os.PowerManager powerManager = (android.os.PowerManager) context.getSystemService("power");
        android.os.PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f134474e = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        android.os.PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f134475f = newWakeLock2;
        newWakeLock2.setReferenceCounted(false);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.k
    public void a(android.content.Intent intent) {
        android.os.PowerManager.WakeLock wakeLock;
        android.content.Intent intent2 = new android.content.Intent(intent);
        intent2.setComponent(this.f134488a);
        try {
            if (this.f134473d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f134476g) {
                        this.f134476g = true;
                        if (!this.f134477h && (wakeLock = this.f134474e) != null) {
                            zj0.a aVar = new zj0.a();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            aVar.c(60000L);
                            yj0.a.d(wakeLock, aVar.b(), "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "enqueueWork", "(Landroid/content/Intent;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                            zj0.c.f554818a.set(aVar);
                            long longValue = ((java.lang.Long) aVar.a(0)).longValue();
                            zj0.c.a();
                            wakeLock.acquire(longValue);
                            yj0.a.f(wakeLock, "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "enqueueWork", "(Landroid/content/Intent;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.JobIntentService", th6, "Exception occurred.", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.k
    public void c() {
        android.os.PowerManager.WakeLock wakeLock;
        synchronized (this) {
            if (this.f134477h) {
                if (this.f134476g && (wakeLock = this.f134474e) != null) {
                    zj0.a aVar = new zj0.a();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    aVar.c(60000L);
                    yj0.a.d(wakeLock, aVar.b(), "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "serviceProcessingFinished", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                    zj0.c.f554818a.set(aVar);
                    long longValue = ((java.lang.Long) aVar.a(0)).longValue();
                    zj0.c.a();
                    wakeLock.acquire(longValue);
                    yj0.a.f(wakeLock, "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "serviceProcessingFinished", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                }
                this.f134477h = false;
                android.os.PowerManager.WakeLock wakeLock2 = this.f134475f;
                if (wakeLock2 != null) {
                    yj0.a.c(wakeLock2, "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "serviceProcessingFinished", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock2.release();
                    yj0.a.f(wakeLock2, "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "serviceProcessingFinished", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.k
    public void d() {
        synchronized (this) {
            if (!this.f134477h) {
                this.f134477h = true;
                android.os.PowerManager.WakeLock wakeLock = this.f134475f;
                if (wakeLock != null) {
                    zj0.a aVar = new zj0.a();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    aVar.c(600000L);
                    yj0.a.d(wakeLock, aVar.b(), "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "serviceProcessingStarted", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                    zj0.c.f554818a.set(aVar);
                    long longValue = ((java.lang.Long) aVar.a(0)).longValue();
                    zj0.c.a();
                    wakeLock.acquire(longValue);
                    yj0.a.f(wakeLock, "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "serviceProcessingStarted", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                }
                android.os.PowerManager.WakeLock wakeLock2 = this.f134474e;
                if (wakeLock2 != null) {
                    yj0.a.c(wakeLock2, "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "serviceProcessingStarted", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock2.release();
                    yj0.a.f(wakeLock2, "com/tencent/matrix/resource/MatrixJobIntentService$CompatWorkEnqueuer", "serviceProcessingStarted", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.k
    public void e() {
        synchronized (this) {
            this.f134476g = false;
        }
    }
}
