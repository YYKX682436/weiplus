package com.google.android.gms.auth.api.credentials;

/* loaded from: classes13.dex */
public final class CredentialRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.CredentialRequest> CREATOR = new com.google.android.gms.auth.api.credentials.zzh();
    private final boolean zzcu;
    private final java.lang.String[] zzcv;
    private final com.google.android.gms.auth.api.credentials.CredentialPickerConfig zzcw;
    private final com.google.android.gms.auth.api.credentials.CredentialPickerConfig zzcx;
    private final boolean zzcy;
    private final java.lang.String zzcz;
    private final java.lang.String zzda;
    private final boolean zzdb;
    private final int zzy;

    /* loaded from: classes13.dex */
    public static final class Builder {
        private boolean zzcu;
        private java.lang.String[] zzcv;
        private com.google.android.gms.auth.api.credentials.CredentialPickerConfig zzcw;
        private com.google.android.gms.auth.api.credentials.CredentialPickerConfig zzcx;
        private java.lang.String zzda;
        private boolean zzcy = false;
        private boolean zzdb = false;
        private java.lang.String zzcz = null;

        public final com.google.android.gms.auth.api.credentials.CredentialRequest build() {
            if (this.zzcv == null) {
                this.zzcv = new java.lang.String[0];
            }
            if (this.zzcu || this.zzcv.length != 0) {
                return new com.google.android.gms.auth.api.credentials.CredentialRequest(this);
            }
            throw new java.lang.IllegalStateException("At least one authentication method must be specified");
        }

        public final com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setAccountTypes(java.lang.String... strArr) {
            if (strArr == null) {
                strArr = new java.lang.String[0];
            }
            this.zzcv = strArr;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setCredentialHintPickerConfig(com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig) {
            this.zzcx = credentialPickerConfig;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setCredentialPickerConfig(com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig) {
            this.zzcw = credentialPickerConfig;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setIdTokenNonce(java.lang.String str) {
            this.zzda = str;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setIdTokenRequested(boolean z17) {
            this.zzcy = z17;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setPasswordLoginSupported(boolean z17) {
            this.zzcu = z17;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setServerClientId(java.lang.String str) {
            this.zzcz = str;
            return this;
        }

        @java.lang.Deprecated
        public final com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setSupportsPasswordLogin(boolean z17) {
            return setPasswordLoginSupported(z17);
        }
    }

    public CredentialRequest(int i17, boolean z17, java.lang.String[] strArr, com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig, com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig2, boolean z18, java.lang.String str, java.lang.String str2, boolean z19) {
        this.zzy = i17;
        this.zzcu = z17;
        this.zzcv = (java.lang.String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        this.zzcw = credentialPickerConfig == null ? new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder().build() : credentialPickerConfig;
        this.zzcx = credentialPickerConfig2 == null ? new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder().build() : credentialPickerConfig2;
        if (i17 < 3) {
            this.zzcy = true;
            this.zzcz = null;
            this.zzda = null;
        } else {
            this.zzcy = z18;
            this.zzcz = str;
            this.zzda = str2;
        }
        this.zzdb = z19;
    }

    public final java.lang.String[] getAccountTypes() {
        return this.zzcv;
    }

    public final java.util.Set<java.lang.String> getAccountTypesSet() {
        return new java.util.HashSet(java.util.Arrays.asList(this.zzcv));
    }

    public final com.google.android.gms.auth.api.credentials.CredentialPickerConfig getCredentialHintPickerConfig() {
        return this.zzcx;
    }

    public final com.google.android.gms.auth.api.credentials.CredentialPickerConfig getCredentialPickerConfig() {
        return this.zzcw;
    }

    public final java.lang.String getIdTokenNonce() {
        return this.zzda;
    }

    public final java.lang.String getServerClientId() {
        return this.zzcz;
    }

    @java.lang.Deprecated
    public final boolean getSupportsPasswordLogin() {
        return isPasswordLoginSupported();
    }

    public final boolean isIdTokenRequested() {
        return this.zzcy;
    }

    public final boolean isPasswordLoginSupported() {
        return this.zzcu;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, isPasswordLoginSupported());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 2, getAccountTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getCredentialPickerConfig(), i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getCredentialHintPickerConfig(), i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zzy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzdb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private CredentialRequest(com.google.android.gms.auth.api.credentials.CredentialRequest.Builder builder) {
        this(4, builder.zzcu, builder.zzcv, builder.zzcw, builder.zzcx, builder.zzcy, builder.zzcz, builder.zzda, false);
    }
}
