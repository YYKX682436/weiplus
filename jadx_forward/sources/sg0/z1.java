package sg0;

/* loaded from: classes8.dex */
public final class z1 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg0.a2 f489403a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(sg0.a2 a2Var, android.os.Looper looper) {
        super(looper);
        this.f489403a = a2Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        super.handleMessage(msg);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "handleMessage, what: " + msg.what);
        int i17 = msg.what;
        sg0.a2 a2Var = this.f489403a;
        if (i17 == 101) {
            a2Var.nj();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "handleMessage, check release store!");
        } else if (i17 == 1) {
            a2Var.Zi(false);
            a2Var.f489203h = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "delay create store to avoid affect start");
        }
    }
}
