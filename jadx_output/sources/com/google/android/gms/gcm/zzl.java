package com.google.android.gms.gcm;

/* loaded from: classes13.dex */
public final class zzl {
    public static final com.google.android.gms.gcm.zzl zzao = new com.google.android.gms.gcm.zzl(0, 30, 3600);
    private static final com.google.android.gms.gcm.zzl zzap = new com.google.android.gms.gcm.zzl(1, 30, 3600);
    private final int zzaq;
    private final int zzar = 30;
    private final int zzas = 3600;

    private zzl(int i17, int i18, int i19) {
        this.zzaq = i17;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.gcm.zzl)) {
            return false;
        }
        com.google.android.gms.gcm.zzl zzlVar = (com.google.android.gms.gcm.zzl) obj;
        return zzlVar.zzaq == this.zzaq && zzlVar.zzar == this.zzar && zzlVar.zzas == this.zzas;
    }

    public final int hashCode() {
        return (((((this.zzaq + 1) ^ 1000003) * 1000003) ^ this.zzar) * 1000003) ^ this.zzas;
    }

    public final java.lang.String toString() {
        int i17 = this.zzaq;
        int i18 = this.zzar;
        int i19 = this.zzas;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(74);
        sb6.append("policy=");
        sb6.append(i17);
        sb6.append(" initial_backoff=");
        sb6.append(i18);
        sb6.append(" maximum_backoff=");
        sb6.append(i19);
        return sb6.toString();
    }

    public final android.os.Bundle zzf(android.os.Bundle bundle) {
        bundle.putInt("retry_policy", this.zzaq);
        bundle.putInt("initial_backoff_seconds", this.zzar);
        bundle.putInt("maximum_backoff_seconds", this.zzas);
        return bundle;
    }

    public final int zzh() {
        return this.zzaq;
    }

    public final int zzi() {
        return this.zzar;
    }

    public final int zzj() {
        return this.zzas;
    }
}
