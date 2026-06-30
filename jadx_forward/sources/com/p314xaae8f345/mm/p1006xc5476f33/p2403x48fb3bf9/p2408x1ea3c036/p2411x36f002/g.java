package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002;

/* loaded from: classes.dex */
public abstract class g {
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 a(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().b(str) : (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.e.class);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageWebViewUtil", "get by local id error, local id is null or nil");
        return null;
    }

    public static boolean b() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return gm0.j1.a();
        }
        android.os.Bundle bundle = (android.os.Bundle) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, null, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.f.class);
        if (bundle != null) {
            return bundle.getBoolean("has_set_uin", false);
        }
        return true;
    }

    public static boolean c(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(dm.i4.f66875xa013b0d5, str);
        android.os.Bundle bundle2 = (android.os.Bundle) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.d.class);
        if (bundle2 != null) {
            return bundle2.getBoolean("is_biz_contact", false);
        }
        return false;
    }

    public static boolean d(java.lang.String str) {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (android.webkit.URLUtil.isHttpsUrl(str) || android.webkit.URLUtil.isHttpUrl(str));
    }

    public static org.json.JSONObject e(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            return new org.json.JSONObject(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageWebViewUtil", e17.getMessage());
            return null;
        }
    }

    public static void f(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        } else {
            runnable.run();
        }
    }
}
