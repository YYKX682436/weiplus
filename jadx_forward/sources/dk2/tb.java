package dk2;

/* loaded from: classes12.dex */
public final class tb implements ek2.n2 {

    /* renamed from: g, reason: collision with root package name */
    public gk2.e f315659g;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.PriorityQueue f315653a = new java.util.PriorityQueue();

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f315654b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f315655c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f315656d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f315657e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f315658f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f315660h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("FinderLivePollingService");

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f315661i = new dk2.eb(this);

    public static final void b(dk2.tb tbVar) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = tbVar.f315660h;
        java.lang.Runnable runnable = tbVar.f315661i;
        n3Var.mo50300x3fa464aa(runnable);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.PriorityQueue priorityQueue = tbVar.f315653a;
        java.util.Iterator it = priorityQueue.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            dk2.bb bbVar = (dk2.bb) it.next();
            if (hashSet.contains(java.lang.Integer.valueOf(bbVar.f314781d))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderLivePollingService", "duplicate pending command found, remove it ".concat(tbVar.c()));
                it.remove();
            } else {
                hashSet.add(java.lang.Integer.valueOf(bbVar.f314781d));
            }
        }
        dk2.bb bbVar2 = (dk2.bb) priorityQueue.peek();
        if (bbVar2 != null) {
            if (bbVar2.f314783f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", "checkNextPollingRequestTime first command is disabled ".concat(tbVar.c()));
            } else {
                long j17 = bbVar2.f314785h;
                if (j17 == 0 || j17 <= android.os.SystemClock.uptimeMillis()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", "checkNextPollingRequestTime doRequestNow:" + bbVar2 + ' ' + tbVar.c());
                    n3Var.mo50293x3498a0(runnable);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", "checkNextPollingRequestTime pendingRequest:" + bbVar2 + ' ' + tbVar.c());
                    n3Var.mo50295x41bd0e60(runnable, j17);
                }
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", "checkNextPollingRequestTime pendingList is empty ".concat(tbVar.c()));
        }
    }

    @Override // ek2.n2
    public void a(ek2.o2 cgi, int i17, int i18, java.lang.String str, r45.zb2 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgi, "cgi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        this.f315660h.mo50293x3498a0(new dk2.jb(this, cgi, i17, i18, resp, str));
    }

    public final java.lang.String c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" || pendingCommandList: [");
        java.util.Iterator it = this.f315653a.iterator();
        while (it.hasNext()) {
            sb6.append(((dk2.bb) it.next()).m124547x9616526c());
            sb6.append(",");
        }
        sb6.append("] requestingCommandList: [");
        java.util.Iterator it6 = this.f315654b.values().iterator();
        while (it6.hasNext()) {
            sb6.append(((dk2.bb) it6.next()).m124547x9616526c());
            sb6.append(",");
        }
        sb6.append("] enabledCmdIds:[" + d(this.f315657e) + ']');
        sb6.append("] enabledCmdIdsInMiniMode:[" + d(this.f315658f) + ']');
        sb6.append(" now:[" + android.os.SystemClock.uptimeMillis() + ']');
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String d(java.util.List list) {
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

    public final void e(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f req, dk2.cb callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f315660h.mo50293x3498a0(new dk2.ob(this, i17, req, callback, z17));
    }

    public final void f(int i17) {
        this.f315660h.mo50293x3498a0(new dk2.qb(i17, this));
    }

    public final void g(int i17, boolean z17, boolean z18) {
        java.lang.Object obj;
        dk2.bb bbVar = (dk2.bb) this.f315654b.get(java.lang.Integer.valueOf(i17));
        if (bbVar != null) {
            bbVar.f314783f = z17;
            if (z17) {
                bbVar.f314785h = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
            }
        }
        java.util.PriorityQueue priorityQueue = this.f315653a;
        java.util.Iterator it = priorityQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((dk2.bb) obj).f314781d == i17) {
                    break;
                }
            }
        }
        dk2.bb bbVar2 = (dk2.bb) obj;
        if (bbVar2 != null) {
            priorityQueue.remove(bbVar2);
            bbVar2.f314783f = z17;
            if (z17) {
                bbVar2.f314785h = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
            }
            if (!z17) {
                bbVar2.f314785h = z18 ? 0L : android.os.SystemClock.uptimeMillis() + (bbVar2.f314784g * 1000);
            }
            priorityQueue.add(bbVar2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", "updateCmdIdDisabledState " + i17 + ' ' + z17 + ' ' + z18 + ' ' + c());
        }
    }

    public final void h(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f req) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        this.f315660h.mo50293x3498a0(new dk2.rb(i17, req, this));
    }
}
