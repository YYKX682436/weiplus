package com.google.android.gms.auth.api.credentials;

/* loaded from: classes13.dex */
public final class HintRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.HintRequest> CREATOR = new com.google.android.gms.auth.api.credentials.zzk();
    private final java.lang.String[] zzcv;
    private final boolean zzcy;
    private final java.lang.String zzcz;
    private final java.lang.String zzda;
    private final com.google.android.gms.auth.api.credentials.CredentialPickerConfig zzdc;
    private final boolean zzdd;
    private final boolean zzde;
    private final int zzy;

    /* loaded from: classes13.dex */
    public static final class Builder {
        private java.lang.String[] zzcv;
        private java.lang.String zzcz;
        private java.lang.String zzda;
        private boolean zzdd;
        private boolean zzde;
        private com.google.android.gms.auth.api.credentials.CredentialPickerConfig zzdc = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder().build();
        private boolean zzcy = false;

        public final com.google.android.gms.auth.api.credentials.HintRequest build() {
            if (this.zzcv == null) {
                this.zzcv = new java.lang.String[0];
            }
            if (this.zzdd || this.zzde || this.zzcv.length != 0) {
                return new com.google.android.gms.auth.api.credentials.HintRequest(this);
            }
            throw new java.lang.IllegalStateException("At least one authentication method must be specified");
        }

        public final com.google.android.gms.auth.api.credentials.HintRequest.Builder setAccountTypes(java.lang.String... strArr) {
            if (strArr == null) {
                strArr = new java.lang.String[0];
            }
            this.zzcv = strArr;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.HintRequest.Builder setEmailAddressIdentifierSupported(boolean z17) {
            this.zzdd = z17;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.HintRequest.Builder setHintPickerConfig(com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig) {
            this.zzdc = (com.google.android.gms.auth.api.credentials.CredentialPickerConfig) com.google.android.gms.common.internal.Preconditions.checkNotNull(credentialPickerConfig);
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.HintRequest.Builder setIdTokenNonce(java.lang.String str) {
            this.zzda = str;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.HintRequest.Builder setIdTokenRequested(boolean z17) {
            this.zzcy = z17;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.HintRequest.Builder setPhoneNumberIdentifierSupported(boolean z17) {
            this.zzde = z17;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.HintRequest.Builder setServerClientId(java.lang.String str) {
            this.zzcz = str;
            return this;
        }
    }

    public HintRequest(int i17, com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig, boolean z17, boolean z18, java.lang.String[] strArr, boolean z19, java.lang.String str, java.lang.String str2) {
        this.zzy = i17;
        this.zzdc = (com.google.android.gms.auth.api.credentials.CredentialPickerConfig) com.google.android.gms.common.internal.Preconditions.checkNotNull(credentialPickerConfig);
        this.zzdd = z17;
        this.zzde = z18;
        this.zzcv = (java.lang.String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        if (i17 < 2) {
            this.zzcy = true;
            this.zzcz = null;
            this.zzda = null;
        } else {
            this.zzcy = z19;
            this.zzcz = str;
            this.zzda = str2;
        }
    }

    public final java.lang.String[] getAccountTypes() {
        return this.zzcv;
    }

    public final com.google.android.gms.auth.api.credentials.CredentialPickerConfig getHintPickerConfig() {
        return this.zzdc;
    }

    public final java.lang.String getIdTokenNonce() {
        return this.zzda;
    }

    public final java.lang.String getServerClientId() {
        return this.zzcz;
    }

    public final boolean isEmailAddressIdentifierSupported() {
        return this.zzdd;
    }

    public final boolean isIdTokenRequested() {
        return this.zzcy;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getHintPickerConfig(), i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, isEmailAddressIdentifierSupported());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzde);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 4, getAccountTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zzy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private HintRequest(com.google.android.gms.auth.api.credentials.HintRequest.Builder builder) {
        this(2, builder.zzdc, builder.zzdd, builder.zzde, builder.zzcv, builder.zzcy, builder.zzcz, builder.zzda);
    }
}
