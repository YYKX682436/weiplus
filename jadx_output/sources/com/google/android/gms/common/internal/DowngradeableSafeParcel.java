package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public abstract class DowngradeableSafeParcel extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    private static final java.lang.Object zza = new java.lang.Object();
    private boolean zzb = false;

    public static boolean canUnparcelSafely(java.lang.String str) {
        synchronized (zza) {
        }
        return true;
    }

    public static java.lang.Integer getUnparcelClientVersion() {
        synchronized (zza) {
        }
        return null;
    }

    public abstract boolean prepareForClientVersion(int i17);

    public void setShouldDowngrade(boolean z17) {
        this.zzb = z17;
    }

    public boolean shouldDowngrade() {
        return this.zzb;
    }
}
