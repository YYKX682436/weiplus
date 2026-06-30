package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzjz {
    final java.lang.String name;
    final java.lang.String origin;
    final java.lang.Object value;
    final long zzaqz;
    final java.lang.String zzti;

    public zzjz(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.Object obj) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
        this.zzti = str;
        this.origin = str2;
        this.name = str3;
        this.zzaqz = j17;
        this.value = obj;
    }
}
