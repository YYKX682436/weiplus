package x63;

/* loaded from: classes5.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f533785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x63.p f533786e;

    public k(x63.p pVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f533786e = pVar;
        this.f533785d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        x63.p pVar = this.f533786e;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = pVar.f533799a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f533785d;
        android.util.Pair pair = (android.util.Pair) concurrentHashMap.remove(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        java.lang.Boolean bool = (java.lang.Boolean) pVar.f533800b.remove(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        x63.o oVar = (x63.o) pVar.f533802d.remove(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        if (pair != null) {
            y63.a f17 = ((t63.e) i95.n0.c(t63.e.class)).wi().f((java.lang.String) pair.first, (java.lang.String) pair.second);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5758x9367a256 c5758x9367a256 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5758x9367a256();
            am.ol olVar = c5758x9367a256.f136076g;
            olVar.f89088a = 1;
            olVar.f89090c = f17.f66138x4b6e619a;
            olVar.f89089b = f17.f66142xdec927b;
            bool.booleanValue();
            olVar.getClass();
            long I0 = bool.booleanValue() ? pt0.f0.Li(f9Var.Q0(), f17.f66137xae937411).I0() : f9Var.I0();
            c5758x9367a256.f136077h.f89163b = I0;
            c5758x9367a256.e();
            this.f533786e.c(f17, bool.booleanValue(), c01.z1.r(), I0);
            if (oVar != null) {
                y63.a aVar = oVar.f533796a;
                aVar.f66140xd09be28e = I0;
                pVar.i(aVar, oVar.f533797b, oVar.f533798c);
            }
        }
    }
}
