package f26;

/* loaded from: classes16.dex */
public final class u0 extends f26.e3 {

    /* renamed from: e, reason: collision with root package name */
    public final e26.c0 f340753e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f340754f;

    /* renamed from: g, reason: collision with root package name */
    public final e26.x f340755g;

    public u0(e26.c0 storageManager, yz5.a computation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(computation, "computation");
        this.f340753e = storageManager;
        this.f340754f = computation;
        this.f340755g = ((e26.u) storageManager).b(computation);
    }

    @Override // f26.e3
    public f26.o0 A0() {
        return (f26.o0) ((e26.o) this.f340755g).mo152xb9724478();
    }

    @Override // f26.o0
    public f26.o0 y0(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new f26.u0(this.f340753e, new f26.t0(kotlinTypeRefiner, this));
    }
}
