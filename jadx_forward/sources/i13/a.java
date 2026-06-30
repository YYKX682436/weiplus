package i13;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f368803a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f368804b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f368805c;

    public a(java.lang.String id6, java.lang.String token, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        this.f368803a = id6;
        this.f368804b = token;
        this.f368805c = z17;
    }

    /* renamed from: equals */
    public boolean m134538xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i13.a)) {
            return false;
        }
        i13.a aVar = (i13.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368803a, aVar.f368803a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368804b, aVar.f368804b) && this.f368805c == aVar.f368805c;
    }

    /* renamed from: hashCode */
    public int m134539x8cdac1b() {
        return (((this.f368803a.hashCode() * 31) + this.f368804b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f368805c);
    }

    /* renamed from: toString */
    public java.lang.String m134540x9616526c() {
        return "MsgState(id=" + this.f368803a + ", token=" + this.f368804b + ", isExposing=" + this.f368805c + ')';
    }
}
