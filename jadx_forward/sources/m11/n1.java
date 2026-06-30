package m11;

/* loaded from: classes4.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String[] f404296a;

    public static java.lang.String a(int i17) {
        return java.lang.String.format("System=android-%d,ClientVersion=%d,NetworkType=%d,Scene=%d", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c()), 1);
    }

    public static java.lang.String b(int i17) {
        return java.lang.String.format("System=android-%d,ClientVersion=%d,NetworkType=%d,Scene=%d", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c()), 2);
    }

    public static int c() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
            return 1;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(context)) {
            return 5;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context)) {
            return 4;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(context)) {
            return 3;
        }
        return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(context) ? 2 : 0;
    }

    public static java.lang.String d(java.lang.String str) {
        android.net.Uri parse;
        if (!g()) {
            return str;
        }
        java.lang.String[] strArr = f404296a;
        if (strArr == null || strArr.length == 0) {
            e();
        }
        if (f(str)) {
            try {
                parse = android.net.Uri.parse(str);
                java.lang.String queryParameter = parse.getQueryParameter("wxtype");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
                    return str;
                }
                java.lang.String lowerCase = queryParameter.toLowerCase();
                if (!lowerCase.equals("gif") && !lowerCase.contains("gif")) {
                    java.lang.String queryParameter2 = parse.getQueryParameter("tp");
                    if ((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter2) && queryParameter2.equals("webp")) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lowerCase)) {
                        return str;
                    }
                }
                return str;
            } catch (java.lang.Exception unused) {
                return str;
            }
        }
        return parse.buildUpon().appendQueryParameter("tp", "webp").build().toString();
    }

    public static void e() {
        try {
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BizEnableWebpUrl");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebpUtil", "initCdnUrlList, urllist: %s", d17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                return;
            }
            java.lang.String[] split = d17.split(";");
            f404296a = split;
            int length = split.length;
        } catch (c01.c unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebpUtil", "initCdnUrlList fail, AccountNotReady");
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }

    public static boolean f(java.lang.String str) {
        java.lang.String[] strArr = f404296a;
        if (strArr != null && strArr.length > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            for (java.lang.String str2 : f404296a) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean g() {
        if (f404296a == null) {
            e();
        }
        java.lang.String[] strArr = f404296a;
        return strArr != null && strArr.length > 0 && wo.v1.f529366m.F == 1;
    }

    public static boolean h(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !f(str)) {
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
