package com.google.android.gms.iid;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public class InstanceID {
    public static final java.lang.String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final java.lang.String ERROR_MISSING_INSTANCEID_SERVICE = "MISSING_INSTANCEID_SERVICE";
    public static final java.lang.String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final java.lang.String ERROR_TIMEOUT = "TIMEOUT";
    private static java.util.Map<java.lang.String, com.google.android.gms.iid.InstanceID> zzbq = new x.b();
    private static long zzbr = java.util.concurrent.TimeUnit.DAYS.toSeconds(7);
    private static com.google.android.gms.iid.zzak zzbs;
    private static com.google.android.gms.iid.zzaf zzbt;
    private static java.lang.String zzbu;
    private java.lang.String zzbv;
    private android.content.Context zzk;

    private InstanceID(android.content.Context context, java.lang.String str) {
        this.zzbv = "";
        this.zzk = context.getApplicationContext();
        this.zzbv = str;
    }

    @java.lang.Deprecated
    public static com.google.android.gms.iid.InstanceID getInstance(android.content.Context context) {
        return getInstance(context, null);
    }

    private final java.security.KeyPair getKeyPair() {
        return zzbs.zzj(this.zzbv).getKeyPair();
    }

    public static java.lang.String zzd(java.security.KeyPair keyPair) {
        try {
            byte[] digest = java.security.MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return android.util.Base64.encodeToString(digest, 0, 8, 11);
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static int zzg(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            new java.lang.StringBuilder(java.lang.String.valueOf(e17).length() + 38);
            return 0;
        }
    }

    public static java.lang.String zzh(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            new java.lang.StringBuilder(java.lang.String.valueOf(e17).length() + 38);
            return null;
        }
    }

    public static com.google.android.gms.iid.zzak zzn() {
        return zzbs;
    }

    @java.lang.Deprecated
    public void deleteInstanceID() {
        zzd("*", "*", null);
        zzm();
    }

    @java.lang.Deprecated
    public void deleteToken(java.lang.String str, java.lang.String str2) {
        zzd(str, str2, null);
    }

    @java.lang.Deprecated
    public long getCreationTime() {
        return zzbs.zzj(this.zzbv).getCreationTime();
    }

    @java.lang.Deprecated
    public java.lang.String getId() {
        return zzd(getKeyPair());
    }

    public java.lang.String getSubtype() {
        return this.zzbv;
    }

    @java.lang.Deprecated
    public java.lang.String getToken(java.lang.String str, java.lang.String str2) {
        return getToken(str, str2, null);
    }

    public final java.lang.String zze(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        java.lang.String str3 = "".equals(this.zzbv) ? str : this.zzbv;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        java.lang.String zzi = com.google.android.gms.iid.zzaf.zzi(zzbt.zzd(bundle, getKeyPair()));
        if (!"RST".equals(zzi) && !zzi.startsWith("RST|")) {
            return zzi;
        }
        com.google.android.gms.iid.InstanceIDListenerService.zzd(this.zzk, zzbs);
        throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
    }

    public final void zzm() {
        zzbs.zzk(this.zzbv);
    }

    public static synchronized com.google.android.gms.iid.InstanceID getInstance(android.content.Context context, android.os.Bundle bundle) {
        com.google.android.gms.iid.InstanceID instanceID;
        synchronized (com.google.android.gms.iid.InstanceID.class) {
            java.lang.String string = bundle == null ? "" : bundle.getString("subtype");
            if (string == null) {
                string = "";
            }
            android.content.Context applicationContext = context.getApplicationContext();
            if (zzbs == null) {
                new java.lang.StringBuilder(java.lang.String.valueOf(applicationContext.getPackageName()).length() + 73);
                zzbs = new com.google.android.gms.iid.zzak(applicationContext);
                zzbt = new com.google.android.gms.iid.zzaf(applicationContext);
            }
            zzbu = java.lang.Integer.toString(zzg(applicationContext));
            instanceID = zzbq.get(string);
            if (instanceID == null) {
                instanceID = new com.google.android.gms.iid.InstanceID(applicationContext, string);
                zzbq.put(string, instanceID);
            }
        }
        return instanceID;
    }

    @java.lang.Deprecated
    public java.lang.String getToken(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        java.lang.String str3;
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        java.lang.String str4 = zzbs.get("appVersion");
        boolean z17 = true;
        if (str4 != null && str4.equals(zzbu) && (str3 = zzbs.get("lastToken")) != null) {
            if ((java.lang.System.currentTimeMillis() / 1000) - java.lang.Long.valueOf(java.lang.Long.parseLong(str3)).longValue() <= zzbr) {
                z17 = false;
            }
        }
        java.lang.String zze = !z17 ? zzbs.zze(this.zzbv, str, str2) : null;
        if (zze != null) {
            return zze;
        }
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        java.lang.String zze2 = zze(str, str2, bundle);
        if (zze2 != null) {
            zzbs.zzd(this.zzbv, str, str2, zze2, zzbu);
        }
        return zze2;
    }

    public final void zzd(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        zzbs.zzf(this.zzbv, str, str2);
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        bundle.putString("sender", str);
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("subscription", str);
        bundle.putString("delete", "1");
        bundle.putString("X-delete", "1");
        bundle.putString("subtype", "".equals(this.zzbv) ? str : this.zzbv);
        if (!"".equals(this.zzbv)) {
            str = this.zzbv;
        }
        bundle.putString("X-subtype", str);
        com.google.android.gms.iid.zzaf.zzi(zzbt.zzd(bundle, getKeyPair()));
    }
}
