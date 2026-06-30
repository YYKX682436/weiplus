package com.google.android.gms.common.api.internal;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public final class GoogleServices {
    private static final java.lang.Object zza = new java.lang.Object();
    private static com.google.android.gms.common.api.internal.GoogleServices zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.common.api.Status zzd;
    private final boolean zze;
    private final boolean zzf;

    public GoogleServices(java.lang.String str, boolean z17) {
        this.zzc = str;
        this.zzd = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        this.zze = z17;
        this.zzf = !z17;
    }

    private static com.google.android.gms.common.api.internal.GoogleServices checkInitialized(java.lang.String str) {
        com.google.android.gms.common.api.internal.GoogleServices googleServices;
        synchronized (zza) {
            googleServices = zzb;
            if (googleServices == null) {
                throw new java.lang.IllegalStateException("Initialize must be called before " + str + ".");
            }
        }
        return googleServices;
    }

    public static void clearInstanceForTest() {
        synchronized (zza) {
            zzb = null;
        }
    }

    public static java.lang.String getGoogleAppId() {
        return checkInitialized("getGoogleAppId").zzc;
    }

    public static com.google.android.gms.common.api.Status initialize(android.content.Context context) {
        com.google.android.gms.common.api.Status status;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null.");
        synchronized (zza) {
            if (zzb == null) {
                zzb = new com.google.android.gms.common.api.internal.GoogleServices(context);
            }
            status = zzb.zzd;
        }
        return status;
    }

    public static boolean isMeasurementEnabled() {
        com.google.android.gms.common.api.internal.GoogleServices checkInitialized = checkInitialized("isMeasurementEnabled");
        return checkInitialized.zzd.isSuccess() && checkInitialized.zze;
    }

    public static boolean isMeasurementExplicitlyDisabled() {
        return checkInitialized("isMeasurementExplicitlyDisabled").zzf;
    }

    public com.google.android.gms.common.api.Status checkGoogleAppId(java.lang.String str) {
        java.lang.String str2 = this.zzc;
        if (str2 == null || str2.equals(str)) {
            return com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
        return new com.google.android.gms.common.api.Status(10, "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '" + this.zzc + "'.");
    }

    public GoogleServices(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z17 = integer == 0;
            r2 = integer != 0;
            this.zzf = z17;
        } else {
            this.zzf = false;
        }
        this.zze = r2;
        java.lang.String zzb2 = com.google.android.gms.common.internal.zzah.zzb(context);
        zzb2 = zzb2 == null ? new com.google.android.gms.common.internal.StringResourceValueReader(context).getString("google_app_id") : zzb2;
        if (android.text.TextUtils.isEmpty(zzb2)) {
            this.zzd = new com.google.android.gms.common.api.Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzc = null;
        } else {
            this.zzc = zzb2;
            this.zzd = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static com.google.android.gms.common.api.Status initialize(android.content.Context context, java.lang.String str, boolean z17) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "App ID must be nonempty.");
        synchronized (zza) {
            com.google.android.gms.common.api.internal.GoogleServices googleServices = zzb;
            if (googleServices != null) {
                return googleServices.checkGoogleAppId(str);
            }
            com.google.android.gms.common.api.internal.GoogleServices googleServices2 = new com.google.android.gms.common.api.internal.GoogleServices(str, z17);
            zzb = googleServices2;
            return googleServices2.zzd;
        }
    }
}
