package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public final class zzo {
    private static final android.net.Uri zza = new android.net.Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final android.content.ComponentName zzd;
    private final int zze;
    private final boolean zzf;

    public zzo(android.content.ComponentName componentName, int i17) {
        this.zzb = null;
        this.zzc = null;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(componentName);
        this.zzd = componentName;
        this.zze = 4225;
        this.zzf = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.internal.zzo)) {
            return false;
        }
        com.google.android.gms.common.internal.zzo zzoVar = (com.google.android.gms.common.internal.zzo) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzb, zzoVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzoVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzoVar.zzd) && this.zzf == zzoVar.zzf;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, this.zzc, this.zzd, 4225, java.lang.Boolean.valueOf(this.zzf));
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zzb;
        if (str != null) {
            return str;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzd);
        return this.zzd.flattenToString();
    }

    public final android.content.ComponentName zza() {
        return this.zzd;
    }

    public final android.content.Intent zzb(android.content.Context context) {
        android.os.Bundle bundle;
        if (this.zzb == null) {
            return new android.content.Intent().setComponent(this.zzd);
        }
        if (this.zzf) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("serviceActionBundleKey", this.zzb);
            try {
                bundle = context.getContentResolver().call(zza, "serviceIntentCall", (java.lang.String) null, bundle2);
            } catch (java.lang.IllegalArgumentException e17) {
                "Dynamic intent resolution failed: ".concat(e17.toString());
                bundle = null;
            }
            r1 = bundle != null ? (android.content.Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                "Dynamic lookup for intent failed for action: ".concat(java.lang.String.valueOf(this.zzb));
            }
        }
        return r1 == null ? new android.content.Intent(this.zzb).setPackage(this.zzc) : r1;
    }

    public final java.lang.String zzc() {
        return this.zzc;
    }

    public zzo(java.lang.String str, int i17, boolean z17) {
        this(str, "com.google.android.gms", 4225, false);
    }

    public zzo(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzb = str;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        this.zzc = str2;
        this.zzd = null;
        this.zze = 4225;
        this.zzf = z17;
    }
}
