package bg2;

/* loaded from: classes12.dex */
public final class j7 implements ek2.n2 {

    /* renamed from: g, reason: collision with root package name */
    public boolean f20217g;

    /* renamed from: h, reason: collision with root package name */
    public bg2.t6 f20218h;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.PriorityQueue f20211a = new java.util.PriorityQueue();

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f20212b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f20213c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f20214d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f20215e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f20216f = jz5.h.b(bg2.x6.f20651d);

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f20219i = new bg2.v6(this);

    public static final void b(bg2.j7 j7Var) {
        jz5.f0 f0Var;
        com.tencent.mm.sdk.platformtools.n3 d17 = j7Var.d();
        java.lang.Runnable runnable = j7Var.f20219i;
        d17.removeCallbacks(runnable);
        if (j7Var.f20217g) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.PriorityQueue priorityQueue = j7Var.f20211a;
        java.util.Iterator it = priorityQueue.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            bg2.r6 r6Var = (bg2.r6) it.next();
            if (hashSet.contains(java.lang.Integer.valueOf(r6Var.f20469d))) {
                com.tencent.mars.xlog.Log.w("Finder.LivePollingService", "duplicate pending command found, remove it ".concat(j7Var.c()));
                it.remove();
            } else {
                hashSet.add(java.lang.Integer.valueOf(r6Var.f20469d));
            }
        }
        bg2.r6 r6Var2 = (bg2.r6) priorityQueue.peek();
        if (r6Var2 != null) {
            if (r6Var2.f20471f) {
                com.tencent.mars.xlog.Log.i("Finder.LivePollingService", "checkNextPollingRequestTime first command is disabled ".concat(j7Var.c()));
            } else {
                long j17 = r6Var2.f20473h;
                if (j17 == 0 || j17 <= android.os.SystemClock.uptimeMillis()) {
                    com.tencent.mars.xlog.Log.i("Finder.LivePollingService", "checkNextPollingRequestTime doRequestNow:" + r6Var2 + ' ' + j7Var.c());
                    j7Var.d().post(runnable);
                } else {
                    com.tencent.mars.xlog.Log.i("Finder.LivePollingService", "checkNextPollingRequestTime pendingRequest:" + r6Var2 + ' ' + j7Var.c());
                    j7Var.d().postAtTime(runnable, j17);
                }
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("Finder.LivePollingService", "checkNextPollingRequestTime pendingList is empty ".concat(j7Var.c()));
        }
    }

    @Override // ek2.n2
    public void a(ek2.o2 cgi, int i17, int i18, java.lang.String str, r45.zb2 resp) {
        kotlin.jvm.internal.o.g(cgi, "cgi");
        kotlin.jvm.internal.o.g(resp, "resp");
        d().post(new bg2.b7(this, i17, i18, resp, str, cgi));
    }

    public final java.lang.String c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" || pendingCommandList: [");
        java.util.Iterator it = this.f20211a.iterator();
        while (it.hasNext()) {
            sb6.append(((bg2.r6) it.next()).toString());
            sb6.append(",");
        }
        sb6.append("] requestingCommandList: [");
        java.util.Iterator it6 = this.f20212b.values().iterator();
        while (it6.hasNext()) {
            sb6.append(((bg2.r6) it6.next()).toString());
            sb6.append(",");
        }
        sb6.append("] enabledCmdIds:[" + e(this.f20215e) + ']');
        sb6.append(" now:[" + android.os.SystemClock.uptimeMillis() + ']');
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final com.tencent.mm.sdk.platformtools.n3 d() {
        return (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f20216f).getValue();
    }

    public final java.lang.String e(java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            sb6.append(((java.lang.Number) it.next()).intValue());
            sb6.append(",");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final void f(int i17, boolean z17, boolean z18) {
        java.lang.Object obj;
        bg2.r6 r6Var = (bg2.r6) this.f20212b.get(java.lang.Integer.valueOf(i17));
        if (r6Var != null) {
            r6Var.f20471f = z17;
            if (z17) {
                r6Var.f20473h = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            }
        }
        java.util.PriorityQueue priorityQueue = this.f20211a;
        java.util.Iterator it = priorityQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((bg2.r6) obj).f20469d == i17) {
                    break;
                }
            }
        }
        bg2.r6 r6Var2 = (bg2.r6) obj;
        if (r6Var2 != null) {
            priorityQueue.remove(r6Var2);
            r6Var2.f20471f = z17;
            if (z17) {
                r6Var2.f20473h = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            }
            if (!z17) {
                r6Var2.f20473h = z18 ? 0L : android.os.SystemClock.uptimeMillis() + (r6Var2.f20472g * 1000);
            }
            priorityQueue.add(r6Var2);
            com.tencent.mars.xlog.Log.i("Finder.LivePollingService", "updateCmdIdDisabledState " + i17 + ' ' + z17 + ' ' + z18 + ' ' + c());
        }
    }
}
