package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes8.dex */
public abstract class a {
    public static final boolean a(android.content.Context context) {
        try {
            return ik1.b.a(context, "com.tencent.mobileqq") != null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConstantsWebViewStub", "exception has occurred in isQQSupportShare(), e : %s.", e17.getMessage());
            return false;
        }
    }

    public static final boolean b(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageInfo a17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        try {
            a17 = ik1.b.a(context, "com.tencent.weread");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConstantsWebViewStub", "exception has occurred in isQzoneSupportShare(), e : %s.", e17.getMessage());
        }
        if (a17 != null && android.net.Uri.parse(str).getHost().startsWith(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9))) {
            return a17.versionCode > 2000812;
        }
        return false;
    }
}
