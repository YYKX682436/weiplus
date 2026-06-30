package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.PackageManagerUtils */
/* loaded from: classes13.dex */
public class C29325x92acec4a {

    /* renamed from: BROWSER_INTENT */
    public static final android.content.Intent f73353x2d86f7b3 = new android.content.Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(android.net.Uri.fromParts("http", "", null));
    private static final java.lang.String TAG = "PackageManagerUtils";

    /* renamed from: canResolveActivity */
    public static boolean m152544x6b9bcb2b(android.content.Intent intent, int i17) {
        return !m152549x51e88891(intent, i17).isEmpty();
    }

    /* renamed from: getQueryInstalledHomeLaunchersIntent */
    public static android.content.Intent m152545x8d924c8() {
        return new android.content.Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME");
    }

    /* renamed from: handleExpectedExceptionsOrRethrow */
    private static void m152546xa81d66c(java.lang.RuntimeException runtimeException, android.content.Intent intent) {
        if (!(runtimeException instanceof java.lang.NullPointerException) && !(runtimeException.getCause() instanceof android.os.TransactionTooLargeException)) {
            throw runtimeException;
        }
        org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Could not resolve Activity for intent " + intent.toString(), (java.lang.Throwable) runtimeException);
    }

    /* renamed from: queryAllLaunchersInfo */
    public static java.util.List<android.content.pm.ResolveInfo> m152547xa1300ce8() {
        return m152549x51e88891(m152545x8d924c8(), 131072);
    }

    /* renamed from: queryAllWebBrowsersInfo */
    public static java.util.List<android.content.pm.ResolveInfo> m152548x10b59214() {
        return m152549x51e88891(f73353x2d86f7b3, 983040);
    }

    /* renamed from: queryIntentActivities */
    public static java.util.List<android.content.pm.ResolveInfo> m152549x51e88891(android.content.Intent intent, int i17) {
        try {
            org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152645xccdf4b7 = org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3.m152645xccdf4b7();
            try {
                java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getPackageManager().queryIntentActivities(intent, i17);
                if (m152645xccdf4b7 != null) {
                    m152645xccdf4b7.close();
                }
                return queryIntentActivities;
            } finally {
            }
        } catch (java.lang.RuntimeException e17) {
            m152546xa81d66c(e17, intent);
            return java.util.Collections.emptyList();
        }
    }

    /* renamed from: resolveActivity */
    public static android.content.pm.ResolveInfo m152550x25942d1b(android.content.Intent intent, int i17) {
        try {
            org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152646x9633ec9a = org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3.m152646x9633ec9a();
            try {
                android.content.pm.ResolveInfo resolveActivity = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getPackageManager().resolveActivity(intent, i17);
                if (m152646x9633ec9a != null) {
                    m152646x9633ec9a.close();
                }
                return resolveActivity;
            } finally {
            }
        } catch (java.lang.RuntimeException e17) {
            m152546xa81d66c(e17, intent);
            return null;
        }
    }

    /* renamed from: resolveDefaultWebBrowserActivity */
    public static android.content.pm.ResolveInfo m152551x3b94b7f8() {
        return m152550x25942d1b(f73353x2d86f7b3, 65536);
    }

    /* renamed from: canResolveActivity */
    public static boolean m152543x6b9bcb2b(android.content.Intent intent) {
        return m152544x6b9bcb2b(intent, 0);
    }
}
