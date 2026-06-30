package c.t.m.sapp.c;

/* loaded from: classes13.dex */
public class q {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f36916b = "TencentLocation_sapp/comp";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f36917c = "TencentLocation_sapp/odex";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f36918d = "complist_loading_sapp";

    /* renamed from: e, reason: collision with root package name */
    public static long f36919e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f36920f = "01234567890ABCDEF";

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f36921g = "key-locselfid";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f36922h = "key-locoutid";

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f36923i = "01234567890ABCDEF";

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f36915a = new java.lang.Object();

    /* renamed from: j, reason: collision with root package name */
    public static java.util.HashMap<java.lang.String, c.t.m.sapp.c.r> f36924j = new java.util.HashMap<>();

    public static double a(double d17) {
        return (d17 * 3.141592653589793d) / 180.0d;
    }

    public static boolean b(android.content.Context context, java.lang.String str, java.lang.Long l17) {
        return a(context, str).a(java.lang.String.valueOf(l17).getBytes(), false);
    }

    public static java.lang.String c(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return a(context, str).a(str2);
    }

    public static boolean d(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return a(context, str).a(str2.getBytes(), false);
    }

    public static java.lang.String e() {
        try {
            return android.os.Build.MANUFACTURER.replaceAll("[_]", "");
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public static java.lang.String f() {
        return "";
    }

    public static int g() {
        return android.os.Process.myPid();
    }

    public static java.lang.String h(android.content.Context context) {
        return context.getFilesDir().getAbsolutePath() + java.io.File.separator + f36917c;
    }

    public static boolean i(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.getType() == 1;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static boolean j(android.content.Context context) {
        android.telephony.TelephonyManager telephonyManager;
        try {
            telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
        } catch (java.lang.Exception unused) {
        }
        if (telephonyManager == null) {
            return false;
        }
        return telephonyManager.getSimState() == 5;
    }

    public static java.lang.String k(android.content.Context context) {
        try {
            android.os.Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                if (bundle.containsKey("TencentGeoLocationSDK")) {
                    return bundle.getString("TencentGeoLocationSDK");
                }
                if (bundle.containsKey("TencentMapSDK")) {
                    return bundle.getString("TencentMapSDK");
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return "";
    }

    public static c.t.m.sapp.c.r a(android.content.Context context, java.lang.String str) {
        if (f36924j.containsKey(str)) {
            return f36924j.get(str);
        }
        c.t.m.sapp.c.r rVar = new c.t.m.sapp.c.r(context.getFilesDir().getAbsolutePath() + "/TencentLocation_sapp/conf/" + str);
        f36924j.put(str, rVar);
        return rVar;
    }

    public static java.lang.String e(android.content.Context context) {
        try {
            int myPid = android.os.Process.myPid();
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        } catch (java.lang.Exception unused) {
            java.lang.String str = c.t.m.sapp.c.i.f36900a;
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:5|6|7|(4:9|11|12|(14:14|15|16|17|(13:47|48|50|51|(1:53)(2:55|56)|54|21|(1:23)|(1:25)|(1:27)|(1:29)|(1:31)|(1:(2:34|(2:36|(1:40)(2:38|39))(2:41|42))(2:43|44))(2:45|46))|19|20|21|(0)|(0)|(0)|(0)|(0)|(0)(0))(13:62|16|17|(0)|19|20|21|(0)|(0)|(0)|(0)|(0)|(0)(0)))|66|65|15|16|17|(0)|19|20|21|(0)|(0)|(0)|(0)|(0)|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f(android.content.Context r9) {
        /*
            java.lang.String r0 = "gps"
            if (r9 != 0) goto L6
            r9 = -1
            return r9
        L6:
            boolean r1 = j(r9)
            r2 = 1
            r3 = 0
            java.lang.String r4 = "wifi"
            java.lang.Object r4 = r9.getSystemService(r4)     // Catch: java.lang.Throwable -> L25
            android.net.wifi.WifiManager r4 = (android.net.wifi.WifiManager) r4     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L25
            boolean r5 = r4.isWifiEnabled()     // Catch: java.lang.Throwable -> L25
            boolean r4 = r4.isScanAlwaysAvailable()     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L22
            r4 = r2
            goto L27
        L22:
            r6 = r2
            r4 = r3
            goto L28
        L25:
            r5 = r3
        L26:
            r4 = r3
        L27:
            r6 = r4
        L28:
            java.lang.String r7 = "location"
            java.lang.Object r7 = r9.getSystemService(r7)     // Catch: java.lang.Exception -> L51
            android.location.LocationManager r7 = (android.location.LocationManager) r7     // Catch: java.lang.Exception -> L51
            if (r7 == 0) goto L51
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r8 = "location_mode"
            int r9 = android.provider.Settings.Secure.getInt(r9, r8)     // Catch: java.lang.Throwable -> L3d
            goto L3e
        L3d:
            r9 = r3
        L3e:
            boolean r8 = r7.isProviderEnabled(r0)     // Catch: java.lang.Exception -> L52
            java.util.List r7 = r7.getAllProviders()     // Catch: java.lang.Exception -> L52
            if (r7 != 0) goto L49
            goto L4e
        L49:
            boolean r0 = r7.contains(r0)     // Catch: java.lang.Exception -> L52
            r3 = r0
        L4e:
            r0 = r3
            r3 = r8
            goto L53
        L51:
            r9 = r3
        L52:
            r0 = r3
        L53:
            r1 = r1 ^ r2
            if (r5 != 0) goto L58
            int r1 = r1 + 2
        L58:
            if (r3 != 0) goto L5c
            int r1 = r1 + 4
        L5c:
            if (r6 != 0) goto L60
            int r1 = r1 + 8
        L60:
            if (r0 != 0) goto L64
            int r1 = r1 + 16
        L64:
            if (r4 != 0) goto L68
            int r1 = r1 + 32
        L68:
            if (r9 == 0) goto L7c
            if (r9 == r2) goto L79
            r0 = 2
            if (r9 == r0) goto L76
            r0 = 3
            if (r9 == r0) goto L73
            goto L7e
        L73:
            int r1 = r1 + 512
            goto L7e
        L76:
            int r1 = r1 + 256
            goto L7e
        L79:
            int r1 = r1 + 128
            goto L7e
        L7c:
            int r1 = r1 + 64
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.t.m.sapp.c.q.f(android.content.Context):int");
    }

    public static java.lang.String g(android.content.Context context) {
        try {
            java.lang.String str = f36920f;
            if (str != null && str.length() != 0 && !"01234567890ABCDEF".equals(f36920f)) {
                return f36920f;
            }
            java.lang.String a17 = c.t.m.sapp.c.l.a(b(context, "LocationSDK", "_col_ooo_"));
            if (!"01234567890ABCDEF".equals(a17) && !"".equals(a17)) {
                f36920f = a17;
                return a17;
            }
            java.lang.String b17 = b(context, "TLocationSDK", f36922h);
            if (!"01234567890ABCDEF".equals(b17)) {
                f36920f = b17;
                return b17;
            }
            java.lang.String b18 = b(context, "TLocationSDK", f36921g);
            if (!"01234567890ABCDEF".equals(b18)) {
                f36920f = b18;
                return b18;
            }
            java.lang.String b19 = b(context, "LocationSDK", "loc_id_LocCommId");
            f36920f = b19;
            return b19;
        } catch (java.lang.Throwable unused) {
            f36920f = "01234567890ABCDEF";
            return "01234567890ABCDEF";
        }
    }

    public static java.lang.String c(android.content.Context context) {
        return context.getFilesDir().getAbsolutePath() + java.io.File.separator + f36916b;
    }

    public static java.lang.String d(android.content.Context context) {
        java.lang.String e17 = e(context);
        return e17 == null ? c() : e17;
    }

    public static java.lang.String b(android.content.Context context) {
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            java.lang.String str = packageInfo.versionName;
            int i17 = packageInfo.versionCode;
            if (str != null && str.trim().length() > 0) {
                return str;
            }
            return "" + i17;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static java.lang.String c() {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(new java.io.File("/proc/" + android.os.Process.myPid() + "/cmdline")));
            java.lang.String trim = bufferedReader.readLine().trim();
            bufferedReader.close();
            return trim;
        } catch (java.lang.Exception unused) {
            java.lang.String str = c.t.m.sapp.c.i.f36900a;
            return null;
        }
    }

    public static long d() {
        try {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (java.lang.Exception unused) {
            return 0L;
        }
    }

    public static java.lang.Long a(android.content.Context context, java.lang.String str, java.lang.Long l17) {
        try {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(a(context, str).a(java.lang.String.valueOf(l17))));
        } catch (java.lang.Exception unused) {
            return l17;
        }
    }

    public static java.lang.String c(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String string = jSONObject.getString("status");
            c.t.m.sapp.c.e.b().a("DRG", "statucode:" + string);
            if (string.equals("-3")) {
                return null;
            }
            if (string.equals("0")) {
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("compList");
                java.lang.String str2 = "";
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
                    int i18 = jSONObject2.getInt("compId");
                    java.lang.String string2 = jSONObject2.getString("compVer");
                    java.lang.String string3 = jSONObject2.getString("md5");
                    int i19 = jSONObject2.getInt("size");
                    str2 = str2 + i18 + "," + string2 + "," + jSONObject2.getString("compName") + "," + i19 + "," + string3 + ",;";
                }
                return str2;
            }
            if (string.equals("-1") || string.equals("-2") || string.equals("-4")) {
                return null;
            }
            string.equals("-5");
            return null;
        } catch (java.lang.Exception e17) {
            c.t.m.sapp.c.e.b().a("DRG", "statucode:" + e17.toString());
            return null;
        }
    }

    public static java.util.List<c.t.m.sapp.c.a> d(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            for (java.lang.String str2 : str.split(";")) {
                java.lang.String[] split = str2.split(",");
                if (split.length >= 5) {
                    try {
                        c.t.m.sapp.c.a aVar = new c.t.m.sapp.c.a();
                        aVar.f36855a = java.lang.Integer.valueOf(split[0]).intValue();
                        aVar.f36856b = split[1];
                        aVar.f36857c = split[2];
                        aVar.f36858d = java.lang.Integer.valueOf(split[3]).intValue();
                        aVar.f36859e = split[4];
                        if (split.length > 5) {
                            aVar.f36860f = split[5];
                        }
                        arrayList.add(aVar);
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        } catch (java.lang.Exception unused2) {
        }
        return arrayList;
    }

    public static void a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        f36916b = "TencentLocation_sapp/comp";
        f36917c = "TencentLocation_sapp/odex";
        f36916b += "_atuo_" + currentTimeMillis;
        f36917c += "_atuo_" + currentTimeMillis;
    }

    public static int b() {
        return android.os.Build.VERSION.SDK_INT;
    }

    public static java.lang.String b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            if (c.t.m.sapp.c.p.f36914b == null) {
                c.t.m.sapp.c.p.f36914b = context;
            }
            return (java.lang.String) c.t.m.sapp.c.p.a(str, str2, "01234567890ABCDEF");
        } catch (java.lang.Throwable unused) {
            return "01234567890ABCDEF";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r1 != null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(byte[] r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L7f
            int r1 = r7.length
            if (r1 != 0) goto L8
            goto L7f
        L8:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4a java.lang.Error -> L5d java.lang.Exception -> L6d
            r1.<init>()     // Catch: java.lang.Throwable -> L4a java.lang.Error -> L5d java.lang.Exception -> L6d
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L41 java.lang.Error -> L44 java.lang.Exception -> L47
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L41 java.lang.Error -> L44 java.lang.Exception -> L47
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L3b java.lang.Error -> L3d java.lang.Exception -> L3f
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L3b java.lang.Error -> L3d java.lang.Exception -> L3f
            r3 = 307200(0x4b000, float:4.30479E-40)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L36 java.lang.Error -> L60 java.lang.Exception -> L70
        L1c:
            int r4 = r7.read(r3)     // Catch: java.lang.Throwable -> L36 java.lang.Error -> L60 java.lang.Exception -> L70
            if (r4 < 0) goto L27
            r5 = 0
            r1.write(r3, r5, r4)     // Catch: java.lang.Throwable -> L36 java.lang.Error -> L60 java.lang.Exception -> L70
            goto L1c
        L27:
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L36 java.lang.Error -> L60 java.lang.Exception -> L70
            r7.close()     // Catch: java.lang.Exception -> L7f
            r2.close()     // Catch: java.lang.Exception -> L7f
            r1.close()     // Catch: java.lang.Exception -> L7f
            goto L7f
        L36:
            r0 = move-exception
            r6 = r0
            r0 = r7
            r7 = r6
            goto L4d
        L3b:
            r7 = move-exception
            goto L4d
        L3d:
            r7 = r0
            goto L60
        L3f:
            r7 = r0
            goto L70
        L41:
            r7 = move-exception
            r2 = r0
            goto L4d
        L44:
            r7 = r0
            r2 = r7
            goto L60
        L47:
            r7 = r0
            r2 = r7
            goto L70
        L4a:
            r7 = move-exception
            r1 = r0
            r2 = r1
        L4d:
            if (r0 == 0) goto L52
            r0.close()     // Catch: java.lang.Exception -> L5c
        L52:
            if (r2 == 0) goto L57
            r2.close()     // Catch: java.lang.Exception -> L5c
        L57:
            if (r1 == 0) goto L5c
            r1.close()     // Catch: java.lang.Exception -> L5c
        L5c:
            throw r7
        L5d:
            r7 = r0
            r1 = r7
            r2 = r1
        L60:
            if (r7 == 0) goto L65
            r7.close()     // Catch: java.lang.Exception -> L7f
        L65:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.lang.Exception -> L7f
        L6a:
            if (r1 == 0) goto L7f
            goto L7c
        L6d:
            r7 = r0
            r1 = r7
            r2 = r1
        L70:
            if (r7 == 0) goto L75
            r7.close()     // Catch: java.lang.Exception -> L7f
        L75:
            if (r2 == 0) goto L7a
            r2.close()     // Catch: java.lang.Exception -> L7f
        L7a:
            if (r1 == 0) goto L7f
        L7c:
            r1.close()     // Catch: java.lang.Exception -> L7f
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.t.m.sapp.c.q.b(byte[]):byte[]");
    }

    public static void a(android.content.Context context) {
        if (context == null) {
            return;
        }
        try {
            java.io.File[] listFiles = new java.io.File(context.getFilesDir().getAbsolutePath() + "/TencentLocation_sapp").listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                return;
            }
            for (java.io.File file : listFiles) {
                java.lang.String name = file.getName();
                if (file.isDirectory() && name.contains("_atuo_") && !f36916b.contains(name)) {
                    if (name.startsWith("odex_")) {
                        if (f36916b.contains(name.replaceAll("odex_", "comp_"))) {
                        }
                    }
                    b(file.getAbsolutePath());
                    file.delete();
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static java.util.List<java.lang.String> a(android.content.Context context, java.io.File file) {
        java.util.ArrayList arrayList;
        java.io.File[] listFiles;
        java.lang.String str = "";
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.io.File file2 : listFiles) {
                arrayList.add(file2.getName() + "," + file2.length() + "," + a(file2));
                str = str + file2.getName() + "," + file2.length() + "," + a(file2) + ";";
            }
        }
        c.t.m.sapp.c.i.a("before check ,private dir files:" + str);
        return arrayList;
    }

    public static boolean b(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            return false;
        }
        java.lang.String[] list = file.list();
        if (list != null && list.length != 0) {
            for (java.lang.String str2 : list) {
                java.io.File file2 = new java.io.File(str, str2);
                if (file2.isDirectory()) {
                    b(file2.getAbsolutePath());
                    file2.delete();
                } else {
                    file2.delete();
                }
            }
        }
        return true;
    }

    public static void a(android.content.Context context, android.util.Pair<java.lang.String, java.lang.String> pair) {
        java.lang.Object obj;
        try {
            if (!com.tencent.map.geolocation.sapp.TencentLocationManager.TYPE_OAID.equals(pair.first) || (obj = pair.second) == null || ((java.lang.String) obj).length() <= 0) {
                return;
            }
            java.lang.Object obj2 = pair.second;
            f36923i = (java.lang.String) obj2;
            a(context, f36922h, (java.lang.String) obj2);
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            if (c.t.m.sapp.c.p.f36914b == null) {
                c.t.m.sapp.c.p.f36914b = context;
            }
            c.t.m.sapp.c.p.b("TLocationSDK", str, str2);
        } catch (java.lang.Throwable unused) {
        }
    }

    public static java.lang.String a(java.io.File file) {
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return a(messageDigest.digest());
                }
            }
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static boolean b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, byte[] bArr) {
        java.lang.String str4 = str2 + java.io.File.separator + str3;
        java.io.File file = new java.io.File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        boolean z17 = false;
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(str);
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(str4);
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    z17 = true;
                    fileInputStream.close();
                    return true;
                }
            }
        } catch (java.lang.Exception unused) {
            return z17;
        }
    }

    public static java.lang.String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (byte b17 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString().toLowerCase();
    }

    public static java.lang.String b(android.content.Context context, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            java.io.InputStream open = context.getAssets().open(str);
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open, com.tencent.mapsdk.internal.rv.f51270c));
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb6.append(readLine);
            }
            bufferedReader.close();
            open.close();
        } catch (java.io.UnsupportedEncodingException | java.io.IOException unused) {
        }
        return sb6.toString();
    }

    public static void a(long j17) {
        try {
            java.lang.Thread.sleep(j17);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    public static java.lang.String a(java.util.List<c.t.m.sapp.c.a> list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (c.t.m.sapp.c.a aVar : list) {
            sb6.append(aVar.f36855a);
            sb6.append(",");
            sb6.append(aVar.f36856b);
            sb6.append(",");
            if (!aVar.f36857c.contains(com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX)) {
                aVar.f36857c += com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX;
            }
            sb6.append(aVar.f36857c);
            sb6.append(",");
            sb6.append(aVar.f36858d);
            sb6.append(",");
            sb6.append(aVar.f36859e);
            sb6.append(",");
            sb6.append(aVar.f36860f);
            sb6.append(";");
        }
        return sb6.toString();
    }

    public static boolean a(android.content.Context context, java.util.List<c.t.m.sapp.c.a> list) {
        java.util.List<c.t.m.sapp.c.a> d17 = d(c(context, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", ""));
        if (list.size() == 0) {
            return false;
        }
        if (d17.size() == 0) {
            return d(context, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", a(list));
        }
        for (int i17 = 0; i17 < d17.size(); i17++) {
            c.t.m.sapp.c.a aVar = d17.get(i17);
            int i18 = 0;
            while (true) {
                if (i18 < list.size()) {
                    c.t.m.sapp.c.a aVar2 = list.get(i18);
                    if (aVar2.f36855a == aVar.f36855a) {
                        aVar.f36857c = aVar2.f36857c;
                        aVar.f36856b = aVar2.f36856b;
                        aVar.f36858d = aVar2.f36858d;
                        aVar.f36859e = aVar2.f36859e;
                        break;
                    }
                    i18++;
                }
            }
        }
        return d(context, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", a(d17));
    }

    public static boolean a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, byte[] bArr) {
        java.lang.String str4 = str2 + java.io.File.separator + str3;
        java.io.File file = new java.io.File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        boolean z17 = false;
        try {
            java.io.InputStream open = context.getResources().getAssets().open(str);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            open.available();
            java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(str4, true), 1024);
            while (true) {
                int read = open.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.close();
            byte[] b17 = b(c.t.m.sapp.c.l.a(byteArrayOutputStream.toByteArray(), "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q"));
            if (b17 != null) {
                bufferedOutputStream.write(b17);
                bufferedOutputStream.close();
                z17 = true;
            }
            open.close();
        } catch (java.lang.Exception e17) {
            c.t.m.sapp.c.i.a("copy base to private dir", e17);
        }
        return z17;
    }

    public static boolean a(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            file.mkdirs();
            return true;
        }
        java.lang.String[] list = file.list();
        if (list != null && list.length != 0) {
            for (java.lang.String str2 : list) {
                java.io.File file2 = new java.io.File(str, str2);
                if (file2.isDirectory()) {
                    b(file2.getAbsolutePath());
                    file2.delete();
                } else {
                    file2.delete();
                }
            }
        }
        return true;
    }

    public static double a(double d17, double d18, double d19, double d27) {
        double a17 = a(d17);
        double a18 = a(d19);
        return (java.lang.Math.round(((java.lang.Math.asin(java.lang.Math.sqrt(java.lang.Math.pow(java.lang.Math.sin((a17 - a18) / 2.0d), 2.0d) + ((java.lang.Math.cos(a17) * java.lang.Math.cos(a18)) * java.lang.Math.pow(java.lang.Math.sin((a(d18) - a(d27)) / 2.0d), 2.0d)))) * 2.0d) * 6378.137d) * 10000.0d) / 10000.0d) * 1000.0d;
    }
}
