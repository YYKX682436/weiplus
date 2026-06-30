package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.matrix.monitor.e1 f68748a = new com.tencent.mm.matrix.monitor.e1();

    /* renamed from: b, reason: collision with root package name */
    public static final long f68749b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f68750c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f68751d;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        f68749b = timeUnit.toMillis(1L);
        f68750c = timeUnit.toMillis(3L);
        f68751d = timeUnit.toMillis(5L);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:1|(7:4|5|6|8|(3:13|14|15)|16|2)|22|23|(1:25)|117|(19:121|(33:123|35|(1:115)(1:39)|40|(1:114)(1:44)|45|(1:113)(1:49)|50|51|125|56|57|58|(1:60)|61|62|(1:64)|65|(1:67)|68|(1:70)|72|73|74|75|(6:79|80|81|82|76|77)|94|95|96|85|(1:93)(1:89)|90|91)|28|(1:30)|31|(1:33)(1:116)|34|35|(1:37)|115|40|(1:42)|114|45|(1:47)|113|50|51|125)|27|28|(0)|31|(0)(0)|34|35|(0)|115|40|(0)|114|45|(0)|113|50|51|125|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0131, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0132, code lost:
    
        oj.j.d("MicroMsg.monitor.ProcBackgroundMemory", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r5.f53091f <= 367001600) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.tencent.mm.matrix.monitor.e1 r56, com.tencent.matrix.util.MemInfo r57, int r58, long r59) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.matrix.monitor.e1.a(com.tencent.mm.matrix.monitor.e1, com.tencent.matrix.util.MemInfo, int, long):void");
    }

    public final ji.p b() {
        long j17 = 600 * 1024;
        return new ji.p(true, com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE, f68750c, d(150), d(250), j17, j17, 3, com.tencent.mm.matrix.monitor.t0.f68804d);
    }

    public final ji.p c() {
        long j17 = 800 * 1024;
        return new ji.p(true, com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner.INSTANCE, f68750c, d(250), d(500), j17, j17, 3, com.tencent.mm.matrix.monitor.a1.f68728d);
    }

    public final long d(int i17) {
        return i17 * 1024 * 1024;
    }
}
