package com.google.android.gms.internal.measurement;

/* loaded from: classes15.dex */
public final class zzxc {
    private final java.lang.String zzbnr;
    private final android.net.Uri zzbns;
    private final java.lang.String zzbnt;
    private final java.lang.String zzbnu;
    private final boolean zzbnv;
    private final boolean zzbnw;

    public zzxc(android.net.Uri uri) {
        this(null, uri, "", "", false, false);
    }

    public final com.google.android.gms.internal.measurement.zzws<java.lang.Double> zzb(java.lang.String str, double d17) {
        return com.google.android.gms.internal.measurement.zzws.zzb(this, str, d17);
    }

    public final com.google.android.gms.internal.measurement.zzws<java.lang.Integer> zzd(java.lang.String str, int i17) {
        return com.google.android.gms.internal.measurement.zzws.zzb(this, str, i17);
    }

    public final com.google.android.gms.internal.measurement.zzws<java.lang.Long> zze(java.lang.String str, long j17) {
        return com.google.android.gms.internal.measurement.zzws.zzb(this, str, j17);
    }

    public final com.google.android.gms.internal.measurement.zzws<java.lang.Boolean> zzf(java.lang.String str, boolean z17) {
        return com.google.android.gms.internal.measurement.zzws.zzb(this, str, z17);
    }

    public final com.google.android.gms.internal.measurement.zzws<java.lang.String> zzv(java.lang.String str, java.lang.String str2) {
        return com.google.android.gms.internal.measurement.zzws.zzb(this, str, str2);
    }

    private zzxc(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18) {
        this.zzbnr = null;
        this.zzbns = uri;
        this.zzbnt = str2;
        this.zzbnu = str3;
        this.zzbnv = false;
        this.zzbnw = false;
    }
}
