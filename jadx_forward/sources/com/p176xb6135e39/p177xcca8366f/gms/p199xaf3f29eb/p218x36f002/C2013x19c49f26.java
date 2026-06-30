package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002;

/* renamed from: com.google.android.gms.common.util.UidVerifier */
/* loaded from: classes13.dex */
public final class C2013x19c49f26 {
    private C2013x19c49f26() {
    }

    /* renamed from: isGooglePlayServicesUid */
    public static boolean m18622x6510ccbb(android.content.Context context, int i17) {
        if (!m18623x7093a567(context, i17, "com.google.android.gms")) {
            return false;
        }
        try {
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1714x7f70b655.m17688x9cf0d20b(context).m17689x3fdfd09e(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            android.util.Log.isLoggable("UidVerifier", 3);
            return false;
        }
    }

    /* renamed from: uidHasPackageName */
    public static boolean m18623x7093a567(android.content.Context context, int i17, java.lang.String str) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(context).zza(i17, str);
    }
}
