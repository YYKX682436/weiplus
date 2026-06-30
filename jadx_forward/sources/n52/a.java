package n52;

/* loaded from: classes4.dex */
public final class a extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n52.b f416648a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n52.b bVar, android.os.Looper looper) {
        super(looper);
        this.f416648a = bVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        n52.b bVar;
        n52.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        super.handleMessage(msg);
        if (msg.what != 100 || (dVar = (bVar = this.f416648a).f416649a) == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference = bVar.f416652d;
        dVar.b(weakReference != null ? (android.view.View) weakReference.get() : null, msg.arg1, msg.arg2);
    }
}
