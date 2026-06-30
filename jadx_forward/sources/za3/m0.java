package za3;

/* loaded from: classes15.dex */
public class m0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za3.u0 f552526d;

    public m0(za3.u0 u0Var) {
        this.f552526d = u0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkMgr", "seizeMicTimer reach");
        za3.u0 u0Var = this.f552526d;
        if (u0Var.f552566p != 5) {
            return false;
        }
        u0Var.f552566p = 3;
        ((dh4.f0) u0Var.f552572v).s();
        u0Var.f552574x.c(100L, 100L);
        return false;
    }
}
