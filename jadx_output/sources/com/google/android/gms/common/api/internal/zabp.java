package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zabp implements com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabq zaa;

    public zabp(com.google.android.gms.common.api.internal.zabq zabqVar) {
        this.zaa = zabqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void onSignOutComplete() {
        android.os.Handler handler;
        handler = this.zaa.zaa.zar;
        handler.post(new com.google.android.gms.common.api.internal.zabo(this));
    }
}
