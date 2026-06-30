package com.google.android.gms.gcm;

/* loaded from: classes13.dex */
final class zzd {
    static com.google.android.gms.gcm.zzd zzj;
    private final android.content.Context zzk;
    private java.lang.String zzl;
    private final java.util.concurrent.atomic.AtomicInteger zzm = new java.util.concurrent.atomic.AtomicInteger((int) android.os.SystemClock.elapsedRealtime());

    private zzd(android.content.Context context) {
        this.zzk = context.getApplicationContext();
    }

    public static synchronized com.google.android.gms.gcm.zzd zzd(android.content.Context context) {
        com.google.android.gms.gcm.zzd zzdVar;
        synchronized (com.google.android.gms.gcm.zzd.class) {
            if (zzj == null) {
                zzj = new com.google.android.gms.gcm.zzd(context);
            }
            zzdVar = zzj;
        }
        return zzdVar;
    }

    private final android.os.Bundle zze() {
        android.content.pm.ApplicationInfo applicationInfo;
        android.os.Bundle bundle;
        try {
            applicationInfo = this.zzk.getPackageManager().getApplicationInfo(this.zzk.getPackageName(), 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (applicationInfo == null || (bundle = applicationInfo.metaData) == null) ? android.os.Bundle.EMPTY : bundle;
    }

    public static java.lang.String zzd(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    private final java.lang.String zze(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String zzd = zzd(bundle, str);
        if (!android.text.TextUtils.isEmpty(zzd)) {
            return zzd;
        }
        java.lang.String valueOf = java.lang.String.valueOf(str);
        java.lang.String zzd2 = zzd(bundle, "_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new java.lang.String(valueOf));
        if (android.text.TextUtils.isEmpty(zzd2)) {
            return null;
        }
        android.content.res.Resources resources = this.zzk.getResources();
        int identifier = resources.getIdentifier(zzd2, "string", this.zzk.getPackageName());
        if (identifier == 0) {
            java.lang.String valueOf2 = java.lang.String.valueOf(str);
            new java.lang.StringBuilder(java.lang.String.valueOf(("_loc_key".length() != 0 ? valueOf2.concat("_loc_key") : new java.lang.String(valueOf2)).substring(6)).length() + 49 + java.lang.String.valueOf(zzd2).length());
            return null;
        }
        java.lang.String valueOf3 = java.lang.String.valueOf(str);
        java.lang.String zzd3 = zzd(bundle, "_loc_args".length() != 0 ? valueOf3.concat("_loc_args") : new java.lang.String(valueOf3));
        if (android.text.TextUtils.isEmpty(zzd3)) {
            return resources.getString(identifier);
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(zzd3);
            int length = jSONArray.length();
            java.lang.Object[] objArr = new java.lang.String[length];
            for (int i17 = 0; i17 < length; i17++) {
                objArr[i17] = jSONArray.opt(i17);
            }
            return resources.getString(identifier, objArr);
        } catch (java.util.MissingFormatArgumentException unused) {
            new java.lang.StringBuilder(java.lang.String.valueOf(zzd2).length() + 58 + java.lang.String.valueOf(zzd3).length());
            return null;
        } catch (org.json.JSONException unused2) {
            java.lang.String valueOf4 = java.lang.String.valueOf(str);
            new java.lang.StringBuilder(java.lang.String.valueOf(("_loc_args".length() != 0 ? valueOf4.concat("_loc_args") : new java.lang.String(valueOf4)).substring(6)).length() + 41 + java.lang.String.valueOf(zzd3).length());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zze(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.zzd.zze(android.os.Bundle):boolean");
    }
}
