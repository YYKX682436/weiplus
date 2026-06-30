package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzid */
/* loaded from: classes16.dex */
public final class C2291x394c5b implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: zzanw */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 f6877x6f022aa;

    private C2291x394c5b(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 c2272x394c43) {
        this.f6877x6f022aa = c2272x394c43;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        android.net.Uri data;
        try {
            this.f6877x6f022aa.mo18976x394c1e().m19115x394c6b().log("onActivityCreated");
            android.content.Intent intent = activity.getIntent();
            if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                if (bundle == null) {
                    android.os.Bundle zza = this.f6877x6f022aa.mo18973x394c1b().zza(data);
                    this.f6877x6f022aa.mo18973x394c1b();
                    java.lang.String str = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzd(intent) ? "gs" : "auto";
                    if (zza != null) {
                        this.f6877x6f022aa.m19195x769949b6(str, "_cmp", zza);
                    }
                }
                java.lang.String queryParameter = data.getQueryParameter("referrer");
                if (android.text.TextUtils.isEmpty(queryParameter)) {
                    return;
                }
                if (!(queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content")))) {
                    this.f6877x6f022aa.mo18976x394c1e().m19114x394c6a().log("Activity created with data 'referrer' param without gclid and at least one utm field");
                    return;
                } else {
                    this.f6877x6f022aa.mo18976x394c1e().m19114x394c6a().zzg("Activity created with referrer", queryParameter);
                    if (!android.text.TextUtils.isEmpty(queryParameter)) {
                        this.f6877x6f022aa.m19204x2e43c042("auto", "_ldl", queryParameter);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            this.f6877x6f022aa.mo18976x394c1e().m19108x394c64().zzg("Throwable caught in onActivityCreated", e17);
        }
        this.f6877x6f022aa.mo18970x394c13().m19216x78cb4fa(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        this.f6877x6f022aa.mo18970x394c13().m19217xa9f48fab(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        this.f6877x6f022aa.mo18970x394c13().m19218x99a658dc(activity);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2321x394c7e mo18974x394c1c = this.f6877x6f022aa.mo18974x394c1c();
        mo18974x394c1c.mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2325x394c82(mo18974x394c1c, mo18974x394c1c.mo18962x394b92().mo18537x79952707()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        this.f6877x6f022aa.mo18970x394c13().m19219xba973e9(activity);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2321x394c7e mo18974x394c1c = this.f6877x6f022aa.mo18974x394c1c();
        mo18974x394c1c.mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2324x394c81(mo18974x394c1c, mo18974x394c1c.mo18962x394b92().mo18537x79952707()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        this.f6877x6f022aa.mo18970x394c13().m19220x634d9e11(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    public /* synthetic */ C2291x394c5b(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 c2272x394c43, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2273x394c44 runnableC2273x394c44) {
        this(c2272x394c43);
    }
}
