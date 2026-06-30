package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public abstract class GmsClientSupervisor {
    static android.os.HandlerThread zza;
    private static final java.lang.Object zzb = new java.lang.Object();
    private static com.google.android.gms.common.internal.zzs zzc;
    private static java.util.concurrent.Executor zzd;
    private static boolean zze;

    public static int getDefaultBindFlags() {
        return 4225;
    }

    public static com.google.android.gms.common.internal.GmsClientSupervisor getInstance(android.content.Context context) {
        synchronized (zzb) {
            if (zzc == null) {
                zzc = new com.google.android.gms.common.internal.zzs(context.getApplicationContext(), zze ? getOrStartHandlerThread().getLooper() : context.getMainLooper(), zzd);
            }
        }
        return zzc;
    }

    public static android.os.HandlerThread getOrStartHandlerThread() {
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

    public static void setDefaultBindExecutor(java.util.concurrent.Executor executor) {
        synchronized (zzb) {
            com.google.android.gms.common.internal.zzs zzsVar = zzc;
            if (zzsVar != null) {
                zzsVar.zzi(executor);
            }
            zzd = executor;
        }
    }

    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzb) {
            com.google.android.gms.common.internal.zzs zzsVar = zzc;
            if (zzsVar != null && !zze) {
                zzsVar.zzj(getOrStartHandlerThread().getLooper());
            }
            zze = true;
        }
    }

    public boolean bindService(android.content.ComponentName componentName, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        return zzc(new com.google.android.gms.common.internal.zzo(componentName, 4225), serviceConnection, str, null);
    }

    public void unbindService(android.content.ComponentName componentName, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        zza(new com.google.android.gms.common.internal.zzo(componentName, 4225), serviceConnection, str);
    }

    public abstract void zza(com.google.android.gms.common.internal.zzo zzoVar, android.content.ServiceConnection serviceConnection, java.lang.String str);

    public final void zzb(java.lang.String str, java.lang.String str2, int i17, android.content.ServiceConnection serviceConnection, java.lang.String str3, boolean z17) {
        zza(new com.google.android.gms.common.internal.zzo(str, str2, 4225, z17), serviceConnection, str3);
    }

    public abstract boolean zzc(com.google.android.gms.common.internal.zzo zzoVar, android.content.ServiceConnection serviceConnection, java.lang.String str, java.util.concurrent.Executor executor);

    public boolean bindService(android.content.ComponentName componentName, android.content.ServiceConnection serviceConnection, java.lang.String str, java.util.concurrent.Executor executor) {
        return zzc(new com.google.android.gms.common.internal.zzo(componentName, 4225), serviceConnection, str, executor);
    }

    public void unbindService(java.lang.String str, android.content.ServiceConnection serviceConnection, java.lang.String str2) {
        zza(new com.google.android.gms.common.internal.zzo(str, 4225, false), serviceConnection, str2);
    }

    public static android.os.HandlerThread getOrStartHandlerThread(int i17) {
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
    public boolean bindService(java.lang.String str, android.content.ServiceConnection serviceConnection, java.lang.String str2) {
        return zzc(new com.google.android.gms.common.internal.zzo(str, 4225, false), serviceConnection, str2, null);
    }
}
