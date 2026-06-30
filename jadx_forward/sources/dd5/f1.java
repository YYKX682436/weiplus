package dd5;

/* loaded from: classes8.dex */
public final class f1 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f310668a;

    /* renamed from: b, reason: collision with root package name */
    public final mn2.h3 f310669b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f310670c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.CharSequence f310671d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310672e;

    public f1(java.lang.CharSequence nickname, mn2.h3 avatarUrl, java.lang.String username, java.lang.CharSequence desc, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarUrl, "avatarUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f310668a = nickname;
        this.f310669b = avatarUrl;
        this.f310670c = username;
        this.f310671d = desc;
        this.f310672e = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f310668a, this.f310671d);
    }

    /* renamed from: equals */
    public boolean m124020xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.f1)) {
            return false;
        }
        dd5.f1 f1Var = (dd5.f1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310668a, f1Var.f310668a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310669b, f1Var.f310669b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310670c, f1Var.f310670c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310671d, f1Var.f310671d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310672e, f1Var.f310672e);
    }

    /* renamed from: hashCode */
    public int m124021x8cdac1b() {
        return (((((((this.f310668a.hashCode() * 31) + this.f310669b.hashCode()) * 31) + this.f310670c.hashCode()) * 31) + this.f310671d.hashCode()) * 31) + this.f310672e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124022x9616526c() {
        return "ViewModel(nickname=" + ((java.lang.Object) this.f310668a) + ", avatarUrl=" + this.f310669b + ", username=" + this.f310670c + ", desc=" + ((java.lang.Object) this.f310671d) + ", msgInfo=" + this.f310672e + ')';
    }
}
