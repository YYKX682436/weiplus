package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
public final class zaae extends com.google.android.gms.common.api.internal.zap {
    private final x.d zad;
    private final com.google.android.gms.common.api.internal.GoogleApiManager zae;

    public zaae(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment, com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.zad = new x.d(0);
        this.zae = googleApiManager;
        this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    public static void zad(android.app.Activity activity, com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, com.google.android.gms.common.api.internal.ApiKey apiKey) {
        com.google.android.gms.common.api.internal.LifecycleFragment fragment = com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(activity);
        com.google.android.gms.common.api.internal.zaae zaaeVar = (com.google.android.gms.common.api.internal.zaae) fragment.getCallbackOrNull("ConnectionlessLifecycleHelper", com.google.android.gms.common.api.internal.zaae.class);
        if (zaaeVar == null) {
            zaaeVar = new com.google.android.gms.common.api.internal.zaae(fragment, googleApiManager, com.google.android.gms.common.GoogleApiAvailability.getInstance());
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(apiKey, "ApiKey cannot be null");
        zaaeVar.zad.add(apiKey);
        googleApiManager.zaA(zaaeVar);
    }

    private final void zae() {
        if (this.zad.isEmpty()) {
            return;
        }
        this.zae.zaA(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        zae();
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        zae();
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        this.zae.zaB(this);
    }

    public final x.d zaa() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zab(com.google.android.gms.common.ConnectionResult connectionResult, int i17) {
        this.zae.zax(connectionResult, i17);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zac() {
        this.zae.zay();
    }
}
