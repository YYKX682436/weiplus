package c01;

/* loaded from: classes5.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f37407d;

    public r(c01.u uVar, com.tencent.mm.storage.f9 f9Var) {
        this.f37407d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.x7 x7Var = (c01.x7) i95.n0.c(c01.x7.class);
        com.tencent.mm.storage.f9 f9Var = this.f37407d;
        int type = f9Var.getType();
        ((com.tencent.mm.pluginsdk.model.app.h0) x7Var).getClass();
        int c17 = com.tencent.mm.pluginsdk.model.app.k0.c(type);
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallSysCmdMsgConsumer", "[deleteLocalFile] id:%s type:%s serverType:%s", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Integer.valueOf(f9Var.getType()), java.lang.Integer.valueOf(c17));
        if (c17 == 3 || c17 == 34 || c17 == 49 || c17 == 62 || c17 == 268435505 || c17 == 43 || c17 == 44) {
            c01.w9.e(f9Var, true);
        }
    }
}
