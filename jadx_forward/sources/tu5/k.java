package tu5;

/* loaded from: classes12.dex */
public class k extends uu5.a {

    /* renamed from: b, reason: collision with root package name */
    public volatile int f503710b;

    public k(int i17) {
        this.f503710b = i17;
    }

    @Override // uu5.b
    public boolean a(tu5.h hVar) {
        return this.f503710b >= hVar.f503706b.f503704c.get();
    }

    @Override // uu5.b
    public long d(tu5.h hVar, java.util.concurrent.TimeUnit timeUnit) {
        return -1L;
    }
}
