package nz2;

/* loaded from: classes9.dex */
public class u implements d50.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nz2.b f423107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nz2.x f423108b;

    public u(nz2.x xVar, nz2.b bVar) {
        this.f423108b = xVar;
        this.f423107a = bVar;
    }

    @Override // d50.o
    public void a() {
    }

    @Override // d50.o
    public void b(eu5.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "authentication success");
        this.f423108b.getClass();
        nz2.b bVar = this.f423107a;
        if (bVar != null) {
            bVar.a(nz2.c.b(aVar));
        }
    }

    @Override // d50.o
    public void c(int i17, eu5.a aVar) {
        re4.n.c(3, aVar.f557138a, 1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "authentication failed: %s", java.lang.Integer.valueOf(i17));
        nz2.b bVar = this.f423107a;
        if (i17 == 1) {
            if (bVar != null) {
                nz2.c cVar = new nz2.c();
                cVar.f423076a = 2002;
                bVar.a(cVar);
                return;
            }
            return;
        }
        if (aVar.f557138a == 1022) {
            ((ne4.n) this.f423108b.f423113d).a(true);
        }
        if (bVar != null) {
            bVar.a(nz2.c.b(aVar));
        }
    }
}
