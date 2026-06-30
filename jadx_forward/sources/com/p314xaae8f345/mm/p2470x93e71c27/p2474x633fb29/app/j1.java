package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public abstract class j1 {
    public static void a(int i17, java.lang.String str, java.lang.String str2, int i18, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f5 f5Var, int i19) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return;
        }
        int i27 = 2;
        if (i18 == 2) {
            i27 = 1;
        } else if (i18 != 5 && i18 != 27) {
            i27 = 0;
        }
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String str4 = str == null ? "" : str;
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            java.util.Objects.toString(f5Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24194, java.lang.Integer.valueOf(i17), str4, str3, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(f5Var.f270432d), java.lang.Integer.valueOf(i19));
    }

    public static java.lang.String b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUtilities", "buildSourceUrl fail, invalid arguments");
            return null;
        }
        java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), context);
        if (o17 == null || o17.length() == 0) {
            o17 = "zh_CN";
        } else if (o17.equals("en")) {
            o17 = "en_US";
        }
        return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hf_, str, java.lang.Integer.valueOf(o45.wf.f424562g), o17, wo.q.f529313a, str2);
    }

    public static java.lang.String c(android.app.Activity activity) {
        java.lang.String str;
        android.net.Uri referrer;
        android.content.ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            str = callingActivity.getPackageName();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppUtilities", "get calling activity, %s", str);
        } else {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                java.lang.Object a17 = new yo.b(activity, "mReferrer", null).a();
                if (a17 != null) {
                    str = (java.lang.String) a17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppUtilities", "get referrer, %s", str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppUtilities", e17, "get mReferrer error", new java.lang.Object[0]);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (referrer = activity.getReferrer()) == null) {
            return str;
        }
        java.lang.String authority = referrer.getAuthority();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppUtilities", "get referrer, %s", authority);
        return authority;
    }

    public static java.lang.String d(android.content.Context context, java.lang.String str) {
        android.content.pm.Signature[] a17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c.a(context, str, false);
        if (a17 != null && a17.length != 0) {
            return kk.k.g(a17[0].toByteArray());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUtilities", "signs is null");
        return null;
    }

    public static java.lang.String e(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(str.toLowerCase());
        stringBuffer.append("mMHc ItnStR");
        return kk.k.g(stringBuffer.toString().getBytes());
    }

    public static boolean f(android.content.Context context, java.lang.String str) {
        return ik1.b.a(context, str) != null;
    }

    public static void g(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.Token.f32835x21d81efb, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.Token.f32838xdd45632f);
        }
    }

    public static void h(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.Token.f32836x72134112, "wechat");
        }
    }

    public static void i(android.os.Bundle bundle, java.lang.String str) {
        if (bundle != null) {
            bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.Token.f32836x72134112, "wechat");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.Token.f32834x7e5e177f, str);
        }
    }
}
