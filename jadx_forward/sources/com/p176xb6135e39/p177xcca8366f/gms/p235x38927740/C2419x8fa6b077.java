package com.p176xb6135e39.p177xcca8366f.gms.p235x38927740;

/* renamed from: com.google.android.gms.security.ProviderInstaller */
/* loaded from: classes13.dex */
public class C2419x8fa6b077 {

    /* renamed from: PROVIDER_NAME */
    public static final java.lang.String f7370xb5c64419 = "GmsCore_OpenSSL";
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a zza = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a.m17641x9cf0d20b();
    private static final java.lang.Object zzb = new java.lang.Object();
    private static java.lang.reflect.Method zzc = null;
    private static java.lang.reflect.Method zzd = null;

    /* renamed from: com.google.android.gms.security.ProviderInstaller$ProviderInstallListener */
    /* loaded from: classes13.dex */
    public interface ProviderInstallListener {
        /* renamed from: onProviderInstallFailed */
        void m19511xc6aed2a8(int i17, android.content.Intent intent);

        /* renamed from: onProviderInstalled */
        void m19512x33363c6a();
    }

    /* renamed from: installIfNeeded */
    public static void m19509xcdf275ed(android.content.Context context) {
        android.content.Context context2;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(context, "Context must not be null");
        zza.m17649x4d3e953b(context, 11925000);
        synchronized (zzb) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            try {
                context2 = com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.m18691x32c4e6(context, com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.f6017xdb783536, "com.google.android.gms.providerinstaller.dynamite").m18692x94bc11ed();
            } catch (com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException e17) {
                "Failed to load providerinstaller module: ".concat(java.lang.String.valueOf(e17.getMessage()));
                context2 = null;
            }
            if (context2 != null) {
                zzc(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            android.content.Context m17676x14cfd6d3 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17676x14cfd6d3(context);
            if (m17676x14cfd6d3 != null) {
                try {
                    if (zzd == null) {
                        java.lang.Class cls = java.lang.Long.TYPE;
                        zzd = zzb(m17676x14cfd6d3, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new java.lang.Class[]{android.content.Context.class, cls, cls});
                    }
                    zzd.invoke(null, context, java.lang.Long.valueOf(elapsedRealtime), java.lang.Long.valueOf(elapsedRealtime2));
                } catch (java.lang.Exception e18) {
                    "Failed to report request stats: ".concat(java.lang.String.valueOf(e18.getMessage()));
                }
            }
            if (m17676x14cfd6d3 == null) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1710x6991fbce(8);
            }
            zzc(m17676x14cfd6d3, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
        }
    }

    /* renamed from: installIfNeededAsync */
    public static void m19510x5885488f(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p235x38927740.C2419x8fa6b077.ProviderInstallListener providerInstallListener) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(context, "Context must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(providerInstallListener, "Listener must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18207x6483284b("Must be called on the UI thread");
        new com.p176xb6135e39.p177xcca8366f.gms.p235x38927740.zza(context, providerInstallListener).execute(new java.lang.Void[0]);
    }

    private static java.lang.reflect.Method zzb(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    private static void zzc(android.content.Context context, android.content.Context context2, java.lang.String str) {
        try {
            if (zzc == null) {
                zzc = zzb(context, str, "insertProvider", new java.lang.Class[]{android.content.Context.class});
            }
            zzc.invoke(null, context);
        } catch (java.lang.Exception e17) {
            java.lang.Throwable cause = e17.getCause();
            if (android.util.Log.isLoggable("ProviderInstaller", 6)) {
                "Failed to install provider: ".concat(java.lang.String.valueOf(cause == null ? e17.getMessage() : cause.getMessage()));
            }
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1710x6991fbce(8);
        }
    }
}
