package dk2;

/* loaded from: classes14.dex */
public final class b5 extends dk2.c5 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.tt4 f314770a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(r45.tt4 authInfo) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authInfo, "authInfo");
        this.f314770a = authInfo;
    }

    /* renamed from: equals */
    public boolean m124540xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dk2.b5) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f314770a, ((dk2.b5) obj).f314770a);
    }

    /* renamed from: hashCode */
    public int m124541x8cdac1b() {
        return this.f314770a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124542x9616526c() {
        return "Success(authInfo=" + this.f314770a + ')';
    }
}
