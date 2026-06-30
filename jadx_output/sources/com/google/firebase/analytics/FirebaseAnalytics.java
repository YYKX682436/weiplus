package com.google.firebase.analytics;

/* loaded from: classes16.dex */
public final class FirebaseAnalytics {
    private final com.google.android.gms.internal.measurement.zzgl zzacw;

    public FirebaseAnalytics(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzglVar);
        this.zzacw = zzglVar;
    }

    public static com.google.firebase.analytics.FirebaseAnalytics getInstance(android.content.Context context) {
        return com.google.android.gms.internal.measurement.zzgl.zzg(context).zzjs();
    }

    public final com.google.android.gms.tasks.Task<java.lang.String> getAppInstanceId() {
        return this.zzacw.zzfu().getAppInstanceId();
    }

    public final void logEvent(java.lang.String str, android.os.Bundle bundle) {
        this.zzacw.zzjr().logEvent(str, bundle);
    }

    public final void resetAnalyticsData() {
        this.zzacw.zzfu().resetAnalyticsData();
    }

    public final void setAnalyticsCollectionEnabled(boolean z17) {
        this.zzacw.zzjr().setMeasurementEnabled(z17);
    }

    public final void setCurrentScreen(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        this.zzacw.zzfy().setCurrentScreen(activity, str, str2);
    }

    public final void setMinimumSessionDuration(long j17) {
        this.zzacw.zzjr().setMinimumSessionDuration(j17);
    }

    public final void setSessionTimeoutDuration(long j17) {
        this.zzacw.zzjr().setSessionTimeoutDuration(j17);
    }

    public final void setUserId(java.lang.String str) {
        this.zzacw.zzjr().setUserPropertyInternal("app", "_id", str);
    }

    public final void setUserProperty(java.lang.String str, java.lang.String str2) {
        this.zzacw.zzjr().setUserProperty(str, str2);
    }
}
