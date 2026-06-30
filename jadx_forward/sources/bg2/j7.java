package bg2;

/* loaded from: classes12.dex */
public final class j7 implements ek2.n2 {

    /* renamed from: g, reason: collision with root package name */
    public boolean f101750g;

    /* renamed from: h, reason: collision with root package name */
    public bg2.t6 f101751h;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.PriorityQueue f101744a = new java.util.PriorityQueue();

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f101745b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f101746c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f101747d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f101748e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f101749f = jz5.h.b(bg2.x6.f102184d);

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f101752i = new bg2.v6(this);

    public static final void b(bg2.j7 j7Var) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 d17 = j7Var.d();
        java.lang.Runnable runnable = j7Var.f101752i;
        d17.mo50300x3fa464aa(runnable);
        if (j7Var.f101750g) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.PriorityQueue priorityQueue = j7Var.f101744a;
        java.util.Iterator it = priorityQueue.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            bg2.r6 r6Var = (bg2.r6) it.next();
            if (hashSet.contains(java.lang.Integer.valueOf(r6Var.f102002d))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LivePollingService", "duplicate pending command found, remove it ".concat(j7Var.c()));
                it.remove();
            } else {
                hashSet.add(java.lang.Integer.valueOf(r6Var.f102002d));
            }
        }
        bg2.r6 r6Var2 = (bg2.r6) priorityQueue.peek();
        if (r6Var2 != null) {
            if (r6Var2.f102004f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePollingService", "checkNextPollingRequestTime first command is disabled ".concat(j7Var.c()));
            } else {
                long j17 = r6Var2.f102006h;
                if (j17 == 0 || j17 <= android.os.SystemClock.uptimeMillis()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePollingService", "checkNextPollingRequestTime doRequestNow:" + r6Var2 + ' ' + j7Var.c());
                    j7Var.d().mo50293x3498a0(runnable);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePollingService", "checkNextPollingRequestTime pendingRequest:" + r6Var2 + ' ' + j7Var.c());
                    j7Var.d().mo50295x41bd0e60(runnable, j17);
                }
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePollingService", "checkNextPollingRequestTime pendingList is empty ".concat(j7Var.c()));
        }
    }

    @Override // ek2.n2
    public void a(ek2.o2 cgi, int i17, int i18, java.lang.String str, r45.zb2 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgi, "cgi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        d().mo50293x3498a0(new bg2.b7(this, i17, i18, resp, str, cgi));
    }

    public final java.lang.String c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" || pendingCommandList: [");
        java.util.Iterator it = this.f101744a.iterator();
        while (it.hasNext()) {
            sb6.append(((bg2.r6) it.next()).m10423x9616526c());
            sb6.append(",");
        }
        sb6.append("] requestingCommandList: [");
        java.util.Iterator it6 = this.f101745b.values().iterator();
        while (it6.hasNext()) {
            sb6.append(((bg2.r6) it6.next()).m10423x9616526c());
            sb6.append(",");
        }
        sb6.append("] enabledCmdIds:[" + e(this.f101748e) + ']');
        sb6.append(" now:[" + android.os.SystemClock.uptimeMillis() + ']');
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 d() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f101749f).mo141623x754a37bb();
    }

    public final java.lang.String e(java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            sb6.append(((java.lang.Number) it.next()).intValue());
            sb6.append(",");
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final void f(int i17, boolean z17, boolean z18) {
        java.lang.Object obj;
        bg2.r6 r6Var = (bg2.r6) this.f101745b.get(java.lang.Integer.valueOf(i17));
        if (r6Var != null) {
            r6Var.f102004f = z17;
            if (z17) {
                r6Var.f102006h = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
            }
        }
        java.util.PriorityQueue priorityQueue = this.f101744a;
        java.util.Iterator it = priorityQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((bg2.r6) obj).f102002d == i17) {
                    break;
                }
            }
        }
        bg2.r6 r6Var2 = (bg2.r6) obj;
        if (r6Var2 != null) {
            priorityQueue.remove(r6Var2);
            r6Var2.f102004f = z17;
            if (z17) {
                r6Var2.f102006h = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
            }
            if (!z17) {
                r6Var2.f102006h = z18 ? 0L : android.os.SystemClock.uptimeMillis() + (r6Var2.f102005g * 1000);
            }
            priorityQueue.add(r6Var2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePollingService", "updateCmdIdDisabledState " + i17 + ' ' + z17 + ' ' + z18 + ' ' + c());
        }
    }
}
