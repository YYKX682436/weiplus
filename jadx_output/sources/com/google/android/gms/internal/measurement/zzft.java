package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzft {
    private boolean value;
    private final boolean zzako;
    private boolean zzakp;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzfr zzakq;
    private final java.lang.String zzny;

    public zzft(com.google.android.gms.internal.measurement.zzfr zzfrVar, java.lang.String str, boolean z17) {
        this.zzakq = zzfrVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzny = str;
        this.zzako = true;
    }

    public final boolean get() {
        android.content.SharedPreferences zziy;
        if (!this.zzakp) {
            this.zzakp = true;
            zziy = this.zzakq.zziy();
            this.value = zziy.getBoolean(this.zzny, this.zzako);
        }
        return this.value;
    }

    public final void set(boolean z17) {
        android.content.SharedPreferences zziy;
        zziy = this.zzakq.zziy();
        android.content.SharedPreferences.Editor edit = zziy.edit();
        edit.putBoolean(this.zzny, z17);
        edit.apply();
        this.value = z17;
    }
}
