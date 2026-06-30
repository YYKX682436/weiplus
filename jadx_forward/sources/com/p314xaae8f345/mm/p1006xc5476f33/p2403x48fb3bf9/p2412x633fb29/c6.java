package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes.dex */
public abstract class c6 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f264361a = new java.util.HashMap();

    public static void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewSharedUrlCache", "rawurl:[%s], shareUrl:[%s]", str, str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewSharedUrlCache", "rawurl is null or share url is null");
            return;
        }
        java.util.Map map = f264361a;
        if (((java.util.HashMap) map).containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewSharedUrlCache", "has add this rawurl");
        } else {
            ((java.util.HashMap) map).put(str, str2);
        }
    }

    public static java.lang.String b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewSharedUrlCache", "rawUrl:[%s]", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewSharedUrlCache", "rawUrl is null");
            return null;
        }
        java.util.Map map = f264361a;
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) map).get(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            int indexOf = str.indexOf("#");
            str2 = (java.lang.String) ((java.util.HashMap) map).get(indexOf < 0 ? str : str.substring(0, indexOf));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            if (str.startsWith("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/")) {
                str2 = (java.lang.String) ((java.util.HashMap) map).get(str.replaceFirst("https://", "http://"));
            }
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? str : str2;
    }
}
