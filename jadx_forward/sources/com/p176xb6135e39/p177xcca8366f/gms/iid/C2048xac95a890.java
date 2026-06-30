package com.p176xb6135e39.p177xcca8366f.gms.iid;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.iid.InstanceID */
/* loaded from: classes13.dex */
public class C2048xac95a890 {

    /* renamed from: ERROR_MAIN_THREAD */
    public static final java.lang.String f6094xad926b79 = "MAIN_THREAD";

    /* renamed from: ERROR_MISSING_INSTANCEID_SERVICE */
    public static final java.lang.String f6095x2ee66a16 = "MISSING_INSTANCEID_SERVICE";

    /* renamed from: ERROR_SERVICE_NOT_AVAILABLE */
    public static final java.lang.String f6096x5f2af8dc = "SERVICE_NOT_AVAILABLE";

    /* renamed from: ERROR_TIMEOUT */
    public static final java.lang.String f6097xbb18f1ea = "TIMEOUT";

    /* renamed from: zzbq */
    private static java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890> f6098x394b8f = new x.b();

    /* renamed from: zzbr */
    private static long f6099x394b90 = java.util.concurrent.TimeUnit.DAYS.toSeconds(7);

    /* renamed from: zzbs */
    private static com.p176xb6135e39.p177xcca8366f.gms.iid.C2061x394b6a f6100x394b91;

    /* renamed from: zzbt */
    private static com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65 f6101x394b92;

    /* renamed from: zzbu */
    private static java.lang.String f6102x394b93;

    /* renamed from: zzbv */
    private java.lang.String f6103x394b94;
    private android.content.Context zzk;

    private C2048xac95a890(android.content.Context context, java.lang.String str) {
        this.f6103x394b94 = "";
        this.zzk = context.getApplicationContext();
        this.f6103x394b94 = str;
    }

    @java.lang.Deprecated
    /* renamed from: getInstance */
    public static com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890 m18754x9cf0d20b(android.content.Context context) {
        return m18755x9cf0d20b(context, null);
    }

    /* renamed from: getKeyPair */
    private final java.security.KeyPair m18756xd3069a3() {
        return f6100x394b91.zzj(this.f6103x394b94).m18777xd3069a3();
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

    public static com.p176xb6135e39.p177xcca8366f.gms.iid.C2061x394b6a zzn() {
        return f6100x394b91;
    }

    @java.lang.Deprecated
    /* renamed from: deleteInstanceID */
    public void m18757xdb1d547b() {
        zzd("*", "*", null);
        zzm();
    }

    @java.lang.Deprecated
    /* renamed from: deleteToken */
    public void m18758xbc85170e(java.lang.String str, java.lang.String str2) {
        zzd(str, str2, null);
    }

    @java.lang.Deprecated
    /* renamed from: getCreationTime */
    public long m18759xbf7b40c2() {
        return f6100x394b91.zzj(this.f6103x394b94).m18776xbf7b40c2();
    }

    @java.lang.Deprecated
    /* renamed from: getId */
    public java.lang.String m18760x5db1b11() {
        return zzd(m18756xd3069a3());
    }

    /* renamed from: getSubtype */
    public java.lang.String m18761xce7c6944() {
        return this.f6103x394b94;
    }

    @java.lang.Deprecated
    /* renamed from: getToken */
    public java.lang.String m18762x75346043(java.lang.String str, java.lang.String str2) {
        return m18763x75346043(str, str2, null);
    }

    public final java.lang.String zze(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        java.lang.String str3 = "".equals(this.f6103x394b94) ? str : this.f6103x394b94;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        java.lang.String zzi = com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65.zzi(f6101x394b92.zzd(bundle, m18756xd3069a3()));
        if (!"RST".equals(zzi) && !zzi.startsWith("RST|")) {
            return zzi;
        }
        com.p176xb6135e39.p177xcca8366f.gms.iid.ServiceC2049xd57384b1.zzd(this.zzk, f6100x394b91);
        throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
    }

    public final void zzm() {
        f6100x394b91.zzk(this.f6103x394b94);
    }

    /* renamed from: getInstance */
    public static synchronized com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890 m18755x9cf0d20b(android.content.Context context, android.os.Bundle bundle) {
        com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890 c2048xac95a890;
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.class) {
            java.lang.String string = bundle == null ? "" : bundle.getString("subtype");
            if (string == null) {
                string = "";
            }
            android.content.Context applicationContext = context.getApplicationContext();
            if (f6100x394b91 == null) {
                new java.lang.StringBuilder(java.lang.String.valueOf(applicationContext.getPackageName()).length() + 73);
                f6100x394b91 = new com.p176xb6135e39.p177xcca8366f.gms.iid.C2061x394b6a(applicationContext);
                f6101x394b92 = new com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65(applicationContext);
            }
            f6102x394b93 = java.lang.Integer.toString(zzg(applicationContext));
            c2048xac95a890 = f6098x394b8f.get(string);
            if (c2048xac95a890 == null) {
                c2048xac95a890 = new com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890(applicationContext, string);
                f6098x394b8f.put(string, c2048xac95a890);
            }
        }
        return c2048xac95a890;
    }

    @java.lang.Deprecated
    /* renamed from: getToken */
    public java.lang.String m18763x75346043(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        java.lang.String str3;
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        java.lang.String str4 = f6100x394b91.get("appVersion");
        boolean z17 = true;
        if (str4 != null && str4.equals(f6102x394b93) && (str3 = f6100x394b91.get("lastToken")) != null) {
            if ((java.lang.System.currentTimeMillis() / 1000) - java.lang.Long.valueOf(java.lang.Long.parseLong(str3)).longValue() <= f6099x394b90) {
                z17 = false;
            }
        }
        java.lang.String zze = !z17 ? f6100x394b91.zze(this.f6103x394b94, str, str2) : null;
        if (zze != null) {
            return zze;
        }
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        java.lang.String zze2 = zze(str, str2, bundle);
        if (zze2 != null) {
            f6100x394b91.zzd(this.f6103x394b94, str, str2, zze2, f6102x394b93);
        }
        return zze2;
    }

    public final void zzd(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        f6100x394b91.zzf(this.f6103x394b94, str, str2);
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
        bundle.putString("subtype", "".equals(this.f6103x394b94) ? str : this.f6103x394b94);
        if (!"".equals(this.f6103x394b94)) {
            str = this.f6103x394b94;
        }
        bundle.putString("X-subtype", str);
        com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65.zzi(f6101x394b92.zzd(bundle, m18756xd3069a3()));
    }
}
