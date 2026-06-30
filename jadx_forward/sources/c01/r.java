package c01;

/* loaded from: classes5.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f118940d;

    public r(c01.u uVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f118940d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.x7 x7Var = (c01.x7) i95.n0.c(c01.x7.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f118940d;
        int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0();
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h0) x7Var).getClass();
        int c17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.c(mo78013xfb85f7b0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallSysCmdMsgConsumer", "[deleteLocalFile] id:%s type:%s serverType:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()), java.lang.Integer.valueOf(c17));
        if (c17 == 3 || c17 == 34 || c17 == 49 || c17 == 62 || c17 == 268435505 || c17 == 43 || c17 == 44) {
            c01.w9.e(f9Var, true);
        }
    }
}
