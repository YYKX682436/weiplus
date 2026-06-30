package wu0;

/* loaded from: classes5.dex */
public final class c extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wu0.d f531186a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wu0.d dVar, android.os.Looper looper) {
        super(looper);
        this.f531186a = dVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (msg.what != 100 || (str = (java.lang.String) msg.obj) == null) {
            return;
        }
        wu0.d dVar = this.f531186a;
        dVar.getClass();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 100;
        obtain.obj = str;
        dVar.f531189c.sendMessageDelayed(obtain, 30L);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = dVar.f531188b;
        wu0.b bVar = (wu0.b) concurrentHashMap.get(str);
        if (bVar == null) {
            bVar = new wu0.b(0.0f, 0.0f, false, 4, null);
        }
        wu0.b bVar2 = bVar;
        float f17 = bVar2.f531184b + 0.02f;
        concurrentHashMap.put(str, wu0.b.a(bVar2, 0.0f, f17 > 1.0f ? 1.0f : f17, false, 5, null));
        dVar.a();
    }
}
