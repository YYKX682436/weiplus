package com.google.android.gms.common.stats;

@java.lang.Deprecated
/* loaded from: classes12.dex */
public class WakeLockTracker {
    private static final com.google.android.gms.common.stats.WakeLockTracker zza = new com.google.android.gms.common.stats.WakeLockTracker();

    public static com.google.android.gms.common.stats.WakeLockTracker getInstance() {
        return zza;
    }

    public void registerAcquireEvent(android.content.Context context, android.content.Intent intent, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
    }

    public void registerDeadlineEvent(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.util.List<java.lang.String> list, boolean z17, long j17) {
    }

    public void registerEvent(android.content.Context context, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, java.util.List<java.lang.String> list) {
    }

    public void registerReleaseEvent(android.content.Context context, android.content.Intent intent) {
    }

    public void registerEvent(android.content.Context context, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, java.util.List<java.lang.String> list, long j17) {
    }
}
