package vi5;

/* loaded from: classes.dex */
public final class b implements si5.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f519147a;

    /* renamed from: b, reason: collision with root package name */
    public final long f519148b;

    public b(long j17, long j18) {
        this.f519147a = j17;
        this.f519148b = j18;
    }

    @Override // si5.c
    public int a() {
        return 0;
    }

    @Override // si5.c
    public int b(ri5.j thisItem, ri5.j otherItem, si5.c other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thisItem, "thisItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(otherItem, "otherItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (!(other instanceof vi5.b)) {
            return 0;
        }
        vi5.b bVar = (vi5.b) other;
        int j17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.j(bVar.f519148b, this.f519148b);
        return j17 == 0 ? p3321xbce91901.jvm.p3324x21ffc6bd.o.j(bVar.f519147a, this.f519147a) : j17;
    }

    @Override // si5.c
    public boolean d(ri5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        return false;
    }

    @Override // si5.c
    public boolean e(si5.c other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (!(other instanceof vi5.b)) {
            return false;
        }
        vi5.b bVar = (vi5.b) other;
        return this.f519147a == bVar.f519147a && this.f519148b == bVar.f519148b;
    }
}
