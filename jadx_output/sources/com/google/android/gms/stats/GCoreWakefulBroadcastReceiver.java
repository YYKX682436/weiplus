package com.google.android.gms.stats;

/* loaded from: classes12.dex */
public abstract class GCoreWakefulBroadcastReceiver extends androidx.legacy.content.WakefulBroadcastReceiver {
    private static java.lang.String TAG = "GCoreWakefulBroadcastReceiver";

    public static boolean completeWakefulIntent(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        if (context != null) {
            com.google.android.gms.common.stats.WakeLockTracker.getInstance().registerReleaseEvent(context, intent);
        } else {
            java.lang.String valueOf = java.lang.String.valueOf(intent.toUri(0));
            if (valueOf.length() != 0) {
                "context shouldn't be null. intent: ".concat(valueOf);
            }
        }
        return androidx.legacy.content.WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    public static android.content.ComponentName startWakefulService(android.content.Context context, android.content.Intent intent) {
        android.content.ComponentName zza = zza(context, intent);
        if (zza == null) {
            return null;
        }
        com.google.android.gms.common.stats.WakeLockTracker wakeLockTracker = com.google.android.gms.common.stats.WakeLockTracker.getInstance();
        java.lang.String valueOf = java.lang.String.valueOf(zza.flattenToShortString());
        wakeLockTracker.registerAcquireEvent(context, intent, valueOf.length() != 0 ? "wake:".concat(valueOf) : new java.lang.String("wake:"), TAG, null, 1, "com.google.android.gms");
        return zza;
    }

    private static android.content.ComponentName zza(android.content.Context context, android.content.Intent intent) {
        intent.putExtra(com.google.android.gms.common.stats.LoggingConstants.EXTRA_WAKE_LOCK_KEY, com.google.android.gms.common.stats.StatsUtils.getEventKey(context, intent));
        return androidx.legacy.content.WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    public static android.content.ComponentName startWakefulService(android.content.Context context, android.content.Intent intent, java.lang.String str) {
        return startWakefulService(context, intent, str, context.getPackageName());
    }

    public static android.content.ComponentName startWakefulService(android.content.Context context, android.content.Intent intent, java.lang.String str, java.lang.String str2) {
        android.content.ComponentName zza = zza(context, intent);
        if (zza == null) {
            return null;
        }
        com.google.android.gms.common.stats.WakeLockTracker.getInstance().registerAcquireEvent(context, intent, str, TAG, null, 1, str2);
        return zza;
    }
}
