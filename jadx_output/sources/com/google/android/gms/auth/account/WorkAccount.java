package com.google.android.gms.auth.account;

/* loaded from: classes13.dex */
public class WorkAccount {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzu, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> CLIENT_BUILDER;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzu> CLIENT_KEY;

    @java.lang.Deprecated
    public static final com.google.android.gms.auth.account.WorkAccountApi WorkAccountApi;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzu> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.auth.account.zzi zziVar = new com.google.android.gms.auth.account.zzi();
        CLIENT_BUILDER = zziVar;
        API = new com.google.android.gms.common.api.Api<>("WorkAccount.API", zziVar, clientKey);
        WorkAccountApi = new com.google.android.gms.internal.auth.zzk();
    }

    private WorkAccount() {
    }

    public static com.google.android.gms.auth.account.WorkAccountClient getClient(android.app.Activity activity) {
        return new com.google.android.gms.auth.account.WorkAccountClient(activity);
    }

    public static com.google.android.gms.auth.account.WorkAccountClient getClient(android.content.Context context) {
        return new com.google.android.gms.auth.account.WorkAccountClient(context);
    }
}
