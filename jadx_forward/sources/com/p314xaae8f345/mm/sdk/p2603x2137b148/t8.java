package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public abstract class t8 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f274522a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f274523b = {300, 200, 300, 200};

    /* renamed from: c, reason: collision with root package name */
    public static final java.math.BigInteger f274524c;

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f274525d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f274526e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f274527f;

    /* renamed from: g, reason: collision with root package name */
    public static java.util.HashSet f274528g;

    /* renamed from: h, reason: collision with root package name */
    public static long f274529h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f274530i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String[] f274531j;

    static {
        java.util.TimeZone.getTimeZone("GMT");
        f274524c = java.math.BigInteger.ONE.shiftLeft(64);
        f274525d = new char[]{'<', '>', '\"', '\'', '&', '\r', '\n', ' ', '\t'};
        f274526e = new java.lang.String[]{"&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "&#x0D;", "&#x0A;", "&#x20;", "&#x09;"};
        f274527f = new java.util.HashSet();
        f274529h = 0L;
        f274530i = new java.lang.String[]{p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3218xa477fc15, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3216xb7785126, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3219x716e5549, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3217xb32bb9da, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3176xf4cbf8c9, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3172xb3aee2a0, "CameraOwnerName", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3252x58f9a604, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3248x2de8f93};
        f274531j = new java.lang.String[]{p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3208x127d696c, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3209x59bf3f20};
    }

    public static java.lang.String A(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        return str.length() <= 16 ? kk.k.g(str.getBytes()) : kk.k.g(str.substring(0, 16).getBytes());
    }

    public static boolean A0(java.lang.String str) {
        if (K0(str)) {
            return false;
        }
        return java.util.regex.Pattern.compile("[\\u4e00-\\u9fa5]+").matcher(str).find();
    }

    public static double A1(java.lang.String str) {
        try {
            return java.lang.Double.parseDouble(str);
        } catch (java.lang.Exception unused) {
            if (str != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "parseDouble error ".concat(str));
            }
            return 0.0d;
        }
    }

    public static long B() {
        try {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "getDataAvailableSize exception:%s", e17.getMessage());
            return 0L;
        }
    }

    public static boolean B0(long j17, long j18) {
        return j17 == j18;
    }

    public static float B1(java.lang.String str) {
        try {
            return java.lang.Float.parseFloat(str);
        } catch (java.lang.Exception unused) {
            if (str != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "parseFloat error ".concat(str));
            }
            return 0.0f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String C(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "_data"
            java.lang.String[] r4 = new java.lang.String[]{r1}
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r7 = 0
            r3 = r9
            r5 = r10
            r6 = r11
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            if (r8 == 0) goto L51
            boolean r10 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            if (r10 == 0) goto L51
            int r10 = r8.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            r11 = -1
            if (r10 != r11) goto L33
            java.lang.String r10 = "MicroMsg.Util"
            java.lang.String r11 = "getDataColumn : columnIdx is -1, column with columnName = _data does not exist"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r10, r11)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            r8.close()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            r8.close()
            return r0
        L33:
            java.lang.String r10 = r8.getString(r10)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            java.lang.String r11 = "media"
            java.lang.String r0 = r9.getAuthority()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            boolean r11 = r11.equals(r0)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            if (r11 == 0) goto L48
            com.tencent.mm.sdk.platformtools.m8 r11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m8.f274397a     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            r11.a(r9, r10)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
        L48:
            r8.close()
            return r10
        L4c:
            r9 = move-exception
            r0 = r8
            goto L78
        L4f:
            r0 = r8
            goto L59
        L51:
            if (r8 == 0) goto L56
            r8.close()
        L56:
            return r0
        L57:
            r9 = move-exception
            goto L78
        L59:
            java.lang.String r8 = r9.getPath()     // Catch: java.lang.Throwable -> L57
            r9 = 24
            boolean r9 = fp.h.c(r9)     // Catch: java.lang.Throwable -> L76
            if (r9 == 0) goto L70
            java.lang.String r9 = "external_files"
            java.lang.String r10 = ""
            java.lang.String r8 = r8.replace(r9, r10)     // Catch: java.lang.Throwable -> L76
            goto L70
        L6e:
            r9 = r8
            goto L78
        L70:
            if (r0 == 0) goto L75
            r0.close()
        L75:
            return r8
        L76:
            r8 = move-exception
            goto L6e
        L78:
            if (r0 == 0) goto L7d
            r0.close()
        L7d:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static boolean C0(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int C1(java.lang.String str) {
        return D1(str, 0);
    }

    public static long D(android.content.Context context) {
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem / 1073741824;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "getDeviceTotalMem error");
            return 0L;
        }
    }

    public static boolean D0(java.lang.String str, java.lang.String str2) {
        if (K0(str) && K0(str2)) {
            return true;
        }
        if (K0(str) && !K0(str2)) {
            return false;
        }
        if (K0(str) || !K0(str2)) {
            return str.equals(str2);
        }
        return false;
    }

    public static int D1(java.lang.String str, int i17) {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.Exception e17) {
            if (f274522a || str == null) {
                return i17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "parserInt error ".concat(str));
            if (java.lang.Math.random() >= 0.01d) {
                return i17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "parserInt error", new java.lang.Object[0]);
            return i17;
        }
    }

    public static final java.lang.String E(java.lang.String str) {
        if (K0(str)) {
            return null;
        }
        return android.net.Uri.parse(str).getHost();
    }

    public static boolean E0(java.lang.String str) {
        if (K0(str)) {
            return true;
        }
        try {
            return S0(new java.io.File(com.p314xaae8f345.mm.vfs.w6.i(str, false)).getCanonicalPath());
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "[-] Fail to resolve canonical path of %s", str);
            return false;
        } catch (java.lang.NullPointerException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e18, "[-] Fail to resolve canonical path of %s", str);
            return false;
        }
    }

    public static long E1(java.lang.String str) {
        return F1(str, 0L);
    }

    public static double F(java.lang.String str, double d17) {
        if (str == null) {
            return d17;
        }
        try {
            return java.lang.Double.parseDouble(str);
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            return d17;
        }
    }

    public static boolean F0(java.lang.String str) {
        if (f274528g == null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            f274528g = hashSet;
            hashSet.add("h264");
            f274528g.add("h26l");
            f274528g.add("264");
            f274528g.add("avc");
            f274528g.add("mov");
            f274528g.add("mp4");
            f274528g.add("m4a");
            f274528g.add("3gp");
            f274528g.add("3g2");
            f274528g.add("mj2");
            f274528g.add("m4v");
            f274528g.add("mkv");
            f274528g.add("swf");
            f274528g.add("vob");
            f274528g.add("mpg");
            f274528g.add("rmvb");
        }
        return f274528g.contains(str);
    }

    public static long F1(java.lang.String str, long j17) {
        try {
            return java.lang.Long.parseLong(str);
        } catch (java.lang.Exception e17) {
            if (f274522a || str == null) {
                return j17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "parseLong error ".concat(str));
            if (java.lang.Math.random() >= 0.01d) {
                return j17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "parseLong error", new java.lang.Object[0]);
            return j17;
        }
    }

    public static java.lang.String G(java.lang.String str) {
        if (K0(str)) {
            return null;
        }
        try {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "e", null);
            if (d17 != null && !d17.isEmpty() && d17.containsKey(".e.Content")) {
                return (java.lang.String) d17.get(".e.Content");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "getErrMsgContent", new java.lang.Object[0]);
        }
        return null;
    }

    public static boolean G0(java.lang.String str) {
        if (K0(str)) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (lowerCase.equals("webp")) {
            return true;
        }
        if (!lowerCase.equals("heic") || android.os.Build.VERSION.SDK_INT < 28) {
            return lowerCase.equals("jpg") || lowerCase.equals("gif") || lowerCase.equals("bmp") || lowerCase.equals("jpeg") || lowerCase.equals("png");
        }
        return true;
    }

    public static java.lang.String G1(java.lang.String str) {
        if (K0(str)) {
            return "";
        }
        int length = str.length();
        if (length < 4) {
            return "*~" + length;
        }
        if (length < 8) {
            return str.substring(0, 1) + "*" + str.substring(length - 2, length - 1) + "~" + length;
        }
        return str.substring(0, 2) + "*" + str.substring(length - 3, length - 1) + "~" + length;
    }

    public static java.lang.String H(java.lang.Throwable th6, boolean z17) {
        if (z17) {
            while (th6.getCause() != null) {
                try {
                    th6 = th6.getCause();
                } catch (java.lang.Throwable unused) {
                    return null;
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(81);
        java.util.ArrayList arrayList = new java.util.ArrayList(64);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.s8.a(new com.p314xaae8f345.mm.sdk.p2603x2137b148.s8(null), th6, new com.p314xaae8f345.mm.sdk.p2603x2137b148.p8(sb6, arrayList));
        if (arrayList.size() > 50) {
            int size = arrayList.size() - 50;
            sb6.append("\t... omit ");
            sb6.append(size);
            sb6.append(" lines\n");
            while (size < arrayList.size()) {
                sb6.append((java.lang.String) arrayList.get(size));
                sb6.append('\n');
                size++;
            }
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb6.append((java.lang.String) it.next());
                sb6.append('\n');
            }
        }
        java.lang.String sb7 = sb6.toString();
        if (sb7 == null) {
            return null;
        }
        char[] charArray = sb7.toCharArray();
        int i17 = 0;
        boolean z18 = false;
        while (i17 < charArray.length) {
            if (charArray[i17] > 127) {
                charArray[i17] = '?';
                z18 = true;
            }
            i17++;
        }
        if (z18) {
            sb7 = new java.lang.String(charArray, 0, i17);
        }
        return sb7;
    }

    public static boolean H0(java.lang.String str) {
        int lastIndexOf;
        if (K0(str) || (lastIndexOf = str.lastIndexOf(".")) == -1) {
            return false;
        }
        return G0(str.substring(lastIndexOf + 1));
    }

    public static long H1(long j17) {
        return (java.lang.System.currentTimeMillis() / 1000) - j17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static int I(java.lang.String str) {
        java.lang.String i17;
        try {
            if (!com.p314xaae8f345.mm.vfs.w6.j(str) || com.p314xaae8f345.mm.vfs.w6.k(str) <= 0 || (i17 = com.p314xaae8f345.mm.vfs.w6.i(str, true)) == null) {
                return 0;
            }
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(i17);
            boolean m7356xc00a8522 = c1098xe10e35e9.m7356xc00a8522(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3172xb3aee2a0);
            ?? r57 = m7356xc00a8522;
            if (c1098xe10e35e9.m7356xc00a8522(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3174x9a13bc90)) {
                r57 = (m7356xc00a8522 ? 1 : 0) | 2;
            }
            return c1098xe10e35e9.m7356xc00a8522(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3173x3cbed13e) ? r57 | 4 : r57;
        } catch (java.io.IOException unused) {
        }
        return 0;
    }

    public static boolean I0(android.content.Context context, android.content.Intent intent, boolean z17, boolean z18) {
        if (z17 && w0(context)) {
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Util", "isIntentAvailable return true by force");
            }
            return true;
        }
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        boolean z19 = queryIntentActivities != null && queryIntentActivities.size() > 0;
        if (z18) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(z19);
            objArr[1] = java.lang.Integer.valueOf(queryIntentActivities != null ? queryIntentActivities.size() : -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Util", "isIntentAvailable res:%s listSize:%s", objArr);
        }
        return z19;
    }

    public static boolean I1(android.content.Context context, android.content.ComponentName componentName, int i17, int i18) {
        try {
            context.getPackageManager().setComponentEnabledSetting(componentName, i17, i18);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "setComponentEnabledSetting fail", new java.lang.Object[0]);
            return false;
        }
    }

    public static java.lang.String J(android.content.Context context, android.net.Uri uri) {
        java.lang.String str;
        java.lang.String str2 = null;
        str2 = null;
        str2 = null;
        str2 = null;
        android.net.Uri uri2 = null;
        str2 = null;
        if (context == null || uri == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "getFilePath : context is null or uri is null");
        } else {
            java.lang.String scheme = uri.getScheme();
            if (K0(scheme)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "input uri error. %s", uri);
            } else if (scheme.equalsIgnoreCase("file")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Util", "getFilePath : scheme is SCHEME_FILE");
                str2 = uri.getPath();
            } else {
                if (scheme.equalsIgnoreCase("content")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Util", "getFilePath : scheme is SCHEME_CONTENT: " + uri.toString());
                    if ("com.google.android.apps.photos.content".equals(uri.getAuthority())) {
                        str2 = uri.getLastPathSegment();
                    } else {
                        try {
                            str = C(context, uri, null, null);
                        } catch (java.lang.SecurityException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "getFilePath failed, exception occurred.", new java.lang.Object[0]);
                            str = null;
                        }
                        if (K0(str)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "getFilePath failed, filePath is empty or null.");
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Util", "getFilePath successfully: %s", str);
                        }
                        if (!K0(str)) {
                            str2 = str;
                        } else if (android.provider.DocumentsContract.isDocumentUri(context, uri)) {
                            if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                                java.lang.String[] split = android.provider.DocumentsContract.getDocumentId(uri).split(":");
                                if ("primary".equalsIgnoreCase(split[0])) {
                                    str2 = android.os.Environment.getExternalStorageDirectory() + "/" + split[1];
                                }
                            } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                                java.lang.String[] split2 = android.provider.DocumentsContract.getDocumentId(uri).split(":");
                                if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463.equals(split2[0])) {
                                    str2 = split2[1];
                                } else {
                                    try {
                                        str2 = C(context, android.content.ContentUris.withAppendedId(android.net.Uri.parse("content://downloads/public_downloads"), java.lang.Long.parseLong(split2[1])), null, null);
                                    } catch (java.lang.Throwable th6) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", th6, "Failure.", new java.lang.Object[0]);
                                    }
                                }
                            } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                                java.lang.String[] split3 = android.provider.DocumentsContract.getDocumentId(uri).split(":");
                                java.lang.String str3 = split3[0];
                                if ("image".equals(str3)) {
                                    uri2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                                } else if ("video".equals(str3)) {
                                    uri2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                } else if ("audio".equals(str3)) {
                                    uri2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                                }
                                str2 = C(context, uri2, "_id=?", new java.lang.String[]{split3[1]});
                            }
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "unknown scheme");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Util", "uri2path: " + uri + " >> " + str2);
        return str2;
    }

    public static boolean J0(java.lang.CharSequence charSequence) {
        return charSequence == null || charSequence.length() <= 0;
    }

    public static java.lang.String J1(java.util.Set set, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it = set.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (i17 == set.size() - 1) {
                sb6.append(str2.trim());
            } else {
                sb6.append(str2.trim());
                sb6.append(str);
            }
            i17++;
        }
        return sb6.toString();
    }

    public static java.lang.String K(java.lang.String str) {
        if (str == null) {
            return null;
        }
        for (int length = str.length(); length > 0; length--) {
            int i17 = length - 1;
            if (str.charAt(i17) != '\n' && str.charAt(i17) != '\r') {
                return str.substring(0, length);
            }
        }
        return str;
    }

    public static boolean K0(java.lang.String str) {
        return str == null || str.length() <= 0;
    }

    public static java.lang.String K1(java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
                messageDigest.update(str.getBytes());
                byte[] digest = messageDigest.digest();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (byte b17 : digest) {
                    java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
                    if (hexString.length() == 1) {
                        sb6.append('0');
                    }
                    sb6.append(hexString);
                }
                return sb6.toString();
            } catch (java.security.NoSuchAlgorithmException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "sha256", new java.lang.Object[0]);
            }
        }
        return "";
    }

    public static float L(java.lang.String str, float f17) {
        if (str == null) {
            return f17;
        }
        try {
            return java.lang.Float.parseFloat(str);
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            return f17;
        }
    }

    public static boolean L0(java.util.List list) {
        return list == null || list.size() == 0;
    }

    public static void L1(android.content.Context context, boolean z17) {
        android.os.Vibrator vibrator = (android.os.Vibrator) context.getSystemService("vibrator");
        if (vibrator == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Util", "shake:vibrator is null!");
        } else if (z17) {
            vibrator.vibrate(f274523b, -1);
        } else {
            vibrator.cancel();
        }
    }

    public static int M(java.lang.String str, int i17) {
        if (str == null) {
            return i17;
        }
        try {
            return (int) (java.lang.Long.decode(str).longValue() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            return i17;
        }
    }

    public static boolean M0(byte[] bArr) {
        return bArr == null || bArr.length <= 0;
    }

    public static java.lang.String M1(java.lang.Throwable th6) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6);
    }

    public static final java.lang.String N(java.lang.String str) {
        if (K0(str)) {
            return "";
        }
        try {
            return new java.net.URL(str).getHost();
        } catch (java.net.MalformedURLException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Util", "get host error");
            return str;
        }
    }

    public static boolean N0(java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (K0(str)) {
                return true;
            }
        }
        return false;
    }

    public static java.lang.String N1(java.io.InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        stringBuffer.append(new java.lang.String(bArr, 0, read));
                    } else {
                        try {
                            break;
                        } catch (java.io.IOException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
                        }
                    }
                }
                inputStream.close();
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e18, "", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception unused) {
            inputStream.close();
        } catch (java.lang.Throwable th6) {
            try {
                inputStream.close();
            } catch (java.io.IOException e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e19, "", new java.lang.Object[0]);
            }
            throw th6;
        }
        return stringBuffer.toString();
    }

    public static int O(java.lang.Object obj, int i17) {
        if (obj == null) {
            return i17;
        }
        try {
            return P(obj.toString(), i17);
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            return i17;
        }
    }

    public static boolean O0(char c17) {
        return c17 >= '0' && c17 <= '9';
    }

    public static java.util.List O1(java.lang.String str, java.lang.String str2) {
        java.lang.String[] split;
        if (!android.text.TextUtils.isEmpty(str) && (split = str.split(str2)) != null) {
            return java.util.Arrays.asList(split);
        }
        return java.util.Collections.EMPTY_LIST;
    }

    public static int P(java.lang.String str, int i17) {
        if (str == null) {
            return i17;
        }
        try {
            return str.length() <= 0 ? i17 : java.lang.Integer.decode(str).intValue();
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            return i17;
        }
    }

    public static boolean P0(android.content.Context context) {
        if (!java.util.Locale.getDefault().getCountry().equalsIgnoreCase("CN")) {
            return true;
        }
        if (java.util.TimeZone.getDefault().getRawOffset() != java.util.TimeZone.getTimeZone("GMT+08:00").getRawOffset()) {
            return true;
        }
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Util", "isOverseasUser context is null");
            return false;
        }
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            java.lang.String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!K0(networkCountryIso) && !networkCountryIso.contains("cn") && !networkCountryIso.contains("CN")) {
                return true;
            }
        }
        return false;
    }

    public static java.util.ArrayList P1(java.lang.String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public static int Q(java.lang.String str, int i17) {
        float L = L(str, 0.0f);
        return L == 0.0f ? i17 : java.lang.Math.round(L);
    }

    public static java.lang.Boolean Q0(java.lang.String str) {
        return java.lang.Boolean.valueOf(java.util.regex.Pattern.compile("^[+][0-9]{10,13}$").matcher(str).matches() || java.util.regex.Pattern.compile("^1[0-9]{10}$").matcher(str).matches());
    }

    public static java.lang.String Q1(java.lang.String str) {
        int lastIndexOf;
        return (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf("@")) == -1) ? str : str.substring(0, lastIndexOf);
    }

    public static int R(int i17, int i18) {
        iz5.a.g(null, i17 > i18);
        return new java.util.Random(java.lang.System.currentTimeMillis()).nextInt((i17 - i18) + 1) + i18;
    }

    public static boolean R0(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
        }
        if (!str.equals(context.getPackageName())) {
            if (!str.startsWith(context.getPackageName() + ":")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Util", "isProcessRunning, use ps command. process = %s", str);
                java.util.Iterator it = ((java.util.ArrayList) Z()).iterator();
                while (it.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it.next();
                    if (str3 != null && str3.contains(str)) {
                        for (java.lang.String str4 : str3.split("\\s+")) {
                            if (str.equals(str4)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Util", "process %s is running", str);
                                return true;
                            }
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Util", "process " + str + " is not running");
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Util", "isProcessRunning, use ActivityManager. process = %s", str);
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo != null && (str2 = runningAppProcessInfo.processName) != null && str2.equals(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Util", "process " + str + " is running");
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Util", "process " + str + " is not running");
        return false;
    }

    public static long R1(long j17) {
        return android.os.SystemClock.elapsedRealtime() - j17;
    }

    public static int S(java.lang.String str) {
        if (str == null) {
            return -1;
        }
        return str.length();
    }

    public static boolean S0(java.lang.String str) {
        java.lang.String packageName = com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a().getPackageName();
        if (str.contains("/" + packageName + "/cache/")) {
            return true;
        }
        java.lang.String str2 = "/" + packageName + "-";
        int indexOf = str.indexOf(str2);
        if (indexOf >= 0 && str.startsWith("/cache/", str.indexOf("/", indexOf + str2.length()))) {
            return true;
        }
        if (!str.contains("/data/data/") && !str.contains("/data/user/")) {
            return true;
        }
        if (!str.contains("/" + packageName + "/")) {
            if (!str.contains("/" + packageName + "-")) {
                return true;
            }
        }
        return false;
    }

    public static java.lang.String S1(long j17) {
        if ((j17 >> 30) > 0) {
            return e0(j17, 10.0d);
        }
        if ((j17 >> 20) > 0) {
            return i0(j17, 10.0d);
        }
        return "" + ((int) (java.lang.Math.round((j17 * 10.0d) / 1024.0d) / 10.0d)) + " KB";
    }

    public static java.lang.String T(float f17) {
        return f17 < 1024.0f ? java.lang.String.format("%.1fB", java.lang.Float.valueOf(f17)) : f17 < 1048576.0f ? java.lang.String.format("%.1fKB", java.lang.Float.valueOf(f17 / 1024.0f)) : f17 < 1.0737418E9f ? java.lang.String.format("%.1fMB", java.lang.Float.valueOf((f17 / 1024.0f) / 1024.0f)) : java.lang.String.format("%.1fGB", java.lang.Float.valueOf(((f17 / 1024.0f) / 1024.0f) / 1024.0f));
    }

    public static boolean T0(long j17, long j18) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(j17);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTimeInMillis(j18);
        return calendar.get(1) == calendar2.get(1) && calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2);
    }

    public static java.lang.String T1(java.lang.String str) {
        if (K0(str)) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.length());
        int length = str.length();
        int i17 = 0;
        while (i17 < length) {
            char charAt = str.charAt(i17);
            if (charAt != '&') {
                sb6.append(charAt);
            } else if (str.startsWith("&amp;", i17)) {
                sb6.append('&');
                i17 += 5;
            } else {
                if (str.startsWith("&apos;", i17)) {
                    sb6.append('\'');
                } else if (str.startsWith("&quot;", i17)) {
                    sb6.append('\"');
                } else {
                    if (str.startsWith("&lt;", i17)) {
                        sb6.append('<');
                    } else if (str.startsWith("&gt;", i17)) {
                        sb6.append('>');
                    } else {
                        sb6.append(charAt);
                    }
                    i17 += 4;
                }
                i17 += 6;
            }
            i17++;
        }
        return sb6.toString();
    }

    public static java.lang.String U(android.content.Context context) {
        if (context == null) {
            return null;
        }
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return (java.lang.String) yj0.a.j(telephonyManager, "com/tencent/mm/sdk/platformtools/Util", "getLine1Number", "(Landroid/content/Context;)Ljava/lang/String;", "android/telephony/TelephonyManager", "getLine1Number", "()Ljava/lang/String;");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "getLine1Number failed, null tm");
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "getLine1Number failed:%s ", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }

    public static boolean U0(android.content.Context context) {
        return m0(context).equalsIgnoreCase(context.getClass().getName());
    }

    public static void U1(java.lang.String str) {
        try {
            if (!com.p314xaae8f345.mm.vfs.w6.j(str) || com.p314xaae8f345.mm.vfs.w6.k(str) <= 0) {
                throw new java.lang.IllegalArgumentException("clearExif error file not exist!");
            }
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, true);
            if (i17 == null) {
                throw new java.lang.IllegalArgumentException("clearExif error null file path");
            }
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(i17);
            if (c1098xe10e35e9.m7356xc00a8522(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3174x9a13bc90)) {
                c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3174x9a13bc90, new java.text.SimpleDateFormat("yyyy:MM:dd HH:mm:ss", java.util.Locale.getDefault()).format(new java.util.Date()));
                c1098xe10e35e9.m7362xaf634eb4();
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "clearExif error", new java.lang.Object[0]);
            throw e17;
        }
    }

    public static long V(java.lang.String str, long j17) {
        if (str == null) {
            return j17;
        }
        try {
            return str.length() <= 0 ? j17 : java.lang.Long.decode(str).longValue();
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            return j17;
        }
    }

    public static boolean V0(android.content.Context context) {
        try {
            return ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningTasks(1).get(0).topActivity.getClassName().contains(context.getPackageName());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public static int V1(long j17) {
        return java.lang.Math.round(((float) j17) / 1000.0f);
    }

    public static java.lang.String W(android.content.Context context, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Util", "getProcessNameByPid, pid = " + i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ProcessCache", "getProcessNameByPidFromCache");
        if (i17 != android.os.Process.myPid()) {
            return X(context, i17);
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.e6.f274189a;
        if (str == null || str.isEmpty()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.e6.f274189a = X(context, i17);
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.e6.f274189a;
    }

    public static boolean W0(android.net.Uri uri) {
        java.lang.String J2;
        if (uri == null) {
            return false;
        }
        if (((java.util.HashSet) f274527f).contains(uri.toString())) {
            return true;
        }
        if (!"file".equalsIgnoreCase(uri.getScheme()) && !"content".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        if (fp.h.c(30)) {
            J2 = uri.getPath();
            if (!new java.io.File(J2).exists()) {
                J2 = J(com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a(), uri);
            }
        } else {
            J2 = J(com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a(), uri);
        }
        return E0(J2);
    }

    public static boolean W1(java.lang.String str, byte[] bArr) {
        if (K0(str) || M0(bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Util", "write to file error, path is null or empty, or data is empty");
            return false;
        }
        java.io.OutputStream outputStream = null;
        try {
            try {
                outputStream = com.p314xaae8f345.mm.vfs.w6.K(str, false);
                outputStream.write(bArr);
                outputStream.flush();
                try {
                    outputStream.close();
                    return true;
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
                    return true;
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e18, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Util", "write to file error");
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.io.IOException e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e19, "", new java.lang.Object[0]);
                    }
                }
                return false;
            }
        } catch (java.lang.Throwable th6) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (java.io.IOException e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e27, "", new java.lang.Object[0]);
                }
            }
            throw th6;
        }
    }

    public static java.lang.String X(android.content.Context context, int i17) {
        java.io.BufferedInputStream bufferedInputStream;
        int read;
        java.lang.String str;
        if (context == null || i17 <= 0) {
            return "";
        }
        try {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == i17 && (str = runningAppProcessInfo.processName) != null && !str.equals("")) {
                    return runningAppProcessInfo.processName;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
        }
        byte[] bArr = new byte[128];
        java.io.BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                try {
                    bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream("/proc/" + i17 + "/cmdline"));
                } catch (java.lang.Exception e18) {
                    e = e18;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            read = bufferedInputStream.read(bArr);
        } catch (java.lang.Exception e19) {
            e = e19;
            bufferedInputStream2 = bufferedInputStream;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e, "", new java.lang.Object[0]);
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            return "";
        } catch (java.lang.Throwable th7) {
            th = th7;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th;
        }
        if (read <= 0) {
            bufferedInputStream.close();
            return "";
        }
        for (int i18 = 0; i18 < read; i18++) {
            byte b17 = bArr[i18];
            if (b17 <= 128 && b17 > 0) {
            }
            read = i18;
            break;
        }
        java.lang.String str2 = new java.lang.String(bArr, 0, read);
        try {
            bufferedInputStream.close();
        } catch (java.lang.Exception unused3) {
        }
        return str2;
    }

    public static boolean X0(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.lang.String trim = str.trim();
        if (trim.length() < 6 || trim.length() > 20) {
            return false;
        }
        char charAt = trim.charAt(0);
        if (!(y0(charAt) || charAt == '-' || charAt == '_')) {
            return false;
        }
        for (int i17 = 0; i17 < trim.length(); i17++) {
            char charAt2 = trim.charAt(i17);
            if (!y0(charAt2) && !O0(charAt2) && charAt2 != '-' && charAt2 != '_') {
                return false;
            }
        }
        return true;
    }

    public static boolean X1(java.io.File file, byte[] bArr) {
        if (file == null || M0(bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Util", "write to file error, file is null, or data is empty");
            return false;
        }
        try {
            java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
            try {
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                return true;
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", th6, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Util", "write to file error");
            return false;
        }
    }

    public static java.lang.String Y(int i17) {
        java.util.Random random = new java.util.Random();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i18 = 0; i18 < i17; i18++) {
            stringBuffer.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(random.nextInt(62)));
        }
        return stringBuffer.toString();
    }

    public static boolean Y0(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.trim().matches("^[a-zA-Z0-9][\\w\\.-]*@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$");
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0085: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:35:0x0085 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List Z() {
        /*
            java.lang.String r0 = "getRunningProcessesByPs finally got ex = %s"
            java.lang.String r1 = "MicroMsg.Util"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.String r5 = "ps"
            java.lang.Process r4 = r4.exec(r5)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.io.LineNumberReader r5 = new java.io.LineNumberReader     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.io.InputStream r7 = r4.getInputStream()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
        L23:
            java.lang.String r3 = r5.readLine()     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L84
            if (r3 == 0) goto L33
            int r6 = r3.length()     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L84
            if (r6 <= 0) goto L23
            r2.add(r3)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L84
            goto L23
        L33:
            r4.waitFor()     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L84
            r4.destroy()     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L84
            r5.close()     // Catch: java.lang.Exception -> L3d
            goto L72
        L3d:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0, r3)
            goto L72
        L4a:
            r3 = move-exception
            goto L51
        L4c:
            r2 = move-exception
            goto L86
        L4e:
            r4 = move-exception
            r5 = r3
            r3 = r4
        L51:
            java.lang.String r4 = "getRunningAppProcessesByPs fail, ex = %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L84
            r7 = 0
            r6[r7] = r3     // Catch: java.lang.Throwable -> L84
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r4, r6)     // Catch: java.lang.Throwable -> L84
            if (r5 == 0) goto L72
            r5.close()     // Catch: java.lang.Exception -> L66
            goto L72
        L66:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0, r3)
        L72:
            int r0 = r2.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = "getRunningAppProcessesByPs, result list size = %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3, r0)
            return r2
        L84:
            r2 = move-exception
            r3 = r5
        L86:
            if (r3 == 0) goto L98
            r3.close()     // Catch: java.lang.Exception -> L8c
            goto L98
        L8c:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0, r3)
        L98:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Z():java.util.List");
    }

    public static boolean Z0(java.lang.String str) {
        if (str == null || str.length() < 8) {
            return false;
        }
        try {
            java.lang.Long.parseLong(str);
            return false;
        } catch (java.lang.NumberFormatException unused) {
            return true;
        }
    }

    public static byte[] a(android.graphics.Bitmap bitmap, boolean z17) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Util", "recycle bitmap:%s", bitmap);
            bitmap.recycle();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
        }
        return byteArray;
    }

    public static int a0(java.lang.String str, int i17) {
        if (K0(str)) {
            return i17;
        }
        try {
            return (int) (new java.text.SimpleDateFormat("yyyy-MM-dd").parse(str).getTime() / 1000);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            return i17;
        }
    }

    public static boolean a1(java.lang.String str) {
        if (str != null && str.length() > 0) {
            try {
                long longValue = java.lang.Long.valueOf(str.trim()).longValue();
                return longValue > 0 && longValue <= io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
            } catch (java.lang.NumberFormatException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            }
        }
        return false;
    }

    public static int b(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.nativeOrder());
        return wrap.getInt();
    }

    public static int b0(android.content.Context context) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Util", "getSelfMemInMB context is null.");
            return -1;
        }
        android.os.Debug.MemoryInfo[] processMemoryInfo = ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getProcessMemoryInfo(new int[]{android.os.Process.myPid()});
        if (processMemoryInfo == null || processMemoryInfo.length <= 0) {
            return 0;
        }
        return processMemoryInfo[0].getTotalPss() / 1024;
    }

    public static boolean b1(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/sdk/platformtools/Util", "jump", "(Landroid/content/Context;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/sdk/platformtools/Util", "jump", "(Landroid/content/Context;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            return true;
        }
    }

    public static void c(java.lang.String str) {
        try {
            if (!com.p314xaae8f345.mm.vfs.w6.j(str) || com.p314xaae8f345.mm.vfs.w6.k(str) <= 0) {
                throw new java.lang.IllegalArgumentException("clearExif error file not exist!");
            }
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, true);
            if (i17 == null) {
                throw new java.lang.IllegalArgumentException("clearExif error null file path");
            }
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(i17);
            boolean z17 = false;
            for (java.lang.String str2 : f274530i) {
                z17 |= c1098xe10e35e9.m7356xc00a8522(str2);
            }
            if (fp.h.c(24)) {
                for (java.lang.String str3 : f274531j) {
                    z17 |= c1098xe10e35e9.m7356xc00a8522(str3);
                }
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Util", "clearExif not contains any attributes");
                return;
            }
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
            c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3218xa477fc15, null);
            c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3216xb7785126, null);
            c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3219x716e5549, null);
            c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3217xb32bb9da, null);
            if (fp.h.c(24)) {
                c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3208x127d696c, null);
                c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3209x59bf3f20, null);
            }
            c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3176xf4cbf8c9, null);
            c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3172xb3aee2a0, null);
            c1098xe10e35e9.m7364x5c88dc5a("CameraOwnerName", null);
            c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3252x58f9a604, null);
            c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3248x2de8f93, null);
            c1098xe10e35e9.m7362xaf634eb4();
            if (java.lang.Math.abs(k17 - com.p314xaae8f345.mm.vfs.w6.k(str)) < k17 * 0.1d) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "error saveAttribute with possibility wrong file length");
            throw new java.lang.IllegalArgumentException("clearExif error saveAttributes");
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "clearExif error", new java.lang.Object[0]);
            throw e17;
        }
    }

    public static java.lang.String c0(java.lang.String str, android.content.Context context) {
        if (context != null && !K0(str)) {
            try {
                return kk.k.g(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    public static java.lang.String c1(java.util.List list, java.lang.String str) {
        if (list == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (i17 == list.size() - 1) {
                sb6.append(((java.lang.String) list.get(i17)).trim());
            } else {
                sb6.append(((java.lang.String) list.get(i17)).trim() + str);
            }
        }
        return sb6.toString();
    }

    public static void d(java.lang.String str) {
        try {
            if (!com.p314xaae8f345.mm.vfs.w6.j(str) || com.p314xaae8f345.mm.vfs.w6.k(str) <= 0) {
                throw new java.lang.IllegalArgumentException("clearExifDateTime error file not exist!");
            }
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, true);
            if (i17 == null) {
                throw new java.lang.IllegalArgumentException("clearExifDateTime error null file path");
            }
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(i17);
            if (c1098xe10e35e9.m7356xc00a8522(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3174x9a13bc90) || c1098xe10e35e9.m7356xc00a8522(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3173x3cbed13e) || c1098xe10e35e9.m7356xc00a8522(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3172xb3aee2a0)) {
                if (c1098xe10e35e9.m7356xc00a8522(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3172xb3aee2a0)) {
                    c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3172xb3aee2a0, null);
                }
                if (c1098xe10e35e9.m7356xc00a8522(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3174x9a13bc90)) {
                    c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3174x9a13bc90, null);
                }
                if (c1098xe10e35e9.m7356xc00a8522(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3173x3cbed13e)) {
                    c1098xe10e35e9.m7364x5c88dc5a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3173x3cbed13e, null);
                }
                c1098xe10e35e9.m7362xaf634eb4();
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "clearExifDateTime error", new java.lang.Object[0]);
            throw e17;
        }
    }

    public static java.lang.String d0(android.content.Context context) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Util", "getSimCountryCode context is null.");
            return "";
        }
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        java.lang.String simCountryIso = telephonyManager.getSimCountryIso();
        return K0(simCountryIso) ? "" : simCountryIso.toUpperCase().trim();
    }

    public static java.lang.String[] d1(java.util.List list) {
        java.lang.String[] strArr = new java.lang.String[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            strArr[i17] = (java.lang.String) list.get(i17);
        }
        return strArr;
    }

    public static java.lang.String e(java.io.InputStream inputStream) {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (true) {
            try {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb6.append(readLine + "\n");
                    } else {
                        try {
                            break;
                        } catch (java.io.IOException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
                        }
                    }
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e18, "", new java.lang.Object[0]);
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e19, "", new java.lang.Object[0]);
                    }
                }
            } catch (java.lang.Throwable th6) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e27, "", new java.lang.Object[0]);
                }
                throw th6;
            }
        }
        inputStream.close();
        return sb6.toString();
    }

    public static java.lang.String e0(long j17, double d17) {
        return "" + (java.lang.Math.round((j17 * d17) / 1.073741824E9d) / d17) + " GB";
    }

    public static boolean e1(android.content.Context context, android.net.Uri uri) {
        java.lang.String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null || !scheme.equalsIgnoreCase("content")) {
            return true;
        }
        int checkCallingOrSelfUriPermission = context.checkCallingOrSelfUriPermission(uri, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Util", "needRequestPermission uri: %s, permission: %d", uri, java.lang.Integer.valueOf(checkCallingOrSelfUriPermission));
        return checkCallingOrSelfUriPermission != 0;
    }

    public static int f(java.lang.String str, int i17) {
        try {
            return android.graphics.Color.parseColor(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "colorString:%s", str);
            return i17;
        }
    }

    public static java.lang.String f0(long j17) {
        return g0(j17, 10.0d);
    }

    public static java.lang.String f1(java.lang.Object obj) {
        return obj != null ? obj.toString() : "null";
    }

    public static long g() {
        return android.os.SystemClock.elapsedRealtime();
    }

    public static java.lang.String g0(long j17, double d17) {
        if ((j17 >> 30) > 0) {
            return e0(j17, d17);
        }
        if ((j17 >> 20) > 0) {
            return i0(j17, d17);
        }
        if ((j17 >> 9) <= 0) {
            return "" + j17 + " B";
        }
        return "" + (java.lang.Math.round((j17 * d17) / 1024.0d) / d17) + " KB";
    }

    public static long g1() {
        return java.lang.System.currentTimeMillis();
    }

    public static byte[] h(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return new byte[0];
        }
        try {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i17 = 0; i17 < length; i17++) {
                int i18 = i17 * 2;
                bArr[i17] = (byte) (java.lang.Integer.parseInt(str.substring(i18, i18 + 2), 16) & 255);
            }
            return bArr;
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            return new byte[0];
        }
    }

    public static java.lang.String h0(long j17) {
        return i0(j17, 10.0d);
    }

    public static synchronized java.lang.String h1() {
        java.lang.String g17;
        synchronized (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.class) {
            long nanoTime = java.lang.System.nanoTime();
            if (nanoTime == f274529h) {
                try {
                    java.lang.Thread.sleep(1L);
                } catch (java.lang.InterruptedException unused) {
                }
                nanoTime = java.lang.System.nanoTime();
            }
            f274529h = nanoTime;
            g17 = kk.k.g(java.lang.String.valueOf(nanoTime).getBytes());
        }
        return g17;
    }

    public static void i(java.lang.String str, java.lang.String str2, long j17) {
        com.p314xaae8f345.mm.vfs.r6[] G;
        if (K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.y() || (G = r6Var.G()) == null || G.length == 0) {
            return;
        }
        for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
            if (r6Var2.A() && r6Var2.m82467xfb82e301().startsWith(str2) && (java.lang.System.currentTimeMillis() - r6Var2.B()) - j17 >= 0) {
                r6Var2.l();
            }
        }
    }

    public static java.lang.String i0(long j17, double d17) {
        return "" + (java.lang.Math.round((j17 * d17) / 1048576.0d) / d17) + " MB";
    }

    public static long i1() {
        return java.lang.System.currentTimeMillis() / 1000;
    }

    public static java.lang.String j(byte[] bArr) {
        if (bArr == null) {
            return "(null)";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        int length = bArr.length;
        char[] cArr2 = new char[length * 3];
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            byte b17 = bArr[i17];
            int i19 = i18 + 1;
            cArr2[i18] = ' ';
            int i27 = i19 + 1;
            cArr2[i19] = cArr[(b17 >>> 4) & 15];
            cArr2[i27] = cArr[b17 & 15];
            i17++;
            i18 = i27 + 1;
        }
        return new java.lang.String(cArr2);
    }

    public static java.lang.String j0(android.content.Context context) {
        if (context == null) {
            return null;
        }
        return c0(context.getPackageName(), context);
    }

    public static int j1(java.lang.Integer num, int i17) {
        return num == null ? i17 : num.intValue();
    }

    public static java.lang.String k(byte[] bArr, int i17, int i18) {
        if (bArr == null) {
            return "(null)";
        }
        if (i18 <= 0) {
            i18 = bArr.length;
        }
        int i19 = 0;
        if (i17 > i18) {
            i17 = 0;
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(i18 * 3) + (i18 / 16)];
        for (int i27 = i17; i27 < i18 + i17; i27++) {
            byte b17 = bArr[i27];
            int i28 = i19 + 1;
            cArr2[i19] = ' ';
            int i29 = i28 + 1;
            cArr2[i28] = cArr[(b17 >>> 4) & 15];
            int i37 = i29 + 1;
            cArr2[i29] = cArr[b17 & 15];
            if (i27 % 16 != 0 || i27 <= 0) {
                i19 = i37;
            } else {
                i19 = i37 + 1;
                cArr2[i37] = '\n';
            }
        }
        return new java.lang.String(cArr2);
    }

    public static java.lang.String k0() {
        java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
        return java.lang.String.format("%.2f", java.lang.Double.valueOf(((timeZone.getRawOffset() / 1000) / 3600.0d) + ((timeZone.useDaylightTime() && timeZone.inDaylightTime(new java.sql.Date(java.lang.System.currentTimeMillis()))) ? 1 : 0)));
    }

    public static long k1(java.lang.Long l17, long j17) {
        return l17 == null ? j17 : l17.longValue();
    }

    public static java.lang.String l(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        if (bArr != null) {
            for (byte b17 : bArr) {
                sb6.append(java.lang.String.format("%02x", java.lang.Integer.valueOf(b17 & 255)));
            }
        }
        return sb6.toString();
    }

    public static android.content.ComponentName l0(android.content.Context context) {
        try {
            java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks = ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningTasks(1);
            if (runningTasks == null || runningTasks.size() <= 0) {
                return null;
            }
            return runningTasks.get(0).topActivity;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "get Top Activity Exception:%s", e17.getMessage());
            return null;
        }
    }

    public static java.lang.String l1(java.lang.String str, java.lang.String str2) {
        return str == null ? str2 : str;
    }

    public static boolean m(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static java.lang.String m0(android.content.Context context) {
        try {
            return ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningTasks(1).get(0).topActivity.getClassName();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            return "(null)";
        }
    }

    public static boolean m1(java.lang.Boolean bool, boolean z17) {
        return bool == null ? z17 : bool.booleanValue();
    }

    public static java.lang.String n(java.lang.String str) {
        char charAt;
        if (str != null) {
            new java.lang.StringBuilder(str.length());
            int i17 = 0;
            while (i17 < str.length()) {
                char charAt2 = str.charAt(i17);
                if (charAt2 == '%' || charAt2 == '\'' || charAt2 == '\"' || charAt2 != '\\') {
                    i17++;
                } else {
                    int i18 = i17 + 1;
                    i17 = (i18 >= str.length() || !((charAt = str.charAt(i18)) == '[' || charAt == '^' || charAt == '{' || charAt == '}')) ? i18 : i17 + 2;
                }
            }
        }
        return str;
    }

    public static java.lang.String n0(android.content.Context context) {
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        try {
            appTasks = ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getAppTasks();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "getTopActivityName Exception:%s stack:%s", e17.getMessage(), com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        if (appTasks != null && appTasks.size() > 0) {
            java.util.Iterator<android.app.ActivityManager.AppTask> it = appTasks.iterator();
            if (it.hasNext()) {
                android.content.ComponentName componentName = it.next().getTaskInfo().topActivity;
                if (componentName == null) {
                    return null;
                }
                java.lang.String className = componentName.getClassName();
                return className.contains(".") ? className.substring(className.lastIndexOf(".") + 1) : className;
            }
            return "";
        }
        return "";
    }

    public static boolean n1(java.lang.Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static java.lang.String o(java.lang.String str) {
        return K0(str) ? str : str.replaceAll("\u202e", "");
    }

    public static int o0(java.lang.String str) {
        if (str == null) {
            return -1;
        }
        return str.getBytes(java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)).length;
    }

    public static int o1(java.lang.Object obj, int i17) {
        return obj == null ? i17 : obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : obj instanceof java.lang.Long ? ((java.lang.Long) obj).intValue() : i17;
    }

    public static java.lang.String p(java.lang.String str) {
        if (str == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int length = str.length();
        for (int i17 = 0; i17 < length; i17++) {
            char charAt = str.charAt(i17);
            char[] cArr = f274525d;
            boolean z17 = true;
            int length2 = cArr.length - 1;
            while (true) {
                if (length2 < 0) {
                    break;
                }
                if (cArr[length2] == charAt) {
                    stringBuffer.append(f274526e[length2]);
                    z17 = false;
                    break;
                }
                length2--;
            }
            if (i17 == length - 1 && java.lang.Character.isHighSurrogate(charAt)) {
                z17 = false;
            }
            if (z17) {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public static int p0(java.lang.String str, int i17) {
        if (str == null) {
            return i17;
        }
        try {
            if (str.length() == 0) {
                return i17;
            }
            if (str.length() > 1 && str.charAt(0) == '+') {
                str = str.substring(1);
            }
            long parseLong = java.lang.Long.parseLong(str, 10);
            if ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 & parseLong) == parseLong) {
                return (int) parseLong;
            }
            throw new java.lang.NumberFormatException("Input " + str + " in base 10 is not in the range of an unsigned integer");
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            return i17;
        }
    }

    public static long p1(java.lang.Object obj, long j17) {
        return (obj != null && (obj instanceof java.lang.Long)) ? ((java.lang.Long) obj).longValue() : j17;
    }

    public static void q(android.view.View view, int i17, int i18, int i19, int i27) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getHitRect(rect);
        rect.top -= i18;
        rect.bottom += i27;
        rect.left -= i17;
        rect.right += i19;
        android.view.TouchDelegate touchDelegate = new android.view.TouchDelegate(rect, view);
        if (android.view.View.class.isInstance(view.getParent())) {
            ((android.view.View) view.getParent()).setTouchDelegate(touchDelegate);
        }
    }

    public static long q0(java.lang.String str, long j17) {
        if (str == null) {
            return j17;
        }
        try {
            return str.length() <= 0 ? j17 : pm0.d.a(str);
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            return j17;
        }
    }

    public static int q1(java.lang.Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static java.lang.CharSequence r(java.lang.CharSequence charSequence) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 0; i17 < charSequence.length(); i17++) {
            char charAt = charSequence.charAt(i17);
            if (charAt >= '0' && charAt <= '9') {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public static java.lang.String r0(long j17) {
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(j17);
        if (valueOf.signum() < 0) {
            valueOf = valueOf.add(f274524c);
        }
        return valueOf.toString();
    }

    public static long r1(java.lang.Long l17) {
        if (l17 == null) {
            return 0L;
        }
        return l17.longValue();
    }

    public static void s(android.content.Context context, android.os.Bundle bundle) {
        if (bundle != null) {
            int i17 = android.os.Build.VERSION.SDK_INT;
            if (i17 == 29 || i17 == 28) {
                bundle.setClassLoader(context.getClassLoader());
                android.os.Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                if (bundle2 == null || bundle2.keySet() == null) {
                    return;
                }
                java.util.Iterator<java.lang.String> it = bundle2.keySet().iterator();
                while (it.hasNext()) {
                    java.lang.Object obj = bundle2.get(it.next());
                    if (obj instanceof android.os.Bundle) {
                        ((android.os.Bundle) obj).setClassLoader(context.getClassLoader());
                    }
                }
            }
        }
    }

    public static byte[] s0() {
        try {
            java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E("/dev/urandom");
            byte[] bArr = new byte[16];
            int read = E.read(bArr);
            E.close();
            if (read == 16) {
                return bArr;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
        }
        return kk.k.h((java.util.UUID.randomUUID().toString() + java.lang.System.currentTimeMillis()).getBytes());
    }

    public static java.lang.String s1(java.lang.String str) {
        return str == null ? "" : str;
    }

    public static java.lang.String t(double d17) {
        return java.lang.String.format("%.2f", java.lang.Double.valueOf(d17));
    }

    public static boolean t0(android.view.View view) {
        try {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method");
            if (inputMethodManager == null) {
                return false;
            }
            return inputMethodManager.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "hide VKB exception %s", e17);
            return false;
        }
    }

    public static boolean t1(java.lang.Boolean bool) {
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public static java.lang.String u(int i17) {
        long j17 = i17;
        return java.lang.String.format("%d:%02d", java.lang.Long.valueOf(j17 / 60), java.lang.Long.valueOf(j17 % 60));
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0152, code lost:
    
        if (r8 != 0) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v19, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.io.BufferedInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.io.BufferedInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.net.HttpURLConnection, javax.net.ssl.HttpsURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] u0(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u0(java.lang.String):byte[]");
    }

    public static java.lang.String u1(java.lang.String str, java.lang.String str2) {
        return K0(str) ? str2 : str;
    }

    public static java.lang.String v(long j17) {
        return new java.text.SimpleDateFormat("[yy-MM-dd HH:mm:ss]").format(new java.util.Date(j17 * 1000));
    }

    public static java.lang.String v0(java.util.List list) {
        if (list == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (i17 == list.size() - 1) {
                sb6.append(((java.lang.Integer) list.get(i17)).toString());
            } else {
                sb6.append(((java.lang.Integer) list.get(i17)).toString() + ",");
            }
        }
        return sb6.toString();
    }

    public static void v1(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "qualityClose", new java.lang.Object[0]);
            }
        }
    }

    public static long w(android.content.Context context) {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        if (activityManager == null) {
            return 0L;
        }
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return (memoryInfo.availMem / 1024) / 1024;
    }

    public static boolean w0(android.content.Context context) {
        try {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                return context.getApplicationInfo().targetSdkVersion >= 30;
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "isAffectedByPackageVisibility", new java.lang.Object[0]);
            return false;
        }
    }

    public static java.util.List w1(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return null;
        }
        return context.getPackageManager().queryIntentActivities(intent, 65536);
    }

    public static long x() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis();
    }

    public static boolean x0(java.lang.String str) {
        for (char c17 : str.toCharArray()) {
            if ((c17 < 'a' || c17 > 'z') && (c17 < 'A' || c17 > 'Z')) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] x1(java.lang.String r9) {
        /*
            java.lang.String r0 = ""
            boolean r1 = K0(r9)
            r2 = 0
            java.lang.String r3 = "MicroMsg.Util"
            if (r1 == 0) goto L12
            java.lang.String r9 = "readFromFile error, path is null or empty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r9)
            return r2
        L12:
            com.tencent.mm.vfs.r6 r1 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r4 = com.p314xaae8f345.mm.vfs.z7.a(r9)
            r1.<init>(r4)
            boolean r4 = r1.m()
            if (r4 != 0) goto L2c
            java.lang.String r0 = "readFromFile error, file is not exit, path = %s"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r0, r9)
            return r2
        L2c:
            r4 = 0
            long r5 = r1.C()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.io.InputStream r1 = com.p314xaae8f345.mm.vfs.w6.C(r1)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            byte[] r6 = new byte[r5]     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            int r7 = r1.read(r6)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            if (r7 == r5) goto L62
            java.lang.String r6 = "readFromFile error, size is not equal, path = %s, file length is %d, count is %d"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            r8[r4] = r9     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            r5 = 1
            r8[r5] = r9     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            r5 = 2
            r8[r5] = r9     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r6, r8)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            r1.close()     // Catch: java.io.IOException -> L5b
            goto L61
        L5b:
            r9 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r9, r0, r1)
        L61:
            return r2
        L62:
            r1.close()     // Catch: java.io.IOException -> L66
            goto L6c
        L66:
            r9 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r9, r0, r1)
        L6c:
            return r6
        L6d:
            r9 = move-exception
            r2 = r1
            goto L88
        L70:
            r9 = move-exception
            goto L76
        L72:
            r9 = move-exception
            goto L88
        L74:
            r9 = move-exception
            r1 = r2
        L76:
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L6d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r9, r0, r5)     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L87
            r1.close()     // Catch: java.io.IOException -> L81
            goto L87
        L81:
            r9 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r9, r0, r1)
        L87:
            return r2
        L88:
            if (r2 == 0) goto L94
            r2.close()     // Catch: java.io.IOException -> L8e
            goto L94
        L8e:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r1, r0, r2)
        L94:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(java.lang.String):byte[]");
    }

    public static boolean y(java.lang.String str, boolean z17) {
        if (str == null) {
            return z17;
        }
        try {
            return java.lang.Boolean.parseBoolean(str);
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            return z17;
        }
    }

    public static boolean y0(char c17) {
        return (c17 >= 'a' && c17 <= 'z') || (c17 >= 'A' && c17 <= 'Z');
    }

    public static int y1(java.lang.String str) {
        try {
            return java.lang.Integer.decode(str).intValue();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", th6, "decodeInt error " + str, new java.lang.Object[0]);
            return 0;
        }
    }

    public static android.app.ActivityManager.RunningTaskInfo z(android.content.Context context, int i17) {
        for (android.app.ActivityManager.RunningTaskInfo runningTaskInfo : ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningTasks(1000)) {
            if (runningTaskInfo.id == i17) {
                return runningTaskInfo;
            }
        }
        return null;
    }

    public static boolean z0(char c17) {
        java.lang.Character.UnicodeBlock of6 = java.lang.Character.UnicodeBlock.of(c17);
        return of6 == java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of6 == java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of6 == java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of6 == java.lang.Character.UnicodeBlock.GENERAL_PUNCTUATION || of6 == java.lang.Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || of6 == java.lang.Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS;
    }

    public static java.lang.String z1(java.lang.String str, java.lang.Object... objArr) {
        try {
            return java.lang.String.format(str, objArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Util", "error safeFormatString %s", e17.getMessage());
            return str;
        }
    }
}
