package ey2;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final e06.k f338961a;

    /* renamed from: b, reason: collision with root package name */
    public final ey2.n f338962b;

    public m(e06.k range, ey2.n type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(range, "range");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f338961a = range;
        this.f338962b = type;
    }

    /* renamed from: equals */
    public boolean m128350xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.m)) {
            return false;
        }
        ey2.m mVar = (ey2.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338961a, mVar.f338961a) && this.f338962b == mVar.f338962b;
    }

    /* renamed from: hashCode */
    public int m128351x8cdac1b() {
        return (this.f338961a.mo126624x8cdac1b() * 31) + this.f338962b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m128352x9616526c() {
        return "FeedListChange(range=" + this.f338961a + ", type=" + this.f338962b + ')';
    }
}
