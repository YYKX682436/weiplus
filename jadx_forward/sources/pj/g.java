package pj;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f436438a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f436439b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f436440c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f436441d;

    public g(int i17, yz5.a createObject, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(createObject, "createObject");
        this.f436438a = i17;
        this.f436439b = createObject;
        this.f436440c = lVar;
        this.f436441d = jz5.h.a(jz5.i.f384362d, pj.f.f436437d);
    }

    public final java.util.List a() {
        return (java.util.List) this.f436441d.mo141623x754a37bb();
    }

    public final java.lang.Object b() {
        java.lang.Object mo152xb9724478;
        synchronized (a()) {
            mo152xb9724478 = a().isEmpty() ? this.f436439b.mo152xb9724478() : a().remove(kz5.c0.h(a()));
        }
        return mo152xb9724478;
    }
}
