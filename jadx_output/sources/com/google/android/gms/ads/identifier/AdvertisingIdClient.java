package com.google.android.gms.ads.identifier;

/* loaded from: classes13.dex */
public class AdvertisingIdClient {
    private final android.content.Context mContext;
    private com.google.android.gms.common.BlockingServiceConnection zze;
    private com.google.android.gms.internal.ads_identifier.zze zzf;
    private boolean zzg;
    private final java.lang.Object zzh;
    private com.google.android.gms.ads.identifier.AdvertisingIdClient.zza zzi;
    private final boolean zzj;
    private final long zzk;

    /* loaded from: classes13.dex */
    public static final class Info {
        private final java.lang.String zzq;
        private final boolean zzr;

        public Info(java.lang.String str, boolean z17) {
            this.zzq = str;
            this.zzr = z17;
        }

        public final java.lang.String getId() {
            return this.zzq;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.zzr;
        }

        public final java.lang.String toString() {
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

    /* loaded from: classes13.dex */
    public static class zza extends java.lang.Thread {
        private java.lang.ref.WeakReference<com.google.android.gms.ads.identifier.AdvertisingIdClient> zzm;
        private long zzn;
        java.util.concurrent.CountDownLatch zzo = new java.util.concurrent.CountDownLatch(1);
        boolean zzp = false;

        public zza(com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient, long j17) {
            this.zzm = new java.lang.ref.WeakReference<>(advertisingIdClient);
            this.zzn = j17;
            start();
        }

        private final void disconnect() {
            com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient = this.zzm.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.zzp = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.zzo.await(this.zzn, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    return;
                }
                disconnect();
            } catch (java.lang.InterruptedException unused) {
                disconnect();
            }
        }
    }

    public AdvertisingIdClient(android.content.Context context) {
        this(context, 30000L, false, false);
    }

    public static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getAdvertisingIdInfo(android.content.Context context) {
        com.google.android.gms.ads.identifier.zzb zzbVar = new com.google.android.gms.ads.identifier.zzb(context);
        boolean z17 = zzbVar.getBoolean("gads:ad_id_app_context:enabled", false);
        float f17 = zzbVar.getFloat("gads:ad_id_app_context:ping_ratio", 0.0f);
        java.lang.String string = zzbVar.getString("gads:ad_id_use_shared_preference:experiment_id", "");
        com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient = new com.google.android.gms.ads.identifier.AdvertisingIdClient(context, -1L, z17, zzbVar.getBoolean("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            advertisingIdClient.zza(false);
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = advertisingIdClient.getInfo();
            advertisingIdClient.zza(info, z17, f17, android.os.SystemClock.elapsedRealtime() - elapsedRealtime, string, null);
            return info;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(android.content.Context context) {
        com.google.android.gms.ads.identifier.zzb zzbVar = new com.google.android.gms.ads.identifier.zzb(context);
        com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient = new com.google.android.gms.ads.identifier.AdvertisingIdClient(context, -1L, zzbVar.getBoolean("gads:ad_id_app_context:enabled", false), zzbVar.getBoolean("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            advertisingIdClient.zza(false);
            return advertisingIdClient.zzb();
        } finally {
            advertisingIdClient.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z17) {
    }

    private static com.google.android.gms.common.BlockingServiceConnection zza(android.content.Context context, boolean z17) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int isGooglePlayServicesAvailable = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (isGooglePlayServicesAvailable != 0 && isGooglePlayServicesAvailable != 2) {
                throw new java.io.IOException("Google Play services not available");
            }
            java.lang.String str = z17 ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            com.google.android.gms.common.BlockingServiceConnection blockingServiceConnection = new com.google.android.gms.common.BlockingServiceConnection();
            android.content.Intent intent = new android.content.Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                    return blockingServiceConnection;
                }
                throw new java.io.IOException("Connection failure");
            } catch (java.lang.Throwable th6) {
                throw new java.io.IOException(th6);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(9);
        }
    }

    private final boolean zzb() {
        boolean zzc;
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzg) {
                synchronized (this.zzh) {
                    com.google.android.gms.ads.identifier.AdvertisingIdClient.zza zzaVar = this.zzi;
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
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzf);
            try {
                zzc = this.zzf.zzc();
            } catch (android.os.RemoteException unused) {
                throw new java.io.IOException("Remote exception");
            }
        }
        zza();
        return zzc;
    }

    public void finalize() {
        finish();
        super.finalize();
    }

    public final void finish() {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.mContext == null || this.zze == null) {
                return;
            }
            try {
                if (this.zzg) {
                    com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(this.mContext, this.zze);
                }
            } catch (java.lang.Throwable unused) {
            }
            this.zzg = false;
            this.zzf = null;
            this.zze = null;
        }
    }

    public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getInfo() {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzg) {
                synchronized (this.zzh) {
                    com.google.android.gms.ads.identifier.AdvertisingIdClient.zza zzaVar = this.zzi;
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
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzf);
            try {
                info = new com.google.android.gms.ads.identifier.AdvertisingIdClient.Info(this.zzf.getId(), this.zzf.zzb(true));
            } catch (android.os.RemoteException unused) {
                throw new java.io.IOException("Remote exception");
            }
        }
        zza();
        return info;
    }

    public void start() {
        zza(true);
    }

    private AdvertisingIdClient(android.content.Context context, long j17, boolean z17, boolean z18) {
        android.content.Context applicationContext;
        this.zzh = new java.lang.Object();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        if (z17 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.mContext = context;
        this.zzg = false;
        this.zzk = j17;
        this.zzj = z18;
    }

    private static com.google.android.gms.internal.ads_identifier.zze zza(android.content.Context context, com.google.android.gms.common.BlockingServiceConnection blockingServiceConnection) {
        try {
            return com.google.android.gms.internal.ads_identifier.zzf.zza(blockingServiceConnection.getServiceWithTimeout(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, java.util.concurrent.TimeUnit.MILLISECONDS));
        } catch (java.lang.InterruptedException unused) {
            throw new java.io.IOException("Interrupted exception");
        } catch (java.lang.Throwable th6) {
            throw new java.io.IOException(th6);
        }
    }

    private final void zza() {
        synchronized (this.zzh) {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.zza zzaVar = this.zzi;
            if (zzaVar != null) {
                zzaVar.zzo.countDown();
                try {
                    this.zzi.join();
                } catch (java.lang.InterruptedException unused) {
                }
            }
            if (this.zzk > 0) {
                this.zzi = new com.google.android.gms.ads.identifier.AdvertisingIdClient.zza(this, this.zzk);
            }
        }
    }

    private final void zza(boolean z17) {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg) {
                finish();
            }
            com.google.android.gms.common.BlockingServiceConnection zza2 = zza(this.mContext, this.zzj);
            this.zze = zza2;
            this.zzf = zza(this.mContext, zza2);
            this.zzg = true;
            if (z17) {
                zza();
            }
        }
    }

    private final boolean zza(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info, boolean z17, float f17, long j17, java.lang.String str, java.lang.Throwable th6) {
        if (java.lang.Math.random() > f17) {
            return false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("app_context", z17 ? "1" : "0");
        if (info != null) {
            hashMap.put("limit_ad_tracking", info.isLimitAdTrackingEnabled() ? "1" : "0");
        }
        if (info != null && info.getId() != null) {
            hashMap.put("ad_id_size", java.lang.Integer.toString(info.getId().length()));
        }
        if (th6 != null) {
            hashMap.put("error", th6.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", java.lang.Long.toString(j17));
        new com.google.android.gms.ads.identifier.zza(this, hashMap).start();
        return true;
    }
}
