package u5;

/* loaded from: classes14.dex */
public final class h extends u5.k {

    /* renamed from: a, reason: collision with root package name */
    public final h1.c f506240a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.f f506241b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(h1.c cVar, c6.f result) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f506240a = cVar;
        this.f506241b = result;
    }

    @Override // u5.k
    public h1.c a() {
        return this.f506240a;
    }

    /* renamed from: equals */
    public boolean m167575xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5.h)) {
            return false;
        }
        u5.h hVar = (u5.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f506240a, hVar.f506240a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f506241b, hVar.f506241b);
    }

    /* renamed from: hashCode */
    public int m167576x8cdac1b() {
        h1.c cVar = this.f506240a;
        return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f506241b.m14203x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m167577x9616526c() {
        return "Error(painter=" + this.f506240a + ", result=" + this.f506241b + ')';
    }
}
