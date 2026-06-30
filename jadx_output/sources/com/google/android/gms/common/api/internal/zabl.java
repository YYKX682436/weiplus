package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
final class zabl implements com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaa;

    public zabl(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager) {
        this.zaa = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z17) {
        android.os.Handler handler;
        android.os.Handler handler2;
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
        handler = googleApiManager.zar;
        handler2 = googleApiManager.zar;
        handler.sendMessage(handler2.obtainMessage(1, java.lang.Boolean.valueOf(z17)));
    }
}
