package com.google.android.gms.auth.api;

/* loaded from: classes13.dex */
public final class Auth {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.Auth.AuthCredentialsOptions> CREDENTIALS_API;
    public static final com.google.android.gms.auth.api.credentials.CredentialsApi CredentialsApi;
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.signin.GoogleSignInOptions> GOOGLE_SIGN_IN_API;
    public static final com.google.android.gms.auth.api.signin.GoogleSignInApi GoogleSignInApi;
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.zzh> PROXY_API;
    public static final com.google.android.gms.auth.api.proxy.ProxyApi ProxyApi;
    public static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzax> zzaj;
    public static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.auth.api.signin.internal.zzh> zzak;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzax, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions> zzal;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.auth.api.signin.internal.zzh, com.google.android.gms.auth.api.signin.GoogleSignInOptions> zzam;

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public static class AuthCredentialsOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
        private static final com.google.android.gms.auth.api.Auth.AuthCredentialsOptions zzan = new com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder().zzh();
        private final java.lang.String zzao = null;
        private final com.google.android.gms.auth.api.credentials.PasswordSpecification zzap;
        private final boolean zzaq;

        @java.lang.Deprecated
        /* loaded from: classes13.dex */
        public static class Builder {
            protected com.google.android.gms.auth.api.credentials.PasswordSpecification zzap = com.google.android.gms.auth.api.credentials.PasswordSpecification.zzdg;
            protected java.lang.Boolean zzar = java.lang.Boolean.FALSE;

            public com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder forceEnableSaveDialog() {
                this.zzar = java.lang.Boolean.TRUE;
                return this;
            }

            public com.google.android.gms.auth.api.Auth.AuthCredentialsOptions zzh() {
                return new com.google.android.gms.auth.api.Auth.AuthCredentialsOptions(this);
            }
        }

        public AuthCredentialsOptions(com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder builder) {
            this.zzap = builder.zzap;
            this.zzaq = builder.zzar.booleanValue();
        }

        public final android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("consumer_package", null);
            bundle.putParcelable("password_specification", this.zzap);
            bundle.putBoolean("force_save_dialog", this.zzaq);
            return bundle;
        }

        public final com.google.android.gms.auth.api.credentials.PasswordSpecification zzg() {
            return this.zzap;
        }
    }

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzax> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zzaj = clientKey;
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.auth.api.signin.internal.zzh> clientKey2 = new com.google.android.gms.common.api.Api.ClientKey<>();
        zzak = clientKey2;
        com.google.android.gms.auth.api.zzd zzdVar = new com.google.android.gms.auth.api.zzd();
        zzal = zzdVar;
        com.google.android.gms.auth.api.zze zzeVar = new com.google.android.gms.auth.api.zze();
        zzam = zzeVar;
        PROXY_API = com.google.android.gms.auth.api.zzf.API;
        CREDENTIALS_API = new com.google.android.gms.common.api.Api<>("Auth.CREDENTIALS_API", zzdVar, clientKey);
        GOOGLE_SIGN_IN_API = new com.google.android.gms.common.api.Api<>("Auth.GOOGLE_SIGN_IN_API", zzeVar, clientKey2);
        ProxyApi = new com.google.android.gms.internal.auth.zzbn();
        CredentialsApi = new com.google.android.gms.internal.auth.zzao();
        GoogleSignInApi = new com.google.android.gms.auth.api.signin.internal.zzg();
    }

    private Auth() {
    }
}
