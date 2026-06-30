package c01;

/* loaded from: classes5.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f118600d;

    public b0(c01.c0 c0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f118600d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f118600d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatSysCmdMsgConsumerHandleRevokeMsg", "[deleteLocalFile] id:%s type:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()));
        int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0();
        if (mo78013xfb85f7b0 == 3 || mo78013xfb85f7b0 == 34 || mo78013xfb85f7b0 == 49 || mo78013xfb85f7b0 == 62 || mo78013xfb85f7b0 == 268435505 || mo78013xfb85f7b0 == 43 || mo78013xfb85f7b0 == 44) {
            c01.w9.e(f9Var, true);
        }
    }
}
