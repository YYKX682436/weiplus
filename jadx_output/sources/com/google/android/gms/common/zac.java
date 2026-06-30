package com.google.android.gms.common;

/* loaded from: classes13.dex */
final class zac implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ android.app.Activity zaa;
    final /* synthetic */ int zab;
    final /* synthetic */ androidx.activity.result.c zac;
    final /* synthetic */ com.google.android.gms.common.GoogleApiAvailability zad;

    public zac(com.google.android.gms.common.GoogleApiAvailability googleApiAvailability, android.app.Activity activity, int i17, androidx.activity.result.c cVar) {
        this.zad = googleApiAvailability;
        this.zaa = activity;
        this.zab = i17;
        this.zac = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        android.app.PendingIntent errorResolutionPendingIntent = this.zad.getErrorResolutionPendingIntent(this.zaa, this.zab, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        this.zac.a(new androidx.activity.result.IntentSenderRequest(errorResolutionPendingIntent.getIntentSender(), null, 0, 0), null);
    }
}
