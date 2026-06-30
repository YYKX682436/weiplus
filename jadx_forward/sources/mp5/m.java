package mp5;

/* loaded from: classes9.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mp5.n f412023d;

    public m(mp5.n nVar) {
        this.f412023d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mp5.n nVar = this.f412023d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayKeyBoard", "out of time, clean enterPayAmount:%s", nVar.f412024d.L);
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = nVar.f412024d;
        c22894x55bf3223.L = "";
        mp5.u uVar = c22894x55bf3223.H;
        if (uVar != null) {
            o05.j jVar = ((ps4.f) uVar).f439683a;
            if (jVar != null) {
                jVar.b(0, "#outtime");
            }
            if (c22894x55bf3223.N == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(29733, 3, 1);
            }
        }
    }
}
