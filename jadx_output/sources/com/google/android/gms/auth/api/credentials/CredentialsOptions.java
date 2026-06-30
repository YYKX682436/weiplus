package com.google.android.gms.auth.api.credentials;

/* loaded from: classes13.dex */
public final class CredentialsOptions extends com.google.android.gms.auth.api.Auth.AuthCredentialsOptions {
    public static final com.google.android.gms.auth.api.credentials.CredentialsOptions DEFAULT = (com.google.android.gms.auth.api.credentials.CredentialsOptions) new com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder().zzh();

    /* loaded from: classes13.dex */
    public static final class Builder extends com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder {
        @Override // com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder
        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public final com.google.android.gms.auth.api.credentials.CredentialsOptions zzh() {
            return new com.google.android.gms.auth.api.credentials.CredentialsOptions(this);
        }

        @Override // com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder
        public final com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder forceEnableSaveDialog() {
            this.zzar = java.lang.Boolean.TRUE;
            return this;
        }
    }

    private CredentialsOptions(com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder builder) {
        super(builder);
    }
}
