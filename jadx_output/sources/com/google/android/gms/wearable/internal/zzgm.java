package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
class zzgm<T> extends com.google.android.gms.wearable.internal.zza {
    private com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<T> zzet;

    public zzgm(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<T> resultHolder) {
        this.zzet = resultHolder;
    }

    public final void zza(T t17) {
        com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<T> resultHolder = this.zzet;
        if (resultHolder != null) {
            resultHolder.setResult(t17);
            this.zzet = null;
        }
    }
}
