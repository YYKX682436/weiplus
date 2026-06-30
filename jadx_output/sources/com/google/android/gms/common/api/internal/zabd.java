package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zabd extends com.google.android.gms.common.api.internal.zabw {
    private final java.lang.ref.WeakReference zaa;

    public zabd(com.google.android.gms.common.api.internal.zabe zabeVar) {
        this.zaa = new java.lang.ref.WeakReference(zabeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        com.google.android.gms.common.api.internal.zabe zabeVar = (com.google.android.gms.common.api.internal.zabe) this.zaa.get();
        if (zabeVar == null) {
            return;
        }
        com.google.android.gms.common.api.internal.zabe.zai(zabeVar);
    }
}
