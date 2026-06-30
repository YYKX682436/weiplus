package dk2;

/* loaded from: classes12.dex */
public final class ob implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.tb f315382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f315383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.f f315384f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.cb f315385g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f315386h;

    public ob(dk2.tb tbVar, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, dk2.cb cbVar, boolean z17) {
        this.f315382d = tbVar;
        this.f315383e = i17;
        this.f315384f = fVar;
        this.f315385g = cbVar;
        this.f315386h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dk2.tb tbVar = this.f315382d;
        gk2.e eVar = tbVar.f315659g;
        int i17 = this.f315383e;
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderLivePollingService", "startPolling but liveContext = null: " + i17 + ", " + tbVar.c());
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPolling ");
        sb6.append(i17);
        sb6.append(' ');
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f315384f;
        sb6.append(fVar);
        sb6.append(' ');
        sb6.append(tbVar.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", sb6.toString());
        tbVar.f315656d.put(i17, this.f315385g);
        dk2.bb bbVar = new dk2.bb(i17, fVar);
        java.util.PriorityQueue priorityQueue = tbVar.f315653a;
        kz5.h0.A(priorityQueue, new dk2.nb(i17));
        tbVar.f315654b.remove(java.lang.Integer.valueOf(i17));
        if (!((java.util.LinkedList) tbVar.f315657e).contains(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", "startPolling but cmdId not in enabled list " + i17);
            bbVar.f314783f = true;
            bbVar.f314785h = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        if (this.f315386h) {
            ((java.util.LinkedList) tbVar.f315658f).add(java.lang.Integer.valueOf(i17));
        }
        priorityQueue.add(bbVar);
        dk2.tb.b(tbVar);
    }
}
