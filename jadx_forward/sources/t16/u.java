package t16;

/* loaded from: classes15.dex */
public final class u extends t16.w {

    /* renamed from: a, reason: collision with root package name */
    public final f26.o0 f496160a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(f26.o0 type) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f496160a = type;
    }

    /* renamed from: equals */
    public boolean m165637xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t16.u) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f496160a, ((t16.u) obj).f496160a);
    }

    /* renamed from: hashCode */
    public int m165638x8cdac1b() {
        return this.f496160a.m128970x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m165639x9616526c() {
        return "LocalClass(type=" + this.f496160a + ')';
    }
}
