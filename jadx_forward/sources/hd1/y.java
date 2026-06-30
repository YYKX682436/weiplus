package hd1;

/* loaded from: classes7.dex */
public final class y extends hd1.z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f361975a;

    public y(java.lang.Object obj) {
        super(null);
        this.f361975a = obj;
    }

    /* renamed from: equals */
    public boolean m133221xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd1.y) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f361975a, ((hd1.y) obj).f361975a);
    }

    /* renamed from: hashCode */
    public int m133222x8cdac1b() {
        java.lang.Object obj = this.f361975a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133223x9616526c() {
        return "Success(ret=" + this.f361975a + ')';
    }
}
