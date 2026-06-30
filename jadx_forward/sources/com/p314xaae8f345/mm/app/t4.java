package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public final class t4 implements z65.d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.t4[] f135331a = {null};

    /* renamed from: b, reason: collision with root package name */
    public static final android.os.ParcelFileDescriptor[] f135332b = {null};

    public static java.lang.String c(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(new java.io.File(new java.io.File(context.getFilesDir(), com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede).getAbsolutePath()), "java_" + str.replace(':', '_') + "_" + java.lang.System.currentTimeMillis() + "_" + str2 + ".dmp");
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static java.lang.String d(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(new java.io.File(new java.io.File(context.getFilesDir(), com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede).getAbsolutePath()), "NativeCrash_" + str.replace(':', '_') + "_" + java.lang.System.currentTimeMillis() + "_" + str2 + ".dmp");
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static void e(java.lang.String str, java.lang.Throwable th6) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCrashReporter", "Crash msg content size: %s", java.lang.Integer.valueOf(str.length()));
            if ((th6 instanceof com.p314xaae8f345.mm.p2624x91727fcf.p2625x1d1e926c.C21320x5c919cff) || (th6.getCause() instanceof com.p314xaae8f345.mm.p2624x91727fcf.p2625x1d1e926c.C21320x5c919cff)) {
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
                th6.printStackTrace(printWriter);
                printWriter.close();
                str = stringWriter.toString();
            }
            g(com.p314xaae8f345.mm.app.C5000x71a2fa35.b("", str, true, false), 0, false, true);
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMCrashReporter", th7, "Failed reporting java crash.", new java.lang.Object[0]);
            throw th7;
        }
    }

    public static void f(final android.content.Context context, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        com.p314xaae8f345.mm.app.t4[] t4VarArr = f135331a;
        if (t4VarArr[0] != null) {
            return;
        }
        synchronized (t4VarArr) {
            if (t4VarArr[0] != null) {
                return;
            }
            com.p314xaae8f345.mm.app.t4 t4Var = new com.p314xaae8f345.mm.app.t4();
            t4VarArr[0] = t4Var;
            z65.c.f551990c = t4Var;
            android.os.ParcelFileDescriptor[] parcelFileDescriptorArr = f135332b;
            synchronized (parcelFileDescriptorArr) {
                parcelFileDescriptorArr[0] = parcelFileDescriptor;
            }
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134775e.e((java.lang.String) com.p314xaae8f345.mm.app.z3.b(new com.p314xaae8f345.mm.app.CallableC5100x67ad5a1()));
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134777f.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g);
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134781h.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134783i.f(new com.p314xaae8f345.mm.app.CallableC5102x67ad5a3());
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134785j.e((java.lang.String) com.p314xaae8f345.mm.app.z3.b(new com.p314xaae8f345.mm.app.CallableC5104x67ad5a5()));
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134787k.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274640c);
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134789l.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274639b);
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134793o.e(java.lang.Long.valueOf(com.p314xaae8f345.mm.app.x.f135439a));
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134797s.e((java.lang.String) com.p314xaae8f345.mm.app.z3.b(new com.p314xaae8f345.mm.app.CallableC5105x67ad5a6()));
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134798t.e(android.os.Build.CPU_ABI);
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134803y.e((java.lang.Integer) com.p314xaae8f345.mm.app.z3.b(new com.p314xaae8f345.mm.app.CallableC5106x67ad5a7()));
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134804z.e((java.lang.Boolean) com.p314xaae8f345.mm.app.z3.b(new com.p314xaae8f345.mm.app.CallableC5107x67ad5a8()));
            try {
                com.p314xaae8f345.mm.app.w.INSTANCE.a(new com.p314xaae8f345.mm.app.u4());
            } catch (java.lang.Throwable unused) {
            }
            com.p314xaae8f345.mm.app.C5000x71a2fa35.B.f(new com.p314xaae8f345.mm.app.CallableC5108x67ad5a9());
            com.p314xaae8f345.mm.app.C5000x71a2fa35.A.f(new com.p314xaae8f345.mm.app.CallableC5109x67ad5aa());
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134794p.f(new com.p314xaae8f345.mm.app.CallableC5110x67ad5ab());
            try {
                new java.lang.Runnable() { // from class: com.tencent.mm.app.t4$$l
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.app.C5000x71a2fa35.K.e(java.lang.Integer.valueOf(com.p314xaae8f345.p3210x3857dc.a3.f(context)));
                        if (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c != null) {
                            com.p314xaae8f345.mm.app.C5000x71a2fa35.L.e(java.lang.Integer.valueOf(by5.e.d()));
                        }
                        com.p314xaae8f345.mm.app.C5000x71a2fa35.M.e(java.lang.Integer.valueOf(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.k()));
                        com.p314xaae8f345.mm.app.C5000x71a2fa35.N.e(java.lang.Boolean.valueOf(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.e()));
                    }
                }.run();
            } catch (java.lang.Throwable unused2) {
            }
            try {
                new com.p314xaae8f345.mm.app.RunnableC5112x67ad5ad().run();
            } catch (java.lang.Throwable unused3) {
            }
            com.p314xaae8f345.mm.app.C5000x71a2fa35.X.f(new com.p314xaae8f345.mm.app.CallableC5113x67ad5ae());
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134768a0.e((java.lang.Integer) com.p314xaae8f345.mm.app.z3.b(new com.p314xaae8f345.mm.app.CallableC5114x67ad5af()));
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134770b0.e((java.lang.String) com.p314xaae8f345.mm.app.z3.b(new java.util.concurrent.Callable() { // from class: com.tencent.mm.app.t4$$p
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.c7.c(context);
                }
            }));
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134772c0.e((java.lang.String) com.p314xaae8f345.mm.app.z3.b(new java.util.concurrent.Callable() { // from class: com.tencent.mm.app.t4$$q
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.c7.a(context);
                }
            }));
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134782h0.e((java.lang.String) com.p314xaae8f345.mm.app.z3.b(new com.p314xaae8f345.mm.app.CallableC5117x67ad5b2()));
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134784i0.f(new com.p314xaae8f345.mm.app.CallableC5118x67ad5b3());
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134786j0.f(new com.p314xaae8f345.mm.app.CallableC5119x67ad5b4());
            com.p314xaae8f345.mm.app.C5000x71a2fa35.Y.f(new com.p314xaae8f345.mm.app.CallableC5101x67ad5a2());
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134788k0.f(new com.p314xaae8f345.mm.app.CallableC5103x67ad5a4());
        }
    }

    public static void g(java.lang.String str, int i17, boolean z17, boolean z18) {
        if (str == null || str.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.app.z3.a("MicroMsg.MMCrashReporter", str);
        android.os.ParcelFileDescriptor[] parcelFileDescriptorArr = f135332b;
        synchronized (parcelFileDescriptorArr) {
            if (parcelFileDescriptorArr[0] != null) {
                java.io.PrintWriter printWriter = null;
                try {
                    if (str.length() > 3072) {
                        str = str.substring(0, 3072);
                    }
                    if (i17 > 0 && str.length() > i17) {
                        str = str.substring(0, i17);
                    }
                    java.lang.String trim = str.trim();
                    java.io.PrintWriter printWriter2 = new java.io.PrintWriter(new java.io.FileWriter(parcelFileDescriptorArr[0].getFileDescriptor()));
                    try {
                        printWriter2.print("version:" + ((java.lang.String) com.p314xaae8f345.mm.app.C5000x71a2fa35.f134777f.c(true)));
                        printWriter2.println(trim);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(printWriter2);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        printWriter = printWriter2;
                        try {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMCrashReporter", th, "writeException", new java.lang.Object[0]);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(printWriter);
                        } catch (java.lang.Throwable th7) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(printWriter);
                            throw th7;
                        }
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                }
            }
        }
    }

    @Override // z65.d
    public void a(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, java.lang.String str4) {
    }

    @Override // z65.d
    public void b(java.lang.String str, java.lang.String str2) {
        if (str == null || str.isEmpty()) {
            return;
        }
        android.os.ParcelFileDescriptor[] parcelFileDescriptorArr = f135332b;
        synchronized (parcelFileDescriptorArr) {
            if (parcelFileDescriptorArr[0] != null) {
                try {
                    java.io.PrintWriter printWriter = new java.io.PrintWriter(new java.io.FileWriter(parcelFileDescriptorArr[0].getFileDescriptor()));
                    try {
                        printWriter.print("version:" + ((java.lang.String) com.p314xaae8f345.mm.app.C5000x71a2fa35.f134777f.c(true)));
                        printWriter.println(str);
                        printWriter.close();
                    } finally {
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMCrashReporter", th6, "reportRawMessage", new java.lang.Object[0]);
                }
            }
        }
    }
}
