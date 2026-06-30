package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes13.dex */
public final class SignInConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.internal.SignInConfiguration> CREATOR = new com.google.android.gms.auth.api.signin.internal.zzy();
    private final java.lang.String zzfe;
    private com.google.android.gms.auth.api.signin.GoogleSignInOptions zzff;

    public SignInConfiguration(java.lang.String str, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        this.zzfe = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzff = googleSignInOptions;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            com.google.android.gms.auth.api.signin.internal.SignInConfiguration signInConfiguration = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) obj;
            if (this.zzfe.equals(signInConfiguration.zzfe)) {
                com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = this.zzff;
                if (googleSignInOptions == null) {
                    if (signInConfiguration.zzff == null) {
                        return true;
                    }
                } else if (googleSignInOptions.equals(signInConfiguration.zzff)) {
                    return true;
                }
            }
        } catch (java.lang.ClassCastException unused) {
        }
        return false;
    }

    public final int hashCode() {
        return new com.google.android.gms.auth.api.signin.internal.HashAccumulator().addObject(this.zzfe).addObject(this.zzff).hash();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzfe, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzff, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions zzt() {
        return this.zzff;
    }
}
