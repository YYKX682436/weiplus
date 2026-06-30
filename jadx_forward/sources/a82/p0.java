package a82;

/* loaded from: classes12.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f83645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f83646e;

    public p0(o72.r2 r2Var, com.p314xaae8f345.mm.p944x882e457a.f fVar) {
        this.f83645d = r2Var;
        this.f83646e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o72.r2 r2Var = this.f83645d;
        o72.x1.j(r2Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().m3(r2Var.f67645x88be67a1);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().Re(r2Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().fg(r2Var.f67645x88be67a1);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().f(r2Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).ij().b(new java.util.ArrayList(), "deleteBySourceId", 34, 3);
        o72.x1.o(r2Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList = ((r45.se) this.f83646e.f152151d).f467179e;
        int size = linkedList.size();
        for (int i17 = 0; i17 < size; i17++) {
            r45.cc0 cc0Var = (r45.cc0) linkedList.get(i17);
            if (cc0Var.f452980d < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavDeleteService", "[deleteBySourceId] favId:%d, delete failed", java.lang.Integer.valueOf(cc0Var.f452981e));
            } else {
                arrayList.add(java.lang.Integer.valueOf(cc0Var.f452981e));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavDeleteService", "[deleteBySourceId] favId:%d deleted", java.lang.Integer.valueOf(cc0Var.f452981e));
            }
        }
        o72.x1.E0(arrayList);
    }
}
