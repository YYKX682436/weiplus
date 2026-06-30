package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* renamed from: com.google.android.gms.common.BlockingServiceConnection */
/* loaded from: classes13.dex */
public class ServiceConnectionC1699x6b5d879e implements android.content.ServiceConnection {
    boolean zza = false;
    private final java.util.concurrent.BlockingQueue zzb = new java.util.concurrent.LinkedBlockingQueue();

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: getService */
    public android.os.IBinder m17596xb411027f() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18213xfcae242e("BlockingServiceConnection.getService() called on main thread");
        if (this.zza) {
            throw new java.lang.IllegalStateException("Cannot call get on this connection more than once");
        }
        this.zza = true;
        return (android.os.IBinder) this.zzb.take();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: getServiceWithTimeout */
    public android.os.IBinder m17597x3ef759bc(long j17, java.util.concurrent.TimeUnit timeUnit) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18213xfcae242e("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.zza) {
            throw new java.lang.IllegalStateException("Cannot call get on this connection more than once");
        }
        this.zza = true;
        android.os.IBinder iBinder = (android.os.IBinder) this.zzb.poll(j17, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new java.util.concurrent.TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.zzb.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
    }
}
