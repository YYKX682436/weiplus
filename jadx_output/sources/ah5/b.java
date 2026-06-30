package ah5;

/* loaded from: classes11.dex */
public final class b implements ah5.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.ResultReceiver f5037a;

    public b(android.os.ResultReceiver receiver) {
        kotlin.jvm.internal.o.g(receiver, "receiver");
        this.f5037a = receiver;
    }

    @Override // ah5.a
    public void a() {
        this.f5037a.send(2, null);
    }

    @Override // ah5.a
    public void b(int i17, int i18) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_curHeight", i17);
        bundle.putInt("key_baseHeight", i18);
        this.f5037a.send(5, bundle);
    }

    @Override // ah5.a
    public void c() {
        this.f5037a.send(3, null);
    }

    @Override // ah5.a
    public void d() {
        this.f5037a.send(4, null);
    }

    @Override // ah5.a
    public void e() {
        this.f5037a.send(1, null);
    }
}
