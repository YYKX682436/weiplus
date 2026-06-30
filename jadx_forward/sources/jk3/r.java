package jk3;

/* loaded from: classes8.dex */
public final class r implements jk3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jk3.v f381636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jk3.c f381637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f381638c;

    public r(jk3.v vVar, jk3.c cVar, int i17) {
        this.f381636a = vVar;
        this.f381637b = cVar;
        this.f381638c = i17;
    }

    @Override // jk3.g
    public void a() {
        jk3.v vVar = this.f381636a;
        vVar.getClass();
        if (!vVar.u()) {
            kk3.d dVar = vVar.f381645e;
            if (dVar != null) {
                kk3.d.f(dVar, 0, 1, null);
                return;
            }
            return;
        }
        android.graphics.Point Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Bi();
        vVar.f381661u = !vVar.T();
        ak3.c cVar = vVar.f381644d;
        if (cVar != null) {
            jk3.c cVar2 = this.f381637b;
            int ordinal = cVar2.ordinal();
            if (ordinal == 0) {
                kk3.d dVar2 = vVar.f381645e;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f575202l73);
                if (cVar.c()) {
                    cVar.f(new ck3.o(dVar2, Bi, cVar, null, true, -1.0f, false, false));
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ck3.p(dVar2));
                }
            } else if (ordinal != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PageMultiTaskHelper", "animType warning animType: %s", cVar2);
            } else {
                kk3.d dVar3 = vVar.f381645e;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f575202l73);
                if (cVar.c()) {
                    cVar.f(new ck3.o(dVar3, Bi, cVar, null, true, -1.0f, false, true));
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ck3.p(dVar3));
                }
            }
            jk3.v.N(vVar, this.f381638c);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "ballPosition: {" + java.lang.Integer.valueOf(Bi.x) + ' ' + java.lang.Integer.valueOf(Bi.y) + '}');
    }
}
