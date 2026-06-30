package ah0;

/* loaded from: classes8.dex */
public class w1 extends gp1.e0 {
    @Override // gp1.x
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.webview.ui.tools.floatball.h0 h0Var = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a;
        ((com.tencent.mm.plugin.webview.ui.tools.floatball.e0) com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184206f).G0(ballInfo);
        java.util.concurrent.atomic.AtomicReference atomicReference = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184205e;
        if (atomicReference.get() == null || ballInfo == null || !android.text.TextUtils.equals(((com.tencent.mm.plugin.ball.model.BallInfo) atomicReference.get()).f93049g, ballInfo.f93049g)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("WvFloatBallInfoEventListener", "content Float ball removed, %s", ballInfo.f93049g);
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().U((com.tencent.mm.plugin.ball.model.BallInfo) atomicReference.get());
    }

    @Override // gp1.e0, gp1.x
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("WvFloatBallInfoEventListener", "onFloatBallInfoExposed, ballInfo:%s", ballInfo);
        com.tencent.mm.plugin.webview.ui.tools.floatball.w.t0(ballInfo);
        com.tencent.mm.plugin.webview.ui.tools.floatball.h0 h0Var = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a;
        ((com.tencent.mm.plugin.webview.ui.tools.floatball.e0) com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184206f).V(ballInfo);
    }

    @Override // gp1.x
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.webview.ui.tools.floatball.w.u0(ballInfo);
        com.tencent.mm.plugin.webview.ui.tools.floatball.h0 h0Var = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a;
        com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184206f.getClass();
    }
}
