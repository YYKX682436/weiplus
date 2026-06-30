package com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a;

/* loaded from: classes11.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f273824a;

    static {
        java.util.HashMap hashMap = new java.util.HashMap(16);
        f273824a = hashMap;
        hashMap.put("exception", 10001);
        hashMap.put(com.p314xaae8f345.mm.app.C4999x403c3a42.f134755c, 10002);
        hashMap.put("handler", java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6));
        hashMap.put("sql", java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261));
        hashMap.put("permission", 10005);
        hashMap.put("main_thread_watch", 10006);
        hashMap.put("app_exit_info", 10007);
    }

    public static boolean a(java.lang.String str, byte[] bArr) {
        java.util.Map d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CrashUpload", "doPost : url = " + str + ", data.length = " + bArr.length);
        org.apache.http.impl.client.DefaultHttpClient defaultHttpClient = new org.apache.http.impl.client.DefaultHttpClient();
        org.apache.http.client.methods.HttpPost httpPost = new org.apache.http.client.methods.HttpPost(str);
        try {
            org.apache.http.entity.ByteArrayEntity byteArrayEntity = new org.apache.http.entity.ByteArrayEntity(bArr);
            byteArrayEntity.setContentType("binary/octet-stream");
            httpPost.setEntity(byteArrayEntity);
            org.apache.http.HttpResponse execute = defaultHttpClient.execute(httpPost);
            java.io.InputStream content = execute.getEntity().getContent();
            int statusCode = execute.getStatusLine().getStatusCode();
            java.lang.String e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(content);
            if (e17 != null && e17.length() > 0 && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(e17, "Response", null)) != null && "-1000".equalsIgnoreCase((java.lang.String) d17.get(".Response.retCode")) && d17.get(".Response.url") != null) {
                ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.e(d17), 500L);
            }
            com.p314xaae8f345.mm.app.p4.a(35);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CrashUpload", "doPost: responseCode %d returnConnection = %s", java.lang.Integer.valueOf(statusCode), e17);
            return statusCode == 200;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.mm.app.p4.a(36);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CrashUpload", e18, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CrashUpload", "doPost e type: %s, msg: %s", e18.getClass().getSimpleName(), e18.getMessage());
            return false;
        }
    }

    public static int b(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str4 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a;
        sb6.append(str4);
        sb6.append("crash/");
        sb6.append(str);
        sb6.append(".");
        sb6.append(str2);
        sb6.append(".crashini");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1(l75.a.b(sb7, "count"));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1(l75.a.b(sb7, "lasttime"));
        java.lang.System.currentTimeMillis();
        if (z17) {
            str3 = str4 + "crash/" + str + "." + str2 + ".preventcrashlog";
        } else {
            str3 = str4 + "crash/" + str + "." + str2 + ".crashlog";
        }
        if (com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.e(str3) < 5242880) {
            com.p314xaae8f345.mm.app.p4.a(28);
            byte[] f17 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.f(str3, 0, -1);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(f17)) {
                int length = f17.length;
                java.lang.String lowerCase = kk.k.g(java.lang.String.format("weixin#$()%d%d", java.lang.Integer.valueOf(o45.wf.f424562g), java.lang.Integer.valueOf(length)).getBytes()).toLowerCase();
                byte[] a17 = kk.y.a(f17);
                com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
                kk.d.b(c19764x527bffc1, a17, lowerCase.getBytes());
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.d(length, lowerCase, str2, str, c19764x527bffc1));
            }
        } else {
            com.p314xaae8f345.mm.app.p4.a(29);
        }
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.b(str3);
        com.p314xaae8f345.mm.app.p4.a(30);
        new l75.a(sb7).d("count", java.lang.String.valueOf(0));
        new l75.a(sb7).d("lasttime", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        return 1;
    }

    public static void c(java.lang.String str, com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20964xc27324c3 c20964xc27324c3) {
        if (!new java.io.File(str).exists()) {
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0).getInt("default_uin", 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (i17 == 0) {
                java.lang.String g17 = wo.w0.g(false);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                    int hashCode = (android.os.Build.DEVICE + android.os.Build.FINGERPRINT + android.os.Build.MANUFACTURER + wo.w0.m()).hashCode();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("uin[");
                    sb7.append(hashCode);
                    sb7.append("] ");
                    sb6.append(sb7.toString());
                } else {
                    sb6.append("uin[" + g17 + "] ");
                }
            } else {
                sb6.append("uin[" + kk.v.a(i17) + "] ");
            }
            sb6.append(com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40538xd62ba4e5());
            sb6.append(" BRAND:[" + android.os.Build.BRAND + "] ");
            java.lang.String[] f17 = wo.w0.f();
            if (f17.length > 0) {
                sb6.append("c1[" + f17[0] + "] ");
            }
            if (f17.length > 1) {
                sb6.append("c2[" + f17[1] + "] ");
            }
            sb6.append("\n");
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.a(str, sb6.toString().getBytes());
        }
        if (com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.e(str) > 10485760) {
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.b(str);
        }
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.a(str, (c20964xc27324c3.m77654x9616526c() + "\n").getBytes());
    }

    public static int d(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20964xc27324c3 c20964xc27324c3, java.lang.String str3, java.lang.String str4, boolean z17) {
        if (c20964xc27324c3 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c20964xc27324c3.m77654x9616526c())) {
            return -1;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str5 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a;
        sb6.append(str5);
        sb6.append("crash/");
        java.io.File file = new java.io.File(sb6.toString());
        if (!file.exists()) {
            file.mkdir();
        }
        java.lang.String str6 = str5 + "crash/" + str + "." + str2 + ".crashini";
        new l75.a(str6).d("count", java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1(l75.a.b(str6, "count")) + 1));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1(l75.a.b(str6, "lasttime")) == 0) {
            new l75.a(str6).d("lasttime", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        }
        java.lang.String str7 = z17 ? str5 + "crash/" + str + "." + str2 + ".preventcrashlog" : str5 + "crash/" + str + "." + str2 + ".crashlog";
        c20964xc27324c3.m77654x9616526c().getClass();
        if (c20964xc27324c3.f273811i) {
            java.io.File file2 = new java.io.File(lp0.b.a());
            if (!file2.exists()) {
                file2.mkdirs();
            }
            java.io.File[] listFiles = file2.listFiles();
            if (listFiles != null) {
                for (java.io.File file3 : listFiles) {
                    long lastModified = file3.lastModified();
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (java.lang.System.currentTimeMillis() - lastModified > 604800000) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CrashUpload", "dealWithSdcardCrash del old file: %s", file3.getPath());
                        file3.delete();
                    }
                }
            }
            java.lang.String str8 = lp0.b.a() + "crash_" + new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(new java.util.Date()) + ".txt";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CrashUpload", "dealWithSdcardCrash %s", str8);
            c(str8, c20964xc27324c3);
        }
        c(str7, c20964xc27324c3);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.b(str3);
        }
        if (str4 != null && str4.endsWith(".fulldmp")) {
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.b(str4);
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.b(str4.replace(".fulldmp", ".dmp"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CrashUpload", "delete jniFullDump ".concat(str4));
        }
        b(str, str2, z17);
        return 1;
    }

    public static void e(android.content.Intent intent, java.lang.String str) {
        com.p314xaae8f345.mm.app.p4.a(15);
        if (intent == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.io.File file = new java.io.File(com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + "crashprevent/");
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            java.lang.String stringExtra = intent.getStringExtra("tag");
            if (stringExtra == null) {
                stringExtra = "exception";
            }
            java.lang.String stringExtra2 = intent.getStringExtra("exceptionMsg");
            java.lang.String stringExtra3 = intent.getStringExtra("userName");
            boolean booleanExtra = intent.getBooleanExtra("exceptionWriteSdcard", true);
            java.lang.String stringExtra4 = intent.getStringExtra("exceptionProcess");
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20964xc27324c3 c20964xc27324c3 = new com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20964xc27324c3(stringExtra3, stringExtra, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), stringExtra2, booleanExtra);
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20965x2a3a27f5 c20965x2a3a27f5 = new com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20965x2a3a27f5(stringExtra3, stringExtra, c20964xc27324c3, stringExtra4);
            android.os.Parcel obtain = android.os.Parcel.obtain();
            obtain.writeParcelable(c20965x2a3a27f5, 0);
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.a(str, obtain.marshall());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CrashUpload", "crashPreventPath:[%s] len:[%d]", str, java.lang.Integer.valueOf(c20964xc27324c3.m77654x9616526c().length()));
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.a.a();
            com.p314xaae8f345.mm.app.p4.a(16);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CrashUpload", e17, "", new java.lang.Object[0]);
        }
    }
}
