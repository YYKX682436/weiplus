package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public final class zzaw {
    public static android.app.PendingIntent zzd(android.content.Context context, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authCredentialsOptions, com.google.android.gms.auth.api.credentials.HintRequest hintRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "context must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(hintRequest, "request must not be null");
        com.google.android.gms.auth.api.credentials.PasswordSpecification zzg = (authCredentialsOptions == null || authCredentialsOptions.zzg() == null) ? com.google.android.gms.auth.api.credentials.PasswordSpecification.zzdg : authCredentialsOptions.zzg();
        android.content.Intent putExtra = new android.content.Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("com.google.android.gms.credentials.hintRequestVersion", 2).putExtra("com.google.android.gms.credentials.RequestType", "Hints").putExtra("com.google.android.gms.credentials.ClaimedCallingPackage", (java.lang.String) null);
        com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(zzg, putExtra, "com.google.android.gms.credentials.PasswordSpecification");
        com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(hintRequest, putExtra, "com.google.android.gms.credentials.HintRequest");
        return android.app.PendingIntent.getActivity(context, 2000, putExtra, 134217728);
    }
}
