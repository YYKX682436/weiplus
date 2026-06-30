package org.p3343x72743996.p3344x2e06d1;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "base::android")
@org.p3343x72743996.p3353x59bc66e.p3354xc6ad7b24.InterfaceC29461x94c0977e
/* renamed from: org.chromium.base.EarlyTraceEvent */
/* loaded from: classes13.dex */
public class C29300x52da9ff8 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73260x7118e671 = false;

    /* renamed from: BACKGROUND_STARTUP_TRACING_ENABLED_KEY */
    private static final java.lang.String f73261x5f24df91 = "bg_startup_tracing";

    /* renamed from: STATE_DISABLED */
    static final int f73262x6908fe8a = 0;

    /* renamed from: STATE_ENABLED */
    static final int f73263x1ecc8953 = 1;

    /* renamed from: STATE_FINISHED */
    static final int f73264x30bb8480 = 2;

    /* renamed from: TRACE_CONFIG_FILENAME */
    private static final java.lang.String f73265xad946b4a = "/data/local/chrome-trace-config.json";

    /* renamed from: TRACE_EARLY_JAVA_IN_CHILD_SWITCH */
    public static final java.lang.String f73266x82d7d36a = "trace-early-java-in-child";

    /* renamed from: TRACE_STARTUP_SWITCH */
    private static final java.lang.String f73267x3c5bcdb0 = "trace-startup";

    /* renamed from: sAsyncEvents */
    static java.util.List<org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.AsyncEvent> f73268xa86bf442;

    /* renamed from: sCachedBackgroundStartupTracingFlag */
    private static boolean f73269x87902874;

    /* renamed from: sEnabledInChildProcessBeforeCommandLine */
    private static volatile boolean f73270xbc9aff1a;

    /* renamed from: sEvents */
    static java.util.List<org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Event> f73271x3fd96b6c;

    /* renamed from: sLock */
    static final java.lang.Object f73272x678c83e = new java.lang.Object();

    /* renamed from: sState */
    static volatile int f73273xc90523de;

    /* renamed from: org.chromium.base.EarlyTraceEvent$AsyncEvent */
    /* loaded from: classes13.dex */
    public static final class AsyncEvent {
        final long mId;

        /* renamed from: mIsStart */
        final boolean f73274x198c242b;

        /* renamed from: mName */
        final java.lang.String f73275x624f098;

        /* renamed from: mTimeNanos */
        final long f73276x7bee9b85 = java.lang.System.nanoTime();

        public AsyncEvent(java.lang.String str, long j17, boolean z17) {
            this.f73275x624f098 = str;
            this.mId = j17;
            this.f73274x198c242b = z17;
        }
    }

    /* renamed from: org.chromium.base.EarlyTraceEvent$Event */
    /* loaded from: classes13.dex */
    public static final class Event {

        /* renamed from: mIsStart */
        final boolean f73277x198c242b;

        /* renamed from: mIsToplevel */
        final boolean f73278x740606e6;

        /* renamed from: mName */
        final java.lang.String f73279x624f098;

        /* renamed from: mThreadId */
        final int f73280x7cd36452 = android.os.Process.myTid();

        /* renamed from: mTimeNanos */
        final long f73282x7bee9b85 = java.lang.System.nanoTime();

        /* renamed from: mThreadTimeMillis */
        final long f73281x3aadfbaa = android.os.SystemClock.currentThreadTimeMillis();

        public Event(java.lang.String str, boolean z17, boolean z18) {
            this.f73277x198c242b = z17;
            this.f73278x740606e6 = z18;
            this.f73279x624f098 = str;
        }
    }

    /* renamed from: org.chromium.base.EarlyTraceEvent$Natives */
    /* loaded from: classes13.dex */
    public interface Natives {
        /* renamed from: recordEarlyAsyncBeginEvent */
        void mo152390x95b8db1b(java.lang.String str, long j17, long j18);

        /* renamed from: recordEarlyAsyncEndEvent */
        void mo152391x3b6bfca9(long j17, long j18);

        /* renamed from: recordEarlyBeginEvent */
        void mo152392x25fa5ea3(java.lang.String str, long j17, int i17, long j18);

        /* renamed from: recordEarlyEndEvent */
        void mo152393x6fc8c231(java.lang.String str, long j17, int i17, long j18);

        /* renamed from: recordEarlyToplevelBeginEvent */
        void mo152394xdfc1b952(java.lang.String str, long j17, int i17, long j18);

        /* renamed from: recordEarlyToplevelEndEvent */
        void mo152395x73b4fca0(java.lang.String str, long j17, int i17, long j18);
    }

    /* renamed from: begin */
    public static void m152375x59478a9(java.lang.String str, boolean z17) {
        if (m152381xa00f8b41()) {
            org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Event event = new org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Event(str, true, z17);
            synchronized (f73272x678c83e) {
                if (m152381xa00f8b41()) {
                    f73271x3fd96b6c.add(event);
                }
            }
        }
    }

    /* renamed from: disable */
    public static void m152376x639e22e8() {
        synchronized (f73272x678c83e) {
            if (m152381xa00f8b41()) {
                if (!f73271x3fd96b6c.isEmpty()) {
                    m152378xbfdc02d(f73271x3fd96b6c);
                    f73271x3fd96b6c.clear();
                }
                if (!f73268xa86bf442.isEmpty()) {
                    m152377x73337021(f73268xa86bf442);
                    f73268xa86bf442.clear();
                }
                f73273xc90523de = 2;
                f73271x3fd96b6c = null;
                f73268xa86bf442 = null;
            }
        }
    }

    /* renamed from: dumpAsyncEvents */
    private static void m152377x73337021(java.util.List<org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.AsyncEvent> list) {
        for (org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.AsyncEvent asyncEvent : list) {
            if (asyncEvent.f73274x198c242b) {
                org.p3343x72743996.p3344x2e06d1.C29301xcf9ee08d.get().mo152390x95b8db1b(asyncEvent.f73275x624f098, asyncEvent.mId, asyncEvent.f73276x7bee9b85);
            } else {
                org.p3343x72743996.p3344x2e06d1.C29301xcf9ee08d.get().mo152391x3b6bfca9(asyncEvent.mId, asyncEvent.f73276x7bee9b85);
            }
        }
    }

    /* renamed from: dumpEvents */
    private static void m152378xbfdc02d(java.util.List<org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Event> list) {
        for (org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Event event : list) {
            if (event.f73277x198c242b) {
                if (event.f73278x740606e6) {
                    org.p3343x72743996.p3344x2e06d1.C29301xcf9ee08d.get().mo152394xdfc1b952(event.f73279x624f098, event.f73282x7bee9b85, event.f73280x7cd36452, event.f73281x3aadfbaa);
                } else {
                    org.p3343x72743996.p3344x2e06d1.C29301xcf9ee08d.get().mo152392x25fa5ea3(event.f73279x624f098, event.f73282x7bee9b85, event.f73280x7cd36452, event.f73281x3aadfbaa);
                }
            } else if (event.f73278x740606e6) {
                org.p3343x72743996.p3344x2e06d1.C29301xcf9ee08d.get().mo152395x73b4fca0(event.f73279x624f098, event.f73282x7bee9b85, event.f73280x7cd36452, event.f73281x3aadfbaa);
            } else {
                org.p3343x72743996.p3344x2e06d1.C29301xcf9ee08d.get().mo152393x6fc8c231(event.f73279x624f098, event.f73282x7bee9b85, event.f73280x7cd36452, event.f73281x3aadfbaa);
            }
        }
    }

    /* renamed from: earlyEnableInChildWithoutCommandLine */
    public static void m152379x89d94b28() {
        f73270xbc9aff1a = true;
        m152380xb2952583();
    }

    /* renamed from: enable */
    public static void m152380xb2952583() {
        synchronized (f73272x678c83e) {
            if (f73273xc90523de != 0) {
                return;
            }
            f73271x3fd96b6c = new java.util.ArrayList();
            f73268xa86bf442 = new java.util.ArrayList();
            f73273xc90523de = 1;
        }
    }

    /* renamed from: enabled */
    public static boolean m152381xa00f8b41() {
        return f73273xc90523de == 1;
    }

    public static void end(java.lang.String str, boolean z17) {
        if (m152381xa00f8b41()) {
            org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Event event = new org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Event(str, false, z17);
            synchronized (f73272x678c83e) {
                if (m152381xa00f8b41()) {
                    f73271x3fd96b6c.add(event);
                }
            }
        }
    }

    /* renamed from: finishAsync */
    public static void m152382x4eb069a9(java.lang.String str, long j17) {
        if (m152381xa00f8b41()) {
            org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.AsyncEvent asyncEvent = new org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.AsyncEvent(str, j17, false);
            synchronized (f73272x678c83e) {
                if (m152381xa00f8b41()) {
                    f73268xa86bf442.add(asyncEvent);
                }
            }
        }
    }

    /* renamed from: getBackgroundStartupTracingFlag */
    public static boolean m152383x7b9040d5() {
        return f73269x87902874;
    }

    /* renamed from: getMatchingCompletedEventsForTesting */
    public static java.util.List<org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Event> m152384x29e1d38(java.lang.String str) {
        java.util.ArrayList arrayList;
        synchronized (f73272x678c83e) {
            arrayList = new java.util.ArrayList();
            for (org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Event event : f73271x3fd96b6c) {
                if (event.f73279x624f098.equals(str)) {
                    arrayList.add(event);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: maybeEnableInBrowserProcess */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m152385xfb8180d7() {
        /*
            org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152651x286f5ca3()
            int r0 = org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.f73273xc90523de
            if (r0 == 0) goto L8
            return
        L8:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            org.chromium.base.CommandLine r1 = org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.m152292x9cf0d20b()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = "trace-startup"
            boolean r1 = r1.mo152309xefec5a6e(r2)     // Catch: java.lang.Throwable -> L4a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = r2
            goto L29
        L1c:
            java.io.File r1 = new java.io.File     // Catch: java.lang.SecurityException -> L28 java.lang.Throwable -> L4a
            java.lang.String r4 = "/data/local/chrome-trace-config.json"
            r1.<init>(r4)     // Catch: java.lang.SecurityException -> L28 java.lang.Throwable -> L4a
            boolean r1 = r1.exists()     // Catch: java.lang.SecurityException -> L28 java.lang.Throwable -> L4a
            goto L29
        L28:
            r1 = r3
        L29:
            android.content.SharedPreferences r4 = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152347xccd281a8()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = "bg_startup_tracing"
            boolean r4 = r4.getBoolean(r5, r3)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L40
            if (r1 == 0) goto L3d
            m152388x7679a3e1(r3)     // Catch: java.lang.Throwable -> L4a
            org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.f73269x87902874 = r3     // Catch: java.lang.Throwable -> L4a
            goto L40
        L3d:
            org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.f73269x87902874 = r2     // Catch: java.lang.Throwable -> L4a
            goto L41
        L40:
            r2 = r1
        L41:
            android.os.StrictMode.setThreadPolicy(r0)
            if (r2 == 0) goto L49
            m152380xb2952583()
        L49:
            return
        L4a:
            r1 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.m152385xfb8180d7():void");
    }

    /* renamed from: onCommandLineAvailableInChildProcess */
    public static void m152386x8490b801() {
        if (f73270xbc9aff1a) {
            synchronized (f73272x678c83e) {
                if (!org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.m152292x9cf0d20b().mo152309xefec5a6e(f73266x82d7d36a)) {
                    m152387x6761d4f();
                } else {
                    if (f73273xc90523de == 0) {
                        m152380xb2952583();
                    }
                }
            }
        }
    }

    /* renamed from: reset */
    public static void m152387x6761d4f() {
        synchronized (f73272x678c83e) {
            f73273xc90523de = 0;
            f73271x3fd96b6c = null;
            f73268xa86bf442 = null;
        }
    }

    /* renamed from: setBackgroundStartupTracingFlag */
    public static void m152388x7679a3e1(boolean z17) {
        org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152646x9633ec9a = org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3.m152646x9633ec9a();
        try {
            org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152347xccd281a8().edit().putBoolean(f73261x5f24df91, z17).apply();
            if (m152646x9633ec9a != null) {
                m152646x9633ec9a.close();
            }
        } catch (java.lang.Throwable th6) {
            if (m152646x9633ec9a != null) {
                try {
                    m152646x9633ec9a.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: startAsync */
    public static void m152389xa094bb3a(java.lang.String str, long j17) {
        if (m152381xa00f8b41()) {
            org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.AsyncEvent asyncEvent = new org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.AsyncEvent(str, j17, true);
            synchronized (f73272x678c83e) {
                if (m152381xa00f8b41()) {
                    f73268xa86bf442.add(asyncEvent);
                }
            }
        }
    }
}
