package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002;

/* renamed from: com.google.android.gms.common.util.ClientLibraryUtils */
/* loaded from: classes13.dex */
public class C1990x36406441 {
    private C1990x36406441() {
    }

    /* renamed from: getClientVersion */
    public static int m18532xeb61b2d7(android.content.Context context, java.lang.String str) {
        android.content.pm.ApplicationInfo applicationInfo;
        android.os.Bundle bundle;
        android.content.pm.PackageInfo m18533xffec0de = m18533xffec0de(context, str);
        if (m18533xffec0de == null || (applicationInfo = m18533xffec0de.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    /* renamed from: getPackageInfo */
    public static android.content.pm.PackageInfo m18533xffec0de(android.content.Context context, java.lang.String str) {
        try {
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(context).m18639xffec0de(str, 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: isPackageSide */
    public static boolean m18534xe2218f33() {
        return false;
    }
}
