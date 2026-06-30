package db5;

/* loaded from: classes14.dex */
public class f7 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db5.h7 f309865a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(db5.h7 h7Var, android.os.Looper looper) {
        super(looper);
        this.f309865a = h7Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.MMTipsDialog", "mTipsBuilder handleMessage", new java.lang.Object[0]);
        db5.h7 h7Var = this.f309865a;
        android.content.Context context = h7Var.f309919f;
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return;
        }
        h7Var.dismiss();
    }
}
