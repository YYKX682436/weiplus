package cl5;

/* loaded from: classes5.dex */
public final class m extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl5.n f42995a;

    public m(cl5.n nVar) {
        this.f42995a = nVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f42995a.a(false);
        super.handleMessage(msg);
    }
}
