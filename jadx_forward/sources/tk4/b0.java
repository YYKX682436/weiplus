package tk4;

/* loaded from: classes5.dex */
public final class b0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tk4.c0 f501494a;

    public b0(tk4.c0 c0Var) {
        this.f501494a = c0Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f501494a.a(true);
        super.handleMessage(msg);
    }
}
