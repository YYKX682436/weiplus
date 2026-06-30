package mp0;

/* loaded from: classes15.dex */
public final class b implements zo0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mp0.f f411962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mp0.e f411963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f411964c;

    public b(mp0.f fVar, mp0.e eVar, long j17) {
        this.f411962a = fVar;
        this.f411963b = eVar;
        this.f411964c = j17;
    }

    @Override // zo0.c
    public void a() {
        this.f411963b.k(null, this.f411964c, this.f411962a);
    }

    @Override // zo0.c
    public void b(hp0.i resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        this.f411963b.k(resp, this.f411964c, this.f411962a);
    }
}
