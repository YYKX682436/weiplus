package l91;

/* loaded from: classes4.dex */
public final class b extends l91.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f398796a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String value) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f398796a = value;
    }

    /* renamed from: equals */
    public boolean m145345xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l91.b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f398796a, ((l91.b) obj).f398796a);
    }

    /* renamed from: hashCode */
    public int m145346x8cdac1b() {
        return this.f398796a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m145347x9616526c() {
        return "USERNAME(value=" + this.f398796a + ')';
    }
}
