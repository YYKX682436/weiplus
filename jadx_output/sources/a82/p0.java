package a82;

/* loaded from: classes12.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f2112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f2113e;

    public p0(o72.r2 r2Var, com.tencent.mm.modelbase.f fVar) {
        this.f2112d = r2Var;
        this.f2113e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o72.r2 r2Var = this.f2112d;
        o72.x1.j(r2Var);
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().m3(r2Var.field_localId);
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().Re(r2Var);
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().fg(r2Var.field_localId);
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().f(r2Var);
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).ij().b(new java.util.ArrayList(), "deleteBySourceId", 34, 3);
        o72.x1.o(r2Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList = ((r45.se) this.f2113e.f70618d).f385646e;
        int size = linkedList.size();
        for (int i17 = 0; i17 < size; i17++) {
            r45.cc0 cc0Var = (r45.cc0) linkedList.get(i17);
            if (cc0Var.f371447d < 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavDeleteService", "[deleteBySourceId] favId:%d, delete failed", java.lang.Integer.valueOf(cc0Var.f371448e));
            } else {
                arrayList.add(java.lang.Integer.valueOf(cc0Var.f371448e));
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavDeleteService", "[deleteBySourceId] favId:%d deleted", java.lang.Integer.valueOf(cc0Var.f371448e));
            }
        }
        o72.x1.E0(arrayList);
    }
}
