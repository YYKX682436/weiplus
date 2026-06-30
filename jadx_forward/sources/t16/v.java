package t16;

/* loaded from: classes15.dex */
public final class v extends t16.w {

    /* renamed from: a, reason: collision with root package name */
    public final t16.f f496161a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t16.f value) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f496161a = value;
    }

    /* renamed from: equals */
    public boolean m165640xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t16.v) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f496161a, ((t16.v) obj).f496161a);
    }

    /* renamed from: hashCode */
    public int m165641x8cdac1b() {
        return this.f496161a.m165627x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m165642x9616526c() {
        return "NormalClass(value=" + this.f496161a + ')';
    }
}
