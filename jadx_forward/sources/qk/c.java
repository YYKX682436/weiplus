package qk;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String[] f445580a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f445581b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f445582c;

    public static java.lang.String a() {
        java.lang.String str = f445582c;
        if (str != null) {
            return str;
        }
        try {
            f445582c = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BizEnableWxPicUrl");
        } catch (c01.c unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizImageStrategy", "alvinluo initCdnUrlList fail, AccountNotReady");
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
        java.lang.String str2 = f445582c;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str2 == null ? "" : str2;
    }

    public static java.lang.String b(java.lang.String str, int i17, boolean z17) {
        boolean z18 = false;
        if (z17) {
            if (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4) {
                z18 = true;
            }
        }
        return c(str, z18);
    }

    public static java.lang.String c(java.lang.String str, boolean z17) {
        if (f() && z17) {
            java.lang.String[] strArr = f445580a;
            if (strArr == null || strArr.length == 0) {
                d();
            }
            if (e(str)) {
                android.net.Uri parse = android.net.Uri.parse(str);
                java.lang.String queryParameter = parse.getQueryParameter("wxtype");
                if (queryParameter != null) {
                    java.lang.String lowerCase = queryParameter.toLowerCase();
                    if (!lowerCase.equals("gif")) {
                        if (lowerCase.contains("gif")) {
                        }
                    }
                }
                java.lang.String queryParameter2 = parse.getQueryParameter("tp");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter2) || !queryParameter2.equals("wxpic")) {
                    str = parse.buildUpon().appendQueryParameter("tp", "wxpic").build().toString();
                }
            }
            return str;
        }
        if (m11.n1.g()) {
            java.lang.String[] strArr2 = f445580a;
            if (strArr2 == null || strArr2.length == 0) {
                d();
            }
            if (e(str)) {
                android.net.Uri parse2 = android.net.Uri.parse(str);
                java.lang.String queryParameter3 = parse2.getQueryParameter("wxtype");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter3)) {
                    java.lang.String lowerCase2 = queryParameter3.toLowerCase();
                    if (!lowerCase2.equals("gif") && !lowerCase2.contains("gif")) {
                        java.lang.String queryParameter4 = parse2.getQueryParameter("tp");
                        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter4) || !queryParameter4.equals("webp")) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lowerCase2)) {
                            str = parse2.buildUpon().appendQueryParameter("tp", "webp").build().toString();
                        }
                    }
                }
            }
        }
        return str;
        return str;
    }

    public static void d() {
        try {
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BizEnableWxPicUrl");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizImageStrategy", "alvinluo initCdnUrlList, urlList: %s", d17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                return;
            }
            java.lang.String[] split = d17.split(";");
            f445580a = split;
            int length = split.length;
        } catch (c01.c unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizImageStrategy", "alvinluo initCdnUrlList fail, AccountNotReady");
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }

    public static boolean e(java.lang.String str) {
        java.lang.String[] strArr = f445580a;
        if (strArr != null && strArr.length > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            for (java.lang.String str2 : f445580a) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (f445581b == null) {
            f445581b = java.lang.Boolean.TRUE;
        }
        return f445581b.booleanValue();
    }

    public static boolean g(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !e(str)) {
            return false;
        }
        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("tp");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
            if (queryParameter.equals("wxpic")) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !e(str)) {
            return false;
        }
        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("tp");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
            if (queryParameter.equals("webp")) {
                return true;
            }
        }
        return false;
    }
}
