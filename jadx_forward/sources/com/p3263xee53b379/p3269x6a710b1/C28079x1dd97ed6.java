package com.p3263xee53b379.p3269x6a710b1;

/* renamed from: com.unionpay.utils.UPUtils */
/* loaded from: classes13.dex */
public class C28079x1dd97ed6 {
    public static java.lang.String a(int i17, java.lang.String str) {
        try {
            return d(m122341x2511816b(i17, str));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.String b(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        if (context == null) {
            return null;
        }
        try {
            str2 = new java.lang.String(qy5.d.a(0, qy5.a.b("0000000023456789abcdef12123456786789abcd".substring(0, 32)), qy5.a.b(context.getSharedPreferences("UnionPayPluginEx.pref", 0).getString(str, ""))), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6).trim();
        } catch (java.lang.Throwable unused) {
            str2 = "";
        }
        return (str2 != null && str2.endsWith("00000000")) ? str2.substring(0, str2.length() - 8) : "";
    }

    public static java.lang.String c(java.lang.String str) {
        try {
            byte[] bytes = str.getBytes();
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(bytes);
            return qy5.a.a(messageDigest.digest());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.String d(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return new java.lang.String(bArr, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public static void e(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (context != null) {
            try {
                str3 = qy5.a.a(qy5.d.a(1, qy5.a.b("0000000023456789abcdef12123456786789abcd".substring(0, 32)), (str + "00000000").getBytes(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6)));
            } catch (java.lang.Throwable unused) {
                str3 = "";
            }
            java.lang.String str4 = str3 != null ? str3 : "";
            android.content.SharedPreferences.Editor edit = context.getSharedPreferences("UnionPayPluginEx.pref", 0).edit();
            edit.putString(str2, str4);
            edit.commit();
        }
    }

    public static java.lang.String f(int i17, java.lang.String str) {
        try {
            return d(m122345xb45fa55d(i17, str));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* renamed from: forCallingAppUrl */
    public static native synchronized byte[] m122340xd1d4e729(int i17, boolean z17);

    /* renamed from: forConfig */
    public static native synchronized byte[] m122341x2511816b(int i17, java.lang.String str);

    /* renamed from: forDirectAppsUrl */
    public static native synchronized byte[] m122342x38f3fb2b(int i17, boolean z17);

    /* renamed from: forScanUrl */
    public static native synchronized byte[] m122343xb65460a9(int i17, boolean z17);

    /* renamed from: forUrl */
    public static native synchronized byte[] m122344xb45f9fe6(int i17, boolean z17);

    /* renamed from: forWap */
    public static native synchronized byte[] m122345xb45fa55d(int i17, java.lang.String str);

    /* renamed from: getIssuer */
    public static native synchronized java.lang.String m122346x1ece95af(int i17);

    /* renamed from: getSubject */
    public static native synchronized java.lang.String m122347xce7790f6(int i17);

    /* renamed from: getTalkingDataIdForAssist */
    public static native synchronized java.lang.String m122348xc998c40d(int i17);
}
