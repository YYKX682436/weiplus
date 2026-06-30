package sf2;

/* loaded from: classes5.dex */
public final class h3 extends sf2.i3 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.rd2 f488692a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(r45.rd2 response) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        this.f488692a = response;
    }

    /* renamed from: equals */
    public boolean m164389xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sf2.h3) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488692a, ((sf2.h3) obj).f488692a);
    }

    /* renamed from: hashCode */
    public int m164390x8cdac1b() {
        return this.f488692a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164391x9616526c() {
        return "Success(response=" + this.f488692a + ')';
    }
}
