package cl5;

/* loaded from: classes5.dex */
public final class m extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl5.n f124528a;

    public m(cl5.n nVar) {
        this.f124528a = nVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f124528a.a(false);
        super.handleMessage(msg);
    }
}
