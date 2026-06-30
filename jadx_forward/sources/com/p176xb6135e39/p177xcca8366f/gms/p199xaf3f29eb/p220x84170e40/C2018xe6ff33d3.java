package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40;

/* renamed from: com.google.android.gms.common.wrappers.InstantApps */
/* loaded from: classes13.dex */
public class C2018xe6ff33d3 {
    private static android.content.Context zza;
    private static java.lang.Boolean zzb;

    /* renamed from: isInstantApp */
    public static synchronized boolean m18633xb736014a(android.content.Context context) {
        java.lang.Boolean bool;
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2018xe6ff33d3.class) {
            android.content.Context applicationContext = context.getApplicationContext();
            android.content.Context context2 = zza;
            if (context2 != null && (bool = zzb) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            zzb = null;
            if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18606xacc9ec63()) {
                zzb = java.lang.Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    zzb = java.lang.Boolean.TRUE;
                } catch (java.lang.ClassNotFoundException unused) {
                    zzb = java.lang.Boolean.FALSE;
                }
            }
            zza = applicationContext;
            return zzb.booleanValue();
        }
    }
}
