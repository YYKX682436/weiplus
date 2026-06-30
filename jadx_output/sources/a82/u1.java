package a82;

@j95.b
/* loaded from: classes11.dex */
public final class u1 extends i95.w implements o72.r4 {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f2177d = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f2178e = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f2179f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f2180g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f2181h = kotlinx.coroutines.sync.l.a(false, 1, null);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f2182i = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static final boolean Ai(a82.u1 u1Var, java.lang.String str, long j17) {
        u1Var.getClass();
        if (com.tencent.mm.vfs.w6.j(str)) {
            return j17 <= 0 || com.tencent.mm.vfs.w6.k(str) == j17;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:61|(1:63)(1:85)|64|65|66|(1:68)(1:81)|69) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017d, code lost:
    
        com.tencent.mars.xlog.Log.e(r11, "note download new protocol serialize error: " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01f0 -> B:11:0x01f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object wi(a82.u1 r26, a82.k1 r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a82.u1.wi(a82.u1, a82.k1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public java.lang.Object Bi(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, o72.o4 o4Var, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new a82.p1(str4, j17, i17, str5, this, str, str2, str3, o4Var, null), continuation);
    }

    public void Di(long j17, java.lang.String md52, java.lang.String cdnUrl, java.lang.String cdnKey, int i17, java.lang.String targetLocalPath, java.lang.String htmlId, o72.o4 o4Var, o72.n4 n4Var) {
        kotlin.jvm.internal.o.g(md52, "md5");
        kotlin.jvm.internal.o.g(cdnUrl, "cdnUrl");
        kotlin.jvm.internal.o.g(cdnKey, "cdnKey");
        kotlin.jvm.internal.o.g(targetLocalPath, "targetLocalPath");
        kotlin.jvm.internal.o.g(htmlId, "htmlId");
        kotlinx.coroutines.l.d(this.f2177d, null, null, new a82.q1(this, j17, md52, cdnUrl, cdnKey, i17, targetLocalPath, htmlId, o4Var, n4Var, null), 3, null);
    }

    public final void Ni(java.lang.String str, o72.p4 p4Var) {
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) this.f2180g.remove(str);
        if (continuation != null) {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(p4Var));
        }
    }

    public void Ri(java.lang.String targetLocalPath) {
        kotlin.jvm.internal.o.g(targetLocalPath, "targetLocalPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavPublicCdnDownloadService", "stop task: ".concat(targetLocalPath));
        if (this.f2178e.removeIf(new a82.t1(targetLocalPath))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavPublicCdnDownloadService", "removed pending task: ".concat(targetLocalPath));
            Ni(targetLocalPath, new o72.p4(-1, "Task cancelled", targetLocalPath));
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f2179f;
        a82.k1 k1Var = (a82.k1) concurrentHashMap.get(targetLocalPath);
        if (k1Var != null) {
            k1Var.f2062l = true;
            ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(java.lang.String.valueOf(k1Var.f2056f.hashCode()));
            com.tencent.mm.vfs.w6.h(k1Var.f2057g);
            com.tencent.mm.vfs.w6.h(targetLocalPath);
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavPublicCdnDownloadService", "cancelled downloading task and deleted files: ".concat(targetLocalPath));
            concurrentHashMap.remove(targetLocalPath);
            Ni(targetLocalPath, new o72.p4(-1, "Task cancelled", targetLocalPath));
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavPublicCdnDownloadService", "stopAll");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f2178e;
            if (!(!concurrentLinkedQueue.isEmpty())) {
                break;
            }
            a82.k1 k1Var = (a82.k1) concurrentLinkedQueue.poll();
            if (k1Var != null) {
                arrayList.add(k1Var.f2056f);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            Ni(str, new o72.p4(-1, "All tasks cancelled", str));
        }
        java.util.Set keySet = this.f2179f.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        for (java.lang.String str2 : kz5.n0.S0(keySet)) {
            kotlin.jvm.internal.o.d(str2);
            Ri(str2);
        }
        kotlinx.coroutines.z0.e(this.f2177d, null, 1, null);
    }
}
