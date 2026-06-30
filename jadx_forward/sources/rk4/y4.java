package rk4;

@j95.b
/* loaded from: classes11.dex */
public final class y4 extends i95.w implements qk.s8 {
    public void Ai(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ting.FloatBallController", "setCouldShowFloatBall couldShow: " + z17);
        zk4.f.f555065b = z17;
    }

    public void Bi(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ting.FloatBallController", "showTingFloatBall show: " + z17 + ", couldShow: " + zk4.f.f555065b);
        zk4.l lVar = zk4.l.f555071a;
        if (zk4.l.f555073c != null) {
            d75.b.g(new zk4.e(z17));
        }
    }

    public boolean wi() {
        pv.z zVar;
        qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
        if (i9Var == null || ((ef0.l4) i9Var).bj() == null || (zVar = (pv.z) i95.n0.c(pv.z.class)) == null) {
            return false;
        }
        return ((ov.b) zVar).Bi();
    }
}
