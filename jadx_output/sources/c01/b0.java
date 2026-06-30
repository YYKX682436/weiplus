package c01;

/* loaded from: classes5.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f37067d;

    public b0(c01.c0 c0Var, com.tencent.mm.storage.f9 f9Var) {
        this.f37067d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 f9Var = this.f37067d;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatSysCmdMsgConsumerHandleRevokeMsg", "[deleteLocalFile] id:%s type:%s", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Integer.valueOf(f9Var.getType()));
        int type = f9Var.getType();
        if (type == 3 || type == 34 || type == 49 || type == 62 || type == 268435505 || type == 43 || type == 44) {
            c01.w9.e(f9Var, true);
        }
    }
}
