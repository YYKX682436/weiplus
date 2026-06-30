package mt1;

/* loaded from: classes12.dex */
public final class s implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt1.c f412794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f412795e;

    public s(nt1.c cVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f412794d = cVar;
        this.f412795e = f9Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        kz5.p0 p0Var = kz5.p0.f395529d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f412795e;
        try {
            d95.f.q();
            java.util.List b17 = this.f412794d.b(f9Var);
            java.lang.Long valueOf = java.lang.Long.valueOf(f9Var.m124847x74d37ac6());
            java.lang.String Q0 = f9Var.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
            if (b17 == null) {
                b17 = p0Var;
            }
            return new jz5.o(valueOf, Q0, b17);
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26950xbda0b8a9 unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CalcWxNewService", "getIndicesByMsgInfo DB Corrupt");
            java.lang.Long valueOf2 = java.lang.Long.valueOf(f9Var.m124847x74d37ac6());
            java.lang.String Q02 = f9Var.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q02, "getTalker(...)");
            return new jz5.o(valueOf2, Q02, p0Var);
        }
    }
}
