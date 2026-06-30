package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzhj extends com.google.android.gms.internal.measurement.zzjw {
    final android.content.Context zzqx;

    public zzhj(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        android.content.Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(applicationContext);
        this.zzqx = applicationContext;
    }
}
