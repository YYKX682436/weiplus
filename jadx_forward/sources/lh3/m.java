package lh3;

/* loaded from: classes7.dex */
public class m implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lh3.n f400218d;

    public m(lh3.n nVar) {
        this.f400218d = nVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SimcardService", "account not init.");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimcardService", "CheckMobileSIMType Timer");
        lh3.n nVar = this.f400218d;
        if (nVar.f400226h == 0) {
            nVar.wi(0);
        } else {
            nVar.wi(3);
        }
        return true;
    }
}
