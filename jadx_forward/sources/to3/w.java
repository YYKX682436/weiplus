package to3;

/* loaded from: classes9.dex */
public class w implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ to3.a0 f502517d;

    public w(to3.a0 a0Var) {
        this.f502517d = a0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        long j17;
        boolean a17 = gm0.j1.a();
        to3.a0 a0Var = this.f502517d;
        if (!a17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = a0Var.f502482m;
            long j18 = a0Var.f502481i;
            b4Var.c(j18, j18);
            return false;
        }
        a0Var.a(5, 5);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = a0Var.f502482m;
        a0Var.getClass();
        long g17 = yo3.m.g();
        if (g17 <= 0) {
            j17 = a0Var.f502481i;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineTokensMgr", "OfflineTokensMgr updateInterval:" + g17);
            j17 = g17 * 1000;
        }
        b4Var2.c(j17, j17);
        return false;
    }
}
