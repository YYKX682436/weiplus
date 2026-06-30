package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
final class zam {
    private final int zaa;
    private final com.google.android.gms.common.ConnectionResult zab;

    public zam(com.google.android.gms.common.ConnectionResult connectionResult, int i17) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionResult);
        this.zab = connectionResult;
        this.zaa = i17;
    }

    public final int zaa() {
        return this.zaa;
    }

    public final com.google.android.gms.common.ConnectionResult zab() {
        return this.zab;
    }
}
