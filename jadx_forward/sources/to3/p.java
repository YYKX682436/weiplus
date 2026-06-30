package to3;

/* loaded from: classes9.dex */
public class p implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ to3.q f502505d;

    public p(to3.q qVar) {
        this.f502505d = qVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        to3.q qVar = this.f502505d;
        if (qVar.f502509b != null) {
            if (!gm0.j1.a()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = qVar.f502509b;
                int i17 = to3.q.f502506c;
                long j17 = 5000;
                b4Var.c(j17, j17);
                return false;
            }
            if (yo3.m.k()) {
                qVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineGetMsgLogic", "doGetOfflineMsg doScene:NetSceneOfflineGetMsg");
                wo3.e eVar = new wo3.e();
                gm0.j1.i();
                gm0.j1.n().f354821b.g(eVar);
            }
        }
        return false;
    }
}
