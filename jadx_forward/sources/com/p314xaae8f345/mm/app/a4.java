package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public final class a4 implements z65.d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.a4[] f134826a = {null};

    /* renamed from: b, reason: collision with root package name */
    public static volatile long f134827b = 3700000;

    /* renamed from: c, reason: collision with root package name */
    public static final kj.x f134828c = new com.p314xaae8f345.mm.app.d4();

    public static void c(final java.lang.String str) {
        try {
            com.p314xaae8f345.mm.app.f4.a(new com.p314xaae8f345.mm.app.RunnableC5126x6ceee48(new java.lang.Runnable() { // from class: com.tencent.mm.app.a4$$l
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String str2 = str;
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCrashReporter", "saveAnrHistory");
                        java.io.File file = new java.io.File(new java.io.File(new java.io.File(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir(), com.p314xaae8f345.mm.app.C4999x403c3a42.f134755c), "history"), bm5.f1.a());
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.X1(new java.io.File(file, java.lang.System.currentTimeMillis() + ""), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCrashReporter", "saveAnrHistory, done");
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMCrashReporter", "saveAnrLocal failed, msg = " + th6.getMessage());
                    }
                }
            }));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMCrashReporter", "saveAnrLocal failed, msg = " + th6.getMessage());
        }
    }

    public static void d() {
        try {
            com.p314xaae8f345.mm.app.f4.a(new com.p314xaae8f345.mm.app.RunnableC5126x6ceee48(new com.p314xaae8f345.mm.app.RunnableC5031x56f170e()));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMCrashReporter", "deleteAnrHistory failed, msg = " + th6.getMessage());
        }
    }

    public static ob0.s3 e(boolean z17) {
        ob0.s3 s3Var = null;
        if (z17) {
            return null;
        }
        try {
            s3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0.B.h(true, 4);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMCrashReporter", th6, "Fail to dump memory info.", new java.lang.Object[0]);
        }
        if (s3Var != null) {
            if (f134827b == 3700000) {
                try {
                    f134827b = ih.a.d(e42.d0.clicfg_high_vmsize_threshold, 3700000L);
                } catch (java.lang.Throwable unused) {
                    f134827b = 3700000L;
                }
            }
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134776e0.e(java.lang.Integer.valueOf(((long) s3Var.f425481e) < f134827b ? 0 : 1));
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134778f0.e(java.lang.String.valueOf(s3Var));
            com.p314xaae8f345.mm.app.l4 l4Var = com.p314xaae8f345.mm.app.C5000x71a2fa35.f134790l0;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.util.ArrayList arrayList = (java.util.ArrayList) s3Var.D;
            if (!arrayList.isEmpty()) {
                sb7.append("| Top 20 mapped memory region sizes:\n");
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.lang.String str = android.text.TextUtils.isEmpty((java.lang.CharSequence) entry.getKey()) ? "!no-name!" : "'" + ((java.lang.String) entry.getKey()) + "'";
                    sb7.append("|   name: ");
                    sb7.append(str);
                    sb7.append(", size: ");
                    sb7.append(entry.getValue());
                    sb7.append(" bytes\n");
                }
            }
            sb6.append(sb7.toString());
            l4Var.e(sb6.toString());
            com.p314xaae8f345.mm.app.m3 m3Var = com.p314xaae8f345.mm.app.C4999x403c3a42.f134762j.f135037w;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(new android.util.Pair("VmSize", java.lang.Integer.valueOf(s3Var.f425481e)));
            arrayList2.add(new android.util.Pair("TotalMem", java.lang.Long.valueOf(s3Var.f425500x.totalMem)));
            arrayList2.add(new android.util.Pair("AvailMem", java.lang.Long.valueOf(s3Var.f425500x.availMem)));
            arrayList2.add(new android.util.Pair("Pss", java.lang.Integer.valueOf(s3Var.A * 1024)));
            arrayList2.add(new android.util.Pair("oom_adj", java.lang.Integer.valueOf(s3Var.f425476J)));
            arrayList2.add(new android.util.Pair("oom_score_adj", java.lang.Integer.valueOf(s3Var.K)));
            arrayList2.add(new android.util.Pair("System", "LowMemory = " + s3Var.f425500x.lowMemory + ", Threshold = " + ((s3Var.f425500x.threshold / 1024) / 1024) + "MB"));
            arrayList2.add(new android.util.Pair("Dalvik", "MemClass = " + s3Var.f425495s + "MB, MemLargeClass = " + s3Var.f425496t + "MB, UsedMemory = " + ((s3Var.f425492p / 1024) / 1024) + "MB, RecycledMemory = " + ((s3Var.f425493q / 1024) / 1024) + "MB, MaxMemory = " + ((s3Var.f425494r / 1024) / 1024) + "MB"));
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("HeapSize = ");
            sb8.append((s3Var.f425489m / 1024) / 1024);
            sb8.append("MB, AllocatedSize = ");
            sb8.append((s3Var.f425490n / 1024) / 1024);
            sb8.append("MB, RecycledSize = ");
            sb8.append((s3Var.f425491o / 1024) / 1024);
            sb8.append("MB");
            arrayList2.add(new android.util.Pair("Native", sb8.toString()));
            arrayList2.add(new android.util.Pair("Stats", s3Var.f425479c));
            arrayList2.add(new android.util.Pair("AMSStats", s3Var.f425480d));
            arrayList2.add(new android.util.Pair("FgService", java.util.Arrays.toString(((java.util.ArrayList) s3Var.f425486j).toArray())));
            if (s3Var.C != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (ob0.s3 s3Var2 : s3Var.C) {
                    arrayList3.add(java.lang.String.format("%s(%s), Pss = %sMB", s3Var2.f425478b, java.lang.Integer.valueOf(s3Var2.f425477a), java.lang.Integer.valueOf(s3Var2.f425501y / 1024)));
                }
                int i17 = s3Var.B;
                if (i17 != 0) {
                    arrayList3.add(java.lang.String.format("IsolatedXWeb(?), Pss = %sMB", java.lang.Integer.valueOf(i17 / 1024)));
                }
                arrayList2.add(new android.util.Pair("Processes", arrayList3));
            }
            arrayList2.add(new android.util.Pair("TPCount", java.lang.Integer.valueOf(s3Var.L)));
            arrayList2.add(new android.util.Pair("FlutterEngineCount", java.lang.Integer.valueOf(s3Var.M)));
            if (s3Var.M > 0) {
                arrayList2.add(new android.util.Pair("FlutterBiz", s3Var.N.toString()));
            }
            arrayList2.add(new android.util.Pair("LiteAppEngineCount", java.lang.Integer.valueOf(s3Var.M)));
            if (s3Var.O > 0) {
                arrayList2.add(new android.util.Pair(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14347x926d12ca, s3Var.P.toString()));
            }
            arrayList2.add(new android.util.Pair("Cost", s3Var.f425497u + "ms"));
            m3Var.e(arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCrashReporter", "Crash MemoryInfo : %s", s3Var.m150953x9616526c());
        }
        return s3Var;
    }

    public static java.lang.String f() {
        java.lang.String str = (java.lang.String) com.p314xaae8f345.mm.app.C4999x403c3a42.f134763k.f135260q.c(false);
        return str != null ? str.replace(',', ';') : "";
    }

    public static void g() {
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCrashReporter", "handleExitInfo not in main thread, return");
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 < 30) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCrashReporter", "unsupported system version %s, return", java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.mm.app.f4.f134949a.schedule(new com.p314xaae8f345.mm.app.RunnableC5126x6ceee48(new com.p314xaae8f345.mm.app.c4()), 2000L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public static void h(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.app.f4.a(new com.p314xaae8f345.mm.app.RunnableC5126x6ceee48(new com.p314xaae8f345.mm.app.RunnableC5061x56f1724()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2 A[Catch: all -> 0x0123, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0123, blocks: (B:50:0x00cb, B:56:0x00e2, B:60:0x00f5, B:62:0x010a, B:64:0x0116, B:66:0x011c, B:17:0x0129, B:19:0x0133, B:21:0x0145, B:22:0x0157, B:24:0x016a, B:25:0x0173, B:27:0x018b, B:28:0x0198, B:29:0x0193, B:30:0x01aa), top: B:49:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a A[Catch: all -> 0x0123, TryCatch #0 {all -> 0x0123, blocks: (B:50:0x00cb, B:56:0x00e2, B:60:0x00f5, B:62:0x010a, B:64:0x0116, B:66:0x011c, B:17:0x0129, B:19:0x0133, B:21:0x0145, B:22:0x0157, B:24:0x016a, B:25:0x0173, B:27:0x018b, B:28:0x0198, B:29:0x0193, B:30:0x01aa), top: B:49:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0116 A[Catch: all -> 0x0123, TryCatch #0 {all -> 0x0123, blocks: (B:50:0x00cb, B:56:0x00e2, B:60:0x00f5, B:62:0x010a, B:64:0x0116, B:66:0x011c, B:17:0x0129, B:19:0x0133, B:21:0x0145, B:22:0x0157, B:24:0x016a, B:25:0x0173, B:27:0x018b, B:28:0x0198, B:29:0x0193, B:30:0x01aa), top: B:49:0x00cb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(java.lang.String r16, int r17, boolean r18, boolean r19, boolean r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.app.a4.i(java.lang.String, int, boolean, boolean, boolean, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd A[Catch: all -> 0x013e, TryCatch #1 {all -> 0x013e, blocks: (B:19:0x00a1, B:21:0x00a5, B:23:0x00ad, B:27:0x00b7, B:29:0x00bd, B:31:0x00d5, B:32:0x0138), top: B:18:0x00a1, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(java.lang.String r50, java.lang.Throwable r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.app.a4.j(java.lang.String, java.lang.Throwable, boolean):void");
    }

    public static void k(rp.f fVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCrashReporter", "crash happened from jni");
        int i17 = fVar.f479862a;
        java.lang.String str = fVar.f479863b;
        try {
            e(z17);
            com.p314xaae8f345.mm.app.C4999x403c3a42.f134756d = fVar.f479864c;
            boolean[] zArr = com.p314xaae8f345.mm.app.y3.f135458a;
            com.p314xaae8f345.mm.app.C4999x403c3a42.f134757e.e(com.p314xaae8f345.mm.app.C4999x403c3a42.f134754b);
            com.p314xaae8f345.mm.app.C4999x403c3a42.f134758f.e(java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.mm.app.p3 p3Var = com.p314xaae8f345.mm.app.C4999x403c3a42.f134764l;
            p3Var.f135107n.e(java.lang.Integer.valueOf(i17));
            p3Var.f135108o.e(str);
            if (!z17) {
                com.p314xaae8f345.mm.app.r3 r3Var = com.p314xaae8f345.mm.app.C4999x403c3a42.f134765m;
                r3Var.f135280k.e(com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.m40615x31a92a0());
                com.p314xaae8f345.mm.app.m3 m3Var = r3Var.f135281l;
                oq5.b bVar = oq5.b.f428933c;
                ((oq5.a) bVar.f428935b).run();
                m3Var.e((java.lang.String[]) ((java.util.ArrayList) bVar.f428934a).toArray(new java.lang.String[0]));
            }
            boolean z18 = true;
            i(com.p314xaae8f345.mm.app.C4999x403c3a42.a(true, z17), 0, true, !z17, true, str);
            if (z17) {
                z18 = false;
            }
            h(z18);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMCrashReporter", th6, "Failed reporting native crash.", new java.lang.Object[0]);
        }
    }

    @Override // z65.d
    public void a(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCrashReporter", "crash happened from flutter");
        e(false);
        boolean[] zArr = com.p314xaae8f345.mm.app.y3.f135458a;
        com.p314xaae8f345.mm.app.C4999x403c3a42.f134757e.e("flutter_crash");
        com.p314xaae8f345.mm.app.p3 p3Var = com.p314xaae8f345.mm.app.C4999x403c3a42.f134764l;
        p3Var.f135110q.e(str);
        p3Var.f135111r.e(str2);
        p3Var.f135112s.e(java.lang.Boolean.valueOf(z17));
        p3Var.f135113t.e(str3);
        p3Var.f135114u.e(str4);
        if (z17) {
            com.p314xaae8f345.mm.app.C4999x403c3a42.f134765m.f135280k.e(com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.m40615x31a92a0());
        }
        i(com.p314xaae8f345.mm.app.C4999x403c3a42.a(true, false), 0, false, true, true, str4);
    }

    @Override // z65.d
    public void b(java.lang.String str, java.lang.String str2) {
        if (i95.n0.c(mi3.f.class) != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("custom_exception");
            c01.b9 b9Var = c01.b9.f118602c;
            java.lang.String a17 = b9Var.a("login_weixin_username", "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                a17 = b9Var.a("login_user_name", "never_login_crash");
            }
            intent.putExtra("userName", a17);
            intent.putExtra("tag", str2);
            intent.putExtra("exceptionMsg", str);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2038x6f2fbec7.C17257xe7367bc8) ((mi3.f) i95.n0.c(mi3.f.class))).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intent);
        }
    }
}
