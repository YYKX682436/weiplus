package com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d;

/* renamed from: com.tencent.tmassistantsdk.downloadservice.DownloadHelper */
/* loaded from: classes13.dex */
public class C26666xd71a0a76 {

    /* renamed from: PHONE */
    public static final int f56076x489454e = 1;

    /* renamed from: SAVE_FATOR */
    public static final float f56077xa6f8895a = 1.5f;

    /* renamed from: SAVE_LENGTH */
    public static final long f56078x428b3be8 = 104857600;

    /* renamed from: SDCARD */
    public static final int f56079x917fece1 = 2;
    public static final java.lang.String TAG = "DownloadHelper";

    /* renamed from: UNKNOWN */
    public static final int f56080x19d1382a = 0;

    /* renamed from: correctFileName */
    public static java.lang.String m104880x901cc8b1(java.lang.String str) {
        return str.replace("?", "_").replace("*", "_").replace(" ", "_").replace("$", "_").replace("&", "_").replace("@", "_").replace("#", "_").replace("<", "_").replace(">", "_").replace("|", "_").replace(":", "_").replace("/", "_").replace("\\", "_").replace("\"", "_");
    }

    /* renamed from: correctURL */
    public static java.lang.String m104881x44e1d0a5(java.lang.String str) {
        java.lang.String trim = str.replace("\r", "").replace("\n", "").trim();
        java.lang.String str2 = new java.lang.String(trim);
        try {
            android.net.Uri parse = android.net.Uri.parse(trim);
            java.lang.String lastPathSegment = parse.getLastPathSegment();
            return (lastPathSegment == null || lastPathSegment.length() <= 0) ? str2 : str2.replace(lastPathSegment, java.net.URLEncoder.encode(parse.getLastPathSegment()).replace("+", "%20"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return str2;
        }
    }

    /* renamed from: decodeFileName */
    public static java.lang.String m104882xa0e0ee35(java.lang.String str) {
        if (str != null) {
            return java.net.URLDecoder.decode(str);
        }
        return null;
    }

    /* renamed from: genAPKFileName */
    public static java.lang.String m104883xb5542af3(java.lang.String str) {
        if (!str.contains(".apk")) {
            return null;
        }
        java.lang.String trim = str.trim().substring(str.lastIndexOf("/") + 1).trim();
        if (trim.contains("?")) {
            trim = trim.substring(0, trim.lastIndexOf("?"));
        }
        if (android.text.TextUtils.isEmpty(trim)) {
            return null;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "file name = " + trim);
        return m104893x1f73e245(trim);
    }

    /* renamed from: generateFileNameFromURL */
    public static java.lang.String m104884x7e916b09(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String m105482x427490c = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105482x427490c(str);
        if (android.text.TextUtils.isEmpty(m105482x427490c)) {
            m105482x427490c = java.lang.Integer.toString(java.lang.Math.abs(str.hashCode()));
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            if (str2.equals("application/vnd.android.package-archive")) {
                str3 = ".apk";
            } else if (str2.equals("application/tm.android.apkdiff")) {
                str3 = ".diff";
            } else if (str2.equals("resource/tm.android.unknown")) {
                str3 = ".other";
            }
            return m105482x427490c + str3;
        }
        str3 = "";
        return m105482x427490c + str3;
    }

    /* renamed from: getNetStatus */
    public static synchronized java.lang.String m104885x3d316d39() {
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.class) {
            android.content.Context m105492x76847179 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105492x76847179();
            if (m105492x76847179 == null) {
                return "";
            }
            try {
                if (m105492x76847179.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                    return "";
                }
                android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    return "";
                }
                if (activeNetworkInfo.getType() == 1) {
                    return "wifi";
                }
                java.lang.String extraInfo = activeNetworkInfo.getExtraInfo();
                if (extraInfo == null) {
                    return "";
                }
                java.lang.String lowerCase = extraInfo.toLowerCase();
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.v(TAG, "netInfo  =  " + lowerCase);
                return lowerCase;
            } catch (java.lang.Exception unused) {
                return "";
            }
        }
    }

    /* renamed from: getStorePosition */
    public static int m104886x66054174(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str == null || !str.startsWith("/data")) {
            return com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81.m105407x1bdbea3a() ? 2 : 0;
        }
        return 1;
    }

    /* renamed from: getWakeLock */
    public static android.os.PowerManager.WakeLock m104887x8d0c9665() {
        return null;
    }

    /* renamed from: isDownloadFileExisted */
    public static boolean m104889x3f8ad588(java.lang.String str, java.lang.String str2) {
        try {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81.m105405x31429ad4(m104884x7e916b09(str, str2)));
            java.lang.String str3 = a17.f294812f;
            if (str3 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a()) {
                return m17.f294799a.F(m17.f294800b);
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: isNetworkConncted */
    public static boolean m104890xc0ad1bc0() {
        if (com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105492x76847179() == null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.w(TAG, "GlobalUtil.getInstance().getContext() == null.");
            return false;
        }
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isAvailable();
        }
        return false;
    }

    /* renamed from: isSpaceEnough */
    public static boolean m104891x23aae68c(java.lang.String str, long j17) {
        int m104886x66054174 = m104886x66054174(str);
        long j18 = 0;
        if (m104886x66054174 == 1) {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            long blockSize = statFs.getBlockSize() * (statFs.getAvailableBlocks() - 4);
            if (blockSize >= 0) {
                j18 = blockSize;
            }
        } else if (m104886x66054174 != 2) {
            j18 = -1;
        } else if ("mounted".equals(android.os.Environment.getExternalStorageState())) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(android.os.Environment.getExternalStorageDirectory().getPath());
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            android.os.StatFs statFs2 = new android.os.StatFs(a17.m82499x9616526c());
            long blockSize2 = statFs2.getBlockSize() * (statFs2.getAvailableBlocks() - 4);
            if (blockSize2 >= 0) {
                j18 = blockSize2;
            }
        }
        long j19 = ((float) j17) * 1.5f;
        return j19 > f56078x428b3be8 ? j18 >= j19 : j18 >= f56078x428b3be8;
    }

    /* renamed from: isValidURL */
    public static boolean m104892x7c008f1d(java.lang.String str) {
        try {
            new java.net.URI(m104881x44e1d0a5(str));
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "", new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: renameAPKFileName */
    public static java.lang.String m104893x1f73e245(java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.vfs.z2 m17;
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf <= 0 || lastIndexOf == str.length() - 1) {
            return str;
        }
        java.lang.String[] strArr = {str.substring(0, lastIndexOf), str.substring(lastIndexOf, str.length())};
        int i17 = 0;
        do {
            if (i17 == 0) {
                str2 = str;
            } else {
                str2 = strArr[0] + "(" + i17 + ")" + strArr[1];
            }
            i17++;
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81.m105406xffba5073() + "/" + str2);
            java.lang.String str3 = a17.f294812f;
            if (str3 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        } while (!m17.a() ? false : m17.f294799a.F(m17.f294800b));
        return str2;
    }

    /* renamed from: isDownloadFileExisted */
    public static boolean m104888x3f8ad588(java.lang.String str) {
        if (str == null) {
            return false;
        }
        try {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81.m105405x31429ad4(str));
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a()) {
                return m17.f294799a.F(m17.f294800b);
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return false;
        }
    }
}
