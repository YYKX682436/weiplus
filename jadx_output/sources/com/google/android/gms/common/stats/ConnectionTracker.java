package com.google.android.gms.common.stats;

/* loaded from: classes13.dex */
public class ConnectionTracker {
    private static final java.lang.Object zzb = new java.lang.Object();
    private static volatile com.google.android.gms.common.stats.ConnectionTracker zzc;
    public final java.util.concurrent.ConcurrentHashMap zza = new java.util.concurrent.ConcurrentHashMap();

    private ConnectionTracker() {
    }

    public static com.google.android.gms.common.stats.ConnectionTracker getInstance() {
        if (zzc == null) {
            synchronized (zzb) {
                if (zzc == null) {
                    zzc = new com.google.android.gms.common.stats.ConnectionTracker();
                }
            }
        }
        com.google.android.gms.common.stats.ConnectionTracker connectionTracker = zzc;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionTracker);
        return connectionTracker;
    }

    private static void zzb(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.util.NoSuchElementException unused) {
        }
    }

    private final boolean zzc(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17, boolean z17, java.util.concurrent.Executor executor) {
        android.content.ComponentName component = intent.getComponent();
        if (component != null) {
            java.lang.String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        if (!zzd(serviceConnection)) {
            return zze(context, intent, serviceConnection, i17, executor);
        }
        android.content.ServiceConnection serviceConnection2 = (android.content.ServiceConnection) this.zza.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            java.lang.String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        try {
            boolean zze = zze(context, intent, serviceConnection, i17, executor);
            if (zze) {
                return zze;
            }
            return false;
        } finally {
            this.zza.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean zzd(android.content.ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof com.google.android.gms.common.internal.zzt);
    }

    private static final boolean zze(android.content.Context context, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17, java.util.concurrent.Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!com.google.android.gms.common.util.PlatformVersion.isAtLeastQ() || executor == null) ? context.bindService(intent, serviceConnection, i17) : context.bindService(intent, i17, executor, serviceConnection);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public boolean bindService(android.content.Context context, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17) {
        return zzc(context, context.getClass().getName(), intent, serviceConnection, i17, true, null);
    }

    public void unbindService(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        if (!zzd(serviceConnection) || !this.zza.containsKey(serviceConnection)) {
            zzb(context, serviceConnection);
            return;
        }
        try {
            zzb(context, (android.content.ServiceConnection) this.zza.get(serviceConnection));
        } finally {
            this.zza.remove(serviceConnection);
        }
    }

    public void unbindServiceSafe(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        try {
            unbindService(context, serviceConnection);
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean zza(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17, java.util.concurrent.Executor executor) {
        return zzc(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
