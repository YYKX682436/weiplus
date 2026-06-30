package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class mw {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f131992a = "tencentmap";

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f131993b = "/mapsdk_vector/";

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f131994c = null;

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.String f131995d = null;

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f131996e = "resourceVersion.dat";

    private static java.io.InputStream a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return b(context, str + str2);
    }

    public static final java.io.InputStream b(android.content.Context context, java.lang.String str) {
        android.content.res.AssetManager assets;
        if (context == null || (assets = context.getAssets()) == null) {
            return null;
        }
        try {
            return assets.open(str);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("asset", e17.getMessage(), e17);
            return null;
        }
    }

    public static void c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv mvVar, java.lang.String str) {
        java.lang.String str2;
        java.io.File file = new java.io.File(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130890b);
        java.lang.String a17 = mvVar.a("indoormap_style_md5");
        java.lang.String str3 = null;
        if (!android.text.TextUtils.isEmpty(a17)) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131739g, "校验文件:indoor_style.dat");
            try {
                str2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lh.a(file);
            } catch (java.io.FileNotFoundException unused) {
                str2 = null;
            }
            if (!android.text.TextUtils.equals(str2, a17)) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131739g, "文件md5校验失败:" + str2 + "," + str2);
                file.delete();
                mvVar.a(new java.lang.String[]{"indoormap_style_version", "indoormap_style_md5"});
            }
        }
        java.io.File file2 = new java.io.File(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130891c);
        java.lang.String a18 = mvVar.a("indoormap_style_night_md5");
        if (android.text.TextUtils.isEmpty(a18)) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131739g, "校验文件:indoor_style_night.dat");
        try {
            str3 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lh.a(file2);
        } catch (java.io.FileNotFoundException unused2) {
        }
        if (android.text.TextUtils.equals(str3, a18)) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131739g, "文件md5校验失败:" + str3 + "," + a18);
        file2.delete();
        mvVar.a(new java.lang.String[]{"indoormap_style_night_version", "indoormap_style_night_md5"});
    }

    public static void d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv mvVar, java.lang.String str) {
        java.io.File file = new java.io.File(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130893e);
        java.lang.String a17 = mvVar.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130939y);
        if (android.text.TextUtils.isEmpty(a17)) {
            return;
        }
        try {
            if (android.text.TextUtils.equals(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lh.a(file), a17)) {
                return;
            }
            file.delete();
            mvVar.a(new java.lang.String[]{com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130933s, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130939y});
        } catch (java.io.FileNotFoundException e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c("config error: ", e17);
            mvVar.a(new java.lang.String[]{com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130933s, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130939y});
        }
    }

    public static void a(android.content.Context context, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv mvVar, java.lang.String str, java.lang.String str2) {
        java.io.InputStream inputStream;
        java.io.File file = new java.io.File(str, str2);
        java.io.FileOutputStream fileOutputStream = null;
        try {
            inputStream = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(context, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).b((java.lang.String) null) + str2);
            if (inputStream == null) {
                try {
                    if (f131994c != null) {
                        if (!file.exists() || a(context, mvVar, f131994c, str2, true)) {
                            inputStream = b(context, f131994c + str2);
                        }
                    } else if (f131995d != null && (!file.exists() || a(context, mvVar, f131995d, str2, false))) {
                        inputStream = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.b(f131995d + str2);
                    }
                } catch (java.io.IOException unused) {
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(fileOutputStream);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream);
                    throw th;
                }
            }
            if (inputStream == null) {
                java.lang.String e17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(context, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).e();
                if (!file.exists() || a(context, mvVar, e17, str2, false)) {
                    inputStream = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.b(e17 + str2);
                }
            }
            if (inputStream == null && (!file.exists() || a(context, mvVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131338d, str2, true))) {
                inputStream = a(context, str2);
            }
        } catch (java.io.IOException unused2) {
            inputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            inputStream = null;
        }
        if (inputStream != null) {
            java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
            try {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(inputStream, fileOutputStream2);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(fileOutputStream2);
            } catch (java.io.IOException unused3) {
                fileOutputStream = fileOutputStream2;
            } catch (java.lang.Throwable th8) {
                fileOutputStream = fileOutputStream2;
                th = th8;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(fileOutputStream);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream);
                throw th;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(fileOutputStream);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream);
    }

    public static boolean b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv mvVar, java.lang.String str) {
        java.io.File file = new java.io.File(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130889a);
        java.lang.String a17 = mvVar.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130934t);
        if (!file.exists() && android.text.TextUtils.isEmpty(a17)) {
            return true;
        }
        try {
            if (android.text.TextUtils.equals(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lh.a(file), a17)) {
                return true;
            }
            file.delete();
            mvVar.a();
            return false;
        } catch (java.io.FileNotFoundException unused) {
            mvVar.a();
            return false;
        }
    }

    private static void b(java.lang.String str) {
        if (str == null || str.trim().length() == 0) {
            return;
        }
        java.lang.String str2 = java.io.File.separator;
        if (!str.endsWith(str2)) {
            str = str + str2;
        }
        f131995d = str;
    }

    public static java.lang.String b() {
        return f131995d;
    }

    public static void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv mvVar, java.lang.String str) {
        if (b(mvVar, str)) {
            c(mvVar, str);
            d(mvVar, str);
        }
    }

    private static boolean a(android.content.Context context, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv mvVar, java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3;
        java.io.InputStream b17;
        if (mvVar != null && !(mvVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mx)) {
            java.lang.String str4 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130897i;
            java.io.InputStream inputStream = null;
            if (str2.startsWith(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130897i)) {
                str3 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130915a;
            } else {
                str4 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130898j;
                if (str2.startsWith(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130898j)) {
                    str3 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130918d;
                } else {
                    str4 = "poi_icon";
                    if (str2.startsWith("poi_icon")) {
                        str3 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130917c;
                    } else {
                        str3 = null;
                        str4 = null;
                    }
                }
            }
            if (str4 == null) {
                return false;
            }
            int b18 = mvVar.b(str3);
            java.lang.String str5 = str + f131996e;
            try {
                if (z17) {
                    b17 = b(context, str5);
                } else {
                    b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.b(str5);
                }
                inputStream = b17;
                if (inputStream == null) {
                    return false;
                }
                byte[] b19 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.b(inputStream);
                if (b19 == null) {
                    return false;
                }
                int optInt = new org.json.JSONObject(new java.lang.String(b19)).optInt(str4, -1);
                if (optInt == -1) {
                    return false;
                }
                if (optInt <= b18) {
                    return false;
                }
                mvVar.a(new java.lang.String[]{str3});
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream);
                return true;
            } catch (java.lang.Exception unused) {
            } finally {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream);
            }
        }
        return false;
    }

    private static void a(java.lang.String str) {
        if (str == null || str.trim().length() == 0) {
            return;
        }
        java.lang.String str2 = java.io.File.separator;
        if (!str.endsWith(str2)) {
            str = str + str2;
        }
        f131994c = str;
    }

    public static java.lang.String a() {
        return f131994c;
    }

    public static void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        java.lang.String m99194x41fcbf89;
        if (c25966x7e4576a7 != null) {
            if (c25966x7e4576a7.m99192x30bcc80f() != null) {
                java.lang.String m99192x30bcc80f = c25966x7e4576a7.m99192x30bcc80f();
                if (m99192x30bcc80f == null || m99192x30bcc80f.trim().length() == 0) {
                    return;
                }
                java.lang.String str = java.io.File.separator;
                if (!m99192x30bcc80f.endsWith(str)) {
                    m99192x30bcc80f = m99192x30bcc80f + str;
                }
                f131994c = m99192x30bcc80f;
                return;
            }
            if (c25966x7e4576a7.m99194x41fcbf89() == null || (m99194x41fcbf89 = c25966x7e4576a7.m99194x41fcbf89()) == null || m99194x41fcbf89.trim().length() == 0) {
                return;
            }
            java.lang.String str2 = java.io.File.separator;
            if (!m99194x41fcbf89.endsWith(str2)) {
                m99194x41fcbf89 = m99194x41fcbf89 + str2;
            }
            f131995d = m99194x41fcbf89;
        }
    }

    public static final java.io.InputStream a(android.content.Context context, java.lang.String str) {
        return b(context, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131338d + str);
    }
}
