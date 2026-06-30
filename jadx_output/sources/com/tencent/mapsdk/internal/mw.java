package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class mw {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f50459a = "tencentmap";

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f50460b = "/mapsdk_vector/";

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f50461c = null;

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.String f50462d = null;

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f50463e = "resourceVersion.dat";

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
            com.tencent.mapsdk.core.utils.log.LogUtil.b("asset", e17.getMessage(), e17);
            return null;
        }
    }

    public static void c(com.tencent.mapsdk.internal.mv mvVar, java.lang.String str) {
        java.lang.String str2;
        java.io.File file = new java.io.File(str, com.tencent.mapsdk.internal.ep.f49357b);
        java.lang.String a17 = mvVar.a("indoormap_style_md5");
        java.lang.String str3 = null;
        if (!android.text.TextUtils.isEmpty(a17)) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "校验文件:indoor_style.dat");
            try {
                str2 = com.tencent.mapsdk.internal.lh.a(file);
            } catch (java.io.FileNotFoundException unused) {
                str2 = null;
            }
            if (!android.text.TextUtils.equals(str2, a17)) {
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "文件md5校验失败:" + str2 + "," + str2);
                file.delete();
                mvVar.a(new java.lang.String[]{"indoormap_style_version", "indoormap_style_md5"});
            }
        }
        java.io.File file2 = new java.io.File(str, com.tencent.mapsdk.internal.ep.f49358c);
        java.lang.String a18 = mvVar.a("indoormap_style_night_md5");
        if (android.text.TextUtils.isEmpty(a18)) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "校验文件:indoor_style_night.dat");
        try {
            str3 = com.tencent.mapsdk.internal.lh.a(file2);
        } catch (java.io.FileNotFoundException unused2) {
        }
        if (android.text.TextUtils.equals(str3, a18)) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "文件md5校验失败:" + str3 + "," + a18);
        file2.delete();
        mvVar.a(new java.lang.String[]{"indoormap_style_night_version", "indoormap_style_night_md5"});
    }

    public static void d(com.tencent.mapsdk.internal.mv mvVar, java.lang.String str) {
        java.io.File file = new java.io.File(str, com.tencent.mapsdk.internal.ep.f49360e);
        java.lang.String a17 = mvVar.a(com.tencent.mapsdk.internal.er.f49406y);
        if (android.text.TextUtils.isEmpty(a17)) {
            return;
        }
        try {
            if (android.text.TextUtils.equals(com.tencent.mapsdk.internal.lh.a(file), a17)) {
                return;
            }
            file.delete();
            mvVar.a(new java.lang.String[]{com.tencent.mapsdk.internal.er.f49400s, com.tencent.mapsdk.internal.er.f49406y});
        } catch (java.io.FileNotFoundException e17) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c("config error: ", e17);
            mvVar.a(new java.lang.String[]{com.tencent.mapsdk.internal.er.f49400s, com.tencent.mapsdk.internal.er.f49406y});
        }
    }

    public static void a(android.content.Context context, com.tencent.mapsdk.internal.mv mvVar, java.lang.String str, java.lang.String str2) {
        java.io.InputStream inputStream;
        java.io.File file = new java.io.File(str, str2);
        java.io.FileOutputStream fileOutputStream = null;
        try {
            inputStream = com.tencent.mapsdk.internal.kt.b(com.tencent.mapsdk.internal.mz.a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).b((java.lang.String) null) + str2);
            if (inputStream == null) {
                try {
                    if (f50461c != null) {
                        if (!file.exists() || a(context, mvVar, f50461c, str2, true)) {
                            inputStream = b(context, f50461c + str2);
                        }
                    } else if (f50462d != null && (!file.exists() || a(context, mvVar, f50462d, str2, false))) {
                        inputStream = com.tencent.mapsdk.internal.kt.b(f50462d + str2);
                    }
                } catch (java.io.IOException unused) {
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.tencent.mapsdk.internal.kt.a(fileOutputStream);
                    com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream);
                    throw th;
                }
            }
            if (inputStream == null) {
                java.lang.String e17 = com.tencent.mapsdk.internal.mz.a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).e();
                if (!file.exists() || a(context, mvVar, e17, str2, false)) {
                    inputStream = com.tencent.mapsdk.internal.kt.b(e17 + str2);
                }
            }
            if (inputStream == null && (!file.exists() || a(context, mvVar, com.tencent.mapsdk.internal.hn.f49805d, str2, true))) {
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
                com.tencent.mapsdk.internal.kt.a(inputStream, fileOutputStream2);
                com.tencent.mapsdk.internal.kt.a(fileOutputStream2);
            } catch (java.io.IOException unused3) {
                fileOutputStream = fileOutputStream2;
            } catch (java.lang.Throwable th8) {
                fileOutputStream = fileOutputStream2;
                th = th8;
                com.tencent.mapsdk.internal.kt.a(fileOutputStream);
                com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream);
                throw th;
            }
            com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream);
        }
        com.tencent.mapsdk.internal.kt.a(fileOutputStream);
        com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream);
    }

    public static boolean b(com.tencent.mapsdk.internal.mv mvVar, java.lang.String str) {
        java.io.File file = new java.io.File(str, com.tencent.mapsdk.internal.ep.f49356a);
        java.lang.String a17 = mvVar.a(com.tencent.mapsdk.internal.er.f49401t);
        if (!file.exists() && android.text.TextUtils.isEmpty(a17)) {
            return true;
        }
        try {
            if (android.text.TextUtils.equals(com.tencent.mapsdk.internal.lh.a(file), a17)) {
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
        f50462d = str;
    }

    public static java.lang.String b() {
        return f50462d;
    }

    public static void a(com.tencent.mapsdk.internal.mv mvVar, java.lang.String str) {
        if (b(mvVar, str)) {
            c(mvVar, str);
            d(mvVar, str);
        }
    }

    private static boolean a(android.content.Context context, com.tencent.mapsdk.internal.mv mvVar, java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3;
        java.io.InputStream b17;
        if (mvVar != null && !(mvVar instanceof com.tencent.mapsdk.internal.mx)) {
            java.lang.String str4 = com.tencent.mapsdk.internal.ep.f49364i;
            java.io.InputStream inputStream = null;
            if (str2.startsWith(com.tencent.mapsdk.internal.ep.f49364i)) {
                str3 = com.tencent.mapsdk.internal.er.f49382a;
            } else {
                str4 = com.tencent.mapsdk.internal.ep.f49365j;
                if (str2.startsWith(com.tencent.mapsdk.internal.ep.f49365j)) {
                    str3 = com.tencent.mapsdk.internal.er.f49385d;
                } else {
                    str4 = "poi_icon";
                    if (str2.startsWith("poi_icon")) {
                        str3 = com.tencent.mapsdk.internal.er.f49384c;
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
            java.lang.String str5 = str + f50463e;
            try {
                if (z17) {
                    b17 = b(context, str5);
                } else {
                    b17 = com.tencent.mapsdk.internal.kt.b(str5);
                }
                inputStream = b17;
                if (inputStream == null) {
                    return false;
                }
                byte[] b19 = com.tencent.mapsdk.internal.kt.b(inputStream);
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
                com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream);
                return true;
            } catch (java.lang.Exception unused) {
            } finally {
                com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream);
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
        f50461c = str;
    }

    public static java.lang.String a() {
        return f50461c;
    }

    public static void a(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        java.lang.String customLocalPath;
        if (tencentMapOptions != null) {
            if (tencentMapOptions.getCustomAssetsPath() != null) {
                java.lang.String customAssetsPath = tencentMapOptions.getCustomAssetsPath();
                if (customAssetsPath == null || customAssetsPath.trim().length() == 0) {
                    return;
                }
                java.lang.String str = java.io.File.separator;
                if (!customAssetsPath.endsWith(str)) {
                    customAssetsPath = customAssetsPath + str;
                }
                f50461c = customAssetsPath;
                return;
            }
            if (tencentMapOptions.getCustomLocalPath() == null || (customLocalPath = tencentMapOptions.getCustomLocalPath()) == null || customLocalPath.trim().length() == 0) {
                return;
            }
            java.lang.String str2 = java.io.File.separator;
            if (!customLocalPath.endsWith(str2)) {
                customLocalPath = customLocalPath + str2;
            }
            f50462d = customLocalPath;
        }
    }

    public static final java.io.InputStream a(android.content.Context context, java.lang.String str) {
        return b(context, com.tencent.mapsdk.internal.hn.f49805d + str);
    }
}
