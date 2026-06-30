package dd5;

/* loaded from: classes8.dex */
public final class s1 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f310816a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f310817b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.CharSequence f310818c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310819d;

    public s1(java.lang.CharSequence nickname, java.lang.String username, java.lang.CharSequence desc, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f310816a = nickname;
        this.f310817b = username;
        this.f310818c = desc;
        this.f310819d = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f310816a, this.f310818c);
    }

    /* renamed from: equals */
    public boolean m124076xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.s1)) {
            return false;
        }
        dd5.s1 s1Var = (dd5.s1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310816a, s1Var.f310816a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310817b, s1Var.f310817b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310818c, s1Var.f310818c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310819d, s1Var.f310819d);
    }

    /* renamed from: hashCode */
    public int m124077x8cdac1b() {
        return (((((this.f310816a.hashCode() * 31) + this.f310817b.hashCode()) * 31) + this.f310818c.hashCode()) * 31) + this.f310819d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124078x9616526c() {
        return "ViewModel(nickname=" + ((java.lang.Object) this.f310816a) + ", username=" + this.f310817b + ", desc=" + ((java.lang.Object) this.f310818c) + ", msgInfo=" + this.f310819d + ')';
    }
}
