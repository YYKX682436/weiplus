package com.google.android.gms.iid;

/* loaded from: classes13.dex */
public final class zzak {
    private android.content.SharedPreferences zzcz;
    private final com.google.android.gms.iid.zzn zzda;
    private final java.util.Map<java.lang.String, com.google.android.gms.iid.zzo> zzdb;
    private android.content.Context zzk;

    public zzak(android.content.Context context) {
        this(context, new com.google.android.gms.iid.zzn());
    }

    private static java.lang.String zzd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 4 + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(str3).length());
        sb6.append(str);
        sb6.append("|T|");
        sb6.append(str2);
        sb6.append("|");
        sb6.append(str3);
        return sb6.toString();
    }

    public static java.lang.String zzh(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 3 + java.lang.String.valueOf(str2).length());
        sb6.append(str);
        sb6.append("|S|");
        sb6.append(str2);
        return sb6.toString();
    }

    public final synchronized java.lang.String get(java.lang.String str) {
        return this.zzcz.getString(str, null);
    }

    public final boolean isEmpty() {
        return this.zzcz.getAll().isEmpty();
    }

    public final synchronized java.lang.String zze(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.zzcz.getString(zzd(str, str2, str3), null);
    }

    public final synchronized void zzf(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String zzd = zzd(str, str2, str3);
        android.content.SharedPreferences.Editor edit = this.zzcz.edit();
        edit.remove(zzd);
        edit.commit();
    }

    public final synchronized void zzi(java.lang.String str) {
        android.content.SharedPreferences.Editor edit = this.zzcz.edit();
        for (java.lang.String str2 : this.zzcz.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    public final synchronized com.google.android.gms.iid.zzo zzj(java.lang.String str) {
        com.google.android.gms.iid.zzo zzf;
        com.google.android.gms.iid.zzo zzoVar = this.zzdb.get(str);
        if (zzoVar != null) {
            return zzoVar;
        }
        try {
            zzf = this.zzda.zze(this.zzk, str);
        } catch (com.google.android.gms.iid.zzp unused) {
            com.google.android.gms.iid.InstanceIDListenerService.zzd(this.zzk, this);
            zzf = this.zzda.zzf(this.zzk, str);
        }
        this.zzdb.put(str, zzf);
        return zzf;
    }

    public final void zzk(java.lang.String str) {
        synchronized (this) {
            this.zzdb.remove(str);
        }
        com.google.android.gms.iid.zzn.zzg(this.zzk, str);
        zzi(java.lang.String.valueOf(str).concat("|"));
    }

    public final synchronized void zzx() {
        this.zzdb.clear();
        com.google.android.gms.iid.zzn.zzi(this.zzk);
        this.zzcz.edit().clear().commit();
    }

    private zzak(android.content.Context context, com.google.android.gms.iid.zzn zznVar) {
        this.zzdb = new x.b();
        this.zzk = context;
        this.zzcz = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.zzda = zznVar;
        java.io.File file = new java.io.File(b3.l.getNoBackupFilesDir(this.zzk), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || isEmpty()) {
                return;
            }
            com.google.android.gms.iid.InstanceIDListenerService.zzd(this.zzk, this);
        } catch (java.io.IOException e17) {
            if (android.util.Log.isLoggable("InstanceID/Store", 3)) {
                java.lang.String valueOf = java.lang.String.valueOf(e17.getMessage());
                if (valueOf.length() != 0) {
                    "Error creating file in no backup dir: ".concat(valueOf);
                }
            }
        }
    }

    public final synchronized void zzd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String zzd = zzd(str, str2, str3);
        android.content.SharedPreferences.Editor edit = this.zzcz.edit();
        edit.putString(zzd, str4);
        edit.putString("appVersion", str5);
        edit.putString("lastToken", java.lang.Long.toString(java.lang.System.currentTimeMillis() / 1000));
        edit.commit();
    }
}
