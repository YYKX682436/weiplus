package com.google.android.gms.stats;

/* loaded from: classes13.dex */
final class zza implements com.google.android.gms.stats.WakeLock.Configuration {
    @Override // com.google.android.gms.stats.WakeLock.Configuration
    public final long getMaximumTimeout(java.lang.String str, java.lang.String str2) {
        return com.tencent.wcdb.core.Database.DictDefaultMatchValue;
    }

    @Override // com.google.android.gms.stats.WakeLock.Configuration
    public final boolean isWorkChainsEnabled() {
        return false;
    }
}
