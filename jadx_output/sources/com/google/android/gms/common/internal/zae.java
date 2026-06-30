package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
final class zae extends com.google.android.gms.common.internal.zag {
    final /* synthetic */ android.content.Intent zaa;
    final /* synthetic */ androidx.fragment.app.Fragment zab;
    final /* synthetic */ int zac;

    public zae(android.content.Intent intent, androidx.fragment.app.Fragment fragment, int i17) {
        this.zaa = intent;
        this.zab = fragment;
        this.zac = i17;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        android.content.Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, this.zac);
        }
    }
}
