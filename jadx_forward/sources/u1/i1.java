package u1;

/* loaded from: classes14.dex */
public final class i1 implements yz5.a, u1.s1, t1.e {

    /* renamed from: h, reason: collision with root package name */
    public static final t1.e f505134h = new u1.f1();

    /* renamed from: d, reason: collision with root package name */
    public u1.j1 f505135d;

    /* renamed from: e, reason: collision with root package name */
    public final t1.b f505136e;

    /* renamed from: f, reason: collision with root package name */
    public final o0.i f505137f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f505138g;

    public i1(u1.j1 provider, t1.b modifier) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modifier, "modifier");
        this.f505135d = provider;
        this.f505136e = modifier;
        this.f505137f = new o0.i(new t1.a[16], 0);
    }

    @Override // t1.e
    public java.lang.Object a(t1.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<this>");
        this.f505137f.b(aVar);
        t1.d d17 = this.f505135d.d(aVar);
        return d17 == null ? aVar.f496079a.mo152xb9724478() : d17.mo157x754a37bb();
    }

    public final void d() {
        if (this.f505138g) {
            this.f505137f.e();
            u1.q0.a(this.f505135d.f505141d).mo7048xac34f030().a(this, u1.g1.f505129d, new u1.h1(this));
        }
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        d();
        return jz5.f0.f384359a;
    }

    @Override // u1.s1
    /* renamed from: isValid */
    public boolean mo7155x7b953cf2() {
        return this.f505138g;
    }
}
