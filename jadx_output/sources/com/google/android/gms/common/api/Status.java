package com.google.android.gms.common.api;

/* loaded from: classes13.dex */
public final class Status extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result, com.google.android.gms.common.internal.ReflectedParcelable {
    private final int zzb;
    private final java.lang.String zzc;
    private final android.app.PendingIntent zzd;
    private final com.google.android.gms.common.ConnectionResult zze;
    public static final com.google.android.gms.common.api.Status RESULT_SUCCESS_CACHE = new com.google.android.gms.common.api.Status(-1);
    public static final com.google.android.gms.common.api.Status RESULT_SUCCESS = new com.google.android.gms.common.api.Status(0);
    public static final com.google.android.gms.common.api.Status RESULT_INTERRUPTED = new com.google.android.gms.common.api.Status(14);
    public static final com.google.android.gms.common.api.Status RESULT_INTERNAL_ERROR = new com.google.android.gms.common.api.Status(8);
    public static final com.google.android.gms.common.api.Status RESULT_TIMEOUT = new com.google.android.gms.common.api.Status(15);
    public static final com.google.android.gms.common.api.Status RESULT_CANCELED = new com.google.android.gms.common.api.Status(16);
    public static final com.google.android.gms.common.api.Status zza = new com.google.android.gms.common.api.Status(17);
    public static final com.google.android.gms.common.api.Status RESULT_DEAD_CLIENT = new com.google.android.gms.common.api.Status(18);
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Status> CREATOR = new com.google.android.gms.common.api.zzb();

    public Status(int i17, java.lang.String str, android.app.PendingIntent pendingIntent, com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zzb = i17;
        this.zzc = str;
        this.zzd = pendingIntent;
        this.zze = connectionResult;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.api.Status)) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) obj;
        return this.zzb == status.zzb && com.google.android.gms.common.internal.Objects.equal(this.zzc, status.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, status.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, status.zze);
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult() {
        return this.zze;
    }

    public android.app.PendingIntent getResolution() {
        return this.zzd;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public int getStatusCode() {
        return this.zzb;
    }

    public java.lang.String getStatusMessage() {
        return this.zzc;
    }

    public boolean hasResolution() {
        return this.zzd != null;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze);
    }

    public boolean isCanceled() {
        return this.zzb == 16;
    }

    public boolean isInterrupted() {
        return this.zzb == 14;
    }

    public boolean isSuccess() {
        return this.zzb <= 0;
    }

    public void startResolutionForResult(android.app.Activity activity, int i17) {
        if (hasResolution()) {
            android.app.PendingIntent pendingIntent = this.zzd;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i17, null, 0, 0, 0);
        }
    }

    public java.lang.String toString() {
        com.google.android.gms.common.internal.Objects.ToStringHelper stringHelper = com.google.android.gms.common.internal.Objects.toStringHelper(this);
        stringHelper.add("statusCode", zza());
        stringHelper.add(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_RESOLUTION, this.zzd);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getStatusCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getStatusMessage(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzd, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getConnectionResult(), i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String zza() {
        java.lang.String str = this.zzc;
        return str != null ? str : com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(this.zzb);
    }

    public Status(int i17) {
        this(i17, (java.lang.String) null);
    }

    public Status(com.google.android.gms.common.ConnectionResult connectionResult, java.lang.String str) {
        this(connectionResult, str, 17);
    }

    public void startResolutionForResult(androidx.activity.result.c cVar) {
        if (hasResolution()) {
            android.app.PendingIntent pendingIntent = this.zzd;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
            cVar.a(new androidx.activity.result.IntentSenderRequest(pendingIntent.getIntentSender(), null, 0, 0), null);
        }
    }

    public Status(int i17, java.lang.String str) {
        this(i17, str, (android.app.PendingIntent) null);
    }

    @java.lang.Deprecated
    public Status(com.google.android.gms.common.ConnectionResult connectionResult, java.lang.String str, int i17) {
        this(i17, str, connectionResult.getResolution(), connectionResult);
    }

    public Status(int i17, java.lang.String str, android.app.PendingIntent pendingIntent) {
        this(i17, str, pendingIntent, null);
    }
}
