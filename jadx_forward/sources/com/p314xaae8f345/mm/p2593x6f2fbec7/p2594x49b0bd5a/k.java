package com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a;

/* loaded from: classes11.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.j f273825a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f273826b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Runnable f273827c = new com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.i();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f273828d = false;

    public k(int i17) {
        if (i17 == 1) {
            com.p314xaae8f345.mm.app.p4.a(19);
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.app.p4.a(20);
        }
    }

    public static void c(android.content.Context context, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274610g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExceptionMonitor", "manProc standby, skip pulling");
            return;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20963x161013d8.class);
        intent.putExtra("use_bugreporter", z17);
        l85.j1.b("MicroMsg.ExceptionMonitor", intent);
        if (jk.b.b(context, 108, intent, fp.g0.a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965), true) == null) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() + 1800000;
            jk.b.d(context, 108, 0, currentTimeMillis, intent, 0, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitor", "dkcrash startAlarmMgr %d", java.lang.Long.valueOf(currentTimeMillis));
        }
    }

    public void a(android.content.Intent intent) {
        java.lang.String str;
        int c17;
        org.json.JSONObject optJSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitor", "handleCommand()");
        com.p314xaae8f345.mm.app.p4.a(23);
        if (intent == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f273826b;
        java.lang.Runnable runnable = f273827c;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50297x7c4d7ca2(runnable, 300000L);
        f273828d = true;
        try {
            java.lang.Thread.sleep(200L);
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExceptionMonitor", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitor", "handleCommand");
        intent.getAction();
        try {
            java.lang.String stringExtra = intent.getStringExtra("tag");
            java.lang.String str2 = stringExtra == null ? "exception" : stringExtra;
            com.p314xaae8f345.mm.app.p4.a(24);
            java.lang.String stringExtra2 = intent.getStringExtra("exceptionProcess");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(stringExtra2, "mm")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1185L, 11L, 1L, true);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(stringExtra2, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1185L, 12L, 1L, true);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(stringExtra2, "other")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1185L, 13L, 1L, true);
            }
            int intExtra = intent.getIntExtra("exceptionPid", 0);
            intent.getLongExtra("exceptionTime", android.os.SystemClock.elapsedRealtime());
            java.lang.String stringExtra3 = intent.getStringExtra("exceptionMsg");
            java.lang.String stringExtra4 = intent.getStringExtra("userName");
            java.lang.String stringExtra5 = intent.getStringExtra("exceptionPreventPath");
            boolean booleanExtra = intent.getBooleanExtra("exceptionWriteSdcard", true);
            boolean booleanExtra2 = intent.getBooleanExtra("use_bugreporter", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitor", "processName:%s crashPreventPath:%s", stringExtra2, stringExtra5);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                return;
            }
            if (str2.equals("exception")) {
                java.lang.String stringExtra6 = intent.getStringExtra("fulldump_path");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String str3 = new java.lang.String(android.util.Base64.decode(stringExtra3, 2));
                if (stringExtra6 == null || !stringExtra6.endsWith(".fulldmp")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitor", "fulldmp is null");
                    if (booleanExtra2) {
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(str3);
                            if (jSONObject.has(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede) && (optJSONObject = jSONObject.optJSONObject(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede)) != null && optJSONObject.has("patchid")) {
                                java.lang.String optString = optJSONObject.optString("patchid", "");
                                if (!optString.isEmpty() && !optString.equals(com.p314xaae8f345.mm.app.C5000x71a2fa35.f134769b)) {
                                    com.p314xaae8f345.mm.app.l0.c(optString);
                                }
                            }
                        } catch (java.lang.Exception unused) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitor", "tryDealJavaCrashHashNew failed");
                        }
                        stringExtra3 = android.util.Base64.encodeToString(kk.y.a(str3.getBytes()), 2);
                    } else {
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        if (stringExtra3.contains("#[jni_crash]")) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitor", "tryDealCrashHash jni crash");
                        } else {
                            java.lang.String str4 = new java.lang.String(android.util.Base64.decode(stringExtra3, 2));
                            int indexOf = str4.indexOf(com.p314xaae8f345.mm.app.C5000x71a2fa35.f134767a);
                            java.lang.String a17 = indexOf > 0 ? com.p314xaae8f345.mm.app.l0.a(str4.substring(indexOf + 14)) : "";
                            if (!a17.isEmpty()) {
                                java.lang.String encodeToString = android.util.Base64.encodeToString(str4.replaceAll(com.p314xaae8f345.mm.app.C5000x71a2fa35.f134769b, a17).getBytes(), 2);
                                com.p314xaae8f345.mm.app.l0.c(a17);
                                stringExtra3 = encodeToString;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitor", "tryDealCrashHash cost: %s ms hash:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2), a17);
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitor", "append fulldmp %s", stringExtra6);
                    if (booleanExtra2) {
                        try {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str3);
                            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                            rp.i.c(jSONObject2, stringExtra6);
                            jSONObject2.putOpt("parseFullDump", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis3));
                            stringExtra3 = android.util.Base64.encodeToString(kk.y.a(jSONObject2.toString().getBytes()), 2);
                        } catch (java.lang.Exception e18) {
                            stringExtra3 = android.util.Base64.encodeToString(kk.y.a(str3.getBytes()), 2);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExceptionMonitor", e18, "parseFullDumpToJSON failed", new java.lang.Object[0]);
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitor", "appendFullDumpForJniCrash cost:%d useBugReporter:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Boolean.valueOf(booleanExtra2));
                str = stringExtra6;
            } else {
                str = null;
            }
            java.lang.String str5 = stringExtra3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitor", "noteReportedPid: " + intExtra + ", tag=" + str2);
            mm.g0.e(str2, intExtra);
            com.p314xaae8f345.mm.app.p4.a(25);
            if (!booleanExtra2) {
                if (com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.f.d(stringExtra4, str2, new com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20964xc27324c3(stringExtra4, str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), str5, booleanExtra), stringExtra5, str, false) == 0) {
                    c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, false);
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20964xc27324c3 c20964xc27324c3 = new com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20964xc27324c3(stringExtra4, str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), "json_" + str5, booleanExtra);
            java.lang.String str6 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.m.f273835a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c20964xc27324c3.m77654x9616526c())) {
                c17 = -1;
            } else {
                java.lang.String str7 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.m.f273835a;
                java.io.File file = new java.io.File(str7);
                if (!file.exists()) {
                    file.mkdir();
                }
                java.lang.String str8 = str7 + stringExtra4 + "." + str2 + "." + java.lang.System.currentTimeMillis() + ".crashlog";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBugReporter", "crash:[%s] len:[%d]", str8, java.lang.Integer.valueOf(c20964xc27324c3.m77654x9616526c().length()));
                if (c20964xc27324c3.f273811i) {
                    java.io.File file2 = new java.io.File(lp0.b.a());
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    java.io.File[] listFiles = file2.listFiles();
                    if (listFiles != null) {
                        for (java.io.File file3 : listFiles) {
                            long lastModified = file3.lastModified();
                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            if (java.lang.System.currentTimeMillis() - lastModified > 604800000) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBugReporter", "dealWithSdcardCrash del old file: %s", file3.getPath());
                                file3.delete();
                            }
                        }
                    }
                    java.lang.String str9 = lp0.b.a() + "crash_" + new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(new java.util.Date()) + ".txt";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBugReporter", "dealWithSdcardCrash %s", str9);
                    com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.m.b(str9, c20964xc27324c3);
                }
                com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.m.b(str8, c20964xc27324c3);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra5)) {
                    com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.b(stringExtra5);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBugReporter", "delete prevent " + stringExtra5);
                }
                if (str != null && str.endsWith(".fulldmp")) {
                    com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.b(str);
                    com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.b(str.replace(".fulldmp", ".dmp"));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBugReporter", "delete jniFullDump ".concat(str));
                }
                c17 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.m.c(stringExtra4, str2, str8);
            }
            if (c17 == 0) {
                c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, true);
            }
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExceptionMonitor", e19, "", new java.lang.Object[0]);
        }
    }

    public void b(com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.j jVar) {
        f273825a = jVar;
        q65.d.a(hashCode(), this);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f273826b;
        java.lang.Runnable runnable = f273827c;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50297x7c4d7ca2(runnable, 300000L);
        f273828d = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitor", "onCreate");
    }
}
