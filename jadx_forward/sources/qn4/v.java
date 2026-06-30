package qn4;

/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final qn4.v f446830a = new qn4.v();

    /* renamed from: b, reason: collision with root package name */
    public static final android.os.Handler f446831b = new android.os.Handler(android.os.Looper.getMainLooper());

    public final void a(yz5.a action, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        qn4.u uVar = new qn4.u(action, aVar);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            uVar.run();
        } else {
            f446831b.post(uVar);
        }
    }
}
