package x63;

/* loaded from: classes5.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f533790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x63.p f533791e;

    public m(x63.p pVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f533791e = pVar;
        this.f533790d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f533791e.f533801c;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f533790d;
        x63.n nVar = (x63.n) concurrentHashMap.remove(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        if (nVar != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6920x30febe4 c6920x30febe4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6920x30febe4();
            c6920x30febe4.f142378i = c6920x30febe4.b("Identifier", nVar.f533795d, true);
            c6920x30febe4.f142373d = c6920x30febe4.b("ChatName", nVar.f533792a, true);
            c6920x30febe4.f142374e = f9Var.I0();
            c6920x30febe4.f142375f = nVar.f533793b;
            c6920x30febe4.f142376g = 3L;
            c6920x30febe4.f142377h = nVar.f533794c;
            c6920x30febe4.k();
        }
    }
}
