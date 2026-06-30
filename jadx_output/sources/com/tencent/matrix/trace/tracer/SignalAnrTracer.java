package com.tencent.matrix.trace.tracer;

/* loaded from: classes12.dex */
public class SignalAnrTracer extends kj.g0 {

    /* renamed from: e, reason: collision with root package name */
    public static long f53005e = 20000;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f53006f = false;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f53007g = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f53008h = "";

    /* renamed from: i, reason: collision with root package name */
    public static kj.x f53009i = null;

    /* renamed from: m, reason: collision with root package name */
    public static android.app.Application f53010m = null;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f53011n = false;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f53012o = false;

    /* renamed from: p, reason: collision with root package name */
    public static long f53013p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f53014q = "";

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f53015r = "";

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.String f53016s = "";

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.String f53017t = "";

    /* renamed from: u, reason: collision with root package name */
    public static long f53018u;

    /* renamed from: v, reason: collision with root package name */
    public static long f53019v;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("trace-canary");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/trace/tracer/SignalAnrTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/matrix/trace/tracer/SignalAnrTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public SignalAnrTracer(android.app.Application application, java.lang.String str, java.lang.String str2) {
        f53012o = true;
        f53007g = str;
        f53008h = str2;
        f53010m = application;
    }

    public static boolean h() {
        try {
            oj.j.c("SignalAnrTracer", "[checkErrorState] start", new java.lang.Object[0]);
            android.app.Application application = f53010m;
            if (application == null) {
                application = ih.d.d().f291471b;
            }
            java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> processesInErrorState = ((android.app.ActivityManager) application.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getProcessesInErrorState();
            if (processesInErrorState == null) {
                oj.j.c("SignalAnrTracer", "[checkErrorState] procs == null", new java.lang.Object[0]);
                return false;
            }
            for (android.app.ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                oj.j.c("SignalAnrTracer", "[checkErrorState] found Error State proccessName = %s, proc.condition = %d", processErrorStateInfo.processName, java.lang.Integer.valueOf(processErrorStateInfo.condition));
                if (processErrorStateInfo.uid != android.os.Process.myUid() && processErrorStateInfo.condition == 2) {
                    oj.j.c("SignalAnrTracer", "maybe received other apps ANR signal", new java.lang.Object[0]);
                    return false;
                }
                if (processErrorStateInfo.pid == android.os.Process.myPid() && processErrorStateInfo.condition == 2) {
                    oj.j.c("SignalAnrTracer", "error sate longMsg = %s", processErrorStateInfo.longMsg);
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th6) {
            oj.j.b("SignalAnrTracer", "[checkErrorState] error : %s", th6.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(boolean r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "confirmRealAnr, isSigQuit = "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "SignalAnrTracer"
            oj.j.c(r3, r0, r2)
            java.lang.String r0 = "anrMessageString = "
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Exception -> L6f
            android.os.MessageQueue r2 = r2.getQueue()     // Catch: java.lang.Exception -> L6f
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Exception -> L6f
            java.lang.String r5 = "mMessages"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.Exception -> L6f
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Exception -> L6f
            java.lang.Object r2 = r4.get(r2)     // Catch: java.lang.Exception -> L6f
            android.os.Message r2 = (android.os.Message) r2     // Catch: java.lang.Exception -> L6f
            if (r2 == 0) goto L71
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Exception -> L6f
            com.tencent.matrix.trace.tracer.SignalAnrTracer.f53014q = r4     // Catch: java.lang.Exception -> L6f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
            r4.<init>(r0)     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = com.tencent.matrix.trace.tracer.SignalAnrTracer.f53014q     // Catch: java.lang.Exception -> L6f
            r4.append(r0)     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L6f
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L6f
            oj.j.c(r3, r0, r4)     // Catch: java.lang.Exception -> L6f
            long r2 = r2.getWhen()     // Catch: java.lang.Exception -> L6f
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L5a
            goto L6f
        L5a:
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L6f
            long r2 = r2 - r6
            com.tencent.matrix.trace.tracer.SignalAnrTracer.f53013p = r2     // Catch: java.lang.Exception -> L6f
            boolean r0 = com.tencent.matrix.trace.tracer.SignalAnrTracer.f53006f     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L68
            r6 = -2000(0xfffffffffffff830, double:NaN)
            goto L6a
        L68:
            r6 = -10000(0xffffffffffffd8f0, double:NaN)
        L6a:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L6f
            goto L79
        L6f:
            r5 = r1
            goto L79
        L71:
            java.lang.String r0 = "mMessage is null"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L6f
            oj.j.c(r3, r0, r2)     // Catch: java.lang.Exception -> L6f
            goto L6f
        L79:
            if (r5 == 0) goto L7f
            k(r1, r8)
            goto L8e
        L7f:
            java.lang.Thread r0 = new java.lang.Thread
            kj.v r1 = new kj.v
            r1.<init>(r8)
            java.lang.String r8 = "Check-ANR-State-Thread"
            r0.<init>(r1, r8)
            r0.start()
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.trace.tracer.SignalAnrTracer.i(boolean):void");
    }

    public static void j() {
        if (!f53012o) {
            oj.j.b("SignalAnrTracer", "SignalAnrTracer has not been initialize", new java.lang.Object[0]);
        } else if (f53008h.equals("")) {
            oj.j.b("SignalAnrTracer", "PrintTraceFilePath has not been set", new java.lang.Object[0]);
        } else {
            nativePrintTrace();
        }
    }

    public static void k(boolean z17, boolean z18) {
        kj.x xVar;
        try {
            try {
                xVar = f53009i;
            } catch (org.json.JSONException e17) {
                oj.j.b("SignalAnrTracer", "[JSONException error: %s", e17);
            }
            if (xVar == null) {
                dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
                if (bVar != null) {
                    java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52740v;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    oj.d.d(jSONObject, ih.d.d().f291471b);
                    if (z18) {
                        jSONObject.put("detail", fj.a.SIGNAL_ANR);
                        jSONObject.put("threadStack", f53016s);
                    } else {
                        jSONObject.put("detail", fj.a.SIGNAL_ANR_NATIVE_BACKTRACE);
                        jSONObject.put("threadStack", f53017t);
                    }
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str);
                    jSONObject.put("isProcessForeground", f53006f);
                    ri.d0 d0Var = new ri.d0();
                    d0Var.f395860b = "Trace_EvilMethod";
                    d0Var.f395862d = jSONObject;
                    bVar.d(d0Var);
                    oj.j.b("SignalAnrTracer", "happens real ANR : %s ", jSONObject.toString());
                }
            } else if (z18) {
                ((com.tencent.mm.app.d4) xVar).a(f53016s, f53014q, f53013p, z17, f53015r);
            } else {
                ((com.tencent.mm.app.d4) xVar).c(f53017t, f53014q, f53013p, z17);
            }
        } finally {
            f53018u = java.lang.System.currentTimeMillis();
        }
    }

    private static native void nativeFreeSignalAnrDetective();

    private static native void nativeInitSignalAnrDetective(java.lang.String str, java.lang.String str2);

    private static native void nativePrintTrace();

    private static void onANRDumpTrace() {
        java.lang.String str;
        kj.z zVar;
        kj.z zVar2;
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File(f53007g)), com.tencent.mapsdk.internal.rv.f51270c));
            try {
                kj.a0 a0Var = new kj.a0(null);
                java.util.HashMap hashMap = a0Var.f308176d;
                java.util.LinkedList linkedList = a0Var.f308177e;
                while (true) {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    a0Var.d(readLine);
                    oj.j.c("SignalAnrTracer", readLine, new java.lang.Object[0]);
                }
                if (f53009i != null) {
                    if (a0Var.c()) {
                        kj.x xVar = f53009i;
                        java.lang.String str2 = a0Var.f308178f;
                        java.lang.String str3 = "";
                        if (linkedList != null && linkedList.size() != 0 && (zVar2 = (kj.z) hashMap.get(java.lang.Integer.valueOf(((kj.z) linkedList.get(0)).f308277a))) != null) {
                            str = zVar2.f308278b;
                            if (linkedList != null && linkedList.size() != 0 && (zVar = (kj.z) hashMap.get(java.lang.Integer.valueOf(((kj.z) linkedList.get(linkedList.size() - 1)).f308277a))) != null) {
                                str3 = zVar.f308278b;
                            }
                            ((com.tencent.mm.app.d4) xVar).b(str2, str, str3, a0Var.b());
                        }
                        str = "";
                        if (linkedList != null) {
                            str3 = zVar.f308278b;
                        }
                        ((com.tencent.mm.app.d4) xVar).b(str2, str, str3, a0Var.b());
                    } else if (a0Var.f308178f.contains("android.os.MessageQueue.nativePollOnce")) {
                        kj.x xVar2 = f53009i;
                        java.lang.String str4 = a0Var.f308178f;
                        ((com.tencent.mm.app.d4) xVar2).getClass();
                        jx3.f.INSTANCE.d(28391, str4, "", "", "", com.tencent.matrix.lifecycle.owners.f0.f52740v, 10, bm5.f1.a());
                    }
                }
                bufferedReader.close();
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            try {
                oj.j.b("SignalAnrTracer", "printFileByLine failed e : " + th6.getMessage(), new java.lang.Object[0]);
            } catch (java.lang.Throwable th7) {
                oj.j.b("SignalAnrTracer", "onANRDumpTrace error: %s", th7.getMessage());
            }
        }
    }

    private static synchronized void onANRDumped() {
        synchronized (com.tencent.matrix.trace.tracer.SignalAnrTracer.class) {
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            new java.lang.Thread(new kj.w(countDownLatch), "ANR-Dump-Thread").start();
            try {
                countDownLatch.await(f53005e, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    private static void onNativeBacktraceDumped() {
        oj.j.c("SignalAnrTracer", "happens onNativeBacktraceDumped", new java.lang.Object[0]);
        if (java.lang.System.currentTimeMillis() - f53018u < 20000) {
            oj.j.c("SignalAnrTracer", "report SIGQUIT recently, just return", new java.lang.Object[0]);
            return;
        }
        f53017t = lj.f.a();
        oj.j.c("SignalAnrTracer", "happens onNativeBacktraceDumped, mainThreadStackTrace = " + f53016s, new java.lang.Object[0]);
        i(false);
    }

    private static void onPrintTrace() {
        try {
            oj.m.f("SignalAnrTracer", f53008h);
        } catch (java.lang.Throwable th6) {
            oj.j.b("SignalAnrTracer", "onPrintTrace error: %s", th6.getMessage());
        }
    }

    @Override // kj.g0
    public void d() {
        super.d();
        if (f53011n) {
            return;
        }
        nativeInitSignalAnrDetective(f53007g, f53008h);
        lj.a aVar = lj.a.INSTANCE;
        if (!aVar.f318795d) {
            aVar.f318795d = true;
        }
        f53011n = true;
    }

    @Override // kj.g0
    public void f() {
        super.f();
        nativeFreeSignalAnrDetective();
    }
}
