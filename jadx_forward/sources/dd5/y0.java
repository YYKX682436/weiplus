package dd5;

/* loaded from: classes8.dex */
public final class y0 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f310873a;

    /* renamed from: b, reason: collision with root package name */
    public final mn2.h3 f310874b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f310875c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.CharSequence f310876d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310877e;

    public y0(java.lang.CharSequence nickname, mn2.h3 avatarUrl, java.lang.String username, java.lang.CharSequence desc, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarUrl, "avatarUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f310873a = nickname;
        this.f310874b = avatarUrl;
        this.f310875c = username;
        this.f310876d = desc;
        this.f310877e = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f310873a, this.f310876d);
    }

    /* renamed from: equals */
    public boolean m124101xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.y0)) {
            return false;
        }
        dd5.y0 y0Var = (dd5.y0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310873a, y0Var.f310873a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310874b, y0Var.f310874b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310875c, y0Var.f310875c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310876d, y0Var.f310876d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310877e, y0Var.f310877e);
    }

    /* renamed from: hashCode */
    public int m124102x8cdac1b() {
        return (((((((this.f310873a.hashCode() * 31) + this.f310874b.hashCode()) * 31) + this.f310875c.hashCode()) * 31) + this.f310876d.hashCode()) * 31) + this.f310877e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124103x9616526c() {
        return "ViewModel(nickname=" + ((java.lang.Object) this.f310873a) + ", avatarUrl=" + this.f310874b + ", username=" + this.f310875c + ", desc=" + ((java.lang.Object) this.f310876d) + ", msgInfo=" + this.f310877e + ')';
    }
}
