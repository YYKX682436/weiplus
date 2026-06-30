package ah5;

/* loaded from: classes11.dex */
public final class b implements ah5.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.ResultReceiver f86570a;

    public b(android.os.ResultReceiver receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
        this.f86570a = receiver;
    }

    @Override // ah5.a
    public void a() {
        this.f86570a.send(2, null);
    }

    @Override // ah5.a
    public void b(int i17, int i18) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_curHeight", i17);
        bundle.putInt("key_baseHeight", i18);
        this.f86570a.send(5, bundle);
    }

    @Override // ah5.a
    public void c() {
        this.f86570a.send(3, null);
    }

    @Override // ah5.a
    public void d() {
        this.f86570a.send(4, null);
    }

    @Override // ah5.a
    public void e() {
        this.f86570a.send(1, null);
    }
}
