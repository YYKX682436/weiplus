package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
final class zai implements com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.OnConnectionFailedListener zaa;

    public zai(com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        this.zaa = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zaa.onConnectionFailed(connectionResult);
    }
}
