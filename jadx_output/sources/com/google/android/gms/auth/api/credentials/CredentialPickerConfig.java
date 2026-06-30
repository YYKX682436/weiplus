package com.google.android.gms.auth.api.credentials;

/* loaded from: classes13.dex */
public final class CredentialPickerConfig extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.CredentialPickerConfig> CREATOR = new com.google.android.gms.auth.api.credentials.zzf();
    private final boolean mShowCancelButton;
    private final boolean zzcq;

    @java.lang.Deprecated
    private final boolean zzcr;
    private final int zzcs;
    private final int zzy;

    /* loaded from: classes13.dex */
    public static class Builder {
        private boolean zzcq = false;
        private boolean mShowCancelButton = true;
        private int zzct = 1;

        public com.google.android.gms.auth.api.credentials.CredentialPickerConfig build() {
            return new com.google.android.gms.auth.api.credentials.CredentialPickerConfig(this);
        }

        @java.lang.Deprecated
        public com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder setForNewAccount(boolean z17) {
            this.zzct = z17 ? 3 : 1;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder setPrompt(int i17) {
            this.zzct = i17;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder setShowAddAccountButton(boolean z17) {
            this.zzcq = z17;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder setShowCancelButton(boolean z17) {
            this.mShowCancelButton = z17;
            return this;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Prompt {
        public static final int CONTINUE = 1;
        public static final int SIGN_IN = 2;
        public static final int SIGN_UP = 3;
    }

    public CredentialPickerConfig(int i17, boolean z17, boolean z18, boolean z19, int i18) {
        this.zzy = i17;
        this.zzcq = z17;
        this.mShowCancelButton = z18;
        if (i17 < 2) {
            this.zzcr = z19;
            this.zzcs = z19 ? 3 : 1;
        } else {
            this.zzcr = i18 == 3;
            this.zzcs = i18;
        }
    }

    @java.lang.Deprecated
    public final boolean isForNewAccount() {
        return this.zzcs == 3;
    }

    public final boolean shouldShowAddAccountButton() {
        return this.zzcq;
    }

    public final boolean shouldShowCancelButton() {
        return this.mShowCancelButton;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, shouldShowAddAccountButton());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, shouldShowCancelButton());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, isForNewAccount());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzcs);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zzy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private CredentialPickerConfig(com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder builder) {
        this(2, builder.zzcq, builder.mShowCancelButton, false, builder.zzct);
    }
}
