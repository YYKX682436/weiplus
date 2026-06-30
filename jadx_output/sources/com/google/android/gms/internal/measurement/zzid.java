package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzid implements android.app.Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzanw;

    private zzid(com.google.android.gms.internal.measurement.zzhk zzhkVar) {
        this.zzanw = zzhkVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        android.net.Uri data;
        try {
            this.zzanw.zzge().zzit().log("onActivityCreated");
            android.content.Intent intent = activity.getIntent();
            if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                if (bundle == null) {
                    android.os.Bundle zza = this.zzanw.zzgb().zza(data);
                    this.zzanw.zzgb();
                    java.lang.String str = com.google.android.gms.internal.measurement.zzka.zzd(intent) ? "gs" : "auto";
                    if (zza != null) {
                        this.zzanw.logEvent(str, "_cmp", zza);
                    }
                }
                java.lang.String queryParameter = data.getQueryParameter("referrer");
                if (android.text.TextUtils.isEmpty(queryParameter)) {
                    return;
                }
                if (!(queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content")))) {
                    this.zzanw.zzge().zzis().log("Activity created with data 'referrer' param without gclid and at least one utm field");
                    return;
                } else {
                    this.zzanw.zzge().zzis().zzg("Activity created with referrer", queryParameter);
                    if (!android.text.TextUtils.isEmpty(queryParameter)) {
                        this.zzanw.setUserProperty("auto", "_ldl", queryParameter);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            this.zzanw.zzge().zzim().zzg("Throwable caught in onActivityCreated", e17);
        }
        this.zzanw.zzfy().onActivityCreated(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        this.zzanw.zzfy().onActivityDestroyed(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        this.zzanw.zzfy().onActivityPaused(activity);
        com.google.android.gms.internal.measurement.zzjh zzgc = this.zzanw.zzgc();
        zzgc.zzgd().zzc(new com.google.android.gms.internal.measurement.zzjl(zzgc, zzgc.zzbt().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        this.zzanw.zzfy().onActivityResumed(activity);
        com.google.android.gms.internal.measurement.zzjh zzgc = this.zzanw.zzgc();
        zzgc.zzgd().zzc(new com.google.android.gms.internal.measurement.zzjk(zzgc, zzgc.zzbt().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        this.zzanw.zzfy().onActivitySaveInstanceState(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    public /* synthetic */ zzid(com.google.android.gms.internal.measurement.zzhk zzhkVar, com.google.android.gms.internal.measurement.zzhl zzhlVar) {
        this(zzhkVar);
    }
}
