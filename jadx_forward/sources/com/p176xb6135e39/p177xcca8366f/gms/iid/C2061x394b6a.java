package com.p176xb6135e39.p177xcca8366f.gms.iid;

/* renamed from: com.google.android.gms.iid.zzak */
/* loaded from: classes13.dex */
public final class C2061x394b6a {

    /* renamed from: zzcz */
    private android.content.SharedPreferences f6124x394bb7;

    /* renamed from: zzda */
    private final com.p176xb6135e39.p177xcca8366f.gms.iid.zzn f6125x394bbd;

    /* renamed from: zzdb */
    private final java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.iid.zzo> f6126x394bbe;
    private android.content.Context zzk;

    public C2061x394b6a(android.content.Context context) {
        this(context, new com.p176xb6135e39.p177xcca8366f.gms.iid.zzn());
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
        return this.f6124x394bb7.getString(str, null);
    }

    /* renamed from: isEmpty */
    public final boolean m18772x7aab3243() {
        return this.f6124x394bb7.getAll().isEmpty();
    }

    public final synchronized java.lang.String zze(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.f6124x394bb7.getString(zzd(str, str2, str3), null);
    }

    public final synchronized void zzf(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String zzd = zzd(str, str2, str3);
        android.content.SharedPreferences.Editor edit = this.f6124x394bb7.edit();
        edit.remove(zzd);
        edit.commit();
    }

    public final synchronized void zzi(java.lang.String str) {
        android.content.SharedPreferences.Editor edit = this.f6124x394bb7.edit();
        for (java.lang.String str2 : this.f6124x394bb7.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    public final synchronized com.p176xb6135e39.p177xcca8366f.gms.iid.zzo zzj(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.iid.zzo zzf;
        com.p176xb6135e39.p177xcca8366f.gms.iid.zzo zzoVar = this.f6126x394bbe.get(str);
        if (zzoVar != null) {
            return zzoVar;
        }
        try {
            zzf = this.f6125x394bbd.zze(this.zzk, str);
        } catch (com.p176xb6135e39.p177xcca8366f.gms.iid.zzp unused) {
            com.p176xb6135e39.p177xcca8366f.gms.iid.ServiceC2049xd57384b1.zzd(this.zzk, this);
            zzf = this.f6125x394bbd.zzf(this.zzk, str);
        }
        this.f6126x394bbe.put(str, zzf);
        return zzf;
    }

    public final void zzk(java.lang.String str) {
        synchronized (this) {
            this.f6126x394bbe.remove(str);
        }
        com.p176xb6135e39.p177xcca8366f.gms.iid.zzn.zzg(this.zzk, str);
        zzi(java.lang.String.valueOf(str).concat("|"));
    }

    public final synchronized void zzx() {
        this.f6126x394bbe.clear();
        com.p176xb6135e39.p177xcca8366f.gms.iid.zzn.zzi(this.zzk);
        this.f6124x394bb7.edit().clear().commit();
    }

    private C2061x394b6a(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.iid.zzn zznVar) {
        this.f6126x394bbe = new x.b();
        this.zzk = context;
        this.f6124x394bb7 = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f6125x394bbd = zznVar;
        java.io.File file = new java.io.File(b3.l.m9711xb657be0f(this.zzk), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m18772x7aab3243()) {
                return;
            }
            com.p176xb6135e39.p177xcca8366f.gms.iid.ServiceC2049xd57384b1.zzd(this.zzk, this);
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
        android.content.SharedPreferences.Editor edit = this.f6124x394bb7.edit();
        edit.putString(zzd, str4);
        edit.putString("appVersion", str5);
        edit.putString("lastToken", java.lang.Long.toString(java.lang.System.currentTimeMillis() / 1000));
        edit.commit();
    }
}
