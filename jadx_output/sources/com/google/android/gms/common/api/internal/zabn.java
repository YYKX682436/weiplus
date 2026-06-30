package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zabn implements java.lang.Runnable {
    final /* synthetic */ int zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zabq zab;

    public zabn(com.google.android.gms.common.api.internal.zabq zabqVar, int i17) {
        this.zab = zabqVar;
        this.zaa = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zaI(this.zaa);
    }
}
