package com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9;

/* renamed from: com.google.android.gms.ads.identifier.AdvertisingIdClient */
/* loaded from: classes13.dex */
public class C1631x45590bea {

    /* renamed from: mContext */
    private final android.content.Context f5348xd6cfe882;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.ServiceConnectionC1699x6b5d879e zze;
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p224x156c3b98.zze zzf;
    private boolean zzg;
    private final java.lang.Object zzh;
    private com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea.zza zzi;
    private final boolean zzj;
    private final long zzk;

    /* renamed from: com.google.android.gms.ads.identifier.AdvertisingIdClient$Info */
    /* loaded from: classes13.dex */
    public static final class Info {
        private final java.lang.String zzq;
        private final boolean zzr;

        public Info(java.lang.String str, boolean z17) {
            this.zzq = str;
            this.zzr = z17;
        }

        /* renamed from: getId */
        public final java.lang.String m17269x5db1b11() {
            return this.zzq;
        }

        /* renamed from: isLimitAdTrackingEnabled */
        public final boolean m17270xcc767936() {
            return this.zzr;
        }

        /* renamed from: toString */
        public final java.lang.String m17271x9616526c() {
            java.lang.String str = this.zzq;
            boolean z17 = this.zzr;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 7);
            sb6.append("{");
            sb6.append(str);
            sb6.append("}");
            sb6.append(z17);
            return sb6.toString();
        }
    }

    /* renamed from: com.google.android.gms.ads.identifier.AdvertisingIdClient$zza */
    /* loaded from: classes13.dex */
    public static class zza extends java.lang.Thread {
        private java.lang.ref.WeakReference<com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea> zzm;
        private long zzn;
        java.util.concurrent.CountDownLatch zzo = new java.util.concurrent.CountDownLatch(1);
        boolean zzp = false;

        public zza(com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea c1631x45590bea, long j17) {
            this.zzm = new java.lang.ref.WeakReference<>(c1631x45590bea);
            this.zzn = j17;
            start();
        }

        /* renamed from: disconnect */
        private final void m17272x1f9d589c() {
            com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea c1631x45590bea = this.zzm.get();
            if (c1631x45590bea != null) {
                c1631x45590bea.m17266xb4098c93();
                this.zzp = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.zzo.await(this.zzn, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    return;
                }
                m17272x1f9d589c();
            } catch (java.lang.InterruptedException unused) {
                m17272x1f9d589c();
            }
        }
    }

    public C1631x45590bea(android.content.Context context) {
        this(context, 30000L, false, false);
    }

    /* renamed from: getAdvertisingIdInfo */
    public static com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea.Info m17262x477d3ff7(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.zzb zzbVar = new com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.zzb(context);
        boolean m17273x41a8a7f2 = zzbVar.m17273x41a8a7f2("gads:ad_id_app_context:enabled", false);
        float m17274x746dc8a6 = zzbVar.m17274x746dc8a6("gads:ad_id_app_context:ping_ratio", 0.0f);
        java.lang.String m17275x2fec8307 = zzbVar.m17275x2fec8307("gads:ad_id_use_shared_preference:experiment_id", "");
        com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea c1631x45590bea = new com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea(context, -1L, m17273x41a8a7f2, zzbVar.m17273x41a8a7f2("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            c1631x45590bea.zza(false);
            com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea.Info m17267xfb80cd24 = c1631x45590bea.m17267xfb80cd24();
            c1631x45590bea.zza(m17267xfb80cd24, m17273x41a8a7f2, m17274x746dc8a6, android.os.SystemClock.elapsedRealtime() - elapsedRealtime, m17275x2fec8307, null);
            return m17267xfb80cd24;
        } finally {
        }
    }

    /* renamed from: getIsAdIdFakeForDebugLogging */
    public static boolean m17263x2ca5f822(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.zzb zzbVar = new com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.zzb(context);
        com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea c1631x45590bea = new com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea(context, -1L, zzbVar.m17273x41a8a7f2("gads:ad_id_app_context:enabled", false), zzbVar.m17273x41a8a7f2("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            c1631x45590bea.zza(false);
            return c1631x45590bea.zzb();
        } finally {
            c1631x45590bea.m17266xb4098c93();
        }
    }

    /* renamed from: setShouldSkipGmsCoreVersionCheck */
    public static void m17264x4f1f5248(boolean z17) {
    }

    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.ServiceConnectionC1699x6b5d879e zza(android.content.Context context, boolean z17) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int mo17631x402556f4 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a.m17641x9cf0d20b().mo17631x402556f4(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.f5840x7aedca50);
            if (mo17631x402556f4 != 0 && mo17631x402556f4 != 2) {
                throw new java.io.IOException("Google Play services not available");
            }
            java.lang.String str = z17 ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.ServiceConnectionC1699x6b5d879e serviceConnectionC1699x6b5d879e = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.ServiceConnectionC1699x6b5d879e();
            android.content.Intent intent = new android.content.Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a.m18493x9cf0d20b().m18494x54856bb8(context, intent, serviceConnectionC1699x6b5d879e, 1)) {
                    return serviceConnectionC1699x6b5d879e;
                }
                throw new java.io.IOException("Connection failure");
            } catch (java.lang.Throwable th6) {
                throw new java.io.IOException(th6);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1710x6991fbce(9);
        }
    }

    private final boolean zzb() {
        boolean zzc;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18213xfcae242e("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzg) {
                synchronized (this.zzh) {
                    com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea.zza zzaVar = this.zzi;
                    if (zzaVar == null || !zzaVar.zzp) {
                        throw new java.io.IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zza(false);
                    if (!this.zzg) {
                        throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (java.lang.Exception e17) {
                    throw new java.io.IOException("AdvertisingIdClient cannot reconnect.", e17);
                }
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zze);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zzf);
            try {
                zzc = this.zzf.zzc();
            } catch (android.os.RemoteException unused) {
                throw new java.io.IOException("Remote exception");
            }
        }
        zza();
        return zzc;
    }

    /* renamed from: finalize */
    public void m17265xd764dc1e() {
        m17266xb4098c93();
        super.finalize();
    }

    /* renamed from: finish */
    public final void m17266xb4098c93() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18213xfcae242e("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f5348xd6cfe882 == null || this.zze == null) {
                return;
            }
            try {
                if (this.zzg) {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a.m18493x9cf0d20b().m18495xa4bc737f(this.f5348xd6cfe882, this.zze);
                }
            } catch (java.lang.Throwable unused) {
            }
            this.zzg = false;
            this.zzf = null;
            this.zze = null;
        }
    }

    /* renamed from: getInfo */
    public com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea.Info m17267xfb80cd24() {
        com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea.Info info;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18213xfcae242e("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzg) {
                synchronized (this.zzh) {
                    com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea.zza zzaVar = this.zzi;
                    if (zzaVar == null || !zzaVar.zzp) {
                        throw new java.io.IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zza(false);
                    if (!this.zzg) {
                        throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (java.lang.Exception e17) {
                    throw new java.io.IOException("AdvertisingIdClient cannot reconnect.", e17);
                }
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zze);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zzf);
            try {
                info = new com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea.Info(this.zzf.mo18783x5db1b11(), this.zzf.zzb(true));
            } catch (android.os.RemoteException unused) {
                throw new java.io.IOException("Remote exception");
            }
        }
        zza();
        return info;
    }

    /* renamed from: start */
    public void m17268x68ac462() {
        zza(true);
    }

    private C1631x45590bea(android.content.Context context, long j17, boolean z17, boolean z18) {
        android.content.Context applicationContext;
        this.zzh = new java.lang.Object();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context);
        if (z17 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f5348xd6cfe882 = context;
        this.zzg = false;
        this.zzk = j17;
        this.zzj = z18;
    }

    private static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p224x156c3b98.zze zza(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.ServiceConnectionC1699x6b5d879e serviceConnectionC1699x6b5d879e) {
        try {
            return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p224x156c3b98.zzf.zza(serviceConnectionC1699x6b5d879e.m17597x3ef759bc(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, java.util.concurrent.TimeUnit.MILLISECONDS));
        } catch (java.lang.InterruptedException unused) {
            throw new java.io.IOException("Interrupted exception");
        } catch (java.lang.Throwable th6) {
            throw new java.io.IOException(th6);
        }
    }

    private final void zza() {
        synchronized (this.zzh) {
            com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea.zza zzaVar = this.zzi;
            if (zzaVar != null) {
                zzaVar.zzo.countDown();
                try {
                    this.zzi.join();
                } catch (java.lang.InterruptedException unused) {
                }
            }
            if (this.zzk > 0) {
                this.zzi = new com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea.zza(this, this.zzk);
            }
        }
    }

    private final void zza(boolean z17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18213xfcae242e("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg) {
                m17266xb4098c93();
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.ServiceConnectionC1699x6b5d879e zza2 = zza(this.f5348xd6cfe882, this.zzj);
            this.zze = zza2;
            this.zzf = zza(this.f5348xd6cfe882, zza2);
            this.zzg = true;
            if (z17) {
                zza();
            }
        }
    }

    private final boolean zza(com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.C1631x45590bea.Info info, boolean z17, float f17, long j17, java.lang.String str, java.lang.Throwable th6) {
        if (java.lang.Math.random() > f17) {
            return false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("app_context", z17 ? "1" : "0");
        if (info != null) {
            hashMap.put("limit_ad_tracking", info.m17270xcc767936() ? "1" : "0");
        }
        if (info != null && info.m17269x5db1b11() != null) {
            hashMap.put("ad_id_size", java.lang.Integer.toString(info.m17269x5db1b11().length()));
        }
        if (th6 != null) {
            hashMap.put("error", th6.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", java.lang.Long.toString(j17));
        new com.p176xb6135e39.p177xcca8366f.gms.ads.p188x9f88aca9.zza(this, hashMap).start();
        return true;
    }
}
