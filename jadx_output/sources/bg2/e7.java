package bg2;

/* loaded from: classes12.dex */
public final class e7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.j7 f20063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.f f20065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg2.s6 f20066g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f20067h;

    public e7(bg2.j7 j7Var, int i17, com.tencent.mm.protobuf.f fVar, bg2.s6 s6Var, boolean z17) {
        this.f20063d = j7Var;
        this.f20064e = i17;
        this.f20065f = fVar;
        this.f20066g = s6Var;
        this.f20067h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg2.j7 j7Var = this.f20063d;
        if (j7Var.f20217g) {
            return;
        }
        bg2.t6 t6Var = j7Var.f20218h;
        int i17 = this.f20064e;
        if (t6Var == null) {
            com.tencent.mars.xlog.Log.w("Finder.LivePollingService", "startPolling but liveContext = null: " + i17 + ", " + j7Var.c());
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPolling ");
        sb6.append(i17);
        sb6.append(' ');
        com.tencent.mm.protobuf.f fVar = this.f20065f;
        sb6.append(fVar);
        sb6.append(' ');
        sb6.append(j7Var.c());
        com.tencent.mars.xlog.Log.i("Finder.LivePollingService", sb6.toString());
        j7Var.f20214d.put(i17, this.f20066g);
        bg2.r6 r6Var = new bg2.r6(i17, fVar);
        java.util.PriorityQueue priorityQueue = j7Var.f20211a;
        kz5.h0.A(priorityQueue, new bg2.d7(i17));
        j7Var.f20212b.remove(java.lang.Integer.valueOf(i17));
        if (!((java.util.LinkedList) j7Var.f20215e).contains(java.lang.Integer.valueOf(i17))) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("startPolling but cmdId not in enabled list ");
            sb7.append(i17);
            sb7.append(" forceEnable ");
            boolean z17 = this.f20067h;
            sb7.append(z17);
            com.tencent.mars.xlog.Log.i("Finder.LivePollingService", sb7.toString());
            boolean z18 = !z17;
            r6Var.f20471f = z18;
            if (z18) {
                r6Var.f20473h = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            }
        }
        priorityQueue.add(r6Var);
        bg2.j7.b(j7Var);
    }
}
