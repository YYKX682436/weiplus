package rj1;

/* loaded from: classes7.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12625xe68f958 f477697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f477698e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12625xe68f958 c12625xe68f958, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f477697d = c12625xe68f958;
        this.f477698e = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557 c12627x488d3557;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12625xe68f958 c12625xe68f958 = this.f477697d;
        boolean z17 = c12625xe68f958.f170763g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f477698e;
        if (!z17) {
            rj1.c cVar = new rj1.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = o6Var.C0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C0, "getService(...)");
            cVar.x(C0, c12625xe68f958.f170762f);
            return;
        }
        if (o6Var.C0().mo48799xc0ccc466() == u81.b.FOREGROUND) {
            rj1.c cVar2 = new rj1.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C02 = o6Var.C0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C02, "getService(...)");
            cVar2.x(C02, c12625xe68f958.f170762f);
            return;
        }
        java.util.ArrayList arrayList = c12625xe68f958.f170762f;
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null || (c12627x488d3557 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557) kz5.n0.X(arrayList)) == null) {
            return;
        }
        rj1.m.c(c12627x488d3557);
    }
}
