package fb1;

/* loaded from: classes7.dex */
public final class a extends fb1.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f342360a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String desc) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        this.f342360a = desc;
    }

    /* renamed from: equals */
    public boolean m129300xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fb1.a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f342360a, ((fb1.a) obj).f342360a);
    }

    /* renamed from: hashCode */
    public int m129301x8cdac1b() {
        return this.f342360a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m129302x9616526c() {
        return "Busy(desc=" + this.f342360a + ')';
    }
}
