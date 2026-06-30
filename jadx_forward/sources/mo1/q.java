package mo1;

/* loaded from: classes10.dex */
public final class q extends mo1.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f411855a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.util.List data) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f411855a = data;
    }

    /* renamed from: equals */
    public boolean m148158xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mo1.q) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f411855a, ((mo1.q) obj).f411855a);
    }

    /* renamed from: hashCode */
    public int m148159x8cdac1b() {
        return this.f411855a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148160x9616526c() {
        return "Success(data=" + this.f411855a + ')';
    }
}
