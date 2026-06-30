package hm;

/* loaded from: classes12.dex */
public final class c implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hm.f f363676d;

    public c(hm.f fVar) {
        this.f363676d = fVar;
    }

    @Override // xg3.h0
    public final void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.util.ArrayList arrayList;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0Var != null ? l0Var.f535944b : null, "delete") || l0Var == null || (arrayList = l0Var.f535945c) == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            if (f9Var.A0() == 1 && (f9Var.P0() == 5 || ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).ij(f9Var, null) == 100)) {
                if (f9Var.mo78012x3fdd41df() >= c01.id.c() - 21600000) {
                    hm.f fVar = this.f363676d;
                    fVar.getClass();
                    pm0.v.Q("AndroidSendMsgFailReport", false, new hm.d(f9Var, null, fVar), 5000L, 2, null);
                }
            }
        }
    }
}
