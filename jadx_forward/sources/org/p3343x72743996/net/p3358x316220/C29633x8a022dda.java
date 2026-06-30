package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.UserAgent */
/* loaded from: classes13.dex */
public final class C29633x8a022dda {

    /* renamed from: VERSION_CODE_UNINITIALIZED */
    private static final int f74859xc9c78e90 = 0;

    /* renamed from: sLock */
    private static final java.lang.Object f74860x678c83e = new java.lang.Object();

    /* renamed from: sVersionCode */
    private static int f74861x1420472;

    private C29633x8a022dda() {
    }

    /* renamed from: appendCronetVersion */
    private static void m154266x767e5561(java.lang.StringBuilder sb6) {
        sb6.append(" Cronet/");
        sb6.append(org.p3343x72743996.net.p3358x316220.C29616xa1995678.m154243xf714d6a5());
    }

    /* renamed from: from */
    public static java.lang.String m154267x3017aa(android.content.Context context) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(context.getPackageName());
        sb6.append('/');
        sb6.append(m154269x3b9e36ad(context));
        sb6.append(" (Linux; U; Android ");
        sb6.append(android.os.Build.VERSION.RELEASE);
        sb6.append("; ");
        sb6.append(java.util.Locale.getDefault().toString());
        java.lang.String str = android.os.Build.MODEL;
        if (str.length() > 0) {
            sb6.append("; ");
            sb6.append(str);
        }
        java.lang.String str2 = android.os.Build.ID;
        if (str2.length() > 0) {
            sb6.append("; Build/");
            sb6.append(str2);
        }
        sb6.append(";");
        m154266x767e5561(sb6);
        sb6.append(')');
        return sb6.toString();
    }

    /* renamed from: getQuicUserAgentIdFrom */
    public static java.lang.String m154268xcf5598ab(android.content.Context context) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(context.getPackageName());
        m154266x767e5561(sb6);
        return sb6.toString();
    }

    /* renamed from: versionFromContext */
    private static int m154269x3b9e36ad(android.content.Context context) {
        int i17;
        synchronized (f74860x678c83e) {
            if (f74861x1420472 == 0) {
                try {
                    f74861x1420472 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    throw new java.lang.IllegalStateException("Cannot determine package version");
                }
            }
            i17 = f74861x1420472;
        }
        return i17;
    }
}
