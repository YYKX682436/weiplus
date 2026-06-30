package jk3;

/* loaded from: classes8.dex */
public final class o implements kk3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jk3.v f381633a;

    public o(jk3.v vVar) {
        this.f381633a = vVar;
    }

    @Override // kk3.d
    public void b(android.graphics.Bitmap bitmap, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "swipeBack animation end, way:" + i17);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.Bd((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) c17, 2, null, 0, null, 14, null);
        jk3.v vVar = this.f381633a;
        android.graphics.Bitmap P = vVar.F(i17) ? vVar.P(bitmap, vVar.f381657q) : null;
        vVar.r(P, vVar.f381660t);
        this.f381633a.X(P, i17 == 4, false, false, true);
        ak3.c cVar = vVar.f381644d;
        if (cVar != null) {
            ((ak3.i) cVar).t(true);
        }
    }

    @Override // kk3.d
    public void d(android.graphics.Bitmap bitmap, boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "swipeBack start, isSwipeBack:" + z17 + " ,way:" + i17);
        jk3.v vVar = this.f381633a;
        vVar.O(new jk3.n(vVar, z17, i17, bitmap));
    }

    @Override // kk3.d
    public void e(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "swipeBack animation cancel, way:" + i17);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.Bd((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) c17, 2, null, 0, null, 14, null);
        jk3.v vVar = this.f381633a;
        ak3.c cVar = vVar.f381644d;
        if (vVar.F(i17)) {
            ak3.c cVar2 = vVar.f381644d;
            r2 = vVar.P(cVar2 != null ? cVar2.mo2158x12501425() : null, vVar.f());
        }
        vVar.l(r2, i17 == 4);
        vVar.r(r2, vVar.f381660t);
        ak3.c cVar3 = vVar.f381644d;
        if (cVar3 != null) {
            cVar3.j(true, vVar);
        }
        ak3.c cVar4 = vVar.f381644d;
        if (cVar4 != null) {
            ((ak3.i) cVar4).t(true);
        }
    }
}
