package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzfu {
    private long value;
    private boolean zzakp;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzfr zzakq;
    private final long zzakr;
    private final java.lang.String zzny;

    public zzfu(com.google.android.gms.internal.measurement.zzfr zzfrVar, java.lang.String str, long j17) {
        this.zzakq = zzfrVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzny = str;
        this.zzakr = j17;
    }

    public final long get() {
        android.content.SharedPreferences zziy;
        if (!this.zzakp) {
            this.zzakp = true;
            zziy = this.zzakq.zziy();
            this.value = zziy.getLong(this.zzny, this.zzakr);
        }
        return this.value;
    }

    public final void set(long j17) {
        android.content.SharedPreferences zziy;
        zziy = this.zzakq.zziy();
        android.content.SharedPreferences.Editor edit = zziy.edit();
        edit.putLong(this.zzny, j17);
        edit.apply();
        this.value = j17;
    }
}
