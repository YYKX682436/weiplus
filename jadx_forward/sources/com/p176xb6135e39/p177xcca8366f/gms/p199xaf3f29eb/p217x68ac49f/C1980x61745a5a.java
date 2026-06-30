package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f;

/* renamed from: com.google.android.gms.common.stats.ConnectionTracker */
/* loaded from: classes13.dex */
public class C1980x61745a5a {
    private static final java.lang.Object zzb = new java.lang.Object();
    private static volatile com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a zzc;
    public final java.util.concurrent.ConcurrentHashMap zza = new java.util.concurrent.ConcurrentHashMap();

    private C1980x61745a5a() {
    }

    /* renamed from: getInstance */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a m18493x9cf0d20b() {
        if (zzc == null) {
            synchronized (zzb) {
                if (zzc == null) {
                    zzc = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a();
                }
            }
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a c1980x61745a5a = zzc;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1980x61745a5a);
        return c1980x61745a5a;
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
                if ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(context).m18636x9a0587e8(packageName, 0).flags & 2097152) != 0) {
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
        return !(serviceConnection instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzt);
    }

    private static final boolean zze(android.content.Context context, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17, java.util.concurrent.Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18608xacc9ec65() || executor == null) ? context.bindService(intent, serviceConnection, i17) : context.bindService(intent, i17, executor, serviceConnection);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: bindService */
    public boolean m18494x54856bb8(android.content.Context context, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17) {
        return zzc(context, context.getClass().getName(), intent, serviceConnection, i17, true, null);
    }

    /* renamed from: unbindService */
    public void m18495xa4bc737f(android.content.Context context, android.content.ServiceConnection serviceConnection) {
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

    /* renamed from: unbindServiceSafe */
    public void m18496x426fcfac(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        try {
            m18495xa4bc737f(context, serviceConnection);
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean zza(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17, java.util.concurrent.Executor executor) {
        return zzc(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
