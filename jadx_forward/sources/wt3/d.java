package wt3;

/* loaded from: classes5.dex */
public final class d extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wt3.e f530922a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wt3.e eVar, android.os.Looper looper) {
        super(looper);
        this.f530922a = eVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int i17 = msg.what;
        wt3.e eVar = this.f530922a;
        if (i17 == 0) {
            eVar.k();
            if (eVar.f530931g) {
                eVar.f530936l.obtainMessage(1).sendToTarget();
                return;
            }
            return;
        }
        if (i17 == 1) {
            eVar.j(true);
        } else {
            if (i17 != 2) {
                return;
            }
            eVar.j(false);
        }
    }
}
