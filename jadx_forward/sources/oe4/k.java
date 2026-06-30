package oe4;

/* loaded from: classes15.dex */
public class k implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oe4.l f426345a;

    public k(oe4.l lVar) {
        this.f426345a = lVar;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.c cVar = (eu5.c) eVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterNetDelegateUtil", "generate and upload ask onResult errCode: %d, errMsg: %s", java.lang.Integer.valueOf(cVar.f557138a), cVar.f557139b);
        boolean a17 = cVar.a();
        oe4.l lVar = this.f426345a;
        if (a17) {
            oe4.a aVar = lVar.f426346a;
            if (aVar != null) {
                ((oe4.f) aVar).f426335a.H();
                return;
            }
            return;
        }
        re4.n.c(1, cVar.f557138a, 1L);
        oe4.a aVar2 = lVar.f426346a;
        if (aVar2 != null) {
            ((oe4.f) aVar2).f426335a.I(3, cVar.f557138a, cVar.f557139b);
        }
    }
}
