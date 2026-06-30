package ah0;

/* loaded from: classes8.dex */
public final class t1 extends gp1.e0 {
    @Override // gp1.x
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.webview.ui.tools.floatball.h0 h0Var = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a;
        java.util.concurrent.atomic.AtomicReference atomicReference = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184205e;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = (com.tencent.mm.plugin.ball.model.BallInfo) atomicReference.get();
        if (kotlin.jvm.internal.o.b(ballInfo2 != null ? ballInfo2.f93049g : null, ballInfo != null ? ballInfo.f93049g : null)) {
            atomicReference.set(null);
        }
    }

    @Override // gp1.e0, gp1.x
    public void R2(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo != null) {
            com.tencent.mm.plugin.webview.ui.tools.floatball.h0 h0Var = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a;
            if (com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184203c.isEmpty()) {
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().U(ballInfo);
            }
        }
    }

    @Override // gp1.e0, gp1.x
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("WvFloatBallInfoEventListener", "onFloatBallInfoExposed, ballInfo:%s", ballInfo);
        com.tencent.mm.plugin.webview.ui.tools.floatball.w.t0(ballInfo);
    }

    @Override // gp1.e0, gp1.x
    public void X0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.webview.ui.tools.floatball.h0 h0Var = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a;
        com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184205e.set(ballInfo);
    }

    @Override // gp1.x
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.webview.ui.tools.floatball.w.u0(ballInfo);
    }
}
