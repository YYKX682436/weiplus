package bk4;

/* loaded from: classes11.dex */
public final class c1 extends gp1.a0 {
    @Override // gp1.a0, gp1.z
    public void F0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, com.tencent.mm.plugin.ball.model.BallInfo ballInfo2) {
        if (ballInfo != null && ballInfo.f93046d == 64) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusMusicFloatBallUtil", "setTingFloatBallState show: false");
            bk4.d1.f21454c = false;
        }
    }

    @Override // gp1.a0, gp1.z
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        boolean z17 = false;
        if (ballInfo != null && ballInfo.f93046d == 64) {
            z17 = true;
        }
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).B(bk4.b1.f21405d);
        }
    }
}
