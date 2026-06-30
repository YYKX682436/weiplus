package mn1;

/* loaded from: classes12.dex */
public class l implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn1.e f411404d;

    public l(mn1.e eVar) {
        this.f411404d = eVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        if (mn1.e.O) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupMoveRecoverServer", "try connect overtime failed.");
        mn1.e eVar = this.f411404d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = eVar.G;
        if (b4Var != null) {
            b4Var.d();
        }
        eVar.m();
        return true;
    }
}
