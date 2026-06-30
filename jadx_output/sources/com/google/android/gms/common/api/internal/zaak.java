package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zaak implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zaa;

    public zaak(com.google.android.gms.common.api.internal.zaaw zaawVar) {
        this.zaa = zaawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight;
        android.content.Context context;
        com.google.android.gms.common.api.internal.zaaw zaawVar = this.zaa;
        googleApiAvailabilityLight = zaawVar.zad;
        context = zaawVar.zac;
        googleApiAvailabilityLight.cancelAvailabilityErrorNotifications(context);
    }
}
