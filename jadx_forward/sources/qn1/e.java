package qn1;

/* loaded from: classes12.dex */
public class e implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn1.d f446517d;

    public e(qn1.d dVar) {
        this.f446517d = dVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        qn1.d dVar = this.f446517d;
        if (dVar.f446501h) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcProcessMgr", "tryConnect overtime failed.");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = dVar.f446503j;
        if (b4Var != null) {
            b4Var.d();
        }
        qn1.d.a(dVar);
        xn1.c.b("Status", 3);
        return true;
    }
}
