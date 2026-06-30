package com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd;

/* renamed from: com.tencent.matrix.trace.tracer.SignalAnrTracer */
/* loaded from: classes12.dex */
public class C4713xf13e442a extends kj.g0 {

    /* renamed from: e, reason: collision with root package name */
    public static long f134538e = 20000;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f134539f = false;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f134540g = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f134541h = "";

    /* renamed from: i, reason: collision with root package name */
    public static kj.x f134542i = null;

    /* renamed from: m, reason: collision with root package name */
    public static android.app.Application f134543m = null;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f134544n = false;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f134545o = false;

    /* renamed from: p, reason: collision with root package name */
    public static long f134546p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f134547q = "";

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f134548r = "";

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.String f134549s = "";

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.String f134550t = "";

    /* renamed from: u, reason: collision with root package name */
    public static long f134551u;

    /* renamed from: v, reason: collision with root package name */
    public static long f134552v;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("trace-canary");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/trace/tracer/SignalAnrTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/matrix/trace/tracer/SignalAnrTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public C4713xf13e442a(android.app.Application application, java.lang.String str, java.lang.String str2) {
        f134545o = true;
        f134540g = str;
        f134541h = str2;
        f134543m = application;
    }

    public static boolean h() {
        try {
            oj.j.c("SignalAnrTracer", "[checkErrorState] start", new java.lang.Object[0]);
            android.app.Application application = f134543m;
            if (application == null) {
                application = ih.d.d().f373004b;
            }
            java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> processesInErrorState = ((android.app.ActivityManager) application.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getProcessesInErrorState();
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
            com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.f134547q = r4     // Catch: java.lang.Exception -> L6f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
            r4.<init>(r0)     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.f134547q     // Catch: java.lang.Exception -> L6f
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
            com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.f134546p = r2     // Catch: java.lang.Exception -> L6f
            boolean r0 = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.f134539f     // Catch: java.lang.Exception -> L6f
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.i(boolean):void");
    }

    public static void j() {
        if (!f134545o) {
            oj.j.b("SignalAnrTracer", "SignalAnrTracer has not been initialize", new java.lang.Object[0]);
        } else if (f134541h.equals("")) {
            oj.j.b("SignalAnrTracer", "PrintTraceFilePath has not been set", new java.lang.Object[0]);
        } else {
            m41285xeda72e0f();
        }
    }

    public static void k(boolean z17, boolean z18) {
        kj.x xVar;
        try {
            try {
                xVar = f134542i;
            } catch (org.json.JSONException e17) {
                oj.j.b("SignalAnrTracer", "[JSONException error: %s", e17);
            }
            if (xVar == null) {
                dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
                if (bVar != null) {
                    java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134273v;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    oj.d.d(jSONObject, ih.d.d().f373004b);
                    if (z18) {
                        jSONObject.put("detail", fj.a.SIGNAL_ANR);
                        jSONObject.put("threadStack", f134549s);
                    } else {
                        jSONObject.put("detail", fj.a.SIGNAL_ANR_NATIVE_BACKTRACE);
                        jSONObject.put("threadStack", f134550t);
                    }
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str);
                    jSONObject.put("isProcessForeground", f134539f);
                    ri.d0 d0Var = new ri.d0();
                    d0Var.f477393b = "Trace_EvilMethod";
                    d0Var.f477395d = jSONObject;
                    bVar.d(d0Var);
                    oj.j.b("SignalAnrTracer", "happens real ANR : %s ", jSONObject.toString());
                }
            } else if (z18) {
                ((com.p314xaae8f345.mm.app.d4) xVar).a(f134549s, f134547q, f134546p, z17, f134548r);
            } else {
                ((com.p314xaae8f345.mm.app.d4) xVar).c(f134550t, f134547q, f134546p, z17);
            }
        } finally {
            f134551u = java.lang.System.currentTimeMillis();
        }
    }

    /* renamed from: nativeFreeSignalAnrDetective */
    private static native void m41283xbc8a1a3b();

    /* renamed from: nativeInitSignalAnrDetective */
    private static native void m41284xc93a87df(java.lang.String str, java.lang.String str2);

    /* renamed from: nativePrintTrace */
    private static native void m41285xeda72e0f();

    /* renamed from: onANRDumpTrace */
    private static void m41286x22d8e6cb() {
        java.lang.String str;
        kj.z zVar;
        kj.z zVar2;
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File(f134540g)), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            try {
                kj.a0 a0Var = new kj.a0(null);
                java.util.HashMap hashMap = a0Var.f389709d;
                java.util.LinkedList linkedList = a0Var.f389710e;
                while (true) {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    a0Var.d(readLine);
                    oj.j.c("SignalAnrTracer", readLine, new java.lang.Object[0]);
                }
                if (f134542i != null) {
                    if (a0Var.c()) {
                        kj.x xVar = f134542i;
                        java.lang.String str2 = a0Var.f389711f;
                        java.lang.String str3 = "";
                        if (linkedList != null && linkedList.size() != 0 && (zVar2 = (kj.z) hashMap.get(java.lang.Integer.valueOf(((kj.z) linkedList.get(0)).f389810a))) != null) {
                            str = zVar2.f389811b;
                            if (linkedList != null && linkedList.size() != 0 && (zVar = (kj.z) hashMap.get(java.lang.Integer.valueOf(((kj.z) linkedList.get(linkedList.size() - 1)).f389810a))) != null) {
                                str3 = zVar.f389811b;
                            }
                            ((com.p314xaae8f345.mm.app.d4) xVar).b(str2, str, str3, a0Var.b());
                        }
                        str = "";
                        if (linkedList != null) {
                            str3 = zVar.f389811b;
                        }
                        ((com.p314xaae8f345.mm.app.d4) xVar).b(str2, str, str3, a0Var.b());
                    } else if (a0Var.f389711f.contains("android.os.MessageQueue.nativePollOnce")) {
                        kj.x xVar2 = f134542i;
                        java.lang.String str4 = a0Var.f389711f;
                        ((com.p314xaae8f345.mm.app.d4) xVar2).getClass();
                        jx3.f.INSTANCE.d(28391, str4, "", "", "", com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134273v, 10, bm5.f1.a());
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

    /* renamed from: onANRDumped */
    private static synchronized void m41287x3f2078b9() {
        synchronized (com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.class) {
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            new java.lang.Thread(new kj.w(countDownLatch), "ANR-Dump-Thread").start();
            try {
                countDownLatch.await(f134538e, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    /* renamed from: onNativeBacktraceDumped */
    private static void m41288xb928ae3b() {
        oj.j.c("SignalAnrTracer", "happens onNativeBacktraceDumped", new java.lang.Object[0]);
        if (java.lang.System.currentTimeMillis() - f134551u < 20000) {
            oj.j.c("SignalAnrTracer", "report SIGQUIT recently, just return", new java.lang.Object[0]);
            return;
        }
        f134550t = lj.f.a();
        oj.j.c("SignalAnrTracer", "happens onNativeBacktraceDumped, mainThreadStackTrace = " + f134549s, new java.lang.Object[0]);
        i(false);
    }

    /* renamed from: onPrintTrace */
    private static void m41289xcec851d7() {
        try {
            oj.m.f("SignalAnrTracer", f134541h);
        } catch (java.lang.Throwable th6) {
            oj.j.b("SignalAnrTracer", "onPrintTrace error: %s", th6.getMessage());
        }
    }

    @Override // kj.g0
    public void d() {
        super.d();
        if (f134544n) {
            return;
        }
        m41284xc93a87df(f134540g, f134541h);
        lj.a aVar = lj.a.INSTANCE;
        if (!aVar.f400328d) {
            aVar.f400328d = true;
        }
        f134544n = true;
    }

    @Override // kj.g0
    public void f() {
        super.f();
        m41283xbc8a1a3b();
    }
}
