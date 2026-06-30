package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final class t4 implements z65.d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.app.t4[] f53798a = {null};

    /* renamed from: b, reason: collision with root package name */
    public static final android.os.ParcelFileDescriptor[] f53799b = {null};

    public static java.lang.String c(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(new java.io.File(new java.io.File(context.getFilesDir(), com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN).getAbsolutePath()), "java_" + str.replace(':', '_') + "_" + java.lang.System.currentTimeMillis() + "_" + str2 + ".dmp");
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static java.lang.String d(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(new java.io.File(new java.io.File(context.getFilesDir(), com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN).getAbsolutePath()), "NativeCrash_" + str.replace(':', '_') + "_" + java.lang.System.currentTimeMillis() + "_" + str2 + ".dmp");
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static void e(java.lang.String str, java.lang.Throwable th6) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMCrashReporter", "Crash msg content size: %s", java.lang.Integer.valueOf(str.length()));
            if ((th6 instanceof com.tencent.mm.support.feature_service.ServiceDefException) || (th6.getCause() instanceof com.tencent.mm.support.feature_service.ServiceDefException)) {
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
                th6.printStackTrace(printWriter);
                printWriter.close();
                str = stringWriter.toString();
            }
            g(com.tencent.mm.app.MMCrashReportContents.b("", str, true, false), 0, false, true);
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMCrashReporter", th7, "Failed reporting java crash.", new java.lang.Object[0]);
            throw th7;
        }
    }

    public static void f(final android.content.Context context, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        com.tencent.mm.app.t4[] t4VarArr = f53798a;
        if (t4VarArr[0] != null) {
            return;
        }
        synchronized (t4VarArr) {
            if (t4VarArr[0] != null) {
                return;
            }
            com.tencent.mm.app.t4 t4Var = new com.tencent.mm.app.t4();
            t4VarArr[0] = t4Var;
            z65.c.f470457c = t4Var;
            android.os.ParcelFileDescriptor[] parcelFileDescriptorArr = f53799b;
            synchronized (parcelFileDescriptorArr) {
                parcelFileDescriptorArr[0] = parcelFileDescriptor;
            }
            com.tencent.mm.app.MMCrashReportContents.f53242e.e((java.lang.String) com.tencent.mm.app.z3.b(new com.tencent.mm.app.t4$$a()));
            com.tencent.mm.app.MMCrashReportContents.f53244f.e(com.tencent.mm.sdk.platformtools.z.f193111g);
            com.tencent.mm.app.MMCrashReportContents.f53248h.e(com.tencent.mm.sdk.platformtools.z.f193109e);
            com.tencent.mm.app.MMCrashReportContents.f53250i.f(new com.tencent.mm.app.t4$$c());
            com.tencent.mm.app.MMCrashReportContents.f53252j.e((java.lang.String) com.tencent.mm.app.z3.b(new com.tencent.mm.app.t4$$e()));
            com.tencent.mm.app.MMCrashReportContents.f53254k.e(com.tencent.mm.sdk.platformtools.z.f193107c);
            com.tencent.mm.app.MMCrashReportContents.f53256l.e(com.tencent.mm.sdk.platformtools.z.f193106b);
            com.tencent.mm.app.MMCrashReportContents.f53260o.e(java.lang.Long.valueOf(com.tencent.mm.app.x.f53906a));
            com.tencent.mm.app.MMCrashReportContents.f53264s.e((java.lang.String) com.tencent.mm.app.z3.b(new com.tencent.mm.app.t4$$f()));
            com.tencent.mm.app.MMCrashReportContents.f53265t.e(android.os.Build.CPU_ABI);
            com.tencent.mm.app.MMCrashReportContents.f53270y.e((java.lang.Integer) com.tencent.mm.app.z3.b(new com.tencent.mm.app.t4$$g()));
            com.tencent.mm.app.MMCrashReportContents.f53271z.e((java.lang.Boolean) com.tencent.mm.app.z3.b(new com.tencent.mm.app.t4$$h()));
            try {
                com.tencent.mm.app.w.INSTANCE.a(new com.tencent.mm.app.u4());
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mm.app.MMCrashReportContents.B.f(new com.tencent.mm.app.t4$$i());
            com.tencent.mm.app.MMCrashReportContents.A.f(new com.tencent.mm.app.t4$$j());
            com.tencent.mm.app.MMCrashReportContents.f53261p.f(new com.tencent.mm.app.t4$$k());
            try {
                new java.lang.Runnable() { // from class: com.tencent.mm.app.t4$$l
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.app.MMCrashReportContents.K.e(java.lang.Integer.valueOf(com.tencent.xweb.a3.f(context)));
                        if (org.xwalk.core.XWalkEnvironment.f347970c != null) {
                            com.tencent.mm.app.MMCrashReportContents.L.e(java.lang.Integer.valueOf(by5.e.d()));
                        }
                        com.tencent.mm.app.MMCrashReportContents.M.e(java.lang.Integer.valueOf(org.xwalk.core.XWalkEnvironment.k()));
                        com.tencent.mm.app.MMCrashReportContents.N.e(java.lang.Boolean.valueOf(org.xwalk.core.XWalkEnvironment.e()));
                    }
                }.run();
            } catch (java.lang.Throwable unused2) {
            }
            try {
                new com.tencent.mm.app.t4$$m().run();
            } catch (java.lang.Throwable unused3) {
            }
            com.tencent.mm.app.MMCrashReportContents.X.f(new com.tencent.mm.app.t4$$n());
            com.tencent.mm.app.MMCrashReportContents.f53235a0.e((java.lang.Integer) com.tencent.mm.app.z3.b(new com.tencent.mm.app.t4$$o()));
            com.tencent.mm.app.MMCrashReportContents.f53237b0.e((java.lang.String) com.tencent.mm.app.z3.b(new java.util.concurrent.Callable() { // from class: com.tencent.mm.app.t4$$p
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return com.tencent.mm.sdk.platformtools.c7.c(context);
                }
            }));
            com.tencent.mm.app.MMCrashReportContents.f53239c0.e((java.lang.String) com.tencent.mm.app.z3.b(new java.util.concurrent.Callable() { // from class: com.tencent.mm.app.t4$$q
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return com.tencent.mm.sdk.platformtools.c7.a(context);
                }
            }));
            com.tencent.mm.app.MMCrashReportContents.f53249h0.e((java.lang.String) com.tencent.mm.app.z3.b(new com.tencent.mm.app.t4$$r()));
            com.tencent.mm.app.MMCrashReportContents.f53251i0.f(new com.tencent.mm.app.t4$$s());
            com.tencent.mm.app.MMCrashReportContents.f53253j0.f(new com.tencent.mm.app.t4$$t());
            com.tencent.mm.app.MMCrashReportContents.Y.f(new com.tencent.mm.app.t4$$b());
            com.tencent.mm.app.MMCrashReportContents.f53255k0.f(new com.tencent.mm.app.t4$$d());
        }
    }

    public static void g(java.lang.String str, int i17, boolean z17, boolean z18) {
        if (str == null || str.isEmpty()) {
            return;
        }
        com.tencent.mm.app.z3.a("MicroMsg.MMCrashReporter", str);
        android.os.ParcelFileDescriptor[] parcelFileDescriptorArr = f53799b;
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
                        printWriter2.print("version:" + ((java.lang.String) com.tencent.mm.app.MMCrashReportContents.f53244f.c(true)));
                        printWriter2.println(trim);
                        com.tencent.mm.sdk.platformtools.t8.v1(printWriter2);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        printWriter = printWriter2;
                        try {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMCrashReporter", th, "writeException", new java.lang.Object[0]);
                            com.tencent.mm.sdk.platformtools.t8.v1(printWriter);
                        } catch (java.lang.Throwable th7) {
                            com.tencent.mm.sdk.platformtools.t8.v1(printWriter);
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
        android.os.ParcelFileDescriptor[] parcelFileDescriptorArr = f53799b;
        synchronized (parcelFileDescriptorArr) {
            if (parcelFileDescriptorArr[0] != null) {
                try {
                    java.io.PrintWriter printWriter = new java.io.PrintWriter(new java.io.FileWriter(parcelFileDescriptorArr[0].getFileDescriptor()));
                    try {
                        printWriter.print("version:" + ((java.lang.String) com.tencent.mm.app.MMCrashReportContents.f53244f.c(true)));
                        printWriter.println(str);
                        printWriter.close();
                    } finally {
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMCrashReporter", th6, "reportRawMessage", new java.lang.Object[0]);
                }
            }
        }
    }
}
