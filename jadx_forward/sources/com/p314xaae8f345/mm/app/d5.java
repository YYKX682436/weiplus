package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public final class d5 {

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f134920d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f134921e;

    /* renamed from: f, reason: collision with root package name */
    public static long f134922f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f134923g;

    /* renamed from: h, reason: collision with root package name */
    public static long f134924h;

    /* renamed from: i, reason: collision with root package name */
    public static long f134925i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile boolean f134926j;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.d5 f134917a = new com.p314xaae8f345.mm.app.d5();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f134918b = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f134919c = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f134927k = jz5.h.b(com.p314xaae8f345.mm.app.z4.f135471d);

    public static final void a(com.p314xaae8f345.mm.app.d5 d5Var) {
        d5Var.getClass();
        if (f134920d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixLifecycleForegroundMonitor", "Application entered background");
            f134920d = false;
            f134924h = java.lang.System.currentTimeMillis();
            java.util.Iterator it = f134919c.iterator();
            while (it.hasNext()) {
                try {
                    ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g) it.next()).a();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MatrixLifecycleForegroundMonitor", "Error calling onExplicitBackground: " + e17.getMessage());
                }
            }
            d5Var.d(false);
        }
    }

    public static final void b(com.p314xaae8f345.mm.app.d5 d5Var) {
        d5Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (f134920d) {
            long j17 = f134922f;
            if (j17 <= 0 || currentTimeMillis - j17 >= 100) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MatrixLifecycleForegroundMonitor", "Duplicate foreground notification within " + (currentTimeMillis - f134922f) + "ms");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixLifecycleForegroundMonitor", "Application entered foreground");
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        long j18 = f134925i;
        boolean z17 = j18 > 0 && j18 >= f134924h - ((long) com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8) && j18 <= currentTimeMillis2;
        if ((!f134920d && f134923g && f134924h > 0 && !z17) && f134926j) {
            long j19 = currentTimeMillis2 - f134924h;
            long j27 = f134925i;
            long j28 = j27 > 0 ? currentTimeMillis2 - j27 : -1L;
            d5Var.d(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MatrixLifecycleForegroundMonitor", "AppForegroundDelegate state inconsistency detected! Matrix: background->foreground, AppDelegate: isAppForeground=" + f134923g + ", timeSinceMatrixBackground=" + j19 + "ms, timeSinceAppDelegateBackground=" + j28 + "ms, appDelegateBackgroundTimeValid=" + z17 + ", activity: resumed");
            d5Var.c("AppForegroundDelegate", j19, "scenario2");
        }
        f134922f = currentTimeMillis;
        f134920d = true;
        java.util.Iterator it = f134918b.iterator();
        while (it.hasNext()) {
            try {
                ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h) it.next()).mo8896x832bee5c();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MatrixLifecycleForegroundMonitor", "Error calling onEnterForeground: " + e17.getMessage());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object[]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x00dd -> B:63:0x0102). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r23, long r24, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.app.d5.c(java.lang.String, long, java.lang.String):void");
    }

    public final void d(boolean z17) {
        if (((java.lang.Boolean) ((jz5.n) f134927k).mo141623x754a37bb()).booleanValue() && z17) {
            com.p314xaae8f345.mm.app.w wVar = com.p314xaae8f345.mm.app.w.INSTANCE;
            wVar.f135415d.post(new com.p314xaae8f345.mm.app.f(wVar, ""));
        }
    }
}
