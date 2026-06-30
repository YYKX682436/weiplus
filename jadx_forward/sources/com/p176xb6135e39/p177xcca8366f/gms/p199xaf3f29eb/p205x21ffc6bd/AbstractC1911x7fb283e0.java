package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.GmsClientSupervisor */
/* loaded from: classes13.dex */
public abstract class AbstractC1911x7fb283e0 {
    static android.os.HandlerThread zza;
    private static final java.lang.Object zzb = new java.lang.Object();
    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzs zzc;
    private static java.util.concurrent.Executor zzd;
    private static boolean zze;

    /* renamed from: getDefaultBindFlags */
    public static int m18164xdafa227f() {
        return 4225;
    }

    /* renamed from: getInstance */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0 m18165x9cf0d20b(android.content.Context context) {
        synchronized (zzb) {
            if (zzc == null) {
                zzc = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzs(context.getApplicationContext(), zze ? m18166xe236406b().getLooper() : context.getMainLooper(), zzd);
            }
        }
        return zzc;
    }

    /* renamed from: getOrStartHandlerThread */
    public static android.os.HandlerThread m18166xe236406b() {
        synchronized (zzb) {
            android.os.HandlerThread handlerThread = zza;
            if (handlerThread != null) {
                return handlerThread;
            }
            android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("GoogleApiHandler", 9);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    /* renamed from: setDefaultBindExecutor */
    public static void m18168x240614f(java.util.concurrent.Executor executor) {
        synchronized (zzb) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzs zzsVar = zzc;
            if (zzsVar != null) {
                zzsVar.zzi(executor);
            }
            zzd = executor;
        }
    }

    /* renamed from: setUseHandlerThreadForCallbacks */
    public static void m18169xc8b85fd4() {
        synchronized (zzb) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzs zzsVar = zzc;
            if (zzsVar != null && !zze) {
                zzsVar.zzj(m18166xe236406b().getLooper());
            }
            zze = true;
        }
    }

    /* renamed from: bindService */
    public boolean m18170x54856bb8(android.content.ComponentName componentName, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        return zzc(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo(componentName, 4225), serviceConnection, str, null);
    }

    /* renamed from: unbindService */
    public void m18173xa4bc737f(android.content.ComponentName componentName, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        zza(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo(componentName, 4225), serviceConnection, str);
    }

    public abstract void zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo zzoVar, android.content.ServiceConnection serviceConnection, java.lang.String str);

    public final void zzb(java.lang.String str, java.lang.String str2, int i17, android.content.ServiceConnection serviceConnection, java.lang.String str3, boolean z17) {
        zza(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo(str, str2, 4225, z17), serviceConnection, str3);
    }

    public abstract boolean zzc(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo zzoVar, android.content.ServiceConnection serviceConnection, java.lang.String str, java.util.concurrent.Executor executor);

    /* renamed from: bindService */
    public boolean m18171x54856bb8(android.content.ComponentName componentName, android.content.ServiceConnection serviceConnection, java.lang.String str, java.util.concurrent.Executor executor) {
        return zzc(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo(componentName, 4225), serviceConnection, str, executor);
    }

    /* renamed from: unbindService */
    public void m18174xa4bc737f(java.lang.String str, android.content.ServiceConnection serviceConnection, java.lang.String str2) {
        zza(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo(str, 4225, false), serviceConnection, str2);
    }

    /* renamed from: getOrStartHandlerThread */
    public static android.os.HandlerThread m18167xe236406b(int i17) {
        synchronized (zzb) {
            android.os.HandlerThread handlerThread = zza;
            if (handlerThread != null) {
                return handlerThread;
            }
            android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("GoogleApiHandler", i17);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: bindService */
    public boolean m18172x54856bb8(java.lang.String str, android.content.ServiceConnection serviceConnection, java.lang.String str2) {
        return zzc(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzo(str, 4225, false), serviceConnection, str2, null);
    }
}
