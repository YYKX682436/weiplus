package mc;

/* loaded from: classes14.dex */
public final class n extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc.q f407063a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(mc.q qVar, android.os.Looper looper) {
        super(looper);
        this.f407063a = qVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (message == null) {
            return;
        }
        try {
            int i17 = message.what;
            mc.q qVar = this.f407063a;
            if (i17 == 0) {
                java.lang.Object obj = message.obj;
                if (obj != null && (obj instanceof java.lang.String)) {
                    mc.q.d(qVar, (java.lang.String) obj);
                }
            } else if (i17 == 1) {
                java.lang.Object obj2 = message.obj;
                if (obj2 != null && (obj2 instanceof java.lang.String)) {
                    qVar.a((java.lang.String) obj2);
                }
            } else if (i17 != 2) {
                mc.p.f407064a.e("LoggerManager", "handle with default what!");
            } else {
                mc.q.c(qVar);
            }
        } catch (java.lang.Exception e17) {
            e17.getLocalizedMessage();
        }
    }
}
