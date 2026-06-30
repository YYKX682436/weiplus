package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzfw {
    private java.lang.String value;
    private boolean zzakp;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzfr zzakq;
    private final java.lang.String zzakv;
    private final java.lang.String zzny;

    public zzfw(com.google.android.gms.internal.measurement.zzfr zzfrVar, java.lang.String str, java.lang.String str2) {
        this.zzakq = zzfrVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzny = str;
        this.zzakv = null;
    }

    public final void zzbs(java.lang.String str) {
        android.content.SharedPreferences zziy;
        if (com.google.android.gms.internal.measurement.zzka.zzs(str, this.value)) {
            return;
        }
        zziy = this.zzakq.zziy();
        android.content.SharedPreferences.Editor edit = zziy.edit();
        edit.putString(this.zzny, str);
        edit.apply();
        this.value = str;
    }

    public final java.lang.String zzjg() {
        android.content.SharedPreferences zziy;
        if (!this.zzakp) {
            this.zzakp = true;
            zziy = this.zzakq.zziy();
            this.value = zziy.getString(this.zzny, null);
        }
        return this.value;
    }
}
