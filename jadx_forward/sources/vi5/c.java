package vi5;

/* loaded from: classes.dex */
public final class c implements si5.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f519149a;

    /* renamed from: b, reason: collision with root package name */
    public final long f519150b;

    public c(long j17, long j18) {
        this.f519149a = j17;
        this.f519150b = j18;
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
        if (!(other instanceof vi5.c)) {
            return 0;
        }
        vi5.c cVar = (vi5.c) other;
        int j17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.j(cVar.f519150b, this.f519150b);
        return j17 == 0 ? p3321xbce91901.jvm.p3324x21ffc6bd.o.j(cVar.f519149a, this.f519149a) : j17;
    }

    @Override // si5.c
    public boolean d(ri5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        return false;
    }

    @Override // si5.c
    public boolean e(si5.c other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (!(other instanceof vi5.c)) {
            return false;
        }
        vi5.c cVar = (vi5.c) other;
        return this.f519149a == cVar.f519149a && this.f519150b == cVar.f519150b;
    }
}
