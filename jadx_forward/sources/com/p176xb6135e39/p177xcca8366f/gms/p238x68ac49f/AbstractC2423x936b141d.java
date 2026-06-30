package com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f;

/* renamed from: com.google.android.gms.stats.GCoreWakefulBroadcastReceiver */
/* loaded from: classes12.dex */
public abstract class AbstractC2423x936b141d extends p012xc85e97e9.p090xbe0af3c9.p091x38b73479.AbstractC1111x43921d97 {
    private static java.lang.String TAG = "GCoreWakefulBroadcastReceiver";

    /* renamed from: completeWakefulIntent */
    public static boolean m19524xb060689c(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        if (context != null) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1985xdd5fb329.m18502x9cf0d20b().m18507x68aced16(context, intent);
        } else {
            java.lang.String valueOf = java.lang.String.valueOf(intent.toUri(0));
            if (valueOf.length() != 0) {
                "context shouldn't be null. intent: ".concat(valueOf);
            }
        }
        return p012xc85e97e9.p090xbe0af3c9.p091x38b73479.AbstractC1111x43921d97.m7784xb060689c(intent);
    }

    /* renamed from: startWakefulService */
    public static android.content.ComponentName m19525xce72c1e(android.content.Context context, android.content.Intent intent) {
        android.content.ComponentName zza = zza(context, intent);
        if (zza == null) {
            return null;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1985xdd5fb329 m18502x9cf0d20b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1985xdd5fb329.m18502x9cf0d20b();
        java.lang.String valueOf = java.lang.String.valueOf(zza.flattenToShortString());
        m18502x9cf0d20b.m18503xcff0dda7(context, intent, valueOf.length() != 0 ? "wake:".concat(valueOf) : new java.lang.String("wake:"), TAG, null, 1, "com.google.android.gms");
        return zza;
    }

    private static android.content.ComponentName zza(android.content.Context context, android.content.Intent intent) {
        intent.putExtra(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1981x8e5984d0.f5993x7ae68b57, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1983x80984372.getEventKey(context, intent));
        return p012xc85e97e9.p090xbe0af3c9.p091x38b73479.AbstractC1111x43921d97.m7785xce72c1e(context, intent);
    }

    /* renamed from: startWakefulService */
    public static android.content.ComponentName m19526xce72c1e(android.content.Context context, android.content.Intent intent, java.lang.String str) {
        return m19527xce72c1e(context, intent, str, context.getPackageName());
    }

    /* renamed from: startWakefulService */
    public static android.content.ComponentName m19527xce72c1e(android.content.Context context, android.content.Intent intent, java.lang.String str, java.lang.String str2) {
        android.content.ComponentName zza = zza(context, intent);
        if (zza == null) {
            return null;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1985xdd5fb329.m18502x9cf0d20b().m18503xcff0dda7(context, intent, str, TAG, null, 1, str2);
        return zza;
    }
}
