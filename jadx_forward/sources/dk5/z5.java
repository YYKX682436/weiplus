package dk5;

/* loaded from: classes4.dex */
public class z5 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tg3.x0 f316555d;

    public z5(dk5.s5 s5Var, tg3.x0 x0Var) {
        this.f316555d = x0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.jk0 jk0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "onSceneEnd() called with: errType = [" + i17 + "], errCode = [" + i18 + "], errMsg = [" + str + "], scene = [" + m1Var + "]");
        c01.d9.e().q(m1Var.mo808xfb85f7b0(), this);
        tg3.x0 x0Var = this.f316555d;
        if (i17 != 0 || i18 != 0) {
            x0Var.a(i17, i18, null, null);
        } else {
            if (!(m1Var instanceof l41.t) || (jk0Var = ((l41.t) m1Var).f397459f) == null) {
                return;
            }
            x0Var.a(i17, i18, jk0Var.f459431d, jk0Var.f459432e.f273689a);
        }
    }
}
