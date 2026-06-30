package bg2;

/* loaded from: classes12.dex */
public final class e7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.j7 f101596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.f f101598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg2.s6 f101599g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f101600h;

    public e7(bg2.j7 j7Var, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, bg2.s6 s6Var, boolean z17) {
        this.f101596d = j7Var;
        this.f101597e = i17;
        this.f101598f = fVar;
        this.f101599g = s6Var;
        this.f101600h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg2.j7 j7Var = this.f101596d;
        if (j7Var.f101750g) {
            return;
        }
        bg2.t6 t6Var = j7Var.f101751h;
        int i17 = this.f101597e;
        if (t6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LivePollingService", "startPolling but liveContext = null: " + i17 + ", " + j7Var.c());
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPolling ");
        sb6.append(i17);
        sb6.append(' ');
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f101598f;
        sb6.append(fVar);
        sb6.append(' ');
        sb6.append(j7Var.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePollingService", sb6.toString());
        j7Var.f101747d.put(i17, this.f101599g);
        bg2.r6 r6Var = new bg2.r6(i17, fVar);
        java.util.PriorityQueue priorityQueue = j7Var.f101744a;
        kz5.h0.A(priorityQueue, new bg2.d7(i17));
        j7Var.f101745b.remove(java.lang.Integer.valueOf(i17));
        if (!((java.util.LinkedList) j7Var.f101748e).contains(java.lang.Integer.valueOf(i17))) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("startPolling but cmdId not in enabled list ");
            sb7.append(i17);
            sb7.append(" forceEnable ");
            boolean z17 = this.f101600h;
            sb7.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePollingService", sb7.toString());
            boolean z18 = !z17;
            r6Var.f102004f = z18;
            if (z18) {
                r6Var.f102006h = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
            }
        }
        priorityQueue.add(r6Var);
        bg2.j7.b(j7Var);
    }
}
