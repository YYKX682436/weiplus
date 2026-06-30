package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzfv {
    private final long zzabj;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzfr zzakq;
    private final java.lang.String zzaks;
    private final java.lang.String zzakt;
    private final java.lang.String zzaku;

    private zzfv(com.google.android.gms.internal.measurement.zzfr zzfrVar, java.lang.String str, long j17) {
        this.zzakq = zzfrVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkArgument(j17 > 0);
        this.zzaks = java.lang.String.valueOf(str).concat(":start");
        this.zzakt = java.lang.String.valueOf(str).concat(":count");
        this.zzaku = java.lang.String.valueOf(str).concat(":value");
        this.zzabj = j17;
    }

    private final void zzfh() {
        android.content.SharedPreferences zziy;
        this.zzakq.zzab();
        long currentTimeMillis = this.zzakq.zzbt().currentTimeMillis();
        zziy = this.zzakq.zziy();
        android.content.SharedPreferences.Editor edit = zziy.edit();
        edit.remove(this.zzakt);
        edit.remove(this.zzaku);
        edit.putLong(this.zzaks, currentTimeMillis);
        edit.apply();
    }

    private final long zzfj() {
        android.content.SharedPreferences zziy;
        zziy = this.zzakq.zziy();
        return zziy.getLong(this.zzaks, 0L);
    }

    public final void zzc(java.lang.String str, long j17) {
        android.content.SharedPreferences zziy;
        android.content.SharedPreferences zziy2;
        android.content.SharedPreferences zziy3;
        this.zzakq.zzab();
        if (zzfj() == 0) {
            zzfh();
        }
        if (str == null) {
            str = "";
        }
        zziy = this.zzakq.zziy();
        long j18 = zziy.getLong(this.zzakt, 0L);
        if (j18 <= 0) {
            zziy3 = this.zzakq.zziy();
            android.content.SharedPreferences.Editor edit = zziy3.edit();
            edit.putString(this.zzaku, str);
            edit.putLong(this.zzakt, 1L);
            edit.apply();
            return;
        }
        long j19 = j18 + 1;
        boolean z17 = (this.zzakq.zzgb().zzlc().nextLong() & com.tencent.wcdb.core.Database.DictDefaultMatchValue) < com.tencent.wcdb.core.Database.DictDefaultMatchValue / j19;
        zziy2 = this.zzakq.zziy();
        android.content.SharedPreferences.Editor edit2 = zziy2.edit();
        if (z17) {
            edit2.putString(this.zzaku, str);
        }
        edit2.putLong(this.zzakt, j19);
        edit2.apply();
    }

    public final android.util.Pair<java.lang.String, java.lang.Long> zzfi() {
        long abs;
        android.content.SharedPreferences zziy;
        android.content.SharedPreferences zziy2;
        this.zzakq.zzab();
        this.zzakq.zzab();
        long zzfj = zzfj();
        if (zzfj == 0) {
            zzfh();
            abs = 0;
        } else {
            abs = java.lang.Math.abs(zzfj - this.zzakq.zzbt().currentTimeMillis());
        }
        long j17 = this.zzabj;
        if (abs < j17) {
            return null;
        }
        if (abs > (j17 << 1)) {
            zzfh();
            return null;
        }
        zziy = this.zzakq.zziy();
        java.lang.String string = zziy.getString(this.zzaku, null);
        zziy2 = this.zzakq.zziy();
        long j18 = zziy2.getLong(this.zzakt, 0L);
        zzfh();
        return (string == null || j18 <= 0) ? com.google.android.gms.internal.measurement.zzfr.zzajs : new android.util.Pair<>(string, java.lang.Long.valueOf(j18));
    }
}
