package vi5;

/* loaded from: classes.dex */
public final class a implements si5.c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f519145a;

    /* renamed from: b, reason: collision with root package name */
    public final long f519146b;

    public a(boolean z17, long j17) {
        this.f519145a = z17;
        this.f519146b = j17;
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
        if (!(other instanceof vi5.a)) {
            return 0;
        }
        vi5.a aVar = (vi5.a) other;
        int j17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.j(aVar.f519146b, this.f519146b);
        return j17 == 0 ? java.lang.Boolean.compare(aVar.f519145a, this.f519145a) : j17;
    }

    @Override // si5.c
    public boolean d(ri5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        return false;
    }

    @Override // si5.c
    public boolean e(si5.c other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (!(other instanceof vi5.a)) {
            return false;
        }
        vi5.a aVar = (vi5.a) other;
        return this.f519145a == aVar.f519145a && this.f519146b == aVar.f519146b;
    }
}
