package cd1;

/* loaded from: classes7.dex */
public class a implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cd1.i f122146d;

    public a(cd1.i iVar) {
        this.f122146d = iVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        cd1.i iVar = this.f122146d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEActivityMgr", "loop check NFC switch currentCount: %d", java.lang.Integer.valueOf(iVar.f122156a));
        int i17 = iVar.f122156a + 1;
        iVar.f122156a = i17;
        if (i17 > 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEActivityMgr", "loop check count exceed max limit: %d", 10);
            iVar.d();
            iVar.c();
            return false;
        }
        if (!fd1.d.c()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEActivityMgr", "loopCheck NFC switch is opened, and cancel task");
        iVar.d();
        iVar.b(true);
        return false;
    }
}
