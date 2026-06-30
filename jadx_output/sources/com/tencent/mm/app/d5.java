package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final class d5 {

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f53387d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f53388e;

    /* renamed from: f, reason: collision with root package name */
    public static long f53389f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f53390g;

    /* renamed from: h, reason: collision with root package name */
    public static long f53391h;

    /* renamed from: i, reason: collision with root package name */
    public static long f53392i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile boolean f53393j;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.app.d5 f53384a = new com.tencent.mm.app.d5();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f53385b = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f53386c = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f53394k = jz5.h.b(com.tencent.mm.app.z4.f53938d);

    public static final void a(com.tencent.mm.app.d5 d5Var) {
        d5Var.getClass();
        if (f53387d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MatrixLifecycleForegroundMonitor", "Application entered background");
            f53387d = false;
            f53391h = java.lang.System.currentTimeMillis();
            java.util.Iterator it = f53386c.iterator();
            while (it.hasNext()) {
                try {
                    ((com.tencent.matrix.lifecycle.g) it.next()).a();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MatrixLifecycleForegroundMonitor", "Error calling onExplicitBackground: " + e17.getMessage());
                }
            }
            d5Var.d(false);
        }
    }

    public static final void b(com.tencent.mm.app.d5 d5Var) {
        d5Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (f53387d) {
            long j17 = f53389f;
            if (j17 <= 0 || currentTimeMillis - j17 >= 100) {
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.MatrixLifecycleForegroundMonitor", "Duplicate foreground notification within " + (currentTimeMillis - f53389f) + "ms");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MatrixLifecycleForegroundMonitor", "Application entered foreground");
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        long j18 = f53392i;
        boolean z17 = j18 > 0 && j18 >= f53391h - ((long) com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL) && j18 <= currentTimeMillis2;
        if ((!f53387d && f53390g && f53391h > 0 && !z17) && f53393j) {
            long j19 = currentTimeMillis2 - f53391h;
            long j27 = f53392i;
            long j28 = j27 > 0 ? currentTimeMillis2 - j27 : -1L;
            d5Var.d(true);
            com.tencent.mars.xlog.Log.w("MicroMsg.MatrixLifecycleForegroundMonitor", "AppForegroundDelegate state inconsistency detected! Matrix: background->foreground, AppDelegate: isAppForeground=" + f53390g + ", timeSinceMatrixBackground=" + j19 + "ms, timeSinceAppDelegateBackground=" + j28 + "ms, appDelegateBackgroundTimeValid=" + z17 + ", activity: resumed");
            d5Var.c("AppForegroundDelegate", j19, "scenario2");
        }
        f53389f = currentTimeMillis;
        f53387d = true;
        java.util.Iterator it = f53385b.iterator();
        while (it.hasNext()) {
            try {
                ((com.tencent.matrix.lifecycle.h) it.next()).onEnterForeground();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MatrixLifecycleForegroundMonitor", "Error calling onEnterForeground: " + e17.getMessage());
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.d5.c(java.lang.String, long, java.lang.String):void");
    }

    public final void d(boolean z17) {
        if (((java.lang.Boolean) ((jz5.n) f53394k).getValue()).booleanValue() && z17) {
            com.tencent.mm.app.w wVar = com.tencent.mm.app.w.INSTANCE;
            wVar.f53882d.post(new com.tencent.mm.app.f(wVar, ""));
        }
    }
}
